package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ShadowBatchMeshRenderer extends BaseMapMeshRenderer {
    public boolean Gf0;
    public Ou0 sV;
    public Ou0 VQ;

    public ShadowBatchMeshRenderer(hm_0 value) {
        super(value);
        this.Gf0 = false;
    }

    @Override
    public final void lpt1(float delta) {
        if (!this.Gf0) {
            I2 effects = tw0_0.LD0.Sc.qf.ZD();
            while (effects.hasNext()) {
                nv0_0 effect = (nv0_0) effects.next();
                XF0 mode = this.WK;
                if (effect.EK.O60 != J4.p5(mode.Bm0, mode.case$)) {
                    continue;
                }
                this.Gf0 = true;
                Ou0 front = null;
                I2 children = effect.yf0.ZD();
                while (children.hasNext()) {
                    Ou0 child = (Ou0) children.next();
                    if ("mg06_fl1".equals(child.yI0)) {
                        front = child;
                    } else if ("mg06_swc".equals(child.yI0)) {
                        this.VQ = child;
                    }
                }
                if (front == null) {
                    continue;
                }
                v80_0.Cb0().getClass();
                this.sV = v80_0.sb((byte) 4, 174, false);
                this.sV.ho.Dd0(front.ho.EW);
                this.sV.rF0();
                this.y50.Ue0(this.sV);
                this.sV.ia("mg06_fl2", true);
                this.sV.fm0("mg06_fl2", true);
                effect.yf0.sj0(front, true);
                front.O4();
            }
        }
        super.lpt1(delta);
    }

    @Override
    public final void sn0(short[] values) {
        if (values.length < 1) {
            return;
        }
        switch (values[0]) {
            case 4703:
                this.sV.PE0 = 100000000F;
                this.sV.sC0(0, false, null);
                return;
            case 4702:
                this.sV.sC0(0, false, null);
                this.VQ.sC0(0, false, null);
                return;
            default:
                return;
        }
    }
}
