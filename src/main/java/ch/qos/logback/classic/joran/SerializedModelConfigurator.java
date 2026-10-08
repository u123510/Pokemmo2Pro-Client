package ch.qos.logback.classic.joran;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.serializedModel.HardenedModelInputStream;
import ch.qos.logback.classic.model.processor.LogbackClassicDefaultNestedComponentRules;
import ch.qos.logback.classic.spi.Configurator;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.LogbackException;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.ModelUtil;
import ch.qos.logback.core.model.processor.DefaultProcessor;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class SerializedModelConfigurator extends ContextAwareBase implements Configurator {
    public static final String AUTOCONFIG_MODEL_FILE = "logback.scmo";
    public static final String TEST_AUTOCONFIG_MODEL_FILE = "logback-test.scmo";
    protected ModelInterpretationContext modelInterpretationContext;

    private void configureByResource(URL url) {
        if (!url.toString().endsWith(".scmo")) {
            throw new LogbackException("Unexpected filename extension of file [" + url + "]. Should be .scmo");
        }
        Model model = retrieveModel(url);
        if (model == null) {
            addWarn("Empty model. Abandoning.");
            return;
        }
        ModelUtil.resetForReuse(model);
        buildModelInterpretationContext(model);
        DefaultProcessor processor = new DefaultProcessor(context, modelInterpretationContext);
        ModelClassToModelHandlerLinker linker = new ModelClassToModelHandlerLinker(context);
        linker.link(processor);
        synchronized (context.getConfigurationLock()) {
            processor.process(model);
        }
    }

    private void buildModelInterpretationContext(Model model) {
        modelInterpretationContext = new ModelInterpretationContext(context, this);
        modelInterpretationContext.setTopModel(model);
        LogbackClassicDefaultNestedComponentRules.addDefaultNestedComponentRegistryRules(
                modelInterpretationContext.getDefaultNestedComponentRegistry());
        modelInterpretationContext.createAppenderBags();
    }

    private Model retrieveModel(URL url) {
        long start = System.currentTimeMillis();
        try (InputStream input = url.openStream();
             ObjectInputStream objectInput = new HardenedModelInputStream(input)) {
            Model model = (Model) objectInput.readObject();
            addInfo(String.valueOf(url) + "Model at [" + url + "] read in "
                    + (System.currentTimeMillis() - start) + " milliseconds");
            return model;
        } catch (ClassNotFoundException ex) {
            addError("Failed read model object in " + url, ex);
        } catch (IOException ex) {
            addError("Failed to open " + url, ex);
        }
        return null;
    }

    private URL performMultiStepModelFileSearch(boolean updateStatus) {
        ClassLoader loader = Loader.getClassLoaderOfObject(this);
        URL url = findModelConfigFileURLFromSystemProperties(loader);
        if (url != null) return url;
        url = getResource(TEST_AUTOCONFIG_MODEL_FILE, loader, updateStatus);
        if (url != null) return url;
        return getResource(AUTOCONFIG_MODEL_FILE, loader, updateStatus);
    }

    private URL getResource(String resource, ClassLoader loader, boolean updateStatus) {
        URL url = Loader.getResource(resource, loader);
        if (updateStatus) statusOnResourceSearch(resource, url);
        return url;
    }

    private void statusOnResourceSearch(String resource, URL url) {
        if (context == null) return;
        if (context.getStatusManager() == null) return;
        InfoStatus status = url == null
                ? new InfoStatus("Could NOT find resource [" + resource + "]", this)
                : new InfoStatus("Found resource [" + resource + "] at [" + url + "]", this);
        context.getStatusManager().add(status);
    }

    @Override
    public Configurator.ExecutionStatus configure(LoggerContext context) {
        URL url = performMultiStepModelFileSearch(true);
        if (url != null) {
            configureByResource(url);
            return Configurator.ExecutionStatus.DO_NOT_INVOKE_NEXT_IF_ANY;
        }
        return Configurator.ExecutionStatus.INVOKE_NEXT_IF_ANY;
    }

    public URL findModelConfigFileURLFromSystemProperties(ClassLoader loader) {
        String path = OptionHelper.getSystemProperty("logback.scmoFile");
        if (path == null) return null;
        try {
            URL url = new URL(path);
            statusOnResourceSearch(path, url);
            return url;
        } catch (MalformedURLException ignored) {
            try {
                URL resource = Loader.getResource(path, loader);
                if (resource != null) {
                    statusOnResourceSearch(path, resource);
                    return resource;
                }
                File file = new File(path);
                if (file.exists() && file.isFile()) {
                    try {
                        URL fileUrl = file.toURI().toURL();
                        statusOnResourceSearch(path, fileUrl);
                        return fileUrl;
                    } catch (MalformedURLException ignoredMalformedUrl) {
                        // Fall through to the normal not-found status path.
                    }
                }
            } catch (Exception ex) {
                statusOnResourceSearch(path, null);
                throw ex;
            }
            statusOnResourceSearch(path, null);
        }
        return null;
    }
}
