package cn.pokemmo.ui.theme;

import f.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.stream.Collectors;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ThemeXmlLayoutLoader {
    public static final dl_1 ME0 = Cq0.E1(ThemeXmlLayoutLoader.class);
    public static final ThemeXmlLayoutLoader gm = new ThemeXmlLayoutLoader();
    public final ArrayList<C30> YI;
    public Locale Fu;

    public ThemeXmlLayoutLoader() {
        YI = new ArrayList<>();
        Fu = Locale.getDefault();
    }

    public static ThemeXmlLayoutLoader pI() {
        return gm;
    }

    public static void h00(Document document, Element root, byte region, int index, String text) {
        int id = index | region * 268435456;
        Element element = document.createElement("string");
        element.setAttribute("id", new StringBuilder().append(id).append("").toString());
        element.setTextContent(text.replaceAll("\\\n", "\\\\n"));
        root.appendChild(element);
    }

    public static void Ko(Document document, Element root, byte region, lpt6__2 archive,
                          int table, int block, int entry, String text) {
        Element element = document.createElement("string");
        element.setAttribute("table_id", new StringBuilder().append(table).append("").toString());
        element.setAttribute("block_id", new StringBuilder().append(block).append("").toString());
        element.setAttribute("entry_id", new StringBuilder().append(entry).append("").toString());
        element.setTextContent(text.replaceAll("\\\n", "\\\\n"));
        root.appendChild(element);
    }

    public static int qj(C30 first, C30 second) {
        ws_0 right = second.kl;
        byte rightPriority = right.NM;
        ws_0 left = first.kl;
        byte leftPriority = left.NM;
        if (rightPriority != leftPriority) return rightPriority - leftPriority;
        boolean leftOverride = left.Y20;
        boolean rightOverride = right.Y20;
        if (leftOverride != rightOverride) return Boolean.compare(leftOverride, rightOverride);
        return Boolean.compare(second.lF, first.lF);
    }

    public static boolean ZL(l50_0 resources) {
        String language = resources.pG0();
        for (lpt6__2 kind : lpt6__2.Qm.clone()) {
            xm_0 archive = resources.VB0(kind);
            if (archive.h8 != kind) continue;
            String name = new StringBuilder().append(resources.z40.ie).append("_")
                    .append(kind.UB0).append("_").append(language).append(".xml").toString();
            try {
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
                Element root = document.createElement("ds_strings_archive");
                root.setAttribute("lang", language);
                root.setAttribute("region_id", new StringBuilder().append(resources.Tz()).append("").toString());
                root.setAttribute("archive_type", new StringBuilder().append(kind.UB0).append("").toString());
                document.appendChild(root);
                sL0(resources, archive, (region, type, table, block, entry, text) ->
                        Ko(document, root, region, type, table, block, entry, text));
                write(document, name);
            } catch (Exception error) {
                ME0.error("dump error archive_type = {} region_id = {}",
                        new Object[]{kind.UB0, resources.Tz(), error});
                return false;
            }
        }
        return true;
    }

    public static void sL0(l50_0 resources, xm_0 archive, PK consumer) {
        byte region = resources.Tz();
        lpt6__2 type = archive.h8;
        for (int table = 0; table < archive.ul0.length; table++) {
            int block = 0;
            for (;;) {
                int mapped = archive.E1(table);
                int blocks = 0;
                if (mapped >= 0 && mapped < archive.ul0.length) {
                    if (archive.ul0[mapped] == null) archive.VJ0(mapped);
                    blocks = archive.ul0[mapped].length;
                }
                if (block >= blocks) break;
                int entry = 0;
                for (;;) {
                    mapped = archive.E1(table);
                    int entries = 0;
                    if (mapped >= 0 && mapped < archive.ul0.length) {
                        if (archive.ul0[mapped] == null) archive.VJ0(mapped);
                        if (block >= 0 && block < archive.ul0[mapped].length) {
                            entries = archive.ul0[mapped][block].length;
                        }
                    }
                    if (entry >= entries) break;
                    String text = archive.ra0(table, block, entry);
                    consumer.ip(region, type, table, block, entry, text);
                    entry++;
                }
                block++;
            }
        }
    }

    public static void CK0(qa0_1 archive, Eo0 consumer) {
        byte region = archive.rt0();
        TreeSet<Integer> ids = new TreeSet<>();
        G1 strings = archive.EZ.hG;
        if (strings == null) {
            for (Object value : fx_0.GN.values()) {
                br_2 candidate = (br_2) value;
                if (candidate.hG != null && candidate.Yw0 == archive.rt0()) {
                    strings = candidate.hG;
                    break;
                }
            }
        }
        if (strings == null) return;
        strings.xo(true);
        Y60 table = strings.nG;
        int[] keys;
        if (table == null) {
            keys = new int[0];
        } else {
            keys = new int[table.Rv];
            int[] values = table.kQ;
            byte[] states = table.Ut;
            int count = 0;
            for (int i = values.length; i-- > 0;) {
                if (states[i] == 1) keys[count++] = values[i];
            }
        }
        for (int key : keys) if (key >= 1) ids.add(key);
        for (Integer key : ids) {
            int id = key;
            String text = mz_1.TG0(id, false, archive, null).trim();
            if (!text.isEmpty()) consumer.ZE(region, id, text);
        }
    }

    public static boolean hS(qa0_1 archive) {
        String language = archive.EZ.FQ;
        String name = VG.Mq(new StringBuilder().append(archive.iq0.substring(0, 3)).append("_"), language, ".xml");
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element root = document.createElement("strings");
            root.setAttribute("lang", language);
            root.setAttribute("is_primary", "0");
            root.setAttribute("is_override", "0");
            document.appendChild(root);
            CK0(archive, (region, id, text) -> h00(document, root, region, id, text));
            write(document, name);
            return true;
        } catch (Exception error) {
            ME0.error("dump error", error);
            return false;
        }
    }

    private static void write(Document document, String name) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(document);
        os0_0 files = lg_0.I70;
        String path = new StringBuilder().append("dump/strings/dump_").append(name).toString();
        files.getClass();
        VE file = new VE(path, zv_1.kE);
        file.Br().A20();
        StreamResult result = new StreamResult(file.OC0());
        transformer.setOutputProperty("indent", "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.transform(source, result);
    }

    public static Locale Q(String language) {
        String country = "";
        String script = "";
        if (language.contains("-")) {
            String[] parts = language.split("-");
            language = parts[0];
            country = parts[1];
        }
        if (language.equalsIgnoreCase("zh") && country.equalsIgnoreCase("Hant")) {
            return Locale.forLanguageTag("zh-hant");
        }
        country = country.toUpperCase(Locale.ENGLISH);
        Locale best = Locale.getDefault();
        int bestScore = 0;
        language = new Locale(language).getLanguage();
        for (Locale locale : Locale.getAvailableLocales()) {
            int score = 0;
            if (locale.getLanguage().equalsIgnoreCase(language)) {
                score = 1;
                if (locale.getCountry().equalsIgnoreCase(country)) {
                    score = 2;
                    if (locale.getScript().equalsIgnoreCase(script)) score = 3;
                }
            }
            if (score > bestScore) {
                bestScore = score;
                best = locale;
            }
        }
        return best;
    }

    public final List<ws_0> GF0() {
        return YI.stream().map(C30::hz).collect(Collectors.toList());
    }

    public final void t2(boolean reload) {
        if (reload) zb0_2.vh0 = null;
        ws_0 primary = null;
        for (ws_0 container : GF0()) {
            if (container.ga) {
                primary = container;
                break;
            }
        }
        if (primary == null) {
            ME0.error("ERROR: Unable to find a primary string container.");
        } else {
            primary.sE0(reload);
            ME0.info("Populating primary string container[{}]: {} from {} ({})",
                    new Object[]{reload ? 0 : 1, primary.YD0, primary.lPT8, primary.lPT8.a5});
        }
        Fu = Q(dw_2.con);
        for (ws_0 container : R70(dw_2.con)) {
            if (container == primary) continue;
            container.sE0(reload);
            ME0.info("Populating secondary string container[{}]: {} from {}",
                    new Object[]{reload ? 0 : 1, container.YD0, container.lPT8});
        }
    }

    public final List<ws_0> R70(String language) {
        ArrayList<C30> selected = new ArrayList<>();
        for (C30 entry : YI) {
            ws_0 container = entry.kl;
            if (container.NM == 1 && language.equals(container.YD0)) selected.add(entry);
        }
        for (C30 entry : YI) {
            ws_0 container = entry.kl;
            if (container.NM == 0 && language.equals(container.YD0)) selected.add(entry);
        }
        selected.sort(ThemeXmlLayoutLoader::qj);
        return selected.stream().map(C30::hz).collect(Collectors.toList());
    }

    public final String[] V4() {
        ArrayList<String> languages = new ArrayList<>();
        for (G50 language : G50.aG) {
            for (ws_0 container : GF0()) {
                if (!languages.contains(container.YD0) && tx_1.SC(container.YD0, language.PM)) {
                    languages.add(container.YD0);
                }
            }
        }
        for (ws_0 container : GF0()) {
            if (!languages.contains(container.YD0)) languages.add(container.YD0);
        }
        return languages.toArray(new String[0]);
    }

    public final String pO() {
        Locale locale = Locale.getDefault();
        String selected = "";
        String language = locale.getLanguage();
        if (!locale.getCountry().isEmpty()) {
            language = AN.nK0(language, "-").append(locale.getCountry()).toString();
        }
        if (locale.getScript().equalsIgnoreCase("hant")) language = "zh-Hant";
        dl_1 initialized = tx_1.Sy0;
        if (language.regionMatches(true, 0, "zh-TW", 0, 5)
                || language.regionMatches(true, 0, "zh-HK", 0, 5)) language = "zh-Hant";
        while (language.indexOf('-') != language.lastIndexOf('-')) {
            language = language.substring(0, language.lastIndexOf('-'));
        }
        for (ws_0 container : GF0()) {
            if (container.YD0.equalsIgnoreCase(language)) {
                selected = container.YD0;
                return selected;
            }
            String prefix = container.YD0.length() > 2 ? container.YD0.substring(0, 2) : container.YD0;
            if (tx_1.SC(language, prefix)
                    && (selected.isEmpty() || container.YD0.length() < selected.length())) {
                selected = container.YD0;
            }
        }
        if (selected.isEmpty()) {
            ws_0 primary = null;
            for (ws_0 container : GF0()) {
                if (container.ga) {
                    primary = container;
                    break;
                }
            }
            selected = primary.YD0;
        }
        return selected;
    }

    public final Locale TK() {
        return Fu;
    }

    public final String IE0(String language) {
        for (ws_0 container : GF0()) {
            if (language.equals(container.YD0) && container.aJ0.length() > language.length()) return container.aJ0;
        }
        return language;
    }

    public final boolean CP(String language) {
        if (!"en".equals(language)) CP("en");
        Fu = Q(language);
        List<ws_0> containers = R70(language);
        if (containers.isEmpty()) return false;
        zb0_2.vh0 = null;
        for (ws_0 container : containers) {
            String font = container.p70;
            if (font != null) zb0_2.vh0 = font;
            container.sE0(false);
        }
        lg_0.k.lPT5(new mf0_0(language));
        return true;
    }
}
