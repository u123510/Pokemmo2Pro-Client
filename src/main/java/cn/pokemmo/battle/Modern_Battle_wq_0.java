package cn.pokemmo.battle;

import f.*;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * 现代化重构类 - 原始混淆类: f.wq_0
 */
public abstract class Modern_Battle_wq_0 {

    public Modern_Battle_wq_0() {
        super();
    }

    public static final LinkedHashMap LU = new LinkedHashMap<String, Character>();

    public static String P60(String string) {
        StringBuilder stringBuilder2 = new StringBuilder(string);
        int n = 0;
        while (n < stringBuilder2.length()) {
            char c = stringBuilder2.charAt(n);
            Iterator iterator = LU.keySet().iterator();
            String string2 = (String)iterator.next();
            boolean bl = false;
            String string3 = null;
            while (iterator.hasNext() && !bl) {
                if (((Character)LU.get(string2)).charValue() == c) {
                    bl = true;
                    string3 = string2;
                }
                string2 = (String)iterator.next();
            }
            if (string3 != null) {
                int n2 = n;
                stringBuilder2.replace(n2, n2 + 1, string3);
                n = string3.length() + n;
                continue;
            }
            ++n;
        }
        return stringBuilder2.toString();
    }

    static {
        LU.put("&quot;", Character.valueOf('\"'));
        LU.put("&amp;", Character.valueOf('&'));
        LU.put("&lt;", Character.valueOf('<'));
        LU.put("&gt;", Character.valueOf('>'));
        LU.put("&nbsp;", Character.valueOf('\u00a0'));
    }
}


