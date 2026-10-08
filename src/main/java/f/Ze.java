package f;

import cn.pokemmo.rom.nds.model.BwFieldMapModelExtractor;

/**
 * 兼容垫片 (Shim) - BwFieldMapModelExtractor
 * 职责: 黑白地区地图 3D 模型提取器
 * 原始混淆类: f.Ze
 * 现代实现: cn.pokemmo.rom.nds.model.BwFieldMapModelExtractor
 */
public final class Ze extends Yw0 {
    public final BwFieldMapModelExtractor modern;
    public final nb_2 yA0;

    public Ze(l50_0 l50_0Var) {
        super(l50_0Var);
        this.modern = new BwFieldMapModelExtractor(l50_0Var);
        this.yA0 = this.modern.yA0;
    }

    @Override
    public final ns0_0 wM(MG0 v1, int i2) {
        return this.modern.wM(v1, i2);
    }

    @Override
    public final wl0_1 jy(int i1) {
        return this.modern.jy(i1);
    }

    @Override
    public final void ri0() {
        this.modern.ri0();
    }
}
