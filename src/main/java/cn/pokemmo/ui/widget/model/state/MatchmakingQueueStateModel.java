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

public class MatchmakingQueueStateModel extends BaseObservableStateModel implements sz_0 {
    public final ArrayList h1;
    public final ArrayList QT;
    public final HashMap mb0;
    public final ArrayList tQ;
    public final StringBuilder KQ;
    public final int[] Vv;
    public gb0_0 x0;

    public MatchmakingQueueStateModel() {
        super();
        this.h1 = new ArrayList();
        this.QT = new ArrayList();
        this.mb0 = new HashMap();
        this.tQ = new ArrayList();
        this.KQ = new StringBuilder();
        this.Vv = new int[2];
    }

    public final void Eo(String v1) {
        Reader v2;
        if (v1.length() > 5 && v1.charAt(0) == '<' && (v1.startsWith("<?xml") || v1.startsWith("<!DOCTYPE") || v1.startsWith("<html>"))) {
            v2 = new StringReader(v1);
        } else {
            v2 = new RF0(new String[]{"<html><body>", v1, "</body></html>"});
        }
        this.h1.clear();
        this.QT.clear();
        this.mb0.clear();
        try {
            XmlPullParser v1_parser = Ps0.Nl0();
            v1_parser.setInput(v2);
            v1_parser.defineEntityReplacementText("nbsp", "\u00A0");
            v1_parser.require(0, null, null);
            v1_parser.nextTag();
            v1_parser.require(2, null, "html");
            this.tQ.clear();
            this.tQ.add(new D90((D90) null, (li_0) null));
            this.x0 = null;
            this.KQ.setLength(0);
            while (v1_parser.nextTag() != 3) {
                v1_parser.require(2, null, null);
                String name = v1_parser.getName();
                if ("head".equals(name)) {
                    ni(v1_parser);
                } else if ("body".equals(name)) {
                    Wv0(v1_parser);
                    rz_1 v3 = new rz_1(yD0());
                    this.h1.add(v3);
                    AY(v1_parser, v3);
                }
            }
            T80(v1_parser);
            qJ0();
            a7_0.bH(this.RD0);
        } catch (Throwable t) {
            try {
                Logger.getLogger(MatchmakingQueueStateModel.class.getName()).log(Level.SEVERE, "Unable to parse XHTML document", t);
            } finally {
                a7_0.bH(this.RD0);
            }
        } finally {
            KT.E1(v2);
        }
    }

    @Override
    public final Iterator iterator() {
        return this.h1.iterator();
    }

    public final void AY(XmlPullParser v1, gb0_0 v2) {
        gb0_0 prev = this.x0;
        this.x0 = v2;
        Wv0(v1);
        T80(v1);
        int size = this.tQ.size();
        if (size > 1) {
            this.tQ.remove(size - 1);
        }
        this.x0 = prev;
    }

    public final void T80(XmlPullParser v1) {
        int depth = 1;
        while (depth > 0) {
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
                case 4: {
                    char[] chars;
                    try {
                        chars = v1.getTextCharacters(this.Vv);
                    } catch (Exception e) {
                        break;
                    }
                    int len = this.Vv[1];
                    if (len > 0) {
                        this.KQ.append(chars, this.Vv[0], len);
                    }
                    break;
                }
                case 5: {
                    this.KQ.append(v1.getText());
                    break;
                }
                case 3: {
                    depth--;
                    qJ0();
                    int size = this.tQ.size();
                    if (size > 1) {
                        this.tQ.remove(size - 1);
                    }
                    break;
                }
                case 2: {
                    String name = v1.getName();
                    if ("head".equals(name)) {
                        ni(v1);
                        break;
                    }
                    int nextDepth = depth + 1;
                    qJ0();
                    D90 style = Wv0(v1);
                    ay_0 element = null;
                    if ("img".equals(name)) {
                        String src = v1.getAttributeValue(null, "src");
                        if (src == null) {
                            src = "";
                        }
                        String alt = v1.getAttributeValue(null, "alt");
                        element = new O80(style, src, alt);
                        depth = nextDepth;
                    } else if ("p".equals(name)) {
                        QR qr = new QR(style);
                        AY(v1, qr);
                        element = qr;
                    } else if ("button".equals(name)) {
                        String btnName = v1.getAttributeValue(null, "name");
                        if (btnName == null) {
                            btnName = "";
                        }
                        String btnVal = v1.getAttributeValue(null, "value");
                        if (btnVal == null) {
                            btnVal = "";
                        }
                        element = new oe0_1(style, btnName, btnVal);
                        depth = nextDepth;
                    } else if ("ul".equals(name)) {
                        gb0_0 ul = new gb0_0(style);
                        AY(v1, ul);
                        element = ul;
                    } else if ("ol".equals(name)) {
                        int start = 1;
                        String startVal = v1.getAttributeValue(null, "start");
                        if (startVal != null) {
                            try {
                                start = Integer.parseInt(startVal);
                            } catch (IllegalArgumentException ignored) {}
                        }
                        s0_0 ol = new s0_0(start, style);
                        dI0(ol);
                        while (true) {
                            int nextTag;
                            try {
                                nextTag = v1.nextTag();
                            } catch (Exception e) {
                                break;
                            }
                            if (nextTag == 2) {
                                Wv0(v1);
                                if ("li".equals(v1.getName())) {
                                    gb0_0 li = new gb0_0(yD0());
                                    AY(v1, li);
                                    dI0(li);
                                    ol.lt0.add(li);
                                }
                            } else if (nextTag == 3) {
                                int sz = this.tQ.size();
                                if (sz > 1) {
                                    this.tQ.remove(sz - 1);
                                }
                                if ("ol".equals(v1.getName())) {
                                    break;
                                }
                            }
                        }
                        element = ol;
                    } else if ("li".equals(name)) {
                        vp_2 li = new vp_2(style);
                        AY(v1, li);
                        element = li;
                    } else if ("div".equals(name) || (name.length() == 2 && name.charAt(0) == 'h' && name.charAt(1) >= '0' && name.charAt(1) <= '6')) {
                        rz_1 div = new rz_1(style);
                        AY(v1, div);
                        element = div;
                    } else if ("a".equals(name)) {
                        String href = v1.getAttributeValue(null, "href");
                        if (href != null) {
                            rv0_0 a = new rv0_0(style, href);
                            AY(v1, a);
                            element = a;
                        } else {
                            depth = nextDepth;
                        }
                    } else if ("table".equals(name)) {
                        ArrayList cells = new ArrayList();
                        ArrayList rows = new ArrayList();
                        int cols = 0;
                        int spacing = 0;
                        String sp = v1.getAttributeValue(null, "cellspacing");
                        if (sp != null) {
                            try {
                                spacing = Integer.parseInt(sp);
                            } catch (IllegalArgumentException ignored) {}
                        }
                        int padding = 0;
                        String pad = v1.getAttributeValue(null, "cellpadding");
                        if (pad != null) {
                            try {
                                padding = Integer.parseInt(pad);
                            } catch (IllegalArgumentException ignored) {}
                        }
                        while (true) {
                            int nextTag;
                            try {
                                nextTag = v1.nextTag();
                            } catch (Exception e) {
                                break;
                            }
                            if (nextTag == 2) {
                                Wv0(v1);
                                String tagName = v1.getName();
                                if ("td".equals(tagName) || "th".equals(tagName)) {
                                    int colspan = 1;
                                    String cs = v1.getAttributeValue(null, "colspan");
                                    if (cs != null) {
                                        try {
                                            colspan = Integer.parseInt(cs);
                                        } catch (IllegalArgumentException ignored) {}
                                    }
                                    L30 cell = new L30(colspan, yD0());
                                    AY(v1, cell);
                                    dI0(cell);
                                    cells.add(cell);
                                    for (int i = 1; i < colspan; i++) {
                                        cells.add(null);
                                    }
                                }
                                if ("tr".equals(tagName)) {
                                    rows.add(yD0());
                                }
                            } else if (nextTag == 3) {
                                int sz = this.tQ.size();
                                if (sz > 1) {
                                    this.tQ.remove(sz - 1);
                                }
                                String tagName = v1.getName();
                                if ("tr".equals(tagName) && cols == 0) {
                                    cols = cells.size();
                                }
                                if ("table".equals(tagName)) {
                                    xi_0 table = new xi_0(style, cols, rows.size(), spacing, padding);
                                    for (int r = 0; r < rows.size(); r++) {
                                        table.Bs[r] = (D90) rows.get(r);
                                        for (int c = 0; c < cols; c++) {
                                            int idx = r * cols + c;
                                            if (idx < cells.size()) {
                                                L30 cell = (L30) cells.get(idx);
                                                if (c < 0 || c >= table.SE0) {
                                                    throw new IndexOutOfBoundsException("column");
                                                }
                                                if (r < 0 || r >= table.We0) {
                                                    throw new IndexOutOfBoundsException("row");
                                                }
                                                table.qD0[r * table.SE0 + c] = cell;
                                            }
                                        }
                                    }
                                    element = table;
                                    break;
                                }
                            }
                        }
                    } else if ("br".equals(name)) {
                        element = new pa0_1(style);
                        depth = nextDepth;
                    } else {
                        depth = nextDepth;
                    }
                    if (element != null) {
                        this.x0.lt0.add(element);
                        dI0(element);
                    }
                    break;
                }
                default:
                    break;
            }
        }
    }

    public final void ni(XmlPullParser v1) {
        int depth = 1;
        while (depth > 0) {
            int token;
            try {
                token = v1.nextTag();
            } catch (Exception e) {
                break;
            }
            if (token == 3) {
                depth--;
            } else if (token == 2) {
                depth++;
                String name = v1.getName();
                if ("link".equals(name)) {
                    String href = v1.getAttributeValue(null, "href");
                    if ("stylesheet".equals(v1.getAttributeValue(null, "rel")) && "text/css".equals(v1.getAttributeValue(null, "type")) && href != null) {
                        this.QT.add(href);
                    }
                } else if ("title".equals(name)) {
                    try {
                        v1.nextText();
                    } catch (Exception ignored) {}
                }
            }
        }
    }

    public final void dI0(ay_0 v1) {
        li_0 li = v1.Ph.sw0;
        if (li != null && li.F6 != null) {
            this.mb0.put(li.F6, v1);
        }
    }

    public final D90 yD0() {
        return (D90) this.tQ.get(this.tQ.size() - 1);
    }

    public final D90 Wv0(XmlPullParser v1) {
        D90 parent = yD0();
        li_0 tag = null;
        String style = null;
        if (v1 != null) {
            String cls = v1.getAttributeValue(null, "class");
            String name = v1.getName();
            String id = v1.getAttributeValue(null, "id");
            tag = new li_0(name, cls, id);
            style = v1.getAttributeValue(null, "style");
        }
        D90 result;
        if (style != null) {
            result = new on_1(parent, tag, style);
        } else {
            result = new D90(parent, tag);
        }
        this.tQ.add(result);
        return result;
    }

    public final void qJ0() {
        if (this.KQ.length() > 0) {
            D90 style = yD0();
            B60 b = new B60(style, this.KQ.toString());
            dI0(b);
            this.x0.lt0.add(b);
            this.KQ.setLength(0);
        }
    }
}
