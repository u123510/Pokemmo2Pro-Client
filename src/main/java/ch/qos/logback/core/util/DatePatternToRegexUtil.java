package ch.qos.logback.core.util;

import java.util.ArrayList;
import java.util.List;

public class DatePatternToRegexUtil {
   final String datePattern;
   final int datePatternLength;
   final CharSequenceToRegexMapper regexMapper = new CharSequenceToRegexMapper();

   public DatePatternToRegexUtil(String var1) {
      this.datePattern = var1;
      this.datePatternLength = var1.length();
   }

   private List<CharSequenceState> tokenize() {
      ArrayList var1;
      var1 = new ArrayList();
      CharSequenceState var2 = null;

      for(int var3 = 0; var3 < this.datePatternLength; ++var3) {
         char var4 = this.datePattern.charAt(var3);
         if (var2 != null && var2.c == var4) {
            var2.incrementOccurrences();
         } else {
            var2 = new CharSequenceState(var4);
            var1.add(var2);
         }
      }

      return var1;
   }

   public String toRegex() {
      List<CharSequenceState> var10000 = this.tokenize();
      StringBuilder var1;
      var1 = new StringBuilder();

      for(CharSequenceState var3 : var10000) {
         var1.append(this.regexMapper.toRegex(var3));
      }

      return var1.toString();
   }
}
