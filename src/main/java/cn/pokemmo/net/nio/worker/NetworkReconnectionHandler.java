package cn.pokemmo.net.nio.worker;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.PointerBuffer;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import f.discord.rr0_0;

public class NetworkReconnectionHandler extends Zd {
    public static dl_1 wy;
    public static com5__4 dy0;
    public static HashSet Bf;
    public rr0_0 Lz;
    public boolean y60;
    public final boolean Fp;
    public final boolean gN;

    public static void wt0(so0_0 source, JFileChooser chooser) {
        source.qE0(new Dn0(chooser.getSelectedFile()));
    }

    public static void FB(so0_0 source, String value) {
        lg_0.I70.getClass();
        source.qE0(new VE(value, zv_1.uq0));
    }

    static {
        dy0 = com5__4.a7;
    }

    public NetworkReconnectionHandler() {
        super();
        this.Lz = null;
        this.y60 = false;
        this.gN = ea0_1.rv0;
        wy = Cq0.E1(NetworkReconnectionHandler.class);
        if (dy0 != com5__4.a7) {
            wy.info(dy0.ob0());
            if (Bf != null) {
                wy.info("- Has permissions: {}", Arrays.toString(Bf.toArray(new l6_0[0])));
            }
        }
        if (ea0_1.NL) {
            this.Fp = false;
        } else {
            this.Fp = Desktop.isDesktopSupported()
                && Desktop.getDesktop().isSupported(Desktop.Action.OPEN);
        }
    }

    public final void RF0() {
        if (!dw_2.Q30 || !h50_0.ac || this.y60 || !ea0_1.T9 || lpt3__1.Qm || tw0_0.Eu(1)) {
            return;
        }
        rr0_0 connection = new rr0_0();
        connection.Op = new QJ((NR) this, connection);
        this.Lz = connection;
        long started = System.currentTimeMillis();
        try {
            connection.AV(new int[0]);
        } catch (Exception ignored) {
        }
        long elapsed = System.currentTimeMillis() - started;
        if (elapsed > 500L) {
            wy.error("Disabling discord rich presence because connect took {} ms.",
                Long.valueOf(elapsed));
            this.y60 = true;
        }
    }

    public final void E3() {
        if (this.Lz == null) {
            this.RF0();
            if (this.Lz == null) {
                return;
            }
        }
        long started = System.currentTimeMillis();
        try {
            if (dw_2.Q30 && !tw0_0.ng()) {
                cl_0 presence = new cl_0();
                presence.q4();
                yt_1 textSource = tw0_0.e60;
                if (textSource != null) {
                    _else text = textSource.N60();
                    if (text != null) {
                        presence.wp(text.OE());
                    }
                }
                boolean active = false;
                a10_0 state = tw0_0.PK0;
                Cq category = state == null ? null : state.eu();
                if (category != null && category != Cq.Jd && category != Cq.yL) {
                    if (category == Cq.Sa0 && state.Ol0() != null) {
                        presence.cL(sm0_0.wa0(6505, state.Ol0().nz0(false)));
                        active = true;
                    } else if (state.s80()) {
                        presence.cL(sm0_0.c0(6502));
                        active = true;
                    } else if (state.mo()) {
                        presence.cL(sm0_0.c0(6503));
                        active = true;
                    } else if (state.ii()) {
                        presence.cL(sm0_0.wa0(6504, Short.toString(state.Kx0())));
                        active = true;
                    }
                }
                if (active) {
                    presence.sy(OffsetDateTime.ofInstant(
                        Instant.ofEpochMilli(state.yE()), ZoneOffset.UTC));
                } else if (tw0_0.rl != null) {
                    presence.cL(sm0_0.c0(6501));
                    presence.sy(OffsetDateTime.ofInstant(
                        Instant.ofEpochMilli(tw0_0.rl.z00()), ZoneOffset.UTC));
                }
                this.Lz.Rx0(presence.Os0());
            } else {
                this.tA();
                return;
            }
        } catch (Exception ignored) {
        }
        long elapsed = System.currentTimeMillis() - started;
        if (elapsed > 500L) {
            wy.error("Disabling discord rich presence because update took {} ms.",
                Long.valueOf(elapsed));
            this.y60 = true;
            this.tA();
        }
    }

    public final void ww0() {
        this.E3();
    }

    public final void XV(File file) {
        String path = file.getAbsolutePath();
        if (!this.gN) {
            return;
        }
        try {
            new ProcessBuilder().inheritIO().command("xdg-open", path).start();
        } catch (IOException exception) {
            wy.error("Failed to start xdg-open", exception);
            Qy0.yI0.dk(-1, sm0_0.c0(84));
        }
    }

    public final boolean QA0() {
        try {
            new ea0_1().h9("mmo");
            return true;
        } catch (Exception exception) {
            tw0_0.uV.Ef0("Error",
                "Failed to load core libraries. Please redownload the client.",
                UE.iC, null, false);
            wy.error("Failed to load core libraries.", exception);
            return false;
        }
    }

    @Override
    public final void Pd0() {
        if (qt_1.yr0() != qt_1.C1) {
            lg_0.k.bE();
            return;
        }
        try {
            String javaHome = System.getProperty("java.home");
            if (javaHome == null || javaHome.isEmpty()) {
                throw new RuntimeException("Invalid java.home");
            }
            StringBuilder command = new StringBuilder();
            command.append(javaHome).append(File.separator).append("bin").append(File.separator)
                .append("javaw");
            RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
            for (String argument : runtime.getInputArguments()) {
                command.append(' ').append(argument);
            }
            command.append(" -cp").append(runtime.getClassPath()).append(' ')
                .append(com.pokeemu.client.Client.class.getName()).append(' ');
            Runtime.getRuntime().exec(command.toString());
        } catch (Exception exception) {
            wy.error("Error attempting auto restart.", exception);
        }
        lg_0.k.bE();
    }

    public final boolean mJ(so0_0 source, String... extensions) {
        if (ep_0.x20()) {
            try (MemoryStack stack = MemoryStack.stackPush()) {
                PointerBuffer filters = stack.mallocPointer(extensions.length);
                for (String extension : extensions) {
                    filters.put(stack.UTF8("*." + extension));
                }
                filters.flip();
                String selected = TinyFileDialogs.tinyfd_openFileDialog("", "", filters, "", false);
                if (selected == null) {
                    Qy0 dialog = Qy0.Sq();
                    if (dialog != null) {
                        dialog.jE(sm0_0.c0(1085));
                    }
                } else {
                    lg_0.k.lPT5(() -> FB(source, selected));
                }
                return true;
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setSelectedFile(new File(""));
        chooser.setFileSelectionMode(0);
        if (extensions.length != 0) {
            chooser.setFileFilter(new FileNameExtensionFilter(",", extensions));
        }
        if (chooser.showOpenDialog(null) == 0) {
            File selected = chooser.getSelectedFile();
            if (selected == null) {
                Qy0 dialog = Qy0.Sq();
                if (dialog != null) {
                    dialog.jE(sm0_0.c0(1085));
                }
            } else {
                lg_0.k.lPT5(() -> wt0(source, chooser));
            }
        }
        return true;
    }

    public final void n2(File file) {
        if (ea0_1.NL) {
            lg_0.lv0.Lf(file.getPath());
            return;
        }
        if (this.Fp) {
            try {
                Desktop.getDesktop().open(file);
                return;
            } catch (Exception exception) {
                if (!this.gN && Qy0.Sq() != null) {
                    exception.printStackTrace();
                    Qy0.Sq().jE(sm0_0.c0(84));
                }
            }
        }
        if (this.gN) {
            new Thread(() -> this.XV(file)).start();
        }
    }

    public final P40[] ly(k5_0 filter) {
        try {
            HashSet values = p10_0.io();
            if (values.isEmpty()) {
                throw new RuntimeException();
            }
            if (values.size() < 5) {
                tw0_0.rl.sf = true;
            }
            ArrayList matching = new ArrayList();
            Iterator iterator = values.iterator();
            while (iterator.hasNext()) {
                P40 value = (P40) iterator.next();
                if (filter.zr0(value.ee0)) {
                    matching.add(value);
                }
            }
            return (P40[]) matching.toArray(new P40[0]);
        } catch (Exception ignored) {
            return new P40[]{new P40((byte) -1, new byte[]{
                (byte) -77, (byte) -19, (byte) -65, (byte) -92,
                (byte) -76, (byte) 103, (byte) 34, (byte) -107,
                (byte) 100, (byte) -77, (byte) -57, (byte) -83,
                (byte) -35, (byte) -69, (byte) 25, (byte) -128
            })};
        }
    }

    public final void BO() {
        lpt5__5.hL.Com4.execute(this::ww0);
    }

    public final void tA() {
        try {
            if (this.Lz != null) {
                this.Lz.close();
                this.Lz = null;
            }
        } catch (Exception ignored) {
        }
    }

    public final void xz0(boolean maximize) {
        if (maximize) {
            GLFW.glfwMaximizeWindow(lg_0.S4.rt0.hc0);
        } else {
            GLFW.glfwRestoreWindow(lg_0.S4.rt0.hc0);
        }
    }

    public final void vl0() {
        int width = lg_0.S4.Kr0();
        int height = lg_0.S4.sD0();
        if (width < 128 || height < 128) {
            return;
        }
        byte mode = dw_2.L90;
        if (mode == 0) {
            try {
                if (GLFW.glfwGetWindowAttrib(lg_0.S4.rt0.hc0, 131080) == 1) {
                    return;
                }
            } catch (Throwable throwable) {
                wy.info("Failed to retrieve monitor information", throwable);
            }
        } else if (mode == 1 && DZ.pJ0().length > 1) {
            EA monitor = lg_0.S4.Wz0();
            if (dw_2.L90 == 1 && monitor != null) {
                dw_2.o40 = monitor.Oo + "," + monitor.jD0 + "," + monitor.SI;
                dw_2.CY();
            }
        }
        if (dw_2.d70 != width || dw_2.ag != height) {
            dw_2.d70 = width;
            dw_2.ag = height;
            dw_2.Va = true;
        }
    }

    public final boolean kA(String value) {
        wy.info("Setting clipboard contents");
        if (Cr0.ED0()) {
            wy.info("Setting clipboard contents glfw");
            GLFW.glfwSetClipboardString(lg_0.S4.q90().Z6(), value);
            return true;
        }
        if (ea0_1.NL) {
            return false;
        }
        wy.info("Setting clipboard contents awt");
        try {
            StringSelection selection = new StringSelection(value);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

    public final void Qw0(byte mode) {
        if (GLFW.glfwGetPlatform() == 393219) {
            return;
        }
        if (mode == 0) {
            try {
                int[][] work = new int[4][1];
                int[][] frame = new int[4][1];
                T7 monitor = (T7) lg_0.S4.Wz0();
                GLFW.glfwGetMonitorWorkarea(monitor.Y2, work[0], work[1], work[2], work[3]);
                Su0 window = lg_0.S4.rt0;
                GLFW.glfwGetWindowFrameSize(window.hc0, frame[0], frame[1], frame[2], frame[3]);
                boolean reposition = false;
                int x = window.Py() + lg_0.S4.Kr0() + frame[0][0] + frame[2][0];
                int right = work[0][0] + work[2][0];
                int y = window.hv() + lg_0.S4.sD0() + frame[1][0] + frame[3][0];
                int bottom = work[1][0] + work[3][0];
                if (x >= right && y >= bottom) {
                    x = window.Py() - frame[0][0];
                    y = window.hv() - frame[1][0];
                    if (y < 0) {
                        y = work[1][0];
                    }
                    if (x < 0) {
                        x = work[0][0];
                    }
                    reposition = true;
                }
                if (reposition) {
                    GLFW.glfwSetWindowPos(window.hc0, x, y);
                }
            } catch (Throwable throwable) {
                wy.info("Failed to retrieve monitor information", throwable);
            }
        } else if (mode == 2) {
            try {
                int[][] work = new int[4][1];
                T7 monitor = (T7) lg_0.S4.Wz0();
                GLFW.glfwGetMonitorWorkarea(monitor.Y2, work[0], work[1], work[2], work[3]);
                Su0 window = lg_0.S4.rt0;
                int x = window.Py();
                int y = window.hv();
                if (x < work[0][0]) {
                    x = work[0][0];
                }
                if (y < work[1][0]) {
                    y = work[1][0];
                }
                int right = window.Py() + lg_0.S4.Kr0();
                if (right > work[0][0] + work[2][0]) {
                    x = work[0][0] + work[2][0] - lg_0.S4.Kr0();
                    if (x < 0) {
                        x = 0;
                    }
                }
                int bottom = window.hv() + lg_0.S4.sD0();
                if (bottom > work[1][0] + work[3][0]) {
                    y = work[1][0] + work[3][0] - lg_0.S4.sD0();
                    if (y < 0) {
                        y = 0;
                    }
                }
                if (x != window.Py() || y != window.hv()) {
                    GLFW.glfwSetWindowPos(window.hc0, x, y);
                }
            } catch (Throwable throwable) {
                wy.info("Failed to retrieve monitor information", throwable);
            }
        }
    }

    public final boolean rs(l6_0 permission) {
        HashSet permissions = Bf;
        return permissions == null || permissions.contains(permission);
    }

    public final String L60(l6_0 permission) {
        if (dy0 == com5__4.Xv0) {
            if (permission == l6_0.tt) {
                return sm0_0.c0(1372);
            }
            if (permission == l6_0.F0) {
                return sm0_0.c0(1371);
            }
        }
        return "";
    }

    public final boolean DE0() {
        return com.badlogic.gdx.backends.lwjgl3.angle.ANGLELoader.isCompatible();
    }

    public final byte[] Xr() {
        String machineId = null;
        try {
            if (!ea0_1.T9 && !ea0_1.NL) {
                if (ea0_1.rv0) {
                    try {
                        machineId = lg_0.I70.GK("/etc/machine-id").uz();
                    } catch (Exception ignored) {
                    }
                    if (machineId == null || machineId.length() < 10) {
                        try {
                            machineId = lg_0.I70.GK("/var/lib/dbus/machine-id").uz();
                        } catch (Exception ignored) {
                        }
                    }
                }
            } else {
                machineId = q_0.cB0();
            }
            if (machineId != null) {
                machineId = machineId.trim();
            }
            if (machineId == null || machineId.length() < 10) {
                Map environment = System.getenv();
                String osName = System.getProperty("os.name");
                String osArch = System.getProperty("os.arch");
                String locale = Locale.getDefault().toString();
                String processId = (String) environment.get("PROCESS_IDENTIFIER");
                String processors = (String) environment.get("NUMBER_OF_PROCESSORS");
                String host = "";
                try {
                    host = java.net.InetAddress.getLocalHost().getHostName();
                } catch (java.net.UnknownHostException ignored) {
                }
                machineId = String.join("|", osName, osArch, locale, host, processId, processors);
            }
            return MessageDigest.getInstance("SHA-256").digest(machineId.getBytes());
        } catch (Exception exception) {
            exception.printStackTrace();
            return new byte[0];
        }
    }

    public final boolean dU(File file) {
        int timeout = 10000;
        int sleep = 10;
        FileChannel channel = null;
        try {
            channel = FileChannel.open(file.toPath(), StandardOpenOption.WRITE);
            FileLock lock = channel.tryLock();
            if (lock == null) {
                wy.warn("File {} is currently used, waiting with a timeout of {}ms to unlock",
                    file.getAbsolutePath(), Integer.valueOf(timeout));
                while ((lock = channel.tryLock()) == null) {
                    if (timeout <= 0) {
                        wy.error("Timeout was reached before file got unlocked");
                        channel.close();
                        return false;
                    }
                    Thread.sleep((long) sleep);
                    timeout -= sleep;
                }
            }
            channel.close();
            return true;
        } catch (Exception exception) {
            if (channel != null) {
                try {
                    channel.close();
                } catch (Exception closeException) {
                    exception.addSuppressed(closeException);
                }
            }
            wy.error("Couldn't acquire file lock", exception);
            return false;
        }
    }
}
