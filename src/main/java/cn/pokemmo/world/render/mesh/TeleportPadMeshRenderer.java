package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;

public class TeleportPadMeshRenderer extends BaseMapMeshRenderer {
    public static final C8 SL0 = new C8();
    public boolean NP;
    public boolean j90;
    public E90 Fe0;
    public final Ou0 kU;

    public TeleportPadMeshRenderer(hm_0 hm0) {
        super(hm0);
        this.NP = false;
        this.j90 = false;
        this.Fe0 = null;
        v80_0.Cb0().getClass();
        Ou0 ou0 = v80_0.sb((byte) 4, 111, false);
        this.kU = ou0;
        ou0.ho.m80(3.875f, 0.5f, 5.125f);
        ou0.sY = false;
        ou0.TU(0, true);
        this.yS(ou0);
    }

    @Override
    public final void lpt1(float f) {
        Matrix4 ho = this.kU.ho;
        C8 pos = SL0;
        ho.V1(pos);
        float targetY = this.NP ? 7.725f : 0.5f;
        float currentY = pos.y;
        if (currentY < targetY) {
            currentY += lg_0.S4.uL * 5.0f;
            pos.y = currentY;
            if (currentY >= targetY) {
                pos.y = targetY;
            }
            this.kU.ho.Y1(pos);
        } else if (currentY > targetY) {
            currentY -= lg_0.S4.uL * 5.0f;
            pos.y = currentY;
            if (currentY <= targetY) {
                pos.y = targetY;
            }
            this.kU.ho.Y1(pos);
        } else {
            this.j90 = false;
            if (this.Fe0 != null) {
                tw0_0.RE0.wp0((byte) 4, (short) 1552);
                tw0_0.RE0.Hq0((byte) 4, (short) 1561);
                this.Fe0.il0.f60(null, false, C8.Zero);
                this.Fe0.rd.il0.f60(null, false, C8.Zero);
                this.Fe0 = null;
            }
        }
        super.lpt1(f);
    }

    @Override
    public final void sn0(short[] arrs) {
        if (arrs.length < 1) {
            return;
        }
        short cmd = arrs[0];
        if (cmd == 4699) {
            this.ln(arrs[1], null);
        } else if (cmd == 4700) {
            yt_1 yt1 = tw0_0.e60;
            if (yt1 == null) {
                return;
            }
            this.ln(arrs[1], yt1.jB0);
        }
    }

    public final void ln(short s, E90 e90) {
        this.NP = (s == 1);
        if (e90 == null) {
            C8 pos = SL0;
            this.kU.ho.V1(pos);
            float targetY = this.NP ? 7.725f : 0.5f;
            pos.y = targetY;
            this.kU.ho.Y1(pos);
            this.kU.rF0();
            this.Fe0 = null;
        } else {
            this.j90 = true;
            tw0_0.RE0.Hq0((byte) 4, (short) 1552);
            yt_1 yt1 = tw0_0.e60;
            if (yt1 != null && yt1.jB0 != null) {
                this.Fe0 = yt1.jB0;
                this.Fe0.il0.f60(this.kU, true, C8.Zero);
                this.Fe0.rd.il0.f60(this.kU, true, C8.Zero);
                tw0_0.rl.xm = new Ht0((f.rf_1)(Object)this);
            }
        }
        for (short dy = -1; dy < 2; dy++) {
            for (short dx = -1; dx < 2; dx++) {
                Ll0 tile = this.WK.rc0((byte) 0, (short) (dx + 20), (short) (dy + 15));
                if (tile == null) {
                    return;
                }
                tile.Ds0 = this.NP ? 31.0f : 2.0f;
            }
        }
    }
}
