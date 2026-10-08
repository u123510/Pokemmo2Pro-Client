package cn.pokemmo.world.tile;

import f.*;

public class GrassEncounterTileBehavior extends _else {
    public final wc_2 J80;

    public GrassEncounterTileBehavior(byte flags, short mapId) {
        super((byte) 10, J4.AD0(mapId), J4.K9(mapId), flags);
        this.J80 = new wc_2(new W70());
        this.J80.Con(lg_0.I70.Wl0("./data/maps/" + mapId + ".pm3d"), this);
    }

    @Override
    public final boolean Wp() {
        return false;
    }

    @Override
    public final String OE() {
        return "";
    }

    @Override
    public final short hh0() {
        return 0;
    }

    @Override
    public final LT Fn(int x, int y, int layer) {
        pc0_0 map = (pc0_0) this.J80.kl0.get(0);
        if (layer < 0 || x < 0 || y < 0 || layer >= map.Bp0.length
            || x >= map.Bp0[layer].length || y >= map.Bp0[layer][x].length) {
            return null;
        }
        return map.Bp0[layer][x][y];
    }

    @Override
    public final LT LB0(short x, short y, float height) {
        pc0_0 map = (pc0_0) this.J80.kl0.get(0);
        int layers = map.Bp0.length;
        if (layers == 1) {
            return this.Fn(x, y, 0);
        }
        LT best = this.Fn(x, y, 0);
        for (int layer = 1; layer < layers; layer++) {
            LT candidate = this.Fn(x, y, layer);
            if (candidate == null) {
                continue;
            }
            if (best == null) {
                best = candidate;
                continue;
            }
            float bestDistance = Math.abs(height - ((m9) best).LPT6);
            float candidateDistance = Math.abs(height - ((m9) candidate).LPT6);
            if (bestDistance <= candidateDistance) {
                continue;
            }
            if (Math.abs(((m9) best).LPT6 - ((m9) candidate).LPT6) >= 0.005f) {
                best = candidate;
            }
        }
        return best;
    }
}
