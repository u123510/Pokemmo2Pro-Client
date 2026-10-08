package ch.qos.logback.core.model.processor.conditional;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.conditional.Condition;
import ch.qos.logback.core.joran.conditional.PropertyEvalScriptBuilder;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.conditional.IfModel;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.OptionHelper;

public class IfModelHandler extends ModelHandlerBase {
    public static final String MISSING_JANINO_MSG = "Could not find Janino library on the class path. Skipping conditional processing.";
    public static final String MISSING_JANINO_SEE = "See also http://logback.qos.ch/codes.html#ifJanino";

    IfModel ifModel;

    public IfModelHandler(Context context) {
        super(context);
    }

    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext mic) {
        return new IfModelHandler(context);
    }

    @Override
    public Class getSupportedModelClass() {
        return IfModel.class;
    }

    @Override
    public void handle(ModelInterpretationContext mic, Model model) {
        this.ifModel = (IfModel)model;
        if (!EnvUtil.isJaninoAvailable()) {
            addError(MISSING_JANINO_MSG);
            addError(MISSING_JANINO_SEE);
            return;
        }

        mic.pushModel(this.ifModel);
        int lineNumber = model.getLineNumber();
        String conditionStr = this.ifModel.getCondition();
        if (OptionHelper.isNullOrEmptyOrAllSpaces(conditionStr)) {
            addError("Missing condition for if statement on line " + lineNumber);
            this.ifModel.setBranchState(IfModel.BranchState.IN_ERROR);
            return;
        }

        try {
            conditionStr = OptionHelper.substVars(conditionStr, mic, this.context);
        } catch (ScanException e) {
            addError("Failed to parse input [" + conditionStr + "] on line " + lineNumber, e);
            this.ifModel.setBranchState(IfModel.BranchState.IN_ERROR);
            return;
        }

        PropertyEvalScriptBuilder builder = new PropertyEvalScriptBuilder((PropertyContainer)mic);
        builder.setContext(this.context);
        try {
            Condition condition = builder.build(conditionStr);
            if (condition == null) {
                addError("The condition variable is null. This should not occur.");
                this.ifModel.setBranchState(IfModel.BranchState.IN_ERROR);
                return;
            }
            boolean result = condition.evaluate();
            addInfo("Condition [" + conditionStr + "] evaluated to " + result + " on line " + lineNumber);
            this.ifModel.setBranchState(result);
        } catch (Exception e) {
            addError("Failed to evaluate condition [" + conditionStr + "] on line " + lineNumber, e);
            this.ifModel.setBranchState(IfModel.BranchState.IN_ERROR);
        }
    }

    @Override
    public void postHandle(ModelInterpretationContext mic, Model model) {
        if (mic != null && !mic.isModelStackEmpty()) {
            mic.popModel();
        }
    }
}
