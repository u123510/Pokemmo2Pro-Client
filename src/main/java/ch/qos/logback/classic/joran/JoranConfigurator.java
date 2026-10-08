package ch.qos.logback.classic.joran;

import ch.qos.logback.classic.joran.action.*;
import ch.qos.logback.classic.joran.sanity.IfNestedWithinSecondPhaseElementSC;
import ch.qos.logback.classic.model.processor.ConfigurationModelHandlerFull;
import ch.qos.logback.classic.model.processor.LogbackClassicDefaultNestedComponentRules;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.JoranConfiguratorBase;
import ch.qos.logback.core.joran.action.*;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.joran.spi.ElementSelector;
import ch.qos.logback.core.joran.spi.RuleStore;
import ch.qos.logback.core.model.processor.DefaultProcessor;

public class JoranConfigurator extends JoranConfiguratorBase {
    private JoranConfigurator makeAnotherInstance() {
        JoranConfigurator configurator = new JoranConfigurator();
        configurator.setContext(context);
        return configurator;
    }

    @Override
    public void addElementSelectorAndActionAssociations(RuleStore ruleStore) {
        super.addElementSelectorAndActionAssociations(ruleStore);
        ElementSelector selector = new ElementSelector("configuration");
        ruleStore.addRule(selector, ConfigurationAction::new);
        selector = new ElementSelector("configuration/contextName");
        ruleStore.addRule(selector, ContextNameAction::new);
        selector = new ElementSelector("configuration/contextListener");
        ruleStore.addRule(selector, LoggerContextListenerAction::new);
        selector = new ElementSelector("configuration/insertFromJNDI");
        ruleStore.addRule(selector, InsertFromJNDIAction::new);
        selector = new ElementSelector("configuration/logger");
        ruleStore.addRule(selector, LoggerAction::new);
        selector = new ElementSelector("configuration/logger/level");
        ruleStore.addRule(selector, LevelAction::new);
        selector = new ElementSelector("configuration/root");
        ruleStore.addRule(selector, RootLoggerAction::new);
        selector = new ElementSelector("configuration/root/level");
        ruleStore.addRule(selector, LevelAction::new);
        selector = new ElementSelector("configuration/logger/appender-ref");
        ruleStore.addRule(selector, AppenderRefAction::new);
        selector = new ElementSelector("configuration/root/appender-ref");
        ruleStore.addRule(selector, AppenderRefAction::new);
        selector = new ElementSelector("configuration/include");
        ruleStore.addRule(selector, IncludeAction::new);
        selector = new ElementSelector("configuration/consolePlugin");
        ruleStore.addRule(selector, ConsolePluginAction::new);
        selector = new ElementSelector("configuration/receiver");
        ruleStore.addRule(selector, ReceiverAction::new);
    }

    @Override
    public void sanityCheck(ch.qos.logback.core.model.Model model) {
        super.sanityCheck(model);
        performCheck(new IfNestedWithinSecondPhaseElementSC(), model);
    }

    @Override
    public void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry registry) {
        LogbackClassicDefaultNestedComponentRules.addDefaultNestedComponentRegistryRules(registry);
    }

    @Override
    public void buildModelInterpretationContext() {
        super.buildModelInterpretationContext();
        modelInterpretationContext.setConfiguratorSupplier(this::makeAnotherInstance);
    }

    @Override
    public void addModelHandlerAssociations(DefaultProcessor processor) {
        ModelClassToModelHandlerLinker linker = new ModelClassToModelHandlerLinker(context);
        linker.setConfigurationModelHandlerFactoryMethod(ConfigurationModelHandlerFull::makeInstance2);
        linker.link(processor);
    }
}
