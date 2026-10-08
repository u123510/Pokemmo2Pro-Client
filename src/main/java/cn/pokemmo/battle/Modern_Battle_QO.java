package cn.pokemmo.battle;

import f.*;
import java.util.TreeMap;

/**
 * 现代化重构类 - 原始混淆类: f.QO
 */
public class Modern_Battle_QO {

    public static final QO NX;
    public final TreeMap Cs;
    
    public Modern_Battle_QO() {
        this.Cs = new TreeMap();
    }
    
    public static QO YL0() {
        return QO.NX;
    }
    
    static {
        NX = new QO();
    }
    
    public final void kd(final yj_2 value) {
        this.Cs.put(value.su, value);
    }
    
    public final yj_2 xW(final short s) {
        final TreeMap cs;
        yj_2 yj_2;
        if ((cs = this.Cs) == null) {
            yj_2 = null;
        }
        else if ((yj_2 = (yj_2)cs.get(s)) == null) {
            yj_2 = new yj_2(s, false);
        }
        return yj_2;
    }
}


