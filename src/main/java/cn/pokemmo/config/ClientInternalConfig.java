package cn.pokemmo.config;

import f.*;
import java.io.File;
import java.util.Properties;

/**
 * 客户端内部与网络调试配置 (Client Internal Config)
 * 包含登录服务器域名/端口、消息长度、调试模式开关、网络延迟模拟等基础架构参数。
 *
 * 原混淆类: f.lpt3__1
 */
public class ClientInternalConfig {
    public static final dl_1 np0;
    public static File Q40;

    @_interface(key = "loginserver.network.client.port", defaultValue = "2106")
    public static int Nm0;

    @_interface(key = "loginserver.network.client.host", defaultValue = "loginserver.pokemmo.com")
    public static String ll0;

    @_interface(key = "gameserver.security.max_message_length", defaultValue = "150")
    public static int VB0;

    @_interface(key = "client.ui.hud.chat.sent_message_memory_count", defaultValue = "20")
    public static int Pm;

    @_interface(key = "client.ui.hud.chat.message_display_count", defaultValue = "0")
    public static int oo;

    @_interface(key = "client.ui.hud.chat.message_history_size", defaultValue = "0")
    public static int HY;

    @_interface(key = "client.chat.log_chat", defaultValue = "false")
    public static boolean Ir0;

    @_interface(key = "client.misc.ignore_feed", defaultValue = "false")
    public static boolean eR;

    @_interface(key = "client.misc.test_feed", defaultValue = "")
    public static String coM5;

    @_interface(key = "client.misc.test_sig", defaultValue = "")
    public static String R6;

    @_interface(key = "client.misc.testserver_feed_signature", defaultValue = "false")
    public static boolean Qm;

    @_interface(key = "client.dev.add_latency", defaultValue = "0")
    public static int rm0;

    @_interface(key = "client.dev.time_debugs", defaultValue = "false")
    public static boolean sk;

    @_interface(key = "client.dev.quick_close", defaultValue = "false")
    public static boolean zC;

    @_interface(key = "client.dev.night_overlay_constant_redgreen", defaultValue = "2")
    public static float Kr;

    @_interface(key = "client.dev.night_overlay_constant_blue", defaultValue = "4")
    public static float an0;

    @_interface(key = "client.sound_engine.midi.rc", defaultValue = "true")
    public static boolean Il0;

    @_interface(key = "client.sound_engine.midi.gs", defaultValue = "false")
    public static boolean OE0;

    @_interface(key = "client.sound_engine.midi.xg", defaultValue = "false")
    public static boolean nS;

    @_interface(key = "client.sound_engine.midi.lv", defaultValue = "true")
    public static boolean IE;

    @_interface(key = "client.sound_engine.midi.sv", defaultValue = "true")
    public static boolean Sg0;

    @_interface(key = "client.sound_engine.midi.cv", defaultValue = "false")
    public static boolean RJ;

    @_interface(key = "client.gpu.profile", defaultValue = "false")
    public static boolean FQ;

    @_interface(key = "client.particle.system.profile", defaultValue = "false")
    public static boolean Ha0;

    @_interface(key = "client.error.reporting", defaultValue = "true")
    public static boolean u8;

    public static boolean vs;
    public static boolean YM;

    @_interface(key = "client.cache.particle.enable", defaultValue = "true")
    public static boolean Bv;

    @_interface(key = "client.graphics.ow_weather.enable", defaultValue = "true")
    public static boolean oq0;

    @_interface(key = "client.input.controllers.detect_valid_controllers", defaultValue = "true")
    public static boolean YB;

    @_interface(key = "client.dev.debugui.notificaitons", defaultValue = "false")
    public static boolean yg0;

    @_interface(key = "client.dev.debugui.tooltips", defaultValue = "false")
    public static boolean UL;

    @_interface(key = "client.dev.debugui.colorize", defaultValue = "true")
    public static boolean rl0;

    @_interface(key = "client.workarounds.disable_broken_accessibility_providers", defaultValue = "true")
    public static boolean X3;

    @_interface(key = "force.ls.port", defaultValue = "-1")
    public static int Vj0;

    @_interface(key = "force.ls.host", defaultValue = "")
    public static String Ja0;

    @_interface(key = "force.gs.port", defaultValue = "-1")
    public static int WP;

    @_interface(key = "force.gs.host", defaultValue = "")
    public static String e90;

    @_interface(key = "force.cs.port", defaultValue = "-1")
    public static int qG;

    @_interface(key = "force.cs.host", defaultValue = "")
    public static String bz0;

    public static final int bl0 = 20;
    public static final int al = 8;
    public static final String RK0 = "[a-zA-Z]";
    public static final String Yh = "[a-zA-ZÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ]";
    public static final String Com6 = "[a-zA-Z0-9 ,.!?\"'\\-~ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ]";

    static {
        np0 = Cq0.E1(ClientInternalConfig.class);
        Q40 = new File("config");
        coM5 = "";
        R6 = "";
        Il0 = true;
        OE0 = false;
        nS = false;
        IE = true;
        Sg0 = true;
        RJ = false;
        FQ = false;
        Ha0 = false;
        u8 = true;
        vs = false;
        YM = false;
        Bv = true;
        yg0 = false;
        UL = false;
        rl0 = false;
    }

    public static void XS() {
        w4(null);
    }

    public static void w4(Properties[] propertiesArr) {
        if (!Q40.exists()) {
            np0.info("Created config folder {}.", Q40.getAbsolutePath());
            Q40.mkdirs();
        }
        try {
            Properties[] loadedProps = jc0_2.h(Q40);
            np0.info("Loaded {} config properties.", Integer.valueOf(loadedProps.length));
            if (propertiesArr != null) {
                es_1 es_12 = new es_1(true, propertiesArr.length + loadedProps.length, Properties.class);
                es_12.G6(propertiesArr, 0, propertiesArr.length);
                es_12.G6(loadedProps, 0, loadedProps.length);
                loadedProps = (Properties[]) es_12.Mo0(es_12.rZ.getClass().getComponentType());
            }
            LC.Ox(ClientInternalConfig.class, null, loadedProps);
            LC.Ox(ClientSettings.class, null, loadedProps);
            LC.Ox(HO.class, null, loadedProps);
            LC.Ox(vf0_1.class, null, loadedProps);
            dw_2.xu = dw_2.sH0;
            dw_2.Ct0();
            if (dw_2.d70 < 1 || dw_2.ag < 1) {
                dw_2.d70 = 1024;
                dw_2.ag = 768;
            }
            int fH = dw_2.fH;
            if (fH == 0 || fH == 1) {
                xm_0.kt0 = fH;
            }
            zb0_2.q3 = dw_2.Ug;
            if (dw_2.By0 == 0) {
                dw_2.By0 = rg0_2.j40(1, 100);
                dw_2.Va = true;
                dw_2.CY();
            }
        } catch (Exception exception) {
            np0.error(xu0_0.N3("FATAL"), "Can't load configuration", exception);
            throw new Error("Can't load configuration", exception);
        }
    }
}
