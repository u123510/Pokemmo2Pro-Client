package cn.pokemmo.item;

import f.bm0_1;
import f.gu0;
import f.l5_0;
import f.mc0_1;
import f.TE;

import java.util.Collection;
import java.util.TreeMap;

/**
 * 全局物品数据库单例 (Item Database)
 * 管理所有加载的物品模板 (ItemTemplate) 索引、缓存与注册
 * 原混淆类: f.gu0
 */
public class ItemDatabase {
    public static final gu0 INSTANCE = gu0.l2;
    public static final gu0 l2 = INSTANCE;

    public final TreeMap<Short, mc0_1> itemMap = new TreeMap<>();
    public final TreeMap<Short, mc0_1> Cb0 = this.itemMap;

    public final TreeMap<Short, mc0_1> allItemMap = new TreeMap<>();
    public final TreeMap<Short, mc0_1> Pd0 = this.allItemMap;

    public final TE my0 = new TE();
    public final bm0_1 iz = new bm0_1();

    public ItemDatabase() {
    }

    public static gu0 getInstance() {
        return gu0.l2;
    }

    public static gu0 Az0() {
        return getInstance();
    }

    /**
     * 注册物品模板
     */
    public void registerItem(mc0_1 value) {
        this.itemMap.put(value.Z8, value);
        this.allItemMap.put(value.Z8, value);
    }

    public final void on0(mc0_1 value) {
        registerItem(value);
    }

    /**
     * 按物品编号检索物品模板
     */
    public mc0_1 getItem(short key) {
        mc0_1 value = this.itemMap.get(key);
        if (value == null) {
            value = new mc0_1(key, (short) -1, 1450, 1451, (short) 0, l5_0.B9);
            this.registerItem(value);
        }
        return value;
    }

    public final mc0_1 lPT6(short key) {
        return getItem(key);
    }

    /**
     * 获取所有已注册的物品模板集合
     */
    public Collection<mc0_1> getAllItems() {
        return this.allItemMap.values();
    }

    public final Collection<mc0_1> Wp0() {
        return getAllItems();
    }

    public boolean containsItem(short key) {
        return this.itemMap.containsKey(key);
    }
}
