/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.net.ssl.KeyManagerFactoryFactoryBean;
import ch.qos.logback.core.net.ssl.KeyStoreFactoryBean;
import ch.qos.logback.core.net.ssl.SSLComponent;
import ch.qos.logback.core.net.ssl.SSLConfiguration;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import ch.qos.logback.core.net.ssl.SecureRandomFactoryBean;
import ch.qos.logback.core.net.ssl.TrustManagerFactoryFactoryBean;

public class SSLNestedComponentRegistryRules {
    public static void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultNestedComponentRegistry) {
        DefaultNestedComponentRegistry defaultNestedComponentRegistry2 = defaultNestedComponentRegistry;
        defaultNestedComponentRegistry2.add(SSLComponent.class, "ssl", SSLConfiguration.class);
        defaultNestedComponentRegistry2.add(SSLConfiguration.class, "parameters", SSLParametersConfiguration.class);
        defaultNestedComponentRegistry2.add(SSLConfiguration.class, "keyStore", KeyStoreFactoryBean.class);
        defaultNestedComponentRegistry2.add(SSLConfiguration.class, "trustStore", KeyStoreFactoryBean.class);
        defaultNestedComponentRegistry2.add(SSLConfiguration.class, "keyManagerFactory", KeyManagerFactoryFactoryBean.class);
        defaultNestedComponentRegistry2.add(SSLConfiguration.class, "trustManagerFactory", TrustManagerFactoryFactoryBean.class);
        defaultNestedComponentRegistry2.add(SSLConfiguration.class, "secureRandom", SecureRandomFactoryBean.class);
    }
}

