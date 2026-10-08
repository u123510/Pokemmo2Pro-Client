package cn.pokemmo.config.codec;

import f.Aj;
import f.VL0;
import f.cn_0;
import f.le0_2;
import java.nio.ByteBuffer;
import java.util.function.ObjIntConsumer;
import java.util.function.ToIntFunction;

/**
 * 数值滑动条/微调框配置属性编解码器 (Slider Numeric Config Codec)
 * <p>
 * 绑定 TWL 的滑动条组件 ({@link VL0})，支持以 byte、short 或 int 读写数值。
 * <p>
 * 原始混淆类: {@code f.xt_2}
 */
public class SliderNumericConfigCodec implements ConfigPropertyCodec {
    public final int Yo0;
    public ObjIntConsumer<ByteBuffer> Vg0;
    public ToIntFunction<ByteBuffer> C;
    public final VL0 ls;
    public final cn_0 k5;

    public SliderNumericConfigCodec(int min, int max, int initialValue, boolean showPercentage, String title) {
        this.Vg0 = ByteBuffer::putInt;
        this.C = ByteBuffer::getInt;
        this.ls = new VL0(new Aj(min, max, initialValue), !showPercentage);
        this.ls.case$(initialValue);
        this.k5 = ConfigPropertyCodec.createTitleLabel(title);
        this.Yo0 = initialValue;
    }

    public static void writeShort(ByteBuffer byteBuffer, int i) {
        byteBuffer.putShort((short) i);
    }

    public static void writeByte(ByteBuffer byteBuffer, int i) {
        byteBuffer.put((byte) i);
    }

    public static void zx0(ByteBuffer byteBuffer, int i) {
        writeShort(byteBuffer, i);
    }

    public static void wp(ByteBuffer byteBuffer, int i) {
        writeByte(byteBuffer, i);
    }

    /** 切换为单字节 byte 读写模式 */
    public void setByteMode() {
        this.Vg0 = SliderNumericConfigCodec::writeByte;
        this.C = ByteBuffer::get;
    }

    public void Zj() {
        setByteMode();
    }

    /** 切换为短整型 short 读写模式 */
    public void setShortMode() {
        this.Vg0 = SliderNumericConfigCodec::writeShort;
        this.C = ByteBuffer::getShort;
    }

    public void cQ() {
        setShortMode();
    }

    public VL0 getSlider() {
        return this.ls;
    }

    public cn_0 getTitleLabel() {
        return this.k5;
    }

    @Override
    public void resetToDefault() {
        this.ls.case$(this.Yo0);
    }

    @Override
    public le0_2[] getWidgets() {
        return new le0_2[]{this.k5, this.ls};
    }

    @Override
    public boolean isModified() {
        return this.ls.eB0 != this.Yo0;
    }

    @Override
    public void writeToBuffer(ByteBuffer byteBuffer) {
        this.Vg0.accept(byteBuffer, this.ls.eB0);
    }

    @Override
    public void readFromBuffer(ByteBuffer byteBuffer) {
        this.ls.case$(this.C.applyAsInt(byteBuffer));
    }
}
