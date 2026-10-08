package cn.pokemmo.rom.nds.dppt;

import cn.pokemmo.rom.nds.event.AbstractNdsMapZoneEvents;
import f.Ae;
import f.KO;
import f.XL0;
import f.bH0;
import f.eu_0;
import f.gk0_0;
import f.kk0_0;
import f.nul__1;
import f.pp_0;
import java.nio.ByteBuffer;

/**
 * 珍钻/白金/心金魂银（DPPT/HGSS）地图区域事件解包器
 */
public class DpptMapZoneEvents extends AbstractNdsMapZoneEvents {
    public DpptMapZoneEvents(Ae ae) {
        ByteBuffer byteBuffer = ae.j90();
        short s = ae.zv0().Tz();
        int n2 = byteBuffer.getInt();
        this.pJ0 = new KO[n2];
        for (int n = 0; n < n2; n = (short) (n + 1)) {
            this.pJ0[n] = new XL0((byte) s, ae.SL, (short) n, byteBuffer);
        }
        n2 = byteBuffer.getInt();
        this.K1 = new kk0_0[n2];
        for (int n = 0; n < n2; ++n) {
            this.K1[n] = new pp_0((byte) s, byteBuffer, ae.SL);
        }
        n2 = byteBuffer.getInt();
        this.Ct0 = new bH0[n2];
        for (int n = 0; n < n2; n = (short) (n + 1)) {
            this.Ct0[n] = new gk0_0((byte) s, ae.SL, (short) n, byteBuffer);
        }
        int n3 = byteBuffer.getInt();
        this.wn0 = new nul__1[n3];
        for (s = 0; s < n3; s = (short) (s + 1)) {
            this.wn0[s] = new eu_0(byteBuffer);
        }
    }
}
