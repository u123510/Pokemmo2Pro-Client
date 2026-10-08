package ch.qos.logback.core.joran.sanity;

import java.util.ArrayList;
import java.util.List;

import ch.qos.logback.core.joran.sanity.SanityChecker;
import ch.qos.logback.core.model.AppenderModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.spi.ContextAwareBase;

public class AppenderWithinAppenderSanityChecker extends ContextAwareBase implements SanityChecker {
    public static String NESTED_APPENDERS_WARNING = "As of logback version 1.3, nested appenders are not allowed.";

    public AppenderWithinAppenderSanityChecker() {
        super();
    }

    private boolean isSiftingAppender(Model model) {
        if (!(model instanceof AppenderModel)) {
            return false;
        }
        String className = ((AppenderModel) model).getClassName();
        return className != null && className.contains("SiftingAppender");
    }

    public void check(Model model) {
        if (model == null) {
            return;
        }
        List<Model> appenders = new ArrayList<>();
        deepFindAllModelsOfType(AppenderModel.class, appenders, model);
        List<Pair> nested = deepFindNestedSubModelsOfType(AppenderModel.class, appenders);
        List<Pair> filtered = new ArrayList<>();
        for (Pair pair : nested) {
            if (!isSiftingAppender((Model) pair.first)) {
                filtered.add(pair);
            }
        }
        if (filtered.isEmpty()) {
            return;
        }
        addWarn(NESTED_APPENDERS_WARNING);
        for (Pair pair : filtered) {
            Model outer = (Model) pair.first;
            Model inner = (Model) pair.second;
            addWarn("Appender at line " + outer.getLineNumber() + " contains a nested appender at line " + inner.getLineNumber());
        }
    }
}
