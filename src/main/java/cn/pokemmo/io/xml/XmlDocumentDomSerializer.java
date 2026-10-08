package cn.pokemmo.io.xml;

import f.*;

import java.io.BufferedInputStream;
import java.util.Locale;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class XmlDocumentDomSerializer {
    public static final dl_1 yA0 = Cq0.E1(XmlDocumentDomSerializer.class);
    public static final Matcher nI = Pattern.compile("\\n", 16).matcher("");
    public final Dn0 lPT8;
    public final String YK;
    public final byte NM;
    public final byte jH;
    public final lpt6__2 mO;
    public final String YD0;
    public final String aJ0;
    public final String p70;
    public final boolean ga;
    public final boolean Y20;
    public boolean Vy0;
    public SQ E5;
    public final SQ ih0;

    public XmlDocumentDomSerializer(Dn0 file) {
        this(file, 0);
    }

    public XmlDocumentDomSerializer(Dn0 file, int unused) {
        byte type = -1;
        byte region = -1;
        lpt6__2 archiveType = lpt6__2.Q80;
        String language = "";
        String languageName = "";
        String typeface = null;
        boolean primary = false;
        boolean override = false;
        Vy0 = false;
        E5 = null;
        ih0 = null;
        lPT8 = file;
        YK = file.o30();
        yA0.info("Loading possible string container: {} ({})", YK, file.G0());
        // Keep final field values from every early-return and exception path.
        try {
            try (BufferedInputStream input = file.LpT7(2048)) {
                XmlPullParser parser = Tm(input);
                parser.getEventType();
                boolean header = false;
                boolean string = false;
                int event;
                while ((event = parser.next()) != 1) {
                    if (event != 2) {
                        continue;
                    }
                    String name = parser.getName();
                    if (name.equals("strings") || name.equals("ds_strings_archive")) {
                        language = parser.getAttributeValue(null, "lang");
                        if (language == null || language.isEmpty()) {
                            return;
                        }
                        language = language.toLowerCase(Locale.ENGLISH);
                        if (!language.matches("^[a-zA-Z\\-_0-9]+$")) {
                            language = "INVALID";
                            return;
                        }
                        languageName = parser.getAttributeValue(null, "lang_full");
                        if (languageName == null || languageName.isEmpty()) {
                            languageName = language;
                        }
                        typeface = parser.getAttributeValue(null, "typeface");
                        if (name.equals("strings")) {
                            type = 0;
                            String value = parser.getAttributeValue(null, "is_primary");
                            if (value != null && "1".equals(value) || "true".equals(value)) {
                                primary = true;
                            }
                            value = parser.getAttributeValue(null, "is_override");
                            if (value != null && "1".equals(value) || "true".equals(value)) {
                                override = true;
                            }
                            value = parser.getAttributeValue(null, "region_id");
                            if (value != null) {
                                byte parsed = Byte.parseByte(value);
                                if (parsed >= 0 && region < 5) {
                                    region = parsed;
                                }
                            }
                        } else {
                            type = 1;
                            String value = parser.getAttributeValue(null, "region_id");
                            if (value == null) {
                                return;
                            }
                            region = Byte.parseByte(value);
                            if (region < 0 || region >= 5) {
                                return;
                            }
                            value = parser.getAttributeValue(null, "archive_type");
                            if (value == null) {
                                return;
                            }
                            archiveType = lpt6__2.rI0(Byte.parseByte(value));
                            if (archiveType == null) {
                                return;
                            }
                        }
                        header = true;
                        if (string) {
                            break;
                        }
                    } else if (name.equals("string")) {
                        string = true;
                        if (header) {
                            break;
                        }
                    }
                }
                Vy0 = header && string;
            } catch (Exception exception) {
                yA0.error("Error parsing string container {}", YK, exception);
                Vy0 = false;
            }
        } finally {
            NM = type;
            jH = region;
            mO = archiveType;
            YD0 = language;
            aJ0 = languageName;
            p70 = typeface;
            ga = primary;
            Y20 = override;
        }
    }

    public static boolean com8(int id, String value) {
        sm0_0.kE0(id, sm0_0.dd(value));
        return true;
    }

    public static boolean x70(boolean raw, int id, String value) {
        if (!raw) {
            value = sm0_0.dd(value);
        }
        sm0_0.kE0(id, value);
        return true;
    }

    public static XmlPullParser Tm(BufferedInputStream input) throws XmlPullParserException {
        XmlPullParser parser = XmlPullParserFactory.newInstance().newPullParser();
        parser.setInput(input, null);
        return parser;
    }

    public final void pw(xm_0 archive) {
        E5 = new SQ(0);
        try (BufferedInputStream input = lPT8.LpT7(2048)) {
            XmlPullParser parser = XmlPullParserFactory.newInstance().newPullParser();
            parser.setInput(input, null);
            parser.getEventType();
            boolean inString = false;
            int id = 0;
            int table = -1;
            int block = -1;
            int entry = -1;
            boolean preload = false;
            int event;
            while ((event = parser.next()) != 1) {
                if (event == 2) {
                    if (!parser.getName().equals("string")) {
                        continue;
                    }
                    inString = true;
                    if (NM == 0) {
                        String value = parser.getAttributeValue(null, "id");
                        if (value == null) {
                            continue;
                        }
                        try {
                            id = Integer.parseInt(value);
                        } catch (NumberFormatException ignored) {
                            continue;
                        }
                        preload = ih0 != null && "1".equals(parser.getAttributeValue(null, "preload"));
                    } else if (NM == 1) {
                        String tableValue = parser.getAttributeValue(null, "table_id");
                        String blockValue = parser.getAttributeValue(null, "block_id");
                        String entryValue = parser.getAttributeValue(null, "entry_id");
                        try {
                            table = Integer.parseInt(tableValue);
                            block = Integer.parseInt(blockValue);
                            entry = Integer.parseInt(entryValue);
                        } catch (NumberFormatException ignored) {
                            continue;
                        }
                    }
                } else if (event == 3) {
                    inString = false;
                } else if (event == 4 && inString) {
                    if (NM == 0) {
                        String value = parser.getText();
                        if (value.indexOf('|') > -1) {
                            value = value.replaceAll("\\|br\\|", "\n")
                                    .replaceAll("\\|nb2\\|", "\n\n")
                                    .replaceAll("\\|nb[\\d]?\\|", "\n");
                        }
                        if (value.indexOf('\\') > -1) {
                            value = nI.reset(value).replaceAll("\n");
                        }
                        SQ values = E5;
                        values.j10(values.yw0(id), value);
                        if (preload) {
                            SQ preloads = ih0;
                            preloads.j10(preloads.yw0(id), value);
                        }
                    } else if (NM == 1 && archive != null && table >= 0 && block >= 0 && entry >= 0) {
                        String value = parser.getText();
                        if (value.indexOf('\\') > -1) {
                            value = nI.reset(value).replaceAll("\n");
                        }
                        archive.x30(table, block, value, entry);
                    }
                }
            }
        } catch (Exception exception) {
            yA0.error("Error parsing string container {}", YK, exception);
            Vy0 = false;
        }
    }

    public final void sE0(boolean raw) {
        if (raw && p70 != null && !Y20) {
            zb0_2.vh0 = p70;
        }
        byte type = NM;
        if (type == 0) {
            if (E5 == null) {
                pw(null);
            }
            E5.JZ((id, value) -> x70(raw, id, (String) value));
            if (!raw) {
                E5.JZ((id, value) -> com8(id, (String) value));
            }
            if (ga) {
                SQ values = E5;
                String[] initialization = sm0_0.zb0;
                for (IL key : IL.values()) {
                    String value = (String) values.get(key.Fi);
                    if (value == null) {
                        value = "";
                    }
                    sm0_0.cOm5.put(key, value);
                }
                for (int id = 110000; id < 110999; id++) {
                    if (values.l90(id)) {
                        sm0_0.n6.Vn(id);
                    }
                }
            }
        } else if (type == 1 && !raw) {
            xm_0 archive = sm0_0.jP(jH, mO);
            if (archive != xm_0.zq) {
                pw(archive);
                if (jH == 2) {
                    sm0_0.Tk(tw0_0.Ll0.Qz0);
                }
            }
        }
        if (!raw) {
            E5 = null;
        }
    }

    public final boolean hz() {
        if (NM == 1) {
            return true;
        }
        if (E5 == null) {
            pw(null);
        }
        TreeSet<Integer> ids = new TreeSet<>();
        SQ originals = sm0_0.cU;
        for (int id : originals.Zw0()) {
            ids.add(id);
        }
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element root = document.createElement("strings");
            root.setAttribute("lang", YD0);
            root.setAttribute("is_primary", ga ? "1" : "0");
            root.setAttribute("is_override", Y20 ? "1" : "0");
            document.appendChild(root);
            for (int id : ids) {
                String value = (String) E5.get(id);
                if (value == null) {
                    value = (String) originals.get(id);
                }
                Element element = document.createElement("string");
                element.setAttribute("id", new StringBuilder().append(id).append("").toString());
                element.setTextContent(value.replaceAll("\\\n", "\\\\n"));
                root.appendChild(element);
            }
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(document);
            os0_0 files = lg_0.I70;
            String path = "dump/strings/dump_" + YK;
            files.getClass();
            VE destination = new VE(path, zv_1.kE);
            destination.Br().A20();
            StreamResult result = new StreamResult(destination.OC0());
            transformer.setOutputProperty("indent", "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.transform(source, result);
            E5 = null;
            return true;
        } catch (Exception exception) {
            yA0.error("dump error", exception);
            E5 = null;
            return false;
        }
    }

    public final String jM() {
        StringBuilder name = new StringBuilder();
        name.append(YD0);
        name.append('_');
        name.append(NM);
        name.append('_');
        if (NM == 1) {
            name.append(mO.UB0).append('_');
        }
        if (Y20) {
            name.append("override_");
        }
        name.append(jH);
        name.append(".xml");
        return name.toString();
    }
}
