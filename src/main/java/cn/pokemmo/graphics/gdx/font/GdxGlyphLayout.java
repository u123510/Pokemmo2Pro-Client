package cn.pokemmo.graphics.gdx.font;

import f.*;


import com.badlogic.gdx.graphics.Color;

public class GdxGlyphLayout implements mu_0 {
    public static final ju_0 sD0;
    public static final Nn0 k00;
    public final es_1 ld0;
    public final Nn0 Ti;
    public int pX;
    public float PRN;
    public float gv0;

    static {
        sD0 = UE0.TL0(hz_1.class);
        k00 = new Nn0(4);
    }

    public GdxGlyphLayout() {
        this.ld0 = new es_1(1);
        this.Ti = new Nn0(2);
    }

    public GdxGlyphLayout(sc_0 font, CharSequence str) {
        this.ld0 = new es_1(1);
        this.Ti = new Nn0(2);
        oz(font, str);
    }

    public GdxGlyphLayout(sc_0 font, CharSequence str, Color color, float targetWidth, int halign, boolean wrap) {
        this.ld0 = new es_1(1);
        this.Ti = new Nn0(2);
        cd(font, str, color, targetWidth, halign, wrap);
    }

    public GdxGlyphLayout(sc_0 font, CharSequence str, int start, int end, Color color, float targetWidth, int halign, boolean wrap, String truncate) {
        this.ld0 = new es_1(1);
        this.Ti = new Nn0(2);
        cc(font, str, start, end, color, targetWidth, halign, wrap, truncate);
    }

    public static void kJ(mh0_0 fontData, hz_1 run) {
        th_1 lastGlyph = (th_1) run.A30.GH0();
        lastGlyph.getClass();
        UJ0 xAdvances = run.TA0;
        xAdvances.iS[xAdvances.Or - 1] = (float) (lastGlyph.k + lastGlyph.kJ0) * fontData.o3 - fontData.XT;
    }

    public final void oz(sc_0 font, CharSequence str) {
        cc(font, str, 0, str.length(), font.Rh.pk, 0.0F, 8, false, null);
    }

    public final void cd(sc_0 font, CharSequence str, Color color, float targetWidth, int halign, boolean wrap) {
        cc(font, str, 0, str.length(), color, targetWidth, halign, wrap, null);
    }

    public final void cc(sc_0 font, CharSequence str, int start, int end, Color color, float targetWidth, int halign, boolean wrap, String truncate) {
        bL();
        mh0_0 fontData = font.U5;
        if (start == end) {
            this.gv0 = fontData.g4;
            return;
        }
        if (wrap) {
            targetWidth = Math.max(targetWidth, fontData.CM * 3.0F);
        }
        boolean wrapOrTruncate = (wrap || truncate != null);
        int colorInt = color.toIntBits();
        Nn0 colors = this.Ti;
        int[] colorItems = colors.bR;
        int currentMl = colors.Ml;
        if (currentMl + 1 >= colorItems.length) {
            colorItems = colors.Wn(Math.max(8, (int) ((float) currentMl * 1.75F)));
        }
        colorItems[currentMl] = 0;
        colorItems[currentMl + 1] = colorInt;
        colors.Ml = currentMl + 2;

        boolean markupEnabled = fontData.oj;
        if (markupEnabled) {
            k00.ja0(colorInt);
        }
        int currentColor = colorInt;
        float y = 0.0F;
        float down = fontData.U7;
        hz_1 run = null;
        th_1 lastGlyph = null;
        int runColor = colorInt;
        int runStart = start;

        int i = start;
        while (true) {
            boolean newline = false;
            int next;
            boolean endReached = false;
            if (i == end) {
                if (runStart == end) {
                    break;
                }
                endReached = true;
                next = i;
            } else {
                next = i + 1;
                char ch = str.charAt(i);
                if (ch == '\n') {
                    newline = true;
                } else if (ch == '[' && markupEnabled) {
                    int colorChange = -1;
                    if (next == end) {
                        colorChange = -1;
                    } else {
                        char ch2 = str.charAt(next);
                        if (ch2 == '#') {
                            int hexColor = 0;
                            int hexIdx = i + 2;
                            while (true) {
                                if (hexIdx >= end) {
                                    colorChange = -1;
                                    break;
                                }
                                char hc = str.charAt(hexIdx);
                                if (hc == ']') {
                                    if (hexIdx < i + 3 || hexIdx > i + 10) {
                                        colorChange = -1;
                                        break;
                                    }
                                    int hexLen = hexIdx - next;
                                    if (hexLen < 8) {
                                        hexColor = (hexColor << (9 - hexLen << 2)) | 255;
                                    }
                                    k00.ja0(Integer.reverseBytes(hexColor));
                                    colorChange = hexLen;
                                    break;
                                }
                                hexColor = (hexColor << 4) + hc;
                                if (hc >= '0' && hc <= '9') {
                                    hexColor -= 48;
                                } else if (hc >= 'A' && hc <= 'F') {
                                    hexColor -= 55;
                                } else if (hc >= 'a' && hc <= 'f') {
                                    hexColor -= 87;
                                } else {
                                    colorChange = -1;
                                    break;
                                }
                                hexIdx++;
                            }
                        } else if (ch2 == '[') {
                            colorChange = -2;
                        } else if (ch2 == ']') {
                            if (k00.Ml > 1) {
                                Nn0 nn = k00;
                                int newMl = nn.Ml - 1;
                                nn.Ml = newMl;
                                int popped = nn.bR[newMl];
                            }
                            colorChange = 0;
                        } else {
                            int nameEnd = i + 2;
                            while (nameEnd < end && str.charAt(nameEnd) != ']') {
                                nameEnd++;
                            }
                            if (nameEnd < end) {
                                String colorName = str.subSequence(next, nameEnd).toString();
                                Color namedColor = (Color) wr_0.Q1.Wk0(colorName);
                                if (namedColor == null) {
                                    colorChange = -1;
                                } else {
                                    k00.ja0(namedColor.toIntBits());
                                    colorChange = nameEnd - next;
                                }
                            }
                        }
                    }

                    if (colorChange >= 0) {
                        next += colorChange + 1;
                        if (next == end) {
                            endReached = true;
                        } else {
                            currentColor = k00.bR[k00.Ml - 1];
                        }
                    } else if (colorChange == -2) {
                        i += 2;
                        continue;
                    } else {
                        i = next;
                        continue;
                    }
                } else {
                    i = next;
                    continue;
                }
            }

            hz_1 newRun = (hz_1) sD0.obtain();
            newRun.S = 0.0F;
            newRun.Vg0 = y;
            fontData.tc0(newRun, str, runStart, i, lastGlyph);
            this.pX += newRun.A30.KB;
            if (currentColor != runColor) {
                if (this.Ti.X8(this.Ti.Ml - 2) == this.pX) {
                    this.Ti.MJ(this.Ti.Ml - 1, currentColor);
                } else {
                    this.Ti.ja0(this.pX);
                    this.Ti.ja0(currentColor);
                }
                runColor = currentColor;
            }

            if (newRun.A30.KB == 0) {
                sD0.free(newRun);
                if (run == null) {
                    if (next != 0) {
                        if (newline) {
                            run = null;
                            lastGlyph = null;
                            if (runStart == i) {
                                y += down * fontData.Mt;
                            } else {
                                y += down;
                            }
                        }
                        runStart = next;
                        runColor = currentColor;
                        i = next;
                        continue;
                    }
                }
            } else {
                if (run == null) {
                    this.ld0.Ue0(newRun);
                    run = newRun;
                } else {
                    run.A30.G6(newRun.A30.rZ, 0, newRun.A30.KB);
                    if (run.TA0.Or > 0) {
                        run.TA0.Or--;
                    }
                    run.TA0.KN(0, newRun.TA0.Or, newRun.TA0.iS);
                    sD0.free(newRun);
                }
            }

            if (endReached || newline) {
                kJ(fontData, run);
                lastGlyph = null;
            } else {
                lastGlyph = (th_1) run.A30.GH0();
            }

            if (wrapOrTruncate && run.A30.KB != 0 && (endReached || newline)) {
                if (run.TA0.Or == 0) {
                    throw new IllegalStateException("Array is empty.");
                }
                float x = run.TA0.iS[0] + run.TA0.QJ0(1);
                int r = 2;
                while (r < run.TA0.Or) {
                    th_1 glyph = (th_1) run.A30.get(r - 1);
                    if ((float) (glyph.k + glyph.kJ0) * fontData.o3 - fontData.XT + x - 0.0001F > targetWidth) {
                        if (truncate != null) {
                            int count = run.A30.KB;
                            hz_1 truncateRun = (hz_1) sD0.obtain();
                            int truncateLen = truncate.length();
                            fontData.tc0(truncateRun, truncate, 0, truncateLen, null);
                            float truncateWidth = 0.0F;
                            if (truncateRun.TA0.Or > 0) {
                                kJ(fontData, truncateRun);
                                float[] tAdvances = truncateRun.TA0.iS;
                                for (int t = 1; t < truncateRun.TA0.Or; t++) {
                                    truncateWidth += tAdvances[t];
                                }
                            }
                            targetWidth -= truncateWidth;
                            int runLen = 0;
                            float rx = run.S;
                            float[] rAdvances = run.TA0.iS;
                            while (runLen < run.TA0.Or) {
                                rx += rAdvances[runLen];
                                if (rx > targetWidth) {
                                    break;
                                }
                                runLen++;
                            }
                            if (runLen > 1) {
                                run.A30.fu0(runLen - 1);
                                if (run.TA0.Or > runLen) {
                                    run.TA0.Or = runLen;
                                }
                                kJ(fontData, run);
                                if (truncateRun.TA0.Or > 0) {
                                    int tLen = truncateRun.TA0.Or - 1;
                                    if (tLen <= run.TA0.Or) {
                                        run.TA0.KN(1, tLen, truncateRun.TA0.iS);
                                    } else {
                                        throw new IllegalArgumentException("offset + length must be <= size: 1 + " + tLen + " <= " + run.TA0.Or);
                                    }
                                }
                            } else {
                                run.A30.clear();
                                run.TA0.Or = 0;
                                run.TA0.KN(0, truncateRun.TA0.Or, truncateRun.TA0.iS);
                            }
                            int removedCount = count - run.A30.KB;
                            if (removedCount > 0) {
                                this.pX -= removedCount;
                                if (fontData.oj) {
                                    while (this.Ti.Ml > 2 && this.Ti.X8(this.Ti.Ml - 2) >= this.pX) {
                                        this.Ti.Ml -= 2;
                                    }
                                }
                            }
                            run.A30.G6(truncateRun.A30.rZ, 0, truncateRun.A30.KB);
                            this.pX += truncate.length();
                            sD0.free(truncateRun);
                            break;
                        }

                        // wrap logic
                        Object[] glyphs = run.A30.rZ;
                        int wrapIndex = r - 1;
                        if (!mh0_0.RA0((char) ((th_1) glyphs[wrapIndex]).cJ0)) {
                            int b = wrapIndex;
                            while (b > 0) {
                                if (mh0_0.RA0((char) ((th_1) glyphs[b]).cJ0)) {
                                    wrapIndex = b + 1;
                                    break;
                                }
                                b--;
                            }
                            if (b <= 0) {
                                wrapIndex = 0;
                            }
                        }
                        if (wrapIndex != 0 || run.S != 0.0F) {
                            if (wrapIndex < run.A30.KB) {
                                // use wrapIndex
                            } else {
                                wrapIndex = r - 1;
                            }
                        } else {
                            wrapIndex = r - 1;
                        }

                        es_1 runGlyphs = run.A30;
                        int glyphsCount = runGlyphs.KB;
                        UJ0 runXAdvances = run.TA0;
                        int previousLineEnd = wrapIndex;
                        while (previousLineEnd > 0) {
                            if (!mh0_0.RA0((char) ((th_1) runGlyphs.get(previousLineEnd - 1)).cJ0)) {
                                break;
                            }
                            previousLineEnd--;
                        }
                        while (wrapIndex < glyphsCount) {
                            if (!mh0_0.RA0((char) ((th_1) runGlyphs.get(wrapIndex)).cJ0)) {
                                break;
                            }
                            wrapIndex++;
                        }

                        hz_1 nextRun = null;
                        if (wrapIndex < glyphsCount) {
                            nextRun = (hz_1) sD0.obtain();
                            es_1 nextRunGlyphs = nextRun.A30;
                            nextRunGlyphs.uL(runGlyphs, 0, previousLineEnd);
                            runGlyphs.cB(wrapIndex - 1);
                            run.A30 = nextRunGlyphs;
                            nextRun.A30 = runGlyphs;

                            UJ0 nextRunXAdvances = nextRun.TA0;
                            int offset = previousLineEnd + 1;
                            if (offset > nextRunXAdvances.Or) {
                                throw new IllegalArgumentException("offset + length must be <= size: 0 + " + offset + " <= " + runXAdvances.Or);
                            }
                            nextRunXAdvances.KN(0, offset, runXAdvances.iS);
                            int remainingSize = runXAdvances.Or - wrapIndex;
                            if (wrapIndex > runXAdvances.Or) {
                                throw new IndexOutOfBoundsException("start can't be > end: 1 > " + wrapIndex);
                            }
                            if (runXAdvances.Or < wrapIndex) {
                                throw new IndexOutOfBoundsException("end can't be >= size: " + wrapIndex + " >= " + runXAdvances.Or);
                            }
                            if (runXAdvances.Y1) {
                                System.arraycopy(runXAdvances.iS, wrapIndex, runXAdvances.iS, 1, remainingSize);
                            } else {
                                int maxOffset = Math.max(remainingSize, wrapIndex + 1);
                                System.arraycopy(runXAdvances.iS, 1, runXAdvances.iS, maxOffset, runXAdvances.Or - maxOffset);
                            }
                            runXAdvances.Or = remainingSize;
                            runXAdvances.iS[0] = -(float) ((th_1) nextRun.A30.KI()).kJ0 * fontData.o3 - fontData.Cp0;
                            run.TA0 = nextRunXAdvances;
                            nextRun.TA0 = runXAdvances;

                            int removed = run.A30.KB - nextRun.A30.KB - nextRun.A30.KB;
                            this.pX -= removed;
                            if (fontData.oj && removed > 0) {
                                int cutoff = this.pX - nextRun.A30.KB;
                                int idx = this.Ti.Ml - 2;
                                while (idx >= 2) {
                                    int pos = this.Ti.X8(idx);
                                    if (pos <= cutoff) {
                                        break;
                                    }
                                    this.Ti.MJ(idx, pos - removed);
                                    idx -= 2;
                                }
                            }
                        } else {
                            runGlyphs.fu0(previousLineEnd);
                            int newAdvSize = previousLineEnd + 1;
                            if (runXAdvances.Or > newAdvSize) {
                                runXAdvances.Or = newAdvSize;
                            }
                            int removed = wrapIndex - previousLineEnd;
                            if (removed > 0) {
                                this.pX -= removed;
                                if (fontData.oj && this.Ti.X8(this.Ti.Ml - 2) > this.pX) {
                                    int lastColor = this.Ti.bR[this.Ti.Ml - 1];
                                    while (this.Ti.X8(this.Ti.Ml - 2) > this.pX) {
                                        this.Ti.Ml -= 2;
                                    }
                                    this.Ti.MJ(this.Ti.Ml - 2, this.pX);
                                    this.Ti.MJ(this.Ti.Ml - 1, lastColor);
                                }
                            }
                        }

                        if (previousLineEnd == 0) {
                            sD0.free(run);
                            this.ld0.rq0();
                        } else {
                            kJ(fontData, run);
                        }

                        if (nextRun != null) {
                            this.ld0.Ue0(nextRun);
                            y += down;
                            nextRun.S = 0.0F;
                            nextRun.Vg0 = y;
                            run = nextRun;
                            if (nextRun.TA0.Or == 0) {
                                throw new IllegalStateException("Array is empty.");
                            }
                            x = nextRun.TA0.iS[0] + nextRun.TA0.QJ0(1);
                            r = 2;
                            continue;
                        }
                        break;
                    }
                    x += run.TA0.iS[r];
                    r++;
                }
            }

            if (next != 0) {
                if (newline) {
                    run = null;
                    lastGlyph = null;
                    if (runStart == i) {
                        y += down * fontData.Mt;
                    } else {
                        y += down;
                    }
                }
                runStart = next;
                runColor = currentColor;
                i = next;
            }
        }

        // CS:
        this.gv0 = fontData.g4 + Math.abs(y);
        float maxWidth = 0.0F;
        Object[] runs = this.ld0.rZ;
        int runCount = this.ld0.KB;
        for (int rIdx = 0; rIdx < runCount; rIdx++) {
            hz_1 r = (hz_1) runs[rIdx];
            float[] xAdvances = r.TA0.iS;
            float rx = r.S + xAdvances[0];
            float maxLineWidth = 0.0F;
            Object[] rGlyphs = r.A30.rZ;
            int gCount = r.A30.KB;
            for (int gIdx = 0; gIdx < gCount; gIdx++) {
                th_1 g = (th_1) rGlyphs[gIdx];
                maxLineWidth = Math.max(maxLineWidth, (float) (g.k + g.kJ0) * fontData.o3 - fontData.XT + rx);
                rx += xAdvances[gIdx + 1];
            }
            maxWidth = Math.max(maxWidth, Math.max(rx, maxLineWidth));
            float startX = r.S;
            r.UK = maxWidth - startX;
            maxWidth = Math.max(maxWidth, maxWidth + startX);
        }
        this.PRN = maxWidth;

        if ((halign & 8) == 0) {
            boolean center = (halign & 1) != 0;
            Object[] allRuns = this.ld0.rZ;
            int numRuns = this.ld0.KB;
            for (int rIdx = 0; rIdx < numRuns; rIdx++) {
                hz_1 r = (hz_1) allRuns[rIdx];
                float offset;
                if (center) {
                    offset = (targetWidth - r.UK) * 0.5F;
                } else {
                    offset = targetWidth - r.UK;
                }
                r.S += offset;
            }
        }
        if (markupEnabled) {
            k00.Ml = 0;
        }
    }

    @Override
    public final void bL() {
        sD0.freeAll(this.ld0);
        this.ld0.clear();
        this.Ti.Ml = 0;
        this.pX = 0;
        this.PRN = 0.0F;
        this.gv0 = 0.0F;
    }

    @Override
    public final String toString() {
        if (this.ld0.KB == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(this.PRN).append('x').append(this.gv0).append('\n');
        for (int i = 0; i < this.ld0.KB; i++) {
            sb.append(((hz_1) this.ld0.get(i)).toString()).append('\n');
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
