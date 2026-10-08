package ch.qos.logback.core.pattern.parser;

public class Node {
    static final int LITERAL = 0;
    static final int SIMPLE_KEYWORD = 1;
    static final int COMPOSITE_KEYWORD = 2;
    final int type;
    final Object value;
    Node next;

    public Node(int type) {
        this(type, null);
    }

    public Node(int type, Object value) {
        this.type = type;
        this.value = value;
    }

    public int getType() {
        return this.type;
    }

    public Object getValue() {
        return this.value;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Node)) {
            return false;
        }
        Node r = (Node) object;
        return this.type == r.type
            && (this.value != null ? this.value.equals(r.value) : r.value == null)
            && (this.next != null ? this.next.equals(r.next) : r.next == null);
    }

    @Override
    public int hashCode() {
        int result = this.type * 31;
        Object v = this.value;
        return result + (v != null ? v.hashCode() : 0);
    }

    public String printNext() {
        Node n = this.next;
        return n != null ? " -> " + String.valueOf(n) : "";
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.type != LITERAL) {
            stringBuilder.append(super.toString());
        } else {
            stringBuilder.append("LITERAL(" + String.valueOf(this.value) + ")");
        }
        stringBuilder.append(this.printNext());
        return stringBuilder.toString();
    }
}
