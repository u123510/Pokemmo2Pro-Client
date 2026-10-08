package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ScanException;
import java.util.List;

public class Parser {
    public static final String EXPECTING_DATA_AFTER_LEFT_ACCOLADE = "a left accolade '{'";
    final List<Token> tokenList;
    int pointer;

    public Parser(List<Token> tokenList) {
        pointer = 0;
        this.tokenList = tokenList;
    }

    private Node E() throws ScanException {
        Node node = T();
        if (node == null) return null;
        Node optional = Eopt();
        if (optional != null) node.append(optional);
        return node;
    }

    private Node Eopt() throws ScanException {
        if (peekAtCurentToken() == null) return null;
        return E();
    }

    private Node T() throws ScanException {
        Token token = peekAtCurentToken();
        if (token == null) return null;
        if (token.type == Token.Type.LITERAL) {
            advanceTokenPointer();
            return makeNewLiteralNode(token.payload);
        }
        if (token.type == Token.Type.START) {
            advanceTokenPointer();
            Node node = V();
            expectCurlyRight(peekAtCurentToken());
            advanceTokenPointer();
            return node;
        }
        if (token.type == Token.Type.CURLY_LEFT) {
            advanceTokenPointer();
            Node node = C();
            expectCurlyRight(peekAtCurentToken());
            advanceTokenPointer();
            Node left = makeNewLiteralNode(CoreConstants.LEFT_ACCOLADE);
            left.append(node);
            left.append(makeNewLiteralNode(CoreConstants.RIGHT_ACCOLADE));
            return left;
        }
        return null;
    }

    private Node makeNewLiteralNode(String value) {
        return new Node(Node.Type.LITERAL, value);
    }

    private Node V() throws ScanException {
        Node payload = E();
        Node variable = new Node(Node.Type.VARIABLE, payload);
        if (isDefaultToken(peekAtCurentToken())) {
            advanceTokenPointer();
            Node defaultPart = Eopt();
            if (defaultPart == null) defaultPart = makeNewLiteralNode("");
            variable.defaultPart = defaultPart;
        }
        return variable;
    }

    private Node C() throws ScanException {
        Node node = E();
        if (isDefaultToken(peekAtCurentToken())) {
            advanceTokenPointer();
            Node separator = makeNewLiteralNode(":-");
            if (node == null) throw new ScanException("Expecting at least a literal between left accolade and ':-'");
            node.append(separator);
            node.append(E());
        }
        return node;
    }

    private boolean isDefaultToken(Token token) {
        return token != null && token.type == Token.Type.DEFAULT;
    }

    public Node parse() throws ScanException {
        return tokenList == null || tokenList.isEmpty() ? null : E();
    }

    public void advanceTokenPointer() { pointer++; }

    public void expectNotNull(Token token, String expected) {
        if (token == null) throw new IllegalArgumentException("All tokens consumed but was expecting \"" + expected + "\"");
    }

    public void expectCurlyRight(Token token) throws ScanException {
        expectNotNull(token, "}");
        if (token.type != Token.Type.CURLY_RIGHT) throw new ScanException("Expecting }");
    }

    public Token peekAtCurentToken() {
        return pointer < tokenList.size() ? tokenList.get(pointer) : null;
    }
}
