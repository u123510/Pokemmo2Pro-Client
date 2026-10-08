package cn.pokemmo.battle.move;

import f.*;

public class BattleTurnOrderCalculator {
    public final XF0 WK;
    public final es_1 y50;
    public final es_1 Cz;

    public BattleTurnOrderCalculator(XF0 world) {
        super();
        this.y50 = new es_1();
        this.Cz = new es_1();
        this.WK = world;
    }

    public final short gq0() {
        return this.WK.Ro0.O60;
    }

    public final void yS(Ou0 value) {
        value.rF0();
        this.y50.Ue0(value);
    }

    public void dispose() {
        I2 first = this.y50.ZD();
        while (first.hasNext()) {
            ((Ou0) first.next()).O4();
        }
        I2 second = this.Cz.ZD();
        while (second.hasNext()) {
            ((Ou0) second.next()).O4();
        }
        this.y50.clear();
        this.Cz.clear();
    }

    public void lpt1(float delta) {
        I2 first = this.y50.ZD();
        while (first.hasNext()) {
            ((Ou0) first.next()).P30(delta, null);
        }
        I2 second = this.Cz.ZD();
        while (second.hasNext()) {
            ((Ou0) second.next()).P30(delta, null);
        }
    }

    public void j80(U5 renderContext, ER renderer, BJ0 transform) {
        I2 iterator = this.y50.ZD();
        while (iterator.hasNext()) {
            Ou0 value = (Ou0) iterator.next();
            if (value.COm8(transform)) {
                renderer.Lh0(value, renderContext);
            }
        }
        renderer.A80(this.Cz, renderContext);
    }

    public void sn0(short[] values) {
    }

    public void rw(short[] values) {
        this.sn0(values);
    }
}
