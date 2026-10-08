package ch.qos.logback.core.subst;

public class Token {
    public enum Type { LITERAL, START, CURLY_LEFT, CURLY_RIGHT, DEFAULT }

    public static final Token START_TOKEN = new Token(Type.START, null);
    public static final Token CURLY_LEFT_TOKEN = new Token(Type.CURLY_LEFT, null);
    public static final Token CURLY_RIGHT_TOKEN = new Token(Type.CURLY_RIGHT, null);
    public static final Token DEFAULT_SEP_TOKEN = new Token(Type.DEFAULT, null);

    Type type;
    String payload;

    public Token(Type type, String payload) {
        this.type = type;
        this.payload = payload;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Token other = (Token) object;
        if (type != other.type) return false;
        return payload == null ? other.payload == null : payload.equals(other.payload);
    }

    @Override
    public int hashCode() { return 31 * (type == null ? 0 : type.hashCode()) + (payload == null ? 0 : payload.hashCode()); }

    @Override
    public String toString() {
        String result = "Token{type=" + type;
        if (payload != null) result += ", payload='" + payload + "'";
        return result + "}";
    }
}
