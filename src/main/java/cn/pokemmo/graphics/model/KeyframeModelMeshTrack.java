package cn.pokemmo.graphics.model;

import f.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class KeyframeModelMeshTrack {
    public final YN[] su;
    public final m50[] gL;
    public final NG0[] Oy;
    public final ax_1[] sg;
    public final us_1[] tG0;

    public KeyframeModelMeshTrack(Ae resource) {
        new ArrayList<>();
        new ArrayList<>();
        new ArrayList<>();

        ByteBuffer data = resource.j90();
        if (data.getInt() != 0) {
            throw new RuntimeException();
        }
        data.getInt();
        int meshGate = data.getInt();
        int objectGate = data.getInt();
        int vertexGate = data.getInt();

        YN[] su;
        if (vertexGate > 0) {
            int count = data.getInt();
            su = new YN[count];
            for (int i = 0; i < count; i++) {
                su[i] = new YN(data);
            }
        } else {
            su = new YN[0];
        }

        m50[] gL;
        if (meshGate > 0) {
            int count = data.getInt();
            gL = new m50[count];
            for (int i = 0; i < count; i++) {
                gL[i] = new m50(data);
            }
        } else {
            gL = new m50[0];
        }

        NG0[] oy;
        if (objectGate > 0) {
            int count = data.getInt();
            oy = new NG0[count];
            for (int i = 0; i < count; i++) {
                oy[i] = new NG0(data);
            }
        } else {
            oy = new NG0[0];
        }

        ax_1[] sg;
        us_1[] tg0;
        if (vertexGate > 0) {
            int axCount = data.getInt();
            int usCount = data.getInt();
            data.getInt();
            sg = new ax_1[axCount];
            for (int i = 0; i < axCount; i++) {
                sg[i] = new ax_1(data);
            }
            tg0 = new us_1[usCount];
            for (int i = 0; i < usCount; i++) {
                tg0[i] = new us_1(data);
            }
        } else {
            sg = new ax_1[0];
            tg0 = new us_1[0];
        }
        this.su = su;
        this.gL = gL;
        this.Oy = oy;
        this.sg = sg;
        this.tG0 = tg0;
    }
}
