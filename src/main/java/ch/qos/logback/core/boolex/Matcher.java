package ch.qos.logback.core.boolex;

import ch.qos.logback.core.spi.ContextAwareBase;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Matcher extends ContextAwareBase implements ch.qos.logback.core.spi.LifeCycle {
    private String regex;
    private String name;
    private boolean caseSensitive;
    private boolean canonEq;
    private boolean unicodeCase;
    private boolean start;
    private Pattern pattern;

    public Matcher() {
        caseSensitive = true;
        canonEq = false;
        unicodeCase = false;
        start = false;
    }

    public String getRegex() { return regex; }
    public void setRegex(String regex) { this.regex = regex; }

    @Override
    public void start() {
        if (name == null) {
            addError("All Matcher objects must be named");
            return;
        }
        int flags = 0;
        try {
            if (!caseSensitive) flags = 2;
            if (canonEq) flags |= 128;
            if (unicodeCase) flags |= 64;
            pattern = Pattern.compile(regex, flags);
            start = true;
        } catch (PatternSyntaxException e) {
            addError("Failed to compile regex [" + regex + "]", e);
        }
    }

    @Override
    public void stop() { start = false; }

    @Override
    public boolean isStarted() { return start; }

    public boolean matches(String input) throws EvaluationException {
        if (start) return pattern.matcher(input).find();
        throw new EvaluationException("Matcher [" + regex + "] not started");
    }

    public boolean isCanonEq() { return canonEq; }
    public void setCanonEq(boolean value) { canonEq = value; }
    public boolean isCaseSensitive() { return caseSensitive; }
    public void setCaseSensitive(boolean value) { caseSensitive = value; }
    public boolean isUnicodeCase() { return unicodeCase; }
    public void setUnicodeCase(boolean value) { unicodeCase = value; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
