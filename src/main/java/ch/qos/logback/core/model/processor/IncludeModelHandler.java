package ch.qos.logback.core.model.processor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.function.Supplier;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.GenericXMLConfigurator;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.spi.RuleStore;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.model.IncludeModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;

public class IncludeModelHandler extends ModelHandlerBase {
    public boolean inError;
    private String attributeInUse;
    private boolean optional;

    public IncludeModelHandler(Context context) {
        super(context);
        this.inError = false;
    }

    public static IncludeModelHandler makeInstance(Context context, ModelInterpretationContext mic) {
        return new IncludeModelHandler(context);
    }

    private void trimHeadAndTail(List<SaxEvent> events) {
        if (events.size() == 0) return;
        SaxEvent first = events.get(0);
        if (first != null && "included".equalsIgnoreCase(first.qName)) events.remove(0);
        SaxEvent last = events.get(events.size() - 1);
        if (last != null && "included".equalsIgnoreCase(last.qName)) events.remove(events.size() - 1);
    }

    private boolean checkAttributes(IncludeModel model) {
        String file = model.getFile();
        String url = model.getUrl();
        String resource = model.getResource();
        int count = OptionHelper.isNullOrEmptyOrAllSpaces(file) ? 0 : 1;
        if (!OptionHelper.isNullOrEmptyOrAllSpaces(url)) count++;
        if (!OptionHelper.isNullOrEmptyOrAllSpaces(resource)) count++;
        if (count == 0) {
            addError("One of \"path\", \"resource\" or \"url\" attributes must be set.");
            return false;
        }
        if (count > 1) {
            addError("Only one of \"file\", \"url\" or \"resource\" attributes should be set.");
            return false;
        }
        if (count == 1) return true;
        throw new IllegalStateException("Count value [" + count + "] is not expected");
    }

    private void optionalWarning(String msg) {
        if (!optional) addWarn(msg);
    }

    @Override
    public Class<?> getSupportedModelClass() {
        return IncludeModel.class;
    }

    @Override
    public void handle(ModelInterpretationContext mic, Model model) {
        IncludeModel include = (IncludeModel) model;
        this.optional = OptionHelper.toBoolean(include.getOptional(), false);
        if (!checkAttributes(include)) {
            this.inError = true;
            return;
        }
        InputStream input = getInputStream(mic, include);
        if (input == null) {
            this.inError = true;
            return;
        }
        try {
            SaxEventRecorder recorder = populateSaxEventRecorder(input);
            if (recorder.getSaxEventList().isEmpty()) {
                addWarn("Empty sax event list");
                return;
            }
            Supplier<?> supplier = mic.getConfiguratorSupplier();
            if (supplier == null) {
                addError("null configurator supplier. Abandoning inclusion of [" + attributeInUse + "]");
                this.inError = true;
                return;
            }
            GenericXMLConfigurator configurator = (GenericXMLConfigurator) supplier.get();
            RuleStore ruleStore = configurator.getRuleStore();
            ruleStore.addPathPathMapping("included", "configuration");
            Model includedModel = configurator.buildModelFromSaxEventList(recorder.getSaxEventList());
            if (includedModel == null) {
                addError("Could not find valid configuration instructions. Exiting.");
                return;
            }
            include.getSubModels().addAll(includedModel.getSubModels());
        } catch (JoranException ex) {
            this.inError = true;
            addError("Error processing XML data in [" + attributeInUse + "]", ex);
        }
    }

    public SaxEventRecorder populateSaxEventRecorder(InputStream input) throws JoranException {
        SaxEventRecorder recorder = new SaxEventRecorder(context);
        recorder.recordEvents(input);
        return recorder;
    }

    public InputStream getInputStream(ModelInterpretationContext mic, IncludeModel model) {
        URL url = getInputURL(mic, model);
        if (url == null) return null;
        ConfigurationWatchListUtil.addToWatchList(context, url);
        return openURL(url);
    }

    public InputStream openURL(URL url) {
        try {
            return url.openStream();
        } catch (IOException ex) {
            optionalWarning("Failed to open [" + url + "]");
            return null;
        }
    }

    public URL getInputURL(ModelInterpretationContext mic, IncludeModel model) {
        String file = model.getFile();
        String url = model.getUrl();
        String resource = model.getResource();
        if (!OptionHelper.isNullOrEmptyOrAllSpaces(file)) {
            attributeInUse = mic.subst(file);
            return filePathAsURL(attributeInUse);
        }
        if (!OptionHelper.isNullOrEmptyOrAllSpaces(url)) {
            attributeInUse = mic.subst(url);
            return attributeToURL(attributeInUse);
        }
        if (!OptionHelper.isNullOrEmptyOrAllSpaces(resource)) {
            attributeInUse = mic.subst(resource);
            return resourceAsURL(attributeInUse);
        }
        throw new IllegalStateException("A URL stream should have been returned at this stage");
    }

    public URL filePathAsURL(String path) {
        try {
            URI uri = new File(path).toURI();
            return uri.toURL();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public URL attributeToURL(String value) {
        try {
            return new URL(value);
        } catch (MalformedURLException ex) {
            addError("URL [" + value + "] is not well formed.", ex);
            return null;
        }
    }

    public URL resourceAsURL(String resource) {
        URL url = Loader.getResourceBySelfClassLoader(resource);
        if (url == null) {
            optionalWarning("Could not find resource corresponding to [" + resource + "]");
            return null;
        }
        return url;
    }
}
