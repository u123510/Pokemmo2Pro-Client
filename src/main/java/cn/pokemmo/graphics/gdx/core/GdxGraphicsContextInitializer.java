/*
 * Reconstructed from bytecode (javap -c -p). CFR 0.152 failed: "Back jump on a try block".
 */
package cn.pokemmo.graphics.gdx.core;

import f.*;


public class GdxGraphicsContextInitializer {
    public static final nb_2 dt0 = new nb_2();

    public static void lR() {
        nb_2 nb_22 = dt0;
        if (nb_22.fl(lg_0.k)) {
            return;
        }
        String string;
        if (hb0_2.BN == hb0_2.cw) {
            string = "com.badlogic.gdx.controllers.android.AndroidControllers";
        } else {
            string = "com.badlogic.gdx.controllers.desktop.JamepadControllerManager";
        }
        Class<?> class_ = null;
        try {
            class_ = rd_1.oy0(string);
            try {
                nb_22.WK0(lg_0.k, (zu_0) class_.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                throw new ua_0("Could not instantiate instance of class: ".concat(class_.getName()), e);
            }
        } catch (Throwable throwable) {
            throw new nf_1("Error creating controller manager: ".concat(string), throwable);
        }
        lg_0.k.NH(new hn_2(lg_0.k));
        lg_0.k.k7("Controllers", new StringBuilder("added manager for application,").append(nb_22.Va0).append(" managers active").toString());
    }
}
