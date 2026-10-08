package cn.pokemmo.ui.twl.theme;

import f.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParserException;

/**
 * TWL 界面主题图像与光标资源解析管理器 (TwlThemeImageManager)
 *
 * <p>核心职责：
 * <ul>
 *   <li>解析 TWL 主题 XML 配置文件中的全部图像资源（单图、9宫格切片、组合图、状态选择图、渐变图、帧动画序列）；</li>
 *   <li>管理与创建操作系统/平台级硬件鼠标光标（解析热点 {@code hotSpotX}, {@code hotSpotY}，映射 GLFW 硬件光标）；</li>
 *   <li>处理纹理坐标计算（旋转、九宫格分割线、边缘内边距、平铺重复与颜色染色）；</li>
 *   <li>维护主题图像资源表（{@code DA0}）与光标资源表（{@code KR}）。</li>
 * </ul>
 *
 * <p>原始混淆类：{@link f.ch_2}
 */
public class TwlThemeImageManager {
    public static final Logger Wp = Logger.getLogger(TwlThemeImageManager.class.getName());
    public static final FK fG = new FK(0, 0);
    public static final f6_0 Be0 = new f6_0();
    public static final int[] u6 = new int[]{0, 1, 0};
    public static final int[] jq0 = new int[]{1};
    public final LC0 Tu;
    public final pc0_1 Dq;
    public final TreeMap DA0;
    public final TreeMap KR;
    public xu_1 lpt8;

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrow(Throwable throwable) throws T {
        throw (T) throwable;
    }

    public TwlThemeImageManager(LC0 var1, pc0_1 var2) {
        this.Tu = var1;
        this.Dq = var2;
        TreeMap var3 = new TreeMap();
        this.DA0 = var3;
        TreeMap var4 = new TreeMap();
        this.KR = var4;
        var3.put("none", fG);
        var4.put("os-default", Be0);
    }

    /**
     * 从 XML 解析并注册一个硬件鼠标光标。
     */
    public final void b2(Ps0 var1, String var2) {
        String var3;
        Object var4;
        if ((var3 = var1.Yd0("ref")) != null) {
            if ((var4 = (dc0_0) this.KR.get(var3)) == null) {
                String var12 = xq_1.pz0("referenced cursor \"", var3, "\" not found");
                throw rethrow(new XmlPullParserException(var12, var1.Ja0, null));
            }
        } else {
            oc_0 var13 = new oc_0();
            this.Gl(var1, var13);
            int var15 = var1.vj0(var1.Zs("hotSpotX"));
            int var5 = var1.vj0(var1.Zs("hotSpotY"));
            String var6 = var1.Yd0("imageRef");
            wl0_2 var7 = null;
            if (var6 != null) {
                var7 = this.or(var1, var6);
            }

            xu_1 var14 = this.lpt8;
            int var17 = var13.B1;
            int var8 = var13.T70;
            int var9 = var13.tD0;
            int var10 = var13.BE;
            var14.gd.getClass();
            if (var7 != null) {
                var4 = new d6_0(var14, var17, var8, var9, var10, var15, var5, var7);
            } else {
                wk_1 var18 = new wk_1(var14.nx, var17, var8, var9, var10, var15, var5);
                if (var14.xA == null) {
                    var14.xA = new ArrayList();
                }
                var14.xA.add(var18);
                var4 = var18;
            }
        }

        this.KR.put(var2, var4);
        var1.aM();
    }

    /**
     * 解析单个图像标签元素。
     */
    public final wl0_2 COM7(Ps0 var1, String var2) throws XmlPullParserException, IOException {
        oc_0 var3 = new oc_0();
        var3.dJ = dj0_0.Uu0(var1);
        return this.cb(var1, var2, var3);
    }

    /**
     * 核心图像标签解析分发器（area, alias, composed, select, grid, animation, gradient）。
     */
    public final wl0_2 cb(Ps0 param1, String param2, oc_0 param3) throws XmlPullParserException, IOException {
        String tint = param1.Yd0("tint");
        param3.Ea0 = tint == null ? null : dj0_0.n20(param1, tint, this.Tu);
        param3.pS = dj0_0.Pw0(param1, "border");
        param3.dc0 = dj0_0.Pw0(param1, "inset");
        param3.Qe = param1.y9("repeatX", false);
        param3.G3 = param1.y9("repeatY", false);
        String value = param1.Yd0("sizeOverwriteH");
        param3.jA = value == null ? -1 : param1.vj0(value);
        value = param1.Yd0("sizeOverwriteV");
        param3.ku = value == null ? -1 : param1.vj0(value);
        param3.UD0 = param1.y9("center", false);

        wl0_2 image;
        if ("area".equals(param2)) {
            this.Gl(param1, param3);
            this.f8(param1, param3);
            boolean tiled = param1.y9("tiled", false);
            int[] splitX = ZK0(param1, "splitx", Math.abs(param3.tD0));
            int[] splitY = ZK0(param1, "splity", Math.abs(param3.BE));
            if (splitX == null && splitY == null) {
                image = this.tI0(param1, param3.B1, param3.T70, param3.tD0, param3.BE,
                        param3.Ea0, tiled, param3.ih0);
            } else {
                boolean noCenter = param1.y9("nocenter", false);
                int columns = splitX == null ? 1 : 3;
                int rows = splitY == null ? 1 : 3;
                wl0_2[] images = new wl0_2[columns * rows];
                for (int row = 0; row < rows; row++) {
                    int imageY;
                    int imageH;
                    if (splitY != null) {
                        imageY = param3.BE < 0 ? param3.T70 - param3.BE - splitY[row + 1] : param3.T70 + splitY[row];
                        imageH = (splitY[row + 1] - splitY[row]) * Integer.signum(param3.BE);
                    } else {
                        imageY = param3.T70;
                        imageH = param3.BE;
                    }
                    for (int column = 0; column < columns; column++) {
                        int imageX;
                        int imageW;
                        if (splitX != null) {
                            imageX = param3.tD0 < 0 ? param3.B1 - param3.tD0 - splitX[column + 1] : param3.B1 + splitX[column];
                            imageW = (splitX[column + 1] - splitX[column]) * Integer.signum(param3.tD0);
                        } else {
                            imageX = param3.B1;
                            imageW = param3.tD0;
                        }
                        boolean center = row == rows / 2 && column == columns / 2;
                        wl0_2 part = noCenter && center
                                ? new FK(imageW, imageH)
                                : this.tI0(param1, imageX, imageY, imageW, imageH, param3.Ea0, center && tiled, param3.ih0);
                        int index;
                        switch (param3.ih0) {
                            case 2:
                                index = column * rows + rows - 1 - row;
                                break;
                            case 3:
                                index = (rows - 1 - row) * columns + columns - 1 - column;
                                break;
                            case 4:
                                index = (columns - 1 - column) * rows + row;
                                break;
                            default:
                                index = row * columns + column;
                        }
                        images[index] = part;
                    }
                }
                if (param3.ih0 == 2 || param3.ih0 == 4) {
                    image = new Fu0(images, splitY == null ? jq0 : u6, splitX == null ? jq0 : u6, param3.pS);
                } else {
                    image = new Fu0(images, splitX == null ? jq0 : u6, splitY == null ? jq0 : u6, param3.pS);
                }
            }
            param1.aM();
            param3.Ea0 = null;
            if (tiled) {
                param3.Qe = false;
                param3.G3 = false;
            }
        } else if ("alias".equals(param2)) {
            image = this.or(param1, param1.Zs("ref"));
            param1.aM();
        } else if ("composed".equals(param2)) {
            ArrayList layers = new ArrayList();
            param1.aM();
            while (!param1.hE0()) {
                param1.Ja0.require(2, null, null);
                String tag = param1.Ja0.getName();
                wl0_2 layer = this.COM7(param1, tag);
                layers.add(layer);
                ux0_0 border = param3.pS;
                if (border == null && layer instanceof ix_1) {
                    border = ((ix_1) layer).MY();
                }
                param3.pS = border;
                param1.Ja0.require(3, null, tag);
                param1.aM();
            }
            if (layers.isEmpty()) {
                image = fG;
            } else if (layers.size() == 1) {
                image = (wl0_2) layers.get(0);
            } else {
                image = new Wj((wl0_2[]) layers.toArray(new wl0_2[0]), param3.pS);
            }
        } else if ("select".equals(param2)) {
            ArrayList images = new ArrayList();
            ArrayList conditions = new ArrayList();
            param1.aM();
            boolean last = false;
            while (!last && !param1.hE0()) {
                param1.Ja0.require(2, null, null);
                Oq condition = dj0_0.Uu0(param1);
                String tag = param1.Ja0.getName();
                oc_0 childParams = new oc_0();
                childParams.dJ = condition;
                wl0_2 child = this.cb(param1, tag, childParams);
                ux0_0 border = param3.pS;
                if (border == null && child instanceof ix_1) {
                    border = ((ix_1) child).MY();
                }
                param3.pS = border;
                param1.Ja0.require(3, null, tag);
                param1.aM();
                last = condition == null;
                if (child instanceof Q2) {
                    Q2 adjusted = (Q2) child;
                    if (!adjusted.Nh0 && adjusted.Qk == null && adjusted.L20 < 0 && adjusted.Nv0 < 0) {
                        Oq childCondition = adjusted.Ld0;
                        if (condition == null) {
                            condition = childCondition;
                        } else if (childCondition != null) {
                            condition = new i7_0('+', new Oq[]{condition, childCondition});
                        }
                        child = adjusted.ga0;
                    }
                }
                images.add(child);
                if (condition != null) {
                    conditions.add(condition);
                }
            }
            if (conditions.isEmpty()) {
                String location = param1.S30 == null ? param1.Ja0.getPositionDescription() : param1.S30 + ':' + param1.Ja0.getLineNumber();
                Wp.warning(location + ": state select image needs atleast 1 condition");
                image = images.isEmpty() ? fG : (wl0_2) images.get(0);
            } else {
                image = new lb0_0(new ww_2((Oq[]) conditions.toArray(new Oq[0])), param3.pS,
                        (wl0_2[]) images.toArray(new wl0_2[0]));
            }
        } else if ("grid".equals(param2)) {
            try {
                int[] weightsX = RF.t30(param1.Zs("weightsX"));
                int[] weightsY = RF.t30(param1.Zs("weightsY"));
                wl0_2[] images = new wl0_2[weightsX.length * weightsY.length];
                param1.aM();
                this.F6(param1, images);
                image = new Fu0(images, weightsX, weightsY, param3.pS);
            } catch (IllegalArgumentException ex) {
                throw rethrow(param1.yF("Invalid value", ex));
            }
        } else if ("animation".equals(param2)) {
            try {
                String timeSource = param1.Zs("timeSource");
                String frozen = param1.Yd0("frozenTime");
                int frozenTime = frozen == null ? -1 : param1.vj0(frozen);
                h6_0 root = this.Kk0(param1);
                if (param3.pS == null) {
                    param3.pS = o7(root);
                }
                image = new ob_0(this.Dq, root, timeSource, param3.pS,
                        param3.Ea0 == null ? gn_0.WHITE : param3.Ea0, frozenTime);
                param3.Ea0 = null;
            } catch (IllegalArgumentException ex) {
                throw rethrow(param1.yF("Unable to parse", ex));
            }
        } else if ("gradient".equals(param2)) {
            try {
                ab_2 type = (ab_2) param1.he(ab_2.class, param1.Zs("type"));
                String wrapValue = param1.Yd0("wrap");
                q8_0 wrap = wrapValue == null ? q8_0.Eb : (q8_0) param1.he(q8_0.class, wrapValue);
                A00 gradient = new A00(type);
                if (wrap == null) {
                    throw new NullPointerException("wrap");
                }
                gradient.WR = wrap;
                param1.aM();
                while (param1.Ja0.getEventType() == 2) {
                    param1.Ja0.require(2, null, "stop");
                    float pos = Float.parseFloat(param1.Zs("pos"));
                    String color = param1.Zs("color");
                    gradient.XJ0(pos, dj0_0.n20(param1, color, this.Tu));
                    param1.aM();
                    param1.Ja0.require(3, null, "stop");
                    param1.aM();
                }
                image = new Cu0((qq_0) this.Dq, gradient);
            } catch (NumberFormatException ex) {
                throw rethrow(new XmlPullParserException("Unable to parse float", param1.Ja0, ex).initCause(ex));
            } catch (IllegalArgumentException ex) {
                throw rethrow(param1.yF("Unable to parse", ex));
            }
        } else {
            throw rethrow(new XmlPullParserException(xq_1.pz0("Unexpected '", param2, "'"), param1.Ja0, null));
        }

        ux0_0 border = param3.pS;
        if (border == null && image instanceof ix_1) {
            border = ((ix_1) image).MY();
        }
        if (param3.Ea0 != null && !gn_0.WHITE.equals(param3.Ea0)) {
            image = image.so(param3.Ea0);
        }
        if (param3.Qe || param3.G3) {
            image = new rd0_0(image, border, param3.Qe, param3.G3);
        }
        ux0_0 imageBorder = image instanceof ix_1 ? ((ix_1) image).MY() : null;
        if ((border != null && border != imageBorder) || param3.dc0 != null || param3.UD0 || param3.dJ != null || param3.jA >= 0 || param3.ku >= 0) {
            image = new Q2(image, border, param3.dc0, param3.jA, param3.ku, param3.UD0, param3.dJ);
        }
        return image;
    }

    /**
     * 批量解析子图像序列并存入数组。
     */
    public final void F6(Ps0 var1, wl0_2[] var2) throws XmlPullParserException, IOException {
        int var3 = 0;
        while (var1.Ja0.getEventType() == 2) {
            if (var3 == var2.length) {
                throw rethrow(new XmlPullParserException("Too many sub images", var1.Ja0, null));
            }
            int var10003 = var3++;
            String var4 = var1.Ja0.getName();
            var2[var10003] = this.COM7(var1, var4);
            var1.Ja0.require(3, null, var4);
            var1.aM();
        }

        if (var3 != var2.length) {
            throw rethrow(new XmlPullParserException("Not enough sub images", var1.Ja0, null));
        }
    }

    /**
     * 解析缩放参数与颜色属性。
     */
    public final og_2 Qz0(Ps0 var1) {
        og_2 var10 = new og_2();
        String var2 = "tint";
        LC0 var3 = this.Tu;
        gn_0 var4 = gn_0.WHITE;
        if ((var2 = var1.Yd0(var2)) != null) {
            var4 = dj0_0.n20(var1, var2, var3);
        }
        var10.PZ = var4;

        var2 = "zoom";
        float var21 = 1.0F;
        if ((var2 = var1.Yd0(var2)) != null) {
            try {
                var21 = Float.parseFloat(var2);
            } catch (NumberFormatException var9) {
                throw rethrow(new XmlPullParserException("Unable to parse float", var1.Ja0, var9).initCause(var9));
            }
        }

        float var15;
        if ((var2 = var1.Yd0("zoomX")) == null) {
            var15 = var21;
        } else {
            try {
                var15 = Float.parseFloat(var2);
            } catch (NumberFormatException var8) {
                throw rethrow(new XmlPullParserException("Unable to parse float", var1.Ja0, var8).initCause(var8));
            }
        }
        var10.Iy = var15;

        String var16;
        if ((var16 = var1.Yd0("zoomY")) != null) {
            try {
                var21 = Float.parseFloat(var16);
            } catch (NumberFormatException var7) {
                throw rethrow(new XmlPullParserException("Unable to parse float", var1.Ja0, var7).initCause(var7));
            }
        }
        var10.OL0 = var21;

        var16 = "zoomCenterX";
        var21 = 0.5F;
        if ((var16 = var1.Yd0(var16)) != null) {
            try {
                var21 = Float.parseFloat(var16);
            } catch (NumberFormatException var6) {
                throw rethrow(new XmlPullParserException("Unable to parse float", var1.Ja0, var6).initCause(var6));
            }
        }
        var10.js = var21;

        var16 = "zoomCenterY";
        var21 = 0.5F;
        if ((var16 = var1.Yd0(var16)) != null) {
            try {
                var21 = Float.parseFloat(var16);
            } catch (NumberFormatException var5) {
                throw rethrow(new XmlPullParserException("Unable to parse float", var1.Ja0, var5).initCause(var5));
            }
        }
        var10.VC0 = var21;
        return var10;
    }

    /**
     * 解析帧动画序列结构。
     */
    public final h6_0 Kk0(Ps0 var1) throws XmlPullParserException, IOException {
        String var2 = var1.Yd0("count");
        int var3 = 0;
        if (var2 != null && (var3 = Integer.parseInt(var2)) <= 0) {
            throw new IllegalArgumentException("Invalid repeat count");
        }

        boolean var19 = false;
        boolean var4 = false;
        ArrayList var5 = new ArrayList();
        var1.aM();

        while (var1.Ja0.getEventType() == 2) {
            if (var19 && !var4) {
                var19 = true;
                Level var6 = Level.WARNING;
                String var7 = "Animation frames after an endless repeat won''t be displayed: {0}";
                String var8 = var1.Ja0.getPositionDescription();
                if (var1.S30 != null) {
                    var8 = AN.nK0(var8, " in ").append(var1.S30).toString();
                }
                Wp.log(var6, var7, var8);
                var4 = true;
            }

            String var21 = var1.Ja0.getName();
            if ("repeat".equals(var21)) {
                var5.add(this.Kk0(var1));
            } else if ("frame".equals(var21)) {
                int var24;
                if ((var24 = var1.vj0(var1.Zs("duration"))) < 0) {
                    throw new IllegalArgumentException("duration must be >= 0 ms");
                }
                og_2 var28 = this.Qz0(var1);
                wl0_2 var32 = this.or(var1, var1.Zs("ref"));
                var5.add(new com3__2(var24, var32, var28.PZ, var28.Iy, var28.OL0, var28.js, var28.VC0));
                var1.aM();
            } else {
                if (!"frames".equals(var21)) {
                    throw rethrow(var1.Su0());
                }

                oc_0 var23 = new oc_0();
                this.Gl(var1, var23);
                this.f8(var1, var23);
                int var27;
                if ((var27 = var1.vj0(var1.Zs("duration"))) < 1) {
                    throw new IllegalArgumentException("duration must be >= 1 ms");
                }
                int var31;
                if ((var31 = var1.vj0(var1.Zs("count"))) < 1) {
                    throw new IllegalArgumentException("count must be >= 1");
                }

                og_2 var9 = this.Qz0(var1);
                int var10 = 0;
                String var11;
                if ((var11 = var1.Yd0("offsetx")) != null) {
                    var10 = var1.vj0(var11);
                }
                int var35 = 0;
                String var12;
                if ((var12 = var1.Yd0("offsety")) != null) {
                    var35 = var1.vj0(var12);
                }
                if (var31 > 1 && var10 == 0 && var35 == 0) {
                    throw new IllegalArgumentException("offsets required for multiple frames");
                }

                for (int var37 = 0; var37 < var31; ++var37) {
                    wl0_2 var39 = this.tI0(var1, var23.B1, var23.T70, var23.tD0, var23.BE, gn_0.WHITE, false, var23.ih0);
                    var5.add(new com3__2(var27, var39, var9.PZ, var9.Iy, var9.OL0, var9.js, var9.VC0));
                    var23.B1 += var10;
                    var23.T70 += var35;
                }
                var1.aM();
            }

            EU var25 = (EU) var5.get(var5.size() - 1);
            boolean var26 = var25 instanceof h6_0 && ((h6_0) var25).D9 == 0;
            var1.Ja0.require(3, null, var21);
            var1.aM();
            var19 = var26;
        }

        return new h6_0((EU[]) var5.toArray(new EU[0]), var3);
    }

    /**
     * 解析旋转角度属性。
     */
    public final void f8(Ps0 var1, oc_0 var2) {
        if (this.lpt8 != null) {
            String var5 = var1.Yd0("rot");
            int var3 = 0;
            if (var5 != null) {
                var3 = var1.vj0(var5);
            }
            if (var3 != 0) {
                if (var3 != 90) {
                    if (var3 != 180) {
                        if (var3 != 270) {
                            throw rethrow(new XmlPullParserException("invalid rotation angle", var1.Ja0, null));
                        }
                        var2.ih0 = 4;
                    } else {
                        var2.ih0 = 3;
                    }
                } else {
                    var2.ih0 = 2;
                }
            } else {
                var2.ih0 = 1;
            }
        } else {
            throw rethrow(new XmlPullParserException("can't create area outside of <imagefile> object", var1.Ja0, null));
        }
    }

    /**
     * 根据别名查找并引用图像资源。
     */
    public final wl0_2 or(Ps0 var1, String var2) {
        if (!var2.endsWith(".*")) {
            wl0_2 var4 = (wl0_2) this.DA0.get(var2);
            if (var4 != null) {
                return var4;
            } else {
                String var5 = xq_1.pz0("referenced image \"", var2, "\" not found");
                throw rethrow(new XmlPullParserException(var5, var1.Ja0, null));
            }
        } else {
            throw rethrow(new XmlPullParserException("wildcard mapping not allowed", var1.Ja0, null));
        }
    }

    /**
     * 根据别名查找并获取鼠标光标描述符。
     */
    public final dc0_0 GW(Ps0 var1, String var2) {
        dc0_0 var3 = (dc0_0) this.KR.get(var2);
        if (var3 != null) {
            if (var3 == Be0) {
                var3 = null;
            }
            return var3;
        } else {
            String var4 = xq_1.pz0("referenced cursor \"", var2, "\" not found");
            throw rethrow(new XmlPullParserException(var4, var1.Ja0, null));
        }
    }

    /**
     * 创建纹理切片图像对象（ZM / GZ / o）。
     */
    public final wl0_2 tI0(Ps0 var1, int var2, int var3, int var4, int var5, gn_0 var6, boolean var7, int var8) {
        if (var4 != 0 && var5 != 0) {
            xu_1 var18 = this.lpt8;
            int var9 = var18.S90;
            int var10 = var18.OW;
            int var11 = Math.abs(var4) + var2;
            int var12 = Math.abs(var5) + var3;
            if (var2 < 0 || var2 >= var9 || var11 < 0 || var11 > var9 || var3 < 0 || var3 >= var10 || var12 < 0 || var12 > var10) {
                Level var14 = Level.WARNING;
                String var15 = "texture partly outside of file: {0}";
                String var16 = var1.Ja0.getPositionDescription();
                if (var1.S30 != null) {
                    var16 = AN.nK0(var16, " in ").append(var1.S30).toString();
                }
                Wp.log(var14, var15, var16);
                var2 = Math.max(0, Math.min(var2, var9));
                var3 = Math.max(0, Math.min(var3, var10));
                int var19 = Integer.signum(var4);
                var4 = (Math.max(0, Math.min(var11, var9)) - var2) * var19;
                var19 = Integer.signum(var5);
                var5 = (Math.max(0, Math.min(var12, var10)) - var3) * var19;
            }

            if (var2 >= 0 && var2 < var18.S90) {
                if (var3 >= 0 && var3 < var18.OW) {
                    if (Math.abs(var4) + var2 <= var18.S90) {
                        if (Math.abs(var5) + var3 > var18.OW) {
                            throw new IllegalArgumentException("height");
                        } else {
                            Object var21;
                            if (var8 == 1 && (!var7 || (var4 >= 0 && var5 >= 0))) {
                                if (var7) {
                                    var21 = new ZM(var18, var2, var3, var4, var5, var6);
                                } else {
                                    var21 = new GZ(var18, var2, var3, var4, var5, var6);
                                }
                            } else {
                                var21 = new o(var18, var4, var5, var6, var7);
                            }
                            return (wl0_2) var21;
                        }
                    } else {
                        throw new IllegalArgumentException("width");
                    }
                } else {
                    throw new IllegalArgumentException("y");
                }
            } else {
                throw new IllegalArgumentException("x");
            }
        } else {
            return new FK(Math.abs(var4), Math.abs(var5));
        }
    }

    /**
     * 解析图像区域范围参数 xywh。
     */
    public final void Gl(Ps0 var1, oc_0 var2) {
        if (this.lpt8 == null) {
            throw rethrow(new XmlPullParserException("can't create area outside of <imagefile> object", var1.Ja0, null));
        }

        String var3 = var1.Zs("xywh");
        if ("*".equals(var3)) {
            var2.B1 = 0;
            var2.T70 = 0;
            var2.tD0 = this.lpt8.S90;
            var2.BE = this.lpt8.OW;
            return;
        }

        try {
            int[] var4 = RF.t30(var3);
            if (var4.length != 4) {
                throw rethrow(new XmlPullParserException("xywh requires 4 integer arguments", var1.Ja0, null));
            }
            var2.B1 = var4[0];
            var2.T70 = var4[1];
            var2.tD0 = var4[2];
            var2.BE = var4[3];
        } catch (IllegalArgumentException var5) {
            throw rethrow(var1.yF("can't parse xywh argument", var5));
        }
    }

    /**
     * 解析分割坐标点数组（splitx, splity）。
     */
    public static int[] ZK0(Ps0 var0, String var1, int var2) {
        String var3 = var0.Yd0(var1);
        if (var3 == null) {
            return null;
        }

        int var4 = var3.indexOf(',');
        if (var4 < 0) {
            throw rethrow(new XmlPullParserException(var1.concat(" requires 2 values"), var0.Ja0, null));
        }

        try {
            int[] var5 = new int[4];
            int var6 = 0;
            int var7 = 0;
            for (; var6 < 2; var6++) {
                String var8 = RF.HF(var3, var7, var4);
                if (var8.length() == 0) {
                    throw new NumberFormatException("empty string");
                }
                int var9 = 0;
                int var10 = 1;
                switch (var8.charAt(0)) {
                    case 'B': case 'R': case 'b': case 'r':
                        var9 = var2;
                        var10 = -1;
                    case 'L': case 'T': case 'l': case 't':
                        var8 = RF.HF(var8, 1, var8.length());
                    default:
                }
                int var11 = Integer.parseInt(var8);
                var5[var6 + 1] = Math.max(0, Math.min(var2, var10 * var11 + var9));
                var7 = var4 + 1;
                var4 = var3.length();
            }
            if (var5[1] > var5[2]) {
                int var12 = var5[1];
                var5[1] = var5[2];
                var5[2] = var12;
            }
            var5[3] = var2;
            return var5;
        } catch (NumberFormatException var13) {
            throw rethrow(var0.yF("Unable to parse " + var1 + ": \"" + var3 + "\"", var13));
        }
    }

    /**
     * 递归推导动画根节点的边框属性。
     */
    public static ux0_0 o7(EU var0) {
        if (var0 instanceof h6_0) {
            EU[] var4 = ((h6_0) var0).EJ0;
            int var1 = var4.length;
            for (int var2 = 0; var2 < var1; ++var2) {
                ux0_0 var3 = o7(var4[var2]);
                if (var3 != null) {
                    return var3;
                }
            }
        } else if (var0 instanceof com3__2) {
            wl0_2 var5 = ((com3__2) var0).lp;
            if (var5 instanceof ix_1) {
                return ((ix_1) var5).MY();
            }
        }
        return null;
    }
}
