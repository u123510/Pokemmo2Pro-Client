package com.pokeemu.client;

import f.AA0;
import f.Bw0;
import f.COM7_;
import f.Cq0;
import f.DZ;
import f.Dt0;
import f.EA;
import f.GS;
import f.Iu0;
import f.LI;
import f.NI;
import f.NR;
import f.QC;
import f.S00;
import f.T7;
import f.WN;
import f.ad_0;
import f.bu_0;
import f.com5__4;
import f.d8_0;
import f.dl_1;
import f.dw_2;
import f.ea0_1;
import f.ep_0;
import f.es_1;
import f.ga0_0;
import f.lpt3__1;
import f.m4_0;
import f.or_1;
import f.qt_1;
import f.tw0_0;
import f.x0_0;
import f.zv_1;
import java.io.File;
import java.io.FileInputStream;
import java.lang.management.ManagementFactory;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import org.lwjgl.glfw.GLFW;

public class Client {
    public static dl_1 IU;

    public static void main(String[] args) {
        try {
            String path = new File(Client.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath();
            if (path.contains("!/") || path.contains("!\\")) {
                S00.D8();
                tw0_0.uV.Ns0(
                        "请将客户端重新安装到不包含特殊字符的路径中(不支持!)",
                        new uL0()
                );
            }
        } catch (URISyntaxException ignored) {
        }

        qt_1 platform = qt_1.yr0();
        boolean unsupportedConfiguration = ea0_1.rv0 && !ea0_1.pq && !ea0_1.oR;
        if (!platform.w00() || unsupportedConfiguration) {
            S00.D8();
            tw0_0.uV.Ns0(
                    "操作系统错误,不支持当前操作系统(系统:"
                            + System.getProperty("os.name")
                            + ","
                            + System.getProperty("os.arch")
                            + ")",
                    new COM4_()
            );
            return;
        }

        String language = Locale.getDefault().stripExtensions().getLanguage();
        switch (language) {
            case "ar":
            case "as":
            case "bn":
            case "dz":
            case "fa":
            case "ig":
            case "ks":
            case "mr":
            case "my":
            case "ne":
            case "pa":
            case "ps":
            case "sd":
            case "th":
            case "ur":
            case "uz":
            case "ckb":
            case "lrc":
            case "mzn":
                try {
                    Locale.setDefault(new Locale("en", "US"));
                } catch (Exception ignored) {
                }
                break;
            default:
                break;
        }

        try {
            ep_0.Wz();
            long loggerStart = System.currentTimeMillis();
            IU = Cq0.E1(Client.class);
            ad_0.CS();
            ad_0.Iy();
            IU.info("日志系统初始化耗时 {} 毫秒", Long.valueOf(System.currentTimeMillis() - loggerStart));
        } catch (Exception ignored) {
            S00.D8();
            hQ callback = new hQ();
            tw0_0.uV.Ns0(
                    "客户端初始化失败,请确认安装路径不包含特殊字符\n\n请在论坛发帖获取帮助",
                    callback
            );
            return;
        }

        lpt3__1.XS();
        for (String argument : args) {
            if (argument.startsWith("--theme=")) {
                throw new IllegalArgumentException("请迁移到 '--theme-mobile' 或 '--theme-default'");
            }

            if (argument.equals("--theme-mobile")) {
                dw_2.zs = "android";
                dw_2.sH0 = true;
                dw_2.xu = true;
                dw_2.CY();
                continue;
            }

            if (argument.equals("--theme-default")) {
                dw_2.zs = "default";
                dw_2.sH0 = false;
                dw_2.xu = false;
                dw_2.CY();
                continue;
            }

            if (argument.startsWith("--config=")) {
                String configPath = argument.split("=")[1];
                es_1 propertiesList = new es_1(Properties.class);
                try {
                    File configFile = new File(configPath);
                    Properties properties = new Properties();
                    properties.load(new FileInputStream(configFile));
                    propertiesList.Ue0(properties);
                } catch (Exception exception) {
                    exception.printStackTrace();
                } finally {
                    lpt3__1.w4((Properties[]) propertiesList.toArray());
                }
                continue;
            }

            if (argument.startsWith("--resolution=")) {
                String[] dimensions = argument.split("=")[1].split("x");
                if (dimensions.length > 1) {
                    try {
                        int width = Integer.parseInt(dimensions[0]);
                        int height = Integer.parseInt(dimensions[1]);
                        dw_2.d70 = width;
                        dw_2.ag = height;
                    } catch (Exception ignored) {
                    }
                }
            }
        }

        if (lpt3__1.X3) {
            System.setProperty(
                    "javax.accessibility.assistive_technologies",
                    "com.pokeemu.client.AccessibilityStub"
            );
        }

        try {
            System.setProperty(
                    "http.agent",
                    "Mozilla/5.0 (PokeMMO; Client r"
                            + x0_0.k40
                            + "; "
                            + platform.za0().toLowerCase(Locale.ROOT)
                            + ")"
            );
        } catch (Exception ignored) {
        }

        if (platform == qt_1.C1) {
            or_1 launcher = new or_1();
            launcher.setDaemon(true);
            launcher.start();
        } else if (platform == qt_1.qV) {
            String launcherVersion = System.getenv("POKEMMO_MACOS_LAUNCHER_VER");
            if (launcherVersion != null) {
                com5__4 platformMode = com5__4.ul;
                NR.dy0 = platformMode;
                IU.info(platformMode.ob0());
                IU.info("PokeMMO macOS 启动器版本: {}", launcherVersion);
            }

            if (dw_2.L90 != 0) {
                dw_2.L90 = 0;
            }

            if (dw_2.Nf && !ea0_1.oR) {
                IU.info("已启用 macOS 低功耗图形选项");
                GLFW.glfwInitHint(143363, 1);
            } else {
                GLFW.glfwInitHint(143363, 0);
            }
            GLFW.glfwWindowHintString(143362, "PokeMMO");
        } else if (platform == qt_1.Pl0) {
            ArrayList<m4_0> compositors = NI.kf0();
            if (compositors.isEmpty()) {
                tw0_0.uV.Ns0("当前平台没有可用的显示合成器", Client::yh0);
                return;
            }

            dw_2.ww = compositors.toArray(new m4_0[0]);
            if (compositors.size() == 1) {
                dw_2.kt = false;
                dw_2.i2 = compositors.get(0);
                dw_2.Va = true;
            } else if (!dw_2.kt) {
                dw_2.i2 = m4_0.ik(NR.dy0 == com5__4.Zv);
            }

            GLFW.glfwInitHint(327683, dw_2.i2.Ax0());
            if (dw_2.i2 == m4_0.wk0) {
                GLFW.glfwWindowHintString(155649, "pokemmo");
                if (dw_2.L90 == 2) {
                    dw_2.L90 = 0;
                }
            }
            IU.info(
                    "可用显示合成器：{}（已选择：{}）",
                    Arrays.toString(dw_2.ww),
                    dw_2.i2
            );
        }

        IU.info(
                "正在启动 PokeMMO 客户端,客户端版本:{}{}",
                Integer.valueOf(x0_0.k40),
                x0_0.Xn0 ? "来自文件" : ""
        );
        IU.info("https://pokemmo2.pro");
        Bw0.coM8();
        try {
            List<String> inputArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
            StringBuilder argumentText = new StringBuilder();
            Iterator<String> iterator = inputArguments.iterator();
            while (iterator.hasNext()) {
                String inputArgument = iterator.next();
                if (argumentText.length() > 0) {
                    argumentText.append(' ');
                }
                argumentText.append(inputArgument);
            }
            Bw0.ly(argumentText.toString());
        } catch (Exception ignored) {
            IU.info("系统内存总量:读取失败");
        }

        LI crashHandler = new LI();
        Thread.setDefaultUncaughtExceptionHandler((thread, throwable) -> {
            try {
                crashHandler.getClass().getMethod("uncaughtException", Thread.class, Throwable.class)
                        .invoke(crashHandler, thread, throwable);
            } catch (Exception e) {
                //防止日志丢失
                System.err.println("线程 \"" + thread.getName() + "\" 中发生未捕获的异常:");
                throwable.printStackTrace();
            }
        });

        DZ display = new DZ();
        tw0_0.hH0 = new Iu0();
        tw0_0.Ro0 = new d8_0();
        tw0_0.lM = new NR();
        tw0_0.RE0 = new bu_0();
        if (!tw0_0.lM.QA0()) {
            return;
        }

        ga0_0 application = new ga0_0();
        display.VF0(dw_2.Zu);
        if (dw_2.IK0() == WN.Or0) {
            if (com.badlogic.gdx.backends.lwjgl3.angle.ANGLELoader.isInstalled()) {
                display.dq0(COM7_.Nx);
            } else {
                dw_2.Z0();
            }
        }

        display.To0(dw_2.WH0);
        display.Oa(dw_2.zq);
        display.AU(dw_2.mv);
        display.IL();
        display.aB(AA0.bI * 2);

        byte windowMode = dw_2.L90;
        if (windowMode == 1) {
            T7 selectedMonitor = null;
            EA[] monitors = DZ.pJ0();
            if (monitors.length > 1) {
                dw_2.T30 previousMonitor = dw_2.ZH0();
                if (previousMonitor != null) {
                    for (EA monitor : monitors) {
                        if (monitor.Oo.equals(previousMonitor.W20)
                                && monitor.jD0 == previousMonitor.OE
                                && monitor.SI == previousMonitor.h90) {
                            selectedMonitor = (T7) monitor;
                        }
                    }
                }
            }

            int width = dw_2.d70;
            int height = dw_2.ag;
            GS[] displayModes = selectedMonitor != null ? DZ.Ji0(selectedMonitor) : DZ.Wn();
            GS selectedMode = QC.Dx0(width, height, displayModes);
            if (selectedMode != null) {
                display.LD(selectedMode);
            }
        } else if (windowMode == 0 || windowMode == 2) {
            if (dw_2.xv0 >= 0 && dw_2.aux >= 0) {
                display.qV(dw_2.xv0, dw_2.aux);
            }
            display.Ia0(windowMode != 2);
            display.Ct0(dw_2.d70, dw_2.ag);
            display.XS(dw_2.qC);
        }

        display.sU(new gF(application));
        display.O9();
        display.Xm(
                zv_1.tt0,
                "data/icons/128x128.png",
                "data/icons/32x32.png",
                "data/icons/16x16.png");
        new Dt0(application, display);
    }

    public static void yh0() {
        System.exit(1);
    }
}
