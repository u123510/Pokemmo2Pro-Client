package cn.pokemmo.util.collection;

import f.*;

import f.Dn0;
import f.G10;
import f.WC0;
import f.b3_0;
import f.es_1;
import f.nb_2;
import java.io.Reader;
import java.io.StringReader;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class FixedCapacityObjectArray {
    public static final byte[] Dl0 = new byte[0];
    public static final byte[] lp = new byte[0];
    public static final char[] jk = new char[0];
    public static final byte[] coM9 = new byte[0];
    public static final byte[] xx = new byte[0];
    public static final short[] Tr0 = new short[0];
    public static final byte[] Kb0 = new byte[0];
    public static final byte[] yA = new byte[0];
    public static final byte[] sc0 = new byte[0];

    public final es_1 Pt;
    public G10 mE0;
    public G10 L3;
    public final b3_0 MR;
    public String th;

    public FixedCapacityObjectArray() {
        this.Pt = new es_1(8);
        this.MR = new b3_0(64);
    }

    public static byte[] Xf0() {
        return new byte[0];
    }

    public static byte[] SZ() {
        return new byte[0];
    }

    public static short[] wl0() {
        return new short[0];
    }

    public static byte[] me() {
        return new byte[0];
    }

    public static char[] t00() {
        return new char[0];
    }

    public static byte[] WN() {
        return new byte[0];
    }

    public final G10 G4(Dn0 file) {
        Reader reader = null;
        try {
            reader = file.IE0("UTF-8");
            char[] chars = new char[1024];
            int length = 0;
            while (true) {
                if (length == chars.length) {
                    char[] grown = new char[chars.length * 2];
                    System.arraycopy(chars, 0, grown, 0, chars.length);
                    chars = grown;
                }
                int read = reader.read(chars, length, chars.length - length);
                if (read == -1) {
                    return this.ma0(chars, length);
                }
                length += read;
            }
        } catch (Exception ex) {
            throw new WC0("Error parsing file: " + file, ex);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception ignored) {
                }
            }
        }
    }

    public final G10 ma0(char[] data, int length) {
        this.Pt.clear();
        this.mE0 = null;
        this.L3 = null;
        this.th = null;
        this.MR.A2(0);

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(false);
            factory.setCoalescing(false);
            factory.setIgnoringComments(true);
            factory.setExpandEntityReferences(true);
            setFeatureQuietly(factory, XMLConstants.FEATURE_SECURE_PROCESSING, true);
            setFeatureQuietly(factory, "http://xml.org/sax/features/external-general-entities", false);
            setFeatureQuietly(factory, "http://xml.org/sax/features/external-parameter-entities", false);
            setFeatureQuietly(factory, "http://apache.org/xml/features/nonvalidating/load-external-dtd", false);

            DocumentBuilder builder = factory.newDocumentBuilder();
            builder.setEntityResolver((publicId, systemId) -> new InputSource(new StringReader("")));
            Document document = builder.parse(new InputSource(new StringReader(new String(data, 0, length))));
            org.w3c.dom.Element root = document.getDocumentElement();
            if (root == null) {
                this.mE0 = null;
                return null;
            }
            this.mE0 = convert(root, null);
            this.L3 = null;
            this.Pt.clear();
            return this.mE0;
        } catch (WC0 ex) {
            throw ex;
        } catch (Exception ex) {
            throw new WC0("Error parsing XML", ex);
        }
    }

    private static void setFeatureQuietly(DocumentBuilderFactory factory, String feature, boolean value) {
        try {
            factory.setFeature(feature, value);
        } catch (Exception ignored) {
        }
    }

    private static G10 convert(org.w3c.dom.Element element, G10 parent) {
        G10 out = new G10(element.getNodeName(), parent);

        NamedNodeMap attrs = element.getAttributes();
        int attrCount = attrs == null ? 0 : attrs.getLength();
        if (attrCount > 0) {
            out.cA = new nb_2(attrCount);
            for (int i = 0; i < attrCount; i++) {
                Node attr = attrs.item(i);
                out.cA.WK0(attr.getNodeName(), attr.getNodeValue());
            }
        }

        NodeList children = element.getChildNodes();
        int count = children == null ? 0 : children.getLength();
        for (int i = 0; i < count; i++) {
            Node child = children.item(i);
            switch (child.getNodeType()) {
                case Node.ELEMENT_NODE: {
                    G10 childElement = convert((org.w3c.dom.Element) child, out);
                    if (out.mx0 == null) {
                        out.mx0 = new es_1(8);
                    }
                    out.mx0.Ue0(childElement);
                    break;
                }
                case Node.CDATA_SECTION_NODE:
                    appendText(out, child.getNodeValue(), false);
                    break;
                case Node.TEXT_NODE:
                    appendText(out, child.getNodeValue(), true);
                    break;
                default:
                    break;
            }
        }
        return out;
    }

    private static void appendText(G10 element, String text, boolean trimTrailingWhitespace) {
        if (text == null || text.length() == 0) {
            return;
        }
        String value = trimTrailingWhitespace ? trimTrailingWhitespace(text) : text;
        if (value.length() == 0) {
            return;
        }
        element.j0 = element.j0 == null ? value : element.j0.concat(value);
    }

    private static String trimTrailingWhitespace(String text) {
        int end = text.length();
        while (end > 0) {
            char c = text.charAt(end - 1);
            if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                break;
            }
            end--;
        }
        return end == text.length() ? text : text.substring(0, end);
    }
}
