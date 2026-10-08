/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.sift;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.SiftModel;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;

public class NOPSiftModelHandler
extends ModelHandlerBase {
    public NOPSiftModelHandler(Context context) {
        super(context);
    }

    public static NOPSiftModelHandler makeInstance(Context context, ModelInterpretationContext modelInterpretationContext) {
        return new NOPSiftModelHandler(context);
    }

    @Override
    public Class getSupportedModelClass() {
        return SiftModel.class;
    }

    @Override
    public void handle(ModelInterpretationContext modelInterpretationContext, Model model) {
    }
}

