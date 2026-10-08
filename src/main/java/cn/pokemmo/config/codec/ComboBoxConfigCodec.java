package cn.pokemmo.config.codec;

import f.X6;
import f.cn_0;
import f.eg_0;
import f.le0_2;
import f.pg0_2;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * 下拉选框配置属性编解码器 (ComboBox Config Codec)
 * <p>
 * 绑定 TWL 的下拉菜单组件 ({@link X6})，将选中项序列化为单字节索引或自定义格式。
 * <p>
 * 原始混淆类: {@code f.nd_0}
 */
public class ComboBoxConfigCodec implements ConfigPropertyCodec {
    public final BiConsumer Ny;
    public final Function El;
    public final X6 TI;
    public final cn_0 Qv0;

    @SuppressWarnings("unchecked")
    public ComboBoxConfigCodec(String labelStr, Object[] options, Function labelFunc, BiConsumer writeConsumer, Function readFunc) {
        eg_0[] items = Arrays.stream(options)
                .map(opt -> bt0(labelFunc, opt))
                .toArray(eg_0[]::new);
        pg0_2 model = new pg0_2(items);
        this.El = readFunc;
        this.Ny = writeConsumer;
        model.A3(new eg_0(null, "--"));
        this.TI = new X6(model);
        this.TI.Bd(0);
        this.Qv0 = ConfigPropertyCodec.createTitleLabel(labelStr);
    }

    public ComboBoxConfigCodec(String labelStr, Object... options) {
        this(labelStr, options, Object::toString, (buf, val) -> a80(options, (ByteBuffer) buf, val), buf -> qH0(options, (ByteBuffer) buf));
    }

    public static Object qH0(Object[] options, ByteBuffer buf) {
        return options[buf.get()];
    }

    public static void a80(Object[] options, ByteBuffer buf, Object val) {
        buf.put((byte) Arrays.asList(options).indexOf(val));
    }

    public static eg_0[] LS(int size) {
        return new eg_0[size];
    }

    @SuppressWarnings("unchecked")
    public static eg_0 bt0(Function func, Object obj) {
        return new eg_0(obj, (String) func.apply(obj));
    }

    public X6 getComboBox() {
        return this.TI;
    }

    public cn_0 getTitleLabel() {
        return this.Qv0;
    }

    @Override
    public void resetToDefault() {
        this.TI.Bd(0);
    }

    @Override
    public le0_2[] getWidgets() {
        return new le0_2[]{this.Qv0, this.TI};
    }

    @Override
    public boolean isModified() {
        return this.TI.mu0.Mw0 > 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void writeToBuffer(ByteBuffer buf) {
        this.Ny.accept(buf, ((eg_0) this.TI.Vh0()).q90);
    }

    @Override
    public void readFromBuffer(ByteBuffer buf) {
        Object val = this.El.apply(buf);
        for (int i = 0; i < this.TI.mu0.KB.ul0(); ++i) {
            if (val.equals(((eg_0) this.TI.mu0.KB.YS(i)).q90)) {
                this.TI.Bd(i);
                return;
            }
        }
    }
}
