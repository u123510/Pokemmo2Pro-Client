package cn.pokemmo.ui.window.inventory;

import f.CE;
import f.CH0;
import f.VU;
import f.mc0_1;

/**
 * 背包物品交互动作监听接口 (Inventory Action Handler)
 * 原始接口: {@code f.vy_2}
 */
public interface InventoryActionHandler {

    void Lj0(short itemId, CE target);

    void U90(short itemId, CH0 sourceSlot, CH0 targetSlot, byte quantity);

    void OV(mc0_1 item, CH0 slot, VU callback);

    void ew0();

    boolean dv();
}
