package f;

import cn.pokemmo.rom.nds.dppt.PlatinumRom;
import cn.pokemmo.rom.nds.model.NdsBuildingModelLoader;

/**
 * 兼容垫片 (Shim) - NdsBuildingModelLoader
 * 职责: NDS 建筑 3D 模型与动画加载器
 * 原始混淆类: f.kx_1
 * 现代实现: cn.pokemmo.rom.nds.model.NdsBuildingModelLoader
 */
public final class kx_1 extends NdsBuildingModelLoader {
    public kx_1(PlatinumRom ts) {
        super(ts);
    }

    public kx_1(l50_0 l50_0Var, MG0 mg0) {
        super(l50_0Var, mg0);
    }
}
