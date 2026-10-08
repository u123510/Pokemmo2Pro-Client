package cn.pokemmo.graphics.render;

import f.*;
import java.util.Comparator;

/**
 * 现代化重构类 - 原始类: f.Tq0
 */
public class ModelBatchRenderer implements fy0_0 {

   public final gx_2 eq;
   public final es_1 ok;
   public final nb_2 dd0;
   public final Tv0 LU;
   public lt_1 We0;
   public final Comparator FI;
   public final U5 Py;

   public ModelBatchRenderer(Tv0 var1) {
      this(var1, null);
   }

   public ModelBatchRenderer(Tv0 var1, U5 var2) {
      this(var1, new d10_0(var1), var2);
   }

   public ModelBatchRenderer(Tv0 var1, Comparator var2, U5 var3) {
      gx_2 gx_2;
      gx_2 = new gx_2();
      this.eq = gx_2;
      es_1 es_1;
      es_1 = new es_1();
      this.ok = es_1;
      nb_2 nb_2;
      nb_2 = new nb_2();
      this.dd0 = nb_2;
      this.LU = var1;
      this.FI = var2;
      this.Py = var3;
      this.Wm();
   }

   @Override
   public final void dispose() {
      lt_1 lt_1;
      if ((lt_1 = this.We0) != null) {
         lt_1.dispose();
      }
   }

   public final void Wm() {
      String s = "";
      String s1 = "";
      if (this.Py != null) {
         s = "#define fogFlag\n";
         s1 = "#define fogFlag\n";
      }

      s = QA0.W0(
         s,
         "attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nattribute vec4 a_color_mix;\nuniform mat4 u_projectionViewMatrix;\nvarying vec4 v_color;\nvarying vec4 v_color_mix;\nvarying vec2 v_texCoords;\n#ifdef fogFlag\nvarying float v_fog;\nuniform vec4 u_cameraPosition;\n#endif\n\nvoid main()\n{\n   v_color = a_color;\n   v_color_mix = a_color_mix;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n#ifdef fogFlag\n   vec3 flen = u_cameraPosition.xyz - a_position.xyz;\n   float fog = dot(flen, flen) * u_cameraPosition.w;\n   v_fog = min(fog, 1.0);\n#endif\n   gl_Position =  u_projectionViewMatrix * a_position;\n}\n"
      );
      s1 = QA0.W0(
         s1,
         "#ifdef GL_ES\nprecision mediump float;\n#endif\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\nvarying vec4 v_color_mix;\nuniform sampler2D u_texture;\n#ifdef fogFlag\nuniform vec4 u_fogColor;\nvarying float v_fog;\n#endif\nvoid main()\n{\n  vec4 texel0 = texture2D(u_texture, v_texCoords); \n  gl_FragColor = v_color_mix * vec4(mix(texel0.rgb, v_color.rgb, v_color.a), texel0.a);\n#ifdef fogFlag\n  gl_FragColor.rgb = mix(gl_FragColor.rgb, u_fogColor.rgb, v_fog);\n#endif\nif (gl_FragColor.a <= 0.01)\n  discard;\n}"
      );
      lt_1 lt_1x = new lt_1(s, s1);

      this.We0 = lt_1x;
      if (!lt_1x.U00) {
         throw new IllegalArgumentException("couldn't compile shader: " + this.We0.aX());
      }
   }
}
