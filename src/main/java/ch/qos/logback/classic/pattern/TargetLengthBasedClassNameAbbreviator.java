package ch.qos.logback.classic.pattern;

public class TargetLengthBasedClassNameAbbreviator implements Abbreviator {
    final int targetLength;

    public TargetLengthBasedClassNameAbbreviator(int targetLength) {
        this.targetLength = targetLength;
    }

    @Override
    public String abbreviate(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Class name may not be null");
        }
        int length = name.length();
        if (length < targetLength) {
            return name;
        }
        int lastDot = name.lastIndexOf('.');
        if (lastDot == -1) {
            return name;
        }
        int rightPartLength = length - lastDot;
        int leftTarget = targetLength - rightPartLength;
        if (leftTarget < 0) {
            leftTarget = 0;
        }
        StringBuilder result = new StringBuilder(length);
        int used = 0;
        boolean appendSegment = true;
        int index = 0;
        while (index < lastDot) {
            char ch = name.charAt(index);
            if (ch == '.') {
                if (used >= leftTarget) {
                    break;
                }
                appendSegment = true;
            } else if (appendSegment) {
                result.append(ch);
                appendSegment = false;
            } else {
                used++;
            }
            index++;
        }
        result.append(name.substring(index));
        return result.toString();
    }
}
