package cn.pokemmo.net;

import f.C60;
import java.io.IOException;
import java.net.HttpURLConnection;

public class HttpResponseWrapper {
    public final HttpURLConnection E2;
    public final C60 SU;

    public HttpResponseWrapper(HttpURLConnection var1) {
        this.E2 = var1;
        C60 var2;
        try {
            var2 = new C60(var1.getResponseCode());
        } catch (IOException var3) {
            var2 = new C60(-1);
        }
        this.SU = var2;
    }
}
