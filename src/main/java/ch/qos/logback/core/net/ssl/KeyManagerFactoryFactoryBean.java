package ch.qos.logback.core.net.ssl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.net.ssl.KeyManagerFactory;

public class KeyManagerFactoryFactoryBean {
    private String algorithm;
    private String provider;

    public KeyManagerFactory createKeyManagerFactory() throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.getProvider() != null ? KeyManagerFactory.getInstance(this.getAlgorithm(), this.getProvider()) : KeyManagerFactory.getInstance(this.getAlgorithm());
    }

    public String getAlgorithm() {
        return this.algorithm == null ? KeyManagerFactory.getDefaultAlgorithm() : this.algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
