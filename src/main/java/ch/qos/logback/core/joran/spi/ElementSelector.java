package ch.qos.logback.core.joran.spi;

import java.util.List;

public class ElementSelector extends ElementPath {
    public ElementSelector() {
        super();
    }

    public ElementSelector(List list) {
        super(list);
    }

    public ElementSelector(String path) {
        super(path);
    }

    private boolean equalityCheck(String first, String second) {
        return first.equalsIgnoreCase(second);
    }

    public boolean fullPathMatch(ElementPath path) {
        if (path.size() != size()) {
            return false;
        }
        int length = size();
        for (int index = 0; index < length; index++) {
            String pathPart = path.get(index);
            if (!equalityCheck(get(index), pathPart)) {
                return false;
            }
        }
        return true;
    }

    public int getTailMatchLength(ElementPath path) {
        if (path == null) {
            return 0;
        }
        int selectorSize = this.partList.size();
        int pathSize = path.partList.size();
        if (selectorSize == 0 || pathSize == 0) {
            return 0;
        }
        int limit = Math.min(selectorSize, pathSize);
        int matched = 0;
        for (int offset = 1; offset <= limit; offset++) {
            String selectorPart = (String) this.partList.get(selectorSize - offset);
            String pathPart = (String) path.partList.get(pathSize - offset);
            if (!equalityCheck(selectorPart, pathPart)) {
                break;
            }
            matched++;
        }
        return matched;
    }

    public boolean isContainedIn(ElementPath path) {
        if (path == null) {
            return false;
        }
        return path.toStableString().contains(toStableString());
    }

    public int getPrefixMatchLength(ElementPath path) {
        if (path == null) {
            return 0;
        }
        int selectorSize = this.partList.size();
        int pathSize = path.partList.size();
        if (selectorSize == 0 || pathSize == 0) {
            return 0;
        }
        int limit = Math.min(selectorSize, pathSize);
        int matched = 0;
        for (int index = 0; index < limit; index++) {
            String selectorPart = (String) this.partList.get(index);
            String pathPart = (String) path.partList.get(index);
            if (!equalityCheck(selectorPart, pathPart)) {
                break;
            }
            matched++;
        }
        return matched;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof ElementSelector)) {
            return false;
        }
        ElementSelector other = (ElementSelector) object;
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

    @Override
    public int hashCode() {
        int hash = 0;
        int size = size();
        for (int index = 0; index < size; index++) {
            hash ^= get(index).toLowerCase().hashCode();
        }
        return hash;
    }
}
