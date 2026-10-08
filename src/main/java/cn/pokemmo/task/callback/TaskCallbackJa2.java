/*
 * Reconstructed from bytecode (javap -c -p). CFR 0.152 failed: "Back jump on a try block".
 */
package cn.pokemmo.task.callback;

import f.*;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;

public class TaskCallbackJa2 implements Runnable  {
    public final boolean fU;
    public final T00 Ot0;
    public final HttpURLConnection oq0;
    public final rw0 K8;
    public final Z40 E20;

    public TaskCallbackJa2(Z40 z40, boolean bl, T00 t00, HttpURLConnection httpURLConnection, rw0 rw02) {
        this.E20 = z40;
        this.fU = bl;
        this.Ot0 = t00;
        this.oq0 = httpURLConnection;
        this.K8 = rw02;
    }

    @Override
    public void run() {
        try {
            if (this.fU) {
                String s = this.Ot0.Wr0;
                if (s != null) {
                    OutputStreamWriter writer = new OutputStreamWriter(this.oq0.getOutputStream(), "UTF8");
                    try {
                        writer.write(s);
                    }
                    finally {
                        KT.E1(writer);
                    }
                }
            }
            this.oq0.connect();
            ce0_2 ce0_22 = new ce0_2(this.oq0);
            Z40 z40 = this.E20;
            T00 t00 = this.Ot0;
            rw0 rw0_;
            synchronized (z40) {
                rw0_ = (rw0)z40.Gl.Wk0(t00);
            }
            if (rw0_ != null) {
                rw0_.lv0(ce0_22);
            }
            this.E20.PQ(this.Ot0);
            this.oq0.disconnect();
        }
        catch (Exception exception) {
            this.oq0.disconnect();
            this.K8.hJ();
            this.E20.PQ(this.Ot0);
        }
    }
}
