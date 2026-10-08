package ch.qos.logback.core.net;

import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;

public class LoginAuthenticator extends Authenticator {
    String username;
    String password;

    public LoginAuthenticator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.username, this.password);
    }
}
