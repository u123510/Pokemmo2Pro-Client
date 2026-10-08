package cn.pokemmo.util.platform;

import f.*;

import java.util.Locale;

public class OperatingSystemPlatform {
    public static final qt_1 C1;
    public static final qt_1 Pl0;
    public static final qt_1 qV;
    public static final qt_1 S7;
    public static final qt_1 LX;
    public static final qt_1 cF;
    public static final qt_1 zm0;
    public static final bm0_1 z10;
    public final byte LG;
    public final String KI;
    public final boolean OW;

    public OperatingSystemPlatform(int i, String name, boolean flag) {
        this.LG = (byte) i;
        this.KI = name;
        this.OW = flag;
    }

    public static qt_1 yr0() {
        return zm0;
    }

    public static boolean st0() {
        qt_1 os = zm0;
        qt_1 win = C1;
        if (os == win) {
            String osName = System.getProperty("os.name");
            String osVersion = System.getProperty("os.version");
            if ("Windows XP".equalsIgnoreCase(osName) || "5.1".equals(osVersion)) {
                return true;
            }
        }
        if (os == win) {
            String osName = System.getProperty("os.name", "");
            String osVersion = System.getProperty("os.version", "");
            if (tx_1.qp0(osName, "vista") || "6.0".equals(osVersion)) {
                return true;
            }
        }
        if (os == qV) {
            String osVersion = System.getProperty("os.version", "");
            String[] parts = osVersion.split("\\.");
            if (parts.length >= 2) {
                try {
                    Integer.parseInt(parts[0]);
                    if (Integer.parseInt(parts[1]) < 12) {
                        return true;
                    }
                } catch (NumberFormatException ignored) {
                }
            }
        }
        if (zm0 == C1 && ea0_1.xz0 == cj_1.mv && ea0_1.su0 == Uh0.OE0) {
            return true;
        }
        return false;
    }

    static {
        s1_0 dummy = s1_0.Lu;
        C1 = new qt_1(0, "WINDOWS", true);
        Pl0 = new qt_1(1, "LINUX", true);
        qV = new qt_1(2, "MAC", true);
        S7 = new qt_1(3, "IOS", true);
        LX = new qt_1(4, "ANDROID", true);
        cF = new qt_1(-1, "UNKNOWN", false);

        qt_1[] values = new qt_1[]{ C1, Pl0, qV, S7, LX, cF }.clone();
        z10 = new bm0_1();
        for (qt_1 val : values) {
            z10.gE0(val.LG, val);
        }

        if ("iOS".equals(System.getProperty("os.name"))) {
            zm0 = S7;
        } else if (System.getProperty("java.runtime.name", "").contains("Android Runtime")) {
            zm0 = LX;
        } else {
            String osNameLower = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
            if (osNameLower.indexOf("win") >= 0) {
                zm0 = C1;
            } else if (osNameLower.indexOf("nix") >= 0 || osNameLower.indexOf("nux") >= 0) {
                zm0 = Pl0;
            } else if (osNameLower.indexOf("mac") >= 0) {
                zm0 = qV;
            } else {
                zm0 = cF;
            }
        }
    }

    public final String za0() {
        return this.KI;
    }

    public final boolean w00() {
        return this.OW;
    }
}
