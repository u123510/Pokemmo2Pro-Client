package cn.pokemmo.ui.window.admin;

import f.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 管理员必填提示弹窗
 *
 * 原混淆类: f.xj_1
 */
public class AdminPromptWindow extends R90 {
    public final xj_1 asBridge() { return (xj_1) (Object) this; }

    public static final String[][] qa0;
    public final String kq0;
    public final le0_2[] WO;

    static {
        qa0 = new String[0][];
    }

    public AdminPromptWindow(String str, String[] strArr, C70[] c70Arr, String[][] strArr2) {
        this.kq0 = str;
        fy_2 fy_2 = new fy_2();
        ff0(1);
        uf("admin-small-frame");
        Hy(str);
        this.WO = new le0_2[c70Arr.length];
        for (int i = 0; i < this.WO.length; i++) {
            switch (lb_1.nX[c70Arr[i].ad()]) {
                case 1:
                    this.WO[i] = new Hr();
                    break;
                case 2:
                case 3:
                    this.WO[i] = new K3();
                    break;
                case 4:
                    ArrayList<String> list = new ArrayList<>(Arrays.asList(strArr2[i]));
                    X6 x6 = new X6();
                    x6.r30(new pg0_2(list));
                    this.WO[i] = x6;
                    break;
                default:
                    this.WO[i] = new cg_0();
                    break;
            }
        }
        xe_1 xe_1 = new xe_1("发送");
        xe_1 nJ = uz0_0.nJ(xe_1, this::sw, "取消");
        nJ.RR(this::zG);
        Hm0 lo0 = fy_2.lo0();
        I7 H10 = fy_2.H10();
        for (int i2 = 0; i2 < this.WO.length; i2++) {
            cn_0 cn_0 = new cn_0(strArr[i2] + ":");
            cn_0.uf("label-title");
            H10.X20(fy_2.H10().LPt3(new le0_2[]{cn_0, this.WO[i2]}));
            lo0.X20(fy_2.lo0().LPt3(new le0_2[]{cn_0, this.WO[i2]}));
        }
        fy_2.WQ(H10.X20(fy_2.H10().Kn0(xe_1).qd(5).Kn0(nJ)));
        fy_2.x40(lo0.X20(fy_2.lo0().LPt3(new le0_2[]{xe_1, nJ})));
        SL(fy_2);
    }

    public final xj_1 lL(int i, String str) {
        AdminPromptWindow this_ = this;
        le0_2 le0_2 = this.WO[i];
        if (le0_2 instanceof cg_0) {
            ((cg_0) le0_2).mm(str);
            return asBridge();
        } else if (le0_2 instanceof X6) {
            ((X6) le0_2).hK(str);
            return asBridge();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final xj_1 iX() {
        Pb0(this::ED0);
        return asBridge();
    }

    public final void zG() {
        if (this.Lr0 != null && this.Lr0.ER.Fc0 != null) {
            a7_0.bH(this.Lr0.ER.Fc0);
        }
    }

    public final void ED0() {
        this.K20.u3(this);
    }

    public final void sw() {
        StringBuilder sb = new StringBuilder(this.kq0);
        for (le0_2 le0_2 : this.WO) {
            sb.append(" ");
            if (le0_2 instanceof cg_0) {
                sb.append(((wn0_0) ((cg_0) le0_2).dI0).YA.toString().trim());
            } else if (le0_2 instanceof X6) {
                X6 x6 = (X6) le0_2;
                if (x6.Vh0() == null) {
                    Qy0.yI0.dk(-1, "请选择所有必填项");
                    return;
                }
                sb.append(x6.Vh0().toString().trim());
            } else {
                throw new UnsupportedOperationException();
            }
        }
        tw0_0.rl.Cp(zo_0.Pk, sb.toString(), "", true);
        zG();
    }
}
