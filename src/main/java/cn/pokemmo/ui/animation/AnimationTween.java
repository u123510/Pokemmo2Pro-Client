package cn.pokemmo.ui.animation;

import cn.pokemmo.graphics.animation.tween.BaseTweenAccessor;

import aurelienribon.tweenengine.equations.Quad;
import f.*;
import java.util.HashMap;

/**
 * 补间动画核心模型 (Animation Tween Core)
 * 基于 Universal Tween Engine 架构，管理单个补间动画对象的属性插值、生命周期、缓动方程与对象池。
 * 驱动 PokeMMO 客户端所有的 UI 界面过渡、卡牌动作、窗口淡入淡出及缩放等核心补间动画。
 *
 * 对应混淆类: f.ao_1
 */
public class AnimationTween extends D2 {
    public static int Gy0;
    public static int zf0;
    public static final Ls Sk0;
    public static final HashMap LH0;
    public static final boolean Mg0;
    public Object vt0;
    public Class zz0;
    public BaseTweenAccessor cx;
    public int ts;
    public ah_1 Yn;
    public int Ia;
    public final float[] extends$;
    public final float[] h5;
    public float[] HX;
    public float[] a40;

    static {
        Mg0 = !AnimationTween.class.desiredAssertionStatus();
        Gy0 = 3;
        zf0 = 0;
        Sk0 = new Ls(new yl0_0());
        LH0 = new HashMap();
    }

    public AnimationTween() {
        int attributes = Gy0;
        this.extends$ = new float[attributes];
        this.h5 = new float[attributes];
        int waypoints = zf0;
        this.HX = new float[attributes];
        this.a40 = new float[(waypoints + 2) * attributes];
        this.Bt0();
    }

    public final void r70(Object target, int attribute, float duration) {
        if (duration < 0.0f) {
            throw new RuntimeException("Duration can't be negative");
        }
        this.vt0 = target;
        Class accessorClass;
        if (target == null) {
            accessorClass = null;
        } else if (LH0.containsKey(target.getClass())) {
            accessorClass = target.getClass();
        } else if (target instanceof BaseTweenAccessor) {
            accessorClass = target.getClass();
        } else {
            for (accessorClass = target.getClass().getSuperclass();
                 accessorClass != null && !LH0.containsKey(accessorClass);
                 accessorClass = accessorClass.getSuperclass()) {
            }
        }
        this.zz0 = accessorClass;
        this.ts = attribute;
        this.sS = duration;
    }

    public final void setup(Object target, int attribute, float duration) {
        r70(target, attribute, duration);
    }

    public final void Bt0() {
        this.NJ = -2;
        this.m70 = 0;
        this.Ug0 = false;
        this.vP = 0.0f;
        this.Gg = 0.0f;
        this.o80 = 0.0f;
        this.sS = 0.0f;
        this.Sq0 = 0.0f;
        this.w6 = false;
        this.Hn = false;
        this.vj0 = false;
        this.fb0 = false;
        this.xF0 = null;
        this.cOM8 = 8;
        this.G = true;
        this.ix = true;
        this.vt0 = null;
        this.zz0 = null;
        this.cx = null;
        this.ts = -1;
        this.Yn = null;
        this.Ia = 0;
        if (this.HX.length != Gy0) {
            this.HX = new float[Gy0];
        }
        int requiredSize = (zf0 + 2) * Gy0;
        if (this.a40.length != requiredSize) {
            this.a40 = new float[requiredSize];
        }
    }

    public final void reset() {
        Bt0();
    }

    public final ao_1 UD(float first, float second) {
        this.h5[0] = first;
        this.h5[1] = second;
        return (ao_1) this;
    }

    public final ao_1 target(float first, float second) {
        return UD(first, second);
    }

    public final ao_1 kt(float first, float second, float third) {
        this.h5[0] = first;
        this.h5[1] = second;
        this.h5[2] = third;
        return (ao_1) this;
    }

    public final ao_1 target(float first, float second, float third) {
        return kt(first, second, third);
    }

    public final ao_1 Om0(float... values) {
        if (values.length <= Gy0) {
            System.arraycopy(values, 0, this.h5, 0, values.length);
            return (ao_1) this;
        }
        throw new RuntimeException(fp0_0.uD(
                new StringBuilder("You cannot combine more than "), Gy0,
                " attributes in a tween. You can raise this limit with Tween.setCombinedAttributesLimit(), which should be called once in application initialization code."));
    }

    public final ao_1 target(float... values) {
        return Om0(values);
    }

    @Override
    public final void bC0() {
        Ls pool = Sk0;
        if (!pool.HF.contains(this)) {
            if (pool.LPT8 != null) {
                pool.LPT8.eC(this);
            }
            pool.HF.add(this);
        }
    }

    public final void free() {
        bC0();
    }

    @Override
    public final void SM() {
        Object target = this.vt0;
        if (target != null) {
            this.cx.AJ(target, this.ts, this.extends$);
            for (int i = 0; i < this.Ia; ++i) {
                this.h5[i] += 0.0f;
            }
        }
    }

    @Override
    public final void YW() {
        Object target = this.vt0;
        if (target != null) {
            this.cx.wl(target, this.ts, this.extends$);
        }
    }

    @Override
    public final void kQ() {
        Object target = this.vt0;
        if (target != null) {
            this.cx.wl(target, this.ts, this.h5);
        }
    }

    @Override
    public final Object C20() {
        if (this.vt0 == null) {
            return this;
        }
        this.cx = (BaseTweenAccessor) LH0.get(this.zz0);
        if (this.cx == null && this.vt0 instanceof BaseTweenAccessor) {
            this.cx = (BaseTweenAccessor) this.vt0;
        }
        if (this.cx == null) {
            throw new RuntimeException("No TweenAccessor was found for the target");
        }
        this.Ia = this.cx.AJ(this.vt0, this.ts, this.HX);
        if (this.Ia > Gy0) {
            throw new RuntimeException(fp0_0.uD(
                    new StringBuilder("You cannot combine more than "), Gy0,
                    " attributes in a tween. You can raise this limit with Tween.setCombinedAttributesLimit(), which should be called once in application initialization code."));
        }
        return this;
    }

    public final Object build() {
        return C20();
    }

    @Override
    public final void nA(boolean isReverse, int step, int repeatCount, float delta) {
        Object target = this.vt0;
        if (target == null || this.Yn == null) {
            return;
        }
        if (!isReverse && step > repeatCount) {
            this.cx.wl(target, this.ts, this.h5);
            return;
        }
        if (!isReverse && step < repeatCount) {
            this.cx.wl(target, this.ts, this.extends$);
            return;
        }
        if (!Mg0 && !isReverse) {
            throw new AssertionError();
        }
        if (!Mg0 && !(this.Gg >= 0.0f)) {
            throw new AssertionError();
        }
        if (!Mg0 && !(this.Gg <= this.sS)) {
            throw new AssertionError();
        }
        float duration = this.sS;
        if (duration < 1.0E-11f && delta > -1.0E-11f) {
            this.cx.wl(target, this.ts, this.extends$);
            return;
        }
        if (duration < 1.0E-11f && delta < 1.0E-11f) {
            this.cx.wl(target, this.ts, this.h5);
            return;
        }
        float ratio = this.Yn.compute(this.Gg / this.sS);
        for (int i = 0; i < this.Ia; ++i) {
            float start = this.extends$[i];
            this.HX[i] = fe_2.Ga0(this.h5[i], start, ratio, start);
        }
        this.cx.wl(target, this.ts, this.HX);
    }

    public static ao_1 DX(Object target, int attribute, float duration) {
        ao_1 tween = (ao_1) Sk0.u9();
        tween.r70(target, attribute, duration);
        tween.Yn = Quad.INOUT;
        return tween;
    }

    public static ao_1 to(Object target, int attribute, float duration) {
        return DX(target, attribute, duration);
    }

    public static ao_1 pc(LB0 timelineCallback) {
        ao_1 tween = (ao_1) Sk0.u9();
        tween.r70(null, -1, 0.0f);
        tween.xF0 = timelineCallback;
        tween.cOM8 = 2;
        return tween;
    }

    public static ao_1 call(LB0 callback) {
        return pc(callback);
    }

    public static ao_1 yp(int attribute, Object target) {
        ao_1 tween = (ao_1) Sk0.u9();
        tween.r70(target, attribute, 0.0f);
        tween.Yn = Quad.INOUT;
        return tween;
    }

    public static ao_1 set(Object target, int attribute) {
        return yp(attribute, target);
    }

    public static void xZ() {
        zf0 = 5;
    }

    public static void setWaypointsLimit(int limit) {
        zf0 = limit;
    }
}
