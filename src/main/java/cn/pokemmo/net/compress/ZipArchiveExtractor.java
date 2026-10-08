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

public class ZipArchiveExtractor {
    public static final s1_0 NV;
    public static final Uh0 su0;
    public static final cj_1 xz0;
    public static final boolean T9;
    public static final boolean rv0;
    public static final boolean NL;
    public static final boolean x8;
    public static final boolean kF0;
    public static final boolean oR;
    public static final boolean pq;
    public static final HashSet LPT1;
    public final String X8;

    static {
        Uh0 su0_t = Uh0.OE0;
        cj_1 xz0_t = cj_1.mv;
        s1_0 NV_t = null;
        String os = System.getProperty("os.name");
        if (os.contains("Windows")) {
            NV_t = s1_0.Lu;
        } else if (os.contains("Linux")) {
            NV_t = s1_0.Lq0;
        } else if (os.contains("Mac")) {
            NV_t = s1_0.z8;
        }
        String arch = System.getProperty("os.arch");
        if (arch.startsWith("arm") || arch.startsWith("aarch64")) {
            xz0_t = cj_1.I30;
        } else if (arch.startsWith("riscv")) {
            xz0_t = cj_1.VU;
        } else if (arch.startsWith("loongarch")) {
            xz0_t = cj_1.a4;
        }
        if (arch.contains("64") || arch.startsWith("armv8")) {
            su0_t = Uh0.BB;
        } else if (arch.contains("128")) {
            su0_t = Uh0.LPT9;
        }
        boolean isMoe = System.getProperty("moe.platform.name") != null;
        String runtime = System.getProperty("java.runtime.name");
        if (runtime != null && runtime.contains("Android Runtime")) {
            NV_t = s1_0.qf;
            su0_t = Uh0.OE0;
            xz0_t = cj_1.mv;
        }
        if (isMoe || (NV_t != s1_0.qf && NV_t != s1_0.Lu && NV_t != s1_0.Lq0 && NV_t != s1_0.z8)) {
            NV_t = s1_0.ua;
            su0_t = Uh0.OE0;
            xz0_t = cj_1.mv;
        }
        NV = NV_t;
        su0 = su0_t;
        xz0 = xz0_t;
        T9 = (NV == s1_0.Lu);
        rv0 = (NV == s1_0.Lq0);
        NL = (NV == s1_0.z8);
        x8 = (NV == s1_0.ua);
        kF0 = (NV == s1_0.qf);
        oR = (xz0 == cj_1.I30);
        pq = (su0 == Uh0.BB);
        LPT1 = new HashSet();
        new Random();
    }

    public ZipArchiveExtractor() {
        this.X8 = null;
    }

    public ZipArchiveExtractor(String v1) {
        this.X8 = v1;
    }

    public static synchronized void A2(String v0) {
        LPT1.add(v0);
    }

    public static synchronized boolean Dh0(String v0) {
        return LPT1.contains(v0);
    }

    public static void M5(Closeable v0) {
        if (v0 != null) {
            try {
                v0.close();
            } catch (Throwable ignored) {
            }
        }
    }

    public static String ou(InputStream v0) {
        if (v0 == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        CRC32 crc = new CRC32();
        byte[] buf = new byte[4096];
        try {
            int read;
            while ((read = v0.read(buf)) != -1) {
                crc.update(buf, 0, read);
            }
        } catch (Exception ignored) {
        } finally {
            M5(v0);
        }
        return Long.toString(crc.getValue(), 16);
    }

    public static String lk0(String v0) {
        if (NV == s1_0.qf) {
            return v0;
        }
        StringBuilder sb = new StringBuilder();
        String prefix = (NV == s1_0.Lq0 || NV == s1_0.qf || NV == s1_0.z8) ? "lib" : "";
        sb.append(prefix);
        sb.append(v0);
        String archName = (xz0 == cj_1.mv) ? "" : xz0.name().toLowerCase();
        sb.append(archName);
        String bitName = (su0 == Uh0.OE0) ? "" : su0.name().substring(1);
        sb.append(bitName);
        sb.append(".");
        String ext;
        if (NV == s1_0.Lu) {
            ext = "dll";
        } else if (NV == s1_0.Lq0) {
            ext = "so";
        } else if (NV == s1_0.z8) {
            ext = "dylib";
        } else {
            ext = "";
        }
        sb.append(ext);
        return sb.toString();
    }

    public final void h9(String v1) {
        if (NV == s1_0.ua) {
            return;
        }
        synchronized (ZipArchiveExtractor.class) {
            if (Dh0(v1)) {
                return;
            }
            String libName = lk0(v1);
            try {
                if (NV == s1_0.qf) {
                    System.loadLibrary(libName);
                } else {
                    kZ(libName);
                }
                A2(v1);
            } catch (Throwable th) {
                String target;
                if (NV == s1_0.qf) {
                    target = "Android";
                } else {
                    target = System.getProperty("os.name") + ", " + xz0.name() + ", " + su0.name().substring(1) + "-bit";
                }
                throw new DH0("Couldn't load shared library '" + libName + "' for target: " + target, th);
            }
        }
    }

    public final InputStream OA0(String v1) {
        if (this.X8 == null) {
            InputStream in = ZipArchiveExtractor.class.getResourceAsStream("/" + v1);
            if (in != null) {
                return in;
            }
            throw new DH0("Unable to read file for extraction: " + v1);
        }
        try {
            ZipFile zip = new ZipFile(this.X8);
            ZipEntry entry = zip.getEntry(v1);
            if (entry != null) {
                return zip.getInputStream(entry);
            }
            throw new DH0("Couldn't find '" + v1 + "' in JAR: " + this.X8);
        } catch (IOException e) {
            throw new DH0("Error reading '" + v1 + "' in JAR: " + this.X8, e);
        }
    }

    public final File OY(String v1, String v2, File v3) {
        String crc = null;
        if (v3.exists()) {
            try {
                crc = ou(new FileInputStream(v3));
            } catch (FileNotFoundException ignored) {
            }
        }
        if (crc == null || !crc.equals(v2)) {
            InputStream in = null;
            FileOutputStream out = null;
            try {
                in = OA0(v1);
                v3.getParentFile().mkdirs();
                out = new FileOutputStream(v3);
                byte[] buf = new byte[4096];
                int read;
                while ((read = in.read(buf)) != -1) {
                    out.write(buf, 0, read);
                }
                M5(out);
                M5(in);
            } catch (IOException e) {
                throw new DH0("Error extracting file: " + v1 + "\nTo: " + v3.getAbsolutePath(), e);
            } finally {
                M5(out);
                M5(in);
            }
        }
        return v3;
    }

    public final void kZ(String v1) {
        String crc = ou(OA0(v1));
        String fileName = new File(v1).getName();
        File tmpFile = new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + crc, fileName);
        Throwable th = H80(v1, crc, tmpFile);
        if (th == null) {
            return;
        }
        try {
            File temp = File.createTempFile(crc, null);
            if (temp.delete() && H80(v1, crc, temp) == null) {
                return;
            }
        } catch (Throwable ignored) {
        }
        File userHomeFile = new File(System.getProperty("user.home") + "/.libgdx/" + crc, fileName);
        if (H80(v1, crc, userHomeFile) == null) {
            return;
        }
        File localTempFile = new File(".temp/" + crc, fileName);
        if (H80(v1, crc, localTempFile) == null) {
            return;
        }
        File libPathFile = new File(System.getProperty("java.library.path"), v1);
        if (libPathFile.exists()) {
            System.load(libPathFile.getAbsolutePath());
            return;
        }
        throw new DH0(th);
    }

    public final Throwable H80(String v1, String v2, File v3) {
        try {
            System.load(OY(v1, v2, v3).getAbsolutePath());
            return null;
        } catch (Throwable th) {
            return th;
        }
    }
}
