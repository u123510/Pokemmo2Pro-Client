package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;

public class TerrainChunkMeshRenderer extends BaseMapMeshRenderer {
    public static final Matrix4 Vn;
    public final cr0_0 NQ;

    static {
        Vn = new Matrix4();
    }

    public TerrainChunkMeshRenderer(p50_0 v1, cr0_0 v2) {
        super(v1);
        this.NQ = v2;
        nj0_0 qz0 = tw0_0.Ll0.Qz0;
        FJ archive = new FJ(qz0.nuL().COM7("/a/1/3/0"));
        ku_0 ku = ku_0.zn(archive.EG(0).j90());
        es_1 list = new es_1(36);
        for (int i = 2; i < 16; i++) {
            list.Ue0(DI0.Bw(archive.EG(i).j90()));
        }
        for (int i = 16; i < 36; i++) {
            list.Ue0(ta0_0.Af0(archive.EG(i).j90()));
        }
        Er0 er0 = new Er0(archive.EG(1).j90());
        v80_0 v8 = v80_0.Cb0();
        v8.getClass();
        Ou0 model = v80_0.vf0(ku.KV[0], er0.E10, list);
        short mapId = v1.gd0();
        if (mapId == 12 || mapId == 140) {
            model.ho.el0(0.25f, -0.01f, 2.125f);
            C8 axisY = C8.Y;
            model.ho.tO(axisY, 90.0f);
            Vn.F().tO(axisY, 90.0f);
            model.Mp0.R00(Vn);
            model.Mp0.jG0.na(0.25f, -0.01f, 2.125f);
            model.Mp0.Xa0.na(0.25f, -0.01f, 2.125f);
        } else if (mapId == 137) {
            model.ho.el0(2.125f, -0.01f, 0.7f);
            model.Mp0.jG0.na(2.125f, -0.01f, 0.7f);
            model.Mp0.Xa0.na(2.125f, -0.01f, 0.7f);
        } else if (mapId == 138) {
            model.ho.el0(1.875f, -0.01f, 0.5f);
            model.Mp0.jG0.na(1.875f, -0.01f, 0.5f);
            model.Mp0.Xa0.na(1.875f, -0.01f, 0.5f);
        } else {
            model.ho.el0(2.125f, -0.01f, 0.6f);
            model.Mp0.jG0.na(2.125f, -0.01f, 0.6f);
            model.Mp0.Xa0.na(2.125f, -0.01f, 0.6f);
        }
        model.Mp0.nF(model.Mp0.jG0, model.Mp0.Xa0);
        yS(model);

        int animIndex;
        switch (v1.p4()) {
            case 27:
                animIndex = 10;
                break;
            case 51:
            case 90:
            case 92:
                animIndex = 12;
                break;
            case 91:
                animIndex = 13;
                break;
            case 131:
            case 132:
            case 133:
                animIndex = 16;
                break;
            case 159:
                animIndex = 22;
                break;
            case 251:
            case 252:
                animIndex = 11;
                break;
            case 318:
                animIndex = 8;
                break;
            case 320:
                animIndex = 9;
                break;
            case 366:
            case 369:
                animIndex = 18;
                break;
            case 372:
                animIndex = 19;
                break;
            case 375:
            case 379:
                animIndex = 20;
                break;
            default:
                animIndex = 0;
                break;
        }
        model.PE0 = 0.25f;
        model.TU(0, true);
        model.TU(animIndex, true);
    }

    public final void sn0(short[] v1) {
        if (v1[0] == 382) {
            short flag = 0;
            C8 pos = new C8();
            short sm = this.WK.i80.SM;
            if (sm == 12 || sm == 140) {
                pos.x = 0.25f;
                pos.y = -0.01f;
                pos.z = 2.125f;
                flag = (short) 16383;
            } else if (sm == 137) {
                pos.x = 2.125f;
                pos.y = -0.01f;
                pos.z = 0.7f;
            } else if (sm == 138) {
                pos.x = 1.875f;
                pos.y = -0.01f;
                pos.z = 0.5f;
            } else {
                pos.x = 2.125f;
                pos.y = 0.0f;
                pos.z = 0.6f;
            }
            pos.y = 0.5f;
            pos.Fg0(4.0f);
            iw0_0 listener = new iw0_0((f.com3__5)(Object)this);
            tw0_0.rl.xm = listener;
            this.NQ.VI(false, (short) 0, flag, 8.0f, pos.x, pos.y, pos.z, (short) 36);
            this.NQ.COM4.xF0 = new kc0_1(listener);
        }
    }
}
