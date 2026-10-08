package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class ChatEmotePickerComponent extends BaseComponent {
    public static final MD0 oC;
    public static final char[] mL;
    public static final ww_2 vq;
    public static final boolean i2;
    public final HashMap j80;
    public final HashMap Lm;
    public final HashMap b6;
    public final ArrayList Nr;
    public final tk_1 AG;
    public final hq0_0 z60;
    public sz_0 ws0;
    public QS WI0;
    public QS a90;
    public Y30 pM;
    public op_0[] xK;
    public dc0_0 yT;
    public dc0_0 wt0;
    public final PJ0 vI0;
    public final ArrayList coM2;
    public final fw0_0 aY;
    public boolean e3;
    public boolean QD0;
    public boolean ZA0;
    public L50 Qu;
    public int Yy;
    public int Qw;
    public boolean mK0;
    public boolean xD0;
    public xt0_0 Jb0;
    public final HashMap CD;

    static {
        i2 = !ChatEmotePickerComponent.class.desiredAssertionStatus();
        oC = MD0.cB("hover");
        mL = new char[0];
        vq = new ww_2(new Oq[] { new yc0_0(oC) });
    }

    public ChatEmotePickerComponent() {
        CD = new HashMap();
        j80 = new HashMap();
        Lm = new HashMap();
        b6 = new HashMap();
        Nr = new ArrayList();
        vI0 = new PJ0(null);
        coM2 = new ArrayList();
        aY = new fw0_0(Ed0());
        AG = new tk_1((f.qw0_0)(Object)this);
        z60 = new hq0_0((f.qw0_0)(Object)this);
    }

    public ChatEmotePickerComponent(dd0_0 document) {
        this();
        Xg(document);
    }

    public static boolean k8(char character) {
        return Character.isWhitespace(character) || ":;,.-!?".indexOf(character) >= 0
                || character == 12289 || character == 12290;
    }

    public static void Bu0(hf0_2 layout, ay_0 element, xt0_0 box, O10 floating, YA0 display) {
        boolean floats = floating != O10.Jx0;
        if (floats || display != YA0.zH) {
            layout.bN(false);
            if (!floats) {
                layout.Wq0 = Math.max(layout.FA, layout.Wq0 + box.dd);
                ArrayList left = layout.VY;
                for (int i = left.size() - 1; i >= 0; i--) {
                    if (((xt0_0) left.get(i)).Pe0() <= layout.Wq0) left.remove(i);
                }
                ArrayList right = layout.kj0;
                for (int i = right.size() - 1; i >= 0; i--) {
                    if (((xt0_0) right.get(i)).Pe0() <= layout.Wq0) right.remove(i);
                }
                layout.xQ();
            }
        }
        layout.cM(box.Ug0, box.o6, box.Oe0);
        int width = layout.OE0;
        if (box.Ug0 > width) box.Ug0 = width;
        if (floats) {
            if (floating == O10.E30) {
                box.bW = layout.XD(box.Oe0) - box.Ug0;
                layout.kj0.add(box);
            } else {
                box.bW = layout.aH(box.o6);
                layout.VY.add(box);
            }
        } else if (display == YA0.zH) {
            if (layout.Zc0() < box.Ug0 && !layout.Sq0()) layout.bN(false);
            int x = layout.Bf;
            layout.Bf = x + box.Ug0;
            box.bW = x;
        } else {
            D90 style = element.Ph;
            I0 property = I0.HORIZONTAL_ALIGNMENT;
            int alignment = ((ac0_2) style.x90(property).Kj0(property)).ordinal();
            if (alignment == 1) {
                box.bW = layout.XD(box.Oe0) - box.Ug0;
            } else if (alignment == 2 || alignment == 3) {
                box.bW = kq_0.lpT2(layout.OE0, box.Ug0, 2, layout.Za);
            } else {
                box.bW = layout.aH(box.o6);
            }
        }
        layout.Z7.add(box);
        if (floats) {
            if (!i2 && layout.BE != layout.Z7.size() - 1) throw new AssertionError();
            layout.BE++;
            box.PS = Math.max(layout.FA, layout.Wq0 + box.dd);
            layout.xQ();
        } else if (display != YA0.zH) {
            layout.ng = Math.min(layout.ng, Math.max(0, layout.OE0 - box.Ug0));
            layout.bN(false);
        }
    }

    public final void Us0() {
        int width = -1;
        int height = -1;
        if (ws0 == null) {
            width = 0;
            height = 0;
        } else {
            int preferred = Ya0;
            if (preferred > 0) {
                int padding = e80 + NV;
                preferred = Math.max(0, preferred - padding);
                if (Math.max(0, R1() - padding) < preferred) {
                    PJ0 root = new PJ0(null);
                    zk0_1 context = Em0;
                    if (context != null) context.AK.getClass();
                    root.Ug0 = preferred;
                    hf0_2 layout = new hf0_2((f.qw0_0)(Object)this, root, 0, 0, 0, false);
                    ST(layout, ws0);
                    layout.oq0();
                    width = Math.max(0, preferred - layout.ng);
                    height = layout.Wq0;
                }
            }
        }
        Qu = new L50(width, height);
    }

    public final void hs0() {
        xt0_0 hovered = null;
        if (mK0) hovered = vI0.RZ(Yy - (A20 + e80), Qw - (SB0 + y9));
        if (Jb0 != hovered) {
            Jb0 = hovered;
            vI0.Iz0(hovered);
            MD0 state = oC;
            aY.eD.Mk(state);
            aY.im.Mk(state);
            yB0();
        }
        Zt = hovered != null && hovered.jv != null ? wt0 : yT;
        M.j70(oC, mK0);
    }

    public final void ST(hf0_2 layout, Iterable elements) {
        for (Object element : elements) Az0(layout, (ay_0) element);
    }

    public final void Az0(hf0_2 layout, ay_0 element) {
        I0 property = I0.CLEAR;
        layout.zc0((xv_1) element.Ph.x90(property).Kj0(property));
        if (element instanceof B60) {
            layoutText(layout, (B60) element);
            return;
        }
        if (element instanceof pa0_1) {
            layout.bN(true);
            return;
        }
        if (layout.js) {
            layout.bN(false);
            layout.js = false;
        }
        if (element instanceof QR) {
            QR paragraph = (QR) element;
            D90 style = paragraph.Ph;
            Y30 font = I80(style);
            lq(layout, style);
            xt0_0 box = layout.X50(paragraph);
            layout.ok0(style, font, true);
            for (Object child : paragraph) Az0(layout, (ay_0) child);
            if (layout.Ij == ac0_2.D4) layout.Ij = ac0_2.LpT3;
            layout.bN(false);
            layout.NL = false;
            box.L70 = layout.Wq0 - box.PS;
            ux(layout, style);
        } else if (element instanceof O80) {
            O80 image = (O80) element;
            wl0_2 resource = MI0(image.t00);
            if (resource == null) return;
            cc_1 box = new cc_1(image, resource);
            box.jv = layout.oa;
            iD(layout, image, box);
        } else if (element instanceof oe0_1) {
            oe0_1 reference = (oe0_1) element;
            le0_2 widget = (le0_2) j80.get(reference.cc);
            if (widget == null) {
                s7_0 factory = (s7_0) Lm.get(reference.cc);
                if (factory != null) {
                    String name = reference.xi0;
                    lpt3__2 player = new lpt3__2(factory, name, name);
                    player.uf("chat-playername");
                    widget = player;
                }
                if (widget == null) return;
            }
            if (widget.K20 != null) {
                Logger.getLogger(ChatEmotePickerComponent.class.getName()).log(Level.SEVERE, "Widget already added: {0}", widget);
                return;
            }
            super.F9(fU(), widget);
            widget.lt0();
            ja0_2 box = new ja0_2(reference, widget);
            box.Ug0 = widget.Mx;
            box.L70 = widget.OB;
            iD(layout, reference, box);
        } else if (element instanceof vp_2) {
            vp_2 list = (vp_2) element;
            D90 style = list.Ph;
            lq(layout, style);
            property = I0.LIST_STYLE_IMAGE;
            String name = (String) style.x90(property).Kj0(property);
            wl0_2 image = name == null ? null : MI0(name);
            if (image != null) {
                cc_1 marker = new cc_1(list, image);
                marker.Oe0 = (short) Math.max(0, gA(style, I0.PADDING_LEFT, layout.y50, 0));
                Bu0(layout, list, marker, O10.E9, YA0.ou0);
                int height = marker.L70;
                marker.L70 = 32767;
                for (Object child : list) Az0(layout, (ay_0) child);
                marker.L70 = height;
                layout.VY.remove(marker);
                int bottom = marker.Pe0();
                layout.bN(false);
                if (bottom > layout.Wq0) {
                    layout.Wq0 = bottom;
                    pruneFloats(layout);
                }
                layout.xQ();
            } else {
                for (Object child : list) Az0(layout, (ay_0) child);
                layout.bN(false);
            }
            ux(layout, style);
        } else if (element instanceof s0_0) {
            s0_0 list = (s0_0) element;
            D90 style = list.Ph;
            Y30 font = I80(style);
            w50_0 paint = null;
            if (font != null) {
                property = I0.COLOR;
                gn_0 color = (gn_0) style.x90(property).Kj0(property);
                property = I0.COLOR_HOVER;
                gn_0 hover = (gn_0) style.x90(property).Kj0(property);
                paint = new w50_0(font, color, hover);
            }
            if (paint == null) return;
            lq(layout, style);
            xt0_0 box = layout.X50(list);
            int start = Math.max(1, list.fv0);
            int count = list.lt0.size();
            property = I0.LIST_STYLE_TYPE;
            sw0 numbering = (sw0) style.x90(property).Kj0(property);
            String[] labels = new String[count];
            int indent = Math.max(0, gA(style, I0.PADDING_LEFT, layout.y50, 0));
            for (int i = 0; i < count; i++) {
                String label = numbering.MB(start + i).concat(". ");
                labels[i] = label;
                indent = Math.max(indent, ((zb0_2) paint.bW).computeTextWidth(label));
            }
            for (int i = 0; i < count; i++) {
                String label = labels[i];
                ay_0 child = (ay_0) list.lt0.get(i);
                D90 childStyle = child.Ph;
                lq(layout, childStyle);
                wj0_0 marker = new wj0_0(list, paint, label, 0, label.length(), layout.Dk0);
                int width = marker.Ug0;
                int height = marker.L70;
                marker.Ug0 = width + Math.max(0, gA(childStyle, I0.PADDING_LEFT, layout.y50, 0));
                Bu0(layout, list, marker, O10.E9, YA0.ou0);
                marker.bW = Math.max(0, indent - width) + marker.bW;
                marker.L70 = 32767;
                Az0(layout, child);
                marker.L70 = height;
                layout.VY.remove(marker);
                int bottom = marker.Pe0();
                layout.bN(false);
                if (bottom > layout.Wq0) {
                    layout.Wq0 = bottom;
                    pruneFloats(layout);
                }
                layout.xQ();
                ux(layout, childStyle);
            }
            box.L70 = layout.Wq0 - box.PS;
            ux(layout, style);
        } else if (element instanceof rz_1) {
            b9(layout, (rz_1) element);
        } else if (element instanceof xi_0) {
            layoutTable(layout, (xi_0) element);
        } else if (element instanceof rv0_0) {
            rv0_0 link = (rv0_0) element;
            String previous = layout.oa;
            layout.oa = link.n3;
            property = I0.DISPLAY;
            if ((YA0) link.Ph.x90(property).Kj0(property) == YA0.ou0) {
                b9(layout, link);
            } else {
                D90 style = link.Ph;
                lq(layout, style);
                layout.X50(link);
                ST(layout, link);
                ux(layout, style);
            }
            layout.oa = previous;
        } else if (element instanceof gb0_0) {
            gb0_0 container = (gb0_0) element;
            D90 style = container.Ph;
            lq(layout, style);
            layout.X50(container);
            ST(layout, container);
            ux(layout, style);
        } else {
            Logger.getLogger(ChatEmotePickerComponent.class.getName()).log(Level.SEVERE, "Unknown Element subclass: {0}", element.getClass());
        }
    }

    private static void pruneFloats(hf0_2 layout) {
        ArrayList left = layout.VY;
        for (int i = left.size() - 1; i >= 0; i--) {
            if (((xt0_0) left.get(i)).Pe0() <= layout.Wq0) left.remove(i);
        }
        ArrayList right = layout.kj0;
        for (int i = right.size() - 1; i >= 0; i--) {
            if (((xt0_0) right.get(i)).Pe0() <= layout.Wq0) right.remove(i);
        }
        layout.xQ();
    }

    private void layoutText(hf0_2 layout, B60 element) {
        ai_2 cache = (ai_2) CD.get(element.hashCode());
        if (cache != null) {
            layout.Wq0 = cache.II0;
            layout.Bf = cache.fi0;
            layout.BE = cache.yz;
            layout.EF0 = cache.yj0;
            layout.wm = cache.Hx0;
            layout.Hn = cache.DD;
            layout.zI0 = cache.Tr;
            layout.FA = cache.Vs;
            layout.Xh = cache.ur;
            layout.Za = cache.Ma;
            layout.OE0 = cache.l7;
            layout.vY = cache.wt;
            layout.kh0 = cache.AN;
            layout.cF0 = cache.Mh;
            layout.gv = cache.Cb0;
            layout.ng = cache.Com9;
            layout.NL = cache.QS;
            layout.x1 = cache.CoM8;
            layout.js = cache.jI0;
            layout.Ij = cache.Kp;
            layout.oa = cache.tq0;
            layout.FA0 = cache.YC0;
            layout.Z7.addAll(cache.oC0);
            return;
        }
        cache = new ai_2();
        String text = element.br;
        D90 style = element.Ph;
        Y30 font = I80(style);
        w50_0 paint = null;
        if (font != null) {
            I0 property = I0.COLOR;
            gn_0 color = (gn_0) style.x90(property).Kj0(property);
            property = I0.COLOR_HOVER;
            gn_0 hover = (gn_0) style.x90(property).Kj0(property);
            paint = new w50_0(font, color, hover);
        }
        I0 property = I0.PREFORMATTED;
        boolean preformatted = (Boolean) style.x90(property).Kj0(property);
        if (paint == null) return;
        property = I0.INHERIT_HOVER;
        D90 hoverStyle = style.x90(property);
        Object[] values = hoverStyle.DS;
        Object value = values == null ? null : values[property.Ww0];
        Boolean inheritValue = (Boolean) property.MH.cast(value);
        boolean inherit = inheritValue != null ? inheritValue : layout.FA0 != null && layout.FA0 == style.im0;
        layout.ok0(style, paint.bW, false);
        if (preformatted && !layout.js) layout.bN(false);
        if (preformatted) {
            int index = 0;
            while (index < text.length()) {
                int end = text.indexOf('\n', index);
                if (end < 0) end = text.length();
                Y30 textFont = paint.bW;
                for (;;) {
                    while (index < end) {
                        if (text.charAt(index) == '\t') {
                            index++;
                            D90 tabStyle = element.Ph;
                            zb0_2 metrics = (zb0_2) textFont;
                            int em = metrics.getEM();
                            I0 tabProperty = I0.TAB_SIZE;
                            layout.Mq0.getClass();
                            int tabSize = (Integer) tabStyle.x90(tabProperty).Kj0(tabProperty);
                            int next;
                            if (tabSize > 0 && em > 0) {
                                int interval = Math.min(tabSize, 32767 / em) * em;
                                int relative = layout.Bf - layout.Za;
                                next = layout.Bf + interval - (metrics.getSpaceWidth() + relative) % interval;
                            } else {
                                next = layout.Bf + metrics.getSpaceWidth();
                            }
                            if (next < layout.OE0) layout.Bf = next;
                            else if (!layout.Sq0()) break;
                        }
                        int nextTab = text.indexOf('\t', index);
                        if (nextTab < 0 || nextTab >= end) nextTab = end;
                        if (nextTab > index) {
                            int visible = ((zb0_2) textFont).computeVisibleGlpyhs(text, index, nextTab, layout.Zc0());
                            if (visible == 0 && !layout.Sq0()) break;
                            nextTab = index + Math.max(1, visible);
                            wj0_0 box = new wj0_0(element, paint, text, index, nextTab, layout.Dk0);
                            int x = layout.Bf;
                            layout.Bf = x + box.Ug0;
                            box.bW = x;
                            box.dd = (short) layout.wm;
                            box.Wt0 = inherit;
                            layout.Z7.add(box);
                            box.dh0 = true;
                            cache.oC0.add(box);
                        }
                        index = nextTab;
                    }
                    if (index >= end) {
                        if (end < text.length() && text.charAt(end) == '\n') {
                            index = end + 1;
                            layout.bN(true);
                        } else {
                            index = end;
                        }
                        break;
                    }
                    layout.bN(false);
                }
            }
        } else {
            int index = 0;
            int end = text.length();
            while (index < end && Character.isWhitespace(text.charAt(index))) index++;
            boolean trailingSpace = false;
            while (end > index && Character.isWhitespace(text.charAt(end - 1))) {
                trailingSpace = true;
                end--;
            }
            Y30 textFont = paint.bW;
            if (index > 0) {
                int size = layout.Z7.size();
                if (layout.BE < size) {
                    xt0_0 previous = (xt0_0) layout.Z7.get(size - 1);
                    boolean addSpace = true;
                    if (previous instanceof wj0_0) {
                        wj0_0 run = (wj0_0) previous;
                        addSpace = !Character.isWhitespace(run.c60.charAt(run.Yt - 1));
                    }
                    if (addSpace) layout.Bf += ((zb0_2) textFont).getSpaceWidth();
                }
            }
            Boolean breakWord = null;
            while (index < end) {
                if (!i2 && Character.isWhitespace(text.charAt(index))) throw new AssertionError();
                int visibleEnd;
                int wordEnd;
                if (layout.Ij != ac0_2.D4) {
                    visibleEnd = index + ((zb0_2) textFont).computeVisibleGlpyhs(text, index, end, layout.Zc0());
                    if (visibleEnd < end) {
                        wordEnd = visibleEnd;
                        while (wordEnd > index && ":;,.-!?".indexOf(text.charAt(wordEnd)) >= 0) wordEnd--;
                        if (!k8(text.charAt(wordEnd))) {
                            while (wordEnd > index && !k8(text.charAt(wordEnd - 1))) wordEnd--;
                        }
                    } else {
                        wordEnd = visibleEnd;
                    }
                    while (wordEnd > index && Character.isWhitespace(text.charAt(wordEnd - 1))) wordEnd--;
                } else {
                    visibleEnd = index;
                    wordEnd = index;
                }
                boolean forced = false;
                if (wordEnd == index) {
                    if (layout.Ij != ac0_2.D4 && layout.bN(false)) continue;
                    if (breakWord == null) {
                        property = I0.BREAKWORD;
                        breakWord = (Boolean) element.Ph.x90(property).Kj0(property);
                    }
                    if (breakWord) {
                        if (visibleEnd == index) visibleEnd = index + 1;
                        wordEnd = visibleEnd;
                    } else {
                        while (wordEnd < end && !k8(text.charAt(wordEnd))) wordEnd++;
                        visibleEnd = wordEnd;
                        while (visibleEnd < end && ":;,.-!?".indexOf(text.charAt(visibleEnd)) >= 0) visibleEnd++;
                        wordEnd = visibleEnd;
                    }
                    forced = true;
                }
                if (index < wordEnd) {
                    wj0_0 box = new wj0_0(element, paint, text, index, wordEnd, layout.Dk0);
                    if (forced) layout.cM(box.Ug0, layout.Hn, layout.zI0);
                    if (layout.Ij == ac0_2.D4 && layout.Zc0() < box.Ug0) layout.bN(false);
                    int advance = box.Ug0;
                    if (wordEnd < end && Character.isWhitespace(text.charAt(wordEnd))) advance += ((zb0_2) textFont).getSpaceWidth();
                    int x = layout.Bf;
                    layout.Bf = x + advance;
                    box.bW = x;
                    box.dd = (short) layout.wm;
                    box.jv = layout.oa;
                    box.Wt0 = inherit;
                    layout.Z7.add(box);
                    box.dh0 = true;
                    cache.oC0.add(box);
                }
                index = wordEnd;
                while (index < end && Character.isWhitespace(text.charAt(index))) index++;
            }
            if (!layout.Sq0() && trailingSpace) layout.Bf += ((zb0_2) textFont).getSpaceWidth();
        }
        layout.js = preformatted;
        cache.II0 = layout.Wq0;
        cache.fi0 = layout.Bf;
        cache.yz = layout.BE;
        cache.yj0 = layout.EF0;
        cache.Hx0 = layout.wm;
        cache.DD = layout.Hn;
        cache.Tr = layout.zI0;
        cache.Vs = layout.FA;
        cache.ur = layout.Xh;
        cache.Ma = layout.Za;
        cache.l7 = layout.OE0;
        cache.wt = layout.vY;
        cache.AN = layout.kh0;
        cache.Mh = layout.cF0;
        cache.Cb0 = layout.gv;
        cache.Com9 = layout.ng;
        cache.QS = layout.NL;
        cache.CoM8 = layout.x1;
        cache.jI0 = layout.js;
        cache.Kp = layout.Ij;
        cache.tq0 = layout.oa;
        cache.YC0 = layout.FA0;
        CD.put(element.hashCode(), cache);
    }

    private void layoutTable(hf0_2 layout, xi_0 table) {
        int columns = table.SE0;
        int rows = table.We0;
        int spacing = table.Y3;
        int cellPadding = table.Yv;
        D90 style = table.Ph;
        if (columns == 0 || rows == 0) return;
        lq(layout, style);
        xt0_0 tableBox = layout.X50(table);
        int x = layout.aH(Math.max(0, gA(style, I0.MARGIN_LEFT, layout.y50, 0)));
        int available = Math.max(0, layout.XD(Math.max(0, gA(style, I0.MARGIN_RIGHT, layout.y50, 0))) - x);
        int width = Math.min(available, gA(style, I0.WIDTH, layout.y50, Integer.MIN_VALUE));
        boolean automatic = width == Integer.MIN_VALUE;
        if (width <= 0) width = available;
        int[] widths = new int[columns];
        int[] gaps = new int[columns + 1];
        boolean[] fixed = new boolean[columns];
        gaps[0] = Math.max(spacing, Math.max(0, gA(style, I0.PADDING_LEFT, layout.y50, 0)));
        int measuredColumns = table.SE0;
        int measuredRows = table.We0;
        int measuredSpacing = table.Y3;
        int measuredPadding = table.Yv;
        HashMap<Integer, Integer> spans = null;
        for (int column = 0; column < measuredColumns; column++) {
            int columnWidth = 0;
            int left = 0;
            int right = 0;
            boolean explicit = false;
            for (int row = 0; row < measuredRows; row++) {
                L30 cell = table.FE(row, column);
                if (cell == null) continue;
                D90 cellStyle = cell.Ph;
                int span = cell.E;
                int desired = gA(cellStyle, I0.WIDTH, width, Integer.MIN_VALUE);
                if (desired == Integer.MIN_VALUE && (span > 1 || !explicit)) {
                    int padLeft = Math.max(measuredPadding, Math.max(0, gA(cellStyle, I0.PADDING_LEFT, width, 0)));
                    int padRight = Math.max(measuredPadding, Math.max(0, gA(cellStyle, I0.PADDING_RIGHT, width, 0)));
                    PJ0 measure = new PJ0(null);
                    measure.Ug0 = width;
                    hf0_2 measured = R20(measure, width, padLeft, padRight, cell, null, false);
                    measured.oq0();
                    desired = width - measured.ng;
                } else if (span == 1 && desired >= 0) {
                    explicit = true;
                }
                if (span > 1) {
                    if (spans == null) spans = new HashMap<>();
                    Integer key = (column << 16) + span;
                    Integer previous = spans.get(key);
                    if (previous == null || desired > previous) spans.put(key, desired);
                } else {
                    columnWidth = Math.max(columnWidth, desired);
                    left = Math.max(left, gA(cellStyle, I0.MARGIN_LEFT, width, 0));
                    right = Math.max(right, gA(cellStyle, I0.MARGIN_LEFT, width, 0));
                }
            }
            fixed[column] = explicit;
            widths[column] = columnWidth;
            gaps[column] = Math.max(gaps[column], left);
            gaps[column + 1] = Math.max(measuredSpacing, right);
        }
        if (spans != null) {
            for (Map.Entry<Integer, Integer> entry : spans.entrySet()) {
                int key = entry.getKey();
                int first = key >>> 16;
                int span = key & 65535;
                int remaining = entry.getValue();
                int flexible = span;
                for (int i = 0; i < span; i++) {
                    int column = first + i;
                    if (fixed[column]) {
                        remaining -= widths[column];
                        flexible--;
                    }
                }
                if (remaining <= 0) continue;
                for (int i = 0; i < span && flexible > 0; i++) {
                    int column = first + i;
                    if (!fixed[column]) {
                        int share = remaining / flexible;
                        widths[column] = Math.max(widths[column], share);
                        remaining -= share;
                        flexible--;
                    }
                }
            }
        }
        gaps[columns] = Math.max(gaps[columns], Math.max(0, gA(style, I0.PADDING_RIGHT, layout.y50, 0)));
        int totalGaps = 0;
        for (int gap : gaps) totalGaps += gap;
        int totalWidth = 0;
        for (int columnWidth : widths) totalWidth += columnWidth;
        if (automatic) width = Math.min(available, totalWidth + totalGaps);
        int contentWidth = Math.max(0, width - totalGaps);
        if (contentWidth != totalWidth && totalWidth > 0) {
            int remainingWidth = contentWidth;
            int remainingOriginal = totalWidth;
            int flexible = columns;
            for (int i = 0; i < columns; i++) {
                if (fixed[i]) {
                    remainingWidth -= widths[i];
                    remainingOriginal -= widths[i];
                    flexible--;
                }
            }
            boolean resizeAll = false;
            if (contentWidth < 0) {
                resizeAll = true;
                flexible = columns;
            } else {
                contentWidth = remainingWidth;
                totalWidth = remainingOriginal;
            }
            for (int i = 0; i < columns && flexible > 0; i++) {
                if (resizeAll || !fixed[i]) {
                    int original = widths[i];
                    int resized = totalWidth > 0 ? original * contentWidth / totalWidth : 0;
                    widths[i] = resized;
                    contentWidth -= resized;
                    totalWidth -= original;
                }
            }
        }
        cc_1 background = cx(layout, table);
        layout.Ij = ac0_2.LpT3;
        layout.Wq0 += Math.max(spacing, Math.max(0, gA(style, I0.PADDING_TOP, layout.y50, 0)));
        cc_1[] cellBackgrounds = new cc_1[columns];
        for (int row = 0; row < rows; row++) {
            if (row > 0) layout.Wq0 += spacing;
            cc_1 rowBackground = null;
            D90 rowStyle = table.Bs[row];
            if (rowStyle != null) {
                int margin = Math.max(0, gA(rowStyle, I0.MARGIN_TOP, width, 0));
                layout.Wq0 = Math.max(layout.FA, layout.Wq0 + margin);
                I0 property = I0.BACKGROUND_IMAGE;
                String name = (String) rowStyle.x90(property).Kj0(property);
                wl0_2 image = name == null ? null : MI0(name);
                if (image != null) {
                    rowBackground = new cc_1(table, image);
                    rowBackground.PS = layout.Wq0;
                    rowBackground.bW = x;
                    rowBackground.Ug0 = width;
                    layout.Mc.nF.add(rowBackground);
                }
                layout.Wq0 += Math.max(0, gA(rowStyle, I0.PADDING_TOP, width, 0));
                layout.kh0 = Math.max(0, gA(rowStyle, I0.HEIGHT, width, 0));
            }
            int cellX = x;
            for (int column = 0; column < columns; column++) {
                cellX += gaps[column];
                L30 cell = table.FE(row, column);
                int cellWidth = widths[column];
                if (cell != null) {
                    for (int i = 1; i < cell.E; i++) {
                        int next = column + i;
                        cellWidth += gaps[next] + widths[next];
                    }
                    D90 cellStyle = cell.Ph;
                    int padLeft = Math.max(cellPadding, Math.max(0, gA(cellStyle, I0.PADDING_LEFT, width, 0)));
                    int padRight = Math.max(cellPadding, Math.max(0, gA(cellStyle, I0.PADDING_RIGHT, width, 0)));
                    PJ0 box = new PJ0(cell);
                    cc_1 cellBackground = cx(layout, cell);
                    if (cellBackground != null) {
                        cellBackground.bW = cellX;
                        cellBackground.Ug0 = cellWidth;
                        cellBackground.ho0 = box;
                        cellBackgrounds[column] = cellBackground;
                    }
                    box.bW = cellX;
                    box.PS = layout.Wq0;
                    box.Ug0 = cellWidth;
                    box.dd = (short) Math.max(0, gA(cellStyle, I0.MARGIN_TOP, width, 0));
                    layout.Z7.add(box);
                    R20(box, width, padLeft, padRight, cell, null, layout.Dk0);
                    column += Math.max(0, cell.E - 1);
                }
                cellX += cellWidth;
            }
            layout.bN(false);
            for (int column = 0; column < columns; column++) {
                cc_1 cellBackground = cellBackgrounds[column];
                if (cellBackground != null) {
                    cellBackground.L70 = layout.Wq0 - cellBackground.PS;
                    cellBackgrounds[column] = null;
                }
            }
            if (rowStyle != null) {
                int bottom = Math.max(0, gA(rowStyle, I0.PADDING_BOTTOM, width, 0)) + layout.Wq0;
                layout.Wq0 = bottom;
                if (rowBackground != null) rowBackground.L70 = bottom - rowBackground.PS;
                ux(layout, rowStyle);
            }
        }
        layout.Wq0 += Math.max(spacing, Math.max(0, gA(style, I0.PADDING_BOTTOM, layout.y50, 0)));
        pruneFloats(layout);
        layout.ng = Math.min(layout.ng, Math.max(0, layout.OE0 - width));
        if (background != null) {
            background.L70 = layout.Wq0 - background.PS;
            background.bW = x;
            background.Ug0 = width;
        }
        tableBox.bW = x;
        tableBox.Ug0 = width;
        tableBox.L70 = layout.Wq0 - tableBox.PS;
        ux(layout, style);
    }

    public final void iD(hf0_2 layout, ay_0 element, xt0_0 box) {
        D90 style = element.Ph;
        I0 property = I0.FLOAT_POSITION;
        O10 floating = (O10) style.x90(property).Kj0(property);
        property = I0.DISPLAY;
        YA0 display = (YA0) style.x90(property).Kj0(property);
        box.dd = (short) Math.max(0, gA(style, I0.MARGIN_TOP, layout.y50, 0));
        box.o6 = (short) Math.max(0, gA(style, I0.MARGIN_LEFT, layout.y50, 0));
        box.Oe0 = (short) Math.max(0, gA(style, I0.MARGIN_RIGHT, layout.y50, 0));
        box.yn = (short) Math.max(0, gA(style, I0.MARGIN_BOTTOM, layout.y50, 0));
        int height = box.L70;
        int width = gA(style, I0.WIDTH, layout.y50, box.Ug0);
        if (width > 0) {
            int original = box.Ug0;
            if (original > 0) height = width * box.L70 / original;
            box.Ug0 = width;
        }
        int explicitHeight = gA(style, I0.HEIGHT, box.L70, height);
        if (explicitHeight > 0) box.L70 = explicitHeight;
        Bu0(layout, element, box, floating, display);
    }

    public final Y30 I80(D90 style) {
        I0 property = I0.FONT_FAMILIES;
        r50_0 family = (r50_0) style.x90(property).Kj0(property);
        if (family != null && WI0 != null) {
            do {
                Y30 font = ((LC0) WI0).D8(family.Wo0);
                if (font != null) return font;
                family = family.g9;
            } while (family != null);
        }
        return pM;
    }

    public final wl0_2 MI0(String name) {
        wl0_2 image = (wl0_2) b6.get(name);
        if (image != null) return image;
        if (Nr.size() <= 0) {
            QS images = a90;
            return images == null ? null : ((LC0) images).uT(name);
        }
        i80_0.Xj(Nr.get(0));
        throw null;
    }

    public final void lq(hf0_2 layout, D90 style) {
        int margin = Math.max(0, gA(style, I0.MARGIN_TOP, layout.y50, 0));
        layout.bN(false);
        int top = Math.max(layout.FA, layout.Wq0 + margin);
        layout.bN(false);
        if (top > layout.Wq0) {
            layout.Wq0 = top;
            ArrayList left = layout.VY;
            for (int i = left.size() - 1; i >= 0; i--) {
                if (((xt0_0) left.get(i)).Pe0() <= layout.Wq0) left.remove(i);
            }
            ArrayList right = layout.kj0;
            for (int i = right.size() - 1; i >= 0; i--) {
                if (((xt0_0) right.get(i)).Pe0() <= layout.Wq0) right.remove(i);
            }
            layout.xQ();
        }
    }

    public final void ux(hf0_2 layout, D90 style) {
        int margin = Math.max(0, gA(style, I0.MARGIN_BOTTOM, layout.y50, 0));
        if (layout.Sq0()) layout.FA = Math.max(layout.FA, layout.Wq0 + margin);
        else layout.Xh = Math.max(layout.Xh, margin);
    }

    public final hf0_2 R20(PJ0 root, int width, int left, int right, gb0_0 element, String link, boolean widgets) {
        D90 style = element.Ph;
        int top = Math.max(0, gA(style, I0.PADDING_TOP, width, 0));
        int bottom = Math.max(0, gA(style, I0.PADDING_BOTTOM, width, 0));
        int margin = Math.max(0, gA(style, I0.MARGIN_BOTTOM, width, 0));
        hf0_2 layout = new hf0_2((f.qw0_0)(Object)this, root, left, right, top, widgets);
        layout.oa = link;
        layout.FA0 = style;
        for (Object child : element) Az0(layout, (ay_0) child);
        layout.oq0();
        int height = layout.Wq0 + bottom;
        int actual = Math.max(height, gA(style, I0.HEIGHT, height, height));
        if (actual > height) {
            int offset = 0;
            I0 property = I0.VERTICAL_ALIGNMENT;
            int alignment = ((qi_2) style.x90(property).Kj0(property)).ordinal();
            if (alignment == 2) offset = actual - height;
            else if (alignment == 1 || alignment == 3) offset = (actual - height) / 2;
            if (offset > 0) {
                for (int i = 0, size = root.wJ0.size(); i < size; i++) {
                    xt0_0 child = (xt0_0) root.wJ0.get(i);
                    child.PS += offset;
                }
                char[] lines = root.me;
                if (lines.length > 0) {
                    if (lines[1] == 0) {
                        lines[0] = (char) (lines[0] + offset);
                    } else {
                        int length = lines.length;
                        char[] shifted = new char[length + 2];
                        shifted[0] = (char) offset;
                        for (int i = 0; i < length; i += 2) {
                            char[] current = root.me;
                            int value = current[i];
                            if (value > 0) value += offset;
                            shifted[i + 2] = (char) value;
                            shifted[i + 3] = current[i + 1];
                        }
                        root.me = shifted;
                    }
                }
            }
        }
        root.L70 = actual;
        root.yn = (short) Math.max(margin, layout.FA - layout.Wq0);
        return layout;
    }

    public final void b9(hf0_2 layout, gb0_0 element) {
        layout.bN(false);
        D90 style = element.Ph;
        I0 property = I0.FLOAT_POSITION;
        O10 floating = (O10) style.x90(property).Kj0(property);
        cc_1 background = cx(layout, element);
        int top = Math.max(0, gA(style, I0.MARGIN_TOP, layout.y50, 0));
        int left = Math.max(0, gA(style, I0.MARGIN_LEFT, layout.y50, 0));
        int right = Math.max(0, gA(style, I0.MARGIN_RIGHT, layout.y50, 0));
        int x = layout.aH(left);
        top = Math.max(layout.FA, layout.Wq0 + top);
        int available = Math.max(0, layout.XD(right) - x);
        int padLeft = Math.max(0, gA(style, I0.PADDING_LEFT, layout.y50, 0));
        int padRight = Math.max(0, gA(style, I0.PADDING_RIGHT, layout.y50, 0));
        int width;
        if (floating == O10.Jx0) {
            width = gA(style, I0.WIDTH, available, available);
        } else {
            width = gA(style, I0.WIDTH, layout.y50, Integer.MIN_VALUE);
            if (width == Integer.MIN_VALUE) {
                PJ0 measure = new PJ0(null);
                measure.Ug0 = Math.max(0, layout.OE0 - padLeft - padRight);
                hf0_2 measured = R20(measure, layout.y50, padLeft, padRight, element, null, false);
                measured.bN(false);
                width = Math.max(0, measure.Ug0 - measured.ng);
            }
        }
        width = Math.max(0, width) + padLeft + padRight;
        if (floating != O10.Jx0) {
            layout.cM(width, left, right);
            x = layout.aH(left);
            top = Math.max(top, layout.Wq0);
            available = Math.max(0, layout.XD(right) - x);
        }
        width = Math.min(width, available);
        if (floating == O10.E30) x = layout.XD(right) - width;
        PJ0 box = new PJ0(element);
        box.bW = x;
        box.PS = top;
        box.Ug0 = width;
        box.o6 = (short) left;
        box.Oe0 = (short) right;
        box.jv = layout.oa;
        layout.Z7.add(box);
        hf0_2 nested = R20(box, layout.y50, padLeft, padRight, element, layout.oa, layout.Dk0);
        layout.BE = layout.Z7.size();
        if (floating == O10.Jx0) {
            int bottom = top + box.L70;
            layout.bN(false);
            if (bottom > layout.Wq0) {
                layout.Wq0 = bottom;
                ArrayList leftFloats = layout.VY;
                for (int i = leftFloats.size() - 1; i >= 0; i--) {
                    if (((xt0_0) leftFloats.get(i)).Pe0() <= layout.Wq0) leftFloats.remove(i);
                }
                ArrayList rightFloats = layout.kj0;
                for (int i = rightFloats.size() - 1; i >= 0; i--) {
                    if (((xt0_0) rightFloats.get(i)).Pe0() <= layout.Wq0) rightFloats.remove(i);
                }
                layout.xQ();
            }
            int margin = box.yn;
            if (layout.Sq0()) layout.FA = Math.max(layout.FA, layout.Wq0 + margin);
            else layout.Xh = Math.max(layout.Xh, margin);
            layout.ng = Math.min(layout.ng, nested.ng);
        } else {
            if (floating == O10.E30) layout.kj0.add(box);
            else layout.VY.add(box);
            layout.xQ();
        }
        if (background != null) {
            background.bW = x;
            background.PS = top;
            background.Ug0 = width;
            background.L70 = box.L70;
            background.ho0 = box;
        }
    }

    public final cc_1 cx(hf0_2 layout, ay_0 element) {
        D90 style = element.Ph;
        I0 property = I0.BACKGROUND_IMAGE;
        String name = (String) style.x90(property).Kj0(property);
        wl0_2 image = name == null ? null : MI0(name);
        if (image == null) {
            property = I0.BACKGROUND_COLOR;
            gn_0 color = (gn_0) style.x90(property).Kj0(property);
            if ((color.FY & 255) != 0) {
                wl0_2 white = MI0("white");
                if (white != null) {
                    wl0_2 normal = white.so(color);
                    property = I0.BACKGROUND_COLOR_HOVER;
                    gn_0 hover = (gn_0) style.x90(property).Kj0(property);
                    image = hover == null ? normal : new lb0_0(vq, null, new wl0_2[] { white.so(hover), normal });
                }
            }
        }
        if (image == null) return null;
        cc_1 background = new cc_1(element, image);
        background.PS = layout.Wq0;
        layout.Mc.nF.add(background);
        return background;
    }

    public final void Xg(sz_0 document) {
        sz_0 previous = ws0;
        if (previous != null) {
            xp_1 callbacks = (xp_1) previous;
            callbacks.RD0 = (Runnable[]) a7_0.tp0(AG, callbacks.RD0);
        }
        ws0 = document;
        ((xp_1) document).Kj(AG);
        sz_0 current = ws0;
        if (current instanceof dd0_0) ((dd0_0) current).xG0 = null;
        ws0 = document;
        ((dd0_0) document).xG0 = z60;
        ML0(true);
    }

    public final void zQ() {
        j80.clear();
        super.em();
        ML0(true);
    }

    public final void ir(op_0 listener) {
        xK = (op_0[]) a7_0.gE(xK, listener, op_0.class);
    }

    @Override
    public final void Ib(Jn0 theme) {
        super.Ib(theme);
        LC0 values = (LC0) theme;
        WI0 = values.C60("fonts");
        a90 = values.C60("images");
        pM = values.D8("font");
        yT = values.oX("mouseCursor");
        wt0 = values.oX("mouseCursor.link");
        ML0(true);
    }

    @Override
    public final void C(zk0_1 context) {
        aY.eD.W20(context);
        aY.im.W20(context);
    }

    @Override
    public final void em() {
        throw new UnsupportedOperationException("use registerWidget");
    }

    @Override
    public final le0_2 fC0(int index) {
        throw new UnsupportedOperationException("use registerWidget");
    }

    @Override
    public final int pi0() {
        if (Qu == null) Us0();
        int width = Qu.Com9;
        return width >= 0 ? width : a3();
    }

    @Override
    public final int zs0() {
        if (a3() == 0) {
            if (Qu == null) Us0();
            int height = Qu.Eg0;
            if (height >= 0) return height;
        }
        Iu();
        return vI0.L70;
    }

    @Override
    public final int m0() {
        int preferred = Ya0;
        return le0_2.du0(R1(), super.m0(), preferred);
    }

    @Override
    public final void g2(int width, int height) {
        if (width != Ya0) {
            Qu = null;
            COm3();
        }
        super.g2(width, height);
    }

    @Override
    public final void RY(int width, int height) {
        if (width != R1()) {
            Qu = null;
            COm3();
        }
        super.RY(width, height);
    }

    @Override
    public final void K8() {
        int width = a3();
        int previous = vI0.Ug0;
        if (previous == width && !QD0) return;
        if (ZA0 || previous != width) {
            ZA0 = false;
            Iterator values = CD.values().iterator();
            while (values.hasNext()) {
                ai_2 cache = (ai_2) values.next();
                for (Object value : cache.oC0) {
                    xt0_0 box = (xt0_0) value;
                    if (box instanceof wj0_0) ((wj0_0) box).dh0 = false;
                    box.xf();
                }
                values.remove();
            }
        }
        vI0.Ug0 = width;
        e3 = true;
        QD0 = false;
        zk0_1 context = Em0;
        if (context != null) context.AK.getClass();
        int height;
        try {
            vI0.xf();
            coM2.clear();
            super.em();
            hf0_2 layout = new hf0_2((f.qw0_0)(Object)this, vI0, 0, 0, 0, true);
            sz_0 document = ws0;
            if (document != null) {
                for (Object value : document) Az0(layout, (ay_0) value);
                layout.oq0();
                vI0.F4(A20 + e80, SB0 + y9);
                vI0.ku0(0, 0, coM2);
            }
            hs0();
            height = layout.Wq0;
        } finally {
            e3 = false;
        }
        PJ0 root = vI0;
        if (root.L70 != height) {
            root.L70 = height;
            if (k5() != height) COm3();
        }
    }

    @Override
    public final void FW(zk0_1 context) {
        ArrayList backgrounds = coM2;
        fw0_0 renderer = aY;
        renderer.OE = A20 + e80;
        renderer.Zg = SB0 + y9;
        renderer.lr0 = context.AK;
        for (int i = 0, size = backgrounds.size(); i < size; i++) ((cc_1) backgrounds.get(i)).BG0(renderer);
        vI0.BG0(renderer);
    }

    @Override
    public final void Ej0() {
        if (!e3) COm3();
    }

    @Override
    public final void Pp0() {
    }

    @Override
    public final void t5() {
        super.t5();
        vI0.xf();
        coM2.clear();
        super.em();
        ML0(true);
    }

    @Override
    public boolean nd0(i70_0 event) {
        if (super.nd0(event)) return true;
        int type = event.zu;
        if (!E00.C10(type)) return false;
        if (xD0) {
            if (event.LI0()) {
                xD0 = false;
                mK0 = yv0(event.f8, event.AN);
                Yy = event.f8;
                Qw = event.AN;
                hs0();
            }
            return true;
        }
        mK0 = yv0(event.f8, event.AN);
        Yy = event.f8;
        Qw = event.AN;
        hs0();
        if (type == 8) return false;
        if (type == 6) {
            if (!i2 && xD0) throw new AssertionError();
            xD0 = true;
            return true;
        }
        xt0_0 hovered = Jb0;
        if (hovered != null && (type == 5 || type == 3 || type == 4)) {
            ay_0 element = hovered.oJ;
            op_0[] listeners = xK;
            if (listeners != null) {
                for (op_0 listener : listeners) {
                    if (!(listener instanceof vy_0)) continue;
                    XH chat = ((vy_0) listener).Pk0;
                    chat.getClass();
                    if (event.zu != 3 || element == null) continue;
                    boolean channel = false;
                    B60 text = null;
                    if (element instanceof rz_1) {
                        rz_1 link = (rz_1) element;
                        int index = link.lt0.size() - 1;
                        ay_0 last = (ay_0) link.lt0.get(index);
                        if (last instanceof B60) text = (B60) last;
                    } else if (element instanceof B60) {
                        text = (B60) element;
                        for (zo_0 candidate : zo_0.JG) {
                            if (!candidate.g3) continue;
                            String name = sm0_0.c0(candidate.Yf);
                            if (text.br.contains(name)) {
                                chat.D20(candidate);
                                channel = true;
                            }
                        }
                    }
                    if (text != null && event.nA0 == 1 && !channel) {
                        Qy0.yI0.eU(event.f8, event.AN, text.br);
                    }
                }
            }
        }
        if (type == 5) {
            hovered = Jb0;
            if (hovered != null) {
                String link = hovered.jv;
                if (link != null) {
                    op_0[] listeners = xK;
                    if (listeners != null) for (op_0 listener : listeners) listener.Sy0(link);
                }
            }
        }
        return true;
    }

    @Override
    public final Object rd(int x, int y) {
        xt0_0 hovered = Jb0;
        if (hovered != null && hovered.oJ instanceof O80) return ((O80) hovered.oJ).UK;
        return super.rd(x, y);
    }

    public final void ML0(boolean clearCache) {
        if (clearCache) ZA0 = true;
        QD0 = true;
        Qu = null;
        COm3();
    }

    public final int gA(D90 style, I0 property, int reference, int defaultValue) {
        style = style.x90(property);
        g20_0 dimension = (g20_0) style.Kj0(property);
        Y30 font = null;
        if (fk0_1.Ni0(dimension.iG0)) {
            if (property == I0.FONT_SIZE) {
                style = style.im0;
                if (style == null) return 14;
            }
            font = I80(style);
            if (font == null) return 0;
        }
        float value = dimension.z00;
        switch (J90.Qj(dimension.iG0)) {
            case 1: value *= 1.3300000429F; break;
            case 2: value *= ((zb0_2) font).getEM(); break;
            case 3: value *= ((zb0_2) font).getEX(); break;
            case 4: value = (float) reference * 0.0099999998F * value; break;
            case 5: return defaultValue;
            default: break;
        }
        if (value >= 32767.0F) return 32767;
        if (value <= -32768.0F) return -32768;
        return Math.round(value);
    }

    @Override
    public final void F9(int index, le0_2 widget) {
        throw new UnsupportedOperationException("use registerWidget");
    }

    @Override
    public final void XK0() {
    }

    @Override
    public final void zf() {
    }

    public final void i90(s7_0 factory) {
        String name = "player";
        if (j80.containsKey(name) || Lm.containsKey(name)) {
            throw new IllegalArgumentException("widget name already in registered");
        }
        Lm.put(name, factory);
    }

    public final void hY(dz_2 widget, String name) {
        if (name == null) throw new NullPointerException("name");
        if (widget.K20 != null) throw new IllegalArgumentException("Widget must not have a parent");
        if (j80.containsKey(name) || Lm.containsKey(name)) throw new IllegalArgumentException("widget name already in registered");
        if (j80.containsValue(widget)) throw new IllegalArgumentException("widget already registered");
        j80.put(name, widget);
    }
}
