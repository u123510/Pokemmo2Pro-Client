package f;

import cn.pokemmo.battle.field.FieldWeatherEffectState;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.gt0_0
 * 核心实现已迁移至 {@link cn.pokemmo.battle.field.FieldWeatherEffectState}
 */
public final class gt0_0 extends FieldWeatherEffectState {
    public static final gt0_0 TU;
    public static final gt0_0 jI;
    public static final gt0_0 It;
    public static final bm0_1 jn0;
    public static final gt0_0[] RL0;
    public static final gt0_0[] FA0;

    public gt0_0(int id, float value, byte kind) {
        super(id, value, kind);
    }

    static {

        gt0_0 first = new gt0_0(0, -1.0F, (byte) -1);
        TU = first;
        gt0_0 second = new gt0_0(1, 0.0F, (byte) 23);
        gt0_0 third = new gt0_0(2, 450.0F, (byte) 32);
        gt0_0 fourth = new gt0_0(3, 550.0F, (byte) 28);
        gt0_0 fifth = new gt0_0(4, 650.0F, (byte) 33);
        gt0_0 sixth = new gt0_0(5, Float.MAX_VALUE, (byte) 30);
        jI = sixth;
        gt0_0 seventh = new gt0_0(6, Float.MAX_VALUE, (byte) 37);
        It = seventh;
        FA0 = new gt0_0[]{first, second, third, fourth, fifth, sixth, seventh};
        jn0 = new bm0_1();
        for (gt0_0 value : FA0.clone()) {
            jn0.gE0(value.J0, value);
        }
        RL0 = FA0.clone();
    
        FieldWeatherEffectState.TU = TU;
        FieldWeatherEffectState.jI = jI;
        FieldWeatherEffectState.It = It;
        FieldWeatherEffectState.jn0 = jn0;
        FieldWeatherEffectState.RL0 = RL0;
        FieldWeatherEffectState.FA0 = FA0;
    }
}
