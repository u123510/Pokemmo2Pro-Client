package cn.pokemmo.net.util;

import f.CE;
import f.Cq0;
import f.Jw0;
import f.KT;
import f.QA0;
import f.dl_1;
import f.kd_2;
import f.sm0_0;
import f.xq_1;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.text.Normalizer;
import java.util.BitSet;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/**
 * 网络通信、I/O 与通用数据压缩解码工具库 (Network & I/O Utilities)
 * <p>
 * 原始混淆类: {@code f.tx_1}
 */
public abstract class NetworkIOUtils {
    public static final dl_1 Sy0 = Cq0.E1(NetworkIOUtils.class);
    public static final Pattern j60 = Pattern.compile("\\p{M}");
    public static final Matcher H90 = j60.matcher("");
    public static Thread H8 = null;

    protected NetworkIOUtils() {
    }

    public static String O7(String var0) {
        if (var0 != null && !var0.isEmpty()) {
            String var1 = null;
            if (var0.contains("/")) {
                var1 = "/";
            }

            if (var0.contains("\\")) {
                if (var1 != null) {
                    throw new IllegalArgumentException(xq_1.pz0("Path ", var0, " contains unclear delimiter"));
                }

                var1 = "\\\\";
            }

            if (var1 == null) {
                return var0;
            } else {
                String[] var2 = var0.split(var1);
                LinkedList<String> var3 = new LinkedList();
                int var4 = var2.length;

                for (int var5 = 0; var5 < var4; ++var5) {
                    String var6 = var2[var5];
                    if (var6.equals("..")) {
                        if (var3.isEmpty()) {
                            return var0;
                        }

                        var3.removeLast();
                    } else if (!var6.equals(".") && !var6.isEmpty()) {
                        var3.add(var6);
                    }
                }

                String var7 = String.join("/", var3);
                if (var0.endsWith(var1)) {
                    var7 = QA0.W0(var7, var1);
                }

                if (var0.startsWith(var1)) {
                    var7 = QA0.W0(var1, var7);
                }

                return var7;
            }
        } else {
            return var0;
        }
    }

    public static byte[] Nm0(InputStream var0) throws IOException {
        int var1 = 1024;
        byte[] var6;
        if (var0 instanceof ByteArrayInputStream) {
            int var7 = var0.available();
            var6 = new byte[var7];
            var0.read(var6, 0, var7);
        } else {
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();
            byte[] var3 = new byte[var1];

            int var4;
            while ((var4 = var0.read(var3, 0, var1)) != -1) {
                var2.write(var3, 0, var4);
            }

            var6 = var2.toByteArray();
        }

        return var6;
    }

    public static String dE(ByteBuffer var0) {
        StringBuilder var1 = new StringBuilder();
        int var2 = 0;

        while (var0.hasRemaining()) {
            if (var2 % 16 == 0) {
                var1.append(String.format("%04X: ", var2));
            }

            int var3 = var0.get() & 255;
            var1.append(String.format("%02X ", var3));
            ++var2;
            if (var2 % 16 == 0) {
                var1.append("  ");
                int var4 = var0.position() - 16;

                for (int var5 = 0; var5 < 16; ++var5) {
                    int var6 = var4 + 1;
                    int var7 = var0.get(var4);
                    if (var7 > 31 && var7 < 128) {
                        var1.append((char) var7);
                    } else {
                        var1.append('.');
                    }

                    var4 = var6;
                }

                var1.append("\n");
            }
        }

        var2 %= 16;
        if (var2 > 0) {
            for (int var8 = 0; var8 < 17 - var2; ++var8) {
                var1.append("   ");
            }

            int var9 = var0.position() - var2;

            for (int var10 = 0; var10 < var2; ++var10) {
                int var11 = var9 + 1;
                int var12 = var0.get(var9);
                if (var12 > 31 && var12 < 128) {
                    var1.append((char) var12);
                } else {
                    var1.append('.');
                }

                var9 = var11;
            }
        }

        return var1.toString();
    }

    public static int T30(ByteBuffer var0, kd_2 var1) {
        int var2 = var0.position();
        int var3 = -1;
        if (var0.get() == 16) {
            int var4 = var0.getShort() & (var0.get() & 255) * 65536 + 65535;
            byte var5 = var0.get();
            if (var1 == kd_2.Gu0 && var5 <= 63 && var4 >= 32 && var4 % 8 == 0) {
                var3 = var4;
            } else {
                kd_2 var6 = kd_2.GU;
                if (var1 == var6 && (var4 == 32 || var4 == 128) && var5 <= 63) {
                    var3 = var4;
                } else if (var1 == var6 && var4 == 512) {
                    var3 = var4;
                } else if (var1 == kd_2.vF && var5 == 0) {
                    System.out.println("CheckLz77Type.PaletteCombo: " + var4);
                    var3 = var4;
                }
            }
        }

        var0.position(var2);
        return var3;
    }

    public static String je0(int var0) {
        return HU(var0, 2);
    }

    public static String i(int var0, boolean var1) {
        if (Math.abs(var0) < 60) {
            return var1 ? sm0_0.hL0(7509, "Very soon") : sm0_0.hL0(7510, "Just now");
        } else {
            return HU(Math.abs(var0), 1);
        }
    }

    public static void Uv0(int var0, int var1, int var2, StringBuilder var3) {
        if (var1 < var2) {
            if (var0 < 60) {
                var3.append(var0).append(' ');
                if (sm0_0.cU.l90(7500)) {
                    var3.append(sm0_0.c0(var0 == 1 ? 7500 : 7501));
                } else {
                    var3.append("second").append(var0 == 1 ? "" : "s");
                }
            } else {
                int var4 = var0 / 60;
                if (var4 < 60) {
                    var3.append(var4).append(' ');
                    if (sm0_0.cU.l90(7502)) {
                        var3.append(sm0_0.c0(var4 == 1 ? 7502 : 7503));
                    } else {
                        var3.append("minute").append(var4 == 1 ? "" : "s");
                    }

                    var3.append(' ');
                    Uv0(var0 - var4 * 60, var1 + 1, var2, var3);
                } else {
                    var4 = var0 / 3600;
                    if (var4 < 24) {
                        var3.append(var4).append(' ');
                        if (sm0_0.cU.l90(7504)) {
                            var3.append(sm0_0.c0(var4 == 1 ? 7504 : 7505));
                        } else {
                            var3.append("hour").append(var4 == 1 ? "" : "s");
                        }

                        var3.append(' ');
                        Uv0(var0 - var4 * 3600, var1 + 1, var2, var3);
                    } else {
                        var4 = var0 / 86400;
                        var3.append(var4).append(' ');
                        if (sm0_0.cU.l90(7506)) {
                            var3.append(sm0_0.c0(var4 == 1 ? 7506 : 7507));
                        } else {
                            var3.append("day").append(var4 == 1 ? "" : "s");
                        }

                        var3.append(' ');
                        Uv0(var0 - var4 * 86400, var1 + 1, var2, var3);
                    }
                }
            }
        }
    }

    public static String SH0(byte[] var0) {
        Formatter var1 = new Formatter();
        int var2 = var0.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            var1.format("%02x", var0[var3]);
        }

        String var4 = var1.toString().toLowerCase();
        var1.close();
        return var4;
    }

    public static InputStream iq(String var0) throws IOException {
        return d7(var0, NetworkIOUtils::Md0);
    }

    public static InputStream d7(String var0, Consumer<HttpURLConnection> var1) throws IOException {
        HttpURLConnection var2 = (HttpURLConnection) (new URL(var0)).openConnection();
        var2.setInstanceFollowRedirects(true);
        var2.setRequestProperty("Accept-Encoding", "gzip, deflate");
        var2.setConnectTimeout(30000);
        var2.setReadTimeout(30000);
        var1.accept(var2);
        var2.connect();
        String var3 = var2.getContentEncoding();
        if (var3 != null && var3.equalsIgnoreCase("gzip")) {
            return new GZIPInputStream(var2.getInputStream());
        } else if (var3 != null && var3.equalsIgnoreCase("deflate")) {
            return new InflaterInputStream(var2.getInputStream(), new Inflater(true));
        } else {
            return var2.getInputStream();
        }
    }

    public static byte Qf0(byte var0) {
        return (byte) (var0 % 2 != 0 ? var0 - 1 : var0 + 1);
    }

    public static byte Zk(short var0, short var1, short var2, short var3) {
        if (var0 < var2) {
            return 3;
        } else if (var0 > var2) {
            return 2;
        } else {
            return (byte) (var1 > var3 ? 1 : 0);
        }
    }

    public static String rX(String var0) {
        char[] var1 = var0.toCharArray();
        boolean var2 = true;
        boolean var3 = false;

        for (int var4 = 0; var4 < var1.length; ++var4) {
            char var5 = var1[var4];
            if (!Character.isWhitespace(var5) && var5 != '.' && var5 != '\'') {
                if (var2) {
                    char var6 = Character.toUpperCase(var5);
                    var1[var4] = var6;
                    var2 = false;
                    if (var6 != var5) {
                        var3 = true;
                    }
                } else {
                    char var7 = Character.toLowerCase(var5);
                    var1[var4] = var7;
                    if (var7 != var5) {
                        var3 = true;
                    }
                }
            } else {
                var2 = true;
            }
        }

        return var3 ? String.valueOf(var1) : var0;
    }

    public static byte[] PrN(InetAddress var0) {
        InetAddress var1;
        NetworkInterface var2;
        try {
            if (var0 == null) {
                var1 = InetAddress.getLocalHost();
            } else {
                var1 = var0;
            }

            var2 = NetworkInterface.getByInetAddress(var1);
            if (var2 == null) {
                Enumeration var3 = NetworkInterface.getNetworkInterfaces();

                while (var3.hasMoreElements()) {
                    NetworkInterface var4 = (NetworkInterface) var3.nextElement();

                    try {
                        if (var4.getHardwareAddress() != null && var4.getHardwareAddress().length == 6) {
                            var2 = var4;
                            break;
                        }
                    } catch (Exception var6) {
                    }
                }
            }

            if (var2 != null) {
                byte[] var8 = var2.getHardwareAddress();
                if (var8 != null && var8.length == 6) {
                    return var8;
                }
            }
        } catch (Exception var7) {
            Sy0.error("", var7);
        }

        return var0 != null ? PrN((InetAddress) null) : new byte[]{-1, -1, -1, -1, -1, -1};
    }

    public static String Hc0(long var0) {
        int var2 = 8;
        byte[] var3 = new byte[var2];
        ByteBuffer.wrap(var3).putLong(var0);
        String var4 = "";

        for (int var5 = 2; var5 < var2; ++var5) {
            StringBuilder var6 = new StringBuilder();
            var6.append(var4);
            var4 = var6.append(String.format("%02X%s", var3[var5], var5 < 7 ? ":" : "")).toString();
        }

        return var4;
    }

    public static String bp(long var0) {
        long var2 = var0 % 60L;
        long var4 = var0 / 60L % 60L;
        long var6 = var0 / 3600L % 24L;
        return String.format("%d:%02d:%02d", var6, var4, var2);
    }

    public static String J10(String var0, boolean var1) {
        if (var1) {
            var0 = var0.trim().toLowerCase();
            if (var0.indexOf(65279) > -1) {
                var0 = var0.replace("\ufeff", "");
            }
        }

        String var2 = Normalizer.normalize(var0, Normalizer.Form.NFD);
        if (var2 == var0) {
            return var0;
        } else {
            Thread var3 = H8;
            String var4;
            if (var3 != null && var3 != Thread.currentThread()) {
                var4 = j60.matcher(var2).replaceAll("");
            } else {
                H8 = Thread.currentThread();
                var4 = H90.reset(var2).replaceAll("");
            }

            return Normalizer.normalize(var4, Normalizer.Form.NFC);
        }
    }

    public static boolean qp0(String var0, String var1) {
        if (var1.indexOf(65279) > -1) {
            var1 = var1.replace("\ufeff", "");
        }

        int var2 = var1.length();
        if (var2 == 0) {
            return true;
        } else {
            char var3 = Character.toLowerCase(var1.charAt(0));
            char var4 = Character.toUpperCase(var1.charAt(0));

            for (int var5 = var0.length() - var2; var5 >= 0; --var5) {
                char var6 = var0.charAt(var5);
                if ((var6 == var3 || var6 == var4) && var0.regionMatches(true, var5, var1, 0, var2)) {
                    return true;
                }
            }

            return false;
        }
    }

    public static boolean SC(String var0, String var1) {
        int var2 = var1.length();
        return var0.regionMatches(true, 0, var1, 0, var2);
    }

    public static boolean H40(short var0, boolean var1) {
        switch (var0) {
            case 15:
            case 19:
            case 57:
            case 70:
            case 91:
            case 127:
            case 148:
            case 230:
            case 291:
            case 431:
            case 432:
                return true;
            case 100:
            case 249:
                return var1 ^ true;
            case 105:
            case 135:
            case 156:
            case 208:
            case 215:
            case 234:
            case 235:
            case 236:
            case 273:
            case 303:
            case 312:
            case 355:
            case 456:
            case 505:
            case 1030:
            case 1031:
                return var1;
            default:
                return false;
        }
    }

    public static void iY(ByteBuffer var0, int var1, int var2, int var3) {
        while (var0.remaining() > 12) {
            if (var0.getInt() == var1 && var0.getInt() == var2 && var0.getInt() == var3) {
                return;
            }
        }

        throw new RuntimeException("Unable to find pattern");
    }

    public static String kI0(Object var0) {
        String var1 = ", ";
        StringBuilder var2 = new StringBuilder("[");
        Field[] var3 = var0.getClass().getDeclaredFields();
        int var4 = var3.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            Field var6 = var3[var5];
            var6.setAccessible(true);
            if (!Modifier.isStatic(var6.getModifiers())) {
                try {
                    if (var6.getAnnotation(Jw0.class) == null) {
                        if (var2.length() > 1) {
                            var2.append(var1);
                        }

                        var2.append(var6.getName() + "=" + var6.get(var0));
                    }
                } catch (IllegalAccessException var8) {
                }
            }
        }

        var2.append(']');
        return var2.toString();
    }

    public static int m20(int[] var0) {
        if (var0.length == 0) {
            return 0;
        } else {
            int var1 = 0;

            for (int var2 = 0; var2 < var0.length; ++var2) {
                var1 += var0[var2];
            }

            return var1 / var0.length;
        }
    }

    public static byte gX(CE var0) {
        int var1 = var0.vQ;
        if (var1 < 0) {
            var1 *= -1;
        }

        return (byte) (var1 % 6);
    }

    public static void Md0(HttpURLConnection var0) {
    }

    public static byte[] Gi(int var0, ByteBuffer var1) {
        int var2 = var1.position();
        var1.position(var0);
        byte var3 = var1.get();
        if (var3 == 17) {
            var1.position(var0);
            if (var1.get() != 17) {
                throw new RuntimeException("This data is not Lz77 compressed! Pos = " + var1.position());
            } else {
                var0 = 0;

                for (int var4 = 0; var4 < 3; ++var4) {
                    var0 |= (var1.get() & 255) << var4 * 8;
                }

                if (var0 == 0) {
                    var0 = var1.getInt();
                }

                byte[] var17 = new byte[var0];
                int var5 = 0;

                while (var5 < var0) {
                    int var6 = var1.get() & 255;

                    for (int var7 = 0; var7 < 8 && var5 < var0; ++var7) {
                        if ((var6 & 128 >> var7) > 0) {
                            byte var8 = var1.get();
                            int var9 = var8 & 255;
                            int var10 = var9 >> 4;
                            int var11;
                            if (var10 == 0) {
                                var11 = var9 << 4;
                                byte var12 = var1.get();
                                var11 = (var11 | (var12 & 255) >> 4) + 17;
                                var9 = (var12 & 15) << 8 | var1.get() & 255;
                            } else if (var10 == 1) {
                                var9 = var1.get() & 255;
                                byte var13 = var1.get();
                                int var14 = var13 & 255;
                                int var15 = var1.get() & 255;
                                var11 = ((var8 & 15) << 12 | var9 << 4 | var14 >> 4) + 273;
                                var9 = (var13 & 15) << 8 | var15;
                            } else {
                                var11 = var10 + 1;
                                var9 = (var8 & 15) << 8 | var1.get() & 255;
                            }

                            if (var9 > var5) {
                                throw new RuntimeException("Cannot go back more than already written");
                            }

                            int var18 = 0;
                            int var19 = var5;

                            while (var18 < var11 && var19 < var0) {
                                var17[var19] = var17[var5 - var9 - 1 + var18];
                                ++var19;
                                ++var18;
                            }

                            if (var19 > var0) {
                                var5 = var19;
                                break;
                            }

                            var5 = var19;
                        } else {
                            int var20 = var5 + 1;
                            var17[var5] = var1.get();
                            if (var20 > var0) {
                                var5 = var20;
                                break;
                            }

                            var5 = var20;
                        }
                    }
                }

                return var17;
            }
        } else if (var3 != 16) {
            throw new RuntimeException("This data is not Lz77 compressed! Pos = " + var1.position());
        } else {
            var0 = var1.getShort() & 65535 | (var1.get() & 255) << 16;
            byte[] var21 = new byte[var0];
            int var22 = var1.position();
            int var23 = 0;
            byte var24 = 8;
            BitSet var25 = new BitSet(8);

            while (var23 < var0) {
                var1.position(var22);
                if (var24 == 8) {
                    byte var26 = var1.get();
                    var25.clear();

                    for (int var27 = 7; var27 > -1; --var27) {
                        if ((var26 & 1 << var27) > 0) {
                            var25.set(7 - var27);
                        }
                    }

                    ++var22;
                    var24 = 0;
                } else if (!var25.get(var24)) {
                    var21[var23] = var1.get();
                    ++var22;
                    ++var23;
                    var24 = (byte) (var24 + 1);
                } else {
                    byte[] var28 = new byte[2];
                    var1.get(var28);
                    int var29 = var28[0];
                    int var30 = (var29 & 255) >> 4;
                    int var31 = var23 - ((((var28[0] & 255) - (((var29 & 255) >> 4) << 4)) << 8) + (var28[1] & 255)) - 1;
                    int var32 = var30 + 3;
                    int var33 = 0;
                    int var34 = 0;
                    if (var23 > 0) {
                        byte var35 = var21[var23 - 1];
                    }

                    while (var33 != var32) {
                        int var36 = var23 + var34;
                        if (var36 >= 0) {
                            int var37 = var31 + var34;
                            if (var37 >= 0) {
                                int var38 = var23 + var33;
                                if (var38 < var0) {
                                    if (var37 >= var23) {
                                        var34 = 0;
                                        var21[var38] = var21[var31];
                                    } else {
                                        var21[var38] = var21[var37];
                                        byte var39 = var21[var36];
                                    }
                                }
                            }
                        }

                        ++var33;
                        ++var34;
                    }

                    var23 += var30 + 2;
                    ++var22;
                    ++var22;
                    ++var23;
                    var24 = (byte) (var24 + 1);
                }
            }

            var1.position(var2);
            return var21;
        }
    }

    public static void qR(int var0, int var1, ByteBuffer var2) {
        while (var2.remaining() > 8) {
            if (var2.getInt() == var0 && var2.getInt() == var1) {
                return;
            }
        }

        throw new RuntimeException("Unable to find pattern");
    }

    public static String HU(int var0, int var1) {
        StringBuilder var2 = new StringBuilder();
        Uv0(Math.abs(var0), 0, var1, var2);
        if (var0 >= 0) {
            return var2.toString();
        } else if (sm0_0.cU.l90(7508)) {
            return sm0_0.wa0(7508, var2.toString());
        } else {
            return var2.append(" ago").toString();
        }
    }

    public static String w10(String var0) {
        String var1 = "SHA-256";
        File var2 = new File(var0);
        if (var2.exists() && var2.isFile()) {
            FileInputStream var3 = null;

            try {
                var3 = new FileInputStream(var2);
                var0 = V3(var1, var3);

                try {
                    var3.close();
                } catch (IOException var8) {
                    var8.printStackTrace();
                }

                return var0;
            } catch (Exception var9) {
                String var5 = "ERROR CALCULATING";
                if (var3 != null) {
                    try {
                        var3.close();
                    } catch (IOException var7) {
                        var7.printStackTrace();
                    }
                }

                return var5;
            } catch (Throwable var10) {
                if (var3 != null) {
                    try {
                        var3.close();
                    } catch (IOException var6) {
                        var6.printStackTrace();
                    }
                }

                throw var10;
            }
        } else {
            return "FILE_DOESNT_EXIST";
        }
    }

    public static String V3(String var0, FileInputStream var1) {
        try {
            MessageDigest var2 = MessageDigest.getInstance(var0);
            BufferedInputStream var3 = new BufferedInputStream(var1);
            DigestInputStream var4 = new DigestInputStream(var3, var2);
            byte[] var5 = new byte[4096];

            while (var4.read(var5) != -1) {
            }

            return SH0(var2.digest());
        } catch (Exception var6) {
            return "ERROR CALCULATING";
        }
    }

    public static boolean Zk0(String var0) {
        File var4 = new File("pokemmo_updater.jar.TEMPORARY");
        InputStream var1 = null;
        ReadableByteChannel var2 = null;
        Closeable var3 = null;
        boolean var5;
        FileOutputStream var6 = null;

        try {
            var0 = var0.replace("\\", "/");
            var1 = iq(var0);
            var2 = Channels.newChannel(iq(var0));
            var6 = new FileOutputStream(var4);

            try {
                var6.getChannel().transferFrom(var2, 0L, Long.MAX_VALUE);
                var6.close();
                var5 = true;
                KT.E1(var1);
                KT.E1(var2);
                KT.E1(var6);
            } catch (Exception var8) {
                var3 = var6;
                var5 = false;
                KT.E1(var1);
                KT.E1(var2);
                KT.E1(var6);
            } catch (Throwable var9) {
                var3 = var6;
                KT.E1(var1);
                KT.E1(var2);
                KT.E1(var6);
                throw var9;
            }
        } catch (Exception var10) {
            var5 = false;
            KT.E1(var1);
            KT.E1(var2);
            KT.E1(var3);
        } catch (Throwable var11) {
            KT.E1(var1);
            KT.E1(var2);
            KT.E1(var3);
            throw var11;
        }

        return var5;
    }

    public static String QR(long var0) {
        int var2 = 1000;
        if (var0 < (long) var2) {
            return var0 + " B";
        } else {
            double var3 = (double) var0;
            double var5 = (double) var2;
            int var7 = (int) (Math.log(var3) / Math.log(var5));
            String var8 = "kMGTPE".charAt(var7 - 1) + "";
            return String.format("%.1f %sB", var3 / Math.pow(var5, (double) var7), var8);
        }
    }

    public static double uF(int var0, int var1) {
        if (var0 >= 1 && var1 >= 1) {
            if (var0 == var1) {
                return 100.0;
            } else {
                double var2 = (double) ((float) var0 * 100.0F / (float) var1);
                double var4 = 10.0;
                double var6 = (double) ((int) var2);
                return (double) Math.round((var2 - var6) * var4) / var4 + var6;
            }
        } else {
            return 0.0;
        }
    }
}
