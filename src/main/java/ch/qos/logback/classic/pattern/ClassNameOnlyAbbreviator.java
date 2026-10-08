package ch.qos.logback.classic.pattern;

public class ClassNameOnlyAbbreviator implements Abbreviator {
    @Override
    public String abbreviate(String name) {
        int index = name.lastIndexOf('.');
        return index == -1 ? name : name.substring(index + 1);
    }
}
