package cn.pokemmo.rom.nds.model;

import f.*;
import cn.pokemmo.rom.nds.base.AbstractNdsRom;
import java.nio.ByteBuffer;

/**
 * NDS 地图场景动画与地块贴图提取抽象基类 (Abstract NDS Field Animation Extractor)
 * 
 * 职责:
 * 从 NDS ROM 中读取 /data/fldtanime.narc, 解析地貌动画帧序列并注册进动画池。
 * 
 * 原混淆类: f.Yw0
 */

import java.nio.ByteBuffer;

public abstract class AbstractNdsFieldAnimationExtractor {
    public final l50_0 UE0;
    public final es_1 BW;
    public final es_1 Vi0;
    public final nb_2 xr;

    public AbstractNdsFieldAnimationExtractor(l50_0 l500) {
        this.BW = new es_1();
        this.Vi0 = new es_1();
        this.xr = new nb_2();
        this.UE0 = l500;
        l500.Mr0();
    }

    public final void tA(es_1 es1, String str, String str2) {
        Er0 er0 = null;
        try {
            er0 = new Er0(((Ae) this.UE0.fd0.dg.get(str)).MH(false), false, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (er0 != null) {
            boolean active = er0.Zb0 != null ? er0.Zb0.lB : ((am_2) er0.Y3.get(0)).qn0;
            if (active) {
                es1.Ue0(new ik_0(str2, er0.E10, null, 0.25F));
            }
        }
    }

    public abstract wl0_1 jy(int i);

    public abstract ns0_0 wM(MG0 mg0, int i);

    public abstract void ri0();

    public final void Sa0() {
        Ae ae = (Ae) this.UE0.fd0.dg.get("/data/fldtanime.narc");
        FJ fj = new FJ(ae);
        ByteBuffer byteBuffer = fj.GJ(0).MH(false);
        int count = byteBuffer.getInt();
        for (int i = 0; i < count; i++) {
            byte[] bArr = new byte[16];
            byteBuffer.get(bArr);
            String name = new String(bArr).trim();
            es_1 list = new es_1();
            for (int j = 0; j < 18; j++) {
                byte b = byteBuffer.get();
                byte b2 = byteBuffer.get();
                if (b >= 0 && b2 > 0) {
                    for (byte k = 0; k < b2; k++) {
                        list.Ue0(Byte.valueOf(b));
                    }
                }
            }
            if (list.KB == 0) {
                list = null;
            }
            Er0 er0 = null;
            try {
                er0 = new Er0(fj.GJ(i + 1).MH(false), false, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.UE0.Tz() == 3 && name.contains("azt_wall02")) {
                name = "spacewall1";
            }
            if (er0 != null) {
                this.BW.Ue0(new ik_0(name.split("\\.")[0], er0.E10, list, 0.0333000012F));
            }
        }
    }
}
