package cn.pokemmo.config.codec;

import f.A40;
import f.LPT6_;
import f.cn_0;
import f.fn_0;
import f.gn_0;
import f.le0_2;
import f.ng_2;
import f.qj_2;
import f.tk0_0;
import f.tw0_0;
import java.nio.ByteBuffer;

/**
 * 宝可梦标记位图配置属性编解码器 (Bitmask Marker Config Codec)
 * <p>
 * 绑定 5 个标记按钮（圆圈、三角形、正方形、爱心、星星），以 1 字节位图掩码保存标记组合。
 * <p>
 * 原始混淆类: {@code f.mx_0}
 */
public class BitmaskMarkerConfigCodec implements ConfigPropertyCodec {
    public byte A40;
    public final qj_2[] a8;
    public final cn_0 FG;
    public final tk0_0 ov;

    public BitmaskMarkerConfigCodec(String title) {
        this.a8 = new qj_2[5];
        this.FG = ConfigPropertyCodec.createTitleLabel(title);
        this.ov = new tk0_0();
        A40 container = this.ov.gg0;
        for (int i = 0; i < 5; i++) {
            int size = tw0_0.kz0() ? 32 : 16;
            this.a8[i] = new qj_2(size, size);
            this.a8[i].uf("mark-button");
            int finalI = i;
            this.a8[i].RR(() -> toggleBit(finalI));
            updateButtonAppearance(i);
            tw0_0.H30();
            container.vx0(this.a8[i]);
        }
    }

    @Override
    public void resetToDefault() {
        this.A40 = 0;
        for (int i = 0; i < 5; i++) {
            updateButtonAppearance(i);
        }
    }

    @Override
    public le0_2[] getWidgets() {
        return new le0_2[]{this.FG, this.ov};
    }

    @Override
    public boolean isModified() {
        return this.A40 != 0;
    }

    @Override
    public void writeToBuffer(ByteBuffer byteBuffer) {
        byteBuffer.put(this.A40);
    }

    @Override
    public void readFromBuffer(ByteBuffer byteBuffer) {
        this.A40 = byteBuffer.get();
        for (int i = 0; i < 5; i++) {
            updateButtonAppearance(i);
        }
    }

    public void updateButtonAppearance(int i) {
        gn_0 color = gn_0.DARKGRAY;
        boolean set = (this.A40 & (1 << i)) != 0;
        if (set) {
            color = ng_2.MS[i];
        }
        if (tw0_0.kz0() && i != 4) {
            color = gn_0.WHITE;
        }
        this.a8[i].tp0.r8(new LPT6_[]{fn_0.qz0().Ny0(i, tw0_0.kz0(), set)});
        this.a8[i].tp0.wx0(color);
    }

    public void implements$(int i) {
        updateButtonAppearance(i);
    }

    public void toggleBit(int i) {
        this.A40 = (byte) (this.A40 ^ (1 << i));
        updateButtonAppearance(i);
    }

    public void rw0(int i) {
        toggleBit(i);
    }
}
