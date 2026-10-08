package ch.qos.logback.core.model.processor;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.TimestampModel;
import ch.qos.logback.core.util.CachingDateFormatter;
import ch.qos.logback.core.util.OptionHelper;

public class TimestampModelHandler extends ModelHandlerBase {
    public boolean inError;

    public TimestampModelHandler(Context context) {
        super(context);
        this.inError = false;
    }

    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext mic) {
        return new TimestampModelHandler(context);
    }

    @Override
    public Class<?> getSupportedModelClass() {
        return TimestampModel.class;
    }

    @Override
    public void handle(ModelInterpretationContext mic, Model model) {
        TimestampModel tm = (TimestampModel) model;
        String key = tm.getKey();
        if (OptionHelper.isNullOrEmptyOrAllSpaces(key)) {
            addError("Attribute named [key] cannot be empty");
            this.inError = true;
        }
        String datePattern = tm.getDatePattern();
        if (OptionHelper.isNullOrEmptyOrAllSpaces(datePattern)) {
            addError("Attribute named [datePattern] cannot be empty");
            this.inError = true;
        }
        long timeReference;
        if ("contextBirth".equalsIgnoreCase(tm.getTimeReference())) {
            addInfo("Using context birth as time reference.");
            timeReference = context.getBirthTime();
        } else {
            timeReference = System.currentTimeMillis();
            addInfo("Using current interpretation time, i.e. now, as time reference.");
        }
        if (this.inError) {
            return;
        }
        ActionUtil.Scope scope = ActionUtil.stringToScope(tm.getScopeStr());
        CachingDateFormatter formatter = new CachingDateFormatter(datePattern);
        String value = formatter.format(timeReference);
        addInfo("Adding property to the context with key=\"" + key + "\" and value=\"" + value + "\" to the " + scope + " scope");
        ActionUtil.setProperty(mic, key, value, scope);
    }
}
