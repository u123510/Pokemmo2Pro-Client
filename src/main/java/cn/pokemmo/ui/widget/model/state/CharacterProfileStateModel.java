package cn.pokemmo.ui.widget.model.state;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import cn.pokemmo.ui.widget.model.state.BaseObservableStateModel;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;

public class CharacterProfileStateModel extends BaseObservableStateModel implements sz_0 {
    public final ArrayList fx;
    public final ArrayList UJ0;
    public final HashMap Ra;
    public final ArrayList lw0;
    public final StringBuilder uH0;
    public final int[] f7;
    public gb0_0 YU;
    public rz_1 q70;
    public Runnable xG0;

    public CharacterProfileStateModel() {
        super();
        this.q70 = null;
        this.fx = new ArrayList();
        this.UJ0 = new ArrayList();
        this.Ra = new HashMap();
        this.lw0 = new ArrayList();
        this.uH0 = new StringBuilder();
        this.f7 = new int[2];
    }

    public final void hm(String v1) {
        Reader v2;
        if (v1.length() > 5 && v1.charAt(0) == '<' && (v1.startsWith("<?xml") || v1.startsWith("<!DOCTYPE") || v1.startsWith("<html>"))) {
            v2 = new StringReader(v1);
        } else {
            v2 = new RF0(new String[]{"<html><body>", v1, "</body></html>"});
        }
        this.fx.clear();
        this.UJ0.clear();
        this.Ra.clear();
        try {
            XmlPullParser v1_parser = Ps0.Nl0();
            v1_parser.setInput(v2);
            v1_parser.defineEntityReplacementText("nbsp", "\u00A0");
            v1_parser.require(0, null, null);
            v1_parser.nextTag();
            v1_parser.require(2, null, "html");
            this.lw0.clear();
            this.lw0.add(new D90((D90) null, (li_0) null));
            this.YU = null;
            this.uH0.setLength(0);
            while (v1_parser.nextTag() != 3) {
                v1_parser.require(2, null, null);
                String name = v1_parser.getName();
                if ("head".equals(name)) {
                    Sk(v1_parser);
                } else if ("body".equals(name)) {
                    cOm6(v1_parser);
                    rz_1 rz = new rz_1(xE());
                    this.q70 = rz;
                    this.fx.add(rz);
                    dt0(v1_parser, this.q70);
                }
            }
            Av(v1_parser);
            bq0();
            a7_0.bH(this.RD0);
        } catch (Throwable t) {
            try {
                Logger.getLogger(CharacterProfileStateModel.class.getName()).log(Level.SEVERE, "Unable to parse XHTML document", t);
            } finally {
                a7_0.bH(this.RD0);
            }
        } finally {
            KT.E1(v2);
        }
    }

    @Override
    public final Iterator iterator() {
        return this.fx.iterator();
    }

    public final void sV(String v1) {
        if (this.q70 == null) {
            hm("");
        }
        RF0 v2 = new RF0(new String[]{v1});
        try {
            XmlPullParser v1_parser = Ps0.Nl0();
            v1_parser.setInput(v2);
            v1_parser.defineEntityReplacementText("nbsp", "\u00A0");
            if (this.lw0.isEmpty()) {
                this.lw0.add(new D90((D90) null, (li_0) null));
            }
            dt0(v1_parser, this.q70);
            bq0();
            KT.E1(v2);
            Runnable r = this.xG0;
            if (r != null) {
                r.run();
            }
        } catch (Throwable t) {
            try {
                Logger.getLogger(CharacterProfileStateModel.class.getName()).log(Level.SEVERE, "Unable to parse XHTML document", t);
            } finally {
                KT.E1(v2);
                Runnable r = this.xG0;
                if (r != null) {
                    r.run();
                }
            }
        }
    }

    public final void dt0(XmlPullParser v1, gb0_0 v2) {
        gb0_0 oldYU = this.YU;
        this.YU = v2;
        cOm6(null);
        Av(v1);
        int size = this.lw0.size();
        if (size > 1) {
            this.lw0.remove(size - 1);
        }
        this.YU = oldYU;
    }

    public final void Av(XmlPullParser v1) {
        int i2 = 1;
        while (i2 > 0) {
            int token;
            try {
                token = v1.nextToken();
            } catch (Exception e) {
                break;
            }
            if (token == 1) {
                break;
            }
            switch (token) {
                case 2:
                    String name = v1.getName();
                    if ("head".equals(name)) {
                        Sk(v1);
                        break;
                    }
                    int nextI2 = i2 + 1;
                    bq0();
                    D90 style = cOm6(v1);
                    ay_0 elem;
                    if ("img".equals(name)) {
                        String src = v1.getAttributeValue(null, "src");
                        if (src == null) {
                            src = "";
                        }
                        String alt = v1.getAttributeValue(null, "alt");
                        elem = new O80(style, src, alt);
                        i2 = nextI2;
                    } else if ("p".equals(name)) {
                        QR qr = new QR(style);
                        dt0(v1, qr);
                        elem = qr;
                    } else if ("button".equals(name)) {
                        String bName = v1.getAttributeValue(null, "name");
                        if (bName == null) {
                            bName = "";
                        }
                        String value = v1.getAttributeValue(null, "value");
                        if (value == null) {
                            value = "";
                        }
                        elem = new oe0_1(style, bName, value);
                        i2 = nextI2;
                    } else if ("ul".equals(name)) {
                        gb0_0 ul = new gb0_0(style);
                        dt0(v1, ul);
                        elem = ul;
                    } else if ("ol".equals(name)) {
                        int start = 1;
                        String startAttr = v1.getAttributeValue(null, "start");
                        if (startAttr != null) {
                            try {
                                start = Integer.parseInt(startAttr);
                            } catch (IllegalArgumentException ignored) {
                            }
                        }
                        s0_0 ol = new s0_0(start, style);
                        JE(ol);
                        while (true) {
                            int nextTag;
                            try {
                                nextTag = v1.nextTag();
                            } catch (Exception e) {
                                break;
                            }
                            if (nextTag == 2) {
                                cOm6(v1);
                                if ("li".equals(v1.getName())) {
                                    gb0_0 li = new gb0_0(xE());
                                    dt0(v1, li);
                                    JE(li);
                                    ol.lt0.add(li);
                                }
                            } else if (nextTag == 3) {
                                int s = this.lw0.size();
                                if (s > 1) {
                                    this.lw0.remove(s - 1);
                                }
                                if ("ol".equals(v1.getName())) {
                                    break;
                                }
                            }
                        }
                        elem = ol;
                    } else if ("li".equals(name)) {
                        vp_2 li = new vp_2(style);
                        dt0(v1, li);
                        elem = li;
                    } else if ("playername".equals(name)) {
                        if (v1.getAttributeValue(null, "name") == null) {
                            i2 = nextI2;
                            break;
                        }
                        wj0_2 pn = new wj0_2(style);
                        dt0(v1, pn);
                        elem = pn;
                    } else if ("div".equals(name) || (name.length() == 2 && name.charAt(0) == 'h' && name.charAt(1) >= '0' && name.charAt(1) <= '6')) {
                        rz_1 rz = new rz_1(style);
                        dt0(v1, rz);
                        elem = rz;
                    } else if ("a".equals(name)) {
                        String href = v1.getAttributeValue(null, "href");
                        if (href == null) {
                            i2 = nextI2;
                            break;
                        }
                        rv0_0 a = new rv0_0(style, href);
                        dt0(v1, a);
                        elem = a;
                    } else if ("table".equals(name)) {
                        ArrayList<L30> cells = new ArrayList<>();
                        ArrayList<D90> rows = new ArrayList<>();
                        int cols = 0;
                        int cellSpacing = 0;
                        String csAttr = v1.getAttributeValue(null, "cellspacing");
                        if (csAttr != null) {
                            try {
                                cellSpacing = Integer.parseInt(csAttr);
                            } catch (IllegalArgumentException ignored) {
                            }
                        }
                        int cellPadding = 0;
                        String cpAttr = v1.getAttributeValue(null, "cellpadding");
                        if (cpAttr != null) {
                            try {
                                cellPadding = Integer.parseInt(cpAttr);
                            } catch (IllegalArgumentException ignored) {
                            }
                        }
                        while (true) {
                            int tag;
                            try {
                                tag = v1.nextTag();
                            } catch (Exception e) {
                                break;
                            }
                            if (tag == 2) {
                                cOm6(v1);
                                String tagName = v1.getName();
                                if ("td".equals(tagName) || "th".equals(tagName)) {
                                    int colspan = 1;
                                    String cs = v1.getAttributeValue(null, "colspan");
                                    if (cs != null) {
                                        try {
                                            colspan = Integer.parseInt(cs);
                                        } catch (IllegalArgumentException ignored) {
                                        }
                                    }
                                    L30 cell = new L30(colspan, xE());
                                    dt0(v1, cell);
                                    JE(cell);
                                    cells.add(cell);
                                    for (int col = 1; col < colspan; col++) {
                                        cells.add(null);
                                    }
                                }
                                if ("tr".equals(tagName)) {
                                    rows.add(xE());
                                }
                            } else if (tag == 3) {
                                int s = this.lw0.size();
                                if (s > 1) {
                                    this.lw0.remove(s - 1);
                                }
                                String tagName = v1.getName();
                                if ("tr".equals(tagName) && cols == 0) {
                                    cols = cells.size();
                                }
                                if ("table".equals(tagName)) {
                                    break;
                                }
                            }
                        }
                        xi_0 table = new xi_0(style, cols, rows.size(), cellSpacing, cellPadding);
                        int cellIdx = 0;
                        for (int r = 0; r < rows.size(); r++) {
                            table.Bs[r] = rows.get(r);
                            for (int c = 0; c < cols && cellIdx < cells.size(); c++, cellIdx++) {
                                L30 cell = cells.get(cellIdx);
                                if (c < 0 || c >= table.SE0) {
                                    throw new IndexOutOfBoundsException("column");
                                }
                                if (r < 0 || r >= table.We0) {
                                    throw new IndexOutOfBoundsException("row");
                                }
                                table.qD0[r * table.SE0 + c] = cell;
                            }
                        }
                        elem = table;
                    } else if ("br".equals(name)) {
                        elem = new pa0_1(style);
                        i2 = nextI2;
                    } else {
                        i2 = nextI2;
                        break;
                    }
                    this.YU.lt0.add(elem);
                    JE(elem);
                    break;
                case 3:
                    i2--;
                    bq0();
                    int s = this.lw0.size();
                    if (s > 1) {
                        this.lw0.remove(s - 1);
                    }
                    break;
                case 4:
                    try {
                        char[] chars = v1.getTextCharacters(this.f7);
                        int len = this.f7[1];
                        if (len > 0) {
                            this.uH0.append(chars, this.f7[0], len);
                        }
                    } catch (Exception ignored) {
                    }
                    break;
                case 6:
                    this.uH0.append(v1.getText());
                    break;
            }
        }
    }

    public final void Sk(XmlPullParser v1) {
        int i2 = 1;
        while (i2 > 0) {
            int tag;
            try {
                tag = v1.nextTag();
            } catch (Exception e) {
                break;
            }
            if (tag == 3) {
                i2--;
            } else if (tag == 2) {
                int nextI2 = i2 + 1;
                String name = v1.getName();
                if ("link".equals(name)) {
                    String href = v1.getAttributeValue(null, "href");
                    if ("stylesheet".equals(v1.getAttributeValue(null, "rel")) && "text/css".equals(v1.getAttributeValue(null, "type")) && href != null) {
                        this.UJ0.add(href);
                    }
                }
                if ("title".equals(name)) {
                    try {
                        v1.nextText();
                    } catch (Exception ignored) {
                    }
                } else {
                    i2 = nextI2;
                }
            }
        }
    }

    public final void JE(ay_0 v1) {
        li_0 li;
        String id;
        if (v1.Ph != null && (li = v1.Ph.sw0) != null && (id = li.F6) != null) {
            this.Ra.put(id, v1);
        }
    }

    public final D90 xE() {
        return (D90) this.lw0.get(this.lw0.size() - 1);
    }

    public final D90 cOm6(XmlPullParser v1) {
        D90 parent = xE();
        li_0 selector = null;
        String style = null;
        if (v1 != null) {
            String clazz = v1.getAttributeValue(null, "class");
            String name = v1.getName();
            String id = v1.getAttributeValue(null, "id");
            selector = new li_0(name, clazz, id);
            style = v1.getAttributeValue(null, "style");
        }
        D90 result;
        if (style != null) {
            result = new on_1(parent, selector, style);
        } else {
            result = new D90(parent, selector);
        }
        this.lw0.add(result);
        return result;
    }

    public final void bq0() {
        if (this.uH0.length() > 0) {
            D90 style = xE();
            B60 text = new B60(style, this.uH0.toString());
            JE(text);
            this.YU.lt0.add(text);
            this.uH0.setLength(0);
        }
    }
}
