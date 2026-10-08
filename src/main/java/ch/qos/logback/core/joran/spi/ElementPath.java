package ch.qos.logback.core.joran.spi;

import java.util.ArrayList;
import java.util.List;

public class ElementPath {
    ArrayList partList;

    public ElementPath() {
        this.partList = new ArrayList();
    }

    public ElementPath(List list) {
        this.partList = new ArrayList();
        this.partList.addAll(list);
    }

    public ElementPath(String path) {
        this.partList = new ArrayList();
        if (path == null) {
            return;
        }
        String[] parts = path.split("/");
        if (parts == null) {
            return;
        }
        for (String part : parts) {
            if (part.length() > 0) {
                this.partList.add(part);
            }
        }
    }

    private boolean equalityCheck(String first, String second) {
        return first.equalsIgnoreCase(second);
    }

    public ElementPath duplicate() {
        ElementPath duplicate = new ElementPath();
        duplicate.partList.addAll(this.partList);
        return duplicate;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof ElementPath)) {
            return false;
        }
        ElementPath other = (ElementPath) object;
        int size = other.size();
        if (size != size()) {
            return false;
        }
        for (int index = 0; index < size; index++) {
            String otherPart = other.get(index);
            if (!equalityCheck(get(index), otherPart)) {
                return false;
            }
        }
        return true;
    }

    public List getCopyOfPartList() {
        return new ArrayList(this.partList);
    }

    public void push(String part) {
        this.partList.add(part);
    }

    public String get(int index) {
        return (String) this.partList.get(index);
    }

    public void pop() {
        if (!this.partList.isEmpty()) {
            this.partList.remove(this.partList.size() - 1);
        }
    }

    public String peekLast() {
        if (this.partList.isEmpty()) {
            return null;
        }
        int size = this.partList.size();
        return (String) this.partList.get(size - 1);
    }

    public int size() {
        return this.partList.size();
    }

    public String toStableString() {
        StringBuilder builder = new StringBuilder();
        for (Object value : this.partList) {
            builder.append("[").append((String) value).append("]");
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return toStableString();
    }
}
