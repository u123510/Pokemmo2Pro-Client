package cn.pokemmo.constant.enums;

import f.*;

public enum PunishmentReason {
    OTHER((byte)-1, 0, 0),
    PROHIBITED_SOFTWARE((byte)0, 1570, 2061),
    RMT((byte)1, 1571, 2062),
    CHAT_CONDUCT((byte)2, 1572, 2064),
    SCAMMING((byte)3, 1573, 0),
    HARASSMENT((byte)4, 1574, 2067),
    CHANNEL_TRADING((byte)5, 1575, 2064),
    SPAM((byte)6, 1576, 2064),
    ACCOUNT_SHARING((byte)7, 1577, 0),
    STAFF_IMPERSONATION((byte)8, 1578, 0),
    CLIENT_TAMPERING((byte)9, 1579, 2060),
    MALICIOUS_REPORT((byte)10, 1580, 2063),
    ACCOUNT_THEFT((byte)11, 1581, 0),
    COMPROMISED_ACCOUNT((byte)12, 1582, 0),
    DEFAMATION((byte)13, 1583, 2063),
    ACCOUNT_SELLING((byte)14, 1584, 2065),
    SEXUAL_HARASSMENT((byte)15, 1585, 2066),
    PIRACY((byte)16, 1586, 0),
    WRONG_LANG((byte)17, 1587, 0),
    BAD_NICKNAMES((byte)18, 1588, 0),
    CHANNEL_TRADING_SOFT((byte)19, 0, 0),
    WRONG_LANG_SOFT((byte)20, 0, 0),
    MUTE((byte)21, 0, 0),
    MUTE_CHANNEL((byte)22, 0, 0),
    COPPA((byte)23, 1589, 2082);

    public static final PunishmentReason Sp = OTHER;
    public static final PunishmentReason gm0 = WRONG_LANG_SOFT;
    public static final PunishmentReason Ko = MUTE;
    public static final PunishmentReason VG = MUTE_CHANNEL;
    public static final PunishmentReason mh = COPPA;
    public static final PunishmentReason[] x90;
    public static final bm0_1 s4;
    public static final PunishmentReason[] mg0;

    public final byte Qt;
    public final int Fi;
    public final int Bq;

    PunishmentReason(byte qt, int fi, int bq) {
        this.Qt = qt;
        this.Fi = fi;
        this.Bq = bq;
    }

    public final int en0() {
        return this.Fi;
    }

    public final int Sj() {
        return this.Bq;
    }

    static {
        mg0 = values();
        x90 = new PunishmentReason[]{
            CHAT_CONDUCT, SPAM, DEFAMATION, HARASSMENT, BAD_NICKNAMES,
            CHANNEL_TRADING, WRONG_LANG, RMT, PIRACY, OTHER
        };
        s4 = new bm0_1();
        for (PunishmentReason type : mg0) {
            s4.gE0(type.Qt, type);
        }
    }

    public f.IL toLegacy() {
        return f.IL.valueOf(name());
    }
}