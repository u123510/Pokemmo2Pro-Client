package ch.qos.logback.core.model.processor.conditional;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.conditional.IfModel;
import ch.qos.logback.core.model.conditional.ThenModel;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;

public class ThenModelHandler extends ModelHandlerBase {
    public ThenModelHandler(Context context) {
        super(context);
    }

    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext mic) {
        return new ThenModelHandler(context);
    }

    @Override
    public Class<?> getSupportedModelClass() {
        return ThenModel.class;
    }

    @Override
    public void handle(ModelInterpretationContext mic, Model model) {
        ThenModel thenModel = (ThenModel) model;
        if (mic.isModelStackEmpty()) {
            addError("Unexpected empty model stack. Have you omitted the <if> part?");
            thenModel.markAsSkipped();
            return;
        }
        Model parent = mic.peekModel();
        if (!(parent instanceof IfModel)) {
            addError("Unexpected type for parent model [" + String.valueOf(parent) + "]");
            thenModel.markAsSkipped();
            return;
        }
        IfModel ifModel = (IfModel) parent;
        if (ifModel.getBranchState() != IfModel.BranchState.IF_BRANCH) {
            thenModel.deepMarkAsSkipped();
        }
    }
}
