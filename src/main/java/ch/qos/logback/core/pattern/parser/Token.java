package ch.qos.logback.core.pattern.parser;

import java.util.List;
import java.util.Objects;

class Token {
    static final int PERCENT = 37;
    static final int RIGHT_PARENTHESIS = 41;
    static final int MINUS = 45;
    static final int DOT = 46;
    static final int CURLY_LEFT = 123;
    static final int CURLY_RIGHT = 125;
    static final int LITERAL = 1000;
    static final int FORMAT_MODIFIER = 1002;
    static final int SIMPLE_KEYWORD = 1004;
    static final int COMPOSITE_KEYWORD = 1005;
    static final int OPTION = 1006;
    static final int EOF = Integer.MAX_VALUE;

    static final Token EOF_TOKEN = new Token(EOF, "EOF");
    static final Token RIGHT_PARENTHESIS_TOKEN = new Token(RIGHT_PARENTHESIS);
    static final Token BARE_COMPOSITE_KEYWORD_TOKEN = new Token(COMPOSITE_KEYWORD, "BARE");
    static final Token PERCENT_TOKEN = new Token(PERCENT);

    private final int type;
    private final String value;
    private final List optionsList;

    public Token(int type) {
        this(type, null, null);
    }

    public Token(int type, String value) {
        this(type, value, null);
    }

    public Token(int type, List optionsList) {
        this(type, null, optionsList);
    }

    public Token(int type, String value, List optionsList) {
        super();
        this.type = type;
        this.value = value;
        this.optionsList = optionsList;
    }

    public int getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public List getOptionsList() {
        return this.optionsList;
    }

    @Override
    public String toString() {
        String typeName;
        switch (this.type) {
            case PERCENT: typeName = "%"; break;
            case RIGHT_PARENTHESIS: typeName = "RIGHT_PARENTHESIS"; break;
            case LITERAL: typeName = "LITERAL"; break;
            case FORMAT_MODIFIER: typeName = "FormatModifier"; break;
            case SIMPLE_KEYWORD: typeName = "SIMPLE_KEYWORD"; break;
            case COMPOSITE_KEYWORD: typeName = "COMPOSITE_KEYWORD"; break;
            case OPTION: typeName = "OPTION"; break;
            default: typeName = "UNKNOWN";
        }
        return this.value == null ? "Token(" + typeName + ")" : "Token(" + typeName + ", \"" + this.value + "\")";
    }

    @Override
    public int hashCode() {
        return this.type * 29 + (this.value == null ? 0 : this.value.hashCode());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Token)) return false;
        Token token = (Token) other;
        return this.type == token.type && Objects.equals(this.value, token.value);
    }
}
