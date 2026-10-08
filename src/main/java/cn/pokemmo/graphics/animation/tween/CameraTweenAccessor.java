package cn.pokemmo.graphics.animation.tween;

import f.*;

public class CameraTweenAccessor implements BaseTweenAccessor, f.BD {
    public static final boolean wv0;

    static {
        wv0 = !CameraTweenAccessor.class.desiredAssertionStatus();
    }

    private static void fail() {
        if (!wv0) {
            throw new AssertionError();
        }
    }

    @Override
    public final void wl(Object value, int index, float[] data) {
        BJ0 camera = (BJ0) value;
        switch (index) {
            case 1:
                camera.JP(data[0], camera.x90.y, camera.x90.z);
                return;
            case 2:
                camera.JP(camera.x90.x, data[0], camera.x90.z);
                return;
            case 3:
                camera.JP(camera.x90.x, camera.x90.y, data[0]);
                return;
            case 4:
                camera.JP(data[0], data[1], data[2]);
                camera.ye(true);
                return;
            case 5:
                C8 pivot = camera.St0.np(C8.Y);
                camera.Aj(camera.rj, pivot, data[0] - camera.d00);
                camera.d00 = data[0];
                camera.ye(true);
                return;
            case 6:
                camera.PB(data[0], true);
                return;
            case 7:
                camera.Rg0 = data[0];
                camera.JP(camera.x90.x, camera.x90.y, camera.x90.z);
                camera.ye(true);
                return;
            case 8:
                camera.zo0 = data[0];
                camera.ye(true);
                return;
            case 9:
                camera.Y90(data[0], data[1], data[2]);
                camera.ye(true);
                return;
            case 10:
                camera.Ws0.x = data[0];
                camera.Ws0.y = data[1];
                camera.Ws0.z = data[2];
                camera.JP(camera.x90.x, camera.x90.y, camera.x90.z);
                return;
            default:
                fail();
        }
    }

    @Override
    public final int AJ(Object value, int index, float[] data) {
        BJ0 camera = (BJ0) value;
        switch (index) {
            case 1:
                data[0] = camera.x90.x;
                return 1;
            case 2:
                data[0] = camera.x90.y;
                return 1;
            case 3:
                data[0] = camera.x90.z;
                return 1;
            case 4:
                data[0] = camera.x90.x;
                data[1] = camera.x90.y;
                data[2] = camera.x90.z;
                return 3;
            case 5:
                data[0] = camera.d00;
                return 1;
            case 6:
                data[0] = camera.Q30;
                return 1;
            case 7:
                data[0] = camera.Rg0;
                return 1;
            case 8:
                data[0] = camera.zo0;
                return 1;
            case 9:
                data[0] = camera.rj.x;
                data[1] = camera.rj.y;
                data[2] = camera.rj.z;
                return 3;
            case 10:
                data[0] = camera.Ws0.x;
                data[1] = camera.Ws0.y;
                data[2] = camera.Ws0.z;
                return 3;
            default:
                if (wv0) {
                    return 0;
                }
                throw new AssertionError();
        }
    }
}
