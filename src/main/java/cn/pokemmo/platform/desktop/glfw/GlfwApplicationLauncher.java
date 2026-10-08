package cn.pokemmo.platform.desktop.glfw;

import f.*;


/*
 * Restored from the current f/Dt0 bytecode. The corresponding upstream
 * reference is LibGDX 1.12.1 Lwjgl3Application; this class keeps the
 * obfuscated runtime signatures and the bytecode's inlined window/sync flow.
 */

import com.badlogic.gdx.backends.lwjgl3.angle.ANGLELoader;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWWindowPosCallback;
import org.lwjgl.opengl.AMDDebugOutput;
import org.lwjgl.opengl.ARBDebugOutput;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLUtil;
import org.lwjgl.opengl.KHRDebug;
import org.lwjgl.opengles.GLES20;
import org.lwjgl.system.Callback;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.ThreadLocalUtil;

public class GlfwApplicationLauncher implements ee_2 {
    public static GLFWErrorCallback Lo;
    public static o50_0 kz0;
    public static Callback nk0;
    public final DZ V6;
    public final es_1 Ts;
    public final u90_0 bx0;
    public final hl_2 E00;
    public final int ai;
    public GC0 eA;
    public volatile boolean T0;
    public final es_1 Rb0;
    public final es_1 eG;
    public final es_1 jr0;
    public final Qt0 S9;

    public static void jd() {
        if (Lo != null) {
            return;
        }
        if (ea0_1.NL) {
            try {
                Class<?> loader = Class.forName("com.badlogic.gdx.backends.lwjgl3.awt.GlfwAWTLoader");
                Method load = loader.getMethod("load", new Class[0]);
                File library = (File) load.invoke(loader, new Object[0]);
                Configuration.GLFW_LIBRARY_NAME.set(library.getAbsolutePath());
                Configuration.GLFW_CHECK_THREAD0.set(Boolean.FALSE);
            } catch (ClassNotFoundException ignored) {
            } catch (Throwable throwable) {
                throw new nf_1("Couldn't load GLFW AWT for macOS.", throwable);
            }
        }

        System.setProperty("org.lwjgl.input.Mouse.allowNegativeMouseCoords", "true");
        synchronized (jd_1.class) {
            if (!jd_1.ww) {
                new ea0_1().h9("gdx");
                jd_1.ww = true;
            }
        }

        Lo = GLFWErrorCallback.createPrint(DZ.super$);
        GLFW.glfwSetErrorCallback(Lo);
        if (ea0_1.NL) {
            GLFW.glfwInitHint(327682, 225288);
        }
        GLFW.glfwInitHint(327681, 0);
        if (!GLFW.glfwInit()) {
            throw new nf_1("Unable to initialize GLFW");
        }
    }

    public static void vF() {
        try {
            Class<?> loader = Class.forName(ANGLELoader.class.getName());
            boolean ignored = ANGLELoader.isWindows;
            loader.getMethod("load", new Class[0]).invoke(loader, new Object[0]);
        } catch (ClassNotFoundException ignored) {
        } catch (Throwable throwable) {
            throw new nf_1("Couldn't load ANGLE.", throwable);
        }
    }

    public static void Mh0() {
        try {
            Class<?> loader = Class.forName(ANGLELoader.class.getName());
            boolean ignored = ANGLELoader.isWindows;
            loader.getMethod("postGlfwInit", new Class[0]).invoke(loader, new Object[0]);
        } catch (ClassNotFoundException ignored) {
        } catch (Throwable throwable) {
            throw new nf_1("Couldn't load ANGLE.", throwable);
        }
    }

    public GlfwApplicationLauncher(OR listener) {
        this(listener, new DZ());
    }

    public GlfwApplicationLauncher(OR listener, DZ configuration) {
        this.Ts = new es_1();
        new nb_2();
        this.ai = 2;
        this.T0 = true;
        this.Rb0 = new es_1();
        this.eG = new es_1();
        this.jr0 = new es_1();

        if (configuration.sK == COM7_.Nx) {
            vF();
        }
        jd();
        TT(new GC0());

        configuration = DZ.sF0(configuration);
        this.V6 = configuration;
        if (configuration.oH0 == null) {
            configuration.oH0 = listener.getClass().getSimpleName();
        }
        lg_0.k = (Dt0) this;

        if (!configuration.jZ) {
            u90_0 audio;
            try {
                audio = pi0(configuration);
            } catch (Throwable throwable) {
                AA(throwable);
                audio = new xj0_0();
            }
            this.bx0 = audio;
        } else {
            this.bx0 = new xj0_0();
        }

        lg_0.MF = this.bx0;
        lg_0.I70 = Sb();
        lg_0.lv0 = new yx_1(configuration);
        this.E00 = new hl_2();
        this.S9 = new Qt0();

        Su0 window = pk0(configuration, listener);
        if (configuration.sK == COM7_.Nx) {
            Mh0();
        }
        this.Ts.Ue0(window);

        try {
            LPT7();
            rG();
        } catch (Throwable throwable) {
            if (throwable instanceof RuntimeException) {
                throw (RuntimeException) throwable;
            }
            try {
                throw new nf_1(throwable);
            } finally {
                Va0();
            }
        }
        Va0();
    }

    public static f40_0 pi0(DZ configuration) {
        return new f40_0(configuration.a80, configuration.l7, configuration.YF0);
    }

    public static os0_0 Sb() {
        return new os0_0();
    }

    public static void wb0(Su0 window, DZ configuration, long monitor) {
        GLFW.glfwDefaultWindowHints();
        GLFW.glfwWindowHint(131076, 0);
        GLFW.glfwWindowHint(131075, configuration.tw0 ? 1 : 0);
        GLFW.glfwWindowHint(131080, configuration.h70 ? 1 : 0);
        GLFW.glfwWindowHint(131078, configuration.I30 ? 1 : 0);
        GLFW.glfwWindowHint(135169, configuration.m);
        GLFW.glfwWindowHint(135170, configuration.A20);
        GLFW.glfwWindowHint(135171, configuration.ta);
        GLFW.glfwWindowHint(135172, configuration.Nu);
        GLFW.glfwWindowHint(135174, configuration.Io0);
        GLFW.glfwWindowHint(135173, configuration.Hm0);
        GLFW.glfwWindowHint(135181, configuration.Yz);

        COM7_ backend = configuration.sK;
        if (backend == COM7_.wE || backend == COM7_.kH || backend == COM7_.WV) {
            GLFW.glfwWindowHint(139266, configuration.Ti);
            GLFW.glfwWindowHint(139267, configuration.ay);
            if (ea0_1.NL) {
                GLFW.glfwWindowHint(139270, 1);
                GLFW.glfwWindowHint(139272, 204801);
            }
        } else if (backend == COM7_.Nx) {
            GLFW.glfwWindowHint(139275, 221186);
            GLFW.glfwWindowHint(139265, 196610);
            GLFW.glfwWindowHint(139266, 2);
            GLFW.glfwWindowHint(139267, 0);
        }
        if (configuration.of0) {
            GLFW.glfwWindowHint(131082, 1);
        }
        if (configuration.s00) {
            GLFW.glfwWindowHint(139271, 1);
        }

        Z3 pixelFormat = configuration.UL;
        long sharedContext = monitor;
        long handle;
        int width;
        int height;
        String title = configuration.oH0;
        if (pixelFormat != null) {
            GLFW.glfwWindowHint(135183, pixelFormat.ax);
            width = pixelFormat.Vo;
            height = pixelFormat.c50;
            long fullScreenMonitor = pixelFormat.QL0;
            handle = GLFW.glfwCreateWindow(width, height, title, fullScreenMonitor, sharedContext);
        } else {
            GLFW.glfwWindowHint(131077, configuration.aX ? 1 : 0);
            handle = GLFW.glfwCreateWindow(configuration.s10, configuration.bU, title, 0L, sharedContext);
        }
        if (handle == 0L) {
            throw new nf_1("Couldn't create window");
        }

        int minWidth = configuration.PG0;
        int minHeight = configuration.Gk0;
        int maxWidth = configuration.Ak;
        int maxHeight = configuration.Gt;
        if (minWidth <= -1) {
            minWidth = -1;
        }
        if (minHeight <= -1) {
            minHeight = -1;
        }
        if (maxWidth <= -1) {
            maxWidth = -1;
        }
        if (maxHeight <= -1) {
            maxHeight = -1;
        }
        GLFW.glfwSetWindowSizeLimits(handle, minWidth, minHeight, maxWidth, maxHeight);

        if (configuration.UL == null) {
            width = configuration.Pg;
            if (width == -1 && configuration.ag == -1) {
                width = Math.max(configuration.s10, configuration.PG0);
                height = Math.max(configuration.bU, configuration.Gk0);
                int limit = configuration.Ak;
                if (limit > -1) {
                    width = Math.min(width, limit);
                }
                limit = configuration.Gt;
                if (limit > -1) {
                    height = Math.min(height, limit);
                }
                monitor = GLFW.glfwGetPrimaryMonitor();
                if (configuration.h70 && configuration.Po0 != null) {
                    monitor = configuration.Po0.Y2;
                }
                IntBuffer x = BufferUtils.createIntBuffer(1);
                IntBuffer y = BufferUtils.createIntBuffer(1);
                GLFW.glfwGetMonitorPos(monitor, x, y);
                int monitorX = x.get(0);
                int monitorY = y.get(0);
                String monitorName = GLFW.glfwGetMonitorName(monitor);
                w0_0 bounds = DZ.jW(new T7(monitor, monitorX, monitorY, monitorName), width, height);
                GLFW.glfwSetWindowPos(handle, bounds.ft, bounds.t90);
            } else {
                GLFW.glfwSetWindowPos(handle, width, configuration.ag);
            }
        }
        if (configuration.h70) {
            GLFW.glfwMaximizeWindow(handle);
        }

        String[] iconPaths = configuration.Ow;
        if (iconPaths != null && !ea0_1.NL) {
            zv_1 fileType = configuration.CoM8;
            int count = iconPaths.length;
            i4_0[] loaded = new i4_0[count];
            for (int i = 0; i < count; i++) {
                lg_0.I70.getClass();
                loaded[i] = new i4_0(new VE(iconPaths[i], fileType));
            }
            GLFWImage.Buffer images = GLFWImage.malloc(count);
            i4_0[] converted = new i4_0[count];
            for (int i = 0; i < count; i++) {
                i4_0 source = loaded[i];
                i4_0 target = source;
                if (source.rH0() != ix0_0.Vw) {
                    target = new i4_0(source.XF.SH, source.XF.mB0, ix0_0.Vw);
                    target.Pa0(DF0.Ha0);
                    target.NH0(source, 0, 0);
                    converted[i] = target;
                }
                GLFWImage image = GLFWImage.malloc();
                image.set(target.XF.SH, target.XF.mB0, target.Rh0());
                images.put(image);
                image.free();
            }
            images.position(0);
            GLFW.glfwSetWindowIcon(handle, images);
            images.free();
            for (i4_0 resource : converted) {
                if (resource != null) {
                    resource.dispose();
                }
            }
            for (i4_0 resource : loaded) {
                resource.dispose();
            }
        }

        GLFW.glfwMakeContextCurrent(handle);
        GLFW.glfwSwapInterval(configuration.qH0 ? 1 : 0);
        if (configuration.sK == COM7_.Nx) {
            try {
                Class<?> gles = Class.forName("org.lwjgl.opengles.GLES");
                gles.getMethod("createCapabilities", new Class[0]).invoke(gles, new Object[0]);
                ThreadLocalUtil.setFunctionMissingAddresses(0);
            } catch (Throwable throwable) {
                throw new nf_1("Couldn't initialize GLES", throwable);
            }
        } else {
            GL.createCapabilities();
        }

        String version;
        String vendor;
        String renderer;
        if (configuration.sK == COM7_.Nx) {
            try {
                Class<?> gles20 = GLES20.class;
                int ignored = GLES20.GL_DEPTH_BUFFER_BIT;
                Method getString = gles20.getMethod("glGetString", Integer.TYPE);
                version = (String) getString.invoke(gles20, Integer.valueOf(7938));
                vendor = (String) getString.invoke(gles20, Integer.valueOf(7936));
                renderer = (String) getString.invoke(gles20, Integer.valueOf(7937));
                kz0 = new o50_0(hb0_2.BN, version, vendor, renderer);
            } catch (Throwable throwable) {
                throw new nf_1("Couldn't get GLES version string.", throwable);
            }
        } else {
            version = GL11.glGetString(7938);
            vendor = GL11.glGetString(7936);
            renderer = GL11.glGetString(7937);
            kz0 = new o50_0(hb0_2.BN, version, vendor, renderer);
        }

        if (kz0.H20 < 2 || (kz0.H20 == 2 && kz0.zM < 0)) {
            throw new nf_1("OpenGL 2.0 or higher with the FBO extension is required. OpenGL version: "
                    + GL11.glGetString(7938) + "\n"
                    + "Type: " + kz0.Fk0
                    + "\nVersion: " + kz0.H20 + ":" + kz0.zM + ":" + kz0.K4
                    + "\nVendor: " + kz0.jP + "\nRenderer: " + kz0.u3);
        }
        if (configuration.sK != COM7_.Nx && kz0.H20 <= 3
                && (kz0.H20 != 3 || kz0.zM < 0)
                && !GLFW.glfwExtensionSupported("GL_EXT_framebuffer_object")
                && !GLFW.glfwExtensionSupported("GL_ARB_framebuffer_object")) {
            throw new nf_1("OpenGL 2.0 or higher with the FBO extension is required. "
                    + GL11.glGetString(7938) + ", FBO extension: false\n"
                    + "Type: " + kz0.Fk0
                    + "\nVersion: " + kz0.H20 + ":" + kz0.zM + ":" + kz0.K4
                    + "\nVendor: " + kz0.jP + "\nRenderer: " + kz0.u3);
        }

        if (configuration.s00) {
            nk0 = GLUtil.setupDebugMessageCallback(configuration.fX);
            ME debug = ME.OH;
            GLCapabilities caps = GL.getCapabilities();
            if (caps.OpenGL43) {
                GL43.glDebugMessageControl(4352, 4352, debug.q3, (IntBuffer) null, false);
            } else if (caps.GL_KHR_debug) {
                KHRDebug.glDebugMessageControl(4352, 4352, debug.fs, (IntBuffer) null, false);
            } else if (caps.GL_ARB_debug_output && debug.C90 != -1) {
                ARBDebugOutput.glDebugMessageControlARB(4352, 4352, debug.C90, (IntBuffer) null, false);
            } else if (caps.GL_AMD_debug_output && debug.PH0 != -1) {
                AMDDebugOutput.glDebugMessageEnableAMD(4352, debug.PH0, (IntBuffer) null, false);
            }
        }

        window.hc0 = handle;
        ((Dt0) window.Sn0).getClass();
        window.ND = new DB0(window);
        window.gw = new k3_0(window);
        GLFW.glfwSetWindowFocusCallback(window.hc0, window.KG);
        GLFW.glfwSetWindowIconifyCallback(window.hc0, window.Pe);
        GLFW.glfwSetWindowMaximizeCallback(window.hc0, window.Kr0);
        GLFW.glfwSetWindowCloseCallback(window.hc0, window.vF);
        GLFW.glfwSetDropCallback(window.hc0, window.yL0);
        GLFW.glfwSetWindowRefreshCallback(window.hc0, window.vh0);
        if (window.ge != null) {
            GLFWWindowPosCallback.create(new com.pokeemu.client.fp0()).set(window.hc0);
        }
        if (configuration.hR) {
            GLFW.glfwShowWindow(window.hc0);
        } else {
            GLFW.glfwHideWindow(window.hc0);
        }
        for (int i = 0; i < 2; i++) {
            com.badlogic.gdx.graphics.Color color = configuration.hg;
            GL11.glClearColor(color.r, color.g, color.b, color.a);
            GL11.glClear(16384);
            GLFW.glfwSwapBuffers(handle);
        }
    }

    public final void LPT7() {
        es_1 closedWindows = new es_1();
        while (this.T0 && this.Ts.KB > 0) {
            this.bx0.update();
            boolean rendered = false;
            closedWindows.clear();
            int foregroundFps = -2;

            I2 windows = this.Ts.ZD();
            while (windows.hasNext()) {
                Su0 window = (Su0) windows.next();
                window.Xv();
                if (foregroundFps == -2) {
                    foregroundFps = window.IG0.Xs0;
                }
                synchronized (this.jr0) {
                    rendered |= window.pl0();
                }
                if (GLFW.glfwWindowShouldClose(window.hc0)) {
                    closedWindows.Ue0(window);
                }
            }

            GLFW.glfwPollEvents();
            boolean hadRunnables;
            synchronized (this.Rb0) {
                hadRunnables = this.Rb0.KB > 0;
                this.eG.clear();
                this.eG.G6(this.Rb0.rZ, 0, this.Rb0.KB);
                this.Rb0.clear();
            }

            I2 runnables = this.eG.ZD();
            while (runnables.hasNext()) {
                ((Runnable) runnables.next()).run();
            }

            if (hadRunnables) {
                windows = this.Ts.ZD();
                while (windows.hasNext()) {
                    Su0 window = (Su0) windows.next();
                    if (!window.gw.pt0) {
                        window.G20();
                    }
                }
            }

            I2 closing = closedWindows.ZD();
            while (closing.hasNext()) {
                Su0 window = (Su0) closing.next();
                if (this.Ts.KB == 1) {
                    for (int i = this.jr0.KB - 1; i >= 0; i--) {
                        com6__4 listener = (com6__4) this.jr0.get(i);
                        listener.wy0();
                        listener.dispose();
                    }
                    this.jr0.clear();
                }
                window.dispose();
                this.Ts.sj0(window, false);
            }

            if (!rendered) {
                try {
                    Thread.sleep(1000 / this.V6.Rk);
                } catch (InterruptedException ignored) {
                }
                continue;
            }
            if (foregroundFps <= 0) {
                continue;
            }

            Qt0 limiter = this.S9;
            if (!limiter.gp) {
                limiter.gp = true;
                ws0_0 sleepSamples = limiter.wc0;
                while (sleepSamples.nu0 < sleepSamples.bD.length) {
                    sleepSamples.bD[sleepSamples.nu0++] = 1000000L;
                }

                ws0_0 yieldSamples = limiter.us0;
                long first = (long) (GLFW.glfwGetTime() * 1000000000.0D);
                long second = (long) (GLFW.glfwGetTime() * 1000000000.0D);
                long initialYield = (long) ((int) ((second - first) * 1.333D));
                while (yieldSamples.nu0 < yieldSamples.bD.length) {
                    yieldSamples.bD[yieldSamples.nu0++] = initialYield;
                }

                limiter.CoM2 = (long) (GLFW.glfwGetTime() * 1000000000.0D);
                if (System.getProperty("os.name").startsWith("Win")) {
                    Thread timer = new Thread(new j80_0());
                    timer.setName("LWJGL3 Timer");
                    timer.setDaemon(true);
                    timer.start();
                }
            }

            long currentTime;
            try {
                currentTime = (long) (GLFW.glfwGetTime() * 1000000000.0D);
                while (limiter.CoM2 - currentTime > limiter.wc0.wL0()) {
                    Thread.sleep(1L);
                    ws0_0 samples = limiter.wc0;
                    long nextTime = (long) (GLFW.glfwGetTime() * 1000000000.0D);
                    long elapsed = nextTime - currentTime;
                    int index = samples.nu0;
                    int nextIndex = index + 1;
                    samples.bD[index % samples.bD.length] = elapsed;
                    samples.nu0 = nextIndex % samples.bD.length;
                    currentTime = nextTime;
                }

                ws0_0 sleepSamples = limiter.wc0;
                if (sleepSamples.wL0() > 10000000L) {
                    for (int i = 0; i < sleepSamples.bD.length; i++) {
                        sleepSamples.bD[i] = (long) ((float) sleepSamples.bD[i] * 0.8999999762F);
                    }
                }

                currentTime = (long) (GLFW.glfwGetTime() * 1000000000.0D);
                while (limiter.CoM2 - currentTime > limiter.us0.wL0()) {
                    Thread.yield();
                    ws0_0 samples = limiter.us0;
                    long nextTime = (long) (GLFW.glfwGetTime() * 1000000000.0D);
                    long elapsed = nextTime - currentTime;
                    int index = samples.nu0;
                    int nextIndex = index + 1;
                    samples.bD[index % samples.bD.length] = elapsed;
                    samples.nu0 = nextIndex % samples.bD.length;
                    currentTime = nextTime;
                }
            } catch (InterruptedException ignored) {
            }

            long target = limiter.CoM2;
            limiter.CoM2 = Math.max(target + 1000000000L / (long) foregroundFps,
                    (long) (GLFW.glfwGetTime() * 1000000000.0D));
        }
    }

    public final void rG() {
        synchronized (this.jr0) {
            I2 listeners = this.jr0.ZD();
            while (listeners.hasNext()) {
                com6__4 listener = (com6__4) listeners.next();
                listener.wy0();
                listener.dispose();
            }
        }
        I2 windows = this.Ts.ZD();
        while (windows.hasNext()) {
            ((Su0) windows.next()).dispose();
        }
        this.Ts.clear();
    }

    public final void Va0() {
        java.util.Iterator<?> cursors = hz0.ee0.values().iterator();
        while (cursors.hasNext()) {
            GLFW.glfwDestroyCursor(((Long) cursors.next()).longValue());
        }
        hz0.ee0.clear();
        this.bx0.dispose();
        Lo.free();
        Lo = null;
        Callback callback = nk0;
        if (callback != null) {
            callback.free();
            nk0 = null;
        }
        GLFW.glfwTerminate();
    }

    public final void k7(String tag, String message) {
        if (this.ai >= 2) {
            this.eA.getClass();
            System.out.println("[" + tag + "] " + message);
        }
    }

    public final void Xd0(String tag, String message) {
        if (this.ai >= 1) {
            this.eA.getClass();
            System.err.println("[" + tag + "] " + message);
        }
    }

    public final hb0_2 Xd() {
        return hb0_2.BN;
    }

    public final void lPT5(Runnable runnable) {
        synchronized (this.Rb0) {
            this.Rb0.Ue0(runnable);
        }
    }

    public final void bE() {
        this.T0 = false;
    }

    public final void NH(com6__4 listener) {
        synchronized (this.jr0) {
            this.jr0.Ue0(listener);
        }
    }

    public final void ws(com6__4 listener) {
        synchronized (this.jr0) {
            this.jr0.sj0(listener, true);
        }
    }

    public final void TT(GC0 logger) {
        this.eA = logger;
    }

    public final Su0 pk0(DZ configuration, OR listener) {
        long sharedContext = 0L;
        Su0 window = new Su0(listener, configuration, this);
        wb0(window, configuration, sharedContext);
        return window;
    }

    public final void AA(Throwable throwable) {
        if (this.ai >= 2) {
            this.eA.getClass();
            System.out.println("[Lwjgl3Application] Couldn't initialize audio, disabling audio");
            throwable.printStackTrace(System.out);
        }
    }
}
