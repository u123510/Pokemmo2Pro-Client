package ch.qos.logback.core.subst;

import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Stack;

public class NodeToStringTransformer {
    public static final String CIRCULAR_VARIABLE_REFERENCE_DETECTED = "Circular variable reference detected while parsing input [";
    final Node node;
    final PropertyContainer propertyContainer0;
    final PropertyContainer propertyContainer1;

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer0, PropertyContainer propertyContainer1) {
        this.node = node;
        this.propertyContainer0 = propertyContainer0;
        this.propertyContainer1 = propertyContainer1;
    }

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer) {
        this(node, propertyContainer, null);
    }

    public static String substituteVariable(String input, PropertyContainer propertyContainer0, PropertyContainer propertyContainer1) throws ch.qos.logback.core.spi.ScanException {
        Node node = tokenizeAndParseString(input);
        return new NodeToStringTransformer(node, propertyContainer0, propertyContainer1).transform();
    }

    private static Node tokenizeAndParseString(String input) throws ch.qos.logback.core.spi.ScanException {
        return new Parser(new Tokenizer(input).tokenize()).parse();
    }

    private void compileNode(Node node, StringBuilder builder, Stack<Node> cycleCheckStack) throws ch.qos.logback.core.spi.ScanException {
        while (node != null) {
            if (node.type == Node.Type.VARIABLE) handleVariable(node, builder, cycleCheckStack);
            else if (node.type == Node.Type.LITERAL) handleLiteral(node, builder);
            node = node.next;
        }
    }

    private void handleVariable(Node node, StringBuilder builder, Stack<Node> cycleCheckStack) throws ch.qos.logback.core.spi.ScanException {
        if (haveVisitedNodeAlready(node, cycleCheckStack)) {
            cycleCheckStack.push(node);
            throw new IllegalArgumentException(constructRecursionErrorMessage(cycleCheckStack));
        }
        cycleCheckStack.push(node);
        StringBuilder keyBuilder = new StringBuilder();
        compileNode((Node) node.payload, keyBuilder, cycleCheckStack);
        String key = keyBuilder.toString();
        String value = lookupKey(key);
        if (value != null) {
            compileNode(tokenizeAndParseString(value), builder, cycleCheckStack);
            cycleCheckStack.pop();
            return;
        }
        if (node.defaultPart == null) {
            builder.append(key).append("_IS_UNDEFINED");
        } else {
            StringBuilder defaultBuilder = new StringBuilder();
            compileNode((Node) node.defaultPart, defaultBuilder, cycleCheckStack);
            builder.append(defaultBuilder.toString());
        }
        cycleCheckStack.pop();
    }

    private String lookupKey(String key) {
        if (propertyContainer0 != null) {
            String value = propertyContainer0.getProperty(key);
            if (value != null) return value;
        }
        if (propertyContainer1 != null) {
            String value = propertyContainer1.getProperty(key);
            if (value != null) return value;
        }
        String value = OptionHelper.getSystemProperty(key, null);
        if (value != null) return value;
        return OptionHelper.getEnv(key);
    }

    private void handleLiteral(Node node, StringBuilder builder) {
        builder.append((String) node.payload);
    }

    private String variableNodeValue(Node node) {
        Node payload = (Node) node.payload;
        if (payload == null) return "";
        if (payload.type == Node.Type.LITERAL) return (String) payload.payload;
        if (payload.type == Node.Type.VARIABLE) return " ? " + variableNodeValue(payload);
        throw new IllegalStateException("unreachable code");
    }

    private String constructRecursionErrorMessage(Stack<Node> stack) {
        StringBuilder builder = new StringBuilder(CIRCULAR_VARIABLE_REFERENCE_DETECTED);
        for (Node current : stack) {
            builder.append("${").append(variableNodeValue(current)).append('}');
            if (current != stack.lastElement()) builder.append(" --> ");
        }
        return builder.append(']').toString();
    }

    private boolean haveVisitedNodeAlready(Node node, Stack<Node> stack) {
        for (Node visited : stack) if (equalNodes(node, visited)) return true;
        return false;
    }

    private boolean equalNodes(Node first, Node second) {
        if (first.type != null && !first.type.equals(second.type)) return false;
        if (first.payload != null && !first.payload.equals(second.payload)) return false;
        if (first.defaultPart != null && !first.defaultPart.equals(second.defaultPart)) return false;
        return true;
    }

    public String transform() throws ch.qos.logback.core.spi.ScanException {
        StringBuilder builder = new StringBuilder();
        compileNode(node, builder, new Stack<>());
        return builder.toString();
    }
}
