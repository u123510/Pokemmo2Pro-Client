package cn.pokemmo.rom.nds.model;

import f.*;
import f.org.json.*;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class NdsNitroModelParser {
    public static final C8 t0;
    public static final Matrix4 PL0;
    public static final Matrix4 yy0;
    public static final dl_1 lA0;
    public static final C8 Ut;
    public static v80_0 LPT1;
    public static tj0_1 r80;

    static {
        t0 = new C8();
        new C8();
        new C8();
        new C8();
        new C8();
        new me0_2();
        PL0 = new Matrix4();
        yy0 = new Matrix4();
        lA0 = Cq0.E1(NdsNitroModelParser.class);
        Ut = new C8();
    }

    public NdsNitroModelParser() {
        bc_0 resolver = new bc_0();
        resolver.TV = false;
        new cs_1(resolver);
        r80 = new tj0_1();
    }

    public static v80_0 Cb0() {
        if (LPT1 == null) {
            LPT1 = new v80_0();
        }
        return LPT1;
    }

    public static void fo0(vt_0 model, am_2 textures) {
        if (model == null || textures == null) {
            lA0.getClass();
            return;
        }
        for (int i = 0; i < model.mT.KB; i++) {
            JO material = (JO) model.mT.get(i);
            if (material.QW == null || material.nf0 == null) {
                lA0.getClass();
                continue;
            }
            String name = material.nf0;
            if (!textures.qn0 || textures.ib0.Ks.KB == 0) {
                continue;
            }
            Integer index = (Integer) textures.mw.Wk0(name);
            if (index == null) {
                lA0.getClass();
                continue;
            }
            pv_0 texture = (pv_0) (be0_1) textures.ib0.Ks.get(index.intValue());
            material.hr = texture.bh0.ei0;
            material.Qu0 = texture.Eq;
        }
    }

    public static i4_0 SA0(am_2 textures, String texture, String palette) {
        Integer textureIndex = (Integer) textures.mw.Wk0(texture);
        Integer paletteIndex = (Integer) textures.J80.Wk0(palette);
        if (paletteIndex != null && textureIndex != null) {
            return textures.Rt0(textureIndex.intValue(), paletteIndex.intValue());
        }
        lA0.error("Couldn't find {} or {}", texture, palette);
        return null;
    }

    public static LPT6_[] nn0(am_2 textures, es_1 names, es_1 palettes, es_1 order,
            es_1 frames, u4_0 owner, boolean transform) {
        if (frames == null) {
            HashMap<Byte, LPT6_> regions = new HashMap<>();
            for (byte i = 0; i < names.KB; i++) {
                int paletteIndex = palettes.KB == names.KB ? i : 0;
                String palette = (String) palettes.get(paletteIndex);
                String texture = (String) names.get(i);
                i4_0 pixels = SA0(textures, texture, palette);
                if (pixels == null) {
                    lA0.error("Couldn't create simple animation pixmap from {} / {}", texture, palette);
                    return null;
                }
                if (transform) {
                    i4_0 previous = pixels;
                    pixels = fp_2.AF(pixels);
                    previous.dispose();
                }
                Texture image = new Texture(new S60(pixels, null, false, false, false));
                image.setFilter(eb0_1.Y30, eb0_1.Y30);
                if (owner.vv0 == null) {
                    owner.vv0 = new es_1();
                }
                owner.vv0.Ue0(image);
                regions.put(Byte.valueOf(i), new LPT6_(image));
                pixels.dispose();
            }
            if (order == null) {
                return regions.values().toArray(new LPT6_[0]);
            }
            int count = order.KB;
            LPT6_[] result = new LPT6_[count];
            for (int i = 0; i < count; i++) {
                result[i] = regions.get(order.get(i));
            }
            return result;
        }
        HashMap<Byte, LPT6_> regions = new HashMap<>();
        I2 entries = frames.ZD();
        while (entries.hasNext()) {
            SJ frame = (SJ) entries.next();
            String texture = (String) names.get(frame.T2);
            String palette = (String) palettes.get(frame.IX);
            i4_0 pixels = SA0(textures, texture, palette);
            if (pixels == null) {
                lA0.error("Couldn't create texture animation pixmap from {} / {}", texture, palette);
                return null;
            }
            if (transform) {
                i4_0 previous = pixels;
                pixels = fp_2.AF(pixels);
                previous.dispose();
            }
            Texture image = new Texture(new S60(pixels, null, false, false, false));
            image.setFilter(eb0_1.Y30, eb0_1.Y30);
            if (owner.vv0 == null) {
                owner.vv0 = new es_1();
            }
            owner.vv0.Ue0(image);
            regions.put(Byte.valueOf(frame.T2), new LPT6_(image));
            pixels.dispose();
        }
        es_1 expanded = new es_1();
        int index = 0;
        entries = frames.ZD();
        while (entries.hasNext()) {
            SJ frame = (SJ) entries.next();
            int end = frame.IH;
            while (index <= end) {
                expanded.Ue0(regions.get(Byte.valueOf(frame.T2)));
                index++;
                end = frame.IH;
            }
            index = end;
        }
        return (LPT6_[]) expanded.Mo0(LPT6_.class);
    }

    public static LPT6_[] Gd(am_2 textures, es_1 names, int[] palette, int unused,
            u4_0 owner, boolean transform) {
        HashMap<Byte, String> indexedNames = new HashMap<>();
        new HashMap();
        HashMap<Byte, LPT6_> regions = new HashMap<>();
        byte index = 0;
        I2 entries = names.ZD();
        while (entries.hasNext()) {
            String name = (String) entries.next();
            byte next = (byte) (index + 1);
            indexedNames.put(Byte.valueOf(index), name);
            index = next;
        }
        for (Map.Entry<Byte, String> entry : indexedNames.entrySet()) {
            String name = entry.getValue();
            Integer textureIndex = (Integer) textures.mw.Wk0(name);
            i4_0 pixels;
            if (textureIndex != null) {
                pv_0 texture = (pv_0) (be0_1) textures.ib0.Ks.get(textureIndex.intValue());
                pixels = am_2.Rd(texture, palette);
            } else {
                lA0.error("Couldn't find {}", name);
                pixels = null;
            }
            if (pixels == null) {
                lA0.error("Couldn't create pixmap from {}", entry.getValue());
                return null;
            }
            if (transform) {
                i4_0 previous = pixels;
                pixels = fp_2.AF(pixels);
                previous.dispose();
            }
            Texture image = new Texture(new S60(pixels, null, false, false, false));
            image.setFilter(eb0_1.Y30, eb0_1.Y30);
            if (owner.vv0 == null) {
                owner.vv0 = new es_1();
            }
            owner.vv0.Ue0(image);
            regions.put(entry.getKey(), new LPT6_(image));
            pixels.dispose();
        }
        return regions.values().toArray(new LPT6_[0]);
    }

    public static ui0_0 av(vt_0 model, N40 source) {
        ui0_0 node = new ui0_0();
        node.OS = source.QW;
        node.X20 = source.e9;
        node.Dy0 = source.Xi;
        node.IE0 = source.COm7;
        node.Q1 = new ui0_0[source.eB.KB];
        for (int i = 0; i < node.Q1.length; i++) {
            int index = ((Integer) source.eB.get(i)).intValue();
            node.Q1[i] = av(model, (N40) model.EP.get(index));
        }
        return node;
    }

    public static Ou0 VH(int id) {
        return sb((byte) 3, id, true);
    }

    public static Ou0 sb(byte region, int id, boolean first) {
        ku_0 asset = null;
        iy_0 animation = null;
        if (region == 4) {
            UY resources = tw0_0.Ll0.t1;
            asset = (first ? resources.BJ0 : resources.ny).Vk0(id);
            resources = tw0_0.Ll0.t1;
            animation = (first ? resources.BJ0 : resources.ny).YW(id);
        } else if (region == 3) {
            asset = tw0_0.Ll0.nC0.be.Vk0(id);
            animation = tw0_0.Ll0.nC0.be.YW(id);
        }
        if (asset == null || animation == null) {
            return null;
        }
        pc_1 owner = new pc_1(region, asset.KV[0], asset.QB);
        Ou0 result = null;
        if (dw_2.bn) {
            if (region == 4) {
                gf0_0 provider = tw0_0.KW.bG0[4];
                MG0 type = first ? MG0.rm : MG0.Wk0;
                result = provider.aj(type, id, owner);
            } else if (region == 3) {
                result = tw0_0.KW.bG0[3].L0(id, owner);
            }
        }
        if (result == null) {
            fo0(asset.KV[0], asset.QB);
            v80_0 converter = Cb0();
            vt_0 model = asset.KV[0];
            am_2 textures = asset.QB;
            es_1 animations = animation.Pv;
            converter.getClass();
            result = a40(model, owner, textures, animations, 1.0F, false, false);
        }
        if (animation.Pv.KB > 0) {
            v80_0 converter = Cb0();
            am_2 textures = asset.QB;
            es_1 animations = animation.Pv;
            converter.getClass();
            D7(result, textures, owner, animations);
        }
        return result;
    }

    public static Ou0 CW(vh_1 archive, int id, int... animations) {
        return PC0(archive, id, true, false, false, animations);
    }

    public static Ou0 xL0(FJ archive, int id, int... animations) {
        return PC0(archive, id, true, true, false, animations);
    }

    public static Ou0 PC0(vh_1 archive, int id, boolean first, boolean second,
            boolean third, int... animationIds) {
        try {
            ku_0 asset = ku_0.zn(archive.EG(id).MH(false));
            es_1 animations = new es_1(1);
            if (animationIds != null) {
                for (int animationId : animationIds) {
                    if (animationId < 0 || animationId >= archive.size()) {
                        continue;
                    }
                    aux__0 animation = aux__0.ey0(archive.EG(animationId).MH(false));
                    if (animation != null) {
                        animations.Ue0(animation);
                    }
                }
            }
            v80_0 converter = Cb0();
            vt_0 model = asset.KV[0];
            am_2 textures = asset.QB;
            converter.getClass();
            return Kg0(model, textures, animations, 1.0F, first, third, second);
        } catch (Exception exception) {
            lA0.error("convert error", exception);
            return null;
        }
    }

    public static Ou0 vf0(vt_0 model, am_2 textures, es_1 animations) {
        return Kg0(model, textures, animations, 1.0F, true, false, false);
    }

    public static Ou0 o7(vt_0 model, wl0_1 resources, boolean first) {
        fo0(model, resources.vI0);
        resources.t50.Od0(model, resources.vI0);
        return a40(model, resources.t50, resources.vI0, null, 1.0F, first, false);
    }

    public static Ou0 Kg0(vt_0 model, am_2 textures, es_1 animations, float scale,
            boolean first, boolean unused, boolean third) {
        pc_1 owner = new pc_1((byte) -1, model, textures);
        fo0(model, textures);
        return a40(model, owner, textures, animations, scale, first, third);
    }

    public static void GJ0(l50_0 source, Ou0 scene, vt_0 model, u4_0 owner) {
        ru0_0 overrides = tw0_0.KW;
        if (overrides != null && !overrides.yG0.isEmpty()) {
            return;
        }
        Yw0 cache = source.fx;
        if (cache.Vi0.KB == 0) {
            if (cache.UE0.Tz() == 2) {
                loadUvAnimations(cache, "/a/0/6/9");
            } else if (cache.UE0.Tz() == 4) {
                loadUvAnimations(cache, "/a/1/4/0");
            }
        }
        I2 uvAnimations = cache.Vi0.ZD();
        while (uvAnimations.hasNext()) {
            Nf animation = (Nf) uvAnimations.next();
            if (scene.yI0.contains("m_dun17") && animation.cT.contains("in31_08gym")) {
                continue;
            }
            if (source.Tz() == 2) {
                if (animation.RC.contains("ice_s_02_1")) {
                    scene.Ru0("ow", "lambert3", 0.05F, animation.Op0, true);
                    continue;
                }
                if (animation.RC.contains("c36_foun")) {
                    String name = animation.RC.replace("c36_", "c07_");
                    scene.Ru0("ow", name, 0.05F, animation.Op0, true);
                    continue;
                }
                if (animation.RC.equalsIgnoreCase("n_water_a_1")) {
                    int count = 120;
                    XR[] frames = new XR[count];
                    for (int i = 0; i < count; i++) {
                        float x = (float) i * 1.0F / (float) count;
                        float y = (float) i * -1.0F / (float) count;
                        frames[i] = new XR(x, y, 1.0F, 1.0F);
                    }
                    scene.Ru0("ow", animation.RC, 0.1F, frames, true);
                    continue;
                }
            }
            scene.Ru0("ow", animation.RC, 0.0333F, animation.Op0, true);
        }
        es_1 selectedNames = new es_1(1);
        cache = source.fx;
        if (cache.BW.KB == 0) {
            if (cache.UE0.Tz() == 2) {
                loadTextureAnimations(cache);
            } else if (cache.UE0.Tz() == 3) {
                cache.Sa0();
                cache.tA(cache.BW, "/data/t3_fl_b.nsbtx", "t3_fl_b");
                cache.tA(cache.BW, "/data/t3_fl_p.nsbtx", "t3_fl_p");
                cache.tA(cache.BW, "/data/t3_fl_r.nsbtx", "t3_fl_r");
                cache.tA(cache.BW, "/data/t3_fl_y.nsbtx", "t3_fl_y");
                cache.tA(cache.BW, "/data/lake_anim.nsbtx", "lakep");
            } else if (cache.UE0.Tz() == 4) {
                cache.tA(cache.BW, "/data/t3_fl_b.nsbtx", "t3_fl_b");
                cache.tA(cache.BW, "/data/t3_fl_p.nsbtx", "t3_fl_p");
                cache.tA(cache.BW, "/data/t3_fl_r.nsbtx", "t3_fl_r");
                cache.tA(cache.BW, "/data/t3_fl_y.nsbtx", "t3_fl_y");
                cache.tA(cache.BW, "/data/lake_anim.nsbtx", "lakep");
                cache.tA(cache.BW, "/data/miniasahamabe.nsbtx", "asahamabe");
                cache.tA(cache.BW, "/data/miniasasea.nsbtx", "asasea");
                cache.tA(cache.BW, "/data/minihamabe.nsbtx", "hamabe");
                cache.tA(cache.BW, "/data/minimum.nsbtx", "sea");
                cache.tA(cache.BW, "/data/minirhana.nsbtx", "rhana");
                cache.Sa0();
            }
        }
        I2 textureAnimations = cache.BW.ZD();
        while (textureAnimations.hasNext()) {
            ik_0 animation = (ik_0) textureAnimations.next();
            float rate = animation.Hm0;
            com7__4 channels = animation.O8.K00();
            channels.getClass();
            while (channels.hasNext()) {
                Ka channel = (Ka) channels.next();
                selectedNames.clear();
                String name = channel.Sz0;
                if (source.Tz() == 3) {
                    if (scene.yI0.equalsIgnoreCase("m_gym0503_00_00c")
                            || scene.yI0.equalsIgnoreCase("m_gym0502_00_00c")) {
                        I2 materials = scene.Y3.ZD();
                        while (materials.hasNext()) {
                            BM material = (BM) materials.next();
                            if (material.mi.contains("yomawaru_eye") && channel.Sz0.contains("yomawaru")) {
                                material.LPT8(new PRN_(PRN_.sI, Color.DARK_GRAY));
                                selectedNames.Ue0(material.mi);
                            }
                        }
                    } else if (scene.yI0.equalsIgnoreCase("m_wifi02_00_00c")) {
                        if (name.equalsIgnoreCase("wtk_kabe2")) selectedNames.Ue0("wifi_r2");
                        else if (name.equalsIgnoreCase("wtk_kabe12.0")) selectedNames.Ue0("kabe_anm");
                    } else if (scene.yI0.equalsIgnoreCase("m_wifi01_00_00c")) {
                        if (name.equalsIgnoreCase("wtk_kabe1")) selectedNames.Ue0("kabe2");
                        else if (name.equalsIgnoreCase("wtk_kabe11.0")) selectedNames.Ue0("kabe_anm");
                    } else if (scene.yI0.equalsIgnoreCase("m_wifi03_00_00c")) {
                        if (name.equalsIgnoreCase("wtk_kabe3")) selectedNames.Ue0("wifi_r2");
                        else if (name.equalsIgnoreCase("wtk_kabe13.0")) selectedNames.Ue0("lambert9");
                    } else if (scene.yI0.equalsIgnoreCase("m_siten03_00_00c")) {
                        if (name.startsWith("m_4ten_hi")) rate = 0.1F;
                    } else if (scene.yI0.equalsIgnoreCase("m_dun0101_00_00c")) {
                        if (name.startsWith("c3_s03b")) rate = 0.05F;
                    } else if (scene.yI0.equalsIgnoreCase("m_dun0602_01_01c")
                            || scene.yI0.equalsIgnoreCase("m_dun0602_01_02c")
                            || scene.yI0.equalsIgnoreCase("m_dun0602_01_03c")
                            || scene.yI0.equalsIgnoreCase("m_dun0602_02_01c")
                            || scene.yI0.equalsIgnoreCase("m_dun0602_02_02c")
                            || scene.yI0.equalsIgnoreCase("m_dun0602_02_03c")) {
                        if (name.equalsIgnoreCase("numa_f1b")) {
                            LPT6_[] normal = nn0(animation.Com2, channel.YO, channel.Sr, null, null, owner, false);
                            LPT6_[] colored = Gd(animation.Com2, channel.YO,
                                    new int[] { -12558248, -12556192, 0, 0, 0, 0 }, channel.YO.KB, owner, false);
                            scene.Dv("ow", "numa_b_lm1", 0.25F, normal, true);
                            scene.Dv("ow", "lambert37", 0.25F, colored, true);
                            continue;
                        }
                        if (name.equalsIgnoreCase("numa_f1de")) {
                            LPT6_[] normal = nn0(animation.Com2, channel.YO, channel.Sr, null, null, owner, false);
                            LPT6_[] transformed = nn0(animation.Com2, channel.YO, channel.Sr, null, null, owner, true);
                            scene.Dv("ow", "numa_d_lm27", 0.25F, normal, true);
                            scene.Dv("ow", "numa_e_lm25", 0.25F, transformed, true);
                            LPT6_[] colored = Gd(animation.Com2, channel.YO,
                                    new int[] { -12558248, -12556192, 0, 0, 0, 0 }, channel.YO.KB, owner, false);
                            LPT6_[] coloredTransformed = Gd(animation.Com2, channel.YO,
                                    new int[] { -12558248, -12556192, 0, 0, 0, 0 }, channel.YO.KB, owner, true);
                            scene.Dv("ow", "lambert40", 0.25F, coloredTransformed, true);
                            scene.Dv("ow", "lambert39", 0.25F, colored, true);
                            continue;
                        }
                        if (name.equalsIgnoreCase("numa_f1c")) {
                            selectedNames.Ue0("numa_c_lm1");
                        }
                    }
                    if (name.contains("rhana") || name.startsWith("numa_") && !name.startsWith("numa_f")) {
                        int asset = 12;
                        int texture = 41;
                        int palette = 38;
                        if ((scene.yI0.startsWith("m_dun0301") || scene.yI0.startsWith("m_dun1501"))
                                && name.contains("rhana")) {
                            asset = 53;
                            texture = 45;
                            palette = 47;
                        } else if (name.startsWith("numa_b")) {
                            texture = 69;
                            palette = 66;
                        } else if (name.startsWith("numa_c")) {
                            texture = 71;
                            palette = 68;
                        } else if (name.startsWith("numa_d")) {
                            texture = 73;
                            palette = 70;
                        } else if (name.startsWith("numa_e")) {
                            texture = 75;
                            palette = 72;
                        }
                        am_2 paletteData = tw0_0.Ll0.nC0.EL0(MG0.lpt6, asset);
                        byte region = source.Tz();
                        int phase = c8_0.JD0.YG();
                        int paletteOffset = ((gb_0) (be0_1) paletteData.CoM5.Ks.get(palette)).a00;
                        animation.Com2.Xp0 = jj0_2.SC0(region, paletteData, phase, asset, texture, paletteOffset);
                    } else {
                        animation.Com2.Xp0 = null;
                    }
                    if (selectedNames.isEmpty()) {
                        I2 materials = scene.Y3.ZD();
                        while (materials.hasNext()) {
                            BM material = (BM) materials.next();
                            String[] pieces = material.mi.split("_");
                            String base = pieces[0];
                            if (pieces.length > 2) {
                                base = material.mi.substring(0, material.mi.length() - pieces[pieces.length - 1].length() - 1);
                            }
                            if (base.equalsIgnoreCase(channel.Sz0)) {
                                selectedNames.Ue0(material.mi);
                            }
                        }
                    }
                    if (selectedNames.isEmpty()) {
                        continue;
                    }
                } else if (source.Tz() == 4) {
                    if (name.startsWith("flower0")) {
                        c8_0 clock = c8_0.JD0;
                        if (clock.YG() != 1) {
                            int asset = 10;
                            int texture = 26;
                            int palette = 25;
                            if (name.equalsIgnoreCase("flower02")) {
                                texture = 27;
                                palette = 26;
                            }
                            am_2 paletteData = tw0_0.Ll0.t1.EL0(MG0.lpt6, asset);
                            byte region = source.Tz();
                            int phase = clock.YG();
                            int paletteOffset = ((gb_0) (be0_1) paletteData.CoM5.Ks.get(palette)).a00;
                            animation.Com2.Xp0 = jj0_2.SC0(region, paletteData, phase, asset, texture, paletteOffset);
                        } else {
                            animation.Com2.Xp0 = null;
                        }
                    } else if (name.equalsIgnoreCase("sea_rock")) {
                        I2 materials = scene.Y3.ZD();
                        while (materials.hasNext()) {
                            BM material = (BM) materials.next();
                            if (material.mi.equalsIgnoreCase("sea_rock") || material.mi.startsWith("sea_rock_lm")
                                    || material.mi.equalsIgnoreCase("dsea_rock")) {
                                selectedNames.Ue0(material.mi);
                            }
                        }
                    }
                    if (selectedNames.isEmpty()) {
                        I2 materials = scene.Y3.ZD();
                        while (materials.hasNext()) {
                            BM material = (BM) materials.next();
                            if (material.mi.equalsIgnoreCase(channel.Sz0)) {
                                selectedNames.Ue0(material.mi);
                            } else {
                                String[] pieces = material.mi.split("_");
                                String ignored = pieces[0];
                                if (pieces.length > 2) {
                                    material.mi.substring(0, material.mi.length() - pieces[pieces.length - 1].length() - 1);
                                }
                                if (material.mi.equalsIgnoreCase(channel.Sz0)) {
                                    selectedNames.Ue0(material.mi);
                                }
                            }
                        }
                    }
                } else {
                    for (int i = 0; i < model.mT.KB; i++) {
                        JO material = (JO) model.mT.get(i);
                        String texture = material.nf0;
                        if (texture != null && texture.contains(name)) {
                            selectedNames.Ue0(material.QW);
                            name = material.nf0;
                            break;
                        }
                    }
                    if ("sea_simi".contains(name)) {
                        continue;
                    }
                    if (!name.contains((CharSequence) animation.Com2.mw.mC0().next())) {
                        continue;
                    }
                }
                if (source.Tz() == 2 && selectedNames.KB > 0 && channel.Dn0 == 1552476462) {
                    selectedNames.Ue0("denki_2");
                }
                LPT6_[] frames = nn0(animation.Com2, channel.YO, channel.Sr,
                        animation.p40, animation.Tq, owner, false);
                I2 names = selectedNames.ZD();
                while (names.hasNext()) {
                    scene.Dv("ow", (String) names.next(), rate, frames, true);
                }
            }
        }
    }

    private static void loadUvAnimations(Yw0 cache, String path) {
        Ae entry = (Ae) cache.UE0.fd0.dg.get(path);
        Qd0.cV();
        String ignored = entry.kd;
        l50_0 source = entry.h2;
        ByteBuffer buffer = source.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int magic = pf_0.LPt2(buffer, entry.bM0);
        if (magic != 1129464142) {
            throw new RuntimeException(GQ.ti("Header magic mismatch = ", magic, " vs expected 1129464142"));
        }
        int table = ax0_0.vU(buffer);
        int count = buffer.getInt();
        int length = iy_1.WG0(count, 8, buffer.position(), buffer);
        int data = buffer.position() + length;
        for (int i = 0; i < count; i++) {
            int offset = i * 8;
            int start = buffer.getInt(table + 12 + offset);
            int end = GA.m1(table, 16, offset, buffer);
            int absolute = start + data;
            int size = end - start;
            String[] names = un0_0.DB0;
            if (i < 400) {
                ignored = names[i];
            } else {
                Integer.toString(i);
            }
            ByteBuffer file = source.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            file.position(absolute);
            if (size > 0) {
                AT.i20(absolute, size, file.limit(), file);
            }
            I2 animations = DI0.Bw(file.slice().order(ByteOrder.LITTLE_ENDIAN)).ob.ZD();
            while (animations.hasNext()) {
                sq_2 animation = (sq_2) animations.next();
                I2 channels = animation.P2.ZD();
                while (channels.hasNext()) {
                    lm0_0 channel = (lm0_0) channels.next();
                    Nf result = new Nf();
                    result.cT = animation.QW;
                    result.RC = channel.QW;
                    result.Op0 = XR.c00(animation.com8, channel);
                    cache.Vi0.Ue0(result);
                }
            }
        }
    }

    private static void loadTextureAnimations(Yw0 cache) {
        Ae entry = (Ae) cache.UE0.fd0.dg.get("/a/0/7/0");
        Qd0.cV();
        String ignored = entry.kd;
        l50_0 source = entry.h2;
        ByteBuffer buffer = source.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int magic = pf_0.LPt2(buffer, entry.bM0);
        if (magic != 1129464142) {
            throw new RuntimeException(GQ.ti("Header magic mismatch = ", magic, " vs expected 1129464142"));
        }
        int table = ax0_0.vU(buffer);
        int count = buffer.getInt();
        int length = iy_1.WG0(count, 8, buffer.position(), buffer);
        int data = buffer.position() + length;
        for (int i = 0; i < count; i++) {
            int offset = i * 8;
            int start = buffer.getInt(table + 12 + offset);
            int end = GA.m1(table, 16, offset, buffer);
            int absolute = start + data;
            int size = end - start;
            String[] names = un0_0.DB0;
            if (i < 400) {
                ignored = names[i];
            } else {
                Integer.toString(i);
            }
            ByteBuffer file = source.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            file.position(absolute);
            if (size > 0) {
                AT.i20(absolute, size, file.limit(), file);
            }
            file = file.slice().order(ByteOrder.LITTLE_ENDIAN);
            int entries = file.getInt();
            int[] starts = new int[entries];
            int[] textures = new int[entries];
            for (int j = 0; j < entries; j++) {
                starts[j] = file.getInt();
                textures[j] = file.getInt();
            }
            file.getInt();
            for (int j = 0; j < entries; j++) {
                file.position(textures[j] + 20);
                Er0 texture = null;
                try {
                    texture = new Er0(file, false, true);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                if (texture == null) {
                    continue;
                }
                file.position(starts[j]);
                int frameCount = file.getInt();
                int split = 0;
                int[] splits = new int[16];
                es_1 frames = new es_1();
                for (int k = 0; k < frameCount; k++) {
                    frames.Ue0(new SJ());
                }
                for (int k = 0; k < frameCount; k++) {
                    short time = file.getShort();
                    ((SJ) frames.get(k)).IH = time;
                    if (k > 0 && time == 0) {
                        splits[++split] = k;
                    }
                }
                if (frameCount == 151 || frameCount == 3 || frameCount == 5) {
                    file.getShort();
                }
                for (int k = 0; k < frameCount; k++) {
                    byte index = file.get();
                    ((SJ) frames.get(k)).T2 = index;
                }
                if (frameCount == 151 || frameCount == 3 || frameCount == 5) {
                    file.get();
                    if (frameCount == 5) {
                        file.getShort();
                    }
                }
                for (int k = 0; k < frameCount; k++) {
                    byte index = file.get();
                    ((SJ) frames.get(k)).IX = index;
                }
                int duration = file.getInt(textures[j] - 4);
                for (int k = 0; k < 16; k++) {
                    es_1 segment = new es_1();
                    int first = splits[k];
                    if (k > 0 && first == 0) {
                        continue;
                    }
                    int last = frames.KB;
                    if (k != 15 && splits[k + 1] > 0) {
                        last = splits[k + 1];
                    }
                    for (int frame = first; frame < last; frame++) {
                        segment.Ue0(frames.get(frame));
                    }
                    SJ finalFrame = (SJ) segment.GH0();
                    finalFrame.IH = (short) (finalFrame.IH + duration);
                    cache.BW.Ue0(new ik_0(texture.E10, segment));
                }
            }
        }
    }

    public static void D7(Ou0 scene, am_2 textures, u4_0 owner, es_1 animations) {
        if (animations == null) {
            return;
        }
        ru0_0 overrides = tw0_0.KW;
        if (overrides != null && !overrides.yG0.isEmpty()) {
            return;
        }
        I2 entries = animations.ZD();
        while (entries.hasNext()) {
            aux__0 entry = (aux__0) entries.next();
            entry.getClass();
            if (entry instanceof ta0_0) {
                I2 tracks = ((ta0_0) entry).eI0.ZD();
                while (tracks.hasNext()) {
                    B4 animation = (B4) tracks.next();
                    I2 channels = animation.iH.ZD();
                    while (channels.hasNext()) {
                        lb_0 channel = (lb_0) channels.next();
                        c8_0 clock = c8_0.JD0;
                        if (clock.YG() != 1) {
                            int hash = scene.tD;
                            if ((hash == 1778373671 || hash == 1778373672 || hash == 1778373673
                                    || hash == 1778403462 || hash == 1778403463 || hash == 1778403464)
                                    && animation.QW.equalsIgnoreCase("ushadow_ani")) {
                                int asset = owner.kh;
                                int nameHash = channel.QW.hashCode();
                                int textureIndex = -1;
                                int paletteIndex = -1;
                                switch (scene.tD) {
                                    case 1778373673:
                                    case 1778403462:
                                    case 1778403463:
                                    case 1778403464:
                                        if (nameHash >= -1854157706 && nameHash <= -1854157701) {
                                            textureIndex = 3;
                                            paletteIndex = 2;
                                        }
                                        break;
                                    case 1778373672:
                                        if (nameHash == -1644313926 || nameHash == -1644313895) {
                                            textureIndex = 11;
                                            paletteIndex = 2;
                                        } else if (nameHash >= -1854157706 && nameHash <= -1854157701) {
                                            textureIndex = 1;
                                            paletteIndex = 4;
                                        }
                                        break;
                                    case 1778373671:
                                        switch (nameHash) {
                                            case -1854157706:
                                            case -1854157705:
                                            case -1854157704:
                                            case -1854157703:
                                            case -1854157701:
                                                textureIndex = 1;
                                                paletteIndex = 8;
                                                break;
                                            case -1644313957:
                                            case -1644313926:
                                            case -1644313895:
                                            case -1644313833:
                                                textureIndex = 17;
                                                paletteIndex = 6;
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    default:
                                        break;
                                }
                                if (textureIndex > 0) {
                                    int phase = clock.YG();
                                    es_1 palettes = textures.CoM5.Ks;
                                    if (paletteIndex < palettes.KB && textureIndex < textures.ib0.Ks.KB) {
                                        int palette = ((gb_0) (be0_1) palettes.get(paletteIndex)).a00;
                                        if (jj0_2.cy((byte) 4, phase, asset, palette)) {
                                            palette = ((gb_0) (be0_1) textures.CoM5.Ks.get(paletteIndex)).a00;
                                            textures.Xp0 = jj0_2.SC0((byte) 4, textures, phase, asset, textureIndex, palette);
                                        }
                                    }
                                }
                            }
                        }
                        String name = channel.QW;
                        es_1 frames = channel.km;
                        HashMap<Byte, LPT6_> regions = new HashMap<>();
                        I2 values = frames.ZD();
                        boolean failed = false;
                        while (values.hasNext()) {
                            SJ frame = (SJ) values.next();
                            String textureName = (String) animation.nN.get(frame.T2);
                            String paletteName = (String) animation.zq0.get(frame.IX);
                            i4_0 pixels = SA0(textures, textureName, paletteName);
                            if (pixels == null) {
                                lA0.error("Couldn't create texture animation pixmap from {} / {}", textureName, paletteName);
                                failed = true;
                                break;
                            }
                            Texture texture = new Texture(new S60(pixels, null, false, false, false));
                            texture.setFilter(eb0_1.Y30, eb0_1.Y30);
                            if (owner.vv0 == null) {
                                owner.vv0 = new es_1();
                            }
                            owner.vv0.Ue0(texture);
                            regions.put(Byte.valueOf(frame.T2), new LPT6_(texture));
                            pixels.dispose();
                        }
                        LPT6_[] result = null;
                        if (!failed) {
                            int index = 0;
                            es_1 expanded = new es_1();
                            int boundary = animation.rm0;
                            if (frames.KB > 1) {
                                boundary = ((SJ) frames.get(1)).IH;
                            }
                            for (int tick = 0;; tick++) {
                                int duration = animation.rm0;
                                if (tick >= duration) {
                                    break;
                                }
                                if (tick >= boundary) {
                                    int next = index + 1;
                                    int after = index + 2;
                                    boundary = after < frames.KB ? ((SJ) frames.get(after)).IH : duration;
                                    index = next;
                                }
                                if (index >= frames.KB) {
                                    lA0.error("out of bounds for fv data animation");
                                    break;
                                }
                                expanded.Ue0(regions.get(Byte.valueOf(((SJ) frames.get(index)).T2)));
                            }
                            result = (LPT6_[]) expanded.Mo0(LPT6_.class);
                        }
                        scene.Dv(animation.QW, name, 0.0333333351F, result, false);
                    }
                }
            }
            if (entry instanceof DI0) {
                I2 tracks = ((DI0) entry).ob.ZD();
                while (tracks.hasNext()) {
                    sq_2 animation = (sq_2) tracks.next();
                    I2 channels = animation.P2.ZD();
                    while (channels.hasNext()) {
                        lm0_0 channel = (lm0_0) channels.next();
                        String name = channel.QW;
                        XR[] frames = XR.c00(animation.com8, channel);
                        scene.Ru0(animation.QW, name, 0.05F, frames, false);
                    }
                }
            }
            if (entry instanceof cf_0) {
                I2 tracks = ((cf_0) entry).JR.ZD();
                while (tracks.hasNext()) {
                    Ar animation = (Ar) tracks.next();
                    String name = animation.QW;
                    int count = animation.Zj;
                    es_1 channels = animation.La0;
                    if (scene.i10 == null) {
                        scene.i10 = new HashMap();
                    }
                    if (channels == null) {
                        continue;
                    }
                    if (scene.i10.get(name) == null) {
                        scene.i10.put(name, new u5_0());
                        scene.Kv.Ue0(name);
                    }
                    I2 values = channels.ZD();
                    while (values.hasNext()) {
                        zw_0 channel = (zw_0) values.next();
                        _instanceof[] frames = new _instanceof[count];
                        for (int i = 0; i < count; i++) {
                            int first = zw_0.nUL(channel.cOn, i, channel.is0, channel.RV);
                            int second = zw_0.nUL(channel.S2, i, channel.PC0, channel.jH0);
                            int third = zw_0.nUL(channel.J1, i, channel.eC, channel.mG);
                            int fourth = zw_0.nUL(channel.E70, i, channel.CJ, channel.QB);
                            int value = zw_0.nUL(channel.cs0, i, channel.Sg, channel.xk);
                            first = first != -1 ? px_1.XK0(first) : -1;
                            second = second != -1 ? px_1.XK0(second) : -1;
                            third = third != -1 ? px_1.XK0(third) : -1;
                            fourth = fourth != -1 ? px_1.XK0(fourth) : -1;
                            frames[i] = new _instanceof(value, first, second, third, fourth);
                        }
                        uy_1 result = new uy_1(channel.QW, frames);
                        ((u5_0) scene.i10.get(name)).P30.Ue0(result);
                    }
                }
            }
        }
    }

    public static ut_0 Xy(vt_0 model, y90_0 data, E60 textures, es_1 parts, es_1 animations) {
        ut_0 result = new ut_0(data, textures);
        new es_1();
        I2 pieces = parts.ZD();
        while (pieces.hasNext()) {
            vg0_0 piece = (vg0_0) pieces.next();
            Xz0 node = Xz0.ry0(result.Wc0, piece.pj, true);
            result.Wc0.sj0(node, true);
            String parentName = ((N40) model.EP.get(piece.Ni0)).QW;
            if (Xz0.ry0(result.Wc0, parentName, true) == null) {
                lA0.getClass();
                continue;
            }
            Xz0.ry0(result.Wc0, parentName, true).lPt7(node);
        }
        ((Xz0) result.Wc0.get(0)).Fc0.Fg0(1.0F / model.Iu0);
        if (animations != null && result.AF.KB == 0) {
            I2 entries = animations.ZD();
            while (entries.hasNext()) {
                aux__0 entry = (aux__0) entries.next();
                entry.getClass();
                if (!(entry instanceof ck_0)) {
                    continue;
                }
                es_1 destination = result.AF;
                ck_0 source = (ck_0) entry;
                ji0_2 animation = new ji0_2();
                animation.Ys0 = source.zN;
                animation.Oj = (((ou0_0) (be0_1) source.uy0.Ks.KI()).HU - 1) * 0.0333333351F;
                es_1 resolvedNodes = new es_1();
                I2 nodes = model.EP.ZD();
                while (nodes.hasNext()) {
                    String name = ((N40) nodes.next()).QW;
                    resolvedNodes.Ue0(Xz0.ry0(result.Wc0, name, true));
                }
                mg0_0[] channels = ((ou0_0) (be0_1) source.uy0.Ks.KI()).A10;
                for (int i = 0; i < model.EP.KB; i++) {
                    if (channels.length <= i) {
                        lA0.getClass();
                        continue;
                    }
                    N40 sourceNode = (N40) model.EP.get(i);
                    mg0_0 channel = channels[i];
                    channel.getClass();
                    yg0_0 track = new yg0_0();
                    if (channel.D10()) {
                        es_1 frames = new es_1();
                        track.TK = frames;
                        long flags = channel.uj;
                        if ((flags & 8L) != 0 && (flags & 16L) != 0 && (flags & 32L) != 0) {
                            C8 value = new C8(channel.f1.lp0(0), channel.Yc0.lp0(0), channel.e60.lp0(0));
                            frames.Ue0(new li0_2(0.0F, value));
                        } else {
                            for (int frame = 0; frame < channel.N20; frame++) {
                                track.TK.Ue0(new li0_2(frame * 0.0333333351F,
                                        new C8(channel.f1.lp0(frame), channel.Yc0.lp0(frame), channel.e60.lp0(frame))));
                            }
                        }
                    }
                    if (channel.Nv0()) {
                        track.l = new es_1();
                        if (channel.lr0()) {
                            track.l.Ue0(new li0_2(0.0F, new me0_2().et0(true, channel.IG.sd(0))));
                        } else {
                            for (int frame = 0; frame < channel.N20; frame++) {
                                track.l.Ue0(new li0_2(frame * 0.0333333351F,
                                        new me0_2().et0(true, channel.IG.sd(frame))));
                            }
                        }
                    }
                    if (channel.OK0()) {
                        es_1 frames = new es_1();
                        track.HG = frames;
                        long flags = channel.uj;
                        if ((flags & 2048L) != 0 && (flags & 4096L) != 0 && (flags & 8192L) != 0) {
                            C8 value = new C8(channel.N7.cj0(0), channel.E40.cj0(0), channel.n7.cj0(0));
                            frames.Ue0(new li0_2(0.0F, value));
                        } else {
                            for (int frame = 0; frame < channel.N20; frame++) {
                                track.HG.Ue0(new li0_2(frame * 0.0333333351F,
                                        new C8(channel.N7.cj0(frame), channel.E40.cj0(frame), channel.n7.cj0(frame))));
                            }
                        }
                    }
                    Xz0 node = Xz0.ry0(result.Wc0, sourceNode.QW, true);
                    track.Cr = node;
                    if (node != null && (track.l != null || track.HG != null || track.TK != null)) {
                        animation.jl.Ue0(track);
                    }
                }
                destination.Ue0(animation);
            }
        }
        pieces = parts.ZD();
        while (pieces.hasNext()) {
            vg0_0 piece = (vg0_0) pieces.next();
            JO source = piece.hE;
            String name = source.QW;
            int count = result.Cs.KB;
            BM material = null;
            for (int i = 0; i < count; i++) {
                BM candidate = (BM) result.Cs.get(i);
                if (candidate.mi.equalsIgnoreCase(name)) {
                    material = candidate;
                    break;
                }
            }
            material.LPT8(new pr_1(pr_1.av, source.vX));
            material.LPT8(new ma_1(source.vD0, true));
            if (source.dk0) {
                Color color = source.OK0;
                if (color.r > 0.25F && color.g > 0.25F && color.b > 0.25F) {
                    material.LPT8(new PRN_(PRN_.xE, source.OK0));
                }
            }
            if (material.mi.equals("c4g_arch1_lm2") || material.mi.equals("sh") || material.mi.startsWith("t3_fl_")) {
                piece.hE.hr = 6;
            }
            int format = piece.hE.hr;
            boolean alpha = format == 6 || format == 1;
            if (alpha) {
                material.LPT8(new xd_2(xd_2.DK0, piece.hE.hr));
            }
            if (alpha || piece.hE.J00 < 1.0F || piece.hE.Qu0 == 1) {
                material.LPT8(new sh_0(piece.hE.J00));
                material.LPT8(new mb0_2(mb0_2.k6, 0.01F));
            }
            if (model.QW.equalsIgnoreCase("m_gift01_00_00c") && material.mi.equalsIgnoreCase("lambert8")) {
                material.LPT8(new sh_0(0.45F));
            } else if (model.QW.equalsIgnoreCase("c1_s03") && material.mi.equalsIgnoreCase("lambert7")) {
                material.LPT8(new sh_0(0.75F));
            } else if (model.QW.startsWith("m_dun")
                    && (material.mi.equalsIgnoreCase("light_lm1") || material.mi.equalsIgnoreCase("d_light"))) {
                material.LPT8(new sh_0(0.99F));
            }
        }
        return result;
    }

    public static y90_0 Un0(vt_0 model, es_1 pieces, boolean skinned) {
        y90_0 result = new y90_0();
        ui0_0 root = new ui0_0();
        root.OS = "Aramature";
        root.Dy0 = new C8(1.0F, 1.0F, 1.0F);
        root.Q1 = new ui0_0[1];
        root.Q1[0] = av(model, (N40) model.EP.get(0));
        result.d9.Ue0(root);
        int sequence = 0;
        I2 entries = pieces.ZD();
        while (entries.hasNext()) {
            vg0_0 piece = (vg0_0) entries.next();
            String suffix = Integer.toString(++sequence);
            String nodeName = "default".equals(piece.pj) ? jj0_0.hw0("node", suffix) : piece.pj;
            "default".equals(piece.pj);
            String partName = "default".equals(piece.pj) ? jj0_0.hw0("part", suffix) : piece.pj;
            es_1 bones = null;
            int stride = 3 + (piece.pC0 ? 3 : 0);
            stride += piece.iS ? 4 : 0;
            stride += piece.LPt4 ? 2 : 0;
            if (skinned) {
                nb_2 used = new nb_2();
                for (int i = 0; i < piece.ee0; i++) {
                    int index = (int) piece.V60.QJ0((stride + 2) * i + stride);
                    N40 bone = (N40) model.EP.get(index);
                    used.WK0(Integer.valueOf(index), bone);
                }
                bones = used.mC0().Com2();
            }
            if (piece.SB == 0) {
                I2 primitives = piece.ZK0.ZD();
                while (primitives.hasNext()) {
                    Nu0 primitive = (Nu0) primitives.next();
                    int count = primitive.Q3;
                    switch (at0_0.Bt0[primitive.W10.Z7]) {
                        case 3:
                        case 4:
                            for (int i = 0; i + 2 < count; i += 2) {
                                piece.zc0.n20(vg0_0.De0(piece.L10 + i, piece.ee0));
                                piece.zc0.n20(vg0_0.De0(piece.L10 + i + 1, piece.ee0));
                                piece.zc0.n20(vg0_0.De0(piece.L10 + i + 2, piece.ee0));
                                piece.SB++;
                                if (i + 3 < count) {
                                    piece.zc0.n20(vg0_0.De0(piece.L10 + i + 1, piece.ee0));
                                    piece.zc0.n20(vg0_0.De0(piece.L10 + i + 3, piece.ee0));
                                    piece.zc0.n20(vg0_0.De0(piece.L10 + i + 2, piece.ee0));
                                    piece.SB++;
                                }
                            }
                            piece.L10 += count;
                            break;
                        case 2:
                            for (int i = 0; i < count; i += 4) {
                                piece.zc0.n20(vg0_0.De0(piece.L10, piece.ee0));
                                piece.zc0.n20(vg0_0.De0(piece.L10 + 1, piece.ee0));
                                piece.zc0.n20(vg0_0.De0(piece.L10 + 2, piece.ee0));
                                piece.SB++;
                                piece.zc0.n20(vg0_0.De0(piece.L10, piece.ee0));
                                piece.zc0.n20(vg0_0.De0(piece.L10 + 2, piece.ee0));
                                piece.zc0.n20(vg0_0.De0(piece.L10 + 3, piece.ee0));
                                piece.SB++;
                                piece.L10 += 4;
                            }
                            break;
                        case 1:
                            for (int i = 0; i < count; i += 3) {
                                piece.zc0.n20(vg0_0.De0(piece.L10, piece.ee0));
                                piece.zc0.n20(vg0_0.De0(piece.L10 + 1, piece.ee0));
                                piece.zc0.n20(vg0_0.De0(piece.L10 + 2, piece.ee0));
                                piece.SB++;
                                piece.L10 += 3;
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
            te_0 mesh = new te_0();
            es_1 attributes = new es_1();
            attributes.Ue0(new kz_0(1, 3, "a_position"));
            if (piece.pC0) {
                attributes.Ue0(new kz_0(8, 3, "a_normal"));
            }
            if (piece.iS) {
                attributes.Ue0(new kz_0(2, 4, 5126, false, "a_color"));
            }
            if (piece.LPt4) {
                attributes.Ue0(new kz_0(16, 2, "a_texCoord0"));
            }
            if (piece.yQ) {
                attributes.Ue0(new kz_0(64, 2, "a_boneWeight0"));
            }
            mesh.Ef = (kz_0[]) attributes.Mo0(kz_0.class);
            UJ0 vertices = piece.V60;
            int vertexLength = vertices.Or;
            float[] vertexData = new float[vertexLength];
            System.arraycopy(vertices.iS, 0, vertexData, 0, vertexLength);
            mesh.e90 = vertexData;
            vx0 part = new vx0();
            part.a80 = partName;
            BB indices = piece.zc0;
            int indexCount = indices.Sd0;
            short[] indexData = new short[indexCount];
            System.arraycopy(indices.mi0, 0, indexData, 0, indexCount);
            part.Ky0 = indexData;
            part.Yu0 = 4;
            mesh.W = new vx0[] { part };
            if (skinned) {
                for (int i = 0; i < piece.ee0; i++) {
                    int offset = (stride + 2) * i + stride;
                    float[] values = mesh.e90;
                    values[offset] = bones.E8(Integer.valueOf((int) values[offset]), false);
                }
            }
            result.Bz.Ue0(mesh);
            ui0_0 node = new ui0_0();
            node.OS = nodeName;
            node.X20 = new C8();
            node.IE0 = new me0_2();
            node.Dy0 = new C8(1.0F, 1.0F, 1.0F);
            xu_0 nodePart = new xu_0();
            nodePart.Hi = partName;
            nodePart.ys = piece.hE.QW;
            if (piece.yQ && skinned) {
                nodePart.fH = new cf_2(true, pieces.KB, String.class, Matrix4.class);
                I2 used = bones.ZD();
                while (used.hasNext()) {
                    int index = ((Integer) used.next()).intValue();
                    N40 bone = (N40) model.EP.get(index);
                    Matrix4 source = bone.Rc0;
                    source.getClass();
                    Matrix4 transform = new Matrix4(source);
                    if (transform.rA0() == 0.0F) {
                        Matrix4 correction = new Matrix4();
                        float[] amounts = { 0.000001F, 0.00001F, 0.0001F, 0.001F };
                        boolean repaired = false;
                        for (int i = 0; i < 4; i++) {
                            float amount = amounts[i];
                            correction.F();
                            correction.EW[0] = amount;
                            correction.EW[5] = amount;
                            correction.EW[10] = amount;
                            for (int j = 0; j < transform.EW.length; j++) {
                                transform.EW[j] += correction.EW[j];
                            }
                            if (transform.rA0() != 0.0F) {
                                correction = transform;
                                repaired = true;
                                break;
                            }
                        }
                        if (!repaired && transform.rA0() == 0.0F) {
                            correction = null;
                        }
                        if (correction == null) {
                            lA0.getClass();
                            transform.IW(bone.e9);
                        }
                    }
                    nodePart.fH.n3(((N40) model.EP.get(index)).QW, transform);
                }
            }
            node.Wu = new xu_0[] { nodePart };
            result.d9.Ue0(node);
            ef0_1 material = new ef0_1();
            material.dq0 = piece.hE.QW;
            jx0_0 texture = new jx0_0();
            texture.for$ = 2;
            texture.Dn0 = piece.hE.QW;
            if (material.wX == null) {
                material.wX = new es_1(1);
            }
            material.wX.Ue0(texture);
            result.zK.Ue0(material);
        }
        return result;
    }

    public static Ou0 a40(vt_0 model, u4_0 owner, am_2 textures, es_1 animations,
            float unusedScale, boolean useVertexColors, boolean skinned) {
        resetStack(r80);
        if (!skinned) {
            ByteBuffer scan = model.BC0;
            scan.position(0);
            boolean blended = false;
            scanCommands:
            while (scan.hasRemaining()) {
                int command = scan.get();
                switch (command & 15) {
                    case 2:
                    case 12:
                    case 13:
                        scan.get();
                        scan.get();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        scan.get();
                        break;
                    case 6:
                        scan.get();
                        scan.get();
                        scan.get();
                        if (((command >> 5) & 1) == 1) scan.get();
                        if (((command >> 6) & 1) == 1) scan.get();
                        break;
                    case 7:
                    case 8:
                        scan.get();
                        if (((command >> 5) & 1) == 1) scan.get();
                        if (((command >> 6) & 1) == 1) scan.get();
                        break;
                    case 9:
                        scan.get();
                        int count = scan.get();
                        int position = scan.position();
                        scan.position(count * 3 + position);
                        blended = true;
                        break scanCommands;
                    default:
                        break;
                }
            }
            skinned = model.Qd0 != null || blended;
        }
        es_1 pieces = new es_1();
        tj0_1 stack = r80;
        ByteBuffer commands = model.BC0;
        commands.position(0);
        int polygonOrder = 0;
        int materialIndex = 0;
        while (commands.hasRemaining()) {
            int command = commands.get();
            switch (command & 15) {
                case 2:
                case 12:
                case 13:
                    commands.get();
                    commands.get();
                    break;
                case 3:
                    stack.Bw.GJ(stack.Ub[commands.get()]);
                    break;
                case 4:
                    materialIndex = commands.get();
                    break;
                case 5: {
                    int polygonIndex = commands.get();
                    gr_1 polygon = (gr_1) model.yj0.get(polygonIndex);
                    polygon.mp0 = stack.Bw.zo0;
                    JO material = (JO) model.mT.get(materialIndex);
                    boolean colors = !material.zr && useVertexColors;
                    jk0_0 vertex = new jk0_0();
                    if (skinned) {
                        float bone = stack.Bw.zo0;
                        float weight = stack.Bw.X80;
                        vertex.wG0.x = bone;
                        vertex.wG0.y = weight;
                        vertex.nh0 = true;
                    }
                    vg0_0 piece = decodePolygon(model, polygon, polygonIndex, material, colors, skinned, stack, vertex);
                    int nextOrder = polygonOrder + 1;
                    polygon.rg = polygonOrder;
                    if (piece != null) {
                        pieces.Ue0(piece);
                    }
                    polygonOrder = nextOrder;
                    break;
                }
                case 6: {
                    int node = commands.get();
                    commands.get();
                    commands.get();
                    boolean save = ((command >> 5) & 1) == 1;
                    boolean restore = ((command >> 6) & 1) == 1;
                    int saveIndex = save ? commands.get() : -1;
                    int restoreIndex = restore ? commands.get() : -1;
                    if (restore) {
                        stack.Bw.GJ(stack.Ub[restoreIndex]);
                    }
                    stack.Bw.zo0 = node;
                    stack.Bw.pG.Ue0(Integer.valueOf(node));
                    Matrix4 target = ((N40) model.EP.get(node)).Rc0;
                    wV current = stack.Bw;
                    target.getClass();
                    target.Dd0(current.EW);
                    if (save) {
                        stack.Ub[saveIndex].GJ(stack.Bw);
                    }
                    break;
                }
                case 7:
                case 8:
                    commands.get();
                    if (((command >> 5) & 1) == 1) commands.get();
                    if (((command >> 6) & 1) == 1) commands.get();
                    break;
                case 9: {
                    Matrix4 combined = yy0;
                    Arrays.fill(combined.EW, 0.0F);
                    int destination = commands.get();
                    int count = commands.get();
                    for (int i = 0; i < count; i++) {
                        int source = commands.get();
                        int inverse = commands.get();
                        float weight = (commands.get() & 255) / 256.0F;
                        Matrix4 weighted = PL0;
                        wV matrix = stack.Ub[source];
                        weighted.getClass();
                        weighted.Dd0(matrix.EW);
                        Matrix4 binding = model.Qd0.Gd0[inverse].np;
                        Matrix4.md0(weighted.EW, binding.EW);
                        for (int j = 0; j < weighted.EW.length; j++) {
                            weighted.EW[j] *= weight;
                        }
                        Matrix4 part = PL0;
                        for (int j = 0; j < combined.EW.length; j++) {
                            combined.EW[j] += part.EW[j];
                        }
                    }
                    stack.Bw.getClass();
                    stack.Bw.Dd0(combined.EW);
                    stack.Ub[destination].GJ(stack.Bw);
                    break;
                }
                case 11: {
                    wV current = stack.Bw;
                    Matrix4 scale = PL0;
                    float amount = ((command >> 5) & 1) == 0 ? model.Iu0 : model.je;
                    scale.F();
                    float[] values = scale.EW;
                    values[0] = amount;
                    values[5] = amount;
                    values[10] = amount;
                    Matrix4.md0(current.EW, values);
                    break;
                }
                default:
                    break;
            }
        }
        y90_0 data = Un0(model, pieces, skinned);
        ut_0 converted;
        try {
            converted = Xy(model, data, owner, pieces, animations);
        } catch (Exception exception) {
            resetStack(r80);
            throw exception;
        }
        Ou0 result = new Ou0(converted, model.QW, model.Iu0, owner);
        D7(result, textures, owner, animations);
        result.Th();
        return result;
    }

    private static void resetStack(tj0_1 stack) {
        stack.Bw.F();
        stack.Bw.zo0 = 0;
        stack.Bw.pG.clear();
        for (int i = 0; i < stack.Ub.length; i++) {
            stack.Ub[i].F();
            stack.Ub[i].zo0 = 0;
            stack.Ub[i].pG.clear();
        }
    }

    private static vg0_0 decodePolygon(vt_0 model, gr_1 polygon, int polygonIndex,
            JO material, boolean colors, boolean skinned, tj0_1 stack, jk0_0 vertex) {
        if (polygon.fO < 0) {
            return null;
        }
        vg0_0 piece = new vg0_0(CO.go("polygon", polygonIndex, "_")
                .append(((JO) model.mT.get(polygon.fO)).QW).toString());
        piece.Ni0 = polygon.mp0;
        N40 ignored = (N40) model.EP.get(piece.Ni0);
        piece.hE = (JO) model.mT.get(polygon.fO);
        byte[] bytes = polygon.t70;
        ByteBuffer commands;
        if (bytes == null) {
            commands = null;
        } else {
            if (polygon.l50 == null) {
                polygon.l50 = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
            }
            polygon.l50.position(0);
            commands = polygon.l50;
        }
        int primitive = -1;
        if (commands == null) {
            return null;
        }
        int cursor = 0;
        int limit = commands.limit();
        int[] group = new int[4];
        Ut.rB0();
        while (cursor < limit) {
            for (int i = 0; i < 4; i++) {
                if (cursor >= limit) {
                    group[i] = 255;
                } else {
                    group[i] = commands.get(cursor);
                    cursor++;
                }
            }
            for (int i = 0; i < 4 && cursor < limit; i++) {
                int command = group[i];
                switch (command) {
                    case 0:
                    case 17:
                        break;
                    case 18:
                    case 19:
                    case 42:
                    case 43:
                    case 48:
                    case 49:
                    case 50:
                    case 80:
                    case 96:
                    case 114:
                        cursor += 4;
                        break;
                    case 113:
                        cursor += 8;
                        break;
                    case 112:
                        cursor += 12;
                        break;
                    case 52:
                        cursor += 128;
                        break;
                    case 16:
                    case 41:
                    case 51:
                        commands.getInt(cursor);
                        cursor += 4;
                        break;
                    case 40: {
                        int packed = commands.getInt(cursor);
                        cursor += 4;
                        C8 position = Ut;
                        float old = position.x;
                        position.x = px_1.dg((short) (packed & 1023), 0, 9) / 8.0F + old;
                        old = position.y;
                        position.y = px_1.dg((short) ((packed >> 10) & 1023), 0, 9) / 8.0F + old;
                        old = position.z;
                        position.z = px_1.dg((short) ((packed >> 20) & 1023), 0, 9) / 8.0F + old;
                        emitPosition(vertex, stack);
                        break;
                    }
                    case 39: {
                        int packed = commands.getInt(cursor);
                        cursor += 4;
                        Ut.y = px_1.dg((short) (packed & 65535), 3, 12);
                        Ut.z = px_1.dg((short) ((packed >> 16) & 65535), 3, 12);
                        emitPosition(vertex, stack);
                        break;
                    }
                    case 38: {
                        int packed = commands.getInt(cursor);
                        cursor += 4;
                        Ut.x = px_1.dg((short) (packed & 65535), 3, 12);
                        Ut.z = px_1.dg((short) ((packed >> 16) & 65535), 3, 12);
                        emitPosition(vertex, stack);
                        break;
                    }
                    case 37: {
                        int packed = commands.getInt(cursor);
                        cursor += 4;
                        Ut.x = px_1.dg((short) (packed & 65535), 3, 12);
                        Ut.y = px_1.dg((short) ((packed >> 16) & 65535), 3, 12);
                        emitPosition(vertex, stack);
                        break;
                    }
                    case 36: {
                        int packed = commands.getInt(cursor);
                        cursor += 4;
                        Ut.x = px_1.dg((short) (packed & 1023), 3, 6);
                        Ut.y = px_1.dg((short) ((packed >> 10) & 1023), 3, 6);
                        Ut.z = px_1.dg((short) ((packed >> 20) & 1023), 3, 6);
                        emitPosition(vertex, stack);
                        break;
                    }
                    case 35: {
                        int xy = commands.getInt(cursor);
                        int z = commands.getInt(cursor + 4);
                        cursor += 8;
                        Ut.x = px_1.dg((short) (xy & 65535), 3, 12);
                        Ut.y = px_1.dg((short) ((xy >> 16) & 65535), 3, 12);
                        Ut.z = px_1.dg((short) (z & 65535), 3, 12);
                        emitPosition(vertex, stack);
                        break;
                    }
                    case 34: {
                        float u = px_1.dg(commands.getShort(cursor), 11, 4);
                        float v = px_1.dg(commands.getShort(cursor + 2), 11, 4);
                        cursor += 4;
                        float scaleU = material.Tu0;
                        float scaleV = scaleU > 0.0F ? material.gc : 0.0F;
                        if (scaleU > 0.0F && scaleV > 0.0F) {
                            u = (scaleU / (float) material.UU) * u / ((float) material.CoM6 + 1.0F);
                            v = -(scaleV / (float) material.UL) * v / ((float) material.tK + 1.0F);
                        } else {
                            u = (1.0F / (float) material.UU) * u / ((float) material.CoM6 + 1.0F);
                            v = -(1.0F / (float) material.UL) * v / ((float) material.tK + 1.0F);
                        }
                        vertex.Er.x = u;
                        vertex.Er.y = v;
                        vertex.hI = true;
                        break;
                    }
                    case 33: {
                        int packed = commands.getInt(cursor);
                        cursor += 4;
                        float x = px_1.dg((short) (packed & 1023), 0, 9);
                        float y = px_1.dg((short) ((packed >> 10) & 1023), 0, 9);
                        float z = px_1.dg((short) ((packed >> 20) & 1023), 0, 9);
                        vertex.X70.x = x;
                        vertex.X70.y = y;
                        vertex.X70.z = z;
                        vertex.jJ0 = true;
                        break;
                    }
                    case 32: {
                        long packed = commands.getInt(cursor);
                        cursor += 4;
                        if (colors) {
                            float r = (float) (packed & 31L) / 31.0F;
                            float g = (float) ((packed >> 5) & 31L) / 31.0F;
                            float b = (float) ((packed >> 10) & 31L) / 31.0F;
                            vertex.EN.set(r, g, b, 1.0F);
                            vertex.TZ = true;
                        }
                        break;
                    }
                    case 28: {
                        float x = px_1.f8(commands.getInt(cursor));
                        float y = px_1.f8(commands.getInt(cursor + 4));
                        float z = px_1.f8(commands.getInt(cursor + 8));
                        cursor += 12;
                        wV current = stack.Bw;
                        Matrix4 translation = PL0.Yp0(x, y, z);
                        Matrix4.md0(current.EW, translation.EW);
                        break;
                    }
                    case 27: {
                        float x = px_1.f8(commands.getInt(cursor));
                        float y = px_1.f8(commands.getInt(cursor + 4));
                        float z = px_1.Ei0(commands.getInt(cursor + 8));
                        cursor += 12;
                        wV current = stack.Bw;
                        Matrix4 scaling = PL0;
                        scaling.F();
                        float[] values = scaling.EW;
                        values[0] = x;
                        values[5] = y;
                        values[10] = z;
                        Matrix4.md0(current.EW, values);
                        break;
                    }
                    case 26:
                        PL0.F();
                        commands.position(cursor);
                        cursor = readMatrix(commands, PL0, cursor, 3, 3);
                        Matrix4.md0(stack.Bw.EW, PL0.EW);
                        break;
                    case 25:
                        commands.position(cursor);
                        PL0.F();
                        cursor = readMatrix(commands, PL0, cursor, 4, 3);
                        Matrix4.md0(stack.Bw.EW, PL0.EW);
                        break;
                    case 24:
                        commands.position(cursor);
                        PL0.F();
                        cursor = readMatrix(commands, PL0, cursor, 4, 4);
                        Matrix4.md0(stack.Bw.EW, PL0.EW);
                        break;
                    case 23:
                        commands.position(cursor);
                        cursor = readMatrix(commands, stack.Bw, cursor, 4, 3);
                        break;
                    case 22:
                        commands.position(cursor);
                        cursor = readMatrix(commands, stack.Bw, cursor, 4, 4);
                        break;
                    case 21:
                        stack.Bw.F();
                        break;
                    case 20: {
                        int index = commands.getInt(cursor) & 31;
                        cursor += 4;
                        stack.Bw.GJ(stack.Ub[index]);
                        if (skinned) {
                            float bone = stack.Bw.zo0;
                            float weight = stack.Bw.X80;
                            vertex.wG0.x = bone;
                            vertex.wG0.y = weight;
                            vertex.nh0 = true;
                        }
                        break;
                    }
                    case 65: {
                        tf0_0 type = ((tf0_0[]) tf0_0.pe0.clone())[primitive];
                        piece.ee0 += vertex.gp0;
                        UJ0 destination = piece.V60;
                        UJ0 source = vertex.UA0;
                        destination.getClass();
                        float[] values = source.iS;
                        int count = source.Or;
                        destination.KN(0, count, values);
                        piece.yQ = vertex.nh0;
                        piece.iS = vertex.TZ;
                        piece.pC0 = vertex.jJ0;
                        piece.LPt4 = vertex.hI;
                        piece.ZK0.Ue0(new Nu0(type, vertex.gp0));
                        vertex.gp0 = 0;
                        vertex.UA0.Or = 0;
                        int order = polygon.rg;
                        if (piece.dR < order) {
                            piece.dR = order;
                        }
                        break;
                    }
                    case 64:
                        primitive = commands.getInt(cursor);
                        cursor += 4;
                        break;
                    default:
                        System.out.println(new StringBuilder("UNK COMMAND ")
                                .append(new StringBuilder("0x").append(Integer.toHexString(command).toUpperCase()).toString())
                                .toString());
                        break;
                }
            }
        }
        return piece;
    }

    private static int readMatrix(ByteBuffer commands, Matrix4 matrix, int cursor, int columns, int rows) {
        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                matrix.EW[column * 4 + row] = px_1.f8(commands.getInt());
                cursor += 4;
            }
        }
        return cursor;
    }

    private static void emitPosition(jk0_0 vertex, tj0_1 stack) {
        C8 destination = t0;
        C8 position = Ut;
        destination.getClass();
        float x = position.x;
        float y = position.y;
        float z = position.z;
        destination.x = x;
        destination.y = y;
        destination.z = z;
        vertex.Vl0(stack, destination);
    }
}
