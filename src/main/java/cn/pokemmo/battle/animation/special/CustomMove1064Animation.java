package cn.pokemmo.battle.animation.special;

import f.*;

import com.badlogic.gdx.graphics.Color;
import java.util.Arrays;

/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1064]
 * 原始类: f.Om0
 */
public class CustomMove1064Animation extends MU {
    public static final Color KF0;
    public static final Color Ua;

    public CustomMove1064Animation(PF effect) {
        super(effect);
        this.kA0(Arrays.stream(tw0_0.PK0.QY())
                .flatMap(array -> Arrays.stream(array))
                .filter(CustomMove1064Animation::qy0)
                .toArray(CustomMove1064Animation::rs0));
    }

    public static PF[] rs0(int length) {
        return new PF[length];
    }

    public static boolean qy0(PF effect) {
        return effect != null && !effect.zi0.hf0();
    }

    static {
        KF0 = Color.valueOf("#ffbf00");
        Ua = Color.valueOf("#f168be");
        Ua.a = 1.0f;
    }

    @Override
    public final void kA0(PF[] effects) {
    }

    @Override
    public final MU vv(PF effect) {
        return this;
    }

    @Override
    public final MU us() {
        pw_1 animation = pw_1.xC().Xf0();
        animation = animation.xi0(this.i6((byte) 2, (short) 1675, 1, 14, 0.0f, 1.0f, this.Vz0));
        animation.y80(this.Zb0(34, Ua));

        animation.y80(ao_1.pc(new lpt4__4(this, 2, true)));
        animation = animation.xi0(this.Ue0(4, 0, 0.0f, 1.0f, 0.05f));
        animation = animation.xi0(this.Wt(4, 0.7f));
        animation = animation.mz0().Xf0();
        animation.y80(ao_1.pc(new lpt4__4(this, 0, false)));
        animation.y80(ao_1.pc(new lpt4__4(this, 1, false)));
        animation = animation.xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.05f));
        animation = animation.xi0(this.mf0(4, 0, 2, 1.4f));
        animation.y80(this.E2(14, true));
        animation.y80(this.E2(16, true));
        animation = animation.TD0().p1(0.64f);
        animation = animation.xi0(this.WW(16, 1.2f, 0.0f, 0.8125f, KF0));
        animation = animation.mz0().TD0().p1(0.96f);
        animation = animation.xi0(this.WW(16, 0.5f, 0.8125f, 0.0f, KF0));
        animation = animation.mz0().mz0();
        animation = animation.xi0(this.Ue0(3, 0, 0.0f, 0.9375f, 0.05f)).Xf0();

        animation = animation.xi0(this.i6((byte) 2, (short) 1694, 1, 14, 0.0f, 1.0f, this.Vz0));
        animation.y80(ao_1.pc(new lpt4__4(this, 0, true)));
        animation.y80(ao_1.pc(new lpt4__4(this, 1, true)));
        animation = animation.xi0(this.Ue0(2, 0, 0.9375f, 0.0f, 0.05f));
        animation = animation.xi0(this.nM(16, 0));
        animation.y80(this.E2(14, false));
        animation.y80(this.E2(16, false));
        animation = animation.xi0(this.tP(0.4f));
        animation.y80(this.E2(18, false));
        animation = animation.mz0();
        this.E8 = animation;
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}
