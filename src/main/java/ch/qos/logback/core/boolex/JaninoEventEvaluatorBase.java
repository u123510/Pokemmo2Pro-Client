package ch.qos.logback.core.boolex;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for event evaluators that evaluate boolean expressions.
 *
 * The original implementation compiled expressions with the Janino
 * library (org.codehaus.janino.ScriptEvaluator). Janino is not present in
 * the obfuscated client, so this source variant keeps the same API shape
 * (matching the jar bytecode) without the Janino dependency: start()
 * simply marks the evaluator as started and evaluate() returns true.
 */
public abstract class JaninoEventEvaluatorBase<E> extends EventEvaluatorBase<E> {
    static Class<?> EXPRESSION_TYPE;
    static Class<?>[] THROWN_EXCEPTIONS;
    public static final int ERROR_THRESHOLD = 4;
    private String expression;
    private int errorCount;
    protected List<Matcher> matcherList;

    public JaninoEventEvaluatorBase() {
        errorCount = 0;
        matcherList = new ArrayList<Matcher>();
    }

    static {
        EXPRESSION_TYPE = Boolean.TYPE;
        THROWN_EXCEPTIONS = new Class<?>[] { EvaluationException.class };
    }

    public abstract String getDecoratedExpression();
    public abstract String[] getParameterNames();
    public abstract Class<?>[] getParameterTypes();
    public abstract Object[] getParameterValues(E event);

    @Override
    public void start() {
        super.start();
    }

    @Override
    public boolean evaluate(E event) throws EvaluationException {
        return true;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void addMatcher(Matcher matcher) {
        matcherList.add(matcher);
    }

    public List<Matcher> getMatcherList() {
        return matcherList;
    }
}