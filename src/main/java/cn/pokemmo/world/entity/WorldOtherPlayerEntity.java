package cn.pokemmo.world.entity;

import f.*;

public class WorldOtherPlayerEntity extends Nj {
    public final LB hI;
    public nh0_0 S50;

    public WorldOtherPlayerEntity() {
        super();
        this.hI = new LB((er_0) (Object) this);
    }

    public WorldOtherPlayerEntity(bb_2 source) {
        this();
        this.private$(source);
    }

    @Override
    public final String Ck() {
        return "table";
    }

    public final void private$(nh0_0 source) {
        nh0_0 old = this.S50;
        if (old != null) {
            bb_2 rows = (bb_2) old;
            rows.Pj0 = (LB[]) a7_0.tp0(this.hI, rows.Pj0);
        }
        this.bL = source;
        this.S50 = source;
        if (source != null) {
            this.Dx0 = source.oK0();
            this.gc0 = source.Zy();
            bb_2 rows = (bb_2) source;
            rows.Pj0 = (LB[]) a7_0.gE(rows.Pj0, this.hI, LB.class);
        } else {
            this.Dx0 = 0;
            this.gc0 = 0;
        }
        this.wr();
    }

    @Override
    public final Object Yp(int row, int column, Zh ignored) {
        return this.S50.RG0(row, column);
    }

    @Override
    public final Zh Xt(int index) {
        return null;
    }

    @Override
    public final Object EO(int row, int column) {
        return this.S50.fh0(row, column);
    }
}
