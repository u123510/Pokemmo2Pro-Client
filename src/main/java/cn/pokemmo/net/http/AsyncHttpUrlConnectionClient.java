package cn.pokemmo.net.http;

import f.*;

import java.awt.Desktop;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Map;

public class AsyncHttpUrlConnectionClient {
    public final Z40 v8;

    public AsyncHttpUrlConnectionClient(DZ v1) {
        this.v8 = new Z40(v1.cs0);
    }

    public final void Ls0(T00 v1, rw0 v2) {
        Z40 z40 = this.v8;
        z40.getClass();
        String prefix = "?";
        if (v1.UA0 == null) {
            new nf_1("can't process a HTTP request without URL set");
            v2.hJ();
            return;
        }
        try {
            String method = v1.As;
            boolean doInput = !method.equalsIgnoreCase("HEAD");
            boolean doOutput = method.equalsIgnoreCase("POST") || method.equalsIgnoreCase("PUT") || method.equalsIgnoreCase("PATCH");
            URL url;
            if (!method.equalsIgnoreCase("GET") && !method.equalsIgnoreCase("HEAD")) {
                url = new URL(v1.UA0);
            } else {
                String paramStr = "";
                String wr0 = v1.Wr0;
                if (wr0 != null && !"".equals(wr0)) {
                    paramStr = prefix.concat(wr0);
                }
                url = new URL(v1.UA0 + paramStr);
            }
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(doOutput);
            conn.setDoInput(doInput);
            conn.setRequestMethod(method);
            HttpURLConnection.setFollowRedirects(v1.Fv0);
            synchronized (this.v8) {
                this.v8.Be0.WK0(v1, conn);
                this.v8.Gl.WK0(v1, v2);
            }
            for (Object obj : v1.Sc0.entrySet()) {
                Map.Entry<?, ?> entry = (Map.Entry<?, ?>) obj;
                conn.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            conn.setConnectTimeout(v1.KE);
            conn.setReadTimeout(v1.KE);
            this.v8.mA.WK0(v1, this.v8.Ip.submit(new ja_2(this.v8, doOutput, v1, conn, v2)));
        } catch (Exception e) {
            try {
                v2.hJ();
            } finally {
                this.v8.PQ(v1);
            }
        }
    }

    public final boolean Lf(String urlStr) {
        if (ea0_1.NL) {
            try {
                new ProcessBuilder("open", new URI(urlStr).toString()).start();
                return true;
            } catch (Throwable t) {
                return false;
            }
        }
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(urlStr));
                return true;
            } catch (Throwable t) {
                return false;
            }
        }
        if (ea0_1.rv0) {
            try {
                new ProcessBuilder("xdg-open", new URI(urlStr).toString()).start();
                return true;
            } catch (Throwable t) {
                return false;
            }
        }
        return false;
    }
}
