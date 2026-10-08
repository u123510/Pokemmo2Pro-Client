package ch.qos.logback.classic.joran.action;

import ch.qos.logback.core.joran.action.EventEvaluatorAction;

public class ClassicEvaluatorAction extends EventEvaluatorAction {
    public String defaultClassName() {
        return ch.qos.logback.classic.boolex.JaninoEventEvaluator.class.getName();
    }
}
