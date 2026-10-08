package cn.pokemmo.battle.slot;

import f.*;
import java.util.EnumMap;

/**
 * 战场槽位宝可梦数据模型 (Battle Slot Pokemon Data Model)
 * 封装在对战槽位中登场的单只宝可梦实时槽位数据、底层宝可梦实体数据 (CE / PokemonData)、
 * 当前血量、闪光特效、道具持有状态、能力阶级临时映射与形态变种。
 *
 * 原混淆类: f.se_0
 */
public class BattleSlotPokemon {
    public cq_0 ZE0;
    public CE Bn;
    public byte D4;
    public short Sj;
    public QL Vg0;
    public boolean Oq0;
    public short T0;
    public final EnumMap U;
    public byte nF0;
    public byte jx;

    public BattleSlotPokemon() {
        this.Sj = 1;
        this.Vg0 = QL.lQ;
        this.Oq0 = false;
        this.T0 = -1;
        this.U = new EnumMap(gc_2.class);
        this.Bn = new CE(CH0.j1);
    }

    public final se_0 asBridge() {
        return ((Object) this) instanceof se_0 ? (se_0) (Object) this : null;
    }

    public final short E3() {
        if (!this.Oq0) {
            return -1;
        }
        return this.ZE0.Lh(this.Bn.Xn0);
    }

    public final String Ky0() {
        if (this.Bn.Y1()) {
            return this.Bn.kX;
        }
        return sm0_0.c0(this.Bn.Yb0 + 150000);
    }

    public final CH0 rH0() {
        return this.Bn.YD0;
    }

    public final byte Sy0() {
        return this.D4;
    }

    public final CE mf0() {
        return this.Bn;
    }

    public final cq_0 E10() {
        cq_0 cq_0Var = this.ZE0;
        if (cq_0Var != null && cq_0Var.iv0 > 0 && this.nF0 > 0) {
            return mp_1.vf0().W50((short) (this.ZE0.iv0 + this.nF0 - 1));
        }
        return cq_0Var;
    }

    public final boolean hf0() {
        return this.Bn.VD < 1;
    }

    public final short SD0() {
        return this.Bn.Yb0;
    }

    public final byte HP() {
        if (hf0()) {
            return 0;
        }
        return this.Bn.H1;
    }

    public final void Fe0(byte b) {
        if (b != 0 && !this.Bn.GK0.WB0) {
            throw new IllegalArgumentException(this.Bn.GK0.vz0 + "->" + ((int) b));
        }
        if (b == 0 && !this.Bn.GK0.WB0) {
            throw new IllegalArgumentException(this.Bn.GK0.vz0 + "->" + ((int) b));
        }
        this.jx = b;
    }

    public final boolean Bj() {
        return this.Bn.GK0.WB0;
    }

    public final boolean Fo0() {
        return Bj() && this.jx == 1;
    }

    // ==========================================
    // 现代可读 API 封装
    // ==========================================

    public final CE getPokemonData() {
        return this.mf0();
    }

    public final cq_0 getPokedexEntry() {
        return this.E10();
    }

    public final short getHeldItemId() {
        return this.E3();
    }

    public final String getDisplayName() {
        return this.Ky0();
    }

    public final CH0 getOriginalTrainer() {
        return this.rH0();
    }

    public final byte getLevel() {
        return this.Sy0();
    }

    public final boolean isEggOrHidden() {
        return this.hf0();
    }

    public final short getSpeciesId() {
        return this.SD0();
    }

    public final byte getStatusFlags() {
        return this.HP();
    }

    public final void setFormVariant(byte variant) {
        this.Fe0(variant);
    }

    public final boolean isSpecialForm() {
        return this.Bj();
    }

    public final boolean isSecondarySpecialForm() {
        return this.Fo0();
    }
}
