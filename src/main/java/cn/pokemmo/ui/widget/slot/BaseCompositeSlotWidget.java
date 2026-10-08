package cn.pokemmo.ui.widget.slot;

import f.CH0;
import f.IA;
import f.qr_0;

/**
 * BaseCompositeSlotWidget - UI 复合交互槽位抽象组件（带库存/背包适配器）
 * 扩展 BaseItemSlotWidget，支持物品与背包双向绑定、冷却与双击计时器。
 */
public abstract class BaseCompositeSlotWidget extends qr_0 {

    public BaseCompositeSlotWidget(IA owner, short id, CH0 context, short slot) {
        super(owner, id, context, slot);
    }

    public IA getInventoryAdapter() {
        return this.te0;
    }
}
