package ch.qos.logback.core.filter;

import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.spi.FilterReply;

public class EvaluatorFilter<E> extends AbstractMatcherFilter<E> {
    EventEvaluator evaluator;

    public EvaluatorFilter() {
    }

    @Override
    public void start() {
        if (evaluator != null) {
            super.start();
        } else {
            addError("No evaluator set for filter " + getName());
        }
    }

    public EventEvaluator getEvaluator() { return evaluator; }
    public void setEvaluator(EventEvaluator evaluator) { this.evaluator = evaluator; }

    @Override
    public FilterReply decide(E event) {
        if (!isStarted() || !evaluator.isStarted()) return FilterReply.NEUTRAL;
        try {
            return evaluator.evaluate(event) ? onMatch : onMismatch;
        } catch (EvaluationException e) {
            addError("Evaluator " + evaluator.getName() + " threw an exception", e);
            return FilterReply.NEUTRAL;
        }
    }
}
