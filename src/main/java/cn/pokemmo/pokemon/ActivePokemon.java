package cn.pokemmo.pokemon;

import f.*;
import cn.pokemmo.pokemon.pokedex.*;
import java.time.Year;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * 运行时活跃宝可梦包装器 (Active Pokemon Model)
 * 包装底层宝可梦数据 (PokemonData / CE)，提供出场动画、图鉴映射、对战状态与临时属性。
 *
 * 原混淆类: f.VU
 */
public class ActivePokemon extends PH0 {
    public final VU asBridge() {
        return ((Object) this) instanceof VU ? (VU) (Object) this : null;
    }

    public final CE getPokemonData() {
        return this.I8;
    }

    public final cq_0 getPokedexEntry() {
        return this.f60;
    }

    public static final gp0_0 ZW;
    public final CE I8;
    public final XD0 Ps;
    public cq_0 SC;
    public cq_0 f60;
    public short u60 = 0;

    public ActivePokemon(CE cE) {
        super(cE.Mw0());
        this.I8 = cE;
        this.Ps = new XD0(asBridge());
        this.aG(mp_1.vf0().W50(cE.SA0()));
    }

    static {
        ZW = new gp0_0(new PG0(10));
    }

    public static dp_1 b(dp_1 dp_12, int n) {
        if (dp_12 == null) {
            dp_12 = new PG0(10);
        }
        dp_1 dp_13 = dp_12;
        dp_13.Vn(n);
        return dp_13;
    }

    @Override
    public final String na0() {
        if (this.I8.vn()) {
            return sm0_0.wa0(1893, this.f60.Ay(false));
        }
        if (!this.I8.kX.isEmpty()) {
            return this.I8.kX;
        }
        cq_0 cq_02 = this.f60;
        if (cq_02 == null) {
            return "???";
        }
        return cq_02.Ay(false);
    }

    public final String k30() {
        if (this.I8.vn()) {
            return sm0_0.wa0(1893, this.f60.Ay(false));
        }
        return this.f60.Ay(false);
    }

    public final short U8() {
        return this.I8.Yb0;
    }

    public final boolean uF0() {
        return this.I8.vn();
    }

    public final boolean LPt6() {
        return this.I8.aR();
    }

    public final CE RJ() {
        return this.I8;
    }

    public final XD0 zw0() {
        return this.Ps;
    }

    public final byte Dg0() {
        cq_0 cq_02 = this.f60;
        if (cq_02 == null) {
            return -1;
        }
        int n = cq_02.Ai;
        if (n != 0) {
            if (n != 254) {
                if (n != 255) {
                    if (((byte)this.I8.vQ & 0xFF) >= n) {
                        return 0;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
        return 0;
    }

    public final cq_0 Wd() {
        return this.f60;
    }

    public final cq_0 i3() {
        return this.SC;
    }

    public final void aG(cq_0 cq_02) {
        if (cq_02 == null) {
            short speciesId = (this.I8 != null) ? this.I8.SA0() : 0;
            cq_02 = mp_1.vf0().getEntry(speciesId);
            if (cq_02 == null) {
                cq_02 = new cq_0(speciesId);
            }
        }
        this.f60 = cq_02;
        this.SC = cq_02;
        if (cq_02.iv0 > 0 && this.I8 != null && this.I8.ZF0 > 0) {
            cq_0 form = mp_1.vf0().W50((short)(cq_02.iv0 + this.I8.ZF0 - 1));
            if (form != null) {
                this.SC = form;
            }
        }
    }

    public final i40_0 KD() {
        return this.SC.OE0(this.I8.ZF0);
    }

    public final i40_0 KI() {
        return this.SC.F70(this.I8.ZF0);
    }

    public final i40_0 ZE() {
        i40_0 object = this.KD();
        i40_0 object2 = this.KI();
        i40_0 i40_02 = i40_0.c90;
        if (object == i40_02 && object != object2) {
            object = object2;
        }
        if (object != i40_0.Gc && object != i40_0.g50) {
            return object;
        }
        return i40_02;
    }

    public final short Vo() {
        return this.u60;
    }

    public final short Aq0() {
        short s = this.SC.Lh(this.I8.Xn0);
        if (s == 0) {
            s = this.SC.Lh(0);
        }
        return s;
    }

    public final boolean ln0(String[] stringArray) {
        if (stringArray != null && stringArray.length >= 1) {
            block0: for (String string : stringArray) {
                if (string.isEmpty() || tx_1.qp0(tx_1.J10(this.na0(), false), string) || tx_1.qp0(tx_1.J10(this.f60.Ay(false), false), string)) continue;
                short[] object = this.I8.Gu;
                int n = object.length;
                for (int j = 0; j < n; ++j) {
                    if (tx_1.qp0(tx_1.J10(sm0_0.c0(object[j] + 110000), false), string)) continue block0;
                }
                if (tx_1.qp0(tx_1.J10(sm0_0.c0(this.Aq0() + 210000), false), string)) continue;
                cq_0 current = this.SC;
                n = 2;
                i40_0[] i40_0Array = new i40_0[2];
                i40_0[] i40_0Array2 = i40_0Array;
                i40_0Array2[0] = current.av0;
                i40_0Array[1] = current.aUx;
                for (int j = 0; j < n; ++j) {
                    i40_0 i40_02 = i40_0Array2[j];
                    if (i40_02 != null && tx_1.qp0(tx_1.J10(i40_02.BT(), false), string)) continue block0;
                }
                if (this.I8.rh0() > 0 && tx_1.qp0(tx_1.J10(sm0_0.c0(gu0.l2.lPT6((short)this.I8.rh0()).Nl), false), string) || tx_1.qp0(tx_1.J10(sm0_0.c0(this.I8.yb.f10 + 180000), false), string) || tx_1.qp0(tx_1.J10(this.I8.Ql0(), false), string)) continue;
                return false;
            }
            return true;
        }
        return true;
    }

    public final dp_1 h10() {
        if (this.I8.vn()) {
            return ZW;
        }
        dp_1 dp_12 = null;
        he0_1 he0_12 = this.f60.uC;
        if (he0_12 == he0_1.Rn || he0_12 == he0_1.ks0) {
            dp_12 = ActivePokemon.b(dp_12, 2371);
        }
        if (this.I8.I()) {
            dp_12 = ActivePokemon.b(dp_12, 2372);
        }
        if (this.I8.aR()) {
            dp_12 = ActivePokemon.b(dp_12, 2373);
        }
        if (this.I8.ca()) {
            dp_12 = ActivePokemon.b(dp_12, 2374);
        }
        if (this.I8.aUX()) {
            dp_12 = ActivePokemon.b(dp_12, 2387);
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis((long)this.I8.t50 * 1000L);
        if (calendar.get(1) <= Year.now().getValue() - 10) {
            dp_12 = ActivePokemon.b(dp_12, 2378);
        }
        CE cE = this.I8;
        int n = cE.bG0.length;
        if ((byte)((cE.I() ? 1 : 0) + n) > 0) {
            dp_12 = ActivePokemon.b(dp_12, 2375);
        }
        if (this.I8.Sx() == 31) {
            dp_12 = ActivePokemon.b(dp_12, 2376);
        }
        if (this.I8.X3() >= 120) {
            dp_12 = ActivePokemon.b(dp_12, 2376);
        }
        if (this.I8.wj >= 75) {
            dp_12 = ActivePokemon.b(dp_12, 2377);
        }
        n = 0;
        gc_2[] gc_2Array = gc_2.Wp;
        int n2 = gc_2.Wp.length;
        for (int j = 0; j < n2; ++j) {
            gc_2 gc_22 = gc_2Array[j];
            if (this.I8.RI(gc_22) != 0) continue;
            ++n;
        }
        if (n >= 5) {
            dp_12 = ActivePokemon.b(dp_12, 2389);
        }
        if (dp_12 == null) {
            dp_12 = ZW;
        }
        return dp_12;
    }

    public final boolean rX() {
        e30_0 e30_02 = tw0_0.rl.k0;
        if (!tw0_0.e60.dj0.equals(e30_02.WN)) {
            return false;
        }
        CE object = this.I8;
        int n = object.Hf0.Cg == 0 ? 1 : object.Hf0.Cg == 1 ? 2 : 0;
        if (n != 1) {
            if (n != 2) {
                return false;
            }
            CH0 location = object.W50;
            long l = location.Sa;
            return l >= Integer.MIN_VALUE && l <= Integer.MAX_VALUE && location.n30() == e30_02.import$;
        }
        return object.W50.equals(e30_02.WN);
    }
}

