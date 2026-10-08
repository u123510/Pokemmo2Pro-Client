package cn.pokemmo.audio;

import f.*;

/**
 * 音频声道与音量配置枚举/通道类 (Audio Channel Profile)
 * 管理主音量、BGM背景音乐、SFX音效、宝可梦叫声 (Cry) 的声道及音量计算。
 *
 * 原混淆类: f.ff0_0
 */
public class AudioChannel {
    public static final ff0_0 Pd;
    public static final ff0_0 TJ0;
    public static final ff0_0 h30;
    public static final ff0_0 Gz0;
    public static final ff0_0[] wa;
    public static final ff0_0[] Xf0;
    public float iY;
    public final int Np;

    public AudioChannel(int var1) {
        this.Np = var1;
        this.iY = Float.NaN;
    }

    static {
        ff0_0 var0 = new ff0_0(0);
        Pd = var0;
        ff0_0 var1 = new ff0_0(1);
        TJ0 = var1;
        ff0_0 var2 = new ff0_0(2);
        h30 = var2;
        ff0_0 var3 = new ff0_0(3);
        Gz0 = var3;
        ff0_0[] var4 = new ff0_0[]{var0, var1, var2, var3};
        Xf0 = var4;
        wa = (ff0_0[])var4.clone();
    }

    public final float wg() {
        float var1 = 0.0F;
        if (!Float.isNaN(this.iY)) {
            var1 = this.iY;
        } else {
            switch (this.Np) {
                case 0:
                    var1 = (float) dw_2.ku0 / 100.0F;
                    break;
                case 1:
                case 3:
                    var1 = (float) dw_2.sR / 100.0F;
                    break;
                case 2:
                    var1 = (float) dw_2.Yn / 100.0F;
                    break;
                default:
                    break;
            }
        }
        return var1 * var1;
    }
}
