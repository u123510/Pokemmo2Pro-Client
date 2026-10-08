package ch.qos.logback.classic.net;

import ch.qos.logback.classic.ClassicConstants;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.boolex.OnErrorEvaluator;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.helpers.CyclicBuffer;
import ch.qos.logback.core.net.SMTPAppenderBase;
import f.HA0;
import f.nf0_1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

public class SMTPAppender extends SMTPAppenderBase {
    static final String DEFAULT_SUBJECT_PATTERN = "%logger{20} - %m";
    private boolean includeCallerData = false;

    public SMTPAppender() {
    }

    public SMTPAppender(EventEvaluator eventEvaluator) {
        this.eventEvaluator = eventEvaluator;
    }

    @Override
    public void start() {
        if (this.eventEvaluator == null) {
            OnErrorEvaluator onErrorEvaluator = new OnErrorEvaluator();
            onErrorEvaluator.setContext(this.getContext());
            onErrorEvaluator.setName("onError");
            onErrorEvaluator.start();
            this.eventEvaluator = onErrorEvaluator;
        }
        super.start();
    }

    public void subAppend(CyclicBuffer cyclicBuffer, Object event) {
        ILoggingEvent iLoggingEvent = (ILoggingEvent) event;
        if (this.includeCallerData) {
            iLoggingEvent.getCallerData();
        }
        iLoggingEvent.prepareForDeferredProcessing();
        cyclicBuffer.add(iLoggingEvent);
    }

    @Override
    public void fillBuffer(CyclicBuffer cyclicBuffer, StringBuffer stringBuffer) {
        int n = cyclicBuffer.length();
        for (int j = 0; j < n; ++j) {
            ILoggingEvent iLoggingEvent = (ILoggingEvent) cyclicBuffer.get();
            stringBuffer.append(this.layout.doLayout(iLoggingEvent));
        }
    }

    @Override
    public boolean eventMarksEndOfLife(Object event) {
        ILoggingEvent iLoggingEvent = (ILoggingEvent) event;
        List markerList = iLoggingEvent.getMarkerList();
        if (markerList != null && !markerList.isEmpty()) {
            Iterator iterator = markerList.iterator();
            while (iterator.hasNext()) {
                HA0 marker = (HA0) iterator.next();
                if (((nf0_1) marker).gJ(ClassicConstants.FINALIZE_SESSION_MARKER)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public Layout makeSubjectLayout(String subjectStr) {
        if (subjectStr == null) {
            subjectStr = DEFAULT_SUBJECT_PATTERN;
        }
        PatternLayout patternLayout = new PatternLayout();
        patternLayout.setContext(this.getContext());
        patternLayout.setPattern(subjectStr);
        patternLayout.setPostCompileProcessor(null);
        patternLayout.start();
        return patternLayout;
    }

    @Override
    public PatternLayout makeNewToPatternLayout(String toPattern) {
        PatternLayout patternLayout = new PatternLayout();
        patternLayout.setPattern(toPattern + "%nopex");
        return patternLayout;
    }

    public boolean isIncludeCallerData() {
        return this.includeCallerData;
    }

    public void setIncludeCallerData(boolean includeCallerData) {
        this.includeCallerData = includeCallerData;
    }

    public Future getAsynchronousSendingFuture() {
        return this.asynchronousSendingFuture;
    }
}
