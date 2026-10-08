/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.net.ssl.SSLContextFactoryBean;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;

public class SSLConfiguration
extends SSLContextFactoryBean {
    private SSLParametersConfiguration parameters;

    public SSLParametersConfiguration getParameters() {
        if (this.parameters == null) {
            this.parameters = new SSLParametersConfiguration();
        }
        return this.parameters;
    }

    public void setParameters(SSLParametersConfiguration sSLParametersConfiguration) {
        this.parameters = sSLParametersConfiguration;
    }
}

