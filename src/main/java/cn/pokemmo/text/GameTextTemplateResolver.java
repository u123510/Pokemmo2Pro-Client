package cn.pokemmo.text;

import f.*;

import java.util.regex.Matcher;

public abstract class GameTextTemplateResolver {
    public static final iz0_0[] LS = new iz0_0[0];
    public static final Y60 op;

    static {
        Y60 y60 = new Y60();
        op = y60;
        y60.Y6(1647351, md_1.U1((byte) 0, (byte) 2, null));
        y60.Y6(1667879, md_1.U1((byte) 0, (byte) 4, null));
        y60.Y6(1685242, md_1.U1((byte) 0, (byte) 6, null));
        y60.Y6(270520488, md_1.U1((byte) 1, (byte) 2, null));
        y60.Y6(270529369, md_1.U1((byte) 1, (byte) 4, null));
        y60.Y6(270626583, md_1.U1((byte) 1, (byte) 6, null));
    }

    public static String dG(int i, iz0_0... iz0_0Array) {
        if (tw0_0.rl != null) {
            tw0_0.rl.RK0();
        }
        byte b = (byte) (i >> 28);
        String string;
        if (sm0_0.cU.l90(i)) {
            if (iz0_0Array != null && iz0_0Array.length > 0) {
                byte[] byArray = new byte[iz0_0Array.length];
                String[] stringArray = new String[iz0_0Array.length];
                for (int j = 0; j < iz0_0Array.length; j++) {
                    byArray[j] = iz0_0Array[j].Yi0;
                    stringArray[j] = iz0_0Array[j].vj0();
                }
                string = sm0_0.vs(i, byArray, stringArray);
            } else {
                string = sm0_0.c0(i);
            }
        } else if (N50.Fc(b)) {
            lpt6__2 lpt6__22 = (lpt6__2) lpt6__2.If.BM((byte) ((i >> 27) & 1));
            string = sm0_0.YG(b, lpt6__22, (i >> 16) & 0x3FF, i & 0xFFFF, iz0_0Array);
        } else {
            if (iz0_0Array != null) {
                for (int j = 0; j < iz0_0Array.length; j++) {
                    byte b2 = iz0_0Array[j].Yi0;
                    String string2 = iz0_0Array[j].vj0();
                    mz_1.D00.gE0(b2, string2);
                }
            }
            string = mz_1.TG0(i, true, tw0_0.Ll0.YB0, tw0_0.Ll0.LPT2);
        }
        if (string.contains("{KEY_")) {
            tw0_0.iE.getClass();
            String string3 = tw0_0.iE.oO(dw_2.RM, sm0_0.c0(nf0_0.Po));
            tw0_0.iE.getClass();
            String string4 = tw0_0.iE.oO(dw_2.fs0, sm0_0.c0(nf0_0.Po));
            if (string3 == null) {
                string3 = "???";
            }
            if (string4 == null) {
                string4 = "???";
            }
            string = string.replaceAll("\\{KEY_B\\}", Matcher.quoteReplacement(string3))
                           .replaceAll("\\{KEY_GAMEMENU\\}", Matcher.quoteReplacement(string4));
        }
        if (op.IJ0(i) >= 0) {
            int n = op.IJ0(i);
            int n2 = n < 0 ? op.dJ : op.IL0[n];
            string = sm0_0.Ft0(string, "[0-9０-９,]{2,10}(?!\\})", "" + n2);
        }
        return string;
    }
}
