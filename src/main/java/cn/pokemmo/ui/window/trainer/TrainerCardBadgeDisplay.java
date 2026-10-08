package cn.pokemmo.ui.window.trainer;

import f.*;

public class TrainerCardBadgeDisplay extends EU {
    public static final boolean tv0 = !ob_0.class.desiredAssertionStatus();
    public final EU[] EJ0;
    public final int D9;
    public final int G0;

    public TrainerCardBadgeDisplay(EU[] children, int repeat) {
        super();
        this.EJ0 = children;
        this.D9 = repeat;
        if (!tv0 && repeat < 0) throw new AssertionError();
        if (!tv0 && children.length <= 0) throw new AssertionError();
        for (EU child : children) this.Dh += child.Dh;
        this.G0 = this.Dh;
        if (repeat == 0) this.Dh = Integer.MAX_VALUE;
        else this.Dh *= repeat;
    }

    @Override public final int a0() {
        int result = 0;
        for (EU child : EJ0) result = Math.max(result, child.a0());
        return result;
    }

    @Override public final int zt0() {
        int result = 0;
        for (EU child : EJ0) result = Math.max(result, child.zt0());
        return result;
    }

    @Override public final com3__2 jo() { return EJ0[0].jo(); }

    @Override
    public final void Cs0(int index, com3__2 image, int x, int y, int width, int height, ob_0 state, rb_1 rules) {
        if (G0 == 0) return;
        int childIndex = 0;
        if (D9 == 0) {
            index %= G0;
        } else {
            childIndex = index / G0;
            index -= Math.min(childIndex, D9 - 1) * G0;
        }
        EU child = null;
        for (int i = 0; i < EJ0.length; i++) {
            child = EJ0[i];
            int duration = child.Dh;
            if (index < duration && duration > 0) {
                i++;
                if (i < EJ0.length) image = EJ0[i].jo();
                else {
                    if (D9 != 0 && childIndex + 1 >= D9) break;
                    image = EJ0[0].jo();
                }
                break;
            }
            index -= duration;
        }
        if (child != null) child.Cs0(index, image, x, y, width, height, state, rules);
    }
}
