/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.E90;
import f.GH;
import f.bi0_1;
import f.ec0_1;
import f.k20_0;
import f.q10_0;
import f.qe0_2;
import f.yb_1;
import f.yt_1;
import java.nio.ByteBuffer;

/*
 * Renamed from f.wm0
 */
public class ServerOpcode144Packet
extends GH {
    public CH0 ez = CH0.j1;
    public boolean pw0;
    public qe0_2 e40;
    public byte AA;

    public ServerOpcode144Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode144Packet wm0_02 = this;
        wm0_02.ez = wm0_02.pE();
        boolean bl = (wm0_02.Rj.get() & 0xFF) == 1;
        ServerOpcode144Packet wm0_03 = this;
        wm0_03.pw0 = bl;
        wm0_03.e40 = wm0_03.ki();
        wm0_03.AA = wm0_03.Rj.get();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void os0() {
        ServerOpcode144Packet wm0_02 = this;
        Object object = wm0_02.sr0().cJ0;
        Object object2 = wm0_02.ez;
        boolean bl = wm0_02.pw0;
        qe0_2 qe0_22 = wm0_02.e40;
        byte by = wm0_02.AA;
        if (((yt_1)object).jB0 != null && ((yt_1)object).dj0.equals(object2)) {
            ((yt_1)object).jB0.Vv = by;
            object2 = ((yt_1)object).jB0.J1;
            ((yt_1)object).jB0.J1.mh0 = by;
            (bl ? ((ec0_1)object2).vk0 : ((ec0_1)object2).rh).CoM4(qe0_22);
            ((yt_1)object).jB0.J1.getClass();
            ((yt_1)object).jB0.J1.wC0 = new yb_1[q10_0.Pn0.length];
        } else {
            object = (bi0_1)((yt_1)object).pn0.get(object2);
            if (object instanceof E90) {
                object = (E90)object;
                ((E90)object).Vv = by;
                object2 = ((E90)object).J1;
                ((E90)object).J1.mh0 = by;
                (bl ? ((ec0_1)object2).vk0 : ((ec0_1)object2).rh).CoM4(qe0_22);
                ((E90)object).J1.getClass();
                ((E90)object).J1.wC0 = new yb_1[q10_0.Pn0.length];
            }
        }
        if (this.sr0().k0.WN.equals(this.ez)) {
            this.sr0().k0.Gi0 = this.AA;
        }
    }
}

