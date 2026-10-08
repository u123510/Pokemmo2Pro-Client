package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class CharacterAvatarBikeProvider extends BaseSpriteFrameProvider {
   public final qa0_1 EQ;
   public final int UL0;
   public final int pO;
   public final int bU;
   public final int cy;
   public final int g6;

   public CharacterAvatarBikeProvider(int var1, int var2, int var3, int var4, int var5, qa0_1 var6) {
      this.EQ = var6;
      this.UL0 = var1;
      this.pO = var2;
      this.bU = var3;
      this.cy = var4;
      this.g6 = var5;
   }

   @Override
   public final i4_0 KN() {
      qa0_1 qa0_1 = this.EQ;
      int i = this.UL0;
      int j = this.pO;
      int k = this.bU;
      int l;
      int l1 = l = this.cy;
      int k1 = this.g6;
      ByteBuffer bytebuffer2 = qa0_1.VL0.slice();
      ByteOrder byteorder = ByteOrder.LITTLE_ENDIAN;
      ByteBuffer bytebuffer;
      byte[] abyte = tx_1.Gi(k, bytebuffer = bytebuffer2.order(ByteOrder.LITTLE_ENDIAN));
      if (l1 == 2) {
         l = 1;
         abyte[34] = 49;
         abyte[35] = 66;
         abyte[52] = -18;
         abyte[53] = 61;
      }

      if (l == 3) {
         l = 1;
         abyte[34] = 0;
         abyte[35] = 0;
         abyte[52] = 0;
         abyte[53] = 0;
      }

      ByteBuffer bytebuffer1 = ByteBuffer.wrap(abyte).order(byteorder);
      XG0 xg0 = XG0.hi0;
      i8_0 i8_0x = new i8_0(xg0, l * 32, bytebuffer1);

      short short2 = 128;
      ix0_0 mode = ix0_0.Vw;
      Q20 q20 = new Q20(i, 1, 1, xg0, bytebuffer);
      i4_0 i4_0x = new i4_0(168, short2, mode);

      ((Buffer)bytebuffer).position(j);
      boolean flag;
      if (tx_1.T30(bytebuffer, kd_2.Gu0) > 0) {
         flag = true;
      } else {
         flag = false;
      }

      if (flag) {
         bytebuffer = ByteBuffer.wrap(tx_1.Gi(j, bytebuffer)).order(byteorder);
      }

      byte b1 = 0;
      byte b2 = 0;

      while (bytebuffer.remaining() > 1) {
         short short1 = bytebuffer.getShort();
         if (!flag && short1 == 0) {
            break;
         }

         int i1 = short1 & 255;
         int j1 = 64;
         byte b0;
         if (q20.Sc0 == XG0.hi0) {
            b0 = 2;
         } else {
            b0 = 1;
         }

         j1 /= b0;
         if (q20.rH0.length / j1 >= (j1 = i1 + k1)) {
            i1 = j1;
         }

         boolean flag2;
         if ((short1 & 1024) != 0) {
            flag2 = true;
         } else {
            flag2 = false;
         }

         boolean flag1;
         if ((short1 & 2048) != 0) {
            flag1 = true;
         } else {
            flag1 = false;
         }

         q20.xx0(i4_0x, b1, b2, i1, i8_0x, 0, flag2, flag1);
         if ((b1 += 8) >= 256) {
            b1 = 0;
            if ((b2 += 8) >= short2) {
               break;
            }
         }
      }

      return i4_0x;
   }
}
