package cn.pokemmo.rom.nds.model;

import f.Ae;
import f.FJ;
import f.km0;
import f.l50_0;
import java.nio.ByteBuffer;

/**
 * 跨世代 NDS 区域数据表 (NDS Area Data Table)
 * 
 * 职责:
 * 自动识别 DPPt (/a/0/1/3), HGSS (/fielddata/areadata/area_data.narc), 与 BW (/a/0/4/2)
 * 的卡带路径并批量加载 AreaData 条目。
 * 
 * 原混淆类: f.bz / bz_0
 */
public class NdsAreaDataTable {
    public km0[] UL0;

    public NdsAreaDataTable(l50_0 rom) {
        if (rom.Tz() == 2) {
            Ae ae = rom.nuL().COM7("/a/0/1/3");
            int count = ae.Vh0 / 10;
            this.UL0 = new km0[count];
            ByteBuffer byteBuffer = ae.j90();
            for (int j = 0; j < count; ++j) {
                this.UL0[j] = new km0(rom.Tz(), byteBuffer);
            }
            return;
        }
        if (rom.Tz() == 3) {
            FJ fJ = new FJ(rom.nuL().COM7("/fielddata/areadata/area_data.narc"));
            int count = fJ.size();
            this.UL0 = new km0[fJ.size()];
            for (int j = 0; j < count; ++j) {
                ByteBuffer byteBuffer = fJ.EG(j).j90();
                this.UL0[j] = new km0(rom.Tz(), byteBuffer);
            }
            return;
        }
        if (rom.Tz() == 4) {
            FJ fJ = new FJ(rom.nuL().COM7("/a/0/4/2"));
            int count = fJ.size();
            this.UL0 = new km0[fJ.size()];
            for (int j = 0; j < count; ++j) {
                ByteBuffer byteBuffer = fJ.EG(j).j90();
                this.UL0[j] = new km0(rom.Tz(), byteBuffer);
            }
        }
    }
}
