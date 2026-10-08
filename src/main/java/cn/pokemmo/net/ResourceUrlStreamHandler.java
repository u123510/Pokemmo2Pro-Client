package cn.pokemmo.net;

import f.Dn0;
import f.kn0_0;
import f.tx_1;
import java.io.File;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public class ResourceUrlStreamHandler extends URLStreamHandler {
    public final Dn0 jv;

    public ResourceUrlStreamHandler(Dn0 v1) {
        super();
        this.jv = v1;
    }

    @Override
    public URLConnection openConnection(URL v1) {
        String str = tx_1.O7(v1.getPath());
        Dn0 dn = this.jv.wp(new File("/", str).getPath().substring(1));
        return new kn0_0(v1, dn);
    }
}
