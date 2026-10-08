package cn.pokemmo.character.customization;

import f.*;

import java.util.stream.Stream;

public class CharacterAppearanceColorOption {
    public static final og0_2 gK0;
    public static final og0_2 c9;
    public static final og0_2 oK0;
    public static final bm0_1 So;
    public static final og0_2[] mg;
    public final byte BL0;
    public final h9 y8;
    public final int P70;

    public CharacterAppearanceColorOption(int p70, int bl0, h9 y8) {
        this.P70 = p70;
        this.BL0 = (byte) bl0;
        this.y8 = y8;
    }

    public final boolean TK0() {
        return this.y8 != null;
    }

    public final int fS() {
        return this.P70;
    }

    static {
        gK0 = new og0_2(0, 0, null);
        c9 = new og0_2(1, 1, null);
        oK0 = new og0_2(2, 2, null);
        og0_2 v3 = new og0_2(3, 3, h9.WL);
        og0_2 v4 = new og0_2(4, 4, h9.WL);
        og0_2 v5 = new og0_2(5, 5, h9.WL);
        og0_2 v6 = new og0_2(6, 6, h9.WL);
        og0_2 v7 = new og0_2(7, 7, h9.WL);
        og0_2 v8 = new og0_2(8, 8, h9.WL);
        og0_2 v9 = new og0_2(9, 9, h9.WL);
        og0_2 v10 = new og0_2(10, 10, h9.WL);
        og0_2 v11 = new og0_2(11, 11, h9.WL);
        og0_2 v12 = new og0_2(12, 12, h9.WL);
        og0_2 v13 = new og0_2(13, 13, h9.WL);
        og0_2 v14 = new og0_2(14, 14, h9.WL);
        og0_2 v15 = new og0_2(15, 15, h9.WL);
        og0_2 v16 = new og0_2(16, 16, h9.WL);
        og0_2 v17 = new og0_2(17, 17, h9.WL);
        og0_2 v18 = new og0_2(18, 18, h9.WL);
        og0_2 v19 = new og0_2(19, 19, h9.Bg);
        og0_2 v20 = new og0_2(20, 20, h9.Bg);
        og0_2 v21 = new og0_2(21, 21, h9.Bg);
        og0_2 v22 = new og0_2(22, 22, h9.Bg);
        og0_2 v23 = new og0_2(23, 23, h9.Bg);
        og0_2 v24 = new og0_2(24, 24, h9.Bg);

        mg = new og0_2[]{
            gK0, c9, oK0, v3, v4, v5, v6, v7, v8, v9, v10,
            v11, v12, v13, v14, v15, v16, v17, v18, v19, v20,
            v21, v22, v23, v24
        };

        So = new bm0_1();
        Stream.of((og0_2[]) mg.clone()).forEach(og -> So.gE0(og.BL0, og));
        Stream.of((og0_2[]) mg.clone()).filter(og -> og.TK0() && og.y8 == h9.WL).toArray(og0_2[]::new);
    }
}
