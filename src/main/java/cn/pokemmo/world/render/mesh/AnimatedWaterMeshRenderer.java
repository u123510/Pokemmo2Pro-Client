package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.HashMap;

public class AnimatedWaterMeshRenderer extends BaseMapMeshRenderer implements fy0_0 {
    public static final dl_1 nJ;
    public final C8 Gz0;
    public final C8 KA0;
    public final es_1 jD;
    public final nb_2 lT;
    public final an_0 Qd;
    public final am_2 yc0;
    public final float Gy;

    static {
        nJ = Cq0.E1(AnimatedWaterMeshRenderer.class);
    }

    public AnimatedWaterMeshRenderer(p50_0 param1) {
        super(param1);
        this.Gz0 = new C8();
        this.KA0 = new C8(4.0f, 0.0f, 3.0f);
        this.jD = new es_1(false, 16);
        this.Gy = 64.0f;
        ns0_0 localNs = tw0_0.Ll0.Qz0.s30().wM(MG0.rm, 18);
        this.Qd = localNs.hW;
        this.lT = localNs.MM;
        this.yc0 = tw0_0.Ll0.Qz0.EL0(MG0.rm, 18);
        Yy(75, 0.0f, 0.0f);
        Yy(75, 4.0f, 0.0f);
        Yy(75, 0.0f, 2.0f);
        Yy(75, 4.0f, 2.0f);
        Yy(75, 0.0f, 4.0f);
        Yy(75, 4.0f, 4.0f);
        Yy(187, 2.0f, 6.0f);
        Yy(183, 0.0f, 8.0f);
        Yy(182, 4.0f, 8.0f);
        Yy(216, 8.0f, 2.0f);
        Yy(216, 8.0f, 4.0f);
        Yy(214, 8.0f, 8.0f);
        Yy(213, 2.0f, 10.0f);
        Yy(213, 6.0f, 10.0f);
        localNs.MM.b20();
        param1.Xg0().Sq0((short) 1).DS();
    }

    @Override
    public final void dispose() {
        super.dispose();
        I2 it = this.jD.ZD();
        while (it.hasNext()) {
            ((pc_1) it.next()).dispose();
        }
        this.jD.clear();
    }

    public final void Yy(int i1, float f2, float f3) {
        JC0 model = (JC0) this.Qd.i8.get(Short.valueOf((short) i1));
        if (model == null) {
            nJ.info("Unable to load model: {}", Integer.valueOf(i1));
            return;
        }
        model.ZJ();
        ku_0 ku = model.iK0;
        Ou0 anim;
        if (this.lT.fl(Integer.valueOf(i1))) {
            anim = new Ou0((Ou0) this.lT.Wk0(Integer.valueOf(i1)));
            anim.AD = i1;
        } else {
            pc_1 pc = new pc_1();
            this.jD.Ue0(pc);
            vt_0 vt = ku.KV[0];
            pc.Od0(vt, this.yc0);
            Ou0 createdAnim = null;
            if (dw_2.bn) {
                createdAnim = tw0_0.KW.bG0[2].yt0(MG0.rm, 18, model.im, pc);
                if (createdAnim != null && model.JA.KB > 0) {
                    v80_0.Cb0().D7(createdAnim, this.yc0, pc, model.JA);
                }
            }
            if (createdAnim == null) {
                v80_0.Cb0();
                v80_0.fo0(ku.KV[0], this.yc0);
                createdAnim = v80_0.Cb0().a40(ku.KV[0], pc, this.yc0, model.JA, this.Gy / ku.KV[0].Iu0, false, false);
            }
            anim = createdAnim;
            this.lT.WK0(Integer.valueOf(i1), anim);
            anim.AD = i1;
        }

        this.Gz0.x = f2;
        this.Gz0.y = 0.0f;
        this.Gz0.z = f3;
        C8 ka = this.KA0;
        this.Gz0.na(ka.x, ka.y, ka.z);
        anim.ho.el0(this.Gz0.x, this.Gz0.y, this.Gz0.z);
        anim.Mp0.jG0.na(this.Gz0.x, this.Gz0.y, this.Gz0.z);
        anim.Mp0.Xa0.na(this.Gz0.x, this.Gz0.y, this.Gz0.z);
        anim.Mp0.nF(anim.Mp0.jG0, anim.Mp0.Xa0);
        this.y50.Ue0(anim);
        anim.sC0(1, false, null);
    }
}
