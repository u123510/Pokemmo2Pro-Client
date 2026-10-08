/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.classic.joran.serializedModel;

import ch.qos.logback.classic.model.ConfigurationModel;
import ch.qos.logback.classic.model.ContextNameModel;
import ch.qos.logback.classic.model.LoggerContextListenerModel;
import ch.qos.logback.classic.model.LoggerModel;
import ch.qos.logback.classic.model.ReceiverModel;
import ch.qos.logback.classic.model.RootLoggerModel;
import ch.qos.logback.core.model.AppenderModel;
import ch.qos.logback.core.model.AppenderRefModel;
import ch.qos.logback.core.model.ComponentModel;
import ch.qos.logback.core.model.DefineModel;
import ch.qos.logback.core.model.EventEvaluatorModel;
import ch.qos.logback.core.model.ImplicitModel;
import ch.qos.logback.core.model.ImportModel;
import ch.qos.logback.core.model.IncludeModel;
import ch.qos.logback.core.model.InsertFromJNDIModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.NamedComponentModel;
import ch.qos.logback.core.model.NamedModel;
import ch.qos.logback.core.model.ParamModel;
import ch.qos.logback.core.model.PropertyModel;
import ch.qos.logback.core.model.SequenceNumberGeneratorModel;
import ch.qos.logback.core.model.SerializeModelModel;
import ch.qos.logback.core.model.ShutdownHookModel;
import ch.qos.logback.core.model.SiftModel;
import ch.qos.logback.core.model.StatusListenerModel;
import ch.qos.logback.core.model.TimestampModel;
import ch.qos.logback.core.model.conditional.ElseModel;
import ch.qos.logback.core.model.conditional.IfModel;
import ch.qos.logback.core.model.conditional.ThenModel;
import ch.qos.logback.core.net.HardenedObjectInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class HardenedModelInputStream
extends HardenedObjectInputStream {
    public static List getWhilelist() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(Model.class.getName());
        arrayList.add(Model.class.getName());
        arrayList.add(IncludeModel.class.getName());
        arrayList.add(InsertFromJNDIModel.class.getName());
        arrayList.add(RootLoggerModel.class.getName());
        arrayList.add(ImportModel.class.getName());
        arrayList.add(AppenderRefModel.class.getName());
        arrayList.add(ComponentModel.class.getName());
        arrayList.add(StatusListenerModel.class.getName());
        arrayList.add(ShutdownHookModel.class.getName());
        arrayList.add(NamedComponentModel.class.getName());
        arrayList.add(AppenderModel.class.getName());
        arrayList.add(EventEvaluatorModel.class.getName());
        arrayList.add(DefineModel.class.getName());
        arrayList.add(SequenceNumberGeneratorModel.class.getName());
        arrayList.add(ImplicitModel.class.getName());
        arrayList.add(ReceiverModel.class.getName());
        arrayList.add(LoggerContextListenerModel.class.getName());
        arrayList.add(ThenModel.class.getName());
        arrayList.add(IfModel.class.getName());
        arrayList.add(NamedModel.class.getName());
        arrayList.add(ContextNameModel.class.getName());
        arrayList.add(ParamModel.class.getName());
        arrayList.add(TimestampModel.class.getName());
        arrayList.add(PropertyModel.class.getName());
        arrayList.add(ElseModel.class.getName());
        arrayList.add(ConfigurationModel.class.getName());
        arrayList.add(SiftModel.class.getName());
        arrayList.add(LoggerModel.class.getName());
        arrayList.add(SerializeModelModel.class.getName());
        return arrayList;
    }

    public HardenedModelInputStream(InputStream inputStream) throws IOException {
        super(inputStream, HardenedModelInputStream.getWhilelist());
    }
}

