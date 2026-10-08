package f;

import cn.pokemmo.ui.widget.model.IntegerRangePropertyModel;

/**
 * 兼容垫片 (Shim) - 整数范围属性模型接口
 * 核心定义已迁移至 {@link IntegerRangePropertyModel}
 */
public interface V extends IntegerRangePropertyModel {
    @Override
    int getValue();

    @Override
    int vu0();

    @Override
    int OD();

    @Override
    void X90(int var1);

    @Override
    default int getMinimum() {
        return vu0();
    }

    @Override
    default int getMaximum() {
        return OD();
    }

    @Override
    default void setValue(int val) {
        X90(val);
    }
}
