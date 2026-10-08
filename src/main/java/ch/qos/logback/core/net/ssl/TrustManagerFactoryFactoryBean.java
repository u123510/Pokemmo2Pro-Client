package ch.qos.logback.core.net.ssl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.net.ssl.TrustManagerFactory;

public class TrustManagerFactoryFactoryBean {
    private String algorithm;
    private String provider;

    public TrustManagerFactory createTrustManagerFactory() throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.getProvider() != null ? TrustManagerFactory.getInstance(this.getAlgorithm(), this.getProvider()) : TrustManagerFactory.getInstance(this.getAlgorithm());
    }

    public String getAlgorithm() {
        return this.algorithm == null ? TrustManagerFactory.getDefaultAlgorithm() : this.algorithm;
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
