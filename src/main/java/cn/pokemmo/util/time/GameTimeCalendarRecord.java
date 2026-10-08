package cn.pokemmo.util.time;

import f.*;

import java.util.Calendar;
import java.util.TimeZone;

public class GameTimeCalendarRecord {
   public final byte cp;
   public final byte Bi;
   public final byte R00;
   public final byte Vf0;
   public long U70;
   public long COm5;

   public GameTimeCalendarRecord(byte var1, byte var2, byte var3, byte var4) {
      this.cp = var1;
      this.Bi = var2;
      this.R00 = var3;
      this.Vf0 = var4;
      this.Cz();
   }

   public final boolean d70() {
      long var1 = System.currentTimeMillis();
      if (this.COm5 < var1) {
         this.Cz();
      }

      return this.U70 <= var1 && this.COm5 >= var1;
   }

   public final int Rl0() {
      return (int)((this.COm5 - System.currentTimeMillis()) / 1000L);
   }

   @Override
   public final String toString() {
      Calendar var1;
      (var1 = Calendar.getInstance(TimeZone.getTimeZone("UTC"))).setTimeInMillis(this.U70);
      return "[isEnabled="
         + this.d70()
         + " start_month="
         + this.cp
         + " start_day="
         + this.Bi
         + " end_month="
         + this.R00
         + " end_day="
         + this.Vf0
         + " start_year="
         + var1.get(1)
         + " duration="
         + (int)((this.COm5 - this.U70) / 1000L) / 3600
         + "hrs ]";
   }

   public final void Cz() {
      Calendar var1;
      Calendar var10001 = var1 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
      var1.set(1, var1.get(1) - 1);
      var1.set(11, 0);
      var1.set(12, 0);
      var1.set(13, 0);
      var1.set(14, 0);
      var1.set(2, this.cp - 1);
      var10001.set(5, this.Bi);
      this.U70 = var10001.getTimeInMillis();
      Calendar var2;
      Calendar var10000 = var2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
      var2.set(1, var2.get(1) - 1);
      var2.set(11, 0);
      var2.set(12, 0);
      var2.set(13, 0);
      var2.set(14, 0);
      var2.set(2, this.R00 - 1);
      var10000.set(5, this.Vf0 + 1);
      long var3;
      long var5 = var3 = var10000.getTimeInMillis();
      this.COm5 = var3;
      if (var5 <= this.U70) {
         var2.set(1, var2.get(1) + 1);
         this.COm5 = var2.getTimeInMillis();
      }

      while (this.U70 < System.currentTimeMillis() && this.COm5 < System.currentTimeMillis()) {
         var1.set(1, var1.get(1) + 1);
         var2.set(1, var2.get(1) + 1);
         this.U70 = var1.getTimeInMillis();
         this.COm5 = var2.getTimeInMillis();
      }

      Calendar.getInstance(TimeZone.getTimeZone("UTC")).setTimeInMillis(this.U70);
      Calendar.getInstance(TimeZone.getTimeZone("UTC")).setTimeInMillis(this.COm5);
   }
}
