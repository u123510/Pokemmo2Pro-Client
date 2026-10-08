package cn.pokemmo.rom.nds.model;

import f.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * 黑白 (BW) 地图 3D 模型与场景地貌提取器 (Black & White Field Map Model Extractor)
 * 
 * 职责:
 * 实现 AbstractNdsFieldAnimationExtractor, 专门从合众地区 (Gen 5 BW) ROM 的 /a/2/3/0 中解包 3D 建筑地貌与模型。
 * 
 * 原混淆类: f.Ze
 */

public class BwFieldMapModelExtractor extends AbstractNdsFieldAnimationExtractor {
    public final nb_2 yA0;

    static {
        Cq0.E1(Ze.class);
    }

    public BwFieldMapModelExtractor(l50_0 l50_0Var) {
        super(l50_0Var);
        this.yA0 = new nb_2();
    }

    @Override
    public final ns0_0 wM(MG0 v1, int i2) {
        int key = v1.hX * 1000 + i2;
        int i6 = this.yA0.Va(Integer.valueOf(key));
        ns0_0 ns0_0Var = i6 >= 0 ? (ns0_0) this.yA0.Pr[i6] : null;
        if (ns0_0Var != null) {
            return ns0_0Var;
        }
        String path = ka0_2.dZ[v1.hX] == 2 ? "/a/2/3/0" : "/a/2/2/9";
        Ae ae = (Ae) this.UE0.fd0.dg.get(path);
        Qd0.cV();
        String unused = ae.kd;
        l50_0 h2 = ae.h2;
        ByteBuffer byteBuffer = h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int magic = pf_0.LPt2(byteBuffer, ae.bM0);
        if (magic != 1129464142) {
            throw new RuntimeException(ac0_0.YH0("Header magic mismatch = ", magic, " vs expected ", 1129464142));
        }
        int tableOffset = ax0_0.vU(byteBuffer);
        int entryCount = byteBuffer.getInt();
        int dataOffset = byteBuffer.position() + iy_1.WG0(entryCount, 8, byteBuffer.position(), byteBuffer);
        int indexOffset = i2 * 8;
        int entryOffset = byteBuffer.getInt(tableOffset + 12 + indexOffset);
        int entryEnd = GA.m1(tableOffset, 16, indexOffset, byteBuffer);
        int length = entryEnd - entryOffset;
        if (i2 < 400) {
            String unused2 = un0_0.DB0[i2];
        } else {
            Integer.toString(i2);
        }
        ByteBuffer slice = h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        slice.position(dataOffset + entryOffset);
        if (length > 0) {
            AT.i20(dataOffset + entryOffset, length, slice.limit(), slice);
        }
        ns0_0 res = new ns0_0(an_0.Y3(slice.slice().order(ByteOrder.LITTLE_ENDIAN)));
        this.yA0.WK0(Integer.valueOf(key), res);
        return res;
    }

    @Override
    public final wl0_1 jy(int i1) {
        wl0_1 wl0_1Var = (wl0_1) this.xr.Wk0(Integer.valueOf(i1));
        if (wl0_1Var == null || wl0_1Var.t50.Lpt1) {
            wl0_1Var = new wl0_1(this.UE0.EL0(MG0.lpt6, i1), new pc_1());
            this.xr.WK0(Integer.valueOf(i1), wl0_1Var);
        }
        return wl0_1Var;
    }

    @Override
    public final void ri0() {
        be_2 it = this.xr.Ww0();
        it.getClass();
        while (it.hasNext()) {
            ((wl0_1) it.next()).t50.dispose();
        }
        this.xr.b20();
    }
}
