package cn.pokemmo.world.camera;

import f.*;

public abstract class CameraFollowPerspectiveController extends bs0_0 {
    public final ae0_1 Zq;
    public final cn_0 ej0;
    public final qj_2 qQ;
    public final tk0_0 Ms0;
    public final in_2 jW;

    public CameraFollowPerspectiveController() {
        super();
        this.jW = new in_2(100);
        this.uf("event-tracker");
        this.Ms0 = new tk0_0();
        this.Zq = new ae0_1();
        this.ej0 = new cn_0("0/0");
        this.Oq0(false);
        this.ej0.fn0();
        this.Ms0.gg0.vx0(this.Zq).Yt();
        this.Ms0.gg0.Rg();
        this.Ms0.gg0.vx0(this.ej0).ru();
        this.qQ = new qj_2();
        this.Xg0(this.qQ.sl());
        this.qQ.uf("button");
        this.qQ.RR(this::mw0);
        this.Ms0.gg0.vx0(this.qQ).Ha().Xs(5.0f);
        this.Ms0.gg0.vx0(this.Zq).Pt(100.0f).Xs(5.0f);
        this.uf(this.xz0());
        this.Zq.aE(0.0f);
    }

    public static void nU(String text, tk0_0 container) {
        cn_0 label = new cn_0();
        label.Sk(text);
        BU.T50.SL(new lpt3__4(label, CameraFollowPerspectiveController::n7, container, xX.jZ));
    }

    public static void n7() {
    }

    public final void X30(int value) {
        if (!this.jW.ty0()) {
            return;
        }
        cq0_0 progress = tw0_0.rl.oY;
        short page = this.DF0();
        progress.w0(page);
        short maximum = (short) (progress.lY.jA0(page) - 1);
        this.Zq.aE((float) maximum / (float) this.sa0());
        this.ej0.Sk(sm0_0.Bx(this.og0(), new String[]{
            String.valueOf(value),
            String.valueOf(maximum)
        }));
        this.Ll(maximum > 0);
        this.Ms0.gg0.pz(this.ej0).sn0 = new vl0_0((float) value);
        this.Ms0.COm3();
    }

    public tk0_0 ff() {
        tk0_0 result = new tk0_0(new A40());
        result.gg0.FU.Wa0().sn0 = new vl0_0(100.0f);
        result.gg0.FU.Wa0().goto$();

        A40 layout = result.gg0;
        S70 icon = new S70(36, 36, 0);
        this.Xg0(icon.og);

        tk0_0 labelContainer = new tk0_0(new A40());
        labelContainer.gg0.FU.Wa0();
        String title = this.ej0.j50.toString();
        if (this.og0() == 16800221) {
            title = title.substring(1, title.length() - 1);
        }
        cn_0 label = new cn_0(null, 0);
        label.Sk(title);
        label.uf("label-lalign");
        labelContainer.gg0.vx0(label).goto$();
        labelContainer.gg0.vx0(label).sn0 = new vl0_0(260.0f);
        labelContainer.gg0.vx0(label).Wa0().d80 = Integer.valueOf(2);
        labelContainer.gg0.vx0(label).ck0 = new vl0_0(8.0f);
        labelContainer.gg0.Rg();

        cq0_0 progress = tw0_0.rl.oY;
        short page = this.DF0();
        progress.w0(page);
        short first = progress.lY.jA0(page);
        short[] entries = new short[this.sa0()];
        short index = this.c40();
        while (index <= this.It0()) {
            progress.w0(index);
            short count = progress.lY.jA0(index);
            if (count != 0) {
                entries[count - 1] = index;
            }
            index++;
        }
        int displayCount = 0;
        int rowIndex = 0;
        while (rowIndex < entries.length) {
            short entry = entries[rowIndex];
            int[] data = this.YO()[(short) (entry - this.c40())];
            byte kind = (byte) data[0];
            String name = "";
            if (kind >= 2 && kind <= 4) {
                short id = (short) data[1];
                if (kind >= 0 && kind < Z0.rb.h4.length) {
                    Z50 item = Z0.rb.h4[kind] == null ? null : Z0.rb.h4[kind].Sx0[id];
                    if (item != null) {
                        name = item.getName();
                    }
                }
            } else if (kind == 0 || kind == 1) {
                ZT item = Z0.rb.wz((byte) data[2], (short) data[1]);
                if (item != null) {
                    name = item.Nw0();
                }
            }
            String value = "- ????";
            rowIndex++;
            if (rowIndex == first) {
                value = this.dL0(kind, entry);
                String selectedValue = value;
                uc_1 action = new uc_1();
                action.RR(() -> nU(selectedValue, this.Ms0));
                layout.vx0(action).mA = Integer.valueOf(1);
            } else if (rowIndex < first) {
                value = jj0_0.hw0("-", name);
            }
            cn_0 rowLabel = I5.df(null, 0, value);
            labelContainer.gg0.vx0(rowLabel).mA = Integer.valueOf(1);
            rowLabel.uf("label-lalign");
            displayCount++;
            int columns = tw0_0.kz0() ? 3 : 2;
            if (displayCount % columns == 0) {
                labelContainer.gg0.Rg();
            }
        }
        labelContainer.gg0.qf(8.0f);
        return result;
    }

    public final boolean nd0(i70_0 event) {
        int key = event.zu;
        if (E00.C10(key)) {
            if (key == 5) {
                this.mw0();
            }
            return true;
        }
        return super.nd0(event);
    }

    public int sa0() {
        return this.Y1() * 5;
    }

    public abstract short DF0();

    public abstract short Y1();

    public abstract int og0();

    public abstract String xz0();

    public abstract String dL0(byte kind, short index);

    public abstract short c40();

    public abstract short It0();

    public abstract int[][] YO();

    public abstract void Xg0(Br0 button);

    public final void mw0() {
        BU.T50.SL(new lpt3__4(this.ff(), this::gf0, null, xX.jZ));
    }

    public final void gf0() {
        this.qQ.ER.Ge0(false);
    }
}
