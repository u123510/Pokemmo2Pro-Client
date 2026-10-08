package ch.qos.logback.core.model.processor;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.SerializeModelModel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class SerializeModelModelHandler extends ModelHandlerBase {
    public SerializeModelModelHandler(Context context) { super(context); }
    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext interpretationContext) { return new SerializeModelModelHandler(context); }
    private void writeModel(String file, Model model) {
        addInfo("Serializing model to file [" + file + "]");
        try (FileOutputStream output = new FileOutputStream(file); ObjectOutputStream stream = new ObjectOutputStream(output)) {
            stream.writeObject(model);
            stream.flush();
        } catch (IOException exception) {
            addError("IO failure while serializing Model [" + file + "]");
        }
    }
    public void handle(ModelInterpretationContext context, Model model) {
        Object hint = context.getConfiguratorHint();
        if (hint != null && hint.getClass().getName().equals("ch.qos.logback.classic.joran.SerializedModelConfigurator")) {
            addInfo("Skipping model serialization as calling configurator is already model based.");
            return;
        }
        if (!(model instanceof SerializeModelModel)) {
            addWarn("Model parameter is not of type SerializeModelModel. Skipping serialization of model structure");
            return;
        }
        SerializeModelModel serializeModel = (SerializeModelModel) model;
        Model topModel = context.getTopModel();
        if (topModel == null) {
            addWarn("Could not find top most model. Skipping serialization of model structure.");
            return;
        }
        String file = serializeModel.getFile();
        if (file == null) {
            file = "logback-" + DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HHmm").format(Instant.now()) + ".scmo";
            addInfo("For model serialization, using default file destination [" + file + "]");
        } else {
            file = context.subst(file);
        }
        writeModel(file, topModel);
    }
}
