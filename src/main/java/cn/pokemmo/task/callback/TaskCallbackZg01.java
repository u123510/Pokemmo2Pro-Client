/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Bw0;
import f.Dn0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from f.zG0
 */
public class TaskCallbackZg01
implements Runnable  {
    public final /* synthetic */ Dn0 Kl0;

    public TaskCallbackZg01(Dn0 dn0) {
        this.Kl0 = dn0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        block6: {
            String string;
            String string2;
            block5: {
                try {
                    string2 = Bw0.lF0(this.Kl0.gd0("UTF-8"));
                    string = null;
                    Matcher matcher = Pattern.compile("([A-Za-z]+ frames: .*?)---------", 32).matcher(string2);
                    if (matcher.find()) {
                        string = matcher.group(1);
                    }
                    if (string != null) break block5;
                    string = "ERROR_EXTRACTING_STACKTRACE_FROM_HS_ERR";
                }
                catch (Exception exception) {
                    break block6;
                }
            }
            Bw0.Sx0(Bw0.ix0(string.trim(), string2), false);
        }
        this.Kl0.sf();
    }
}

