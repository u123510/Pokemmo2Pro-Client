package cn.pokemmo.constant;

import f.qx0_0;
import java.io.File;
import java.io.PrintWriter;

public abstract class LineSeparatorProbeConstant {
    public static final int Zc0 = 0;

    static {
        char c = File.separatorChar;
        qx0_0 qx = new qx0_0();
        try (PrintWriter pw = new PrintWriter(qx)) {
            pw.println();
            qx.I4.getClass();
        }
    }
}
