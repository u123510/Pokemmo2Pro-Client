package cn.pokemmo.graphics.render;

import f.*;

import java.io.File;
import java.net.Authenticator;

public class FrameBufferRenderContext extends tk_2 {
    public static final dl_1 mw = Cq0.E1(d8_0.class);
    public boolean e20 = false;

    public FrameBufferRenderContext() {
        this.e20 = false;
    }

    public final void qI0(boolean repair, String... v2) {
        if (!yy0()) {
            return;
        }
        if (!tk_2.j9()) {
            return;
        }
        synchronized (this) {
            if (this.e20) {
                return;
            }
            this.e20 = true;
        }
        boolean found = false;
        String errorMsg = "";
        File updaterFile = new File("pokemmo_updater.jar");
        if (updaterFile.isFile() && updaterFile.exists()) {
            if (yo_1.ym.equalsIgnoreCase(tx_1.w10("pokemmo_updater.jar"))) {
                mw.info("Using already existing pokemmo_updater.jar");
                found = true;
            } else {
                updaterFile.delete();
            }
        }
        if (!found) {
            if (!yo_1.RV.isEmpty()) {
                Authenticator.setDefault(new sg0_1());
            }
            String[] mirrors = yo_1.kz;
            int len = mirrors.length;
            for (int i = 0; i < len; ++i) {
                String mirror = mirrors[i];
                if (!tx_1.Zk0(mirror + "?r=" + yo_1.IB0)) {
                    errorMsg = "Failed to download file pokemmo_updater.jar.TEMPORARY";
                } else {
                    mw.info("Downloaded new pokemmo_updater.jar.TEMPORARY");
                    File tempFile = new File("pokemmo_updater.jar.TEMPORARY");
                    String actualHash = tx_1.w10("pokemmo_updater.jar.TEMPORARY");
                    if (!yo_1.ym.equalsIgnoreCase(actualHash)) {
                        errorMsg = "Newly downloaded pokemmo_updater.jar.TEMPORARY failed SHA256 check.\nExcepted hash: " + yo_1.ym + "\nActual hash: " + actualHash;
                        if (tempFile.isFile() && tempFile.exists()) {
                            tempFile.delete();
                        }
                    } else if (tempFile.renameTo(updaterFile)) {
                        found = true;
                        break;
                    } else {
                        errorMsg = "Unable to rename " + tempFile.getPath() + " to " + updaterFile.getPath();
                    }
                }
            }
        }
        if (!found) {
            if (errorMsg.isEmpty()) {
                errorMsg = "Unknown Error";
            }
            tk_2.fc0(errorMsg, new RuntimeException());
            return;
        }
        String javaBin = System.getProperty("java.home") + "/bin/java";
        es_1 cmdList = new es_1(String.class);
        cmdList.Ue0(javaBin);
        cmdList.Ue0("-jar");
        cmdList.Ue0("pokemmo_updater.jar");
        if (!yo_1.ih.isBlank()) {
            cmdList.Ue0("-updater_feeds:" + yo_1.ih);
        }
        if (!yo_1.yw0.isBlank()) {
            cmdList.Ue0("-updater_sigs:" + yo_1.yw0);
        }
        if (!yo_1.RV.isBlank()) {
            cmdList.Ue0("-auth_password:" + yo_1.RV);
        }
        if (repair) {
            cmdList.Ue0("-repair:true");
        }
        for (int i = 0; i < v2.length; ++i) {
            cmdList.Ue0("-optional:" + v2[i]);
        }
        try {
            Runtime.getRuntime().exec((String[]) cmdList.toArray());
            lg_0.k.bE();
        } catch (Exception e) {
            tk_2.fc0("Unable to start updater process.", e);
            mw.error("Unable to start updater process.", e);
        }
    }

    public final boolean yy0() {
        tw0_0.lM.getClass();
        return NR.dy0 == com5__4.a7;
    }
}
