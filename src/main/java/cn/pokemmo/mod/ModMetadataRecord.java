package cn.pokemmo.mod;

import f.*;

public class ModMetadataRecord {
    public static final G50 OJ;
    public static final G50[] aG;
    public final byte Sf0;
    public final short z20;
    public final String PM;
    public final String na;
    public final String return$;
    public final String d0;

    public ModMetadataRecord(int i1, String v2, String v3, String v4) {
        this.Sf0 = (byte) i1;
        this.z20 = (short) (1 << i1);
        this.PM = v2;
        this.na = v2.toUpperCase();
        this.return$ = v3;
        this.d0 = v4;
    }

    public static G50 Rw(String v0) {
        if ("zh".equalsIgnoreCase(v0) || "zn".equalsIgnoreCase(v0)) {
            v0 = "cn";
        }
        if ("kr".equalsIgnoreCase(v0) || "ke".equalsIgnoreCase(v0)) {
            v0 = "ko";
        }
        if ("jp".equalsIgnoreCase(v0)) {
            v0 = "ja";
        }
        for (G50 value : aG) {
            if (value.PM.equalsIgnoreCase(v0)) {
                return value;
            }
        }
        int split = v0.indexOf('-');
        if (split > 0) {
            return Rw(v0.substring(0, split));
        }
        return OJ;
    }

    public static G50 Rl(String v0) {
        for (G50 value : aG) {
            if (value.PM.equalsIgnoreCase(v0)) {
                return value;
            }
        }
        return null;
    }

    public static G50 oZ(byte i0, boolean i1) {
        if (i0 >= 0 && i0 <= 15) {
            return aG[i0];
        }
        return i1 ? null : OJ;
    }

    static {
        G50 en = new G50(0, "en", "english", "English");
        G50 fr = new G50(1, "fr", "french", "Français");
        G50 de = new G50(2, "de", "german", "Deutsch");
        G50 es = new G50(3, "es", "spanish", "Español");
        G50 pt = new G50(4, "pt", "portuguese", "Português");
        G50 it = new G50(5, "it", "italian", "Italiano");
        G50 nl = new G50(6, "nl", "dutch", "Nederlands");
        G50 pl = new G50(7, "pl", "polish", "Polski");
        G50 el = new G50(8, "el", "greek", "Eλληνικá");
        G50 tr = new G50(9, "tr", "turkish", "Türkçe");
        G50 fil = new G50(10, "fil", "filipino", "Filipino");
        G50 ru = new G50(11, "ru", "russian", "Русский");
        G50 ko = new G50(12, "ko", "korean", "한국어");
        G50 ja = new G50(13, "ja", "japanese", "日本語");
        G50 cn = new G50(14, "cn", "chinese", "简体中文");
        G50 other = new G50(15, "other", "other", "Other");
        OJ = other;
        aG = new G50[]{en, fr, de, es, pt, it, nl, pl, el, tr, fil, ru, ko, ja, cn, other};
    }

    public final byte sv0() {
        return this.Sf0;
    }

    public final String ir0() {
        return this.PM;
    }

    public final String AO() {
        return this.return$;
    }

    public final String aD() {
        return this.d0;
    }
}
