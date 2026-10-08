package cn.pokemmo.graphics.camera;

import f.*;

import com.badlogic.gdx.math.Matrix4;

public abstract class Camera {
   public final C8 v40;
   public final C8 jd0;
   public final C8 St0;
   public final Matrix4 ep;
   public final Matrix4 bq;
   public final Matrix4 iJ;
   public final Matrix4 WT;
   public float Wu0;
   public float Qy;
   public float Ui;
   public float yG;
   public final fv_2 cON;
   public final C8 Px;
   public final iq0_0 YD;

   public Camera() {
      C8 var3;
      var3 = new C8();
      this.v40 = var3;
      C8 var4;
      var4 = new C8(0.0F, 0.0F, -1.0F);
      this.jd0 = var4;
      C8 var5;
      var5 = new C8(0.0F, 1.0F, 0.0F);
      this.St0 = var5;
      Matrix4 var6;
      var6 = new Matrix4();
      this.ep = var6;
      Matrix4 var7;
      var7 = new Matrix4();
      this.bq = var7;
      Matrix4 var8;
      var8 = new Matrix4();
      this.iJ = var8;
      Matrix4 var9;
      var9 = new Matrix4();
      this.WT = var9;
      this.Wu0 = 1.0F;
      this.Qy = 100.0F;
      this.Ui = 0.0F;
      this.yG = 0.0F;
      fv_2 var10;
      var10 = new fv_2();
      this.cON = var10;
      C8 var11;
      var11 = new C8();
      this.Px = var11;
      C8 var1;
      var1 = new C8();
      C8 var2;
      var2 = new C8();
      iq0_0 var12 = new iq0_0(var1, var2);
      this.YD = var12;
   }

   public abstract void lP();

   public void Y90(float var1, float var2, float var3) {
      C8 var4;
      C8 var10001 = var4 = this.Px;
      var4.x = var1;
      var4.y = var2;
      var4.z = var3;
      var1 = this.v40.x;
      var2 = this.v40.y;
      var3 = this.v40.z;
      var10001.Vy(var1, var2, var3).KM();
      if (!this.Px.eG()) {
         if (Math.abs((var1 = this.Px.S60(this.St0)) - 1.0F) < 1.0E-9F) {
            this.St0.np(this.jd0).Fg0(-1.0F);
         } else if (Math.abs(var1 + 1.0F) < 1.0E-9F) {
            this.St0.np(this.jd0);
         }

         this.jd0.np(this.Px);
         this.Px.np(this.jd0).Xv0(this.St0);
         this.St0.np(this.Px).Xv0(this.jd0).KM();
      }
   }

   public final void Aj(C8 var1, C8 var2, float var3) {
      C8 var10008 = this.Px;
      C8 var10009 = this.Px;
      C8 var4;
      C8 var10010 = var4 = this.Px;
      var4.getClass();
      float var8 = var1.x;
      float var13 = var1.y;
      float var5 = var1.z;
      var10010.x = var8;
      var10009.y = var13;
      var10008.z = var5;
      C8 var10007 = var1 = this.Px;
      var10008 = this.v40;
      var10009 = this.v40;
      var10010 = this.v40;
      var1.getClass();
      float var6 = var10010.x;
      float var10 = var10009.y;
      float var14 = var10008.z;
      var10007.Vy(var6, var10, var14);
      this.Xw(this.Px);
      this.jd0.YO(var2, var3);
      this.St0.YO(var2, var3);
      this.Px.YO(var2, var3);
      float var7 = -this.Px.x;
      float var11 = -this.Px.y;
      float var12 = -this.Px.z;
      this.v40.na(var7, var11, var12);
   }

   public void Xw(C8 var1) {
      C8 var3;
      C8 var10000 = var3 = this.v40;
      var3.getClass();
      float var4 = var1.x;
      float var5 = var1.y;
      float var2 = var1.z;
      var10000.na(var4, var5, var2);
   }

   public final void Lpt4(C8 var1, float var2, float var3, float var4, float var5) {
      float var6 = var1.x - var2;
      float var10005 = lg_0.S4.sD0() - var1.y - var3;
      var1.x = var6 * 2.0F / var4 - 1.0F;
      var1.y = var10005 * 2.0F / var5 - 1.0F;
      var1.z = var1.z * 2.0F - 1.0F;
      var1.Ye0(this.WT);
   }

   public final C8 zz(C8 var1) {
      float var2 = lg_0.S4.Kr0();
      float var3 = lg_0.S4.sD0();
      this.ZX(var1, 0.0F, 0.0F, var2, var3);
      return var1;
   }

   public final void ZX(C8 var1, float var2, float var3, float var4, float var5) {
      var1.Ye0(this.iJ);
      var1.x = (var1.x + 1.0F) * var4 / 2.0F + var2;
      var1.y = (var1.y + 1.0F) * var5 / 2.0F + var3;
      var1.z = (var1.z + 1.0F) / 2.0F;
   }

   public final iq0_0 k0(float var1, float var2, float var3, float var4, float var5, float var6) {
      // [右键菜单诊断] 射线构建入口：6 个实参 = 拾取所用的屏幕坐标与视口尺寸（定位后删除）
      System.out.println("[右键菜单诊断] k0构建射线: 实参=(" + var1 + "," + var2 + "," + var3 + "," + var4 + "," + var5 + "," + var6 + ")");
      System.out.println("[右键菜单诊断] 相机状态: 位置=(" + this.v40.x + "," + this.v40.y + "," + this.v40.z
            + ") 朝向=(" + this.jd0.x + "," + this.jd0.y + "," + this.jd0.z
            + ") 视口宽高=(" + this.Ui + "," + this.yG + ") 远近裁剪=(" + this.Wu0 + "," + this.Qy + ")");
      System.out.println("[右键菜单诊断] 合成矩阵iJ=" + java.util.Arrays.toString(this.iJ.EW));
      System.out.println("[右键菜单诊断] 逆矩阵WT=" + java.util.Arrays.toString(this.WT.EW));
      C8 var10005 = this.YD.er0;
      C8 var10006 = this.YD.er0;
      C8 var10007 = this.YD.er0;
      float var7 = 0.0F;
      this.YD.er0.x = var1;
      var10007.y = var2;
      var10006.z = var7;
      this.Lpt4(var10005, var3, var4, var5, var6);
      C8 var16 = this.YD.Vq;
      float var8 = 1.0F;
      this.YD.Vq.x = var1;
      var16.y = var2;
      var16.z = var8;
      this.Lpt4(var16, var3, var4, var5, var6);
      iq0_0 var9;
      C8 var11;
      C8 var14 = var11 = (var9 = this.YD).Vq;
      C8 var15 = var9.er0;
      var16 = var9.er0;
      C8 var18 = var9.er0;
      var11.getClass();
      float var10 = var18.x;
      var1 = var16.y;
      var2 = var15.z;
      var14.Vy(var10, var1, var2).KM();
      // [右键菜单诊断] 射线端点（定位后删除）
      System.out.println("[右键菜单诊断] k0射线结果: 近点=(" + this.YD.er0.x + "," + this.YD.er0.y + "," + this.YD.er0.z
            + ") 远点=(" + this.YD.Vq.x + "," + this.YD.Vq.y + "," + this.YD.Vq.z + ")");
      return this.YD;
   }
}
