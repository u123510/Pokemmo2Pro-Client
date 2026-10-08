package cn.pokemmo.net;

import f.yo_1;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class ProxyAuthenticator extends Authenticator {
    @Override
    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("authuser", yo_1.RV.toCharArray());
    }
}
