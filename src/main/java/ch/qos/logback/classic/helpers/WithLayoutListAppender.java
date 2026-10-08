package ch.qos.logback.classic.helpers;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import java.util.ArrayList;
import java.util.List;

public class WithLayoutListAppender extends AppenderBase<ILoggingEvent> {
    public List<String> list = new ArrayList<>();
    String pattern;
    PatternLayout patternLayout;

    @Override
    public void start() {
        if (pattern == null) {
            addError("null pattern disallowed");
            return;
        }
        patternLayout = new PatternLayout();
        patternLayout.setContext(context);
        patternLayout.setPattern(pattern);
        patternLayout.start();
        if (patternLayout.isStarted()) {
            super.start();
        }
    }

    @Override
    public void append(ILoggingEvent event) {
        list.add(patternLayout.doLayout(event));
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
