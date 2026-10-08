package cn.pokemmo.config.codec;

import f.W9;
import f.cn_0;
import f.le0_2;
import java.nio.ByteBuffer;

/**
 * 布尔开关配置属性编解码器 (Boolean Config Codec)
 * <p>
 * 绑定 TWL 的复选框组件 ({@link W9})，将布尔状态序列化为单字节 (0 或 1)。
 * <p>
 * 原始混淆类: {@code f.AB0}
 */
public class BooleanConfigCodec implements ConfigPropertyCodec {
    public final W9 pd0;
    public final cn_0 Xi0;

    public BooleanConfigCodec(String labelText) {
        W9 cb = new W9();
        this.pd0 = cb;
        this.Xi0 = ConfigPropertyCodec.createTitleLabel(labelText);
        cb.k50(false);
    }

    public W9 getCheckbox() {
        return this.pd0;
    }

    public cn_0 getTitleLabel() {
        return this.Xi0;
    }

    @Override
    public void resetToDefault() {
        this.pd0.ER.lK0(false);
    }

    @Override
    public le0_2[] getWidgets() {
        return new le0_2[]{this.Xi0, this.pd0};
    }

    @Override
    public boolean isModified() {
        return this.pd0.ER.U20();
    }

    @Override
    public void writeToBuffer(ByteBuffer buffer) {
        buffer.put((byte) (this.pd0.ER.U20() ? 1 : 0));
    }

    @Override
    public void readFromBuffer(ByteBuffer buffer) {
        this.pd0.ER.lK0(buffer.get() == 1);
    }
}
