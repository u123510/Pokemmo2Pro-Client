/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.sift;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.processor.DefaultProcessor;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;

public class SiftProcessor
extends DefaultProcessor {
    public SiftProcessor(Context context, ModelInterpretationContext modelInterpretationContext) {
        super(modelInterpretationContext.getContext(), modelInterpretationContext);
    }

    public ModelInterpretationContext getModelInterpretationContext() {
        return this.mic;
    }
}

