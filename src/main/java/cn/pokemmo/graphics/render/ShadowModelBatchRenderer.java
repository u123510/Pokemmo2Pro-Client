package cn.pokemmo.graphics.render;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;
import f.*;
import java.util.Iterator;

/**
 * 现代化重构类 - 原始类: f.fh_1
 */
public class ShadowModelBatchRenderer implements fy0_0 {

    public float[] ur0;
    public ap0_0 LN;
    public final cd_1 Ad;
    public Tq0 uv;
    public final dw_1 rj;
    public final es_1 COM8;

    public ShadowModelBatchRenderer(Tq0 v1) {
        this(1000, v1);
    }

    public ShadowModelBatchRenderer(int i1, Tq0 v2) {
        this.Ad = new cd_1();
        this.rj = new dw_1();
        this.COM8 = new es_1(16);
        Jz0(i1);
        nt(v2);
    }

    public final void nt(Tq0 v1) {
        this.uv = v1;
    }

    public final void Jz0(int i1) {
        this.ur0 = new float[i1 * 24];
        VV v2 = VV.mR;
        if (lg_0.MA != null) {
            v2 = VV.at;
        }
        int i3 = i1 * 4;
        int i4 = i1 * 6;
        kz_0[] v5 = new kz_0[] {
            new kz_0(1, 3, "a_position"),
            new kz_0(4, 4, "a_color"),
            new kz_0(4, 4, "a_color_mix"),
            new kz_0(16, 2, "a_texCoord0")
        };
        this.LN = new ap0_0(v2, false, i3, i4, v5);
        short[] v1 = new short[i4];
        int i2 = 0;
        int i3_idx = 0;
        while (i3_idx < i4) {
            v1[i3_idx] = (short) i2;
            v1[i3_idx + 1] = (short) (i2 + 2);
            v1[i3_idx + 2] = (short) (i2 + 1);
            v1[i3_idx + 3] = (short) (i2 + 1);
            v1[i3_idx + 4] = (short) (i2 + 2);
            v1[i3_idx + 5] = (short) (i2 + 3);
            i3_idx += 6;
            i2 += 4;
        }
        this.LN.Sw0.Gy0(i4, v1);
    }

    public final void ni0(lc_0 v1) {
        this.uv.getClass();
        int i2 = (v1.i80.c0 == -1 ? 1 : 0) ^ 1;
        cd_1 cd_1Var = this.Ad;
        es_1 v3 = null;
        tb0_0 v4 = cd_1Var.vk0;
        if (v4 != null) {
            while (true) {
                tb0_0 v5 = v4.AL;
                if (v5 == null || v4.gd >= i2) {
                    break;
                }
                v4 = v5;
            }
            if (v4.gd == i2) {
                v3 = (es_1) v4.S8;
            }
        }
        if (v3 == null) {
            v3 = (es_1) this.rj.obtain();
            v3.clear();
            this.COM8.Ue0(v3);
            cd_1 this_ad = this.Ad;
            tb0_0 v4_node = this_ad.vk0;
            if (v4_node != null) {
                tb0_0 v5_node;
                while (true) {
                    v5_node = v4_node.AL;
                    if (v5_node == null || v5_node.gd > i2) {
                        break;
                    }
                    v4_node = v5_node;
                }
                int i6 = v4_node.gd;
                if (i2 > i6) {
                    tb0_0 new_node = this_ad.sp0.uV(v4_node, v5_node, v3, i2);
                    v4_node.AL = new_node;
                    tb0_0 v2_next = new_node.AL;
                    if (v2_next != null) {
                        v2_next.Zw0 = new_node;
                    }
                } else if (i2 < i6) {
                    tb0_0 new_node = this_ad.sp0.uV(null, this_ad.vk0, v3, i2);
                    this_ad.vk0.Zw0 = new_node;
                    this_ad.vk0 = new_node;
                } else {
                    v4_node.S8 = v3;
                }
            } else {
                this_ad.vk0 = this_ad.sp0.uV(null, null, v3, i2);
            }
        }
        v3.Ue0(v1);
    }

    public final void JF0() {
        Tq0 v1 = this.uv;
        v1.getClass();
        lg_0.OH0.glEnable(2929);
        lt_1 we0 = v1.We0;
        lg_0.Sf0.glUseProgram(we0.lH);
        Matrix4 iJ = v1.LU.iJ;
        int u_proj = we0.WD0("u_projectionViewMatrix", lt_1.Ln0);
        lg_0.Sf0.glUniformMatrix4fv(u_proj, 1, false, iJ.EW, 0);
        we0.WI();
        int u_tex = we0.WD0("u_texture", lt_1.Ln0);
        lg_0.Sf0.glUniform1i(u_tex, 0);
        if (v1.Py != null) {
            float f4 = v1.LU.v40.x;
            float f5 = v1.LU.v40.y;
            float f6 = v1.LU.v40.z;
            float f7 = 1.1881f / (v1.LU.Qy * v1.LU.Qy);
            int u_cam = v1.We0.WD0("u_cameraPosition", lt_1.Ln0);
            lg_0.Sf0.glUniform4f(u_cam, f4, f5, f6, f7);
            if (v1.Py.tM(PRN_.YI0)) {
                Color v50 = ((PRN_) v1.Py.sg(PRN_.YI0)).v50;
                int u_fog = v1.We0.WD0("u_fogColor", lt_1.Ln0);
                lg_0.Sf0.glUniform4f(u_fog, v50.r, v50.g, v50.b, v50.a);
            } else {
                Color black = Color.BLACK;
                int u_fog = v1.We0.WD0("u_fogColor", lt_1.Ln0);
                lg_0.Sf0.glUniform4f(u_fog, black.r, black.g, black.b, black.a);
            }
        }
        Iterator it = this.Ad.iterator();
        while (it.hasNext()) {
            tb0_0 node = (tb0_0) it.next();
            Tq0 tq0 = this.uv;
            int gd = node.gd;
            es_1 list = (es_1) node.S8;
            tq0.getClass();
            if (gd == 1) {
                lg_0.OH0.glEnable(3042);
                list.sort(tq0.FI);
            } else {
                int kb = list.KB;
                for (int i5 = 0; i5 < kb; i5++) {
                    lc_0 lc = (lc_0) list.get(i5);
                    es_1 subList = (es_1) tq0.dd0.Wk0(lc.i80);
                    if (subList == null) {
                        subList = (es_1) tq0.eq.obtain();
                        subList.clear();
                        tq0.ok.Ue0(subList);
                        tq0.dd0.WK0(lc.i80, subList);
                    }
                    subList.Ue0(lc);
                }
                list.clear();
                be_2 vals = tq0.dd0.Ww0();
                vals.getClass();
                while (vals.hasNext()) {
                    es_1 sl = (es_1) vals.next();
                    list.G6(sl.rZ, 0, sl.KB);
                }
                tq0.dd0.b20();
                tq0.eq.freeAll(tq0.ok);
                tq0.ok.clear();
            }
            lt_1 shader = this.uv.We0;
            wd0_2 lastWd = null;
            int vertexOffset = 0;
            I2 it2 = ((es_1) node.S8).ZD();
            while (it2.hasNext()) {
                HG hg = (HG) it2.next();
                if (lastWd == null || !lastWd.equals(hg.i80)) {
                    if (vertexOffset > 0) {
                        Y0(vertexOffset, shader);
                        vertexOffset = 0;
                    }
                    wd0_2 curWd = hg.i80;
                    curWd.sI0.OB.bind(0);
                    int c0 = curWd.c0;
                    if (c0 != -1) {
                        lg_0.OH0.glBlendFunc(c0, curWd.Uw0);
                    }
                    lastWd = hg.i80;
                }
                if (!hg.vP) {
                    hg.Oh0();
                    hg.nY();
                }
                System.arraycopy(hg.BJ0, 0, this.ur0, vertexOffset, hg.BJ0.length);
                vertexOffset += hg.BJ0.length;
                if (vertexOffset == this.ur0.length) {
                    Y0(vertexOffset, shader);
                    vertexOffset = 0;
                }
            }
            if (vertexOffset > 0) {
                Y0(vertexOffset, shader);
            }
            this.uv.getClass();
            if (node.gd == 1) {
                lg_0.OH0.glDisable(3042);
            }
        }
        this.uv.getClass();
        lg_0.OH0.glDisable(2929);
        cd_1 cd_1Var = this.Ad;
        tb0_0 n;
        while ((n = cd_1Var.vk0) != null) {
            cd_1Var.sp0.free(n);
            cd_1Var.vk0 = cd_1Var.vk0.AL;
        }
        this.rj.freeAll(this.COM8);
        this.COM8.clear();
    }

    public final void Y0(int i1, lt_1 v2) {
        this.LN.COM6.ce0(0, i1, this.ur0);
        this.LN.zm(v2, 4, 0, i1 / 4, this.LN.uf);
    }

    @Override
    public final void dispose() {
        cd_1 cd_1Var = this.Ad;
        tb0_0 n;
        while ((n = cd_1Var.vk0) != null) {
            cd_1Var.sp0.free(n);
            cd_1Var.vk0 = cd_1Var.vk0.AL;
        }
        this.rj.freeAll(this.COM8);
        this.COM8.clear();
        this.ur0 = null;
        this.LN.dispose();
    }
}
