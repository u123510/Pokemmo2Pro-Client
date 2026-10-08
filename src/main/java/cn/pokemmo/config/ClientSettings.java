package cn.pokemmo.config;

import f.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 客户端玩家全局设置 (Client Settings)
 * 统管画面分辨率、语言、ROM路径、音量、手柄按键映射、战斗动画开关及界面持久化坐标。
 *
 * 原混淆类: f.dw_2
 */
public class ClientSettings extends ClientInternalConfig {
    public static final dl_1 lH;
    public static final int ff = 0;
    public static final int es0 = 1;
    public static final int gK = 2;
    public static final int ac0 = -1;
    @_interface(key = "client.roms.fr", defaultValue = "")
    public static String COm9;
    @_interface(key = "client.roms.em", defaultValue = "")
    public static String e8;
    @_interface(key = "client.roms.nds", defaultValue = "")
    public static String zS;
    @_interface(key = "client.roms.nds2", defaultValue = "")
    public static String cx0;
    @_interface(key = "client.roms.nds3", defaultValue = "")
    public static String b1;
    @_interface(key = "client.graphics.width", defaultValue = "1024")
    public static int d70;
    @_interface(key = "client.graphics.height", defaultValue = "768")
    public static int ag;
    @_interface(key = "client.graphics.vsync", defaultValue = "false")
    public static boolean mv;
    @_interface(key = "client.graphics.display_mode", defaultValue = "0")
    public static byte L90;
    @_interface(key = "client.graphics.maximized", defaultValue = "true")
    public static boolean qC;
    @_interface(key = "client.graphics.xpos", defaultValue = "-1")
    public static int xv0;
    @_interface(key = "client.graphics.ypos", defaultValue = "-1")
    public static int aux;
    @_interface(key = "client.graphics.desktop.fullscreen_monitor", defaultValue = "")
    public static String o40;
    @_interface(key = "client.graphics.max_fpx", defaultValue = "60")
    public static int WH0;
    @_interface(key = "client.graphics.max_fpx_unfocused", defaultValue = "20")
    public static int zq;
    @_interface(key = "client.graphics.show_fps", defaultValue = "false")
    public static boolean b00;
    @_interface(key = "client.graphics.graphics_api", defaultValue = "OpenGL")
    public static String Og;
    @_interface(key = "client.graphics.msaa_samples", defaultValue = "0")
    public static int Zu;
    @_interface(key = "client.graphics.android.immersive_mode", defaultValue = "true")
    public static boolean implements$;
    @_interface(key = "client.graphics.max_visible_players", defaultValue = "-1")
    public static int sA;
    @_interface(key = "client.graphics.disabled.ow.particles", defaultValue = "false")
    public static boolean is0;
    @_interface(key = "client.graphics.battle.flash.animation", defaultValue = "true")
    public static boolean u10;
    @_interface(key = "client.graphics.gba.zoom_level", defaultValue = "-1")
    public static int Mv0;
    @_interface(key = "client.graphics.nds.reduced_fov", defaultValue = "false")
    public static boolean z2;
    @_interface(key = "client.graphics.desktop.macos.enable_low_power_gfx", defaultValue = "false")
    public static boolean Nf;
    @_interface(key = "client.graphics.nds.hgss_sprites_enabled_in_gba", defaultValue = "true")
    public static boolean Is0;
    @_interface(key = "client.graphics.shader_quality", defaultValue = "1")
    public static int YO;
    @_interface(key = "client.graphics.linux.preferred_compositor", defaultValue = "X11")
    public static m4_0 i2;
    @_interface(key = "client.graphics.linux.preferred_compositor.has_been_selected", defaultValue = "false")
    public static boolean kt;
    @_interface(key = "client.graphics.battle_sprites.render_scale.front", defaultValue = "2")
    public static int Tv0;
    @_interface(key = "client.graphics.battle_sprites.render_scale.back", defaultValue = "3")
    public static int ba;
    @_interface(key = "client.gui.hud.hidden", defaultValue = "false")
    public static boolean mi;
    @_interface(key = "client.gui.hud.chatframe.locked", defaultValue = "false")
    public static boolean WY;
    @_interface(key = "client.gui.hud.chatframe.x", defaultValue = "0")
    public static int nE0;
    @_interface(key = "client.gui.hud.chatframe.y", defaultValue = "0")
    public static int W6;
    @_interface(key = "client.gui.hud.chatframe.width", defaultValue = "400")
    public static int BY;
    @_interface(key = "client.gui.hud.chatframe.height", defaultValue = "200")
    public static int Qy0;
    @_interface(key = "client.gui.hud.hotkeybar.x", defaultValue = "250")
    public static int aN;
    @_interface(key = "client.gui.hud.hotkeybar.y", defaultValue = "0")
    public static int yL0;
    @_interface(key = "client.gui.hud.playereffects.x", defaultValue = "-1")
    public static int J50;
    @_interface(key = "client.gui.hud.playereffects.y", defaultValue = "-1")
    public static int tz;
    @_interface(key = "client.gui.gm-hud.direction-menu.x", defaultValue = "-1")
    public static int ww0;
    @_interface(key = "client.gui.gm-hud.direction-menu.y", defaultValue = "-1")
    public static int i0;
    @_interface(key = "client.ui.battle.notification", defaultValue = "true")
    public static boolean t00;
    @_interface(key = "client.gui.showchatbubbles", defaultValue = "true")
    public static boolean Xa0;
    @_interface(key = "client.gui.inset.mode", defaultValue = "1")
    public static int pG0;
    @_interface(key = "client.gui.apply.insets", defaultValue = "true")
    public static boolean lp0;
    @_interface(key = "client.gui.scale.guiscale", defaultValue = "1")
    public static float Tf;
    @_interface(key = "client.gui.scale.hidpifont", defaultValue = "true")
    public static boolean tC0;
    @_interface(key = "client.gui.scale.cjkfonts", defaultValue = "true")
    public static boolean Ug;
    @_interface(key = "client.gui.swcursor", defaultValue = "false")
    public static boolean LPt4;
    @_interface(key = "client.graphics.render.battlebg", defaultValue = "true")
    public static boolean Ba;
    @_interface(key = "client.graphics.render_border", defaultValue = "true")
    public static boolean Kr;
    @_interface(key = "client.graphics.render.overworld_in_battle", defaultValue = "true")
    public static boolean Ga0;
    @_interface(key = "client.graphics.battle.size", defaultValue = "100")
    public static int c10;
    @_interface(key = "client.controls.gdx.key_a")
    public static int JU;
    @_interface(key = "client.controls.gdx.key_b")
    public static int RM;
    @_interface(key = "client.controls.gdx.key_x")
    public static int ZI;
    @_interface(key = "client.controls.gdx.key_y")
    public static int cw0;
    @_interface(key = "client.controls.gdx.key_up")
    public static int Fk;
    @_interface(key = "client.controls.gdx.key_down")
    public static int Se;
    @_interface(key = "client.controls.gdx.key_left")
    public static int Ze;
    @_interface(key = "client.controls.gdx.key_right")
    public static int KC;
    @_interface(key = "client.controls.gdx.hotbar1")
    public static int X60;
    @_interface(key = "client.controls.gdx.hotbar2")
    public static int Go;
    @_interface(key = "client.controls.gdx.hotbar3")
    public static int hS;
    @_interface(key = "client.controls.gdx.hotbar4")
    public static int hc;
    @_interface(key = "client.controls.gdx.hotbar5")
    public static int zn;
    @_interface(key = "client.controls.gdx.hotbar6")
    public static int DJ0;
    @_interface(key = "client.controls.gdx.hotbar7")
    public static int c3;
    @_interface(key = "client.controls.gdx.hotbar8")
    public static int xo;
    @_interface(key = "client.controls.gdx.hotbar9")
    public static int H;
    @_interface(key = "client.controls.gdx.friendlist")
    public static int fK;
    @_interface(key = "client.controls.gdx.bag")
    public static int Vr0;
    @_interface(key = "client.controls.gdx.trainer")
    public static int Al0;
    @_interface(key = "client.controls.gdx.codex")
    public static int GL;
    @_interface(key = "client.controls.gdx.gamemenu")
    public static int fs0;
    @_interface(key = "client.controls.gdx.hidegui")
    public static int iC0;
    @_interface(key = "client.controls.gdx.faq")
    public static int r4;
    @_interface(key = "client.controls.gdx.team")
    public static int ol;
    @_interface(key = "client.controls.gdx.screenshot")
    public static int sn;
    @_interface(key = "client.controls.gdx.tradelink")
    public static int DY;
    @_interface(key = "client.controls.controller_input_maps_gdx", defaultValue = "")
    public static String zu0;
    @_interface(key = "client.input.controllers.enable_native_support", defaultValue = "true")
    public static boolean Md;
    @_interface(key = "client.sound_engine.music_volume", defaultValue = "50")
    public static int ku0;
    @_interface(key = "client.sound_engine.sfx_volume", defaultValue = "50")
    public static int sR;
    @_interface(key = "client.sound_engine.system_volume", defaultValue = "50")
    public static int Yn;
    @_interface(key = "client.sound_engine.output_device", defaultValue = "")
    public static String A9;
    @_interface(key = "client.sound_engine.music_mute_when_unfocused", defaultValue = "true")
    public static boolean Sj;
    @_interface(key = "client.sound_engine.battle_sfx.panning", defaultValue = "1")
    public static float ej;
    @_interface(key = "client.gameplay.autosprint.enabled", defaultValue = "true")
    public static boolean s3;
    @_interface(key = "client.gameplay.follower_bounce", defaultValue = "0")
    public static int XN;
    @_interface(key = "client.gameplay.hatching_animations", defaultValue = "0")
    public static int aR;
    @_interface(key = "client.gameplay.mail_attachments_warning_dismissed", defaultValue = "false")
    public static boolean wL;
    @_interface(key = "client.ui.chat.word_filter.enabled", defaultValue = "true")
    public static boolean U5;
    @_interface(key = "client.ui.smallhud", defaultValue = "true")
    public static boolean U8;
    @_interface(key = "client.ui.particles", defaultValue = "true")
    public static boolean o70;
    @_interface(key = "client.ui.chat.name_highlight.enabled", defaultValue = "true")
    public static boolean Zd;
    @_interface(key = "client.ui.chat.whisper_highlight.enabled", defaultValue = "true")
    public static boolean He0;
    @_interface(key = "client.ui.chat.timestamp.enabled", defaultValue = "false")
    public static boolean t90;
    @_interface(key = "client.ui.chat.type_name_display.enabled", defaultValue = "true")
    public static boolean YN;
    @_interface(key = "client.ui.chat.language_name_display.enabled", defaultValue = "true")
    public static boolean QE;
    @_interface(key = "client.ui.chat.buffer.size", defaultValue = "2")
    public static int dk;
    @_interface(key = "client.ui.string.lang", defaultValue = "en")
    public static String con;
    @_interface(key = "client.ui.string.lang.selected_manually", defaultValue = "false")
    public static boolean m70;
    @_interface(key = "client.ui.japanese.charactermode", defaultValue = "0")
    public static int fH;
    @_interface(key = "client.ui.nameplate.others", defaultValue = "true")
    public static boolean fx;
    @_interface(key = "client.ui.nameplate.self", defaultValue = "false")
    public static boolean jo;
    @_interface(key = "client.ui.chat.transparency", defaultValue = "90")
    public static int kt0;
    @_interface(key = "client.ui.chat.tab.names", defaultValue = "Local;Global;Trade;Whispers;Battle")
    public static String iL;
    @_interface(key = "client.ui.chat.tab.hidden_chat_types", defaultValue = "6,18,5;7,18,0,3,4,5,9,8,17;7,6,18,0,3,4,9,8,17;7,6,18,0,3,5,9,8;7,16,6,0,3,4,5,9,8,17")
    public static String yL;
    @_interface(key = "client.ui.chat.tab.currently_active_tab", defaultValue = "Local")
    public static String Jy0;
    @_interface(key = "client.ui.chat.linked_images.enabled", defaultValue = "true")
    public static boolean Sp0;
    @_interface(key = "client.ui.theme", defaultValue = "default")
    public static String zs;
    @_interface(key = "client.ui.theme.mobile", defaultValue = "false")
    public static boolean sH0;
    @_interface(key = "client.mobile.notch", defaultValue = "false")
    public static boolean kD;
    @_interface(key = "client.mobile.dpad.scale", defaultValue = "1")
    public static float Lu;
    @_interface(key = "client.mobile.dpad.deadzone_radius", defaultValue = "0.2")
    public static float N90;
    @_interface(key = "client.mobile.ab.scale", defaultValue = "1")
    public static float jq0;
    @_interface(key = "client.mobile.dpad.sticky_directionals_strength", defaultValue = "3")
    public static int hx0;
    @_interface(key = "client.mobile.ab.reversed", defaultValue = "false")
    public static boolean Yj;
    @_interface(key = "client.mobile.hotbar.swap_party", defaultValue = "false")
    public static boolean Lm;
    @_interface(key = "client.mobile.onscreencontrols.show", defaultValue = "true")
    public static boolean mE;
    @_interface(key = "client.ui.hud.battle.force_enable_battle_hud", defaultValue = "1")
    public static int le;
    @_interface(key = "client.ui.hud.battle.show_damage_percentage_level", defaultValue = "1")
    public static int zC0;
    @_interface(key = "client.ui.hud.battle.replays.enable_instant_replays", defaultValue = "false")
    public static boolean sk;
    @_interface(key = "client.cache.model_cache.enable", defaultValue = "true")
    public static boolean bn;
    @_interface(key = "client.cache.model_cache.regenerate", defaultValue = "false")
    public static boolean oN;
    @_interface(key = "ipv6.enable", defaultValue = "true")
    public static boolean RJ0;
    @_interface(key = "client.user.testing_group", defaultValue = "0")
    public static int By0;
    public static List Rp;
    public static List qx0;
    public static m4_0[] ww;
    public static boolean xu;
    public static final int aX = 3;
    public static final int Dg = 1;
    @_interface(key = "client.ui.theme.color1", defaultValue = "")
    public static String aA0;
    @_interface(key = "client.ui.chat.notification.word_list", defaultValue = "")
    public static String lL0;
    public static String[] FB;
    @_interface(key = "client.ui.chat.language.ignored_languages", defaultValue = "")
    public static String aS;
    @_interface(key = "client.ui.chat.language.current_language", defaultValue = "en")
    public static String fP;
    @_interface(key = "client.ui.chat.language.current_language.selected_manually", defaultValue = "false")
    public static boolean S6;
    @_interface(key = "client.ui.matchmaking.languages", defaultValue = "")
    public static String wW;
    private static HashSet bc;
    public static short Mt0;
    @_interface(key = "client.gameplay.textspeed", defaultValue = "4")
    public static int Ec0;
    @_interface(key = "client.mods.enabled_mods", defaultValue = "")
    public static String xR;
    @_interface(key = "client.mods.debugs.verbose.enabled", defaultValue = "false")
    public static boolean gV;
    @_interface(key = "client.integrations.discord_rich_presence.enabled", defaultValue = "true")
    public static boolean Q30;
    public static boolean Va;

    static {
        dp0.mf0 = dw_2::yz;
        dp0.YF = dw_2::i20;
        dp0.Hr0 = dw_2::q5;
        dp0.Yc = dw_2::nv0;
        dp0.Ah = dw_2::zt;
        lH = Cq0.E1(ClientSettings.class);
        COm9 = "";
        e8 = "";
        zS = "";
        cx0 = "";
        b1 = "";
        o40 = "";
        JU = rp_0.sJ0.MM;
        RM = rp_0.nK0.MM;
        ZI = rp_0.N9.MM;
        cw0 = rp_0.pd0.MM;
        Fk = rp_0.kC0.MM;
        Se = rp_0.synchronized$.MM;
        Ze = rp_0.I90.MM;
        KC = rp_0.Ni.MM;
        X60 = rp_0.com1.MM;
        Go = rp_0.ew.MM;
        hS = rp_0.eL.MM;
        hc = rp_0.aE0.MM;
        zn = rp_0.LPT3.MM;
        DJ0 = rp_0.VE0.MM;
        c3 = rp_0.lpT9.MM;
        xo = rp_0.gr0.MM;
        H = rp_0.lPT5.MM;
        fK = rp_0.Mt.MM;
        Vr0 = rp_0.Mi0.MM;
        Al0 = rp_0.Kz0.MM;
        GL = rp_0.Ul.MM;
        fs0 = rp_0.ip0.MM;
        iC0 = rp_0.Oe.MM;
        r4 = rp_0.Jq.MM;
        ol = rp_0.oq.MM;
        sn = rp_0.i9.MM;
        DY = rp_0.Un0.MM;
        ku0 = 50;
        sR = 50;
        Yn = 50;
        Jy0 = "";
        Lu = 1.0F;
        jq0 = 1.0F;
        Yj = false;
        Lm = false;
        Rp = Collections.synchronizedList(new ArrayList());
        qx0 = new ArrayList();
        ww = null;
        FB = null;
        wW = "";
        bc = null;
        Mt0 = 0;
        Ec0 = 4;
        Va = false;
    }

    public ClientSettings() {
    }

    public static void Ct0() {
        ld_0 keys = new ld_0();
        if (!keys.Vn(JU)) JU = 0;
        if (!keys.Vn(RM)) RM = 0;
        if (!keys.Vn(Fk)) Fk = 0;
        if (!keys.Vn(Se)) Se = 0;
        if (!keys.Vn(Ze)) Ze = 0;
        if (!keys.Vn(KC)) KC = 0;
        if (!keys.Vn(X60)) X60 = 0;
        if (!keys.Vn(Go)) Go = 0;
        if (!keys.Vn(hS)) hS = 0;
        if (!keys.Vn(hc)) hc = 0;
        if (!keys.Vn(zn)) zn = 0;
        if (!keys.Vn(DJ0)) DJ0 = 0;
        if (!keys.Vn(c3)) c3 = 0;
        if (!keys.Vn(xo)) xo = 0;
        if (!keys.Vn(H)) H = 0;
        if (!keys.Vn(fK)) fK = 0;
        if (!keys.Vn(Vr0)) Vr0 = 0;
        if (!keys.Vn(Al0)) Al0 = 0;
        if (!keys.Vn(GL)) GL = 0;
        if (!keys.Vn(fs0)) fs0 = 0;
        if (!keys.Vn(iC0)) iC0 = 0;
        if (!keys.Vn(r4)) r4 = 0;
        if (!keys.Vn(ol)) ol = 0;
        if (!keys.Vn(sn)) sn = 0;
        if (!keys.Vn(DY)) DY = 0;
        if (!keys.Vn(ZI)) ZI = 0;
        if (!keys.Vn(cw0)) cw0 = 0;
    }

    public static boolean bW(String name) {
        return tG(name) != null;
    }

    public static OX tG(String name) {
        for (Object entry : qx0) {
            OX theme = (OX) entry;
            if (theme.jH0.equals(name)) return theme;
        }
        return null;
    }

    public static void TS(OX theme) {
        if (theme == null) throw new IllegalArgumentException();
        if (theme.jH0.equals(zs) && sH0 == theme.J0) return;
        zs = theme.jH0;
        sH0 = theme.J0;
        Va = true;
    }

    public static HashSet U70() {
        if (bc != null) return bc;
        String[] names = aS.split(";");
        short mask = 0;
        bc = new HashSet();
        for (String name : names) {
            if (name.trim().isEmpty()) continue;
            G50 language = G50.Rw(name);
            if (language != null) {
                bc.add(language);
                mask = (short) (mask | language.z20);
            }
        }
        Mt0 = mask;
        return bc;
    }

    public static boolean x70(HashSet languages) {
        bc = languages;
        short mask = 0;
        ArrayList<String> names = new ArrayList<>();
        for (Object entry : languages) {
            G50 language = (G50) entry;
            names.add(language.PM);
            mask = (short) (mask | language.z20);
        }
        Collections.sort(names);
        StringBuilder encoded = new StringBuilder();
        for (String name : names) {
            if (encoded.length() > 0) encoded.append(";");
            encoded.append(name);
        }
        if (aS.equalsIgnoreCase(encoded.toString())) return false;
        aS = encoded.toString();
        Mt0 = mask;
        CY();
        return true;
    }

    public static boolean q0() {
        return !wW.isEmpty();
    }

    public static Set AL() {
        G50 interfaceLanguage = G50.Rw(con);
        G50 chatLanguage = G50.Rw(fP);
        if (!q0()) {
            HashSet languages = new HashSet();
            languages.add(interfaceLanguage);
            languages.add(chatLanguage);
            return languages;
        }
        Set<G50> languages = Arrays.stream(wW.split(",")).map(G50::Rw).collect(Collectors.toSet());
        languages.add(interfaceLanguage);
        languages.add(chatLanguage);
        return languages;
    }

    public static void al(gc0_0[] controllers) {
        StringBuilder encoded = new StringBuilder();
        for (gc0_0 controller : controllers) {
            if (controller.QI.isEmpty()) continue;
            if (encoded.length() > 0) encoded.append("|");
            encoded.append(controller.LPT8);
            for (Object entry : controller.QI.values()) {
                OW binding = (OW) entry;
                if (binding.CZ == null || binding.Ik0 == null) continue;
                encoded.append(";");
                encoded.append(binding.CZ);
                encoded.append(",");
                int type = zk0_0.bT[binding.Ik0.Zc];
                if (type == 1) {
                    encoded.append("BUTTON").append(",").append(binding.Zt0);
                } else if (type == 2) {
                    encoded.append("AXIS").append(",").append(binding.By).append(",").append(binding.HG0);
                }
            }
        }
        zu0 = encoded.toString();
        CY();
    }

    public static ArrayList t9() {
        ArrayList<String> mods = new ArrayList<>();
        for (String value : xR.split("/")) {
            String name = value.trim();
            if (!name.isEmpty() && !mods.contains(name)) mods.add(name);
        }
        return mods;
    }

    public static boolean CY() {
        File file = new File(lpt3__1.Q40, "main.properties");
        boolean saved = s8_0.j50(file.getAbsolutePath(), ClientSettings.class);
        if (saved) {
            lH.info("Saved config to {}", file.getAbsolutePath());
            Va = false;
        } else {
            lH.error("Error saving config to {}", file.getAbsolutePath());
        }
        return saved;
    }

    public static WN IK0() {
        return WN.valueOf(Og);
    }

    public static T30 ZH0() {
        if (o40.isEmpty()) return null;
        try {
            String[] parts = o40.split(",");
            return new T30(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
        } catch (Exception error) {
            return null;
        }
    }

    public static int eM0() {
        int players = sA;
        return players == -1 ? (tw0_0.Xy0() ? 20 : 0) : players;
    }

    public static boolean zt(int key) {
        rp_0 binding = rp_0.I90;
        return binding != null && binding.Ov(key);
    }

    public static boolean nv0(int key) {
        rp_0 binding = rp_0.Ni;
        return binding != null && binding.Ov(key);
    }

    public static boolean q5(int key) {
        rp_0 binding = rp_0.synchronized$;
        return binding != null && binding.Ov(key);
    }

    public static boolean i20(int key) {
        rp_0 binding = rp_0.kC0;
        return binding != null && binding.Ov(key);
    }

    public static boolean yz(int key) {
        rp_0 binding = rp_0.sJ0;
        return binding != null && binding.Ov(key);
    }

    public static ArrayList pq0() {
        String[] names = iL.split(";");
        String[] hidden = yL.split(";", -1);
        ArrayList<HK> tabs = new ArrayList<>();
        for (int i = 0; i < names.length && i < hidden.length; i++) {
            String[] values = hidden[i].split(",");
            HashSet<zo_0> types = new HashSet<>();
            for (String value : values) {
                if (value.trim().isEmpty()) continue;
                zo_0 ignored = zo_0.Pk;
                int id;
                try {
                    id = Integer.parseInt(value);
                } catch (NumberFormatException error) {
                    continue;
                }
                zo_0 found = null;
                for (zo_0 type : zo_0.JG) {
                    if (type.y80 == id) {
                        found = type;
                        break;
                    }
                }
                if (found != null) types.add(found);
            }
            tabs.add(new HK(names[i], types));
        }
        return tabs;
    }

    public static HashMap iN() {
        String[] profiles = zu0.split("\\|");
        HashMap<String, gc0_0> controllers = new HashMap<>();
        for (String profile : profiles) {
            if (profile.trim().isEmpty() || !profile.contains(";")) continue;
            String[] parts = profile.split(";");
            if (parts.length < 2) continue;
            String name = parts[0];
            gc0_0 controller = new gc0_0(name);
            try {
                for (int i = 1; i < parts.length; i++) {
                    String[] values = parts[i].split(",");
                    if (values.length < 3) continue;
                    String action = values[0];
                    rp_0 found = null;
                    for (rp_0 binding : rp_0.DV) {
                        if (binding.yJ0.equalsIgnoreCase(action)) {
                            found = binding;
                            break;
                        }
                    }
                    if (found == null) continue;
                    OW binding = new OW(found);
                    if (values[1].equalsIgnoreCase("BUTTON")) {
                        binding.jK0(Integer.parseInt(values[2]));
                    } else if (values[1].equalsIgnoreCase("AXIS")) {
                        if (values.length < 4) continue;
                        int axis = Integer.parseInt(values[2]);
                        boolean negative = Boolean.parseBoolean(values[3]);
                        binding.Ik0 = zd0_1.vp0;
                        binding.By = axis;
                        binding.HG0 = negative;
                    } else {
                        continue;
                    }
                    controller.QI.put(found, binding);
                }
            } catch (Exception error) {
                error.printStackTrace();
                continue;
            }
            controllers.put(name, controller);
        }
        return controllers;
    }

    public static void Z0() {
        Og = "OpenGL";
    }

    public static class T30 {
        public final String W20;
        public final int OE;
        public final int h90;

        public T30(String name, int x, int y) {
            W20 = name;
            OE = x;
            h90 = y;
        }
    }
}
