package cn.pokemmo.ui.window.settings;

import f.*;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * UI主题色与地图四季调色盘窗口
 *
 * 原混淆类: f.wt_0
 */
public class ColorPickerWindow extends R90 {
    public final wt_0 asBridge() {
        return (wt_0) (Object) this;
    }

    public static final dl_1 lpt7;
    public static final cf_2 d50;
    public static final ArrayList zU;
    public static boolean vJ;
    public static boolean O8;
    public static boolean Vm0;
    public static boolean Kr;
    public static boolean df;
    public static int s6;
    public static gp_1 VV;
    public am_2 i1;
    public int Cb0;
    public int AQ;
    public Texture c2;
    public Texture lI;
    public Texture We;
    public Texture S70;
    public qj_2[] Si0;
    public qj_2[] dB0;
    public j1_0 Uw0;
    public j1_0 Hb0;
    public i4_0 AC0;
    public tk0_0 Sc0;
    public int[] k1;
    public int[] uM;
    public final X6 C0;
    public BM vl;
    public final es_1 Sr0;
    public final es_1 si;
    public int Dw0;
    public int nt0;
    public byte qr;
    public boolean D90;
    public boolean[] QC0;

    static {
        lpt7 = Cq0.E1(wt_0.class);
        d50 = new cf_2();
        zU = new ArrayList();
        vJ = true;
        O8 = false;
        Vm0 = false;
        Kr = false;
        s6 = -1;
    }

    public ColorPickerWindow(BM material, Ou0 scene, int tileset, int texture, int palette) {
        Sr0 = new es_1();
        si = new es_1();
        D90 = true;
        uf("maptextureview");
        if (VV == null) {
            gp_1 serializer = new gp_1();
            VV = serializer;
            serializer.GI0(sg_1.u80);
            dI0();
        }
        X6 season = new X6(new pg0_2(new String[] { "Spring", "Summer", "Autumn", "Winter" }));
        C0 = season;
        season.Bd(c8_0.A90().YG());
        season.Rm0(() -> C2(material, scene, tileset, texture, palette));
        aM(tw0_0.e60.yY(), material, scene, tileset, texture, palette);
        ff0(1);
    }

    public final tk0_0 AR(cn_0 format, String name, int offset) {
        tk0_0 panel = new tk0_0(new A40());
        A40 layout = panel.gg0;
        layout.FU.ys0(3.0F).J90 = new vl0_0(15.0F);
        j1_0 cell = layout.yu0(0);
        cell.sn0 = new vl0_0(80.0F);
        cell.Wa0();
        layout.yu0(1).rs0 = 1.0F;
        format.xe0();
        cn_0 label = new cn_0();
        label.Sk("Format: ");
        layout.vx0(label).Rr0.vx0(format).Wa0().Rr0.Rg();
        label = new cn_0();
        label.Sk("Editing: ");
        cell = layout.vx0(label).Wa0();
        cell.rs0 = 1.0F;
        label = new cn_0();
        label.Sk(hx_1.LPt2(30, name));
        cell.Rr0.vx0(label).Rr0.Rg();
        if (Kr) {
            label = new cn_0();
            label.Sk("Tileset ID: ");
            cell = layout.vx0(label);
            label = new cn_0();
            label.Sk(String.valueOf(Dw0));
            cell.Rr0.vx0(label).Wa0().Rr0.Rg();
            label = new cn_0();
            label.Sk("Texture ID: ");
            cell = layout.vx0(label);
            label = new cn_0();
            label.Sk(String.valueOf(Cb0));
            cell.Rr0.vx0(label).Wa0().Rr0.Rg();
            label = new cn_0();
            label.Sk("Palette ID: ");
            cell = layout.vx0(label);
            label = new cn_0();
            label.Sk(String.valueOf(AQ));
            cell.Rr0.vx0(label).Wa0().Rr0.Rg();
            label = new cn_0();
            label.Sk("Offset: ");
            cell = layout.vx0(label);
            label = new cn_0();
            label.Sk(String.valueOf(offset));
            cell.Rr0.vx0(label).Wa0().Rr0.Rg();
        }
        return panel;
    }

    public final tk0_0 lPT7(Ou0 scene, pv_0 texture, gb_0 palette) {
        tk0_0 panel = new tk0_0(new A40());
        panel.uf("section");
        A40 layout = panel.gg0;
        ((A40) layout.rx0(10.0F)).qf(10.0F);
        pg0_2 options = new pg0_2();
        String[] initial = { "None" };
        int first = options.w7.size();
        List<String> values = Arrays.asList(initial);
        options.w7.addAll(first, values);
        options.su(first, values.size() + first - 1);
        sd0_1 names = d50.eL0();
        names.getClass();
        while (names.hasNext()) {
            options.Ii((String) names.next());
        }
        X6 presets = new X6();
        presets.r30(options);
        presets.Rm0(() -> l5(presets));
        xe_1 save = new xe_1("S");
        save.yj0 = "Save";
        save.yB0();
        xe_1 add = uz0_0.nJ(save, () -> h40(presets), "+");
        xe_1 remove = uz0_0.nJ(add, () -> yQ(options, presets), "-");
        remove.RR(() -> N60(presets, options));
        W9 unused = new W9();
        unused.ER.lK0(vJ);
        unused.RR(() -> Jm0(unused));
        W9 compressed = new W9();
        compressed.ER.lK0(O8);
        compressed.RR(() -> xO(compressed));
        xe_1 clear = new xe_1("Clear");
        xe_1 copy = uz0_0.nJ(clear, () -> sq0(presets), "Copy");
        xe_1 paste = uz0_0.nJ(copy, () -> LPt2(unused), "Paste");
        paste.RR(() -> aJ0(scene, texture, palette));
        tk0_0 presetRow = new tk0_0(new A40());
        presetRow.gg0.es("Preset: ").Rr0.vx0(presets).goto$().Rr0.vx0(save)
                .Rr0.vx0(add).Rr0.vx0(remove).Rr0.Rg();
        j1_0 cell = layout.vx0(presetRow).goto$();
        cell.d80 = 5;
        cell.Rr0.Rg();
        cell = layout.es("Copy Unused: ").GD().Rr0.vx0(unused).Wa0().Rr0.vx0(copy);
        cell.rs0 = 1.0F;
        cell = cell.Rr0.vx0(clear);
        cell.rs0 = 1.0F;
        cell = cell.Rr0.vx0(paste);
        cell.rs0 = 1.0F;
        cell = cell.Rr0.Rg();
        cell.getClass();
        cell.Yg = new vl0_0(5.0F);
        W9 preview = new W9();
        preview.ER.lK0(Vm0);
        preview.RR(() -> cm(preview));
        layout.es("Show Preview").GD().Rr0.vx0(preview).Wa0();
        cell = layout.es("Paste Compressed");
        cell.d80 = 2;
        cell.GD().Rr0.vx0(compressed).Rr0.Rg();
        W9 overwrite = new W9();
        overwrite.ER.lK0(df);
        overwrite.RR(() -> Nv0(overwrite));
        overwrite.yj0 = "Allows overwriting of existing color swaps when copying";
        overwrite.yB0();
        cell = layout.es("Allow Overwrite").Rr0.vx0(overwrite).Wa0();
        cell.d80 = 4;
        cell.Rr0.Rg();
        le0_2 previewPanel = Vm0 ? Wa0() : new le0_2(null, false);
        cell = layout.vx0(previewPanel);
        Uw0 = cell;
        cell.d80 = 5;
        cell = cell.Rr0.Rg();
        cell.getClass();
        cell.Yg = new vl0_0(15.0F);
        presets.Bd(s6);
        return panel;
    }

    public final tk0_0 Wa0() {
        tk0_0 panel = new tk0_0(new A40());
        A40 layout = panel.gg0;
        j1_0 cell = layout.es("Source");
        cell.d80 = 2;
        cell.Rr0.Rg();
        dB0 = new qj_2[zU.size()];
        for (int pass = 0; pass < 2; pass++) {
            C80 colors = new C80();
            int index = 0;
            for (Object value : zU) {
                YZ swap = (YZ) value;
                LPT6_ region = new LPT6_(S70);
                region.lpT6(0, 0, 1, 1);
                qj_2 button = new qj_2("", 24, 24);
                button.tp0.r8(new LPT6_[] { region });
                button.tp0.OA0 = true;
                button.tp0.IF = 24;
                button.tp0.gx0 = 24;
                button.uf("color-button");
                button.tp0.wx0(new gn_0(pass == 0 ? swap.argb : swap.argb_swap));
                int selected = index;
                button.RR(() -> Wd(selected, button));
                dB0[index] = button;
                colors.Xf0(button);
                index++;
            }
            if (pass == 1) {
                cell = layout.es("Target");
                cell.d80 = 2;
                cell.Rr0.Rg();
            }
            cell = layout.vx0(colors);
            cell.d80 = 2;
            cell.Rr0.Rg();
        }
        return panel;
    }

    public final void Ob(Ou0 scene, pv_0 texture, gb_0 palette, int index) {
        tk0_0 panel = new tk0_0(new A40());
        A40 layout = panel.gg0;
        cg_0 hex = new cg_0(null, new wn0_0());
        hex.Gv(String.format("%08X", iq(k1[index])));
        cn_0 label = new cn_0(null, 0);
        label.Sk("RGB565 Compressed Color: ");
        w10_0 picker = new w10_0(new L());
        picker.cS(new gn_0(k1[index]).ls());
        if (!picker.xm) {
            picker.xm = true;
            picker.LPT8 = true;
            picker.COm3();
        }
        if (!picker.qc0) {
            picker.qc0 = true;
            picker.LPT8 = true;
            picker.COm3();
        }
        if (!picker.Wy0) {
            picker.Wy0 = true;
            picker.LPT8 = true;
            picker.COm3();
        }
        if (!picker.RE) {
            picker.RE = true;
            picker.LPT8 = true;
            picker.COm3();
        }
        if (!picker.OR) {
            picker.OR = true;
            picker.LPT8 = true;
            picker.COm3();
        }
        if (!picker.Sc) {
            picker.Sc = true;
            picker.LPT8 = true;
            picker.COm3();
        }
        xe_1 compress = new xe_1("Compress Current");
        xe_1 preset = uz0_0.nJ(compress, () -> Ys0(index, picker), "Restore Preset");
        xe_1 original = uz0_0.nJ(preset, () -> f1(index, picker, scene, texture, palette), "Restore Original");
        original.RR(() -> RK(index, picker, scene, texture, palette));
        Runnable listener = () -> xw0(picker, index, scene, texture, palette);
        picker.jm0 = (Runnable[]) a7_0.gE(picker.jm0, listener, Runnable.class);
        panel.uf("color-picker");
        layout.rx0(5.0F);
        layout.FU.ys0(2.0F);
        layout.vx0(label).Rr0.vx0(hex).Rr0.Rg();
        tk0_0 buttons = new tk0_0(new A40());
        buttons.gg0.vx0(preset).Rr0.vx0(original).Rr0.vx0(compress).goto$();
        j1_0 cell = layout.vx0(buttons);
        cell.d80 = 2;
        cell.rs0 = 1.0F;
        cell.Rr0.Rg();
        layout.vx0(picker).d80 = 2;
        tt0_0 root = tt0_0.j0;
        le0_2 previous = root.Mu;
        if (previous != null) {
            root.Ol.sj0(previous, true);
        }
        root.Ol.Ue0(panel);
        root.Mu = panel;
        root.n90();
    }

    public final void To0(int index, int color, boolean compress) {
        int[] colors = k1;
        if (compress) {
            color = iq(color);
        }
        colors[index] = color;
        i4_0 pixels = lI.getTextureData().JX();
        Color rgba = new Color();
        Color.argb8888ToColor(rgba, k1[index]);
        pixels.getClass();
        int value = Color.rgba8888(rgba.r, rgba.g, rgba.b, rgba.a);
        pixels.Je0 = value;
        pixels.XF.XS(index % 8, index / 8, value);
        lI.load(lI.getTextureData());
    }

    public final void SA0(Ou0 scene, pv_0 texture, gb_0 palette, boolean changed) {
        am_2 data = i1;
        int[] colors = k1;
        data.getClass();
        i4_0 pixels = am_2.Rd(texture, colors);
        c2.load(new S60(pixels, null, false, false));
        pixels.dispose();
        long type = PRN_.Ly;
        if (vl.tM(type) && changed) {
            vl.fR(type);
        }
        I2 linked = Sr0.ZD();
        while (linked.hasNext()) {
            BM material = (BM) linked.next();
            if (material == null) {
                continue;
            }
            int id = scene.FC0.En(material.mi);
            pixels = am_2.Rd((pv_0) (be0_1) i1.ib0.Ks.get(id), k1);
            Texture replacement = new Texture(pixels);
            pixels.dispose();
            mz_2 attribute = (mz_2) material.sg(mz_2.g7);
            if (changed) {
                ((Texture) attribute.I3.uj).dispose();
            }
            attribute.I3.uj = replacement;
        }
        I2 maps = tw0_0.LD0.Sc.qf.ZD();
        while (maps.hasNext()) {
            nv0_0 map = (nv0_0) maps.next();
            if (Dw0 >= 1000) {
                I2 buildings = map.yf0.ZD();
                while (buildings.hasNext()) {
                    Ou0 building = (Ou0) buildings.next();
                    if (building.AD != Dw0 - 1000) {
                        continue;
                    }
                    if ((es_1) building.FC0.F3.Wk0(palette.a00) == null) {
                        continue;
                    }
                    I2 names = ((es_1) building.FC0.F3.Wk0(palette.a00)).ZD();
                    while (names.hasNext()) {
                        BM material = building.ff0((String) names.next());
                        int id = building.FC0.En(material.mi);
                        pixels = am_2.Rd((pv_0) (be0_1) i1.ib0.Ks.get(id), k1);
                        Texture replacement = new Texture(pixels);
                        pixels.dispose();
                        mz_2 attribute = (mz_2) material.sg(mz_2.g7);
                        if (changed) {
                            ((Texture) attribute.I3.uj).dispose();
                        }
                        attribute.I3.uj = replacement;
                    }
                }
            } else {
                if ((es_1) map.wp0.FC0.F3.Wk0(palette.a00) == null) {
                    continue;
                }
                I2 names = ((es_1) map.wp0.FC0.F3.Wk0(palette.a00)).ZD();
                while (names.hasNext()) {
                    BM material = map.wp0.ff0((String) names.next());
                    if (material == null) {
                        continue;
                    }
                    int id = map.wp0.FC0.En(material.mi);
                    pixels = am_2.Rd((pv_0) (be0_1) i1.ib0.Ks.get(id), k1);
                    Texture replacement = new Texture(pixels);
                    pixels.dispose();
                    mz_2 attribute = (mz_2) material.sg(mz_2.g7);
                    if (attribute == null) {
                        lpt7.info("attr null = {}", material.mi);
                        continue;
                    }
                    if (changed) {
                        ((Texture) attribute.I3.uj).dispose();
                    }
                    attribute.I3.uj = replacement;
                    u4_0 owner = map.wp0.FC0;
                    if (owner.vv0 == null) {
                        owner.vv0 = new es_1();
                    }
                    owner.vv0.Ue0(replacement);
                }
            }
        }
    }

    public final fy_2 r4(byte region, ol0_0 format, gb_0 palette, boolean[] used,
            es_1 matches, es_1 selections, W9 allSeasons, W9 partial) {
        es_1 labels = new es_1();
        int[] source = palette.yF0(format);
        int count = region == 3 ? 74 : 106;
        if (Dw0 >= 1000) {
            if (region == 3) count = 589;
            else if (region == 4) count = 339;
        }
        for (int asset = 0; asset < count; asset++) {
            String buildingName = "";
            int id;
            am_2 data;
            if (Dw0 >= 1000) {
                int buildingId = asset + 1000;
                ku_0 building;
                if (region == 3) building = tw0_0.Ll0.nC0.be.Vk0(asset);
                else if (region == 4) building = tw0_0.Ll0.t1.BJ0.Vk0(asset);
                else return new fy_2();
                data = building.QB;
                if (data == null) continue;
                buildingName = building.KV[0].QW;
                id = buildingId;
            } else {
                if (region == 3) data = tw0_0.Ll0.nC0.EL0(MG0.lpt6, asset);
                else if (region == 4) data = tw0_0.Ll0.t1.EL0(MG0.lpt6, asset);
                else return new fy_2();
                id = asset;
            }
            I2 palettes = data.CoM5.Ks.ZD();
            candidates:
            while (palettes.hasNext()) {
                gb_0 candidate = (gb_0) palettes.next();
                int[] colors = candidate.yF0(format);
                if (colors.length != source.length) continue;
                boolean equal = true;
                boolean isPartial = false;
                int matched = 0;
                for (int i = 0; i < source.length; i++) {
                    if (source[i] != colors[i]) {
                        equal = false;
                        break;
                    }
                }
                if (partial.ER.U20() && !equal) {
                    equal = true;
                    isPartial = true;
                    for (int i = 0; i < source.length; i++) {
                        int color = source[i];
                        if (!used[i]) continue;
                        boolean found = false;
                        for (int j = 0; j < source.length; j++) {
                            if (color == colors[j]) found = true;
                        }
                        if (!found) {
                            equal = false;
                            break;
                        }
                        matched++;
                    }
                }
                if (!equal) continue;
                for (int i = 0; i < matches.KB; i++) {
                    yn0_0 match = (yn0_0) matches.get(i);
                    if (match.SC0 == candidate.a00 && match.Xf0 == id) {
                        String prefix = Dw0 >= 1000 ? xq_1.pz0("building (", buildingName, ") = ") : "tileset = ";
                        cn_0 label = (cn_0) labels.get(i);
                        StringBuilder text = new StringBuilder();
                        text.append(((cn_0) labels.get(i)).j50.toString()).append("\n");
                        String partialText = isPartial ? "[!Partial " + matched + " / " + source.length + " ] " : "";
                        label.Sk(text.append(partialText).append(prefix).append(asset).append(" name = ")
                                .append(candidate.QW).append(" offset = ").append(candidate.a00).toString());
                        continue candidates;
                    }
                }
                matches.Ue0(new yn0_0(id, candidate.a00));
                W9 selection = new W9();
                selection.ER.lK0(true);
                if (!candidate.QW.equalsIgnoreCase(palette.QW) && partial.ER.U20()) {
                    selection.ER.lK0(false);
                }
                String prefix = Dw0 >= 1000 ? xq_1.pz0("building (", buildingName, ") = ") : "tileset = ";
                selections.Ue0(selection);
                StringBuilder text = new StringBuilder();
                String partialText = isPartial ? "[!Partial " + matched + " / " + source.length + " ] " : "";
                String description = text.append(partialText).append(prefix).append(asset).append(" name = ")
                        .append(candidate.QW).append(" offset = ").append(candidate.a00).toString();
                cn_0 label = new cn_0(null, 0);
                label.Sk(description);
                labels.Ue0(label);
            }
        }
        fy_2 list = new fy_2();
        Hm0 horizontal = new Hm0(list);
        I7 vertical = new I7(list);
        for (int i = 0; i < labels.KB; i++) {
            horizontal.X20(list.C7(new le0_2[] { (le0_2) selections.get(i), (le0_2) labels.get(i) }));
            vertical.X20(list.hb(new le0_2[] { (le0_2) selections.get(i), (le0_2) labels.get(i) }));
        }
        list.WQ(horizontal);
        list.x40(vertical);
        lo0_0 scroll = new lo0_0(list);
        fy_2 panel = new fy_2();
        ka0_1 seasons = new ka0_1(new le0_2[] { allSeasons, I5.df(null, 0, "All Seasons") });
        panel.x40(panel.C7(new le0_2[] { scroll, seasons }));
        panel.WQ(panel.hb(new le0_2[] { scroll, seasons }));
        return panel;
    }

    public static void dI0() {
        os0_0 files = lg_0.I70;
        String path = "./config/palettes.presets";
        files.getClass();
        VE file = new VE(path, zv_1.kE);
        if (!file.os0()) {
            return;
        }
        Y1 parser = new Y1();
        InputStream input = file.uf0();
        InputStreamReader reader;
        try {
            reader = new InputStreamReader(input, "UTF-8");
        } catch (Exception exception) {
            throw new WC0("Error reading stream.", exception);
        }
        oe_0 root = parser.D30(reader);
        root.getClass();
        ok_2 iterator = new ok_2(root);
        while (iterator.hasNext()) {
            oe_0 entry = (oe_0) iterator.next();
            d50.n3(entry.Z3, VV.b20(ArrayList.class, YZ.class, entry));
        }
    }

    public static int iq(int color) {
        color = color << 8 | color >>> 24;
        int red = ((color & 0xff000000) >> 27 << 11) & 63488;
        int green = ((color & 16711680) >> 18 << 5) & 2016;
        int blue = ((color & 65280) >> 11) & 31;
        int packed = red | green | blue;
        red = (packed & 63488) >>> 11;
        green = (packed & 2016) >>> 5;
        blue = packed & 31;
        red = (int) Math.floor((double) red * 255.0 / 31.0 + 0.5);
        green = (int) Math.floor((double) green * 255.0 / 63.0 + 0.5);
        blue = (int) Math.floor((double) blue * 255.0 / 31.0 + 0.5);
        return (red & 255) << 16 | 0xff000000 | (green & 255) << 8 | blue & 255;
    }

    public static void Nv0(W9 checkbox) {
        df = checkbox.ER.U20();
    }

    public static void xO(W9 checkbox) {
        O8 = checkbox.ER.U20();
    }

    public static void Jm0(W9 checkbox) {
        vJ = checkbox.ER.U20();
    }

    public static void ZC() {
        os0_0 files = lg_0.I70;
        String path = "./config/palettes.presets";
        files.getClass();
        VE file = new VE(path, zv_1.kE);
        x9_0 writer = new x9_0(file.Fm(null));
        VV.Zx(writer);
        VV.cQ();
        sd0_1 keys = d50.eL0();
        keys.getClass();
        while (keys.hasNext()) {
            String name = (String) keys.next();
            VV.A2(name, d50.vC(name, null), ArrayList.class, YZ.class);
        }
        VV.d10();
        try {
            writer.close();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static am_2 IQ(byte region, int id) {
        if (id >= 1000) {
            if (region == 3) return tw0_0.Ll0.nC0.be.Vk0(id - 1000).QB;
            if (region == 4) return tw0_0.Ll0.t1.BJ0.Vk0(id - 1000).QB;
            return null;
        }
        if (region == 3) return tw0_0.Ll0.nC0.EL0(MG0.lpt6, id);
        if (region == 4) return tw0_0.Ll0.t1.EL0(MG0.lpt6, id);
        return null;
    }

    public final void xw0(V7 picker, int index, Ou0 scene, pv_0 texture, gb_0 palette) {
        picker.getClass();
        gn_0 color = new gn_0(picker.u20);
        Color rgba = new Color((color.cv & 255) / 255.0F, (color.x8 & 255) / 255.0F,
                (color.sh & 255) / 255.0F, (color.FY & 255) / 255.0F);
        To0(index, Color.argb8888(rgba), false);
        SA0(scene, texture, palette, true);
    }

    public final void RK(int index, V7 picker, Ou0 scene, pv_0 texture, gb_0 palette) {
        k1[index] = uM[index];
        gn_0 color = new gn_0(k1[index]);
        picker.getClass();
        picker.cS(color.ls());
        To0(index, k1[index], false);
        SA0(scene, texture, palette, true);
    }

    public final void f1(int index, V7 picker, Ou0 scene, pv_0 texture, gb_0 palette) {
        if (jj0_2.cy(qr, C0.mu0.Mw0, Dw0, nt0)) {
            int[] colors = jj0_2.SC0(qr, i1, C0.mu0.Mw0, Dw0, Cb0, nt0);
            if (colors != null) {
                k1[index] = colors[index];
                gn_0 color = new gn_0(k1[index]);
                picker.getClass();
                picker.cS(color.ls());
                To0(index, k1[index], false);
                SA0(scene, texture, palette, true);
            }
        }
    }

    public final void Ys0(int index, V7 picker) {
        k1[index] = iq(k1[index]);
        picker.getClass();
        if (new gn_0(picker.u20).ls() != k1[index]) {
            picker.cS(new gn_0(k1[index]).ls());
        }
    }

    public final void Wd(int index, qj_2 button) {
        EP menu = new EP();
        menu.mA0("Remove", () -> md(index));
        UA.rL(menu, button, button.A20, button.SB0 + button.OB);
    }

    public final void md(int index) {
        zU.remove(index);
        j1_0 container = Uw0;
        container.tv0(Vm0 ? Wa0() : new le0_2(null, false));
    }

    public final void cm(W9 checkbox) {
        boolean preview = checkbox.ER.U20();
        Vm0 = preview;
        j1_0 container = Uw0;
        container.tv0(preview ? Wa0() : new le0_2(null, false));
    }

    public final void aJ0(Ou0 scene, pv_0 texture, gb_0 palette) {
        for (Object value : zU) {
            YZ swap = (YZ) value;
            for (int i = 0; i < k1.length; i++) {
                if (uM[i] == swap.argb) {
                    To0(i, swap.argb_swap, O8);
                }
            }
        }
        SA0(scene, texture, palette, true);
    }

    public final void LPt2(W9 includeUnused) {
        colors:
        for (int i = 0; i < k1.length; i++) {
            int original = uM[i];
            for (Object value : zU) {
                YZ swap = (YZ) value;
                if (swap.argb == original) {
                    if (df) {
                        swap.argb_swap = k1[i];
                    }
                    continue colors;
                }
            }
            if (k1[i] != original && (includeUnused.ER.U20() || QC0[i])) {
                YZ swap = new YZ();
                swap.argb = original;
                swap.argb_swap = k1[i];
                zU.add(swap);
            }
        }
        j1_0 container = Uw0;
        container.tv0(Vm0 ? Wa0() : new le0_2(null, false));
    }

    public final void sq0(X6 presets) {
        zU.clear();
        presets.Bd(-1);
        j1_0 container = Uw0;
        container.tv0(Vm0 ? Wa0() : new le0_2(null, false));
    }

    public final void N60(X6 presets, pg0_2 options) {
        String name = (String) presets.Vh0();
        options.Va(presets.mu0.Mw0);
        presets.Bd(-1);
        d50.qq0(name);
        ZC();
    }

    public final void yQ(pg0_2 options, X6 presets) {
        tk0_0 panel = new tk0_0(new A40());
        A40 layout = panel.gg0;
        cg_0 name = new cg_0(null, new wn0_0());
        layout.es("Preset Name: ").Rr0.Rg();
        layout.vx0(name);
        tt0_0 root = tt0_0.j0;
        lpt3__4 dialog = new lpt3__4(panel, () -> rw0(name, options, presets), null, xX.Bm);
        root.F9(root.fU(), dialog);
    }

    public final void rw0(cg_0 name, pg0_2 options, X6 presets) {
        cf_2 values = d50;
        if (values.Vd(((wn0_0) name.dI0).YA.toString())) {
            tk0_0 panel = new tk0_0(new A40());
            panel.gg0.es("Preset already exists, overwrite?");
            Qy0 root = Qy0.yI0;
            lpt3__4 dialog = new lpt3__4(panel, () -> Mp0(name), null, xX.Bm);
            root.F9(root.fU(), dialog);
        } else {
            values.n3(((wn0_0) name.dI0).YA.toString(), (ArrayList) zU.clone());
            String[] added = { ((wn0_0) name.dI0).YA.toString() };
            int index = options.w7.size();
            List<String> list = Arrays.asList(added);
            options.w7.addAll(index, list);
            options.su(index, list.size() + index - 1);
            presets.Bd(options.w7.size() - 1);
            ZC();
        }
    }

    public final void Mp0(cg_0 name) {
        d50.n3(((wn0_0) name.dI0).YA.toString(), (ArrayList) zU.clone());
        ZC();
    }

    public final void h40(X6 presets) {
        if (presets.mu0.Mw0 > 0) {
            d50.n3(presets.Vh0(), (ArrayList) zU.clone());
            ZC();
        }
    }

    public final void l5(X6 presets) {
        int index = presets.mu0.Mw0;
        s6 = index;
        if (index <= 0) {
            return;
        }
        ArrayList values = zU;
        values.clear();
        if (presets.mu0.Mw0 > 0) {
            values.addAll((Collection) d50.vC(presets.Vh0(), null));
        }
        j1_0 container = Uw0;
        container.tv0(Vm0 ? Wa0() : new le0_2(null, false));
    }

    public final void qg0(byte region, int tileset, ol0_0 format, int paletteIndex, W9 partial,
            BM material, Ou0 scene, int texture) {
        am_2 data = IQ(region, tileset);
        if (data == null) {
            return;
        }
        es_1 matches = new es_1();
        es_1 selections = new es_1();
        W9 allSeasons = new W9();
        gb_0 palette = (gb_0) (be0_1) data.CoM5.Ks.get(paletteIndex);
        fy_2 panel = r4(region, format, palette, QC0, matches, selections, allSeasons, partial);
        Qy0 root = Qy0.yI0;
        lpt3__4 dialog = new lpt3__4(panel,
                () -> JF0(selections, matches, allSeasons, region, material, scene, tileset, texture, paletteIndex), null, xX.Bm);
        root.F9(root.fU(), dialog);
        panel.qA(0).RY(400, 300);
    }

    public final void JF0(es_1 selections, es_1 matches, W9 allSeasons, byte region,
            BM material, Ou0 scene, int tileset, int texture, int paletteIndex) {
        int index = 0;
        I2 iterator = selections.ZD();
        while (iterator.hasNext()) {
            W9 selection = (W9) iterator.next();
            if (selection.ER.U20()) {
                yn0_0 match = (yn0_0) matches.get(index);
                if (allSeasons.ER.U20()) {
                    for (int season = 0; season < 4; season++) {
                        jj0_2.MY(region, season, match.Xf0, match.SC0);
                    }
                } else {
                    jj0_2.MY(region, C0.mu0.Mw0, match.Xf0, match.SC0);
                }
            }
            index++;
        }
        aM(region, material, scene, tileset, texture, paletteIndex);
        jj0_2.Hj0();
    }

    public final void Sh0(byte region, int tileset, ol0_0 format, int paletteIndex, W9 partial, int texture) {
        am_2 data = IQ(region, tileset);
        if (data == null) {
            return;
        }
        es_1 matches = new es_1();
        es_1 selections = new es_1();
        W9 allSeasons = new W9();
        gb_0 palette = (gb_0) (be0_1) data.CoM5.Ks.get(paletteIndex);
        fy_2 panel = r4(region, format, palette, QC0, matches, selections, allSeasons, partial);
        Qy0 root = Qy0.yI0;
        lpt3__4 dialog = new lpt3__4(panel,
                () -> sv0(selections, matches, region, format, allSeasons, tileset, texture), null, xX.Bm);
        root.F9(root.fU(), dialog);
        panel.qA(0).RY(400, 300);
    }

    public final void sv0(es_1 selections, es_1 matches, byte region, ol0_0 format,
            W9 allSeasons, int tileset, int texture) {
        int index = 0;
        I2 iterator = selections.ZD();
        while (iterator.hasNext()) {
            W9 selection = (W9) iterator.next();
            if (selection.ER.U20()) {
                yn0_0 match = (yn0_0) matches.get(index);
                am_2 data = IQ(region, match.Xf0);
                if (data == null) {
                    return;
                }
                aux__1 palettes = data.CoM5;
                int offset = match.SC0;
                be0_1 found = null;
                I2 entries = palettes.Ks.ZD();
                while (entries.hasNext()) {
                    be0_1 entry = (be0_1) entries.next();
                    if (entry.a00 == offset) {
                        found = entry;
                        break;
                    }
                }
                int[] original = ((gb_0) found).yF0(format);
                for (byte color = 0; color < original.length; color++) {
                    if (original[color] == k1[color]) {
                        continue;
                    }
                    if (allSeasons.ER.U20()) {
                        for (int season = 0; season < 4; season++) {
                            if (jj0_2.cy(region, season, tileset, nt0)) {
                                int[] replacement = jj0_2.SC0(region, i1, season, tileset, texture, nt0);
                                jj0_2.case$(region, season, match.Xf0, match.SC0, color, replacement[color]);
                            }
                        }
                    } else {
                        jj0_2.case$(region, C0.mu0.Mw0, match.Xf0, match.SC0, color, k1[color]);
                    }
                }
            }
            index++;
        }
        jj0_2.Hj0();
    }

    public final void EH(int tileset, byte region, BM material, Ou0 scene, int texture, int palette) {
        if (tileset >= 0) {
            jj0_2.MY(region, C0.mu0.Mw0, tileset, nt0);
            aM(region, material, scene, tileset, texture, palette);
            jj0_2.Hj0();
        }
    }

    public final void Cf(int tileset, boolean clear, byte region, byte resetTileset, int paletteIndex, ol0_0 format) {
        if (tileset < 0) {
            return;
        }
        if (clear) {
            jj0_2.MY(region, C0.mu0.Mw0, resetTileset & 255, nt0);
        }
        gb_0 palette = (gb_0) (be0_1) i1.CoM5.Ks.get(paletteIndex);
        int[] original = palette.yF0(format);
        for (byte i = 0; i < original.length; i++) {
            int replacement = k1[i];
            if (original[i] != replacement) {
                jj0_2.case$(region, C0.mu0.Mw0, tileset, palette.a00, i, replacement);
            }
        }
        jj0_2.Hj0();
    }

    public final void m30(pv_0 texture) {
        os0_0 files = lg_0.I70;
        String path = new StringBuilder("./dump/textures/").append(texture.QW).append(".png").toString();
        files.getClass();
        VE file = new VE(path, zv_1.kE);
        am_2 data = i1;
        int[] palette = k1;
        data.getClass();
        i4_0 pixels = am_2.Rd(texture, palette);
        F40.mu(file, pixels);
        pixels.dispose();
        Qy0.yI0.dk(-1, new StringBuilder("Exported to ").append(file.el()).toString());
    }

    public final void tq(Ou0 scene, pv_0 texture, gb_0 palette, int index) {
        Ob(scene, texture, palette, index);
    }

    public final void Nc(byte region, BM material, Ou0 scene, int tileset, int texture, int palette) {
        D90 = !D90;
        aM(region, material, scene, tileset, texture, palette);
    }

    public final void hs0(W9 checkbox, cn_0 format, String name) {
        Kr = checkbox.ER.U20();
        Hb0.tv0(AR(format, name, nt0));
    }

    public final void C2(BM material, Ou0 scene, int tileset, int texture, int palette) {
        aM(tw0_0.e60.Com4, material, scene, tileset, texture, palette);
    }

    public final void aM(byte region, BM material, Ou0 scene, int tileset, int textureIndex, int paletteIndex) {
        i1 = scene.FC0.Ak0;
        Dw0 = tileset;
        Cb0 = textureIndex;
        AQ = paletteIndex;
        vl = material;
        qr = region;
        byte oldTileset = (byte) tileset;
        dispose();
        pv_0 texture = (pv_0) (be0_1) i1.ib0.Ks.get(textureIndex);
        ol0_0 format = ((pv_0) (be0_1) i1.ib0.Ks.get(textureIndex)).bh0;
        int colorCount = format.cOn / 2;
        int rows = (int) Math.ceil((double) format.cOn / 2.0 / 8.0);
        AC0 = new i4_0(8, rows, ix0_0.Vw);
        i4_0 originalPixels = new i4_0(8, rows, ix0_0.Vw);
        gb_0 palette = (gb_0) (be0_1) i1.CoM5.Ks.get(paletteIndex);
        uM = palette.yF0(format);
        int offset = ((gb_0) (be0_1) i1.CoM5.Ks.get(paletteIndex)).a00;
        nt0 = offset;
        boolean legacy = false;
        if (jj0_2.cy(region, C0.mu0.Mw0, tileset, offset)) {
            k1 = jj0_2.SC0(region, i1, C0.mu0.Mw0, tileset, textureIndex, nt0);
        } else if (tileset >= 1000 && jj0_2.cy(region, C0.mu0.Mw0, oldTileset & 255, nt0)) {
            legacy = true;
            k1 = jj0_2.SC0(region, i1, C0.mu0.Mw0, oldTileset & 255, textureIndex, nt0);
        } else {
            k1 = Arrays.copyOf(uM, uM.length);
        }
        if (colorCount != k1.length) {
            lpt7.info("Palette size != actual size");
            colorCount = k1.length;
        }
        Sr0.clear();
        es_1 linked = (es_1) scene.FC0.F3.Wk0(palette.a00);
        String names = "";
        if (linked != null) {
            I2 iterator = linked.ZD();
            while (iterator.hasNext()) {
                String name = (String) iterator.next();
                names = new StringBuilder().append(names).append(name).append(" ").toString();
                if (!name.equalsIgnoreCase(material.mi)) {
                    Sr0.Ue0(scene.ff0(name));
                }
            }
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < k1.length; i++) {
            int color = k1[i];
            Color modified = new Color(color << 8 | color >>> 24);
            color = uM[i];
            Color original = new Color(color << 8 | color >>> 24);
            AC0.getClass();
            AC0.Je0 = Color.rgba8888(modified.r, modified.g, modified.b, modified.a);
            i4_0 pixels = AC0;
            pixels.XF.XS(x, y, pixels.Je0);
            int value = Color.rgba8888(original.r, original.g, original.b, original.a);
            originalPixels.Je0 = value;
            originalPixels.XF.XS(x, y, value);
            if (++x >= 8) {
                x = 0;
                y++;
            }
        }
        i4_0 white = new i4_0(1, 1, ix0_0.Vw);
        int whiteColor = Color.rgba8888(1.0F, 1.0F, 1.0F, 1.0F);
        white.Je0 = whiteColor;
        white.XF.XS(0, 0, whiteColor);
        S70 = new Texture(white);
        white.dispose();
        lI = new Texture(new S60(AC0, null, false, false));
        We = new Texture(new S60(originalPixels, null, false, false));
        originalPixels.dispose();
        tk0_0 previous = Sc0;
        if (previous != null) {
            previous.em();
            em();
        }
        tk0_0 panel = new tk0_0(new A40());
        Sc0 = panel;
        panel.NB = false;
        panel.LJ0 = false;
        A40 layout = panel.gg0;
        j1_0 cell = layout.vx0(C0);
        cell.sn0 = new vl0_0(300.0F);
        cell.rs0 = 1.0F;
        cell.Hb0 = 1;
        cell.Yg = new vl0_0(0.0F);
        cell.Ek0 = new vl0_0(0.0F);
        cell.ck0 = new vl0_0(5.0F);
        cell.J90 = new vl0_0(15.0F);
        cell.d80 = 2;
        cell.Rr0.Rg();
        i1.getClass();
        int capacity = texture.bh0.cOn / 2;
        boolean[] used = new boolean[capacity];
        byte[] indices = texture.break$();
        for (int pass = 0; pass < capacity; pass++) {
            ol0_0 currentFormat = texture.bh0;
            switch (TD0.yp0[currentFormat.FH]) {
                case 1:
                    for (int row = 0; row < texture.bR; row++) {
                        for (int column = 0; column < texture.kK0; column++) {
                            used[indices[row * texture.kK0 + column] & 31] = true;
                        }
                    }
                    break;
                case 2:
                case 3:
                case 4:
                    for (int row = 0; row < texture.bR; row++) {
                        for (int column = 0; column < texture.kK0; column++) {
                            int index = indices[row * texture.kK0 + column] & 255;
                            if (index >= 0 && index < capacity) used[index] = true;
                        }
                    }
                    break;
                case 5:
                    for (int row = 0; row < texture.bR; row++) {
                        for (int column = 0; column < texture.kK0; column++) {
                            used[indices[row * texture.kK0 + column] & 7] = true;
                        }
                    }
                    break;
                default:
                    am_2.I5.info("Unsupported format: {}", currentFormat.ei0);
            }
        }
        QC0 = used;
        if (legacy) {
            cn_0 warning = I5.df(null, 0, "!CORRUPTED ID RE-SAVE!");
            warning.z70 = new N1(new t5_0(warning), gn_0.RED);
            cell = Sc0.gg0.vx0(warning).Wa0();
            cell.rs0 = 1.0F;
            cell.d80 = 2;
            cell.Rr0.Rg();
        }
        cn_0 formatLabel = new cn_0(null, 0);
        W9 extra = new W9();
        extra.ER.lK0(Kr);
        String editingNames = names;
        extra.RR(() -> hs0(extra, formatLabel, editingNames));
        layout.es("Show Extra Info").Wa0().Rr0.vx0(extra).Wa0().Rr0.Rg();
        W9 unused = new W9();
        unused.ER.lK0(D90);
        unused.RR(() -> Nc(region, material, scene, tileset, textureIndex, paletteIndex));
        cn_0 unusedLabel = new cn_0(null, 0);
        unusedLabel.Sk("Hide unused palettes: ");
        layout.vx0(unusedLabel).Wa0().Rr0.vx0(unused).Wa0().Rr0.Rg();
        cell = layout.vx0(AR(formatLabel, names, nt0));
        Hb0 = cell;
        cell.d80 = 2;
        cell.Wa0().Rr0.Rg();
        cell = Sc0.gg0.vx0(I5.df(null, 0, "Original palette: ")).Wa0();
        cell.rs0 = 1.0F;
        cell.d80 = 2;
        cell.Rr0.Rg();
        for (int pass = 0; pass < 2; pass++) {
            if (pass == 1) {
                cell = Sc0.gg0.vx0(I5.df(null, 0, "Modified palette: ")).Wa0();
                cell.rs0 = 1.0F;
                cell.d80 = 2;
                cell.Rr0.Rg();
            }
            C80 colors = new C80();
            x = 0;
            y = 0;
            Si0 = new qj_2[colorCount];
            for (int i = 0; i < colorCount; i++) {
                LPT6_ swatch = new LPT6_(pass == 1 ? lI : We);
                swatch.lpT6(x, y, 1, 1);
                qj_2 button = new qj_2("", 24, 24);
                button.tp0.r8(new LPT6_[] { swatch });
                button.tp0.OA0 = true;
                button.tp0.IF = 24;
                button.tp0.gx0 = 24;
                button.uf("color-button");
                if (pass == 1) {
                    int index = i;
                    button.RR(() -> tq(scene, texture, palette, index));
                }
                if (D90 && !QC0[i]) {
                    button.Ll(false);
                }
                Si0[i] = button;
                colors.Xf0(button);
                if (++x >= 8) {
                    x = 0;
                    y++;
                }
            }
            cell = Sc0.gg0.vx0(colors);
            cell.rs0 = 1.0F;
            cell.Hb0 = 1;
            cell.d80 = 2;
            cell.Rr0.Rg().ys0(5.0F);
        }
        am_2 data = i1;
        int[] colors = k1;
        data.getClass();
        i4_0 pixels = am_2.Rd(texture, colors);
        c2 = new Texture(pixels);
        formatLabel.Sk(new StringBuilder().append(texture.bh0.toString()).append("( ")
                .append(pixels.rH0()).append(" )").toString());
        pixels.dispose();
        new LPT6_(lI).lpT6(x, y, 1, 1);
        int scale = 192 / c2.getWidth();
        hu_0 preview = new hu_0(asBridge(), c2.getWidth() * scale, c2.getHeight() * scale,
                scale, texture, scene, palette);
        preview.uf("color-button");
        preview.tp0.LX(new Texture[] { c2 });
        int width = c2.getWidth() * scale;
        int height = c2.getHeight() * scale;
        preview.tp0.OA0 = true;
        preview.tp0.IF = width;
        preview.tp0.gx0 = height;
        cell = Sc0.gg0.vx0(preview);
        cell.rs0 = 1.0F;
        cell.Hb0 = 1;
        cell.d80 = 2;
        cell.Rr0.Rg();
        xe_1 save = new xe_1("Save");
        xe_1 restore = new xe_1("Restore");
        xe_1 replaceAll = new xe_1("Replace All");
        xe_1 restoreAll = new xe_1("Restore All");
        xe_1 export = new xe_1("Export PNG");
        export.RR(() -> m30(texture));
        if (!scene.ST) {
            save.pw0(false);
            restore.pw0(false);
            replaceAll.pw0(false);
            restoreAll.pw0(false);
        }
        W9 partial = new W9();
        boolean legacyPalette = legacy;
        save.RR(() -> Cf(tileset, legacyPalette, region, oldTileset, paletteIndex, format));
        restore.RR(() -> EH(tileset, region, material, scene, textureIndex, paletteIndex));
        replaceAll.RR(() -> Sh0(region, tileset, format, paletteIndex, partial, textureIndex));
        restoreAll.RR(() -> qg0(region, tileset, format, paletteIndex, partial, material, scene, textureIndex));
        if (tw0_0.e60.N60().dw == 3 || tw0_0.e60.N60().dw == 4) {
            cell = Sc0.gg0.vx0(save);
            cell.rs0 = 1.0F;
            cell.Hb0 = 1;
            cell = Sc0.gg0.vx0(restore);
            cell.rs0 = 1.0F;
            cell.Hb0 = 1;
            cell.Rr0.Rg();
            ka0_1 partialRow = new ka0_1(new le0_2[] { partial, I5.df(null, 0, "Include Partial Results") });
            cell = Sc0.gg0.vx0(partialRow).Wa0();
            cell.d80 = 2;
            cell.jQ = new vl0_0(30.0F);
            cell.goto$().Rr0.Rg();
            cell = Sc0.gg0.vx0(replaceAll);
            cell.rs0 = 1.0F;
            cell.Hb0 = 1;
            cell = Sc0.gg0.vx0(restoreAll);
            cell.rs0 = 1.0F;
            cell.Hb0 = 1;
            cell.Rr0.Rg();
            cell = Sc0.gg0.vx0(export);
            cell.d80 = 2;
            cell.goto$().Rr0.Rg();
            cell = layout.vx0(lPT7(scene, texture, palette));
            cell.d80 = 2;
            cell.goto$().Rr0.Rg();
        }
        SA0(scene, texture, palette, false);
        tk0_0 content = Sc0;
        F9(fU(), content);
    }

    public final void dispose() {
        I2 textures = si.ZD();
        while (textures.hasNext()) {
            ((Texture) textures.next()).dispose();
        }
        Texture texture = S70;
        if (texture != null) {
            texture.dispose();
        }
        texture = lI;
        if (texture != null) {
            texture.dispose();
            lI = null;
        }
        texture = We;
        if (texture != null) {
            texture.dispose();
            We = null;
        }
        texture = c2;
        if (texture != null) {
            texture.dispose();
            c2 = null;
        }
        i4_0 pixels = AC0;
        if (pixels != null) {
            pixels.dispose();
            AC0 = null;
        }
    }

    @Override
    public final boolean nd0(i70_0 event) {
        E00.C10(event.zu);
        return super.nd0(event);
    }

    @Override
    public final void K8() {
        super.K8();
        Sc0.lt0();
    }

    @Override
    public final void Dw0(zk0_1 context) {
        super.Dw0(context);
    }
}
