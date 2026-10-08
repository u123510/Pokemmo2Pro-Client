package f;

import cn.pokemmo.chat.ChatChannel;

public enum zo_0 {
    // 现代语义常量别名

    Pk(0, 1500, new String[]{"/normal", "/all", "/region", "/talk", "/general", "/n", "/a"}, "normal", true, true, true),
    bg0(3, 1501, new String[]{"/shout", "/s"}, "shout", true, true, true),
    YL(4, 1502, new String[]{"/whisper", "/w"}, "whisper", true, false, true),
    Hl0(5, 1503, new String[]{"/trade", "/tr"}, "trade", true, true, false),
    Cj0(6, 1504, new String[]{"/global", "/gl"}, "global", true, true, false),
    DI0(7, 1505, new String[]{"/channel", "/ch"}, "channel", true, true, false),
    kJ0(8, 1507, new String[]{"/team", "/t"}, "team", true, false, true),
    m5(9, 1510, new String[]{"/link", "/party", "/l", "/p"}, "link", true, false, true),
    rr0(16, 1506, null, "system", false, false, true),
    Dd(17, 1509, null, "system", false, false, true),
    n4(18, 1508, null, "battle", false, false, true);

    public static final zo_0[] JG;
    public static final bm0_1 N00;

    public final byte y80;
    public final short eN;
    public final int Yf;
    public final String[] fJ;
    public final String[] Rk;
    public final String Yb0;
    public final boolean g3;
    public final boolean bJ;
    public final boolean lPt6;

    static {
        JG = values();
        N00 = new bm0_1();
        for (zo_0 zo : JG) {
            N00.gE0(zo.y80, zo);
        }
    }

    zo_0(int i3, int i4, String[] strArr, String str2, boolean z1, boolean z2, boolean z3) {
        this.y80 = (byte) i3;
        this.eN = (short) (1 << i3);
        this.Yf = i4;
        this.fJ = strArr;
        this.Yb0 = str2;
        this.g3 = z1;
        this.bJ = z2;
        this.lPt6 = z3;
        if (strArr == null) {
            this.Rk = null;
        } else {
            this.Rk = new String[strArr.length];
            for (int i = 0; i < this.Rk.length; i++) {
                this.Rk[i] = strArr[i] + " ";
            }
        }
    }

    public final String[] Ud0() {
        return this.fJ;
    }

        public ChatChannel asModern() {
        return ChatChannel.valueOf(name());
    }

    public final int Bq0() {
        return this.Yf;
    }
}
