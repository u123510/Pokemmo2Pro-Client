package ch.qos.logback.classic.pattern;

public class TargetLengthBasedClassNameAbbreviator2 implements Abbreviator {
    final int targetLength;

    public TargetLengthBasedClassNameAbbreviator2(int targetLength) {
        this.targetLength = targetLength;
    }

    public static int computeDotIndexes(String value, int[] dotIndexes) {
        int count = 0;
        int index = 0;
        while (true) {
            index = value.indexOf('.', index);
            if (index == -1 || count >= 16) {
                return count;
            }
            dotIndexes[count++] = index;
            index++;
        }
    }

    public static void printArray(String prefix, int[] values) {
        System.out.print(prefix);
        for (int i = 0; i < values.length; i++) {
            if (i == 0) {
                System.out.print(values[i]);
            } else {
                System.out.print(", " + values[i]);
            }
        }
        System.out.println();
    }

    @Override
    public String abbreviate(String value) {
        StringBuilder result = new StringBuilder(targetLength);
        if (value == null) {
            throw new IllegalArgumentException("Class name may not be null");
        }
        if (value.length() < targetLength) {
            return value;
        }
        int[] dotIndexes = new int[16];
        int[] lengthArray = new int[17];
        int dotCount = computeDotIndexes(value, dotIndexes);
        if (dotCount == 0) {
            return value;
        }
        computeLengthArray(value, dotIndexes, lengthArray, dotCount);
        for (int i = 0; i <= dotCount; i++) {
            if (i == 0) {
                result.append(value.substring(0, lengthArray[i] - 1));
            } else {
                result.append(value.substring(dotIndexes[i - 1] + 1,
                        dotIndexes[i - 1] + 1 + lengthArray[i]));
            }
        }
        return result.toString();
    }

    public void computeLengthArray(String value, int[] dotIndexes, int[] lengthArray, int dotCount) {
        int remaining = value.length() - targetLength;
        for (int i = 0; i < dotCount; i++) {
            int previousDot = i == 0 ? -1 : dotIndexes[i - 1];
            int segmentLength = remaining - (dotIndexes[i] - previousDot) - 1;
            if (segmentLength <= 0) {
                segmentLength = 1;
            }
            int consumed = dotIndexes[i] - previousDot - segmentLength - 1;
            remaining -= consumed;
            lengthArray[i] = segmentLength;
        }
        int last = dotCount - 1;
        lengthArray[dotCount] = value.length() - dotIndexes[last] - lengthArray[last];
    }
}
