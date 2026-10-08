package ch.qos.logback.classic.model.processor;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.boolex.JaninoEventEvaluator;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.filter.EvaluatorFilter;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.joran.util.ParentTag_Tag_Class_Tuple;
import ch.qos.logback.core.net.ssl.KeyManagerFactoryFactoryBean;
import ch.qos.logback.core.net.ssl.KeyStoreFactoryBean;
import ch.qos.logback.core.net.ssl.SSLConfiguration;
import ch.qos.logback.core.net.ssl.SSLNestedComponentRegistryRules;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import ch.qos.logback.core.net.ssl.SecureRandomFactoryBean;
import ch.qos.logback.core.net.ssl.TrustManagerFactoryFactoryBean;
import java.util.ArrayList;
import java.util.List;

public class LogbackClassicDefaultNestedComponentRules {
    public static List<ParentTag_Tag_Class_Tuple> TUPLES_LIST = createTuplesList();

    public static void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry registry) {
        registry.add(AppenderBase.class, "layout", PatternLayout.class);
        registry.add(UnsynchronizedAppenderBase.class, "layout", PatternLayout.class);
        registry.add(AppenderBase.class, "encoder", PatternLayoutEncoder.class);
        registry.add(UnsynchronizedAppenderBase.class, "encoder", PatternLayoutEncoder.class);
        registry.add(EvaluatorFilter.class, "evaluator", JaninoEventEvaluator.class);
        SSLNestedComponentRegistryRules.addDefaultNestedComponentRegistryRules(registry);
    }

    public static List<ParentTag_Tag_Class_Tuple> createTuplesList() {
        ArrayList<ParentTag_Tag_Class_Tuple> list = new ArrayList<>();
        list.add(new ParentTag_Tag_Class_Tuple("appender", "encoder", PatternLayoutEncoder.class.getName()));
        list.add(new ParentTag_Tag_Class_Tuple("appender", "layout", PatternLayout.class.getName()));
        list.add(new ParentTag_Tag_Class_Tuple("receiver", "ssl", SSLConfiguration.class.getName()));
        list.add(new ParentTag_Tag_Class_Tuple("ssl", "parameters", SSLParametersConfiguration.class.getName()));
        list.add(new ParentTag_Tag_Class_Tuple("ssl", "keyStore", KeyStoreFactoryBean.class.getName()));
        list.add(new ParentTag_Tag_Class_Tuple("ssl", "trustStore", KeyManagerFactoryFactoryBean.class.getName()));
        list.add(new ParentTag_Tag_Class_Tuple("ssl", "keyManagerFactory", SSLParametersConfiguration.class.getName()));
        list.add(new ParentTag_Tag_Class_Tuple("ssl", "trustManagerFactory", TrustManagerFactoryFactoryBean.class.getName()));
        list.add(new ParentTag_Tag_Class_Tuple("ssl", "secureRandom", SecureRandomFactoryBean.class.getName()));
        return list;
    }
}
