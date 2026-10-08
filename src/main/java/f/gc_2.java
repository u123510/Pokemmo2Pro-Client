package f;

import cn.pokemmo.battle.BattleStat;
import java.util.ArrayList;

/**
 * 兼容垫片 (Shim) - 宝可梦战斗六围能力值与命中闪避属性枚举
 * 核心定义已迁移至 {@link BattleStat}
 */
public enum gc_2 {
    // 现代语义常量别名
    // Graphic quality / render configuration options

    RC(0, 0, "HP", 100, 10, false),
    r4(1, 1, "ATTACK", 0, 5, false),
    ly(2, 2, "DEFENSE", 0, 5, false),
    ie0(3, 5, "SPEED", 0, 5, false),
    ej(4, 3, "SP. ATTACK", 0, 5, false),
    lL0(5, 4, "SP. DEFENSE", 0, 5, false),
    ACCURACY(6, 6, "ACCURACY", 0, 0, true),
    EVASION(7, 7, "EVASION", 0, 0, true);

    public static final gc_2[] ME;
    public static final gc_2[] Wp;
    public static final gc_2[] fe0;
    public static final gc_2[] mi;
    public static final gc_2[] Uu;
    public static final bm0_1 z80;
    public final byte v10;
    public final byte CoM2;
    public final String em0;
    public final int f00;
    public final int L70;
    public final boolean j8;

    gc_2(int v10, int com2, String em0, int f00, int l70, boolean j8) {
        this.v10 = (byte) v10;
        this.CoM2 = (byte) com2;
        this.em0 = em0;
        this.f00 = f00;
        this.L70 = l70;
        this.j8 = j8;
    }

    public static gc_2 RK(byte b) {
        return (gc_2) z80.BM(b);
    }

    public static gc_2[] rY(byte b) {
        if (b == 0) {
            return Uu;
        }
        ArrayList<gc_2> list = new ArrayList<>();
        gc_2[] me = ME;
        int len = me.length;
        for (int i = 0; i < len; i++) {
            gc_2 stat = me[i];
            if (((1 << stat.v10) & b) != 0) {
                list.add(stat);
            }
        }
        return list.toArray(new gc_2[0]);
    }

    public static byte[] PR(int i0) {
        byte[] arr = new byte[ME.length];
        for (int i = 0; i < ME.length; i++) {
            arr[i] = (byte) (((i0 >> (i * 4)) & 0xF) - 6);
        }
        return arr;
    }

    public final byte FZ() {
        return this.v10;
    }

    public final byte pI0() {
        return this.CoM2;
    }

    public final boolean Yt0() {
        return this.j8;
    }

    @Override
    public final String toString() {
        if (sm0_0.cU.l90(this.v10 + 500)) {
            return sm0_0.c0(this.v10 + 500);
        }
        return this.em0;
    }

    public final cn.pokemmo.battle.BattleStat toDomain() {
        return cn.pokemmo.battle.BattleStat.fromObfuscated(this);
    }

    public static gc_2 fromDomain(cn.pokemmo.battle.BattleStat domain) {
        return domain != null ? domain.toObfuscated() : null;
    }

    public BattleStat asModern() {
        return toDomain();
    }

    public static gc_2 asBridge(BattleStat modern) {
        return fromDomain(modern);
    }

    static {
        ME = values();
        Wp = new gc_2[]{RC, r4, ly, ie0, ej, lL0};
        fe0 = new gc_2[]{RC, r4, ly, ej, lL0, ie0};
        mi = new gc_2[]{r4, ly, ej, lL0, ie0, EVASION, ACCURACY};
        Uu = new gc_2[0];
        z80 = new bm0_1();
        for (gc_2 stat : ME) {
            z80.gE0(stat.v10, stat);
        }
    }
}
