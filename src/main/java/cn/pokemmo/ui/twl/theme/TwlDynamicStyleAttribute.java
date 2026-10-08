package cn.pokemmo.ui.twl.theme;

import f.*;

import cn.pokemmo.ui.twl.theme.TwlStyleAttribute;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * 样式属性兼容垫片
 * @see cn.pokemmo.ui.twl.theme.TwlStyleAttribute
 */
public class TwlDynamicStyleAttribute extends TwlStyleAttribute {
   private static final ArrayList attributes;
   public static final I0 HORIZONTAL_ALIGNMENT;
   public static final I0 VERTICAL_ALIGNMENT;
   public static final I0 TEXT_INDENT;
   public static final I0 TEXT_DECORATION;
   public static final I0 TEXT_DECORATION_HOVER;
   public static final I0 FONT_FAMILIES;
   public static final I0 FONT_SIZE;
   public static final I0 FONT_WEIGHT;
   public static final I0 FONT_ITALIC;
   public static final I0 TAB_SIZE;
   public static final I0 LIST_STYLE_IMAGE;
   public static final I0 LIST_STYLE_TYPE;
   public static final I0 PREFORMATTED;
   public static final I0 BREAKWORD;
   public static final I0 COLOR;
   public static final I0 COLOR_HOVER;
   public static final I0 INHERIT_HOVER;
   public static final I0 CLEAR;
   public static final I0 DISPLAY;
   public static final I0 FLOAT_POSITION;
   public static final I0 WIDTH;
   public static final I0 HEIGHT;
   public static final I0 BACKGROUND_IMAGE;
   public static final I0 BACKGROUND_COLOR;
   public static final I0 BACKGROUND_COLOR_HOVER;
   public static final I0 MARGIN_TOP;
   public static final I0 MARGIN_LEFT;
   public static final I0 MARGIN_RIGHT;
   public static final I0 MARGIN_BOTTOM;
   public static final I0 PADDING_TOP;
   public static final I0 PADDING_LEFT;
   public static final I0 PADDING_RIGHT;
   public static final I0 PADDING_BOTTOM;
   public static final _import MARGIN;
   public static final _import PADDING;
   public final boolean Vh0;
   public final Class MH;
   public final Object nu;
   public final int Ww0;

   public TwlDynamicStyleAttribute(Class type, Object value, boolean inherited) {
      super(type, value, inherited, attributes.size());
      this.Vh0 = inherited;
      this.MH = type;
      this.nu = value;
      this.Ww0 = attributes.size();
      attributes.add(this);
   }

   public static int hk0() {
      return attributes.size();
   }

   static {
      attributes = new ArrayList();
      HORIZONTAL_ALIGNMENT = new I0(ac0_2.class, ac0_2.LpT3, true);
      VERTICAL_ALIGNMENT = new I0(qi_2.class, qi_2.N6, true);
      TEXT_INDENT = new I0(g20_0.class, g20_0.Jp0, true);
      TEXT_DECORATION = new I0(rx0.class, rx0.j2, true);
      TEXT_DECORATION_HOVER = new I0(rx0.class, null, true);
      FONT_FAMILIES = new I0(r50_0.class, new r50_0("default", null), true);
      FONT_SIZE = new I0(g20_0.class, new g20_0(14.0f, 1), true);
      FONT_WEIGHT = new I0(Integer.class, Integer.valueOf(400), true);
      FONT_ITALIC = new I0(Boolean.class, Boolean.FALSE, true);
      TAB_SIZE = new I0(Integer.class, Integer.valueOf(8), true);
      LIST_STYLE_IMAGE = new I0(String.class, "ul-bullet", true);
      LIST_STYLE_TYPE = new I0(sw0.class, sw0.j, true);
      PREFORMATTED = new I0(Boolean.class, Boolean.FALSE, true);
      BREAKWORD = new I0(Boolean.class, Boolean.FALSE, true);
      COLOR = new I0(gn_0.class, gn_0.WHITE, true);
      COLOR_HOVER = new I0(gn_0.class, null, true);
      INHERIT_HOVER = new I0(Boolean.class, Boolean.FALSE, true);
      CLEAR = new I0(xv_1.class, xv_1.lP, false);
      DISPLAY = new I0(YA0.class, YA0.zH, false);
      FLOAT_POSITION = new I0(O10.class, O10.Jx0, false);
      WIDTH = new I0(g20_0.class, g20_0.NO, false);
      HEIGHT = new I0(g20_0.class, g20_0.NO, false);
      BACKGROUND_IMAGE = new I0(String.class, null, false);
      BACKGROUND_COLOR = new I0(gn_0.class, gn_0.TRANSPARENT, false);
      BACKGROUND_COLOR_HOVER = new I0(gn_0.class, gn_0.TRANSPARENT, false);
      MARGIN_TOP = new I0(g20_0.class, g20_0.Jp0, false);
      MARGIN_LEFT = new I0(g20_0.class, g20_0.Jp0, false);
      MARGIN_RIGHT = new I0(g20_0.class, g20_0.Jp0, false);
      MARGIN_BOTTOM = new I0(g20_0.class, g20_0.Jp0, false);
      PADDING_TOP = new I0(g20_0.class, g20_0.Jp0, false);
      PADDING_LEFT = new I0(g20_0.class, g20_0.Jp0, false);
      PADDING_RIGHT = new I0(g20_0.class, g20_0.Jp0, false);
      PADDING_BOTTOM = new I0(g20_0.class, g20_0.Jp0, false);
      MARGIN = new _import(MARGIN_TOP, MARGIN_LEFT, MARGIN_RIGHT, MARGIN_BOTTOM);
      PADDING = new _import(PADDING_TOP, PADDING_LEFT, PADDING_RIGHT, PADDING_BOTTOM);
   }

   @Override
   public final String toString() {
      try {
         for (Field field : I0.class.getFields()) {
            if (Modifier.isStatic(field.getModifiers()) && field.get(null) == this) {
               return field.getName();
            }
         }
      } catch (Throwable ignored) {
      }
      return "?";
   }
}
