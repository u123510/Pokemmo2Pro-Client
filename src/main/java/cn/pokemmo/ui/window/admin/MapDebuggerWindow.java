package cn.pokemmo.ui.window.admin;

import f.*;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 地图图块与网格调试器窗口
 *
 * 原混淆类: f.UV
 */
public class MapDebuggerWindow extends R90 {
   public final C8 Ub = new C8();
   public final L00 Nb;
   public final QN Pl;
   public final O3 Le0;
   public BM zm;
   public PRN_ Fa;
   public final es_1 v8;
   public le0_2 Im0;

   public MapDebuggerWindow() {
      O3 tree = new O3();
      this.Le0 = tree;
      this.zm = null;
      this.v8 = new es_1();
      this.Im0 = new le0_2();
      vo_2 currentView = tw0_0.LD0 != null ? tw0_0.LD0.wL() : null;
      this.Nb = currentView instanceof L00 ? (L00)currentView : null;

      ((R90)this).Pb0(this::xe0);
      QN table = new QN(tree);
      this.Pl = table;
      table.uf("/mapview-table");
      table.Vo0(xp_2.class, new E6());
      table.Vo0(ki0_0.class, new qj_1());
      table.Vo0(xe_1.class, new prn__1());
      table.Vo0(ka0_1.class, new DL());
      table.Vo0(qj_2.class, new YB());
      table.Dp0();
      table.p5(true);
      lo0_0 scrollPane = new lo0_0(table);
      scrollPane.uf("scrollpane");
      scrollPane.Qs0(2);
      ((le0_2)this).uf("mapview");
      ((R90)this).Hy("MapDebugger");
      xe_1 refresh = new xe_1("Refresh");
      refresh.RR(this::EP);
      X6 season = new X6(new pg0_2((Object[])new String[]{"Spring", "Summer", "Autumn", "Winter"}));
      season.Bd(c8_0.A90().YG());
      season.Rm0(() -> ry(season));
      fy_2 layout = new fy_2();
      layout.WQ(layout.hb(new le0_2[]{season, scrollPane, refresh}));
      layout.x40(layout.C7(new le0_2[]{season, scrollPane, refresh}));
      this.RY(600, 400);
      this.SL(layout);
      this.tA0();
      this.lt0();
   }

   public static void sE0(Ou0 var0, String var1) {
      var0.Ey(var1, false, (gw_0)null);
   }

   public static void nl0(Ou0 var0, String var1) {
      var0.Ey(var1, false, (gw_0)null);
   }

   public static void jG0(Ou0 var0, String var1) {
      var0.Ey(var1, false, (gw_0)null);
   }

   public static void bI0(Ou0 var0, String var1) {
      var0.Ey(var1, false, (gw_0)null);
   }

   public static void aJ0(Xz0 var0) {
      I2 animations = var0.sJ0.ZD();
      while (animations.hasNext()) {
         I20 animation = (I20)animations.next();
         animation.eh = !animation.eh;
      }
   }

   public static void ry(X6 var0) {
      c8_0.JD0.jH0((byte)var0.mu0.Mw0);
      ug_0[] var3;
      int var1 = (var3 = (ug_0[])tw0_0.Ll0.Qz0.Pq.Sx0).length;

      for(int var2 = 0; var2 < var1; ++var2) {
         var3[var2].KJ();
      }

      vo_2 var4;
      if ((var4 = tw0_0.LD0.Sc) != null) {
         var4.vT();
      }

   }

   public final void R(nv0_0 var1) {
      String var2 = "";
      if (var1.wp0.Mp0.dL(tw0_0.e60.jB0.L8.ze0)) {
         var2 = " (Current)";
      }

      O3 var3;
      O3 var10000 = var3 = this.Le0;
      var2 = VG.Mq(new StringBuilder(), var1.wp0.yI0, var2);
      String var4 = var1.EK.getName();
      var10000.getClass();
      oh_1 var5;
      var5 = new oh_1(var3, var2, var4);
      int var8 = var10000.ua.size();
      assert ((com6__0)var3).Fi(var5) < 0;
      assert var5.ge0 == var3;
      {
         var3.ua.add(var8, var5);
         ((com6__0)var3).q1(var8, var3);
         var5.ql0("Tileset: ", var1.O00);
         var5.ql0("Footer: ", var1.uI);
         var5.ql0("Building ID: ", var1.VJ);
         oh_1 var9;
         oh_1 var21 = var9 = var5.ql0("HeaderID: ", var1.EK.O60);
         var21.ql0("Camera", var1.EK.b9);
         var21.ql0("Events ID", var1.EK.ES);
         Z50 var16 = var1.EK;
         C8 var12 = new C8((float)var16.zc0, (float)var16.Ph0, (float)var16.rB0);

         var21.ql0("Fly Pos", var12);
         var21.ql0("MapType", var1.EK.IU());
         var21.ql0("Weather ID", var1.EK.Z60);
         var21.ql0("Can Fly", var1.EK.c40());
         var21.ql0("Can Escape", var1.EK.j2());
         var21.ql0("NameID: ", var1.EK.tN & 255);
         var21.ql0("Matrix: ", var1.EK.Va0);
         var21.ql0("Script Bank ID: ", var1.EK.Zd);
         hb_1 var13;
         if ((var13 = var1.EK.TC0) != null) {
            var9.ql0("Lightning", var13.Is0);
         }

         this.fC0(var1.wp0, var1.O00, var5);
         int var10;
         if ((var10 = var1.yf0.KB) > 0) {
            oh_1 var11 = var5.ql0("Buildings", var10);
            I2 var6 = var1.yf0.ZD();

            while(var6.hasNext()) {
               Ou0 var14;
               Ou0 var10002 = var14 = (Ou0)var6.next();
               C8 var18;
               var18 = new C8();
               var10002.ho.V1(var18);
               xe_1 var20;
               xe_1 var10003 = var20 = new xe_1("View");

               var10003.RR(() -> this.QB0(var18));
               oh_1 var19 = var11.ql0(var10002.yI0, var20);
               this.fC0(var14, -1, var19);
            }
         }

      }
   }

   public final void tA0() {
      this.Pl.p5(false);
      O3 var1;
      int var2;
      if ((var2 = (var1 = this.Le0).ua.size()) > 0) {
         var1.ua.clear();
         byte var3 = 0;
         r60_0[] var4;
         if ((var4 = var1.Z) != null) {
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
               QN var7;
               Cs0 var8;
               if ((var8 = (Cs0)a9_0.i40((var7 = var4[var6].OB).Vg0, var1)) != null) {
                  int var9;
                  int var10 = (var9 = var7.xK0(var1) + 1) + var2;
                  wb_1 var11;
                  if ((var11 = var8.Ma0) != null) {
                     assert var11.VQ == var1.ua.size() + var2;

                     var10 = var8.Ma0.eC0(var3) + var9;
                     var9 = var8.Ma0.eC0(var2) + var9;
                     wb_1 var10001 = var8.Ma0;
                     int var17 = var10001.VQ;
                     int[] var12 = var10001.p2;
                     var10001.li(0, var17, var12);
                     var17 = var10001.VQ - var2;
                     var12 = var10001.p2;
                     System.arraycopy(var12, var2, var12, var3, var17);
                     var10001.VQ = var17;
                     var10001.iB0(0, var17);
                     assert var8.Ma0.VQ == var1.ua.size();

                     int var18 = var10;
                     var10 = var9;
                     var9 = var18;
                  }

                  if (var8.Z5 != null) {
                     for(int var19 = 0; var19 < var2; ++var19) {
                        var7.ED(var8.Z5[var19]);
                     }

                     int var20;
                     if ((var20 = var1.ua.size()) > 0) {
                        Cs0[] var22;
                        Cs0[] var24 = var22 = new Cs0[var20];
                        System.arraycopy(var8.Z5, 0, var22, 0, var3);
                        System.arraycopy(var8.Z5, var2, var22, var3, var20);
                        var8.Z5 = var24;
                     } else {
                        var8.Z5 = null;
                     }
                  }

                  if (var7.pF(var8)) {
                     ((Nj)var7).c7(var9, var10 - var9);
                  }
               }
            }
         }
      }

      this.Pl.p5(true);
      if (this.Nb != null) {
         I2 var13 = this.Nb.qf.ZD();

         while(var13.hasNext()) {
            this.R((nv0_0)var13.next());
         }
      } else {
         String regionDesc = "2D Map";
         byte bankId = -1;
         byte mapId = -1;
         String weatherName = "NONE";
         String posStr = "未知";
         if (tw0_0.e60 != null && tw0_0.e60.N60() != null) {
            _else currentMap = tw0_0.e60.N60();
            int regionId = currentMap.dw;
            bankId = currentMap.Bm0;
            mapId = currentMap.case$;
            if (currentMap.Jo0 != null) {
               weatherName = currentMap.Jo0.name();
            }
            if (tw0_0.e60.jB0 != null && tw0_0.e60.jB0.il0 != null && tw0_0.e60.jB0.il0.t60 != null) {
               C8 pos = tw0_0.e60.jB0.il0.t60;
               posStr = "X: " + (int)pos.x + ", Y: " + (int)pos.y + ", Z: " + (int)pos.z;
            }
            if (regionId == 0 || regionId == 1) {
               regionDesc = "关都 (Kanto / FRLG)";
            } else {
               regionDesc = "Region " + regionId;
            }
         }
         oh_1 root = new oh_1(this.Le0, "当前地图: " + regionDesc, "2D瓦片模式");
         int idx = this.Le0.ua.size();
         this.Le0.ua.add(idx, root);
         ((com6__0)this.Le0).q1(idx, this.Le0);
         root.ql0("地区 (Region): ", regionDesc);
         root.ql0("地图分区 (Bank ID): ", bankId);
         root.ql0("地图编号 (Map ID): ", mapId);
         root.ql0("玩家坐标 (Position): ", posStr);
         root.ql0("当前天气 (Weather): ", weatherName);
         root.ql0("渲染器类型 (Renderer): ", tw0_0.LD0 != null && tw0_0.LD0.Sc != null ? tw0_0.LD0.Sc.getClass().getSimpleName() : "None");
         root.ql0("说明 (Notice): ", "当前为2D地图，无3D模型与UV材质动画。上方季节切换等控制器仍可正常使用。");
      }
   }

   public final void N00(zk0_1 var1) {
      I2 var3 = this.v8.ZD();

      while(var3.hasNext()) {
         GG var2 = (GG)var3.next();
         this.Im0.u3(var2.LpT4);
      }

      this.v8.clear();
      Qy0.yI0.u3(this.Im0);
   }

   public final void HP(zk0_1 var1) {
      le0_2 var10002 = this.Im0;
      int var2;
      int var3;
      var10002.oY(var2 = tw0_0.LD0.ew0(), var3 = tw0_0.LD0.Hv0());
      var10002.RY(var2, var3);
      var10002.g2(var2, var3);
      this.Im0.E40(0, 0);
      Qy0.yI0.Qw0(this.Im0);
      I2 var9 = this.v8.ZD();

      while(var9.hasNext()) {
         GG var10;
         GG var10000 = var10 = (GG)var9.next();
         var10000.getClass();
         jy_1 var4 = tw0_0.LD0.aj;
         C8 var21 = this.Ub;
         float var10003 = (float)var10.ts.Tz() * 0.25F + 0.1F;
         float var5 = var10.ts.S80() * 0.25F + 0.1F;
         float var6 = (float)var10.ts.HR() * 0.25F + 0.05F;
         var21.x = var10003;
         var21.y = var5;
         var21.z = var6;
         if (tt0_0.C7()) {
            BJ0 var22 = this.Nb.cV();
            var5 = (float)(-var4.df);
            var6 = (float)var4.gS;
            float var7 = (float)var4.Ty;
            float var8 = (float)var4.Ja;
            ((Tv0)var22).ZX(this.Ub, var5, var6, var7, var8);
         } else {
            this.Nb.cV().zz(this.Ub);
         }

         GG var23 = var10;
         GG var10001 = var10;
         C8 var16 = this.Ub;
         Tv0 var25 = var4.v3;
         C8 var10004 = var16;
         jy_1 var10005 = var4;
         jy_1 var10006 = var4;
         jy_1 var10007 = var4;
         float var13 = (float)var4.df;
         float var17 = (float)var10007.gS;
         var6 = (float)var10006.Ty;
         float var20 = (float)var10005.Ja;
         var25.ZX(var10004, var13, var17, var6, var20);
         C8 var11;
         var10.LpT4.E40((int)(var11 = this.Ub).x, (int)var11.y);
         cn_0 var24 = var10001.LpT4;
         byte var12 = 120;
         byte var14 = 20;
         ((le0_2)var24).oY(120, 20);
         ((le0_2)var24).RY(var12, var14);
         ((le0_2)var24).g2(var12, var14);
         var23.LpT4.lt0();
      }

      super.HP(var1);
   }

   public final void AD(Xz0 var1, oh_1 var2) {
      I2 children = var1.yn.ZD();

      while(children.hasNext()) {
         Xz0 child = (Xz0)children.next();
         xe_1 view = new xe_1("View");
         xe_1 visibility = new xe_1("Toggle Visibility");
         ka0_1 actions = new ka0_1(new le0_2[]{view, visibility});
         actions.qq = 1.0F;
         I2 animations = child.sJ0.ZD();

         while(animations.hasNext()) {
            I20 animation = (I20)animations.next();
            view.RR(() -> this.XR(animation));
         }

         visibility.RR(() -> aJ0(child));
         this.AD(child, var2.ql0(child.mw, actions));
      }

   }

   public final void fC0(Ou0 var1, int var2, oh_1 var3) {
      var3.ql0("Building ID", var1.AD);
      var3.ql0("Is Exterior", var1.ST);
      var3.ql0("Position", var1.ho.V1(new C8()));
      oh_1 var4 = var3.ql0("Animations", var1.Kv.KB);
      HashMap var5;
      if ((var5 = var1.i10) != null) {
         oh_1 var14 = var4.ql0("Material", var5.size());
         Iterator var6 = var1.i10.keySet().iterator();

         while(var6.hasNext()) {
            String var7;
            String var10001 = var7 = (String)var6.next();
            xe_1 var8;
            xe_1 var10002 = var8 = new xe_1("Play");
            var10002.RR(() -> bI0(var1, var7));
            var14.ql0(var10001, var8);
         }
      }

      if ((var5 = var1.lj0) != null) {
         oh_1 var16 = var4.ql0("Texture", var5.size());
         Iterator var23 = var1.lj0.keySet().iterator();

         while(var23.hasNext()) {
            String var29;
            String var53 = var29 = (String)var23.next();
            xe_1 var42;
            xe_1 var57 = var42 = new xe_1("Play");
            var57.RR(() -> jG0(var1, var29));
            var16.ql0(var53, var42);
         }
      }

      if ((var5 = var1.Sm0) != null) {
         oh_1 var18 = var4.ql0("UV", var5.size());
         Iterator var24 = var1.Sm0.keySet().iterator();

         while(var24.hasNext()) {
            String var30;
            String var54 = var30 = (String)var24.next();
            xe_1 var43;
            xe_1 var58 = var43 = new xe_1("Play");
            var58.RR(() -> nl0(var1, var30));
            var18.ql0(var54, var43);
         }
      }

      I2 var19 = var1.Kv.ZD();

      while(var19.hasNext()) {
         String var25;
         String var55 = var25 = (String)var19.next();
         xe_1 var31;
         xe_1 var59 = var31 = new xe_1("Play");
         var59.RR(() -> sE0(var1, var25));
         var4.ql0(var55, var31);
      }

      var4 = var3.ql0("Nodes", var1.ZE0.KB);
      var19 = var1.ZE0.ZD();

      while(var19.hasNext()) {
         Xz0 var26;
         Xz0 var60 = var26 = (Xz0)var19.next();
         String var32 = var60.mw;
         this.AD(var26, var4.ql0(var32, var60.BI0));
      }

      var3 = var3.ql0("Materials", var1.Y3.KB);
      I2 var13 = var1.Y3.ZD();

      while(var13.hasNext()) {
         BM var21 = (BM)var13.next();
         qj_2 var27;
         qj_2 var10000 = var27 = new qj_2("", 0, 0);
         ((le0_2)var10000).uf("spritebutton");
         u4_0 var33;
         if ((var33 = var1.FC0) != null) {
            u4_0 var47 = var33;
            String var34 = var21.mi;
            Texture var35;
            if ((var35 = (Texture)var47.QR.Wk0(var34)) != null) {
               var27.tp0.LX(new Texture[]{var35});
               Br0 var56 = var27.tp0;
               int var36 = 32;
               byte var44 = 32;
               var56.OA0 = true;
               var56.IF = var36;
               var56.gx0 = var44;
               var56.Dg(pa0_0.Ol);
               Br0 var48 = var27.tp0;
               var36 = (byte)2;
               var36 = var48.a4 + var36;
               var48.gY = 8;
               var48.a4 = var36;
            }
         }

         BM var49 = var21;
         new xe_1("View");
         ((xe_1)var27).RR(() -> this.Sj0(var49, var1, var2));
         oh_1 var22 = var3.ql0(var21.mi, var27);
         I2 var28 = var49.VH.ZD();

         while(var28.hasNext()) {
            hf_1 var39;
            hf_1 var50 = var39 = (hf_1)var28.next();
            oh_1 var45 = var22.ql0("Attr", var39);
            long var9;
            if ((var9 = var50.yO) == pr_1.av) {
               int var40;
               int var51 = var40 = ((pr_1)var39).ps;
               String var46 = "GL_NONE";
               if (var51 != 1028) {
                  if (var40 != 1029) {
                     if (var40 == 1032) {
                        var46 = "GL_FRONT_AND_BACK";
                     }
                  } else {
                     var46 = "GL_BACK";
                  }
               } else {
                  var46 = "GL_FRONT";
               }

               var45.ql0("CullMode", var46);
            } else if (var9 == ma_1.ZL) {
               int var52 = ((ma_1)var39).BA0;
               String var41 = "";
               switch (var52) {
                  case 513:
                     var41 = "GL_LESS";
                     break;
                  case 514:
                     var41 = "GL_EQUAL";
                     break;
                  case 515:
                     var41 = "GL_LEQUAL";
               }

               var45.ql0("DepthFunc", var41);
            } else if (var9 == PRN_.xE) {
               var45.ql0("Color", ((PRN_)var39).v50);
            } else if (var9 == sh_0.vF0) {
               var45.ql0("Opacity", ((sh_0)var39).yt);
            }
         }
      }

   }

   public final void Sj0(BM var1, Ou0 var2, int var3) {
      BM var4;
      if ((var4 = this.zm) != null) {
         PRN_ var5;
         if ((var5 = this.Fa) != null) {
            ((wh_0)var4).LPT8(var5);
         } else {
            ((wh_0)var4).fR(PRN_.Ly);
         }
      }

      if (this.zm == var1) {
         this.zm = null;
         this.Fa = null;
      } else {
         if (tt0_0.C7()) {
            u4_0 var9;
            if ((var9 = var2.FC0) == null) {
               Qy0.yI0.dk(-1, "No texture provider found");
               return;
            }

            int var10 = var9.En(var1.mi);
            u4_0 var12 = var2.FC0;
            Integer var13;
            int var14;
            if ((var13 = (Integer)var12.bb.Wk0(var1.mi)) == null) {
               var14 = -1;
            } else {
               var14 = var13;
            }

            if (var10 < 0 || var14 < 0) {
               Qy0.yI0.dk(-1, "No texture found");
               return;
            }

            tt0_0 var6 = tt0_0.j0;
            if (var3 < 0) {
               var3 = var2.AD + 1000;
            }

            var6.DP(var1, var2, var3, var10, var14);
         }

         long var8;
         if (((wh_0)var1).tM(var8 = PRN_.Ly)) {
            this.Fa = (PRN_)((wh_0)var1).sg(var8);
         }

         PRN_ var7 = new PRN_(var8, Color.GREEN);
         ((wh_0)var1).LPT8(var7);
         this.zm = var1;
      }
   }

   public final void XR(I20 var1) {
      L00 var10000 = this.Nb;
      pw_1 var10001 = pw_1.xC().Xf0();
      ao_1 var10002 = ao_1.DX(this.Nb.cV(), 4, 0.5F);
      C8 var10003 = var1.d40.T4;
      float var2 = var10003.x;
      float var3 = var10003.y;
      float var4 = var10003.z;
      var10001 = var10001.y80(var10002.kt(var2, var3, var4));
      var10002 = ao_1.DX(this.Nb.cV(), 9, 0.5F);
      var10003 = var1.d40.T4;
      float var5 = var10003.x;
      var2 = var10003.y;
      var3 = var10003.z;
      var10001 = var10001.y80(var10002.kt(var5, var2, var3)).mz0().p1(2.0F);
      var10001.xF0 = this.Nb.YB;
      var10000.COM4 = (pw_1)((D2)var10001).Ms(tw0_0.LD0.Ov);
   }

   public final void QB0(C8 var1) {
      L00 var10000 = this.Nb;
      pw_1 var10001 = pw_1.xC().Xf0();
      ao_1 var10002 = ao_1.DX(this.Nb.cV(), 4, 0.5F);
      float var2 = var1.x;
      float var3 = var1.y;
      float var4 = var1.z;
      var10001 = var10001.y80(var10002.kt(var2, var3, var4));
      var10002 = ao_1.DX(this.Nb.cV(), 9, 0.5F);
      C8 var10003 = var1;
      C8 var10004 = var1;
      float var5 = var1.x;
      var2 = var10004.y;
      var3 = var10003.z;
      var10001 = var10001.y80(var10002.kt(var5, var2, var3)).mz0().p1(2.0F);
      var10001.xF0 = this.Nb.YB;
      var10000.COM4 = (pw_1)((D2)var10001).Ms(tw0_0.LD0.lY);
   }

   public final void EP() {
      this.tA0();
   }
}
