// 兼容垫片 (Shim) - 调色板映射贴图
package f;

import com.badlogic.gdx.graphics.Color;
import cn.pokemmo.graphics.gdx.texture.GdxPaletteLookupTexture;

/**
 * Shim: yb_1 -> GdxPaletteLookupTexture
 * Contains static palette tables.
 */
public class yb_1 extends GdxPaletteLookupTexture {
    public static final yb_1 Cy0;
    public static final yb_1[] Mh;
    public static final yb_1[] rq0;
    public static final bm0_1 EC0;

    public yb_1(int i, LPT4_ lpt4_, int i2) {
        super(i, lpt4_, i2);
    }

    public static yb_1 f9(byte b) {
        bm0_1 bm0_1 = EC0;
        if (bm0_1.dg(b)) {
            return (yb_1) bm0_1.BM(b);
        }
        return Cy0;
    }

    static {
        yb_1 v0 = new yb_1(0, new LPT4_(0, 0, 0, 255), 0);
        Cy0 = v0;
        yb_1 v1 = new yb_1(1, new LPT4_(32, 32, 42, 255), 30);
        yb_1 v2 = new yb_1(2, new LPT4_(162, 190, 180, 255), 160);
        yb_1 v3 = new yb_1(3, new LPT4_(32, 32, 42, 255), 74);
        yb_1 v4 = new yb_1(4, new LPT4_(32, 32, 52, 255), 110);
        yb_1 v5 = new yb_1(5, new LPT4_(32, 32, 42, 255), 180);
        yb_1 v6 = new yb_1(6, new LPT4_(100, 170, 254, 255), 188);
        yb_1 v7 = new yb_1(7, new LPT4_(92, 152, 204, 255), 196);
        yb_1 v8 = new yb_1(8, new LPT4_(44, 80, 194, 255), 162);
        yb_1 v9 = new yb_1(9, new LPT4_(2, 180, 208, 255), 108);
        yb_1 v10 = new yb_1(10, new LPT4_(40, 190, 200, 255), 160);
        yb_1 v11 = new yb_1(11, new LPT4_(48, 172, 166, 255), 172);
        yb_1 v12 = new yb_1(12, new LPT4_(50, 232, 134, 255), 146);
        yb_1 v13 = new yb_1(13, new LPT4_(62, 200, 118, 255), 180);
        yb_1 v14 = new yb_1(14, new LPT4_(30, 162, 108, 255), 180);
        yb_1 v15 = new yb_1(15, new LPT4_(76, 240, 46, 255), 138);
        yb_1 v16 = new yb_1(16, new LPT4_(86, 212, 52, 255), 174);
        yb_1 v17 = new yb_1(17, new LPT4_(20, 172, 42, 255), 180);
        yb_1 v18 = new yb_1(18, new LPT4_(146, 212, 46, 255), 152);
        yb_1 v19 = new yb_1(19, new LPT4_(126, 196, 56, 255), 180);
        yb_1 v20 = new yb_1(20, new LPT4_(92, 152, 34, 255), 188);
        yb_1 v21 = new yb_1(21, new LPT4_(194, 220, 76, 255), 188);
        yb_1 v22 = new yb_1(22, new LPT4_(180, 214, 74, 255), 220);
        yb_1 v23 = new yb_1(23, new LPT4_(184, 200, 56, 255), 222);
        yb_1 v24 = new yb_1(24, new LPT4_(254, 190, 24, 255), 150);
        yb_1 v25 = new yb_1(25, new LPT4_(254, 186, 0, 255), 164);
        yb_1 v26 = new yb_1(26, new LPT4_(254, 150, 4, 255), 160);
        yb_1 v27 = new yb_1(27, new LPT4_(250, 110, 4, 255), 160);
        yb_1 v28 = new yb_1(28, new LPT4_(254, 114, 0, 255), 180);
        yb_1 v29 = new yb_1(29, new LPT4_(242, 72, 10, 255), 182);
        yb_1 v30 = new yb_1(30, new LPT4_(186, 124, 4, 255), 124);
        yb_1 v31 = new yb_1(31, new LPT4_(164, 102, 14, 255), 180);
        yb_1 v32 = new yb_1(32, new LPT4_(154, 74, 28, 255), 210);
        yb_1 v33 = new yb_1(33, new LPT4_(254, 48, 4, 255), 160);
        yb_1 v34 = new yb_1(34, new LPT4_(254, 48, 20, 255), 190);
        yb_1 v35 = new yb_1(35, new LPT4_(254, 54, 56, 255), 214);
        yb_1 v36 = new yb_1(36, new LPT4_(254, 8, 38, 255), 94);
        yb_1 v37 = new yb_1(37, new LPT4_(250, 124, 144, 255), 210);
        yb_1 v38 = new yb_1(38, new LPT4_(248, 60, 106, 255), 172);
        yb_1 v39 = new yb_1(39, new LPT4_(254, 76, 146, 255), 126);
        yb_1 v40 = new yb_1(40, new LPT4_(250, 60, 136, 255), 146);
        yb_1 v41 = new yb_1(41, new LPT4_(218, 34, 134, 255), 134);
        yb_1 v42 = new yb_1(42, new LPT4_(210, 4, 238, 255), 86);
        yb_1 v43 = new yb_1(43, new LPT4_(160, 80, 220, 255), 170);
        yb_1 v44 = new yb_1(44, new LPT4_(158, 40, 174, 255), 160);
        yb_1 v45 = new yb_1(45, new LPT4_(86, 4, 222, 255), 82);
        yb_1 v46 = new yb_1(46, new LPT4_(84, 32, 196, 255), 110);
        yb_1 v47 = new yb_1(47, new LPT4_(54, 4, 200, 255), 116);

        Mh = new yb_1[] {
            v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v30, v31, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, v47
        };

        rq0 = new yb_1[] {
            v0, v1, v2, v3, v4, v5, v4, v3, v2, v1,
            v6, v7, v8, v7, v6, v9, v10, v11, v10, v9,
            v12, v13, v14, v13, v12, v15, v16, v17, v16, v15,
            v18, v19, v20, v19, v18, v21, v22, v23, v22, v21,
            v24, v25, v26, v25, v24, v27, v28, v29, v28, v27,
            v30, v31, v32, v31, v30, v33, v34, v35, v34, v33,
            v36, v37, v38, v37, v36, v39, v40, v41, v40, v39,
            v42, v43, v44, v43, v42, v45, v46, v47, v46, v45
        };

        EC0 = new bm0_1();
        for (yb_1 yb_1 : Mh) {
            EC0.gE0(yb_1.at0, yb_1);
        }
    }
}
