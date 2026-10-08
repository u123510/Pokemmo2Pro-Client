package cn.pokemmo.rom.nds.model;

import f.*;
import cn.pokemmo.rom.nds.dppt.PlatinumRom;
import java.nio.ByteBuffer;

/**
 * NDS 建筑 3D 模型与动画加载器 (NDS Building Model Loader)
 * 
 * 职责:
 * 从白金 (DPPt) 与心金魂银 (HGSS) NARC 归档中构建 3D 建筑模型 (ku_0) 与动态动画 (iy_0)。
 * 
 * 原混淆类: f.kx_1
 */

import java.nio.ByteBuffer;

public class NdsBuildingModelLoader {
    public static final dl_1 LOGGER = Cq0.E1(NdsBuildingModelLoader.class);
    public static final dl_1 try$ = LOGGER;
    public final l50_0 tC0;
    public final FJ DL;
    public final FJ r20;
    public final FJ oq;

    public NdsBuildingModelLoader(PlatinumRom ts) {
        super();
        ts.getClass();
        this.tC0 = ts;
        this.DL = new FJ(ts.nuL().COM7("/fielddata/build_model/build_model.narc"));
        this.r20 = new FJ(ts.nuL().COM7("/arc/bm_anime_list.narc"));
        this.oq = new FJ(ts.nuL().COM7("/arc/bm_anime.narc"));
    }

    public NdsBuildingModelLoader(l50_0 l50_0Var, MG0 mg0) {
        super();
        this.tC0 = l50_0Var;
        String str;
        if (mg0 == MG0.rm) {
            str = "/a/0/4/0";
        } else {
            str = "/a/1/4/8";
        }
        this.DL = new FJ(l50_0Var.nuL().COM7(str));
        String str2;
        if (mg0 == MG0.rm) {
            str2 = "/a/1/0/7";
        } else {
            str2 = "/a/1/0/8";
        }
        this.r20 = new FJ(l50_0Var.nuL().COM7(str2));
        this.oq = new FJ(l50_0Var.nuL().COM7("/a/1/0/6"));
    }

    public final ku_0 Vk0(int i) {
        try {
            return ku_0.zn(this.DL.GJ(i).MH(false));
        } catch (Exception e) {
            try$.error("failed to load building_id = {}", Integer.valueOf(i), e);
            return null;
        }
    }

    public final iy_0 YW(int i) {
        iy_0 iy_0Var = new iy_0(this.tC0);
        if (this.r20 != null && this.oq != null) {
            ByteBuffer buffer = this.r20.GJ(i).MH(false);
            FJ fj = this.oq;
            iy_0Var.aM0 = buffer.get() == 1;
            iy_0Var.YD0 = buffer.get();
            buffer.getShort();
            if (iy_0Var.oD0.Tz() == 4) {
                iy_0Var.lPt2 = buffer.get();
                buffer.get();
                buffer.get();
                buffer.get();
            }
            for (int j = 0; j < 4; j++) {
                int animId = buffer.getInt();
                if (animId != -1) {
                    aux__0 ey0 = aux__0.ey0(fj.GJ(animId).MH(false));
                    if (ey0 != null) {
                        iy_0Var.Pv.Ue0(ey0);
                    }
                }
            }
            return iy_0Var;
        }
        return iy_0Var;
    }
}
