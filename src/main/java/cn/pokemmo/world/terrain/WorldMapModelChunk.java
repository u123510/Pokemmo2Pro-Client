package cn.pokemmo.world.terrain;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.BufferUtils;
import f.*;
import java.io.IOException;
import java.net.URL;
import java.nio.IntBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.glfw.GLFW;

/**
 * 现代化重构类 - 原始类: f.qq_0
 */
public class WorldMapModelChunk implements pc0_1, fy0_0 {

    public static final float fe0;
    public static final MD0 Xl;
    public static final MD0 pz0;
    public static final MD0 Qj0;
    public static final qs_0 ae0;
    public static final qs_0 vn0;
    public static final qs_0 en;

    public final int UA;
    public final Color IA;
    public int kA0;
    public int M00;
    public boolean J2;
    public final nh0_1 VK;
    public d6_0 NG;
    public int jF;
    public int f3;
    public cu0_0 N3;
    public final VT eI0;
    public final es_1 ZK0;
    public final es_1 Zp;
    public final es_1 Ng;
    public final ui_1 zi;
    public final Qf GC0;
    public jy_1 va;
    public nh0_1 g50;
    public final dq_0 J50;
    public final ev_2 fF;
    public final ql_0 P7;
    public final ql_0 mJ0;
    public final wa_1 CP;
    public final s60_0 u7;

    static {
        fe0 = Color.WHITE.toFloatBits();
        Xl = MD0.cB("leftMouseButton");
        pz0 = MD0.cB("middleMouseButton");
        Qj0 = MD0.cB("rightMouseButton");
        ae0 = Dr0.mY(0, "offsetX");
        vn0 = Dr0.mY(0, "offsetY");
        en = Dr0.mY(0, "underlineOffset");
    }

    public static void hx0() {
        k3_0 s4 = lg_0.S4;
        ku_1 ur0 = ku_1.ur0;
        long window = s4.rt0.hc0;
        if (ur0 == ku_1.ma0) {
            if (hz0.vi == -1) {
                hz0.vi = GLFW.glfwGetInputMode(window, 208897);
            }
            GLFW.glfwSetInputMode(window, 208897, 212994);
        } else {
            int vi = hz0.vi;
            if (vi != -1) {
                GLFW.glfwSetInputMode(window, 208897, vi);
                hz0.vi = -1;
            }
            Long cursor = (Long) hz0.ee0.get(ur0);
            if (cursor == null) {
                long c = GLFW.glfwCreateStandardCursor(221185);
                if (c == 0L) {
                    return;
                }
                cursor = Long.valueOf(c);
                hz0.ee0.put(ur0, cursor);
            }
            GLFW.glfwSetCursor(window, cursor.longValue());
        }
    }

    public WorldMapModelChunk(ui_1 v1, jy_1 v2) {
        this.IA = new Color();
        this.P7 = new ql_0();
        this.mJ0 = new ql_0();
        this.u7 = new s60_0();
        this.zi = v1;
        IntBuffer buf = BufferUtils.yD0(16);
        this.ZK0 = new es_1();
        this.Zp = new es_1();
        this.Ng = new es_1();
        this.VK = new nh0_1(v1);
        this.g50 = this.VK;
        this.J50 = new dq_0();
        this.fF = new ev_2();
        this.va = v2;
        this.CP = new wa_1();
        Ii();
        lg_0.OH0.glGetIntegerv(3379, buf);
        this.UA = buf.get(0);
        this.eI0 = new VT();
        this.GC0 = new Qf();
    }

    public final void Ii() {
        this.va.getClass();
        jy_1 v1 = this.va;
        this.kA0 = (int) v1.qj;
        this.M00 = (int) v1.eY;
        v1.getClass();
    }

    public final void ga() {
        d6_0 v1 = this.NG;
        if (v1 != null) {
            this.g50 = this.VK;
            int i0 = this.jF;
            int i2 = this.f3;
            wl0_2 v3 = v1.ar;
            if (v3 != null) {
                int i1 = i0 - v1.Bl0;
                int i2_adj = i2 - v1.n3;
                v3.GO(v1.EU.gd.eI0, i1, i2_adj);
            } else {
                xu_1 eu = v1.EU;
                ui_1 ui = eu.gd.zi;
                Texture tex = eu.Sd;
                float f2 = (float) (i0 - v1.Bl0);
                float f3 = (float) (i2 - v1.n3);
                float f0 = (float) v1.zb;
                float f1 = (float) v1.iX;
                ui.vv0(tex, f2, f3, f0, f1);
            }
        }
    }

    public final void al(int i1, int i2, int i3, int i4) {
        dq_0 v5 = this.J50;
        int i6 = v5.CF;
        if (i6 == v5.mz0.length) {
            pt_1[] arr = new pt_1[i6 * 2];
            System.arraycopy(v5.mz0, 0, arr, 0, i6);
            v5.mz0 = arr;
        }
        pt_1 v8 = v5.mz0[v5.CF];
        if (v8 == null) {
            v8 = new pt_1();
            v5.mz0[v5.CF] = v8;
        }
        v5.CF++;
        v8.V = i1;
        v8.YE = i2;
        v8.Yw = i1 + Math.max(0, i3);
        v8.tj = i2 + Math.max(0, i4);
        if (v5.CF > 1) {
            pt_1 v1 = v5.mz0[v5.CF - 2];
            v1.getClass();
            v8.V = Math.max(v8.V, v1.V);
            v8.YE = Math.max(v8.YE, v1.YE);
            v8.Yw = Math.min(v8.Yw, v1.Yw);
            int minTj = Math.min(v8.tj, v1.tj);
            v8.tj = minTj;
            if (v8.Yw < v8.V || minTj < v8.YE) {
                v8.Yw = v8.V;
                v8.tj = v8.YE;
            }
        }
        me();
    }

    public final void Lpt9() {
        if (this.J50.CF != 0) {
            this.J50.CF--;
            me();
            return;
        }
        throw new IllegalStateException("empty");
    }

    public final void kY() {
        this.g50 = this.g50.Tf0;
    }

    public final Color w70(gn_0 v1) {
        this.IA.r = this.g50.Jl0 * (float) (v1.cv & 0xFF);
        this.IA.g = this.g50.fN * (float) (v1.x8 & 0xFF);
        this.IA.b = this.g50.h6 * (float) (v1.sh & 0xFF);
        this.IA.a = this.g50.UX * (float) (v1.FY & 0xFF);
        return this.IA;
    }

    public final void me() {
        ev_2 v1 = this.fF;
        dq_0 v2 = this.J50;
        int i3 = v2.CF;
        if (i3 == 0) {
            if (this.J2) {
                this.zi.TV();
                PH.eF();
                this.J2 = false;
            }
            return;
        }
        pt_1 top = v2.mz0[i3 - 1];
        top.getClass();
        v1.V = top.V;
        v1.YE = top.YE;
        v1.Yw = top.Yw;
        v1.tj = top.tj;
        this.zi.TV();
        ql_0 p7 = this.P7;
        p7.j80 = (float) v1.V;
        p7.Wm0 = (float) v1.YE;
        p7.IA = (float) (v1.Yw - v1.V);
        p7.Eu0 = (float) (v1.tj - v1.YE);
        ql_0 mJ0 = this.mJ0;
        this.va.vE0(this.zi.jP, p7, mJ0);
        this.va.vE0(this.zi.jP, p7, mJ0);
        if (this.J2) {
            PH.eF();
            this.J2 = false;
        }
        if (PH.Sj(this.mJ0)) {
            this.J2 = true;
        }
    }

    @Override
    public final void dispose() {
        this.GC0.dispose();
        this.CP.dispose();
    }

    public final void RM(cu0_0 v1) {
        if (!v1.Ox) {
            throw new IllegalStateException("CacheContext is invalid");
        }
        if (v1.lPT7 != (qq_0) this) {
            throw new IllegalArgumentException("CacheContext object not from this renderer");
        }
        this.N3 = v1;
        try {
            I2 it1 = this.ZK0.ZD();
            while (it1.hasNext()) {
                ((GZ) it1.next()).getClass();
            }
            I2 it2 = this.Zp.ZD();
            while (it2.hasNext()) {
                ((o) it2.next()).getClass();
            }
        } finally {
            this.ZK0.clear();
            this.Zp.clear();
        }
    }

    public final xu_1 kC0(URL v1, String v2) {
        if (this.N3 == null) {
            RM(new cu0_0((qq_0) this));
        }
        this.N3.getClass();
        String urlStr = v1.toString();
        xu_1 cached = (xu_1) this.N3.mq.get(urlStr);
        if (cached != null) {
            return cached;
        }
        if (!this.N3.Ox) {
            throw new IllegalStateException("CacheContext already destroyed");
        }
        Dn0 dn0 = null;
        try {
            dn0 = (Dn0) v1.getContent();
        } catch (IOException e) {
            e.printStackTrace();
        }
        xu_1 result;
        if (dn0 != null && dn0.os0()) {
            result = new xu_1(this.N3.lPT7, dn0, v2);
            this.N3.z10.add(result);
        } else {
            System.out.println("failed to load texture = " + v1 + " file = " + dn0 + " path = " + v1.getPath());
            result = null;
        }
        this.N3.mq.put(urlStr, result);
        return result;
    }

    public final Z30 Sk(int i1) {
        int i2 = 64;
        if (i1 <= 0) {
            throw new IllegalArgumentException("width");
        }
        if (i1 > this.UA || i2 > this.UA) {
            Logger.getLogger(WorldMapModelChunk.class.getName()).log(
                    Level.WARNING,
                    "requested size {0} x {1} exceeds maximum texture size {3}",
                    new Object[]{Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(this.UA)}
            );
            return null;
        }
        Texture texture = new Texture(new S60(new i4_0(i1, i2, ix0_0.Vw), null, false, false));
        texture.setFilter(eb0_1.jc0, eb0_1.jc0);
        Z30 z30 = new Z30((qq_0) this, texture, i1, i2, texture.getWidth(), texture.getHeight(), gn_0.WHITE);
        this.Ng.Ue0(z30);
        return z30;
    }
}
