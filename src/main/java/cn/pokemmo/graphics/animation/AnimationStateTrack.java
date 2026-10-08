package cn.pokemmo.graphics.animation;

import f.KG0;
import f.MD0;
import f.ou_1;

public class AnimationStateTrack implements ou_1 {
    public final KG0 ue0;
    public final MD0 De0;

    public AnimationStateTrack(KG0 v1, MD0 v2) {
        if (v1 == null) {
            throw new NullPointerException("animState");
        }
        if (v2 == null) {
            throw new NullPointerException("animStateKey");
        }
        this.ue0 = v1;
        this.De0 = v2;
    }

    @Override
    public int Oe() {
        return this.ue0.Bd(this.De0);
    }

    @Override
    public void oM() {
        this.ue0.Mk(this.De0);
    }
}
