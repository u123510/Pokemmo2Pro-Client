package cn.pokemmo.ui.window.market;

import f.*;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 游戏厅代币奖品兑换角落窗口
 *
 * 原混淆类: f.HX
 */
public class PrizeCornerWindow extends R90 implements tr_1  {
    public final HX asBridge() {
        return (HX) (Object) this;
    }

   public final BU Qb0;
   public final byte eL;
   public final fy_2 V5;
   public final fy_2 gv;
   public final lo0_0 gy0;
   public final xe_1 B9;
   public final cn_0 Wb0;
   public final cn_0 Pt0;
   public final cn_0 Cb0;
   public final cn_0 K10;
   public final cn_0 Pv;
   public lpt2__5 d2;
   public ez_1 rF;
   public byte QE;
   public final xe_1[] Hh;

   public PrizeCornerWindow(BU controller, byte channel, ArrayList entries) {
      super();
      this.Qb0 = controller;
      this.eL = channel;
      this.Pb0(new cj0_1(asBridge()));

      N1 style = new N1(asBridge(), new gn_0((byte)-1, (byte)-1, (byte)-1, (byte)-1));
      this.LPT8(style);
      this.uf("gc-shop");
      this.Hy(sm0_0.c0(0) + " PRIZE CORNER");
      this.ff0(1);
      this.bD(true);

      this.gy0 = new lo0_0();
      this.gy0.Qs0(2);
      this.Wb0 = new cn_0(sm0_0.c0(1137));

      fy_2 shop = new fy_2();
      I7 shopHorizontal = shop.H10();
      Hm0 shopVertical = shop.lo0();
      this.Pt0 = new cn_0("");
      this.Cb0 = new cn_0("");
      this.K10 = new cn_0("");
      this.B9 = new xe_1(sm0_0.c0(56));
      this.B9.pw0(false);
      this.Pv = new cn_0(sm0_0.wa0(1925, "0"));
      this.B9.RR(new RN(asBridge(), channel, controller));

      this.Hh = new xe_1[entries.size()];
      int index = 0;
      Iterator iterator = entries.iterator();
      while (iterator.hasNext()) {
         lpt2__5 entry = (lpt2__5)iterator.next();
         OB item = entry.fT() != null ? new OB(entry.fT()) : new OB(entry, false);
         item.RR(new wj_0(asBridge(), entry, (byte)index));
         this.Hh[index++] = item;
      }

      shop.x40(shopHorizontal.LPt3(this.Hh));
      shop.WQ(shopVertical.LPt3(this.Hh));
      this.gy0.AH0(shop);

      this.V5 = new fy_2();
      this.V5.x40(XZ.BC0(this.V5.lo0(), new ya_1[]{this.V5.H10().LPt3(new le0_2[]{this.gy0}).Ze0()}, this.V5)
            .Xq(new ya_1[]{this.V5.lo0().LPt3(new le0_2[]{this.gy0})}));
      this.SL(this.V5);

      this.gv = new fy_2();
      this.gv.uf("label-area-market");
      this.gv.x40(XZ.BC0(this.gv.lo0(), new ya_1[]{this.gv.C7(this.Pt0), this.gv.C7(this.Cb0), this.gv.C7(this.K10)}, this.gv)
            .Xq(new ya_1[]{this.gv.hb(this.Pt0), this.gv.hb(this.Cb0), this.gv.hb(this.K10)}));

      fy_2 footer = new fy_2();
      this.Pv.uf("label");
      this.Wb0.uf("label");
      footer.SL(this.B9);
      footer.SL(this.Pv);
      footer.SL(this.Wb0);
      footer.SL(this.gv);
      this.SL(footer);
      this.vO();
   }

   @Override
   public final boolean u3(le0_2 child) {
      if (child == this.rF) {
         this.rF = null;
      }
      return super.u3(child);
   }

   @Override
   public final void K8() {
      this.oY(472, 350);
      this.B9.RY(250, 25);
      this.B9.oY(250, 25);
      this.gv.RY(260, 200);
      this.gv.oY(260, 200);
      this.V5.oY(170, 250);
      this.B9.E40(this.A20 + 200, this.SB0 + 310);
      this.gv.E40(this.A20 + 200, this.SB0 + 67);
      this.Pv.E40(this.A20 + 370, this.SB0 + 298);
      this.Wb0.E40(this.A20 + 200, this.SB0 + 298);
      super.K8();
   }

   public final void vO() {
      this.Wb0.Sk(sm0_0.wa0(1941, String.valueOf(tw0_0.rl != null && tw0_0.rl.k0 != null ? tw0_0.rl.k0.Lpt5 : 0)));
   }

   @Override
   public final void C(zk0_1 context) {
      this.Kv();
   }

   @Override
   public final boolean nd0(i70_0 event) {
      if (E00.ZU(event.zu) && event.iT()) {
         int code = event.finally$;
         rp_0 manager = rp_0.kC0;
         if (manager != null && manager.Ov(code)) {
            if (this.QE > 0) {
               --this.QE;
               this.Kv();
            }
            return true;
         }
         manager = rp_0.synchronized$;
         if (manager != null && manager.Ov(code)) {
            ++this.QE;
            this.Kv();
            return true;
         }
         manager = rp_0.sJ0;
         if (manager != null && manager.Ov(code)) {
            a7_0.bH(this.B9.ER.Fc0);
            return true;
         }
         manager = rp_0.nK0;
         if (manager != null && manager.Ov(code)) {
            BU owner = this.Qb0;
            HX active = owner.Cs0;
            if (active != null) {
               active.xe0();
               owner.Cs0 = null;
            }
            tw0_0.rl.ze0(this.eL, (byte)(this.Hh.length + 1));
            return true;
         }
      }
      return super.nd0(event);
   }

   public final void Kv() {
      if (this.QE >= this.Hh.length) {
         this.QE = (byte)(this.Hh.length - 1);
      }
      if (this.QE < 0) {
         this.QE = 0;
      }
      int index = this.QE;
      xe_1 item = index < this.Hh.length ? this.Hh[index] : null;
      if (item != null) {
         a7_0.bH(item.ER.Fc0);
         lpt6__0.v90(item);
         this.gy0.Rn(item);
      }
   }
}
