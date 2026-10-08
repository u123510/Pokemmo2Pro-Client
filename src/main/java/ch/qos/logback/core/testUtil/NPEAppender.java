package ch.qos.logback.core.testUtil;

import ch.qos.logback.core.AppenderBase;

public class NPEAppender extends AppenderBase {
    public NPEAppender() {
    }

    @Override
    public void append(Object event) {
        throw null;
    }
}
