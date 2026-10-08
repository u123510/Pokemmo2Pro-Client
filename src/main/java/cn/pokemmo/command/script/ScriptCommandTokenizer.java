package cn.pokemmo.command.script;

import f.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScriptCommandTokenizer {
    public String jo0;
    public String[] bs0;
    public final Dn0 Ah;
    public boolean AZ;
    public float P60;
    public float XT;
    public float bd0;
    public float Cp0;
    public float go;
    public float g4 = 1.0F;
    public float sB0;
    public float ce;
    public float U7;
    public float Mt = 1.0F;
    public float o3 = 1.0F;
    public float eL = 1.0F;
    public boolean oj;
    public final th_1[][] o70 = new th_1[128][];
    public th_1 Rx;
    public float CM;
    public float Hf = 1.0F;
    public final char[] mA = {'x', 'e', 'a', 'o', 'n', 's', 'r', 'c', 'u', 'm', 'v', 'w', 'z'};
    public final char[] Fu0 = {'M', 'N', 'B', 'D', 'C', 'E', 'F', 'K', 'A', 'G', 'H', 'I', 'J',
            'L', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public ScriptCommandTokenizer() {
        Ah = null;
    }

    public ScriptCommandTokenizer(Dn0 file, boolean flip) {
        Ah = file;
        AZ = flip;
        wr(file, flip);
    }

    public static boolean RA0(char value) {
        return value == '\t' || value == '\n' || value == '\r' || value == ' ';
    }

    public final void wr(Dn0 file, boolean flip) {
        if (bs0 != null) throw new IllegalStateException("Already loaded.");
        jo0 = file.R20();
        BufferedReader reader = new BufferedReader(new InputStreamReader(file.uf0()), 512);
        try {
            String line = reader.readLine();
            if (line == null) throw new nf_1("File is empty.");
            String padding = line.substring(line.indexOf("padding=") + 8);
            String[] values = padding.substring(0, padding.indexOf(' ')).split(",", 4);
            if (values.length != 4) throw new nf_1("Invalid padding.");
            P60 = Integer.parseInt(values[0]);
            XT = Integer.parseInt(values[1]);
            bd0 = Integer.parseInt(values[2]);
            Cp0 = Integer.parseInt(values[3]);
            float verticalPadding = P60 + bd0;
            line = reader.readLine();
            if (line == null) throw new nf_1("Missing common header.");
            String[] common = line.split(" ", 9);
            if (common.length < 3) throw new nf_1("Invalid common header.");
            if (!common[1].startsWith("lineHeight=")) throw new nf_1("Missing: lineHeight");
            go = Integer.parseInt(common[1].substring(11));
            if (!common[2].startsWith("base=")) throw new nf_1("Missing: base");
            float baseline = Integer.parseInt(common[2].substring(5));
            int pages = 1;
            if (common.length >= 6 && common[5] != null && common[5].startsWith("pages=")) {
                try {
                    pages = Math.max(1, Integer.parseInt(common[5].substring(6)));
                } catch (NumberFormatException ignored) {
                }
            }
            bs0 = new String[pages];
            for (int page = 0; page < pages; page++) {
                line = reader.readLine();
                if (line == null) throw new nf_1("Missing additional page definitions.");
                Matcher id = Pattern.compile(".*id=(\\d+)").matcher(line);
                if (id.find()) {
                    String value = id.group(1);
                    try {
                        if (Integer.parseInt(value) != page) {
                            throw new nf_1("Page IDs must be indices starting at 0: " + value);
                        }
                    } catch (NumberFormatException error) {
                        throw new nf_1("Invalid page id: " + value, error);
                    }
                }
                Matcher filename = Pattern.compile(".*file=\"?([^\"]+)\"?").matcher(line);
                if (!filename.find()) throw new nf_1("Missing: file");
                bs0[page] = file.Br().wp(filename.group(1)).el().replaceAll("\\\\", "/");
            }
            ce = 0.0F;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("kernings ") || line.startsWith("metrics ")) break;
                if (!line.startsWith("char ")) continue;
                th_1 glyph = new th_1();
                StringTokenizer tokens = new StringTokenizer(line, " =");
                tokens.nextToken();
                int id = integer(tokens);
                if (id <= 0) Rx = glyph;
                else if (id <= 65535) eU(id, glyph);
                else continue;
                glyph.cJ0 = id;
                glyph.Pt = integer(tokens);
                glyph.wj0 = integer(tokens);
                glyph.k = integer(tokens);
                glyph.pz0 = integer(tokens);
                glyph.kJ0 = integer(tokens);
                int y = integer(tokens);
                glyph.iM = flip ? y : -(glyph.pz0 + y);
                glyph.V80 = integer(tokens);
                if (tokens.hasMoreTokens()) tokens.nextToken();
                if (tokens.hasMoreTokens()) {
                    try {
                        glyph.qc0 = Integer.parseInt(tokens.nextToken());
                    } catch (NumberFormatException ignored) {
                    }
                }
                if (glyph.k > 0 && glyph.pz0 > 0) ce = Math.min(baseline + glyph.iM, ce);
            }
            ce += bd0;
            while ((line = reader.readLine()) != null && line.startsWith("kerning ")) {
                StringTokenizer tokens = new StringTokenizer(line, " =");
                tokens.nextToken();
                int first = integer(tokens);
                int second = integer(tokens);
                if (first < 0 || first > 65535 || second < 0 || second > 65535) continue;
                th_1 glyph = jm0((char) first);
                int amount = integer(tokens);
                if (glyph != null) glyph.zA(second, amount);
            }
            boolean metrics = line != null && line.startsWith("metrics ");
            float ascent = 0.0F;
            float descent = 0.0F;
            float down = 0.0F;
            float capHeight = 0.0F;
            float lineHeight = 0.0F;
            float spaceAdvance = 0.0F;
            float xHeight = 0.0F;
            if (metrics) {
                StringTokenizer tokens = new StringTokenizer(line, " =");
                tokens.nextToken();
                ascent = decimal(tokens);
                descent = decimal(tokens);
                down = decimal(tokens);
                capHeight = decimal(tokens);
                lineHeight = decimal(tokens);
                spaceAdvance = decimal(tokens);
                xHeight = decimal(tokens);
            }
            th_1 space = jm0(' ');
            if (space == null) {
                space = new th_1();
                space.cJ0 = 32;
                th_1 example = jm0('l');
                if (example == null) example = VS();
                space.V80 = example.V80;
                eU(32, space);
            }
            if (space.k == 0) {
                float left = Cp0;
                space.k = (int) (left + space.V80 + XT);
                space.kJ0 = (int) -left;
            }
            CM = space.V80;
            th_1 lowercase = null;
            for (char value : mA) {
                lowercase = jm0(value);
                if (lowercase != null) break;
            }
            if (lowercase == null) lowercase = VS();
            Hf = lowercase.pz0 - verticalPadding;
            th_1 capital = null;
            for (char value : Fu0) {
                capital = jm0(value);
                if (capital != null) break;
            }
            if (capital != null) {
                g4 = capital.pz0;
            } else {
                for (th_1[] page : o70) {
                    if (page == null) continue;
                    for (th_1 glyph : page) {
                        if (glyph != null && glyph.pz0 != 0 && glyph.k != 0) {
                            g4 = Math.max(g4, glyph.pz0);
                        }
                    }
                }
            }
            g4 -= verticalPadding;
            sB0 = baseline - g4;
            U7 = -go;
            if (flip) {
                sB0 = -sB0;
                U7 = -U7;
            }
            if (metrics) {
                sB0 = ascent;
                ce = descent;
                U7 = down;
                g4 = capHeight;
                go = lineHeight;
                CM = spaceAdvance;
                Hf = xHeight;
            }
        } catch (Exception error) {
            throw new nf_1("Error loading font file: " + file, error);
        } finally {
            KT.E1(reader);
        }
    }

    private static int integer(StringTokenizer tokens) {
        tokens.nextToken();
        return Integer.parseInt(tokens.nextToken());
    }

    private static float decimal(StringTokenizer tokens) {
        tokens.nextToken();
        return Float.parseFloat(tokens.nextToken());
    }

    public final void Zv(th_1 glyph, LPT6_ region) {
        float inverseWidth = 1.0F / region.OB.getWidth();
        float inverseHeight = 1.0F / region.OB.getHeight();
        float offsetX = 0.0F;
        float offsetY = 0.0F;
        float u = region.yQ;
        float v = region.Y60;
        float right = region.bz;
        float bottom = region.xZ;
        if (region instanceof yo_2) {
            yo_2 atlas = (yo_2) region;
            offsetX = atlas.Z0;
            offsetY = (float) (atlas.BF0 - atlas.P4) - atlas.JN;
        }
        float x = glyph.Pt;
        int originalWidth = glyph.k;
        float x2 = glyph.Pt + originalWidth;
        float y = glyph.wj0;
        int originalHeight = glyph.pz0;
        float y2 = glyph.wj0 + originalHeight;
        if (offsetX > 0.0F) {
            x -= offsetX;
            if (x < 0.0F) {
                glyph.k = (int) (originalWidth + x);
                glyph.kJ0 = (int) (glyph.kJ0 - x);
                x = 0.0F;
            }
            float end = x2 - offsetX;
            if (end > right) glyph.k = (int) (glyph.k - (end - right));
            else right = end;
        } else {
            right = x2;
        }
        if (offsetY > 0.0F) {
            float top = y - offsetY;
            if (top < 0.0F) {
                glyph.pz0 = (int) (originalHeight + top);
                if (glyph.pz0 < 0) glyph.pz0 = 0;
                y = 0.0F;
            } else {
                y = top;
            }
            float end = y2 - offsetY;
            if (end > bottom) {
                float excess = end - bottom;
                glyph.pz0 = (int) (glyph.pz0 - excess);
                glyph.iM = (int) (glyph.iM + excess);
            } else {
                bottom = end;
            }
        } else {
            bottom = y2;
        }
        glyph.DG = x * inverseWidth + u;
        glyph.En0 = right * inverseWidth + u;
        if (AZ) {
            glyph.A60 = y * inverseHeight + v;
            glyph.Dj0 = bottom * inverseHeight + v;
        } else {
            glyph.Dj0 = y * inverseHeight + v;
            glyph.A60 = bottom * inverseHeight + v;
        }
    }

    public final void eU(int code, th_1 glyph) {
        int page = code / 512;
        th_1[] glyphs = o70[page];
        if (glyphs == null) {
            glyphs = new th_1[512];
            o70[page] = glyphs;
        }
        glyphs[code & 511] = glyph;
    }

    public final th_1 VS() {
        for (th_1[] page : o70) {
            if (page == null) continue;
            for (th_1 glyph : page) {
                if (glyph != null && glyph.pz0 != 0 && glyph.k != 0) return glyph;
            }
        }
        throw new nf_1("No glyphs found.");
    }

    public th_1 jm0(char code) {
        th_1[] page = o70[code / 512];
        return page == null ? null : page[code & 511];
    }

    public void tc0(hz_1 run, CharSequence text, int start, int end, th_1 previous) {
        int count = end - start;
        if (count == 0) return;
        boolean markup = oj;
        float scale = o3;
        es_1 glyphs = run.A30;
        UJ0 advances = run.TA0;
        glyphs.Bv(count);
        run.TA0.bD(count + 1);
        int index = start;
        do {
            int next = index + 1;
            char code = text.charAt(index);
            if (code == '\r') {
                index = next;
                continue;
            }
            th_1 glyph = jm0(code);
            if (glyph == null) glyph = Rx;
            if (glyph == null) {
                index = next;
                continue;
            }
            glyphs.Ue0(glyph);
            float advance;
            if (previous == null) {
                advance = -glyph.kJ0 * scale - Cp0;
            } else {
                int width = previous.V80;
                byte[][] kerning = previous.LS;
                int adjustment = 0;
                if (kerning != null) {
                    byte[] page = kerning[code >>> 9];
                    if (page != null) adjustment = page[code & 511];
                }
                advance = (width + adjustment) * scale;
            }
            advances.O6(advance);
            if (markup && code == '[' && next < end && text.charAt(next) == '[') index += 2;
            else index = next;
            previous = glyph;
        } while (index < end);
        if (previous != null) advances.O6((previous.k + previous.kJ0) * scale - XT);
    }

    public final void dK0(float scale) {
        if (scale == 0.0F) throw new IllegalArgumentException("scaleX cannot be 0.");
        if (scale == 0.0F) throw new IllegalArgumentException("scaleY cannot be 0.");
        float x = scale / o3;
        float y = scale / eL;
        go *= y;
        CM *= x;
        Hf *= y;
        g4 *= y;
        sB0 *= y;
        ce *= y;
        U7 *= y;
        Cp0 *= x;
        XT *= x;
        P60 *= y;
        bd0 *= y;
        o3 = scale;
        eL = scale;
    }

    public final String toString() {
        String name = jo0;
        return name != null ? name : super.toString();
    }
}
