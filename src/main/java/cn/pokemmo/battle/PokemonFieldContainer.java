package cn.pokemmo.battle;

import f.CH0;
import f.VU;
import f._volatile;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 战场宝可梦槽位容器 (Pokemon Field Container)
 * 管理战场上当前出战活跃宝可梦 (ActivePokemon / VU)，支持按槽位、按训练家查询与缓存。
 *
 * 原混淆类: f.Mj
 */
public abstract class PokemonFieldContainer {
    public final _volatile Jn0;
    public final HashMap VW;
    public VU[] f20;
    public boolean rr0;
    public boolean jf;

    public PokemonFieldContainer(_volatile container) {
        this.VW = new HashMap();
        this.rr0 = true;
        this.Jn0 = container;
    }

    public final void sH(VU pokemon) {
        synchronized (this.VW) {
            this.VW.put(pokemon.pu, pokemon);
        }
        this.rr0 = true;
        this.jf = false;
    }

    public final void addPokemon(VU pokemon) {
        sH(pokemon);
    }

    public final void hD(VU pokemon) {
        synchronized (this.VW) {
            this.VW.put(pokemon.pu, pokemon);
        }
        this.rr0 = true;
        this.jf = false;
    }

    public final void Qe(CH0 id) {
        synchronized (this.VW) {
            this.VW.remove(id);
        }
        this.rr0 = true;
        this.jf = false;
    }

    public final void removePokemon(CH0 id) {
        Qe(id);
    }

    public final VU[] y0() {
        synchronized (this.VW) {
            return (VU[]) this.VW.values().toArray(new VU[0]);
        }
    }

    public final VU[] getAllPokemon() {
        return y0();
    }

    public final VU[] rT() {
        int count = this.V2();
        if (this.f20 == null || this.f20.length != count) {
            this.jf = false;
            this.f20 = new VU[count];
        }
        if (this.jf) {
            return this.f20;
        }
        synchronized (this.VW) {
            Arrays.fill(this.f20, null);
            for (Object value : this.VW.values()) {
                VU pokemon = (VU) value;
                short slot = pokemon.I8.ou0;
                if (slot < count) {
                    this.f20[slot] = pokemon;
                }
            }
            this.jf = true;
            return this.f20;
        }
    }

    public final VU[] getSlotArray() {
        return rT();
    }

    public final int vH0() {
        return this.VW.size();
    }

    public final int size() {
        return vH0();
    }

    public int V2() {
        return this.Jn0.fq;
    }

    public int getMaxSlots() {
        return V2();
    }

    public final VU Ry0(short slot) {
        return slot >= 0 && slot < this.V2() ? this.rT()[slot] : null;
    }

    public final VU getPokemonAtSlot(short slot) {
        return Ry0(slot);
    }

    public final VU nul(short slot) {
        synchronized (this.VW) {
            for (Object value : this.VW.values()) {
                VU pokemon = (VU) value;
                if (pokemon.I8.ou0 == slot) {
                    return pokemon;
                }
            }
            return null;
        }
    }

    public final VU findPokemonBySlot(short slot) {
        return nul(slot);
    }

    public final VU sF(CH0 id) {
        synchronized (this.VW) {
            return (VU) this.VW.get(id);
        }
    }

    public final VU getPokemonById(CH0 id) {
        return sF(id);
    }

    public final _volatile Bm0() {
        return this.Jn0;
    }

    public final _volatile getFieldRule() {
        return Bm0();
    }
}
