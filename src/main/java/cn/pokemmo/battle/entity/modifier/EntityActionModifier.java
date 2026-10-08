package cn.pokemmo.battle.entity.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.E90;
import f.EA0;
import f.LT;
import f.hk0_1;
import f.rg0_1;


public class EntityActionModifier
extends BaseBattleModifier {
    public final  E90 hV;
    public final  int D00;
    public final  LT M20;

    public EntityActionModifier(E90 e90, int n, LT lT) {
        this.hV = e90;
        this.D00 = n;
        this.M20 = lT;
    }

    @Override
    public final void Gj0(EA0 eA0) {
        EntityActionModifier jo0_02 = this;
        jo0_02.hV.il0.Kg = this.D00 * 250;
        jo0_02.hV.il0.np = true;
        jo0_02.hV.il0.hw0(0L);
        jo0_02.hV.il0.b60 = hk0_1.KG;
        EntityActionModifier jo0_03 = this;
        short s = jo0_03.M20.Tz();
        short s2 = jo0_03.M20.HR();
        byte by = jo0_03.M20.Es();
        byte by2 = jo0_03.hV.ba0.Y30;
        jo0_02.hV.ba0.PX(this.M20.gr0(), s, s2, by, by2);
    }
}
