package cn.pokemmo.ui.dialog.bubble;

import f.CH0;
import f.jm_1;
import f.tw0_0;
import f.zk0_1;

/**
 * 固定在指定坐标的 NPC 提示/交互气泡 (Fixed Position Message Box Bubble)
 * 用于地图特定点位或坐标系提示气泡展示。
 *
 * 原混淆类: f.og0_1
 */
public class FixedPositionMessageBoxBubble extends MessageBoxBubble {
    public final short L90;
    public final short mK0;

    public FixedPositionMessageBoxBubble(String title, short x, short y) {
        super((byte) 0, CH0.j1, jm_1.ga0, title,
                new short[0], new short[0], (byte) 0, (byte) 0,
                (byte) 0, 0L, new String[0]);
        this.L90 = x;
        this.mK0 = y;
    }

    @Override
    public void C(zk0_1 value) {
    }

    @Override
    public void m80(byte value) {
    }

    @Override
    public void jJ0() {
        this.uy0(-1);
    }

    @Override
    public void HP(zk0_1 value) {
        int x = (int) (((this.L90 + 1) / 32.0f) * tw0_0.LD0.ew0());
        int y = (int) (((this.mK0 + 1) / 24.0f) * tw0_0.LD0.Hv0()) - this.GF.OB;
        this.pa0 = x;
        this.Zx0 = y;
        if (!tw0_0.kz0()) {
            int left = this.SW.hr0() + this.GF.e80 + this.GF.NV;
            int top = this.SW.Ob() + this.GF.y9 + this.GF.Cz;
            this.GF.oY(left, top);
        }
        super.HP(value);
    }
}
