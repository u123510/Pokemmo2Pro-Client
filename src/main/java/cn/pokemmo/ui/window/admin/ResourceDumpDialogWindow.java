package cn.pokemmo.ui.window.admin;

import f.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.zip.ZipEntry;

/**
 * 客户端资源转储对话框
 *
 * 原混淆类: f.t6_0
 */
public class ResourceDumpDialogWindow extends R90 {
    public final tk0_0 ox0;
    public final xe_1 ck;
    public final xe_1 LD;
    public int pe;

    public ResourceDumpDialogWindow() {
        this.pe = 0;
        uf("confirm-widget");
        tk0_0 t = new tk0_0();
        this.ox0 = t;
        t.uf("confirm-panel");
        t.gg0.EF(10.0f);
        cn_0 title = new cn_0(sm0_0.c0(1383));
        xe_1 btnDump = new xe_1(sm0_0.c0(nf0_0.uT));
        this.ck = btnDump;
        btnDump.RR(this::l20);
        xe_1 btnCancel = new xe_1(sm0_0.c0(nf0_0.Yt));
        this.LD = btnCancel;
        btnCancel.RR(this::xe0);
        t.Xf0(title).Wa(20.0f).im0();
        tk0_0 grid = new tk0_0();
        int count = 0;
        for (int i = 0; i < 9; ++i) {
            Qs0 label = new Qs0();
            W9 checkbox = new W9();
            int flag = 1 << i;
            if (flag == 1) {
                label.er0(7700);
            } else if (flag == 2) {
                label.er0(7701);
            } else if (flag == 4) {
                label.er0(7702);
            } else if (flag == 8) {
                label.er0(7703);
            } else if (flag == 16) {
                label.er0(7704);
            } else if (flag == 32) {
                label.er0(7705);
            } else if (flag == 64) {
                label.er0(7706);
            } else if (flag == 128) {
                continue;
            } else if (flag == 256) {
                label.er0(7707);
            }
            count++;
            grid.Xf0(checkbox).Wa0();
            grid.Xf0(label).Wa0().dw0().pK0(4.0f).Xs(10.0f);
            if (count % 2 == 0) {
                grid.gg0.Rg();
            }
            checkbox.RR(() -> fF(checkbox, flag));
        }
        this.ox0.Xf0(grid).Wa(20.0f).goto$().im0();
        this.ox0.Xf0(this.ck).goto$().im0();
        this.ox0.Xf0(this.LD).goto$();
        SL(this.ox0);
    }

    @Override
    public final void K8() {
        super.K8();
        vf(pa0_0.Ol);
    }

    public final void fF(W9 v1, int flag) {
        if (v1.ER.U20()) {
            this.pe |= flag;
        } else {
            this.pe &= ~flag;
        }
    }

    public final void l20() {
        int flags = this.pe;
        dl_1 unused = L1.qf0;
        try {
            File dumpFile = new File("./dump/resources/dump.zip");
            dumpFile.getParentFile().mkdirs();
            Tk0 tk0 = new Tk0(new FileOutputStream(dumpFile));
            L1.kh0 = false;
            L1.ZH(tk0);
            if ((flags & 1) != 0) {
                L1.Yr(tk0);
            }
            if ((flags & 2) != 0) {
                L1.n50(tk0);
            }
            if ((flags & 4) != 0) {
                L1.Xa(tk0);
            }
            if ((flags & 8) != 0) {
                tk0.putNextEntry(new ZipEntry("sounds/README.txt"));
                PrintWriter pw = new PrintWriter(tk0);
                pw.write("Dumping of sounds files not currently supported.");
                pw.flush();
                tk0.closeEntry();
            }
            if ((flags & 16) != 0) {
                L1.Nj(tk0);
            }
            if ((flags & 32) != 0) {
                L1.uf(tk0);
            }
            if ((flags & 64) != 0) {
                L1.ez(tk0);
            }
            if ((flags & 256) != 0) {
                L1.X90(tk0);
                L1.TL(tk0);
                L1.Uk(tk0);
            }
            L1.kh0 = true;
            tk0.close();
            Qy0.yI0.dk(-1, sm0_0.c0(1381));
        } catch (Exception e) {
            L1.qf0.error("Error dumping resources", e);
            Qy0.yI0.dk(-1, sm0_0.c0(1379));
        }
        xe0();
    }
}
