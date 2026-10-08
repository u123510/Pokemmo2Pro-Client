package ch.qos.logback.core.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class SyslogOutputStream extends OutputStream {
   private static final int MAX_LEN = 1024;
   private InetAddress address;
   private DatagramSocket ds;
   private ByteArrayOutputStream baos = new ByteArrayOutputStream();
   private final int port;

   public SyslogOutputStream(String var1, int var2) throws UnknownHostException, SocketException {
      this.address = InetAddress.getByName(var1);
      this.port = var2;
      this.ds = new DatagramSocket();
   }

   public void write(byte[] var1, int var2, int var3) {
      this.baos.write(var1, var2, var3);
   }

   public void flush() throws IOException {
      byte[] var1 = this.baos.toByteArray();
      DatagramPacket var2 = new DatagramPacket(var1, var1.length, this.address, this.port);
      if (this.baos.size() > MAX_LEN) {
         this.baos = new ByteArrayOutputStream();
      } else {
         this.baos.reset();
      }

      if (var1.length != 0) {
         DatagramSocket var6;
         if ((var6 = this.ds) != null) {
            var6.send(var2);
         }

      }
   }

   public void close() {
      this.address = null;
      this.ds = null;
   }

   public int getPort() {
      return this.port;
   }

   public void write(int var1) {
      this.baos.write(var1);
   }

   public int getSendBufferSize() throws SocketException {
      return this.ds.getSendBufferSize();
   }
}
