package cn.pokemmo.ui.window.admin;

import f.*;

/**
 * 坐骑精灵帧偏移量调试器窗口
 *
 * 原混淆类: f.xb0_1
 */
public class MountOffsetsDebuggerWindow extends R90 {
    public final zc0_1 JO;
    public final X6 IO;
    public final Ay0[][] pf0;
    public boolean Z70;

    public MountOffsetsDebuggerWindow(xn0_0 xn0_0) {
        this.pf0 = new Ay0[4][2];
        this.Z70 = false;
        zc0_1 zc0_1 = new zc0_1();
        this.JO = zc0_1;
        ff0(1);
        uf("adminframe");
        Hy("");
        Pb0(() -> Bt(xn0_0));

        int length = 494;
        String[] strArr = new String[494];
        for (int i = 0; i < length; i++) {
            strArr[i] = sm0_0.c0(i + 150000) + " #" + i;
        }

        pg0_2 pg0_2 = new pg0_2(strArr);
        X6 x6 = new X6(pg0_2);
        this.IO = x6;
        x6.Bd(0);
        x6.Rm0(this::vp0);
        this.JO.qG0(new le0_2[] { x6 });

        byte[] bArr = t70_0.jv0;
        int len = bArr.length;
        for (int i = 0; i < len; i++) {
            byte b = bArr[i];
            Zq0 zq0 = new Zq0(t70_0.HF0(b));
            zq0.RY(100, 10);

            Ay0 ay0_1 = new Ay0();
            Ay0 ay0_2 = new Ay0();
            ay0_1.ld0(this::y2);
            ay0_2.ld0(this::sq);

            this.pf0[b][0] = ay0_1;
            this.pf0[b][1] = ay0_2;

            this.JO.qG0(new le0_2[] { zq0, ay0_1, ay0_2 });
        }

        xe_1 btnSave = new xe_1("Save Offsets");
        btnSave.RR(this::Dv);
        this.JO.qG0(new le0_2[] { btnSave });

        xe_1 btnReload = new xe_1("Reload Masks");
        btnReload.RR(xb0_1::ws);
        this.JO.qG0(new le0_2[] { btnReload });

        xe_1 btnDump = new xe_1("Dump Sprites");
        btnDump.RR(this::BA0);
        this.JO.qG0(new le0_2[] { btnDump });

        SL(this.JO);
    }

    public static void ws() {
        Ot0.SF0.lpT9.clear();
    }

    public final void vp0() {
        this.Z70 = true;
        _native.Tn0 = (short) this.IO.mu0.Mw0;
        float[][] fArr = Ot0.SF0.yk0(_native.Tn0);
        byte[] bArr = t70_0.jv0;
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            this.pf0[b][0].Zb0(fArr[b][0]);
            this.pf0[b][1].Zb0(fArr[b][1]);
        }
        this.Z70 = false;
    }

    public final void BA0() {
        short s = _native.Tn0;
        AG0[] ag0Arr = SS.hG0.U(s, (byte) 0, false);
        if (ag0Arr == null) {
            return;
        }
        for (int i = 0; i < ag0Arr.length; i++) {
            i4_0 i4_0 = ag0Arr[i].f60.R7();
            lg_0.I70.getClass();
            F40.mu(new VE("data/sprites/mounts/" + ((int) s) + "-" + i + ".png", zv_1.kE), i4_0);
        }
    }

    public final void Dv() {
        gr(true);
    }

    public final void gr(boolean z) {
        if (this.Z70) {
            return;
        }
        float[][] fArr = new float[4][2];
        byte[] bArr = t70_0.jv0;
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            fArr[b][0] = this.pf0[b][0].X4;
            fArr[b][1] = this.pf0[b][1].X4;
        }
        short s = _native.Tn0;
        Ot0.SF0.uD0.coM4(s, fArr);
        if (!z) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                sb.append("\n");
            }
            sb.append(Float.toString(fArr[i][0]));
            sb.append(",");
            sb.append(Float.toString(fArr[i][1]));
        }
        lg_0.I70.getClass();
        new VE("data/sprites/mounts/" + ((int) s) + ".txt", zv_1.kE).Ex0(sb.toString(), "UTF-8");
    }

    @Override
    public final void K8() {
        RY(500, 300);
        lt0();
        this.JO.lt0();
        super.K8();
    }

    public final void sq(float f) {
        gr(false);
    }

    public final void y2(float f) {
        gr(false);
    }

    public final /* synthetic */ void Bt(xn0_0 xn0_0) {
        xn0_0.u3(this);
    }
}
