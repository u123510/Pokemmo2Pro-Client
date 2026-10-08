package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StairsMeshRenderer extends BaseMapMeshRenderer {
    public final Ou0[] hA;
    public final Ou0[][] vs0;

    public StairsMeshRenderer(p50_0 value) {
        super(value);
        this.hA = new Ou0[3];
        this.vs0 = new Ou0[2][9];

        for (int i = 0; i < 3; i++) {
            ra0_0.Ao0().getClass();
            this.hA[i] = ra0_0.UT(i);
            float offset = (2 - i) * 10.0f + 14.5f;
            this.hA[i].ho.el0(3.125f, -0.01f, offset * 0.25f);
            this.yS(this.hA[i]);
        }

        for (int row = 0; row < 2; row++) {
            int column = 0;
            while (column < 9) {
                int index = column % 3;
                ra0_0.Ao0().getClass();
                this.vs0[row][column] = ra0_0.R1(index);

                float offset = 16.5f;
                switch (column) {
                    case 1:
                    case 3:
                    case 5:
                        offset = 26.5f;
                        break;
                    case 2:
                    case 4:
                    case 6:
                        offset = 36.5f;
                        break;
                    default:
                        break;
                }

                int next = column + 1;
                float x = offset;
                float y = row * 9.5f + (next % 3) * 3.0f;
                float z = next * 0.001f * 0.25f;
                this.vs0[row][column].ho.el0(x, y, z);
                this.yS(this.vs0[row][column]);
                column = next;
            }
        }
    }

    public final void sn0(short[] values) {
        if (values.length < 2) {
            return;
        }

        int flag = values[0];
        int value = values[1];
        switch (value) {
            case 392:
                if (flag >= this.hA.length) {
                    return;
                }
                this.hA[flag].PE0 = 1.0f;
                this.hA[flag].sC0(0, false, null);
                return;
            case 391:
            case 393:
                if (flag >= this.vs0[1].length) {
                    return;
                }
                Ou0 item = this.vs0[1][flag];
                item.PE0 = value == 391 ? 1.0f : 0.0f;
                item.sC0(0, false, null);
                return;
            case 390:
                for (int i = 0; i < this.hA.length; i++) {
                    if ((flag & (1 << i)) != 0) {
                        this.hA[i].PE0 = 100000000.0f;
                        this.hA[i].sC0(0, false, null);
                    }
                }
                return;
            default:
                return;
        }
    }
}
