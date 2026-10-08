package cn.pokemmo.ui.widget.slot;

import f.CH0;
import f.lpt4__1;

/**
 * BaseItemSlotWidget - UI 物品与操作拖拽槽位抽象组件
 * 封装槽位基本属性、拖拽状态、上下文关联与事件处理。
 */
public abstract class BaseItemSlotWidget extends lpt4__1 {

    public BaseItemSlotWidget(short s, CH0 ch0, short s2, short s3, boolean z) {
        super(s, ch0, s2, s3, z);
    }

    public CH0 getItemContext() {
        return this.lO;
    }

    public short getSlotIndex() {
        return this.Lu;
    }

    public short getItemId() {
        return this.wE0;
    }
}
