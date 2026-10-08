package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.IF
 */
public class Modern_Battle_If extends vc_0 {

    public final U10 O5;

    public Modern_Battle_If(U10 owner) {
        super();
        this.O5 = owner;
    }

    @Override
    public final boolean tI(float first, float second) {
        this.O5.Jo();
        U10 state = this.O5;
        boolean primary = state.xU;
        if (!primary && !state.bc0) {
            return false;
        }
        if (primary) {
            if (state.bc0 || second != 0.0f) {
                float swap = second;
                second = first;
                first = swap;
            } else {
                second = first;
            }
        } else if (state.bc0 && first == 0.0f) {
            first = second;
        } else {
            float swap = second;
            second = first;
            first = swap;
        }

        float currentHorizontal = state.gQ;
        float limitHorizontal = state.vJ.Eu0;
        float targetHorizontal = Math.min(
            limitHorizontal,
            Math.max(limitHorizontal * 0.9f, state.lp0 * 0.1f) / 4.0f)
            * first + currentHorizontal;
        state.gQ = LW.r1(targetHorizontal, 0.0f, state.lp0);

        float currentVertical = state.t60;
        float limitVertical = state.vJ.IA;
        float targetVertical = Math.min(
            limitVertical,
            Math.max(limitVertical * 0.9f, state.mI * 0.1f) / 4.0f)
            * second + currentVertical;
        state.t60 = LW.r1(targetVertical, 0.0f, state.mI);
        return true;
    }
}

