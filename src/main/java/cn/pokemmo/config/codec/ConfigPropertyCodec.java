package cn.pokemmo.config.codec;

import f.cn_0;
import f.le0_2;
import java.nio.ByteBuffer;

/**
 * 客户端界面配置属性编解码接口 (Config Property Codec)
 * <p>
 * 将 UI 交互组件 (TWL Widget) 的当前状态与二进制缓冲区 ({@link ByteBuffer}) 进行双向序列化/反序列化。
 * <p>
 * 原始混淆类: {@code f.hd_0}
 */
public interface ConfigPropertyCodec {

    /**
     * 创建标准标题文本标签
     *
     * @param string 标签文本
     * @return 标签组件
     */
    static cn_0 createTitleLabel(String string) {
        cn_0 label = new cn_0(null, 0);
        label.Sk(string);
        label.uf("label-title-medium2");
        return label;
    }

    static cn_0 Ed(String string) {
        return createTitleLabel(string);
    }

    /** 校验输入是否有效 */
    default boolean isValid() {
        return true;
    }

    default boolean Bj0() {
        return isValid();
    }

    /** 重置为默认值 */
    void resetToDefault();

    default void bL() {
        resetToDefault();
    }

    /** 获取绑定的 TWL UI 控件列表 */
    le0_2[] getWidgets();

    default le0_2[] JH0() {
        return getWidgets();
    }

    /** 是否发生了修改 / 处于激活状态 */
    boolean isModified();

    default boolean vt() {
        return isModified();
    }

    /**
     * 将当前控件值序列化写入 ByteBuffer
     *
     * @param buffer 目标缓冲区
     */
    void writeToBuffer(ByteBuffer buffer);

    default void bh0(ByteBuffer buffer) {
        writeToBuffer(buffer);
    }

    /**
     * 从 ByteBuffer 反序列化读取并设置到控件
     *
     * @param buffer 数据缓冲区
     */
    void readFromBuffer(ByteBuffer buffer);

    default void Y5(ByteBuffer buffer) {
        readFromBuffer(buffer);
    }
}
