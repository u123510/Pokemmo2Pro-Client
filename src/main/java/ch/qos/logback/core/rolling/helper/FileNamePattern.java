package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.pattern.util.AlmostAsIsEscapeUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FileNamePattern extends ContextAwareBase {
   static final Map CONVERTER_MAP;
   String pattern;
   Converter headTokenConverter;

   public FileNamePattern(String var1, Context var2) {
      this.setPattern(FileFilterUtil.slashify(var1));
      ((ContextAwareBase)this).setContext(var2);
      this.parse();
      ConverterUtil.startConverters(this.headTokenConverter);
   }

   static {
      HashMap var0 = new HashMap();
      var0.put("i", IntegerTokenConverter.class);
      var0.put("d", DateTokenConverter.class);
      CONVERTER_MAP = var0;
   }

   public void parse() {
      try {
         String var1 = this.escapeRightParantesis(this.pattern);
         Parser var9 = new Parser(var1, new AlmostAsIsEscapeUtil());
         var9.setContext(this.context);
         this.headTokenConverter = var9.compile(var9.parse(), CONVERTER_MAP);
      } catch (ScanException var5) {
         this.addError("Failed to parse pattern \"" + this.pattern + "\".", var5);
      }
   }

   public String escapeRightParantesis(String var1) {
      return this.pattern.replace(")", "\\)");
   }

   public String toString() {
      return this.pattern;
   }

   public int hashCode() {

      byte var2 = 31;
      String var1;
      int var3;
      if ((var1 = this.pattern) == null) {
         var3 = 0;
      } else {
         var3 = var1.hashCode();
      }

      return var2 + var3;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         FileNamePattern other = (FileNamePattern)var1;
         String var3 = other.pattern;
         if (var3 == null) {
            if (this.pattern != null) {
               return false;
            }
         } else if (!var3.equals(this.pattern)) {
            return false;
         }
         return true;
      }
   }

   public DateTokenConverter getPrimaryDateTokenConverter() {
      for(Converter var2 = this.headTokenConverter; var2 != null; var2 = var2.getNext()) {
         DateTokenConverter var1;
         if (var2 instanceof DateTokenConverter && (var1 = (DateTokenConverter)var2).isPrimary()) {
            return var1;
         }
      }

      return null;
   }

   public IntegerTokenConverter getIntegerTokenConverter() {
      for(Converter var1 = this.headTokenConverter; var1 != null; var1 = var1.getNext()) {
         if (var1 instanceof IntegerTokenConverter) {
            return (IntegerTokenConverter)var1;
         }
      }

      return null;
   }

   public boolean hasIntegerTokenCOnverter() {
      return this.getIntegerTokenConverter() != null;
   }

   public String convertMultipleArguments(Object... var1) {
      StringBuilder var7;
      var7 = new StringBuilder();

      for(Converter var2 = this.headTokenConverter; var2 != null; var2 = var2.getNext()) {
         if (var2 instanceof MonoTypedConverter) {
            MonoTypedConverter var3 = (MonoTypedConverter)var2;
            int var4 = var1.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               Object var6;
               if (var3.isApplicable(var6 = var1[var5])) {
                  var7.append(var2.convert(var6));
               }
            }
         } else {
            var7.append(var2.convert(var1));
         }
      }

      return var7.toString();
   }

   public String convert(Object var1) {

      StringBuilder var3;
      var3 = new StringBuilder();

      for(Converter var2 = this.headTokenConverter; var2 != null; var2 = var2.getNext()) {
         var3.append(var2.convert(var1));
      }

      return var3.toString();
   }

   public String convertInt(int var1) {
      return this.convert(var1);
   }

   public void setPattern(String var1) {
      if (var1 != null) {
         this.pattern = var1.trim();
      }

   }

   public String getPattern() {
      return this.pattern;
   }

   public String toRegexForFixedDate(Date var1) {

      StringBuilder var3;
      var3 = new StringBuilder();

      for(Converter var2 = this.headTokenConverter; var2 != null; var2 = var2.getNext()) {
         if (var2 instanceof LiteralConverter) {
            var3.append(var2.convert((Object)null));
         } else if (var2 instanceof IntegerTokenConverter) {
            var3.append("(\\d+)");
         } else if (var2 instanceof DateTokenConverter) {
            var3.append(var2.convert(var1));
         }
      }

      return var3.toString();
   }

   public String toRegexForFixedDate(Instant var1) {

      StringBuilder var3;
      var3 = new StringBuilder();

      for(Converter var2 = this.headTokenConverter; var2 != null; var2 = var2.getNext()) {
         if (var2 instanceof LiteralConverter) {
            var3.append(var2.convert((Object)null));
         } else if (var2 instanceof IntegerTokenConverter) {
            var3.append("(\\d+)");
         } else if (var2 instanceof DateTokenConverter) {
            var3.append(var2.convert(var1));
         }
      }

      return var3.toString();
   }

   public String toRegex() {

      StringBuilder var2;
      var2 = new StringBuilder();

      for(Converter var1 = this.headTokenConverter; var1 != null; var1 = var1.getNext()) {
         if (var1 instanceof LiteralConverter) {
            var2.append(var1.convert((Object)null));
         } else if (var1 instanceof IntegerTokenConverter) {
            var2.append("\\d+");
         } else if (var1 instanceof DateTokenConverter) {
            var2.append(((DateTokenConverter)var1).toRegex());
         }
      }

      return var2.toString();
   }
}
