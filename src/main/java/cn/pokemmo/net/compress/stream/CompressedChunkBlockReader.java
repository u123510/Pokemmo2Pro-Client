package cn.pokemmo.net.compress.stream;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class CompressedChunkBlockReader {
    public static final dl_1 By;
    public static final dl_1 JF0;
    public static final List<String> kb0;
    public static final List<String> mK0;
    public final Dn0 lg0;
    public boolean uG;
    public boolean Fr;
    public ZipFile lP;
    public Dn0 ZV;
    public gq_1 go0;
    public final boolean T00;
    public String hQ;
    public String Sk0;
    public String Pc0;
    public String zm;
    public String Fp;
    public Wr Zt0;
    public final SQ l60;
    public final w7_0 tC0;
    public final ArrayList<Element> Com7;
    public final ArrayList<OX> B70;
    public final ArrayList<Element> D2;
    public final ArrayList<C30> PD;
    public final ArrayList<String> M50;

    static {
        By = Cq0.E1(CompressedChunkBlockReader.class);
        JF0 = Cq0.t00("mod");
        kb0 = Arrays.asList("data/sprites/atlas/", "data/strings/", "data/themes/", "data/sprites/textures/");
        mK0 = Collections.singletonList("data/strings/");
    }

    public CompressedChunkBlockReader(Dn0 file, boolean enabled) {
        uG = false;
        Fr = false;
        lP = null;
        go0 = null;
        hQ = "";
        Sk0 = "";
        Pc0 = "";
        zm = "";
        Fp = "";
        Zt0 = null;
        l60 = new SQ();
        tC0 = new w7_0();
        Com7 = new ArrayList<>();
        B70 = new ArrayList<>();
        D2 = new ArrayList<>();
        PD = new ArrayList<>();
        M50 = new ArrayList<>();
        lg0 = file;
        T00 = enabled;
    }

    public static String mb(OX theme) {
        return sm0_0.Bx(nf0_0.Ws, new String[] { theme.jH0, String.valueOf(3) });
    }

    public static String yz0(OX theme) {
        return sm0_0.wa0(nf0_0.Ko0, theme.jH0);
    }

    public static String oi0(C30 strings) {
        return sm0_0.Bx(nf0_0.gw, new String[] { strings.Wi.el(), String.valueOf(1) });
    }

    public static boolean fS(String name, String existing) {
        return existing.equals(name);
    }

    public static String iS(Element element) {
        return element.getAttribute("name");
    }

    public static ro_1[] Lpt6(int length) {
        return new ro_1[length];
    }

    public static void fc(Dn0 file) {
        for (String line : file.gd0(null).split("\n")) {
            if (line.contains(";")) line = line.substring(line.indexOf(';'));
            line = line.trim();
            if (line.isEmpty() || !line.contains("=")) continue;
            String[] parts = line.split("=");
            if (parts.length < 2) {
                JF0.info("Invalid battle sprite altitude table value. {}", line);
                continue;
            }
            String[] key = parts[0].split(",");
            if (key.length < 2) {
                JF0.info("Invalid battle sprite altitude table value. {}", line);
                continue;
            }
            String[] values = parts[1].split(",");
            if (values.length != 3) {
                JF0.info("Invalid battle sprite altitude table value. Coordinates must be defined as X,Y,Z {}", line);
                continue;
            }
            C8 coordinates = new C8();
            short species;
            boolean back;
            try {
                species = Short.parseShort(key[0].trim());
                back = key[1].trim().equals("back");
                coordinates.x = LW.r1(Float.parseFloat(values[0]), -1.0F, 1.0F);
                coordinates.y = LW.r1(Float.parseFloat(values[1]), -1.0F, 1.0F);
                coordinates.z = LW.r1(Float.parseFloat(values[2]), -1.0F, 1.0F);
            } catch (NumberFormatException exception) {
                JF0.info("Invalid battle sprite altitude table value. {}", line);
                continue;
            }
            yh_0 sprites = yh_0.Xm0;
            if (sprites.K90 == null) sprites.K90 = new SQ();
            SQ offsets = sprites.K90;
            offsets.j10(offsets.yw0(yh_0.tp(species, back, false, (byte) 0, false, false)), coordinates);
        }
    }

    public static void interface$(byte type, Dn0 file) {
        for (String line : file.gd0(null).split("\n")) {
            if (line.contains(";")) line = line.substring(line.indexOf(';'));
            line = line.trim();
            if (line.isEmpty() || !line.contains("=")) continue;
            String[] parts = line.split("=");
            if (parts.length < 2) {
                JF0.info("Invalid battle sprites scales table value.");
                continue;
            }
            short species;
            float scale;
            try {
                species = Short.parseShort(parts[0].trim());
                scale = Float.parseFloat(parts[1].trim());
            } catch (NumberFormatException exception) {
                JF0.info("Invalid battle sprites scales table value.");
                continue;
            }
            yh_0 sprites = yh_0.Xm0;
            pe0_0[] scales = sprites.e80;
            if (scales[type] == null) scales[type] = new pe0_0();
            pe0_0 table = sprites.e80[type];
            int index = table.pL0(species);
            boolean inserted = true;
            if (index < 0) {
                index = -index - 1;
                float previous = table.AJ[index];
                inserted = false;
            }
            table.AJ[index] = scale;
            if (inserted) table.OC0(table.My);
        }
    }

    public final boolean yS(InputStream input) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            try {
                factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
                factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            } catch (ParserConfigurationException ignored) {
            }
            NodeList resources = factory.newDocumentBuilder().parse(input).getElementsByTagName("resource");
            if (resources.getLength() < 1) return false;
            Element resource = (Element) resources.item(0);
            if (resource.hasAttribute("name")) hQ = resource.getAttribute("name");
            if (resource.hasAttribute("version")) Sk0 = resource.getAttribute("version");
            if (resource.hasAttribute("description")) Pc0 = resource.getAttribute("description");
            if (resource.hasAttribute("author")) zm = resource.getAttribute("author");
            if (resource.hasAttribute("weblink")) {
                String link = resource.getAttribute("weblink");
                Fp = link;
                dl_1 initialized = tx_1.Sy0;
                if (!link.regionMatches(true, 0, "https://forums.pokemmo.eu", 0, 25)
                        && !Fp.regionMatches(true, 0, "https://pokemmo.eu", 0, 18)
                        && !Fp.regionMatches(true, 0, "https://forums.pokemmo.com", 0, 26)
                        && !Fp.regionMatches(true, 0, "https://pokemmo.com", 0, 19)) {
                    JF0.info("weblink must start with https://forums.pokemmo.com; {}", lg0.o30());
                    Fp = "";
                }
            }
            if (!vj0(resource)) return false;
            if (!XY(resource)) return false;
            if (!p7(resource)) return false;
            Fr = true;
            return true;
        } catch (Exception exception) {
            By.error("Error loading mod info.xml {}", lg0.o30(), exception);
            JF0.error("Error loading mod info.xml {}", lg0.o30(), exception);
            return false;
        }
    }

    public final void UG() {
        l60.kM(value -> Kf((dl_0) value));
        l60.clear();
        tC0.clear();
    }

    public final void x1(Dn0 directory) {
        for (Dn0 file : directory.Ce0()) {
            if (!file.o30().contains(".") && file.RL()) x1(file);
            else pd(file);
        }
    }

    public final void pd(Dn0 file) {
        String path = file.el();
        Locale locale = Locale.ENGLISH;
        path = path.toLowerCase(locale);
        if (lP == null) {
            int start = lg0.el().length() + (lg0.el().endsWith("/") ? 0 : 1);
            path = path.substring(start, path.length());
        }
        String[] parts = path.split("\\\\|/");
        if (parts.length == 3 && "sprites".equalsIgnoreCase(parts[0]) && "itemicons".equalsIgnoreCase(parts[1])) {
            String name = parts[2].toLowerCase(locale);
            if (!name.endsWith(".png")) {
                JF0.info("Only .png files supported for /sprites/itemicons/");
                return;
            }
            short id;
            try {
                id = Short.parseShort(name.substring(0, name.indexOf('.')));
            } catch (NumberFormatException exception) {
                JF0.info("{} has an invalid item id.", name);
                return;
            }
            if (dw_2.gV) JF0.info("Loaded {} from {}", file.el(), lg0.el());
            gh_1 items = gh_1.aH0;
            ro_1 image = new ro_1(file);
            items.getClass();
            Wr icon = new Wr(new ky_1(image));
            items.rf0.coM4(id, icon);
            Wr alternate = new Wr(new si_1(image));
            items.rh.coM4(id, alternate);
            if (id == -1) gh_1.aa = icon;
        }
        if (parts.length == 3 && "sprites".equalsIgnoreCase(parts[0]) && "followsprites".equalsIgnoreCase(parts[1])) {
            String name = parts[2].toLowerCase(locale);
            if ("atlasdata.txt".equals(name)) {
                loadFollowAtlas(file);
                return;
            }
            if (!name.endsWith(".png")) {
                JF0.info("Only .png files supported for /sprites/followsprites/");
                return;
            }
            name = name.substring(0, name.indexOf('.'));
            String[] fields = name.split("-");
            if (fields.length < 3) {
                JF0.info("{} does not have enough fields. Expected name format is ID-X-Y-Z.png where X is 'm' male or 'f' female or 'b' both | Y is 's' shiny or 'n' normal. | Z(optional) is form_id", name);
                return;
            }
            short species;
            try {
                species = Short.parseShort(fields[0]);
            } catch (NumberFormatException exception) {
                JF0.info("{} has an invalid monster id.", name);
                return;
            }
            byte form = 0;
            if (fields.length == 4) {
                try {
                    form = Byte.parseByte(fields[3]);
                } catch (NumberFormatException exception) {
                    JF0.info("{} has an invalid monster id.", name);
                    return;
                }
            }
            boolean both = "b".equalsIgnoreCase(fields[1]);
            boolean female = "f".equalsIgnoreCase(fields[1]);
            boolean shiny = "s".equalsIgnoreCase(fields[2]);
            if (dw_2.gV) JF0.info("Loaded {} from {}", file.el(), lg0.el());
            SS followers = SS.hG0;
            int gender = both ? -1 : female ? 1 : 0;
            r2 image = new r2(file);
            followers.getClass();
            if (gender == 1) form = (byte) (form | 32);
            if (shiny) form = (byte) (form | 64);
            SQ sprites = followers.jC;
            sprites.j10(sprites.yw0(species | form << 16), image);
            sprites = followers.jC;
            sprites.j10(sprites.yw0(species | (form | -128) << 16), image);
            if (gender == -1) {
                sprites = followers.jC;
                sprites.j10(sprites.yw0(species | (form | 32) << 16), image);
                sprites = followers.jC;
                sprites.j10(sprites.yw0(species | (form | -96) << 16), image);
            }
        }
        if (parts.length == 3 && "sprites".equalsIgnoreCase(parts[0]) && "battlesprites".equalsIgnoreCase(parts[1])) {
            String name = parts[2].toLowerCase(locale);
            if ("table-front-scale.txt".equals(name)) {
                interface$((byte) 0, file);
                return;
            }
            if ("table-back-scale.txt".equals(name)) {
                interface$((byte) 1, file);
                return;
            }
            if ("table-summary-scale.txt".equals(name)) {
                interface$((byte) 2, file);
                return;
            }
            if ("table-sprite-timings.txt".equals(name)) {
                PM(file);
                return;
            }
            if ("table-coordinate-mods.txt".equals(name)) {
                fc(file);
                return;
            }
            if ("dummy.png".equals(name)) {
                yh_0 sprites = yh_0.Dl0();
                ro_1 image = new ro_1(file);
                sprites.aux((short) 0, false, false, (byte) 2, image);
                return;
            }
            if (!name.endsWith(".png") && !name.endsWith(".gif")) {
                JF0.info("Only .png/.gif files supported for /sprites/battlesprites/");
                return;
            }
            name = name.substring(0, name.indexOf('.'));
            String[] fields = name.split("-");
            if (fields.length < 3) {
                JF0.info("{} does not have enough fields. Expected name format is ID-back-s.png where 'back' is either 'back' or 'front', and 's' is 's' or 'n'.", name);
                return;
            }
            if (fields.length > 5) {
                logBattleSpriteName(name);
                return;
            }
            short frame = 0;
            boolean back = "back".equalsIgnoreCase(fields[1]);
            boolean shiny = "s".equalsIgnoreCase(fields[2]);
            byte gender = 2;
            short species;
            try {
                species = Short.parseShort(fields[0]);
            } catch (Exception exception) {
                logBattleSpriteName(name);
                return;
            }
            if (fields.length == 4) {
                String optional = fields[3];
                if (Character.isDigit(optional.charAt(0))) {
                    try {
                        frame = Short.parseShort(optional);
                    } catch (NumberFormatException exception) {
                        JF0.info("{} invalid file name. Expected name format is ID-back-shiny-gender-frame.png where:", name);
                        JF0.info("frame is '0' - '127'");
                        return;
                    }
                } else if ("m".equals(optional)) {
                    gender = 0;
                } else if ("f".equals(optional)) {
                    gender = 1;
                } else {
                    JF0.info("{} invalid file name. Expected name format is ID-back-shiny-gender-frame.png where:", name);
                    JF0.info("gender is 'm' or 'f'");
                    return;
                }
            } else if (fields.length == 5) {
                String optional = fields[3];
                if ("m".equals(optional)) gender = 0;
                else if ("f".equals(optional)) gender = 1;
                else {
                    JF0.info("{} invalid file name. Expected name format is ID-back-shiny-gender-frame.png where:", name);
                    JF0.info("gender is 'm' or 'f'");
                    return;
                }
                try {
                    frame = Short.parseShort(fields[4]);
                } catch (NumberFormatException exception) {
                    JF0.info("{} invalid file name. Expected name format is ID-back-shiny-gender-frame.png where:", name);
                    JF0.info("frame is '0' - '127'");
                    return;
                }
            }
            if (frame > 0 && file.BN().equals("gif")) {
                JF0.info("{} error: GIF format does not support frame ids. Remove frame id", name);
                return;
            }
            int id = yh_0.Ps0(species, back, gender, shiny);
            dl_0 sprite = (dl_0) l60.get(id);
            if (sprite == null) {
                sprite = new dl_0(gender, species, back, shiny);
                l60.uu0(id, sprite);
            }
            sprite.IG(file, frame);
        }
        if (parts.length == 3 && "sprites".equalsIgnoreCase(parts[0]) && "monstericons".equalsIgnoreCase(parts[1])) {
            String name = parts[2].toLowerCase(locale);
            if (!name.endsWith(".png")) {
                JF0.info("Only .png files supported for /sprites/monstericons/");
                return;
            }
            name = name.substring(0, name.indexOf('.'));
            String[] fields = name.split("-");
            if (fields.length < 2) {
                JF0.info("{} does not have enough fields. Expected name format is ID-F-G.png", name);
                JF0.info("F is frame id");
                JF0.info("OPTIONAL: G is gender - 'm' or 'f'");
                return;
            }
            short species;
            try {
                species = Short.parseShort(fields[0]);
            } catch (NumberFormatException exception) {
                JF0.info("{} has an invalid monster id.", name);
                return;
            }
            byte frame;
            try {
                frame = Byte.parseByte(fields[1]);
            } catch (NumberFormatException exception) {
                JF0.info("{} has an invalid frame id.", name);
                return;
            }
            boolean hasGender = fields.length >= 3;
            byte gender = 0;
            if (hasGender) {
                String optional = fields[2];
                if ("m".equals(optional)) gender = 0;
                else if ("f".equals(optional)) gender = 1;
                else {
                    JF0.info("{} invalid file name. Expected name format is ID-F-G.png", name);
                    JF0.info("F is frame id");
                    JF0.info("OPTIONAL: G is gender - 'm' or 'f'");
                    return;
                }
            }
            if (dw_2.gV) JF0.info("Loaded {} from {}", file.el(), lg0.el());
            if (hasGender) {
                yh_0 sprites = yh_0.Dl0();
                ro_1 image = new ro_1(file);
                sprites.VU(species, frame, gender, image);
            } else {
                yh_0 sprites = yh_0.Dl0();
                ro_1 image = new ro_1(file);
                sprites.Qn(species, frame, image);
            }
        }
        if (parts.length == 4 && "sprites".equalsIgnoreCase(parts[0]) && "overworldsprites".equalsIgnoreCase(parts[1])) {
            String name = parts[3].toLowerCase(locale);
            if (!name.endsWith(".png")) {
                JF0.info("Only .png files supported for /sprites/overworldsprites/");
                return;
            }
            name = name.substring(0, name.indexOf('.'));
            byte region;
            try {
                region = Byte.parseByte(parts[2]);
            } catch (NumberFormatException exception) {
                JF0.info("Invalid file: overworldsprites/{}/{} has an invalid region ID. Valid region IDs are: 0 / 1 / 2 / 3 / 10", parts[2], name);
                return;
            }
            if ((region < 0 || region > 5) && region != 10) {
                JF0.info("Invalid file: overworldsprites/{}/{} has an invalid region ID. Valid region IDs are: 0 / 1 / 2 / 3 / 10", parts[2], name);
                return;
            }
            String[] fields = name.split("-");
            if (fields.length < 2) {
                JF0.info("overworldsprites/{}/{} does not have enough fields. Expected name format is ID-F.png where 'F' is frame id.", region, name);
                return;
            }
            short id;
            try {
                id = Short.parseShort(fields[0]);
            } catch (NumberFormatException exception) {
                JF0.info("overworldsprites/{}/{} has an invalid overworld sprite id.", region, name);
                return;
            }
            byte frame;
            try {
                frame = Byte.parseByte(fields[1]);
            } catch (NumberFormatException exception) {
                JF0.info("overworldsprites/{}/{} has an invalid frame id: Failed to parse {}", new Object[] { region, name, fields[1] });
                return;
            }
            boolean glow = fields.length > 2 && fields[2].equalsIgnoreCase("glowoverlay");
            if (dw_2.gV) JF0.info("Loaded {} from {}", file.el(), lg0.el());
            ro_1 image = new ro_1(file);
            ht_0 sprite = QI.KH0().kN(region, id, glow);
            if (sprite == null || sprite == QI.Ue0 || !sprite.Q90()) {
                IH replacement = new IH();
                sprite = replacement;
                QI.KH0().W10(id, glow, replacement);
            }
            ((IH) sprite).gG0(frame, new Wr(new s30_0(image)));
        }
        if (parts.length == 4 && "sprites".equalsIgnoreCase(parts[0]) && "trainersprites".equalsIgnoreCase(parts[1])) {
            String name = parts[3].toLowerCase(locale);
            if (!name.endsWith(".png")) {
                JF0.info("Only .png files supported for /sprites/trainersprites/");
                return;
            }
            byte region;
            try {
                region = Byte.parseByte(parts[2]);
            } catch (NumberFormatException exception) {
                JF0.info("Invalid file: trainersprites/{}/{} has an invalid region ID. Valid region IDs are: 0 / 1 / 2 / 3 / 10", parts[2], name);
                return;
            }
            if ((region < 0 || region > 5) && region != 10) {
                JF0.info("Invalid file: trainersprites/{}/{} has an invalid region ID. Valid region IDs are: 0 / 1 / 2 / 3 / 10", parts[2], name);
                return;
            }
            name = name.substring(0, name.indexOf('.'));
            short id;
            try {
                id = Short.parseShort(name);
            } catch (NumberFormatException exception) {
                JF0.info("{} has an invalid trainer sprite id.", name);
                return;
            }
            if (dw_2.gV) JF0.info("Loaded {} from {}", file.el(), lg0.el());
            ro_1 image = new ro_1(file);
            ZU sprites = ZU.ow0();
            Wr sprite = new Wr(new to0_0(image));
            sprites.MH(region, id, sprite);
        }
        if ((parts.length == 2 || parts.length == 3) && "sounds".equalsIgnoreCase(parts[0])) {
            byte type = 0;
            if (parts.length == 3) type = Byte.parseByte(parts[1]);
            String name = parts[parts.length - 1].toLowerCase(locale);
            if (!name.endsWith(".wav") && !name.endsWith(".mp3") && !name.endsWith(".ogg")) {
                JF0.info("Only .wav/.mp3/.ogg files supported for /sounds/");
                return;
            }
            name = name.substring(0, name.indexOf('.'));
            short id;
            try {
                id = Short.parseShort(name);
            } catch (NumberFormatException exception) {
                JF0.info("{} has an invalid sound id.", name);
                return;
            }
            if (name.endsWith(".ogg") && lg_0.k.Xd() == hb0_2.XU) {
                JF0.info("ogg is not supported on iOS");
                return;
            }
            tw0_0.RE0.n90(type, id, file);
            if (dw_2.gV) JF0.info("Loaded {} from {}", file.el(), lg0.el());
        }
        if (parts.length == 2 && "cries".equalsIgnoreCase(parts[0])) {
            String name = parts[1].toLowerCase(locale);
            if (!name.endsWith(".wav")) {
                JF0.info("Only .wav files supported for /cries/");
                return;
            }
            name = name.substring(0, name.indexOf('.'));
            short id;
            try {
                id = Short.parseShort(name);
            } catch (NumberFormatException exception) {
                JF0.info("{} has an invalid cry id.", name);
                return;
            }
            byte[] bytes = file.kI0();
            if (bytes == null || bytes.length < 5 || bytes[0] != 82 || bytes[1] != 73 || bytes[2] != 70 || bytes[3] != 70) {
                bytes = null;
            }
            if (bytes != null) {
                di0_0.ah(id, new LPt1_(file));
                if (dw_2.gV) JF0.info("Loaded {} from {}", file.el(), lg0.el());
            }
        }
        if (parts.length == 2 && "world_map_footers".equalsIgnoreCase(parts[0])) {
            String name = parts[1].toLowerCase(locale);
            if (!name.endsWith(".bin")) {
                JF0.info("Only .bin files supported for /world_map_footers/");
                return;
            }
            name = name.substring(0, name.indexOf('.'));
            byte region = 0;
            String[] fields = name.split("-");
            short id;
            try {
                if (fields.length > 1) {
                    region = Byte.parseByte(fields[0]);
                    id = Short.parseShort(fields[1]);
                } else {
                    id = Short.parseShort(fields[0]);
                }
            } catch (NumberFormatException exception) {
                JF0.info("{} has an invalid footer id.", name);
                return;
            }
            ByteBuffer data = ByteBuffer.wrap(file.kI0()).order(ByteOrder.LITTLE_ENDIAN);
            ng0_0 footer = new ng0_0(region, data, id);
            Z0.Bm().Ew0(region, id, footer);
            if (dw_2.gV) JF0.info("Loaded {} from {}", file.el(), lg0.el());
        }
        if (parts.length == 2 && "world_map_headers".equalsIgnoreCase(parts[0])) {
            String name = parts[1].toLowerCase(locale);
            if (!name.endsWith(".bin")) {
                JF0.info("Only .bin files supported for /world_map_footers/");
                return;
            }
            String[] fields = name.split("\\.");
            byte region;
            byte id;
            try {
                region = Byte.parseByte(fields[0]);
                id = Byte.parseByte(fields[1]);
            } catch (Exception exception) {
                JF0.info("{} has an invalid cry id.", name);
                return;
            }
            ByteBuffer data = ByteBuffer.wrap(file.kI0()).order(ByteOrder.LITTLE_ENDIAN);
            ZT header = new ZT(region, id, data);
            Z0.Bm().im(region, id, header);
            if (dw_2.gV) JF0.info("Loaded {} from {}", file.el(), lg0.el());
        }
        if (parts.length == 2 && "maps".equalsIgnoreCase(parts[0])) {
            String name = parts[1].toLowerCase(locale);
            if (!name.endsWith(".tmx")) {
                JF0.info("Only .tmx files supported for /maps/");
                return;
            }
            short id;
            try {
                name = name.substring(0, name.indexOf('.'));
                id = Short.parseShort(name);
            } catch (Exception exception) {
                JF0.info("{} has an invalid map_footer_connectionlist_id.", name);
                return;
            }
            Xs0.in0().Fs(id, file, go0);
            if (dw_2.gV) JF0.info("Loaded {} from {}", file.el(), lg0.el());
        }
    }

    private static void logBattleSpriteName(String name) {
        JF0.info("{} invalid file name. Expected name format is ID-back-shiny-gender-frame.png where:", name);
        JF0.info("'back' is either 'back' or 'front' (Ally/Enemy)");
        JF0.info("'s' is 's' or 'n' (Shiny/Normal)");
        JF0.info("OPTIONAL: gender is 'm' or 'f'");
        JF0.info("PNG ONLY/OPTIONAL: frame is '0' - '127'");
    }

    private static void loadFollowAtlas(Dn0 file) {
        int lineNumber = 0;
        for (String line : file.gd0(null).split("\n")) {
            if (line.startsWith(";")) continue;
            line = line.trim();
            if (line.isEmpty() || !line.contains("=")) continue;
            String[] parts = line.split("=");
            if (parts.length < 2) {
                JF0.info("Invalid battle sprites scales table value.");
                continue;
            }
            String key = parts[0].trim();
            if (key.equalsIgnoreCase("columns") || key.equalsIgnoreCase("rows")) {
                byte amount;
                try {
                    amount = Byte.parseByte(parts[1].trim());
                } catch (NumberFormatException exception) {
                    JF0.info("Invalid follow sprites table value at line {}", lineNumber);
                    continue;
                }
                if (key.equalsIgnoreCase("columns")) SS.hG0.Vo0 = (byte) Math.min(8, amount);
                else SS.hG0.zx0 = (byte) Math.min(8, amount);
            } else {
                int direction;
                String error;
                if (key.equalsIgnoreCase("north")) {
                    direction = 0;
                    error = "Invalid follow sprite north value at line {}";
                } else if (key.equalsIgnoreCase("south")) {
                    direction = 1;
                    error = "Invalid follow sprite south value at line {}";
                } else if (key.equalsIgnoreCase("west")) {
                    direction = 2;
                    error = "Invalid follow sprite west value at line {}";
                } else if (key.equalsIgnoreCase("east")) {
                    direction = 3;
                    error = "Invalid follow sprite east value at line {}";
                } else {
                    direction = -1;
                    error = null;
                }
                if (direction >= 0) {
                    String[] values = parts[1].trim().split(",");
                    if (values.length < 2) {
                        JF0.info(error, lineNumber);
                        continue;
                    }
                    byte[] frames = new byte[values.length];
                    try {
                        for (int i = 0; i < values.length; i++) frames[i] = Byte.parseByte(values[i].trim());
                    } catch (NumberFormatException exception) {
                        JF0.info(error, lineNumber);
                        continue;
                    }
                    SS.hG0.PB0[direction] = frames;
                } else {
                    String[] values = parts[1].trim().split(",");
                    float[] settings = new float[4];
                    short species;
                    try {
                        species = Short.parseShort(parts[0].trim());
                        settings[0] = Float.parseFloat(values[0].trim());
                        if (values.length > 1) settings[1] = Float.parseFloat(values[1].trim());
                        if (values.length > 2) settings[2] = Float.parseFloat(values[2].trim());
                        if (values.length > 3) settings[3] = Float.parseFloat(values[3].trim());
                    } catch (NumberFormatException exception) {
                        JF0.info("Invalid battle sprites scales table value.");
                        continue;
                    }
                    SS.hG0.KU.coM4(species, settings);
                }
            }
            lineNumber++;
        }
    }

    public final void lpT3(String name) {
        JF0.error("Theme of name {} in mod {} already exists", name, lg0.o30());
        dw_2.Rp.add((Supplier<String>) () -> dz(name));
    }

    public final String dz(String name) {
        return sm0_0.Bx(nf0_0.SL, new String[] { lg0.o30(), name });
    }

    public final void r80(CompressedChunkBlockReader other, String path) {
        dw_2.Rp.add((Supplier<String>) () -> kz(path, other));
    }

    public final String kz(String path, CompressedChunkBlockReader other) {
        return sm0_0.Bx(1212, new String[] { hQ, path, other.hQ });
    }

    public final boolean pT(String path) {
        return M50.contains(path);
    }

    public final String vT(String path) {
        return sm0_0.Bx(1156, new String[] { hQ, path });
    }

    public final String zA0(String path) {
        return sm0_0.Bx(1207, new String[] { hQ, path });
    }

    public final boolean Kf(dl_0 sprite) {
        Dn0[] frames = (Dn0[]) sprite.MW.values().toArray(new Dn0[0]);
        String format = "";
        for (Dn0 frame : frames) {
            if (format.isEmpty()) {
                format = frame.BN();
            } else if (!frame.BN().equalsIgnoreCase(format)) {
                By.error("Error applying battlesprite mod {} multiple file formats requested for {}", lg0.o30(), sprite.Jb0);
                JF0.error("Error applying battlesprite mod {} multiple file formats requested for {}", lg0.o30(), sprite.Jb0);
                return true;
            }
        }
        if (format.equals("gif")) {
            yh_0 sprites = yh_0.Xm0;
            short species = sprite.Jb0;
            boolean back = sprite.gw;
            boolean shiny = sprite.dW;
            byte form = sprite.RY;
            Ru0 animation = new Ru0(frames[0], (int[]) tC0.f5(sprite.Jb0));
            sprites.aux(species, back, shiny, form, animation);
        } else if (frames.length == 1) {
            yh_0 sprites = yh_0.Xm0;
            short species = sprite.Jb0;
            boolean back = sprite.gw;
            boolean shiny = sprite.dW;
            byte form = sprite.RY;
            ro_1 image = new ro_1(frames[0]);
            sprites.aux(species, back, shiny, form, image);
        } else {
            yh_0 sprites = yh_0.Xm0;
            short species = sprite.Jb0;
            boolean back = sprite.gw;
            boolean shiny = sprite.dW;
            byte form = sprite.RY;
            int[] timings = (int[]) tC0.f5(sprite.Jb0);
            if (timings == null || timings.length == 0) {
                timings = new int[] { 100 };
            }
            Mi animation = new Mi(Stream.of(frames).map(ro_1::new).toArray(CompressedChunkBlockReader::Lpt6), timings);
            sprites.aux(species, back, shiny, form, animation);
        }
        return true;
    }

    public final boolean sE() {
        try {
            if (!Yw0()) return false;
            Pt();
            sG0();
            ZipFile archive = lP;
            if (archive != null) {
                Enumeration<? extends ZipEntry> entries = archive.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry entry = entries.nextElement();
                    pd(ZV.wp(entry.getName()));
                }
            } else {
                x1(ZV);
            }
            UG();
            if (Fr) uG = true;
            return true;
        } catch (Exception exception) {
            By.error("Error applying mod {}", lg0.o30(), exception);
            JF0.error("Error applying mod {}", lg0.o30(), exception);
            return false;
        }
    }

    public final boolean p7(Element resource) {
        NodeList sections = resource.getElementsByTagName("overlays");
        if (sections.getLength() > 1) {
            JF0.error("Mods are only allowed to define one 'overlays' section");
            return false;
        }
        if (sections.getLength() == 1) {
            NodeList overlays = ((Element) sections.item(0)).getElementsByTagName("overlay");
            for (int i = 0; i < overlays.getLength(); i++) {
                Element overlay = (Element) overlays.item(i);
                if (!overlay.hasAttribute("path")) {
                    JF0.error("Overlay has no path attribute: {}", lg0.o30());
                    return false;
                }
                String path = overlay.getAttribute("path");
                if (!path.endsWith("/")) path = path.concat("/");
                M50.add(path);
            }
        }
        return true;
    }

    public final boolean XY(Element resource) {
        NodeList sections = resource.getElementsByTagName("strings");
        if (sections.getLength() > 1) {
            JF0.error("Mods are only allowed to define on 'strings' section");
            return false;
        }
        if (sections.getLength() == 1) {
            Element section = (Element) sections.item(0);
            NodeList strings = section.getElementsByTagName("string");
            for (int i = 0; i < strings.getLength(); i++) {
                Element entry = (Element) strings.item(i);
                if (section.hasAttribute("string_revision")) entry.setAttribute("revision", section.getAttribute("string_revision"));
                if (!entry.hasAttribute("path")) {
                    JF0.error("String has no path attribute: {}", lg0.o30());
                    return false;
                }
                if (!entry.getAttribute("path").endsWith(".xml")) {
                    JF0.error("String path does not point to xml file: {}", lg0.o30());
                }
                if (!entry.hasAttribute("revision")) {
                    JF0.error("String has no revision attribute: {}", lg0.o30());
                    return false;
                }
                try {
                    if (Integer.parseInt(entry.getAttribute("revision")) > 1) {
                        JF0.error("String revision {} is above current revision {}: {}",
                                new Object[] { entry.getAttribute("revision"), 1, lg0.o30() });
                        return false;
                    }
                } catch (NumberFormatException exception) {
                    String revision = entry.getAttribute("revision");
                    String mod = lg0.o30();
                    JF0.error("String revision {} is not a number: {}", revision, mod);
                    return false;
                }
                D2.add(entry);
            }
        }
        return true;
    }

    public final boolean vj0(Element resource) {
        NodeList sections = resource.getElementsByTagName("themes");
        if (sections.getLength() > 1) {
            JF0.error("Mods are only allowed to define on 'themes' section");
            return false;
        }
        if (sections.getLength() == 1) {
            Element section = (Element) sections.item(0);
            NodeList themes = section.getElementsByTagName("theme");
            for (int i = 0; i < themes.getLength(); i++) {
                Element theme = (Element) themes.item(i);
                if (section.hasAttribute("theme_revision")) theme.setAttribute("revision", section.getAttribute("theme_revision"));
                if (!theme.hasAttribute("path")) {
                    JF0.error("Theme has no path attribute: {}", lg0.o30());
                    return false;
                }
                if (!theme.hasAttribute("name")) {
                    JF0.error("Theme has no name attribute: {}", lg0.o30());
                    return false;
                }
                String name = theme.getAttribute("name");
                if (name.equals("android") || name.equals("default")) {
                    JF0.error("Themes of name `default` or `android` are not allowed: {}", lg0.o30());
                    return false;
                }
                if (Com7.stream().map(CompressedChunkBlockReader::iS).anyMatch(existing -> fS(name, existing))) {
                    JF0.error("Themes with duplicate name {}: {}", name, lg0.o30());
                    return false;
                }
                String path = theme.getAttribute("path");
                if (!path.endsWith("/")) theme.setAttribute("path", path.concat("/"));
                if (!theme.hasAttribute("is_mobile")) {
                    JF0.error("Theme has no is_mobile attribute: {}", lg0.o30());
                    return false;
                }
                String mobile = theme.getAttribute("is_mobile");
                if (!mobile.equals("true") && !mobile.equals("false")) {
                    JF0.error("is_mobile {} is neither 'true' nor 'false': {}", mobile, lg0.o30());
                    return false;
                }
                if (!theme.hasAttribute("revision")) {
                    JF0.error("Theme has no revision attribute: {}", lg0.o30());
                    return false;
                }
                try {
                    if (Integer.parseInt(theme.getAttribute("revision")) > 3) {
                        JF0.error("Theme revision {} is above current revision {}: {}",
                                new Object[] { theme.getAttribute("revision"), 3, lg0.o30() });
                        return false;
                    }
                } catch (NumberFormatException exception) {
                    String revision = theme.getAttribute("revision");
                    String mod = lg0.o30();
                    JF0.error("THeme revision {} is not a number: {}", revision, mod);
                    return false;
                }
                Com7.add(theme);
            }
        }
        return true;
    }

    public final boolean com1() {
        for (String path : M50) {
            Dn0 directory = ZV.wp(path);
            if (!directory.os0()) {
                JF0.error("Path {} does not exist in mod {}", path, lg0.o30());
                return false;
            }
            if (!directory.RL()) {
                JF0.error("Path {} is not a directory in mod {}", path, lg0.o30());
                return false;
            }
        }
        return true;
    }

    public final boolean GD0() {
        for (Element entry : D2) {
            String path = entry.getAttribute("path");
            Dn0 file = ZV.wp(path);
            if (!file.os0()) {
                JF0.error("Path {} does not exist in mod {}", path, lg0.o30());
                return false;
            }
            int revision = Integer.parseInt(entry.getAttribute("revision"));
            C30 strings = new C30(file, revision, false);
            if (!strings.NC0()) {
                JF0.error("String with path {} in mod {} is not valid", path, lg0.o30());
                return false;
            }
            PD.add(strings);
        }
        return true;
    }

    public final boolean jv() {
        for (Element theme : Com7) {
            String path = theme.getAttribute("path");
            if (!ZV.wp(path).os0()) {
                JF0.error("Path {} does not exist in mod {}", path, lg0.o30());
                return false;
            }
            String name = theme.getAttribute("name");
            boolean mobile = Boolean.parseBoolean(theme.getAttribute("is_mobile"));
            Dn0 atlas = null;
            if (theme.hasAttribute("sprite_atlas")) {
                String atlasPath = theme.getAttribute("sprite_atlas");
                Dn0 file = ZV.wp(atlasPath);
                if (!file.os0()) {
                    JF0.error("Atlas path {} does not exist in mod {}", atlasPath, lg0.o30());
                    return false;
                }
                atlas = file;
            }
            wg_1 resolver = new wg_1();
            resolver.qZ();
            Dn0 root = ZV;
            resolver.j90.add(0, root);
            vs_2 files = resolver.r1(path);
            int revision = Integer.parseInt(theme.getAttribute("revision"));
            OX loaded = new OX(name, files, mobile, revision, atlas);
            if (!loaded.r()) {
                JF0.error("Theme of name {} in mod {} is not valid", name, lg0.o30());
                return false;
            }
            B70.add(loaded);
        }
        return true;
    }

    public final boolean Yw0() {
        List<String> duplicates = B70.stream().map(OX::Yw).filter(dw_2::bW).collect(Collectors.toList());
        if (!duplicates.isEmpty()) {
            duplicates.stream().forEach(this::lpT3);
            return false;
        }
        for (OX theme : B70) {
            theme.getClass();
            if (tw0_0.Xy0() && !theme.J0) {
                dw_2.Rp.add((Supplier<String>) () -> yz0(theme));
                continue;
            }
            if (theme.Wg < 3) {
                dw_2.Rp.add((Supplier<String>) () -> mb(theme));
                continue;
            }
            dw_2.qx0.add(theme);
        }
        return true;
    }

    public final void sG0() {
        for (String path : kb0) {
            if (M50.contains(path)) continue;
            if (!ZV.wp(path).os0()) continue;
            dw_2.Rp.add((Supplier<String>) () -> zA0(path));
            M50.add(path);
        }
        for (String path : M50) {
            if (mK0.contains(path)) dw_2.Rp.add((Supplier<String>) () -> vT(path));
        }
        for (Object value : DI.yt.Xp0) {
            CompressedChunkBlockReader other = (CompressedChunkBlockReader) value;
            Set<String> duplicates = other.M50.stream().filter(this::pT).collect(Collectors.toSet());
            if (!duplicates.isEmpty()) duplicates.stream().forEach(path -> r80(other, path));
        }
    }

    public final void Pt() {
        for (C30 strings : PD) {
            if (strings.dg0 < 1) {
                dw_2.Rp.add((Supplier<String>) () -> oi0(strings));
                continue;
            }
            wi0_0 manager = wi0_0.gm;
            manager.getClass();
            if (!strings.NC0()) {
                wi0_0.ME0.warn("Skipped string {} because it is invalid.", strings.Wi.el());
                continue;
            }
            if (strings.dg0 < 1) {
                wi0_0.ME0.warn("Skipped string {} because it is outdated.", strings.Wi.el());
                continue;
            }
            manager.YI.add(strings);
        }
    }

    public final void PM(Dn0 file) {
        for (String line : file.gd0(null).split("\n")) {
            if (line.startsWith(";")) continue;
            if (line.contains(";")) line = line.substring(line.indexOf(';'));
            line = line.trim();
            if (!line.contains("=")) continue;
            String[] parts = line.split("=");
            if (parts.length < 2) {
                JF0.info("Invalid battle sprite timings table value. {}", line);
                continue;
            }
            short species;
            int[] timings;
            try {
                species = Short.parseShort(parts[0].trim());
                String[] values = parts[1].trim().split(",");
                timings = new int[values.length];
                for (int i = 0; i < values.length; i++) timings[i] = Integer.parseInt(values[i]);
            } catch (NumberFormatException exception) {
                JF0.info("Invalid battle sprite timings table value. {}", line);
                continue;
            }
            tC0.coM4(species, timings);
        }
    }
}
