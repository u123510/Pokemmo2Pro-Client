package ch.qos.logback.classic.util;

import ch.qos.logback.classic.BasicConfigurator;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.SerializedModelConfigurator;
import ch.qos.logback.classic.spi.Configurator;
import ch.qos.logback.classic.spi.ConfiguratorRank;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.LogbackException;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.ContextAwareImpl;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.StatusListenerConfigHelper;
import java.util.Comparator;
import java.util.List;

public class ContextInitializer {
    public static final String AUTOCONFIG_FILE = "logback.xml";
    public static final String TEST_AUTOCONFIG_FILE = "logback-test.xml";
    public static final String CONFIG_FILE_PROPERTY = "logback.configurationFile";
    private final String[] INTERNAL_CONFIGURATOR_CLASSNAME_LIST = {
            "ch.qos.logback.classic.joran.SerializedModelConfigurator",
            "ch.qos.logback.classic.util.DefaultJoranConfigurator",
            "ch.qos.logback.classic.BasicConfigurator"
    };
    final LoggerContext loggerContext;
    final ContextAware contextAware;
    private final Comparator<Configurator> rankComparator;

    public ContextInitializer(LoggerContext loggerContext) {
        this.loggerContext = loggerContext;
        this.contextAware = new ContextAwareImpl(loggerContext, this);
        this.rankComparator = (first, second) -> {
            ConfiguratorRank firstRank = first.getClass().getAnnotation(ConfiguratorRank.class);
            ConfiguratorRank secondRank = second.getClass().getAnnotation(ConfiguratorRank.class);
            int firstValue = firstRank == null ? 20 : firstRank.value();
            int secondValue = secondRank == null ? 20 : secondRank.value();
            return -compareRankValue(firstValue, secondValue);
        };
    }

    private Configurator instantiateConfiguratorByClassName(String className, ClassLoader classLoader) {
        try {
            return (Configurator) classLoader.loadClass(className).getConstructor().newInstance();
        } catch (ReflectiveOperationException ex) {
            contextAware.addInfo("Instantiation failure: " + ex);
            return null;
        }
    }

    private Configurator.ExecutionStatus invokeConfigure(Configurator configurator) {
        long start = System.currentTimeMillis();
        try {
            contextAware.addInfo("Constructed configurator of type " + configurator.getClass());
            configurator.setContext(loggerContext);
            Configurator.ExecutionStatus status = configurator.configure(loggerContext);
            printDuration(start, configurator, status);
            return status;
        } catch (Exception ex) {
            String name = configurator == null ? "null" : configurator.getClass().getCanonicalName();
            throw new LogbackException(String.format("Failed to initialize or to run Configurator: %s", name), ex);
        }
    }

    private void printConfiguratorOrder(List<Configurator> configurators) {
        contextAware.addInfo("Here is a list of configurators discovered as a service, by rank: ");
        for (Configurator configurator : configurators) {
            contextAware.addInfo("  " + configurator.getClass().getName());
        }
        contextAware.addInfo("They will be invoked in order until ExecutionStatus.DO_NOT_INVOKE_NEXT_IF_ANY is returned.");
    }

    private void printDuration(long start, Configurator configurator, Configurator.ExecutionStatus status) {
        long duration = System.currentTimeMillis() - start;
        contextAware.addInfo(configurator.getClass().getName() + ".configure() call lasted " + duration
                + " milliseconds. ExecutionStatus=" + status);
    }

    private Configurator.ExecutionStatus attemptConfigurationUsingJoranUsingReflexion(ClassLoader classLoader) {
        try {
            Configurator configurator = (Configurator) classLoader
                    .loadClass("ch.qos.logback.classic.util.DefaultJoranConfigurator").newInstance();
            configurator.setContext(loggerContext);
            return configurator.configure(loggerContext);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            contextAware.addError("unexpected exception while instantiating DefaultJoranConfigurator", ex);
            return Configurator.ExecutionStatus.INVOKE_NEXT_IF_ANY;
        }
    }

    private int compareRankValue(int first, int second) {
        return first > second ? 1 : (first == second ? 0 : -1);
    }

    public void autoConfig() throws JoranException {
        autoConfig(Configurator.class.getClassLoader());
    }

    public void autoConfig(ClassLoader classLoader) throws JoranException {
        classLoader = Loader.systemClassloaderIfNull(classLoader);
        String version = EnvUtil.logbackVersion();
        if (version == null) version = "?";
        loggerContext.getStatusManager().add(new InfoStatus("This is logback-classic version " + version, this));
        StatusListenerConfigHelper.installIfAsked(loggerContext);

        List<Configurator> configurators = ClassicEnvUtil.loadFromServiceLoader(Configurator.class, classLoader);
        configurators.sort(rankComparator);
        if (configurators.isEmpty()) {
            contextAware.addInfo("No custom configurators were discovered as a service.");
        } else {
            printConfiguratorOrder(configurators);
        }
        for (Configurator configurator : configurators) {
            if (invokeConfigure(configurator) == Configurator.ExecutionStatus.DO_NOT_INVOKE_NEXT_IF_ANY) {
                return;
            }
        }
        for (String className : INTERNAL_CONFIGURATOR_CLASSNAME_LIST) {
            contextAware.addInfo("Trying to configure with " + className);
            Configurator configurator = instantiateConfiguratorByClassName(className, classLoader);
            if (configurator != null && invokeConfigure(configurator) == Configurator.ExecutionStatus.DO_NOT_INVOKE_NEXT_IF_ANY) {
                return;
            }
        }
    }
}
