package cn.pokemmo.item;

import f.CH0;
import f.hl0_0;
import f.K5;
import f.l5_0;
import f.mc0_1;
import f.RJ0;
import f.X4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 玩家背包与库存容器 (Player Bag / Inventory)
 * 管理玩家当前持有的所有物品槽位 (ItemStack)、按口袋分类检索、数量统计及快捷栏
 * 原混淆类: f.RJ0
 */
public class PlayerBag {
    public static final hl0_0[] EMPTY_ENTRIES = new hl0_0[0];
    public static final hl0_0[] w = EMPTY_ENTRIES;

    public final HashMap<CH0, K5> slotMap = new HashMap<>();
    public final HashMap pb0 = this.slotMap;

    public final short[] quickSlots = new short[3];
    public final short[] U8 = this.quickSlots;

    public PlayerBag(hl0_0[] entries) {
        if (entries != null) {
            for (hl0_0 entry : entries) {
                this.addSlot(entry);
            }
        }
    }

    public final RJ0 asBridge() {
        return ((Object) this) instanceof RJ0 ? (RJ0) (Object) this : null;
    }

    public static boolean matchItemTemplate(mc0_1 item, K5 slot) {
        return slot != null && slot.cL == item;
    }

    public static boolean Lc0(mc0_1 item, K5 slot) {
        return matchItemTemplate(item, slot);
    }

    public static boolean matchItemId(boolean normalized, short itemId, K5 slot) {
        if (slot == null || slot.nn == null) {
            return false;
        }
        short slotItemId = normalized ? X4.gA0(slot.nn.wQ) : slot.nn.wQ;
        return slotItemId == itemId;
    }

    public static boolean Ck0(boolean normalized, short itemId, K5 slot) {
        return matchItemId(normalized, itemId, slot);
    }

    public static boolean matchPocket(l5_0 type, K5 slot) {
        return slot != null && slot.cL != null && slot.cL.Yt0 == type;
    }

    public static boolean aa0(l5_0 type, K5 slot) {
        return matchPocket(type, slot);
    }

    /**
     * 添加/更新槽位物品
     */
    public final void addSlot(hl0_0 entry) {
        K5 slot = new K5(entry);
        synchronized (this.slotMap) {
            this.slotMap.put(entry.Br, slot);
        }
    }

    public final void cq0(hl0_0 entry) {
        addSlot(entry);
    }

    /**
     * 根据槽位 UUID 检索物品
     */
    public final K5 getItemBySlotId(CH0 id) {
        synchronized (this.slotMap) {
            return this.slotMap.get(id);
        }
    }

    public final K5 zg(CH0 id) {
        return getItemBySlotId(id);
    }

    /**
     * 根据物品原型 ID 获取第一个匹配的槽位物品
     */
    public final K5 getFirstItemById(short itemId) {
        synchronized (this.slotMap) {
            for (K5 slot : this.slotMap.values()) {
                if (slot != null && slot.nn != null && slot.nn.wQ == itemId) {
                    return slot;
                }
            }
            return null;
        }
    }

    public final K5 Mq0(short itemId) {
        return getFirstItemById(itemId);
    }

    /**
     * 获取背包内所有槽位物品数组
     */
    public final K5[] getAllItems() {
        synchronized (this.slotMap) {
            return this.slotMap.values().toArray(new K5[0]);
        }
    }

    public final K5[] KL() {
        return getAllItems();
    }

    /**
     * 按背包口袋分类获取物品列表
     */
    public final K5[] getItemsByPocket(l5_0 type) {
        synchronized (this.slotMap) {
            ArrayList<K5> matches = new ArrayList<>();
            for (K5 slot : this.slotMap.values()) {
                if (matchPocket(type, slot)) {
                    matches.add(slot);
                }
            }
            return matches.toArray(new K5[0]);
        }
    }

    public final K5[] do$(l5_0 type) {
        return getItemsByPocket(type);
    }

    public final K5[] getItemsByPocket(BagPocket pocket) {
        return pocket != null ? getItemsByPocket(pocket.toBridge()) : new K5[0];
    }

    /**
     * 查找拥有最高堆叠数量的最佳物品槽位 (按物品 ID)
     */
    public final K5 findBestItemById(short itemId) {
        if (!this.hasItem((byte) -1, itemId, (short) 1)) {
            return null;
        }
        short normalizedItemId = X4.gA0(itemId);
        synchronized (this.slotMap) {
            K5 result = null;
            for (K5 slot : this.slotMap.values()) {
                if (matchItemId(true, normalizedItemId, slot) && (result == null || result.getQuantity() < slot.getQuantity())) {
                    result = slot;
                }
            }
            return result;
        }
    }

    public final K5 coM8(short itemId) {
        return findBestItemById(itemId);
    }

    /**
     * 查找拥有最高堆叠数量的最佳物品槽位 (按物品模板)
     */
    public final K5 findBestItem(mc0_1 item) {
        if (item == null || !this.hasItem((byte) -1, item.Z8, (short) 1)) {
            return null;
        }
        synchronized (this.slotMap) {
            K5 result = null;
            for (K5 slot : this.slotMap.values()) {
                if (matchItemTemplate(item, slot) && (result == null || result.getQuantity() < slot.getQuantity())) {
                    result = slot;
                }
            }
            return result;
        }
    }

    public final K5 mE(mc0_1 item) {
        return findBestItem(item);
    }

    /**
     * 检查指定口袋/位置是否拥有足够数量的物品
     */
    public final boolean hasItem(byte position, short itemId, short amount) {
        synchronized (this.slotMap) {
            for (K5 slot : this.slotMap.values()) {
                if (slot == null) {
                    continue;
                }
                hl0_0 entry = slot.nn;
                if (entry == null || entry.wQ != itemId) {
                    continue;
                }
                byte slotPosition = entry.Ps;
                if (slotPosition != position && slotPosition != -1 && position != -1) {
                    continue;
                }
                amount = (short) (amount - entry.PA0);
                if (amount <= 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean Dj0(byte position, short itemId, short amount) {
        return hasItem(position, itemId, amount);
    }

    /**
     * 统计指定物品在背包中的总数量
     */
    public final int getItemTotalCount(short itemId) {
        synchronized (this.slotMap) {
            int amount = 0;
            for (K5 slot : this.slotMap.values()) {
                if (slot != null && slot.nn != null && slot.nn.wQ == itemId) {
                    amount += slot.nn.PA0;
                }
            }
            return amount;
        }
    }

    public final int a90(short itemId) {
        return getItemTotalCount(itemId);
    }

    /**
     * 获取快捷栏注册的 3 个物品编号
     */
    public final short[] getQuickSlots() {
        return this.quickSlots;
    }

    public final short[] Td() {
        return getQuickSlots();
    }
}
