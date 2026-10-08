package cn.pokemmo.graphics.gl;

import f.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class VertexArrayObjectProvider implements HA0 {
    private static final long serialVersionUID = -2849567615646933777L;
    public final String u8;
    public final CopyOnWriteArrayList xt;

    public VertexArrayObjectProvider(String name) {
        this.xt = new CopyOnWriteArrayList();
        if (name == null) {
            throw new IllegalArgumentException("A marker name cannot be null");
        }
        this.u8 = name;
    }

    public final boolean gJ(HA0 other) {
        if (other == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (this.equals(other)) {
            return true;
        }
        for (Object child : this.xt) {
            if (((nf0_1) child).gJ(other)) {
                return true;
            }
        }
        return false;
    }

    public final boolean UE(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (this.u8.equals(name)) {
            return true;
        }
        for (Object child : this.xt) {
            if (((nf0_1) child).UE(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof HA0)) {
            return false;
        }
        return this.u8.equals(((nf0_1) other).u8);
    }

    @Override
    public final int hashCode() {
        return this.u8.hashCode();
    }

    @Override
    public final String toString() {
        if (this.xt.size() <= 0) {
            return this.u8;
        }
        StringBuilder builder = new StringBuilder(this.u8).append(" [ ");
        java.util.Iterator iterator = this.xt.iterator();
        while (iterator.hasNext()) {
            builder.append(((nf0_1) iterator.next()).u8);
            if (iterator.hasNext()) {
                builder.append(", ");
            }
        }
        return builder.append(" ]").toString();
    }
}
