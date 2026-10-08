/*
 * Reconstructed from bytecode (javap) of the obfuscated jar, cross-checked
 * against logback 1.4.x semantics.
 */
package ch.qos.logback.core.joran;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.RuleStore;
import ch.qos.logback.core.joran.spi.SaxEventInterpreter;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.spi.SimpleRuleStore;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.processor.DefaultProcessor;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import ch.qos.logback.core.spi.ConfigurationEvent;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.StatusUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.xml.sax.InputSource;

public abstract class GenericXMLConfigurator extends ContextAwareBase {
    protected SaxEventInterpreter saxEventInterpreter;
    protected ModelInterpretationContext modelInterpretationContext;
    private RuleStore ruleStore;

    public static void informContextOfURLUsedForConfiguration(Context context, URL url) {
        ConfigurationWatchListUtil.setMainWatchURL(context, url);
    }

    private void playSaxEvents() {
        saxEventInterpreter.getEventPlayer().play();
    }

    public ModelInterpretationContext getModelInterpretationContext() {
        return modelInterpretationContext;
    }

    public final void doConfigure(URL url) throws JoranException {
        informContextOfURLUsedForConfiguration(getContext(), url);
        InputStream in = null;
        try {
            in = url.openConnection().getInputStream();
            doConfigure(in, url.toExternalForm());
        } catch (IOException e) {
            String errMsg = "Could not open [" + url + "].";
            addError(errMsg, e);
            throw new JoranException(errMsg, e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    String errMsg = "Could not close input stream";
                    addError(errMsg, e);
                    throw new JoranException(errMsg, e);
                }
            }
        }
    }

    public final void doConfigure(String filename) throws JoranException {
        doConfigure(new File(filename));
    }

    public final void doConfigure(File file) throws JoranException {
        URL url;
        try {
            url = file.toURI().toURL();
        } catch (MalformedURLException e) {
            String errMsg = "Could not open [" + file.getPath() + "].";
            addError(errMsg, e);
            throw new JoranException(errMsg, e);
        }
        informContextOfURLUsedForConfiguration(getContext(), url);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            doConfigure(fis, url.toExternalForm());
        } catch (IOException e) {
            String errMsg = "Could not open [" + file.getPath() + "].";
            addError(errMsg, e);
            throw new JoranException(errMsg, e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    String errMsg = "Could not close [" + file.getName() + "].";
                    addError(errMsg, e);
                    throw new JoranException(errMsg, e);
                }
            }
        }
    }

    public final void doConfigure(InputStream inputStream) throws JoranException {
        doConfigure(new InputSource(inputStream));
    }

    public final void doConfigure(InputStream inputStream, String systemId) throws JoranException {
        InputSource inputSource = new InputSource(inputStream);
        inputSource.setSystemId(systemId);
        doConfigure(inputSource);
    }

    public abstract void addElementSelectorAndActionAssociations(RuleStore ruleStore);

    public abstract void setImplicitRuleSupplier(SaxEventInterpreter saxEventInterpreter);

    public void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry registry) {
        // default no-op
    }

    public ElementPath initialElementPath() {
        return new ElementPath();
    }

    public void buildSaxEventInterpreter(List eventList) {
        ruleStore = getRuleStore();
        addElementSelectorAndActionAssociations(ruleStore);
        saxEventInterpreter = new SaxEventInterpreter(context, ruleStore, initialElementPath(), eventList);
        saxEventInterpreter.getSaxEventInterpretationContext().setContext(context);
        setImplicitRuleSupplier(saxEventInterpreter);
    }

    public RuleStore getRuleStore() {
        if (ruleStore == null) {
            ruleStore = new SimpleRuleStore(context);
        }
        return ruleStore;
    }

    public void buildModelInterpretationContext() {
        modelInterpretationContext = new ModelInterpretationContext(context);
        addDefaultNestedComponentRegistryRules(modelInterpretationContext.getDefaultNestedComponentRegistry());
    }

    public final void doConfigure(InputSource inputSource) throws JoranException {
        context.fireConfigurationEvent(ConfigurationEvent.newConfigurationStartedEvent(this));
        long startTime = System.currentTimeMillis();
        SaxEventRecorder recorder = populateSaxEventRecorder(inputSource);
        if (recorder.getSaxEventList().isEmpty()) {
            addWarn("Empty sax event list");
            return;
        }
        Model model = buildModelFromSaxEventList(recorder.getSaxEventList());
        if (model == null) {
            addError("Could not find valid configuration instructions. Exiting.");
            return;
        }
        sanityCheck(model);
        processModel(model);
        StatusUtil statusUtil = new StatusUtil(context);
        if (statusUtil.noXMLParsingErrorsOccurred(startTime)) {
            addInfo("Registering current configuration as safe fallback point");
            registerSafeConfiguration(model);
        }
        context.fireConfigurationEvent(ConfigurationEvent.newConfigurationEndedEvent(this));
    }

    public SaxEventRecorder populateSaxEventRecorder(InputSource inputSource) throws JoranException {
        SaxEventRecorder recorder = new SaxEventRecorder(context);
        recorder.recordEvents(inputSource);
        return recorder;
    }

    public Model buildModelFromSaxEventList(List eventList) {
        buildSaxEventInterpreter(eventList);
        playSaxEvents();
        return saxEventInterpreter.getSaxEventInterpretationContext().peekModel();
    }

    public void processModel(Model model) {
        buildModelInterpretationContext();
        modelInterpretationContext.setTopModel(model);
        modelInterpretationContext.setConfiguratorHint(this);
        DefaultProcessor defaultProcessor = new DefaultProcessor(context, modelInterpretationContext);
        addModelHandlerAssociations(defaultProcessor);
        synchronized (context.getConfigurationLock()) {
            defaultProcessor.process(model);
        }
    }

    public void sanityCheck(Model model) {
        // default no-op
    }

    public void addModelHandlerAssociations(DefaultProcessor defaultProcessor) {
        // default no-op
    }

    public void registerSafeConfiguration(Model model) {
        context.putObject("SAFE_JORAN_CONFIGURATION", model);
    }

    public Model recallSafeConfiguration() {
        return (Model) context.getObject("SAFE_JORAN_CONFIGURATION");
    }
}
