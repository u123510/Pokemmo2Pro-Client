package cn.pokemmo.rom.nds.bw;

import f.*;
import java.nio.ByteBuffer;

public class BwBattleCutinLoader {
    public static final OJ0 t1;
    public static int yw0;
    public nj0_0 gV;
    public final Wr[] zX;
    public final Wr[] ui;

    public BwBattleCutinLoader() {
        this.zX = new Wr[6];
        this.ui = new Wr[6];
    }

    static {
        t1 = new OJ0();
        yw0 = 0;
    }

    public final void Sv(nj0_0 value) {
        this.gV = value;
        FJ archive = new FJ((Ae)value.fd0.dg.get("/a/1/3/1"));

        for (int index = 0; index < 6; index++) {
            int second = index * 2 + 6;
            this.zX[index] = new Wr(new ab_0(archive, index, second));
        }
        for (int index = 0; index < 6; index++) {
            int first = index + 18;
            int second = index * 2 + 24;
            this.ui[index] = new Wr(new to_1(archive, first, second));
        }
    }

    public final oq_0 dn(int index) {
        return new oq_0(this.gV, index);
    }

    public final Wr YX(int index) {
        if (index < 0 || index > this.zX.length) {
            index = 0;
        }
        return this.zX[index];
    }

    public final Wr I70(int index) {
        if (index < 0 || index > this.ui.length) {
            index = 0;
        }
        return this.ui[index];
    }

    public final ah0_1 n8(int index) {
        wm_1 resource = this.gV.z40.Wp0[203];
        if (yw0 == 0) {
            ByteBuffer buffer = resource.G3.MH(resource.Zx);
            while (buffer.remaining() > 16) {
                if (buffer.getInt() != -134236920) {
                    continue;
                }
                if (buffer.getInt() != 555024375) {
                    continue;
                }
                if (buffer.getInt() != 1208042305) {
                    continue;
                }
                if (buffer.getInt() != -1123526592) {
                    continue;
                }
                yw0 = buffer.getInt() - resource.O7;
                break;
            }
        }
        return new ah0_1(resource, index * 20 + yw0);
    }
}
