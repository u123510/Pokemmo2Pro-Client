package cn.pokemmo.net.compress;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Random;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Crc32ZipStreamValidator {
    public static final fd_1 Hw;
    public static final HB0 cx;
    public static final kw_2 Kd;
    public static final HashSet<String> XL;
    public final String kn0;

    public Crc32ZipStreamValidator() {
        this.kn0 = null;
    }

    public Crc32ZipStreamValidator(String v1) {
        this.kn0 = v1;
    }

    public static synchronized void II0(String v0) {
        XL.add(v0);
    }

    public static synchronized boolean sa(String v0) {
        return XL.contains(v0);
    }

    public static void v8(Closeable v0) {
        if (v0 != null) {
            try {
                v0.close();
            } catch (Throwable ignored) {
            }
        }
    }

    public static String Td0(InputStream v0) {
        if (v0 == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        CRC32 v1 = new CRC32();
        byte[] v2 = new byte[4096];
        try {
            while (true) {
                int i3 = v0.read(v2);
                if (i3 == -1) {
                    break;
                }
                v1.update(v2, 0, i3);
            }
        } catch (Exception ignored) {
        } finally {
            v8(v0);
        }
        return Long.toString(v1.getValue(), 16);
    }

    public static String zk(String v0) {
        fd_1 v1 = Hw;
        if (v1 == fd_1.aC) {
            return v0;
        }
        StringBuilder sb = new StringBuilder();
        String v5;
        if (v1 == fd_1.EC || v1 == fd_1.aC || v1 == fd_1.Lv0) {
            v5 = "lib";
        } else {
            v5 = "";
        }
        sb.append(v5).append(v0);

        kw_2 v3_kd = Kd;
        String v3_arch;
        if (v3_kd == kw_2.PX) {
            v3_arch = "";
        } else {
            v3_arch = v3_kd.name().toLowerCase();
        }
        sb.append(v3_arch);

        HB0 v3_hb = cx;
        String v3_bit;
        if (v3_hb == HB0.UG) {
            v3_bit = "";
        } else {
            v3_bit = v3_hb.name().substring(1);
        }
        sb.append(v3_bit).append(".");

        String ext;
        if (v1 == fd_1.Vg0) {
            ext = "dll";
        } else if (v1 == fd_1.EC) {
            ext = "so";
        } else if (v1 == fd_1.Lv0) {
            ext = "dylib";
        } else if (v1 == fd_1.aC) {
            ext = "so";
        } else {
            ext = "";
        }
        sb.append(ext);
        return sb.toString();
    }

    public final void yY(String v1) {
        if (Hw == fd_1.nj) {
            return;
        }
        synchronized (Crc32ZipStreamValidator.class) {
            if (sa(v1)) {
                return;
            }
            String v3 = zk(v1);
            try {
                if (Hw == fd_1.aC) {
                    System.loadLibrary(v3);
                } else {
                    fB0(v3);
                }
                II0(v1);
            } catch (Throwable th) {
                String target;
                if (Hw == fd_1.aC) {
                    target = "Android";
                } else {
                    target = System.getProperty("os.name") + ", " + Kd.name() + ", " + cx.name().substring(1) + "-bit";
                }
                throw new KW("Couldn't load shared library '" + v3 + "' for target: " + target, th);
            }
        }
    }

    public final InputStream FB0(String v1) {
        if (this.kn0 == null) {
            InputStream is = Crc32ZipStreamValidator.class.getResourceAsStream("/" + v1);
            if (is != null) {
                return is;
            }
            throw new KW(jj0_0.hw0("Unable to read file for extraction: ", v1));
        }
        try {
            ZipFile zf = new ZipFile(this.kn0);
            ZipEntry ze = zf.getEntry(v1);
            if (ze != null) {
                return zf.getInputStream(ze);
            }
            throw new KW("Couldn't find '" + v1 + "' in JAR: " + this.kn0);
        } catch (IOException e) {
            throw new KW("Error reading '" + v1 + "' in JAR: " + this.kn0, e);
        }
    }

    public final File I40(String v1, String v2, File v3) {
        String crc = null;
        if (v3.exists()) {
            try {
                crc = Td0(new FileInputStream(v3));
            } catch (FileNotFoundException ignored) {
            }
        }
        if (crc == null || !crc.equals(v2)) {
            InputStream in = null;
            FileOutputStream out = null;
            try {
                in = FB0(v1);
                v3.getParentFile().mkdirs();
                out = new FileOutputStream(v3);
                byte[] buf = new byte[4096];
                while (true) {
                    int len = in.read(buf);
                    if (len == -1) {
                        break;
                    }
                    out.write(buf, 0, len);
                }
                v8(out);
                v8(in);
            } catch (IOException e) {
                try {
                    throw new KW("Error extracting file: " + v1 + "\nTo: " + v3.getAbsolutePath(), e);
                } finally {
                    v8(out);
                    v8(in);
                }
            }
        }
        return v3;
    }

    public final void fB0(String v1) {
        String crc = Td0(FB0(v1));
        String name = new File(v1).getName();
        File tmpDir = new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + crc, name);
        Throwable th = bm(v1, crc, tmpDir);
        if (th == null) {
            return;
        }
        try {
            File tempFile = File.createTempFile(crc, null);
            if (tempFile.delete() && bm(v1, crc, tempFile) == null) {
                return;
            }
        } catch (Throwable ignored) {
        }
        File userHomeFile = new File(System.getProperty("user.home") + "/.libgdx/" + crc, name);
        if (bm(v1, crc, userHomeFile) == null) {
            return;
        }
        File tempRelFile = new File(jj0_0.hw0(".temp/", crc), name);
        if (bm(v1, crc, tempRelFile) == null) {
            return;
        }
        File libPathFile = new File(System.getProperty("java.library.path"), v1);
        if (libPathFile.exists()) {
            System.load(libPathFile.getAbsolutePath());
            return;
        }
        throw new KW(th);
    }

    public final Throwable bm(String v1, String v2, File v3) {
        try {
            System.load(I40(v1, v2, v3).getAbsolutePath());
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    static {
        HB0 cx_tmp = HB0.UG;
        kw_2 kd_tmp = kw_2.PX;
        fd_1 hw_tmp = null;

        String osName = System.getProperty("os.name");
        if (osName.contains("Windows")) {
            hw_tmp = fd_1.Vg0;
        } else if (osName.contains("Linux")) {
            hw_tmp = fd_1.EC;
        } else if (osName.contains("Mac")) {
            hw_tmp = fd_1.Lv0;
        }

        String osArch = System.getProperty("os.arch");
        if (osArch.startsWith("arm") || osArch.startsWith("aarch64")) {
            kd_tmp = kw_2.Fc;
        } else if (osArch.startsWith("riscv")) {
            kd_tmp = kw_2.fg0;
        } else if (osArch.startsWith("loongarch")) {
            kd_tmp = kw_2.D60;
        }

        if (osArch.contains("64") || osArch.startsWith("armv8")) {
            cx_tmp = HB0.iG0;
        } else if (osArch.contains("128")) {
            cx_tmp = HB0.Sl;
        }

        boolean isMoe = System.getProperty("moe.platform.name") != null;
        String runtimeName = System.getProperty("java.runtime.name");
        if (runtimeName != null && runtimeName.contains("Android Runtime")) {
            hw_tmp = fd_1.aC;
            cx_tmp = HB0.UG;
            kd_tmp = kw_2.PX;
        }

        if (isMoe || (hw_tmp != fd_1.aC && hw_tmp != fd_1.Vg0 && hw_tmp != fd_1.EC && hw_tmp != fd_1.Lv0)) {
            hw_tmp = fd_1.nj;
            cx_tmp = HB0.UG;
            kd_tmp = kw_2.PX;
        }

        Hw = hw_tmp;
        cx = cx_tmp;
        Kd = kd_tmp;
        XL = new HashSet<>();
        new Random();
    }
}
