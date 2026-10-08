package ch.qos.logback.core.model;

import ch.qos.logback.core.model.processor.PhaseIndicator;
import ch.qos.logback.core.model.processor.ProcessingPhase;

@PhaseIndicator(phase = ProcessingPhase.SECOND)
public class AppenderModel extends NamedComponentModel {
    private static final long serialVersionUID = 1096234203123945432L;

    public AppenderModel() {}

    @Override
    public AppenderModel makeNewInstance() {
        return new AppenderModel();
    }
}
