package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileUtil extends ContextAwareBase {
   static final int BUF_SIZE = 32768;

   public FileUtil(Context var1) {
      super.setContext(var1);
   }

   public static URL fileToURL(File var0) {
      try {
         return var0.toURI().toURL();
      } catch (MalformedURLException var2) {
         throw new RuntimeException("Unexpected exception on file [" + String.valueOf(var0) + "]", var2);
      }
   }

   public static boolean createMissingParentDirectories(File var0) {
      File parent = var0.getParentFile();
      if (parent == null) {
         return true;
      } else {
         parent.mkdirs();
         return parent.exists();
      }
   }

   public String resourceAsString(ClassLoader classLoader, String resourceName) {
      URL url = classLoader.getResource(resourceName);
      if (url == null) {
         addError("Failed to find resource [" + resourceName + "]");
         return null;
      }
      InputStreamReader reader = null;
      try {
         URLConnection connection = url.openConnection();
         connection.setUseCaches(false);
         reader = new InputStreamReader(connection.getInputStream());
         char[] buf = new char[128];
         StringBuilder out = new StringBuilder();
         int count;
         while ((count = reader.read(buf, 0, buf.length)) != -1) {
            out.append(buf, 0, count);
         }
         return out.toString();
      } catch (IOException e) {
         addError("Failed to open " + resourceName, e);
         return null;
      } finally {
         if (reader != null) {
            try {
               reader.close();
            } catch (IOException e) {
               // ignore close errors
            }
         }
      }
   }

   public void copy(String src, String destination) {
      BufferedInputStream bis = null;
      BufferedOutputStream bos = null;
      try {
         bis = new BufferedInputStream(new FileInputStream(src));
         bos = new BufferedOutputStream(new FileOutputStream(destination));
         byte[] buffer = new byte[BUF_SIZE];
         int count;
         while ((count = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, count);
         }
      } catch (IOException e) {
         String msg = "Failed to copy [" + src + "] to [" + destination + "]";
         addError(msg, e);
         throw new RolloverFailure(msg);
      } finally {
         if (bis != null) {
            try {
               bis.close();
            } catch (IOException e) {
               // ignore close errors
            }
         }
         if (bos != null) {
            try {
               bos.close();
            } catch (IOException e) {
               // ignore close errors
            }
         }
      }
   }
}
