package ch.qos.logback.core.net.ssl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public class SecureRandomFactoryBean {
    private String algorithm;
    private String provider;

    public SecureRandom createSecureRandom() throws NoSuchAlgorithmException, NoSuchProviderException {
        try {
            if (this.getProvider() != null) {
                return SecureRandom.getInstance(this.getAlgorithm(), this.getProvider());
            } else {
                return SecureRandom.getInstance(this.getAlgorithm());
            }
        } catch (NoSuchAlgorithmException e) {
            throw new NoSuchAlgorithmException("no such secure random algorithm: " + this.getAlgorithm());
        } catch (NoSuchProviderException e) {
            throw new NoSuchProviderException("no such secure random provider: " + this.getProvider());
        }
    }

    public String getAlgorithm() {
        return this.algorithm == null ? "SHA1PRNG" : this.algorithm;
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
