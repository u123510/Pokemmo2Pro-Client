package ch.qos.logback.core.model.processor;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.ImportModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.util.OptionHelper;

public class ImportModelHandler extends ModelHandlerBase {
    public ImportModelHandler(Context context) { super(context); }
    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext interpretationContext) { return new ImportModelHandler(context); }
    public Class getSupportedModelClass() { return ImportModel.class; }
    public void handle(ModelInterpretationContext context, Model model) {
        String className = ((ImportModel) model).getClassName();
        if (OptionHelper.isNullOrEmptyOrAllSpaces(className)) { addWarn("Empty className not allowed"); return; }
        String stem = extractStem(className);
        if (stem == null) { addWarn("[" + className + "] could not be imported due to incorrect format"); return; }
        context.addImport(stem, className);
    }
    public String extractStem(String className) {
        if (className == null) return null;
        int index = className.lastIndexOf('.');
        if (index == -1) return null;
        index++;
        if (index == className.length()) return null;
        return className.substring(index);
    }
}
