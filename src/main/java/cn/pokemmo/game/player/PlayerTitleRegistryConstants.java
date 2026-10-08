package cn.pokemmo.game.player;

import f.*;

public abstract class PlayerTitleRegistryConstants {
    public static void ej0(pa0_0 alignment, le0_2 target, int offset, int width, int height) {
        pw_1 timeline = pw_1.xC();
        int x = alignment.uD0(target.Mx, width) + offset;
        int y = alignment.Kr0(target.OB, height) + offset;
        switch (alignment.ordinal()) {
            case 4:
                ao_1 initial = ao_1.yp(2, target);
                initial.h5[0] = y + target.OB;
                timeline.y80(initial);
                ao_1 move = ao_1.DX(target, 2, 0.15f);
                move.h5[0] = y;
                timeline.y80(move);
                break;
            case 2:
                initial = ao_1.yp(1, target);
                initial.h5[0] = x + target.Mx;
                timeline.y80(initial);
                move = ao_1.DX(target, 1, 0.15f);
                move.h5[0] = x;
                timeline.y80(move);
                break;
            case 0:
                initial = ao_1.yp(1, target);
                initial.h5[0] = x - target.Mx;
                timeline.y80(initial);
                move = ao_1.DX(target, 1, 0.15f);
                move.h5[0] = x;
                timeline.y80(move);
                break;
            default:
                break;
        }
        timeline.Ms(tw0_0.LD0.lY);
    }

    public static pw_1 JW(pa0_0 alignment, le0_2 target, int width, int height, LB0 callback) {
        pw_1 timeline = pw_1.xC();
        int x = alignment.uD0(target.Mx, width);
        int y = alignment.Kr0(target.OB, height);
        ao_1 move;
        switch (alignment.ordinal()) {
            case 4:
                move = ao_1.DX(target, 2, 0.15f);
                move.h5[0] = y + target.OB;
                timeline.y80(move);
                break;
            case 3:
                move = ao_1.DX(target, 2, 0.15f);
                move.h5[0] = y - target.OB;
                timeline.y80(move);
                break;
            case 2:
                move = ao_1.DX(target, 1, 0.15f);
                move.h5[0] = x + target.Mx;
                timeline.y80(move);
                break;
            case 0:
                move = ao_1.DX(target, 1, 0.15f);
                move.h5[0] = x - target.Mx;
                timeline.y80(move);
                break;
            default:
                break;
        }
        if (callback != null) {
            timeline.xF0 = callback;
        }
        timeline.Ms(tw0_0.LD0.lY);
        return timeline;
    }
}
