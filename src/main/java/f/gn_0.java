package f;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Locale;

public final class gn_0 extends cn.pokemmo.graphics.color.Color4f {
    public static final gn_0 TRANSPARENT_WHITE;
    public static final gn_0 BLACK;
    public static final gn_0 SILVER;
    public static final gn_0 GRAY;
    public static final gn_0 WHITE;
    public static final gn_0 MAROON;
    public static final gn_0 RED;
    public static final gn_0 PURPLE;
    public static final gn_0 FUCHSIA;
    public static final gn_0 GREEN;
    public static final gn_0 LIME;
    public static final gn_0 OLIVE;
    public static final gn_0 ORANGE;
    public static final gn_0 YELLOW;
    public static final gn_0 NAVY;
    public static final gn_0 BLUE;
    public static final gn_0 TEAL;
    public static final gn_0 AQUA;
    public static final gn_0 SKYBLUE;
    public static final gn_0 LIGHTBLUE;
    public static final gn_0 LIGHTCORAL;
    public static final gn_0 LIGHTCYAN;
    public static final gn_0 LIGHTGRAY;
    public static final gn_0 LIGHTGREEN;
    public static final gn_0 LIGHTPINK;
    public static final gn_0 LIGHTSALMON;
    public static final gn_0 LIGHTSKYBLUE;
    public static final gn_0 LIGHTYELLOW;
    public static final gn_0 DARKGRAY;
    public static final gn_0 ROYAL;
    public static final gn_0 SLATE;
    public static final gn_0 SKY;
    public static final gn_0 CHARTREUSE;
    public static final gn_0 FOREST;
    public static final gn_0 GOLD;
    public static final gn_0 GOLDENROD;
    public static final gn_0 BROWN;
    public static final gn_0 TAN;
    public static final gn_0 FIREBRICK;
    public static final gn_0 SCARLET;
    public static final gn_0 CORAL;
    public static final gn_0 SALMON;
    public static final gn_0 PINK;
    public static final gn_0 VIOLET;
    public static final gn_0 TRANSPARENT;

    public gn_0(byte b, byte b2, byte b3, byte b4) {
        this.cv = b;
        this.x8 = b2;
        this.sh = b3;
        this.FY = b4;
    }

    public gn_0(int i) {
        this.FY = (byte) (i >> 24);
        this.cv = (byte) (i >> 16);
        this.x8 = (byte) (i >> 8);
        this.sh = (byte) i;
    }

    public static gn_0 Er0(String str) {
        String upper = str.toUpperCase(Locale.ENGLISH);
        try {
            Field field = gn_0.class.getField(upper);
            if (Modifier.isStatic(field.getModifiers()) && field.getType() == gn_0.class) {
                return (gn_0) field.get(null);
            }
        } catch (Throwable th) {
        }
        return null;
    }

    public static gn_0 ox0(String str) {
        if (str.length() > 0 && str.charAt(0) == '#') {
            String hex = str.substring(1);
            int len = str.length();
            if (len == 4) {
                int parseInt = Integer.parseInt(hex, 16);
                int r = ((parseInt >> 8) & 15) * 17;
                int g = ((parseInt >> 4) & 15) * 17;
                int b = (parseInt & 15) * 17;
                return new gn_0((r << 16) | 0xFF000000 | (g << 8) | b);
            } else if (len == 5) {
                int parseInt = Integer.parseInt(hex, 16);
                int a = ((parseInt >> 12) & 15) * 17;
                int r = ((parseInt >> 8) & 15) * 17;
                int g = ((parseInt >> 4) & 15) * 17;
                int b = (parseInt & 15) * 17;
                return new gn_0((a << 24) | (r << 16) | (g << 8) | b);
            } else if (len == 7) {
                return new gn_0(Integer.parseInt(hex, 16) | 0xFF000000);
            } else if (len == 9) {
                return new gn_0((int) Long.parseLong(hex, 16));
            } else {
                throw new NumberFormatException(xq_1.pz0("Can't parse '", str, "' as hex color"));
            }
        }
        return Er0(str);
    }

    static {
        TRANSPARENT_WHITE = new gn_0(16777215);
        BLACK = new gn_0(-16777216);
        SILVER = new gn_0(-4144960);
        GRAY = new gn_0(-8355712);
        WHITE = new gn_0(-1);
        MAROON = new gn_0(-8388608);
        RED = new gn_0(-65536);
        PURPLE = new gn_0(-8388480);
        FUCHSIA = new gn_0(-65281);
        GREEN = new gn_0(-16744448);
        LIME = new gn_0(-16711936);
        OLIVE = new gn_0(-8355840);
        ORANGE = new gn_0(-23296);
        YELLOW = new gn_0(-256);
        NAVY = new gn_0(-16777088);
        BLUE = new gn_0(-16776961);
        TEAL = new gn_0(-16744320);
        AQUA = new gn_0(-16711681);
        SKYBLUE = new gn_0(-7876885);
        LIGHTBLUE = new gn_0(-5383962);
        LIGHTCORAL = new gn_0(-1015680);
        LIGHTCYAN = new gn_0(-2031617);
        LIGHTGRAY = new gn_0(-2894893);
        LIGHTGREEN = new gn_0(-7278960);
        LIGHTPINK = new gn_0(-18751);
        LIGHTSALMON = new gn_0(-24454);
        LIGHTSKYBLUE = new gn_0(-7876870);
        LIGHTYELLOW = new gn_0(-32);
        DARKGRAY = new gn_0(-12632257);
        ROYAL = new gn_0(-12490271);
        SLATE = new gn_0(-9404272);
        SKY = new gn_0(-7876885);
        CHARTREUSE = new gn_0(-8388864);
        FOREST = new gn_0(-14513374);
        GOLD = new gn_0(-10496);
        GOLDENROD = new gn_0(-2448096);
        BROWN = new gn_0(-7650029);
        TAN = new gn_0(-2968436);
        FIREBRICK = new gn_0(-5103070);
        SCARLET = new gn_0(-52196);
        CORAL = new gn_0(-32944);
        SALMON = new gn_0(-360334);
        PINK = new gn_0(-38476);
        VIOLET = new gn_0(-1146130);
        TRANSPARENT = new gn_0(0);
    }

    public final gn_0 Uy(gn_0 gn_0) {
        byte b = (byte) (((this.cv & 255) * (gn_0.cv & 255)) / 255);
        byte b2 = (byte) (((this.x8 & 255) * (gn_0.x8 & 255)) / 255);
        byte b3 = (byte) (((this.sh & 255) * (gn_0.sh & 255)) / 255);
        byte b4 = (byte) (((this.FY & 255) * (gn_0.FY & 255)) / 255);
        return new gn_0(b, b2, b3, b4);
    }
}
