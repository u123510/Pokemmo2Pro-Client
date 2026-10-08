package ch.qos.logback.core.subst;

public class Node {
    public enum Type { LITERAL, VARIABLE }

    Type type;
    Object payload;
    Object defaultPart;
    Node next;

    public Node(Type type, Object payload) {
        this.type = type;
        this.payload = payload;
    }

    public Node(Type type, Object payload, Object defaultPart) {
        this.type = type;
        this.payload = payload;
        this.defaultPart = defaultPart;
    }

    public void append(Node node) {
        if (node == null) return;
        Node current = this;
        while (current.next != null) current = current.next;
        current.next = node;
    }

    @Override
    public String toString() {
        if (type == Type.LITERAL) return "Node{type=" + type + ", payload='" + payload + "'}";
        if (type == Type.VARIABLE) {
            StringBuilder payloadBuilder = new StringBuilder();
            StringBuilder defaultBuilder = new StringBuilder();
            if (defaultPart != null) recursive((Node) defaultPart, defaultBuilder);
            recursive((Node) payload, payloadBuilder);
            String result = "Node{type=" + type + ", payload='" + payloadBuilder + "'";
            if (defaultPart != null) result += ", defaultPart=" + defaultBuilder;
            return result + "}";
        }
        return null;
    }

    public void dump() {
        System.out.print(toString() + " -> ");
        if (next != null) next.dump();
        else System.out.print(" null");
    }

    public void recursive(Node node, StringBuilder builder) {
        while (node != null) {
            builder.append(node.toString()).append(" --> ");
            node = node.next;
        }
        builder.append("null ");
    }

    public void setNext(Node next) { this.next = next; }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Node other = (Node) object;
        if (type != other.type) return false;
        if (payload == null ? other.payload != null : !payload.equals(other.payload)) return false;
        if (defaultPart == null ? other.defaultPart != null : !defaultPart.equals(other.defaultPart)) return false;
        return next == null ? other.next == null : next.equals(other.next);
    }

    @Override
    public int hashCode() {
        int result = type == null ? 0 : type.hashCode();
        result = 31 * (result + (payload == null ? 0 : payload.hashCode()));
        result = 31 * (result + (defaultPart == null ? 0 : defaultPart.hashCode()));
        return result + (next == null ? 0 : next.hashCode());
    }
}
