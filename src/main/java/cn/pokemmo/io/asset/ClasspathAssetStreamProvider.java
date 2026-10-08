package cn.pokemmo.io.asset;

import f.*;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.mxp1.MXParserCachingStrings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class ClasspathAssetStreamProvider implements Closeable {
   public static final Class[] Yb0 = new Class[]{XmlPullParser.class};
   public static boolean Hk0;
   public final XmlPullParser Ja0;
   public final String S30;
   public final InputStream oD0;
   public final BitSet v70;
   public String qr0;

   @SuppressWarnings("unchecked")
   private static <E extends Throwable> void throwUnchecked(Throwable error) throws E {
      throw (E)error;
   }

   private static <T> T raise(Throwable error) {
      ClasspathAssetStreamProvider.<RuntimeException>throwUnchecked(error);
      return null;
   }

   public static XmlPullParser Nl0() {
      if (Hk0) {
         label32:
         try {
            MXParserCachingStrings var10000 = new MXParserCachingStrings();
            var10000.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            return var10000;
         } catch (Throwable var2) {
            Hk0 = false;
            Logger.getLogger(ClasspathAssetStreamProvider.class.getName()).log(Level.WARNING, "Failed direct instantation", var2);
            break label32;
         }
      }

      XmlPullParserFactory var0;
      if ((var0 = Bo0.qP) != null) {
         try {
            return var0.newPullParser();
         } catch (Throwable error) {
            return ClasspathAssetStreamProvider.<XmlPullParser>raise(error);
         }
      } else {
         return ClasspathAssetStreamProvider.<XmlPullParser>raise(Bo0.PL);
      }
   }

   public ClasspathAssetStreamProvider(URL var1) {
      super();
      this.v70 = new BitSet();
      this.qr0 = ClasspathAssetStreamProvider.class.getName();
      XmlPullParser var7 = null;
      InputStream var3 = null;
      this.S30 = var1.toString();

      try {
         var7 = (XmlPullParser)var1.getContent(Yb0);
      } catch (Throwable ignored) {
         // URL content is optional; fall back to a parser over the opened stream.
      } finally {
         ;
      }

      XmlPullParser var6 = var7;
      try {
         if (var6 == null) {
            var6 = Nl0();
            if ((var3 = var1.openStream()) == null) {
               throw new FileNotFoundException(this.S30);
            }

            var6.setInput(var3, "UTF8");
         }
      } catch (Throwable error) {
         ClasspathAssetStreamProvider.raise(error);
         throw new AssertionError(error);
      }

      this.Ja0 = var6;
      this.oD0 = var3;
   }

   public final void close() {
      InputStream var1;
      if ((var1 = this.oD0) != null) {
         try {
            var1.close();
         } catch (Throwable error) {
            ClasspathAssetStreamProvider.raise(error);
         }
      }

   }

   public final boolean hE0() {
      try {
         return this.Ja0.getEventType() == 3;
      } catch (Throwable error) {
         return ClasspathAssetStreamProvider.<Boolean>raise(error);
      }
   }

   public final String Zs(String var1) {
      String var2;
      if ((var2 = this.Yd0(var1)) != null) {
         return var2;
      } else {
         ClasspathAssetStreamProvider var10002 = this;
         String var3 = "missing '" + var1 + "' on '" + this.Ja0.getName() + "'";
         return ClasspathAssetStreamProvider.<String>raise(new XmlPullParserException(var3, var10002.Ja0, (Throwable)null));
      }
   }

   public final boolean y9(String var1, boolean var2) {
      if ((var1 = this.Yd0(var1)) == null) {
         return var2;
      } else {
         boolean var10000;
         if ("true".equals(var1)) {
            var10000 = true;
         } else {
            if (!"false".equals(var1)) {
               ClasspathAssetStreamProvider.raise(new XmlPullParserException("boolean value must be 'true' or 'false'", this.Ja0, (Throwable)null));
               return false;
            }

            var10000 = false;
         }

         return var10000;
      }
   }

   public final XmlPullParserException yF(String var1, Throwable var2) {
      return (XmlPullParserException)(new XmlPullParserException(var1, this.Ja0, var2)).initCause(var2);
   }

   public final XmlPullParserException Su0() {
      ClasspathAssetStreamProvider var10002 = this;
      String var1 = "Unexpected '" + this.Ja0.getName() + "'";
      return new XmlPullParserException(var1, var10002.Ja0, (Throwable)null);
   }

   public final Enum he(Class var1, String var2) {
      try {
         return Enum.valueOf(var1, var2.toUpperCase(Locale.ENGLISH));
      } catch (IllegalArgumentException var4) {
         try {
            return Enum.valueOf(var1, var2);
         } catch (IllegalArgumentException var3) {
            ClasspathAssetStreamProvider var10002 = this;
            String var5 = "Unknown enum value \"" + var2 + "\" for enum class " + var1;
            return ClasspathAssetStreamProvider.<Enum>raise(new XmlPullParserException(var5, var10002.Ja0, (Throwable)null));
         }
      }
   }

   public final int vj0(String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var2) {
         return ClasspathAssetStreamProvider.<Integer>raise((XmlPullParserException)(new XmlPullParserException("Unable to parse integer", this.Ja0, var2)).initCause(var2));
      }
   }

   public final void jC0() {
      if (!this.v70.isEmpty()) {
         String var1 = this.Ja0.getPositionDescription();
         if (this.S30 != null) {
            var1 = AN.nK0(var1, " in ").append(this.S30).toString();
         }

         int var2 = -1;

         while((var2 = this.v70.nextSetBit(var2 + 1)) >= 0) {
            Logger var10000 = Logger.getLogger(this.qr0);
            Level var10001 = Level.WARNING;
            Object[] var3;
            Object[] var10002 = var3 = new Object[3];
            var3[0] = this.Ja0.getAttributeName(var2);
            var10002[1] = this.Ja0.getName();
            var10002[2] = var1;
            var10000.log(var10001, "Unused attribute ''{0}'' on ''{1}'' at {2}", var3);
         }
      }

   }

   public final void aM() {
      this.jC0();
      int var10000;
      try {
         var10000 = this.Ja0.nextTag();
      } catch (Throwable error) {
         ClasspathAssetStreamProvider.raise(error);
         return;
      }
      this.v70.clear();
      if (var10000 == 2) {
         this.v70.set(0, this.Ja0.getAttributeCount());
      }

   }

   public final String Yd0(String var1) {
      int var2 = 0;

      for(int var3 = this.Ja0.getAttributeCount(); var2 < var3; ++var2) {
         if (var1.equals(this.Ja0.getAttributeName(var2))) {
            this.v70.clear(var2);
            return this.Ja0.getAttributeValue(var2);
         }
      }

      return null;
   }
}
