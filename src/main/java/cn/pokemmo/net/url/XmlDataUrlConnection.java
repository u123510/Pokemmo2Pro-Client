package cn.pokemmo.net.url;

import f.Dn0;
import f.jn_0;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class XmlDataUrlConnection extends URLConnection {
    public final Dn0 gl;

    public XmlDataUrlConnection(URL v1, Dn0 v2) {
        super(v1);
        this.gl = v2;
    }

    @Override
    public void connect() {
    }

    @Override
    public Object getContent() {
        return this.gl;
    }

    @Override
    public InputStream getInputStream() {
        if (!this.gl.BN().equals("xml")) {
            jn_0.gy0.error("Unable to load {}", this.gl.el());
            return null;
        }
        return this.gl.LpT7(1024);
    }
}
