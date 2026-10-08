package cn.pokemmo.script.cutscene;

import f.ah0_1;
import f.be_1;
import f.wm_1;
import java.nio.ByteBuffer;

/**
 * 过场动画/脚本子数据表 (Cutscene Script Sub Table)
 * <p>
 * 原始混淆类: {@code f.UD}
 */
public class CutsceneScriptSubTable {
    public final int AV;
    public final short Jz0;
    public final be_1[][] Ba0;
    public final ah0_1 vD;

    public CutsceneScriptSubTable(ah0_1 context, int offset, short count) {
        this.vD = context;
        this.AV = offset;
        this.Jz0 = count;
        this.Ba0 = new be_1[count][];
    }

    public void MY() {
        wm_1 block = this.vD.KF;
        ByteBuffer buffer = block.G3.MH(block.Zx);
        ByteBuffer buffer2 = block.G3.MH(block.Zx);
        ByteBuffer buffer3 = block.G3.MH(block.Zx);
        buffer.position(this.AV - this.vD.KF.O7);
        for (int j = 0; j < this.Jz0; ++j) {
            int offset = buffer.getInt();
            int n = buffer.getInt();
            this.Ba0[j] = new be_1[n];
            buffer2.position(offset - this.vD.KF.O7);
            for (int k = 0; k < n; ++k) {
                int n2 = buffer2.getInt();
                int n3 = buffer2.getInt();
                this.Ba0[j][k] = new be_1(this.vD, n2, n3, buffer3);
            }
        }
    }
}
