package ch.qos.logback.core.util;

import java.text.DateFormatSymbols;

class CharSequenceToRegexMapper {
   DateFormatSymbols symbols = DateFormatSymbols.getInstance();

   public CharSequenceToRegexMapper() {
   }

   private String number(int var1) {
      return "\\d{" + var1 + "}";
   }

   private String getRegexForAmPms() {
      return this.symbolArrayToRegex(this.symbols.getAmPmStrings());
   }

   private String getRegexForLongDaysOfTheWeek() {
      return this.symbolArrayToRegex(this.symbols.getWeekdays());
   }

   private String getRegexForShortDaysOfTheWeek() {
      return this.symbolArrayToRegex(this.symbols.getShortWeekdays());
   }

   private String getRegexForLongMonths() {
      return this.symbolArrayToRegex(this.symbols.getMonths());
   }

   private String symbolArrayToRegex(String[] var1) {
      int[] var2;
      int var10000 = (var2 = findMinMaxLengthsInSymbols(var1))[0];
      return ".{" + var10000 + "," + var2[1] + "}";
   }

   public static int[] findMinMaxLengthsInSymbols(String[] var0) {
      int var1 = Integer.MAX_VALUE;
      int var2 = 0;
      int var3 = var0.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5;
         if ((var5 = var0[var4].length()) != 0) {
            var1 = Math.min(var1, var5);
            var2 = Math.max(var2, var5);
         }
      }

      return new int[]{var1, var2};
   }

   public String toRegex(CharSequenceState var1) {
      CharSequenceState var10000 = var1;
      int var3 = var1.occurrences;
      char var2;
      switch (var2 = var10000.c) {
         case '\'':
            if (var3 == 1) {
               return "";
            }

            throw new IllegalStateException("Too many single quotes");
         case '.':
            return "\\.";
         case 'D':
         case 'F':
         case 'H':
         case 'K':
         case 'S':
         case 'W':
         case 'd':
         case 'h':
         case 'k':
         case 'm':
         case 's':
         case 'w':
         case 'y':
            return this.number(var3);
         case 'E':
            if (var3 >= 4) {
               return this.getRegexForLongDaysOfTheWeek();
            }

            return this.getRegexForShortDaysOfTheWeek();
         case 'G':
         case 'z':
            return ".*";
         case 'M':
            if (var3 <= 2) {
               return this.number(var3);
            } else {
               if (var3 == 3) {
                  return this.getRegexForShortMonths();
               }

               return this.getRegexForLongMonths();
            }
         case 'Z':
            return "(\\+|-)\\d{4}";
         case '\\':
            throw new IllegalStateException("Forward slashes are not allowed");
         case 'a':
            return this.getRegexForAmPms();
         default:
            return var3 == 1 ? "" + var2 : var2 + "{" + var3 + "}";
      }
   }

   public String getRegexForShortMonths() {
      return this.symbolArrayToRegex(this.symbols.getShortMonths());
   }
}
