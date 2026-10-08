package cn.pokemmo.item;

import f.CH0;
import f.gu0;
import f.hl0_0;
import f.K5;
import f.mc0_1;
import f.sm0_0;

/**
 * 背包单格堆叠物品对象 (Item Stack)
 * 包装底层槽位数据 (ItemSlotData) 与对应的物品原型模板 (ItemTemplate)
 * 原混淆类: f.K5
 */
public class ItemStack implements Comparable {
    public final hl0_0 slotData;
    public final hl0_0 nn;

    public final mc0_1 itemTemplate;
    public final mc0_1 cL;

    public ItemStack(hl0_0 slotData) {
        this.slotData = slotData;
        this.nn = slotData;
        this.itemTemplate = gu0.Az0().lPT6(slotData.COM8());
        this.cL = this.itemTemplate;
    }

    public final K5 asBridge() {
        return ((Object) this) instanceof K5 ? (K5) (Object) this : null;
    }

    /**
     * 获取背包槽位唯一标识 UUID
     */
    public final CH0 getSlotId() {
        return this.slotData.Br;
    }

    public final CH0 QT() {
        return getSlotId();
    }

    /**
     * 获取物品原型编号 ID
     */
    public final short getItemId() {
        return this.slotData.wQ;
    }

    public final short pm() {
        return getItemId();
    }

    /**
     * 获取当前堆叠数量
     */
    public final short getQuantity() {
        return this.slotData.PA0;
    }

    public final short I7() {
        return getQuantity();
    }

    /**
     * 获取底层槽位实体数据
     */
    public final hl0_0 getSlotData() {
        return this.slotData;
    }

    public final hl0_0 Ph0() {
        return getSlotData();
    }

    /**
     * 获取物品基础名称
     */
    public final String getBaseName() {
        return sm0_0.c0(this.itemTemplate.Nl);
    }

    public final String Fh0() {
        return getBaseName();
    }

    /**
     * 获取物品展示名称 (含形态与变体后缀)
     */
    public final String getDisplayName() {
        byte variant = this.slotData.N50;
        return this.itemTemplate.Nt0(variant, this.slotData.pe);
    }

    public final String Ua() {
        return getDisplayName();
    }

    /**
     * 获取物品原型模板
     */
    public final mc0_1 getItemTemplate() {
        return this.itemTemplate;
    }

    public final mc0_1 LW() {
        return getItemTemplate();
    }

    @Override
    public int compareTo(Object var1) {
        if (!(var1 instanceof ItemStack)) {
            return 0;
        }
        ItemStack other = (ItemStack) var1;
        mc0_1 t1 = this.itemTemplate;
        mc0_1 t2 = other.itemTemplate;
        return t1 != null && t2 != null ? t1.t30(t2) : 0;
    }
}
