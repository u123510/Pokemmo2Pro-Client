package cn.pokemmo.world;

import f.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 大世界地图场景与实体总管理器 (World Manager)
 * 负责当前加载的区块网格、同屏玩家/NPC 实体注册表、天气效果与主角实体生命周期。
 *
 * 原混淆类: f.yt_1
 */
public class WorldManager implements Iterable, fy0_0 {
    public yt_1 asBridge() {
        return (yt_1) (Object) this;
    }

    public static CH0 l00 = CH0.j1;
   public final Ge0 Mm0;
   public final ConcurrentHashMap pn0 = new ConcurrentHashMap();
   public final SQ E6 = new SQ();
   public CH0 dj0 = CH0.j1;
   public E90 jB0;
   public byte cv0 = 0;
   public long HA = 0L;
   public short VJ0 = 0;
   public byte Com4 = -1;
   public int oh0 = -1;

   /** Restores the original static controller-notification helper. */
   public static void zb0() {
      tw0_0.RE0.Hq0((byte)10, (short)15);
   }

   public WorldManager(Ge0 var1) {
      this.Mm0 = var1;
      yt_1 var2 = tw0_0.e60;
      if (tw0_0.e60 != null) {
         var2.dispose();
      }

      tw0_0.e60 = asBridge();
   }

   public static void sp0(bi0_1 var0) {
      zv_2 var1 = KF.oZ(var0);
      KF var2 = var0.rd;
      if (var0.rd != null) {
         var2.il0.p6(var1);
         if ((var0 = var0.Lm()) != null) {
            var0.il0.p6(var1);
         }
      }
   }

   public final void Jb0(
      CH0 var1, byte var2, qe0_2 var3, String var4, byte var5, zv_2 var6, byte var7, RL0 var8, byte var9, short var10, short var11, byte var12, String var13
   ) {
      if (this.dj0.equals(var1)) {
         this.Mm0.fw = false;
         E90 var22 = this.jB0;
         if (this.jB0 == null) {
            E90 var27 = this.jB0 = new E90(var1, var4, var5, var2, var3, var6, var7, var8, var9, var10, var11, var12, var13);
            var27.Ac0 = true;
            var27.zf();
            this.jB0.ql(var11, var12, true);
            this.jB0.il0.h10();
         } else {
            zv_2 var16 = var22.ba0;
            byte var18 = var16.o0;
            if (this.oh0 != J4.iA0(var16.uS, var18, var16.ID0)) {
               byte var19 = var16.o0;
               int var23 = J4.iA0(var16.uS, var19, var16.ID0);
               byte var20 = var6.o0;
               if (var23 != J4.iA0(var6.uS, var20, var6.ID0)) {
                  byte var17 = var16.o0;
                  this.oh0 = J4.iA0(var16.uS, var17, var16.ID0);
               }
            }

            E90 var10007 = this.jB0;
            this.jB0.Ac0 = true;
            var10007.zf();
            this.jB0.il0.p6(var6);
            this.jB0.il0.h10();
            this.jB0.ql(var11, var12, true);
            this.jB0.Yj(var9, var10);
            sp0(this.jB0);
            E90 var26 = this.jB0;
            this.jB0.Ll0 = var13;
            var26.Cj0();
            E90 var24 = this.jB0;
            this.jB0.Vv = var2;
            var24.J1.mh0 = var2;
         }
      } else if (!this.Mm0.a8.qY.containsKey(var1)) {
         bi0_1 var14;
         if ((var14 = (bi0_1)this.pn0.get(var1)) == null) {
            E90 created = new E90(var1, var4, var5, var2, var3, var6, var7, var8, var9, var10, var11, var12, var13);
            var14 = created;
            this.pn0.put(var1, var14);
            created.il0.h10();
         } else {
            E90 var10002 = (E90)var14;
            E90 var15;
            E90 var10003 = var15 = (E90)var14;
            var15.oc0 = var4;
            var15.fH0 = var5;
            var15.Vv = var2;
            var15.J1.mh0 = var2;
            var15.PD0 = var7;
            var15.PC0(var8);
            var15.Yj(var9, var10);
            var15.ql(var11, var12, false);
            var10002.Ll0 = var13;
            var10003.Cj0();
            var10002.ba0.V2(var6);
            EA0 var10001 = var14.il0;
            var14.il0.np = false;
            var10001.h10();
            sp0(var14);
         }
      }
   }

   public final void xc(CH0 var1) {
      if (this.dj0.equals(var1)) {
         this.jB0 = null;
      } else {
         E90 var2 = this.jB0;
         MO var5;
         if (this.jB0 != null && (var5 = var2.bg0) != null && var5.pu.equals(var1)) {
            this.jB0.sE0(null, false);
         }

         this.pn0.remove(var1);
         tj0_0 var3 = tw0_0.Tl0;
         g70_0 var6;
         if ((var6 = (g70_0)tw0_0.Tl0.B1.remove(var1)) != null) {
            var3.u3(var6);
         }

         le0_2 var4;
         if ((var4 = (le0_2)var3.k00.remove(var1)) != null) {
            var3.u3(var4);
         }
      }
   }

   public final void qS(_else entity, boolean clearAll) {
      if (clearAll) {
         SQ table = this.E6;
         table.getClass();
         new Hm(table);
         us_2 iterator = new us_2(table);
         while (iterator.hasNext()) {
            ((_else)iterator.ty()).dispose();
         }
         this.E6.clear();
      }
      byte region = entity.dw;
      if (this.Com4 != region) {
         this.Com4 = region;
         this.Mm0.lPt9();
         this.Mm0.yt0();
         this.oh0 = -1;
      }
      byte index = entity.Bm0;
      _else previous = (_else)this.E6.j10(this.E6.yw0(J4.iA0(entity.dw, index, entity.case$)), entity);
      if (previous != null) {
         previous.dispose();
      }
      if (entity.nn() && N50.Fc(entity.dw)) {
         XF0 map = (XF0)entity;
         short[] occupied;
         if (!map.o6) {
            occupied = new short[0];
         } else {
            wx_2 values = new wx_2();
            for (int x = 0; x < map.i80.It0; ++x) {
               for (int y = 0; y < map.i80.WH; ++y) {
                  Z50 cell = map.uJ[x][y];
                  if (cell != null && cell.O60 > -1) {
                     values.TI0(cell.O60);
                  }
               }
            }
            occupied = values.Eo();
         }
         for (short occupiedIndex : occupied) {
            int packed = (occupiedIndex & 0xFFFF) << 8;
            if (!this.E6.l90(entity.dw | packed)) {
               _else stale = (_else)this.E6.j10(this.E6.yw0(entity.dw | packed), entity);
               if (stale != null) {
                  stale.dispose();
               }
            }
         }
      }
   }

   public final _else N60() {
      E90 var1 = this.jB0;
      if (this.jB0 == null) {
         return null;
      }

      byte var3 = var1.ba0.uS;
      byte var4 = var1.ba0.o0;
      byte var2 = var1.ba0.ID0;
      return (_else)this.E6.get(J4.iA0(var3, var4, var2));
   }

   public final byte yY() {
      return this.Com4;
   }

   public final CH0 za0() {
      return this.dj0;
   }

   public final E90 at() {
      return this.jB0;
   }

   @Override
   public final Iterator iterator() {
      return this.pn0.values().iterator();
   }

   public final bi0_1 ax(CH0 var1) {
      E90 var2 = this.jB0;
      return this.jB0 != null && var2.pu.equals(var1) ? this.jB0 : (bi0_1)this.pn0.get(var1);
   }

   public final E90 xA(String var1) {
      Iterator var2 = this.pn0.values().iterator();

      while (var2.hasNext()) {
         bi0_1 var3;
         bi0_1 var10000 = var3 = (bi0_1)var2.next();
         var10000.getClass();
         if (var10000 instanceof E90 && var1.equalsIgnoreCase(var3.na0())) {
            return (E90)var3;
         }
      }

      E90 var4 = this.jB0;
      return this.jB0 != null && var4.oc0.equalsIgnoreCase(var1) ? this.jB0 : null;
   }

   public final E90 te0(CH0 var1) {
      if (var1.equals(this.dj0)) {
         return this.jB0;
      }

      bi0_1 var2;
      return (var2 = (bi0_1)this.pn0.get(var1)) instanceof E90 ? (E90)var2 : null;
   }

   public final byte fG0() {
      return this.cv0;
   }

   public final long Cx() {
      return this.HA;
   }

   public final short h60() {
      return this.VJ0;
   }

   public final void tg0() {
      c8_0.JD0.run();
      if (this.jB0 == null) {
         return;
      }
      boolean paused = this.Mm0.nz();
      pk0_0 controller = tw0_0.FL;
      paused |= controller != null && controller.gi0();
      paused |= tw0_0.PK0 != null || tw0_0.LD0.he0 != null;
      paused |= !tw0_0.LD0.Rg0;
      this.jB0.Vl(paused);
      for (Object value : this.pn0.values()) {
         ((bi0_1)value).Vl(paused);
      }
      if (paused) {
         return;
      }
      E90 globalPlayer = this.Mm0.cJ0.jB0;
      if (globalPlayer != null && globalPlayer.iz0((byte)-128)) {
         return;
      }
      _volatile partyType = _volatile.BV;
      if (this.Mm0.r1(partyType) == null) {
         return;
      }
      // The original bytecode performs a separate lookup after its null check.
      Mj party = this.Mm0.r1(partyType);
      int usableCount = 0;
      synchronized (party.VW) {
         for (VU member : party.rT()) {
            if (member != null && !member.I8.vn() && member.I8.VD > 0) {
               ++usableCount;
            }
         }
      }
      if (usableCount < 1) {
         return;
      }
      ArrayList<MO> candidates = null;
      for (Object value : this.pn0.values()) {
         bi0_1 entity = (bi0_1)value;
         if (!entity.CI0() || !entity.uR().EH) {
            continue;
         }
         zv_2 position = entity.ba0;
         E90 player = this.jB0;
         zv_2 playerPosition = player.ba0;
         if (position.o0 != playerPosition.o0 || position.ID0 != playerPosition.ID0) {
            continue;
         }
         MO candidate = (MO)entity;
         if (candidate.Nf0 < 0 || candidate.DN == 0) {
            continue;
         }
         E90 activePlayer = tw0_0.rl.cJ0.jB0;
         if (activePlayer != null && activePlayer.iz0((byte)-128)) {
            continue;
         }
         if (candidate.py > System.currentTimeMillis()) {
            continue;
         }
         int candidateLevel = candidate.ba0.JT;
         int playerLevel = playerPosition.JT;
         if (candidateLevel >= 0 && playerLevel >= 0 && candidateLevel != playerLevel) {
            continue;
         }
         dd_1 rules = candidate.F7;
         boolean canInteract;
         if (rules.rh0 || (rules.zA && !player.iz0((byte)1) && (player.Xe || player.iz0((byte)2)))) {
            canInteract = false;
            for (byte direction = 0; direction <= 3; ++direction) {
               if ((rules.q8 & (1 << direction)) != 0 && candidate.Aw(player, direction, null)) {
                  canInteract = true;
                  break;
               }
            }
         } else {
            canInteract = candidate.Aw(player, candidate.ba0.Y30, null);
         }
         if (!canInteract) {
            continue;
         }
         if (candidates == null) {
            candidates = new ArrayList<MO>();
         }
         candidates.add(candidate);
      }
      if (candidates == null) {
         return;
      }
      MO primary = null;
      for (MO candidate : candidates) {
         if (primary == null || candidate.ba0.Lq0 < primary.ba0.Lq0
               || candidate.ba0.Lq0 == primary.ba0.Lq0 && candidate.ba0.B5 > primary.ba0.B5) {
            primary = candidate;
         }
      }
      MO secondary = null;
      if (primary != null && primary.wC) {
         for (MO candidate : candidates) {
            if (candidate == primary) {
               continue;
            }
            if (secondary == null || candidate.ba0.Lq0 < secondary.ba0.Lq0
                  || candidate.ba0.Lq0 == secondary.ba0.Lq0 && candidate.ba0.B5 > secondary.ba0.B5) {
               secondary = candidate;
            }
         }
      }
      if (primary == null) {
         return;
      }
      Ge0 map = this.Mm0;
      map.getClass();
      E90 player = this.jB0;
      G40 interaction;
      if (secondary == null) {
         interaction = new V10(primary, player, false);
      } else {
         interaction = new tw_0(new V10[]{new V10(primary, player, false), new V10(secondary, player, true)});
      }
      tw0_0.LD0.KJ0 = interaction;
      interaction.Ob0();
      map.fk0.uQ(new R5(primary, secondary, interaction.tQ()));
   }

   public final MO[] YC(MO var1) {
      ArrayList<MO> var2 = new ArrayList<MO>();
      var2.add(var1);
      Iterator<bi0_1> var3 = this.pn0.values().iterator();

      while (var3.hasNext()) {
         zv_2 var6 = this.jB0.ba0;
         bi0_1 var4;
         zv_2 var5;
         MO var7;
         if ((var5 = (var4 = (bi0_1)var3.next()).ba0).o0 == this.jB0.ba0.o0
            && var5.ID0 == var6.ID0
            && var4.CI0()
            && var4 != var1
            && (var7 = (MO)var4).DN == var1.DN) {
            var2.add(var7);
         }
      }

      return var2.toArray(new MO[0]);
   }

   public final void qu0(short var1) {
      Iterator<bi0_1> var3 = this.pn0.values().iterator();

      while (var3.hasNext()) {
         bi0_1 var2;
         bi0_1 next = (bi0_1)var3.next();
         if (next instanceof MO && ((MO)next).DN == var1) {
            ((MO)next).Nf0 = -1;
         }
      }
   }

   public final boolean ek() {
      SQ var2;
      (var2 = this.E6).getClass();
      new Hm(var2);
      us_2 var1;
      var1 = new us_2(var2);

      while (var1.hasNext()) {
         if (((_else)var1.ty()).IS()) {
            return true;
         }
      }

      return false;
   }

   @Override
   public final void dispose() {
      SQ var1 = this.E6;
      this.E6.getClass();
      new Hm(var1);
      us_2 var2;
      var2 = new us_2(var1);

      while (var2.hasNext()) {
         ((_else)var2.ty()).dispose();
      }

      this.E6.clear();
   }

   public final boolean Vm0(byte var1, LT var2) {
      if (var2 == null) {
         return false;
      }

      Iterator var4 = this.pn0.values().iterator();

      while (var4.hasNext()) {
         bi0_1 var3;
         if ((var3 = (bi0_1)var4.next()).CI0() && !var3.Gw0() && var3.a1(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public final void gu0(byte var1, CH0 var2) {
      bi0_1 var10;
      if ((var10 = this.ax(var2)) instanceof E90) {
         E90 var3 = (E90)var10;
         boolean var4;
         if ((var10.PD0 & 64) != 0) {
            var4 = true;
         } else {
            var4 = false;
         }

         boolean var5 = var10.oI0();
         var10.PD0 = (byte)var1;
         if (var10.Ou()) {
            label122: {
               this.Mm0.k0.HL = (byte)var1;
               bu_0 var10000;
               byte var10001;
               short var10002;
               if (var10.LH0() && !var10.Ze()) {
                  switch (var10.ba0.uS) {
                     case 0:
                        var10000 = tw0_0.RE0;
                        var10001 = 0;
                        var10002 = 305;
                        break;
                     case 1:
                        var10000 = tw0_0.RE0;
                        var10001 = 1;
                        var10002 = 365;
                        break;
                     case 2:
                        var10000 = tw0_0.RE0;
                        var10001 = 2;
                        var10002 = 1013;
                        break;
                     case 3:
                        var10000 = tw0_0.RE0;
                        var10001 = 3;
                        var10002 = 1151;
                        break;
                     case 4:
                        var10000 = tw0_0.RE0;
                        var10001 = 4;
                        var10002 = 1014;
                        break;
                     default:
                        break label122;
                  }
               } else {
                  if (!var10.oI0() || var5) {
                     tw0_0.RE0.Eh((byte)0, (short)0, true, false);
                     break label122;
                  }

                  label119: {
                     label80: {
                     int messageId = var10.Gi().Nul(q10_0.Qh0);
                     if (messageId != 2) {
                        label87:
                        if (messageId != 12) {
                           if (messageId != 17) {
                              if (messageId == 28 || messageId == 30) {
                                 tw0_0.RE0.Hq0((byte)10, (short)8);
                                 break label119;
                              }

                              if (messageId != 40) {
                                 if (messageId != 51) {
                                    if (messageId != 52) {
                                       tw0_0.RE0.Hq0((byte)2, (short)1375);
                                    } else {
                                       tw0_0.RE0.Hq0((byte)10, (short)21);
                                    }
                                    break label119;
                                 }
                                 break label87;
                              }
                           }

                           if (rg0_2.r4(25) == 0) {
                              lpt5__5.hL.ZD(() -> tw0_0.RE0.Hq0((byte)10, (short)15), 450L);
                           }
                           break label80;
                        }

                        tw0_0.RE0.Hq0((byte)10, (short)5);
                        break label119;
                     }                     }


                     tw0_0.RE0.Hq0((byte)10, (short)6);
                  }

                  switch (var10.ba0.uS) {
                     case 0:
                        var10000 = tw0_0.RE0;
                        var10001 = 0;
                        var10002 = 282;
                        break;
                     case 1:
                        var10000 = tw0_0.RE0;
                        var10001 = 1;
                        var10002 = 403;
                        break;
                     case 2:
                        var10000 = tw0_0.RE0;
                        var10001 = 2;
                        var10002 = 1012;
                        break;
                     case 3:
                        var10000 = tw0_0.RE0;
                        var10001 = 3;
                        var10002 = 1152;
                        break;
                     case 4:
                        var10000 = tw0_0.RE0;
                        var10001 = 4;
                        var10002 = 1013;
                        break;
                     default:
                        break label122;
                  }
               }

               var10000.Eh(var10001, var10002, true, false);
            }

            boolean var9;
            if ((var10.PD0 & 64) != 0) {
               var9 = true;
            } else {
               var9 = false;
            }

            if (var4 != var9) {
               var3.zf();
               Ge0 var6 = this.Mm0;
               var6.qK(sm0_0.c0((var10.PD0 & 64) != 0 ? 16777249 : 16777250));
            }
         }

         if (var3.Jf0()) {
            KF var7 = var3.rd;
            if (var3.rd != null) {
               var7.il0.p6(KF.oZ(var3));
            }
         }
      }
   }

   public final ArrayList A90(int var1) {
      short var2 = -100;
      short var3 = -100;
      E90 var4 = this.jB0;
      if (this.jB0 != null) {
         var2 = var4.ba0.Lq0;
         var3 = var4.ba0.B5;
      }

      ArrayList var8;
      var8 = new ArrayList();
      Iterator var9 = this.pn0.values().iterator();

      while (var9.hasNext()) {
         bi0_1 var5;
         bi0_1 var12 = var5 = (bi0_1)var9.next();
         var12.getClass();
         if (var12 instanceof E90) {
            short var6 = var5.ba0.Lq0;
            long var10 = var6 - var2;
            long var13 = var5.ba0.B5 - var3;
            long var10001 = var5.ba0.B5 - var3;
            long var11 = var10 * var10;
            if (!(Math.sqrt(var13 * var10001 + var11) > var1)) {
               var8.add(var5);
            }
         }
      }

      return var8;
   }

   public final ArrayList YK0() {
      ArrayList var1;
      var1 = new ArrayList();
      vo_2 var2 = tw0_0.LD0.Sc;
      if (tw0_0.LD0.Sc != null && var2.So() != null) {
         Tv0 var10003 = var2.So();
         float var3 = lg_0.lW.bk0;
         float var4 = lg_0.lW.zs;
         var10003.getClass();
         float var7 = lg_0.S4.Kr0();
         float var5 = lg_0.S4.sD0();
         iq0_0 var8 = var10003.k0(var3, var4, 0.0F, 0.0F, var7, var5);
         var2.RU(this.jB0, var8, var1);
         if (this.jB0.mI0() != 0) {
            var2.RU(this.jB0.rd, var8, var1);
         }

         Iterator var6 = tw0_0.e60.pn0.values().iterator();

         while (var6.hasNext()) {
            bi0_1 var9;
            bi0_1 var10000 = var9 = (bi0_1)var6.next();
            var10000.getClass();
            if (var10000 instanceof E90 || tw0_0.Eu(1)) {
               var2.RU(var9, var8, var1);
            }
         }

         return var1;
      } else {
         return var1;
      }
   }
}









