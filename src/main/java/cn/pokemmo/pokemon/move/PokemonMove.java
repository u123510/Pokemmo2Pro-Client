package cn.pokemmo.pokemon.move;

import f.*;
import cn.pokemmo.pokemon.type.PokemonType;
import java.util.Comparator;

/**
 * 宝可梦技能定义 (Pokemon Move Definition)
 * 包含技能的属性、伤害分类、威力和命中、PP、优先度及特殊类型计算逻辑。
 *
 * 原混淆类: f.vk0_1
 */
public class PokemonMove {
    public static final Comparator<vk0_1> ga0;
    public static final od0_1[] tP;
    public static final gc_2[] ov0;

    public final short hC0;
    public i40_0 Bn;
    public yw_0 EW;
    public short X00;
    public byte mt0;
    public byte lE0;
    public byte Tp;
    public byte l10;
    public byte zQ;
    public byte sw;
    public byte g5;
    public final byte[] N0;
    public final byte[] ao0;
    public final byte[] d60;
    public gc_2[] WK;
    public gc_2[] tD0;
    public byte zy0;
    public byte yE;
    public boolean Gk;
    public byte qh0;
    public int ej;
    public boolean continue$;
    public od0_1[] V6;
    public final int bt;
    public final int D8;

    static {
        ga0 = Comparator.comparing(vk0_1::CoM2);
        tP = new od0_1[0];
        ov0 = new gc_2[0];
    }

    public PokemonMove(short s) {
        this.EW = yw_0.c0;
        this.N0 = new byte[3];
        this.ao0 = new byte[3];
        this.d60 = new byte[3];
        gc_2[] arr = ov0;
        this.WK = arr;
        this.tD0 = arr;
        this.zy0 = 0;
        this.yE = 0;
        this.Gk = false;
        this.qh0 = 0;
        this.continue$ = false;
        this.V6 = tP;
        this.hC0 = s;
        this.bt = s + 110000;
        this.D8 = s + 120000;
    }

    public PokemonMove(short s, i40_0 type) {
        this.EW = yw_0.c0;
        this.N0 = new byte[3];
        this.ao0 = new byte[3];
        this.d60 = new byte[3];
        gc_2[] arr = ov0;
        this.WK = arr;
        this.tD0 = arr;
        this.zy0 = 0;
        this.yE = 0;
        this.Gk = false;
        this.qh0 = 0;
        this.continue$ = false;
        this.V6 = tP;
        this.hC0 = s;
        this.bt = s + 110000;
        this.D8 = s + 120000;
        this.X00 = 0;
        this.Bn = type;
        this.mt0 = 0;
        this.lE0 = 0;
        this.g5 = 0;
    }

    public final short oC0() {
        return this.hC0;
    }

    public final short getMoveId() {
        return this.hC0;
    }

    public final i40_0 yS(CE param1) {
        return oG(param1, null);
    }

    public final i40_0 getType(CE param1) {
        return yS(param1);
    }

    public final i40_0 oG(CE v1, d70_0 v2) {
        if (v1 != null) {
            short s = this.hC0;
            if (s == 237) {
                i40_0 type = v1.kQ;
                if (type != null) {
                    return type;
                }
                byte b = 0;
                gc_2[] arr = gc_2.ME;
                int len = arr.length;
                for (int i = 0; i < len; ++i) {
                    gc_2 gc = arr[i];
                    if (!gc.j8) {
                        b = (byte) (b | ((v1.RI(gc) % 2) << gc.v10));
                    }
                }
                return i40_0.qz0[(byte) ((b * 15) / 63)];
            }
            if (s == 363) {
                return gu0.l2.lPT6(X4.gA0(v1.rh0())).wa;
            }
        }
        if (this.hC0 == 311 && v2 != null) {
            switch (sy_0.p1[v2.Mf]) {
                case 1:
                    return i40_0.DL;
                case 2:
                case 3:
                case 4:
                    return i40_0.lpt8;
                case 5:
                    return i40_0.uP;
                case 6:
                    return i40_0.VD0;
                default:
                    return i40_0.c90;
            }
        }
        return this.Bn;
    }

    public final i40_0 getType(CE v1, d70_0 v2) {
        return oG(v1, v2);
    }

    public final PokemonType getDomainType() {
        return this.Bn != null ? this.Bn.toDomain() : null;
    }

    public final yw_0 Pl(boolean b) {
        if (b) {
            yw_0 local = this.EW;
            if (local != yw_0.Jy) {
                if (local == yw_0.c0) {
                    return yw_0.pi0;
                }
                return local;
            }
        }
        return this.EW;
    }

    public final MoveDamageCategory getDamageCategory(boolean b) {
        return Pl(b);
    }

    public final short Mk() {
        return this.X00;
    }

    public final short getBasePower() {
        return this.X00;
    }

    public final byte zp0() {
        return this.mt0;
    }

    public final byte getAccuracy() {
        return this.mt0;
    }

    public final byte N1() {
        return Gn(false);
    }

    public final byte getBasePp() {
        return N1();
    }

    public final byte Gn(boolean b) {
        if (b && this.X00 > 0) {
            if (lr0()) {
                return 10;
            }
            return 15;
        }
        return this.lE0;
    }

    public final byte getPp(boolean b) {
        return Gn(b);
    }

    public final String CoM2() {
        return sm0_0.c0(this.bt);
    }

    public final String getName() {
        return CoM2();
    }

    public final String getDescription() {
        return sm0_0.c0(this.D8);
    }

    public final boolean lr0() {
        switch (this.g5) {
            case 4:
            case 5:
            case 6:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public final boolean isSpecialTarget() {
        return lr0();
    }

    public final boolean Ro(int i) {
        return (this.ej & i) != 0;
    }

    public final boolean hasFlag(int i) {
        return Ro(i);
    }

    @Override
    public String toString() {
        return sm0_0.c0(this.bt);
    }

    public final M3 Qj() {
        return (M3) l4_0.Py0.Ij.f5(this.hC0);
    }

    public final boolean Kq0() {
        short s = this.hC0;
        return s > 559 || s < -1;
    }

    public final boolean be() {
        return this.hC0 > 0 && !Kq0();
    }

    public final boolean isValid() {
        return be();
    }
}
