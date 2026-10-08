package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class NetworkAddressUtil extends ContextAwareBase {
   public NetworkAddressUtil(Context var1) {
      ((ContextAwareBase)this).setContext(var1);
   }

   public static String getLocalHostName() throws UnknownHostException, SocketException {
      try {
         return InetAddress.getLocalHost().getHostName();
      } catch (UnknownHostException var1) {
         return getLocalAddressAsString();
      }
   }

   public static String getCanonicalLocalHostName() throws UnknownHostException, SocketException {
      try {
         return InetAddress.getLocalHost().getCanonicalHostName();
      } catch (UnknownHostException var1) {
         return getLocalAddressAsString();
      }
   }

   private static String getLocalAddressAsString() throws UnknownHostException, SocketException {
      Enumeration var0 = NetworkInterface.getNetworkInterfaces();

      while(var0 != null && var0.hasMoreElements()) {
         Enumeration var1 = ((NetworkInterface)var0.nextElement()).getInetAddresses();

         while(var1 != null && var1.hasMoreElements()) {
            InetAddress var2;
            if (acceptableAddress(var2 = (InetAddress)var1.nextElement())) {
               return var2.getHostAddress();
            }
         }
      }

      throw new UnknownHostException();
   }

   private static boolean acceptableAddress(InetAddress var0) {
      return var0 != null && !var0.isLoopbackAddress() && !var0.isAnyLocalAddress() && !var0.isLinkLocalAddress();
   }

   public String safelyGetLocalHostName() {
      Object var1;
      try {
         return getLocalHostName();
      } catch (UnknownHostException var2) {
         var1 = var2;
      } catch (SocketException var3) {
         var1 = var3;
      } catch (SecurityException var4) {
         var1 = var4;
      }

      ((ContextAwareBase)this).addError("Failed to get local hostname", (Throwable)var1);
      return "UNKNOWN_LOCALHOST";
   }

   public String safelyGetCanonicalLocalHostName() {
      Object var1;
      try {
         return getCanonicalLocalHostName();
      } catch (UnknownHostException var2) {
         var1 = var2;
      } catch (SocketException var3) {
         var1 = var3;
      } catch (SecurityException var4) {
         var1 = var4;
      }

      ((ContextAwareBase)this).addError("Failed to get canonical local hostname", (Throwable)var1);
      return "UNKNOWN_LOCALHOST";
   }
}
