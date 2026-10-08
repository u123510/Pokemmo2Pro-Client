package cn.pokemmo.rom.nds.bw;

import cn.pokemmo.rom.nds.event.AbstractNdsMapZoneEvents;
import f.Ae;
import f.KO;
import f.aa0_0;
import f.bH0;
import f.ij_0;
import f.kk0_0;
import f.lj_0;
import f.nul__1;
import f.vi_1;
import java.nio.ByteBuffer;

/**
 * 黑白（BW）地图区域事件解包器
 */
public class BwMapZoneEvents extends AbstractNdsMapZoneEvents {
    public BwMapZoneEvents(Ae ae) {
        ByteBuffer byteBuffer = ae.j90();
        byte by = ae.zv0().Tz();
        if (byteBuffer.getInt() < 1) {
            return;
        }
        short s = byteBuffer.get();
        int n = byteBuffer.get();
        byte by2 = byteBuffer.get();
        short s2 = byteBuffer.get();
        this.pJ0 = new KO[s];
        for (short s3 = 0; s3 < s; s3 = (short) (s3 + 1)) {
            this.pJ0[s3] = new ij_0(by, ae.SL, s3, byteBuffer);
        }
        this.K1 = new kk0_0[n];
        for (s = 0; s < n; ++s) {
            this.K1[s] = new vi_1(by, byteBuffer, ae.SL);
        }
        this.Ct0 = new bH0[by2];
        for (s = 0; s < by2; s = (short) (s + 1)) {
            this.Ct0[s] = new lj_0(by, ae.SL, s, byteBuffer);
        }
        this.wn0 = new nul__1[s2];
        for (short s4 = 0; s4 < s2; s4 = (short) (s4 + 1)) {
            this.wn0[s4] = new aa0_0(byteBuffer);
        }
    }
}
