package cn.pokemmo.config.codec;

import f.KZ;
import f.Qy0;
import f.cg_0;
import f.cn_0;
import f.gj_2;
import f.le0_2;
import f.sm0_0;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * 具备前缀匹配/自动补全的文本搜索配置属性编解码器 (Filtered Text Config Codec)
 * <p>
 * 绑定 TWL 的文本输入框组件 ({@link cg_0})，并对候选项列表提供动态搜索补全。
 * <p>
 * 原始混淆类: {@code f.ji0_1}
 */
public class FilteredTextConfigCodec implements ConfigPropertyCodec {
    public final List ck0;
    public final int jj;
    public final Function vX;
    public final BiConsumer U70;
    public final Function qO;
    public final cg_0 Wp;
    public final cn_0 jL0;

    @SuppressWarnings("unchecked")
    public FilteredTextConfigCodec(String label, List items, int errorMsgId,
                                  Function nameExtractor,
                                  BiConsumer writer,
                                  Function reader) {
        this.ck0 = items;
        this.jj = errorMsgId;
        this.vX = nameExtractor;
        this.qO = reader;
        this.U70 = writer;
        cg_0 edit = new cg_0();
        this.Wp = edit;
        this.jL0 = ConfigPropertyCodec.createTitleLabel(label);
        edit.I7();
        edit.aO((str, len, kz) -> createAutoCompletion(items, nameExtractor, str, len, kz));
    }

    @SuppressWarnings("unchecked")
    public static KZ createAutoCompletion(List items, Function nameExtractor, String prefix, int len, KZ kz) {
        String[] arr = (String[]) items.stream()
                .map(nameExtractor)
                .filter(item -> matchesPrefix(prefix, (String) item))
                .toArray(String[]::new);
        return new gj_2(prefix.length(), true, arr);
    }

    public static KZ wc0(List items, Function nameExtractor, String prefix, int len, KZ kz) {
        return createAutoCompletion(items, nameExtractor, prefix, len, kz);
    }

    public static String[] DN(int size) {
        return new String[size];
    }

    public static boolean matchesPrefix(String prefix, String candidate) {
        return candidate.toLowerCase().startsWith(prefix.toLowerCase());
    }

    public static boolean HT(String prefix, String candidate) {
        return matchesPrefix(prefix, candidate);
    }

    public Object getSelectedItem() {
        return this.ck0.stream().filter(this::matchesSelected).findFirst().orElse(null);
    }

    public Object Vm0() {
        return getSelectedItem();
    }

    @Override
    public le0_2[] getWidgets() {
        return new le0_2[]{this.jL0, this.Wp};
    }

    @Override
    public boolean isValid() {
        if (this.Wp.dI0.toString().isEmpty()) {
            return true;
        }
        if (getSelectedItem() == null) {
            if (sm0_0.cU.l90(this.jj)) {
                Qy0.yI0.dk(-1, sm0_0.wa0(this.jj, this.Wp.dI0.toString()));
            }
            return false;
        }
        return true;
    }

    @Override
    public void resetToDefault() {
        this.Wp.Gv("");
    }

    @Override
    public boolean isModified() {
        return !this.Wp.dI0.toString().isEmpty();
    }

    @Override
    @SuppressWarnings("unchecked")
    public void writeToBuffer(ByteBuffer buffer) {
        this.U70.accept(buffer, getSelectedItem());
    }

    @Override
    @SuppressWarnings("unchecked")
    public void readFromBuffer(ByteBuffer buffer) {
        this.Wp.Gv((String) this.vX.apply(this.qO.apply(buffer)));
        this.Wp.aY.U4();
    }

    @SuppressWarnings("unchecked")
    public boolean matchesSelected(Object item) {
        return ((String) this.vX.apply(item)).equalsIgnoreCase(this.Wp.dI0.toString());
    }

    public boolean COM3(Object item) {
        return matchesSelected(item);
    }
}
