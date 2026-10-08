package f;

import cn.pokemmo.net.security.PacketHmacAuthenticator;


public class P40 extends PacketHmacAuthenticator {
    public P40(byte type, String value) {
        super(type, value);
    }
    public P40(byte type, String value, String extra) {
        super(type, value, extra);
    }
    public P40(byte type, byte[] digest) {
        super(type, digest);
    }
}
