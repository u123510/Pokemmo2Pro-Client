package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattlePokemonSummaryModifier extends TC0 {
    public final H60 f;
    public final Mj oX;

    public BattlePokemonSummaryModifier(H60 h60, Mj mj) {
        super();
        this.f = h60;
        this.oX = mj;
    }

    public final void QC(ML0 ml0) {
        if (this.oX != null) {
            this.oX.hD(this.f.jH);
        }
    }
}
