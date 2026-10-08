package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.S
 */
public abstract class Modern_Battle_S {

    public Modern_Battle_S() {
        super();
    }

    public static boolean J9(short s, short[] sArray) {
        int n = sArray.length;
        for (int j = 0; j < n; ++j) {
            if (sArray[j] != s) continue;
            return true;
        }
        return false;
    }

    public static boolean ZT(Object object, Object[] objectArray) {
        if (object == null) {
            int n = objectArray.length;
            for (int j = 0; j < n; ++j) {
                if (objectArray[j] != null) continue;
                return true;
            }
        } else {
            for (Object object2 : objectArray) {
                if (object2 == null || !object2.equals(object)) continue;
                return true;
            }
        }
        return false;
    }

    public static int BA(short s, short[] sArray) {
        for (int j = 0; j < sArray.length; ++j) {
            if (s != sArray[j]) continue;
            return j;
        }
        return -1;
    }

    public static int os0(short s, short[] sArray) {
        int n;
        if (sArray != null && sArray.length >= 1) {
            for (n = 0; n < sArray.length; ++n) {
                if (s != sArray[n]) {
                    continue;
                }
                break;
            }
        } else {
            n = -1;
        }
        return n;
    }
}


