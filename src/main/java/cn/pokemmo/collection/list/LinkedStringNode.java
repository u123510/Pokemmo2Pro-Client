package cn.pokemmo.collection.list;

import cn.pokemmo.collection.iterator.ArrayCursorIterator;
import f.r50_0;
import java.util.Iterator;

public class LinkedStringNode implements Iterable<String> {
    public final String Wo0;
    public final r50_0 g9;

    public LinkedStringNode(String value, r50_0 next) {
        super();
        if (value == null) {
            throw new NullPointerException("value");
        }
        this.Wo0 = value;
        this.g9 = next;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof LinkedStringNode)) {
            return false;
        }
        LinkedStringNode other = (LinkedStringNode) object;
        if (!this.Wo0.equals(other.Wo0)) {
            return false;
        }
        if (this.g9 == other.g9) {
            return true;
        }
        return this.g9 != null && this.g9.equals(other.g9);
    }

    @Override
    public int hashCode() {
        int result = this.Wo0.hashCode();
        if (this.g9 != null) {
            result = result * 67 + this.g9.hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        if (this.g9 == null) {
            return this.Wo0;
        }
        StringBuilder builder = new StringBuilder();
        LinkedStringNode current = this;
        builder.append(current.Wo0);
        current = current.g9;
        while (current != null) {
            builder.append(", ");
            builder.append(current.Wo0);
            current = current.g9;
        }
        return builder.toString();
    }

    @Override
    public Iterator<String> iterator() {
        return new ArrayCursorIterator((r50_0) this);
    }
}
