package cn.pokemmo.battle;

import f.*;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * 现代化重构类 - 原始混淆类: f.li_2
 */
public abstract class Modern_Battle_Li2 {

    public Modern_Battle_Li2() {
        super();
    }

    public static long lu = hk0_1.KG;
    public static final HashSet kp0 = new HashSet();
    public static final ArrayList Tx0 = new ArrayList();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void HA0(CG cG) {
        HashSet hashSet = kp0;
        synchronized (hashSet) {
            hashSet.add(cG);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void cx(CG cG) {
        HashSet hashSet = kp0;
        synchronized (hashSet) {
            hashSet.remove(cG);
            return;
        }
    }
}


