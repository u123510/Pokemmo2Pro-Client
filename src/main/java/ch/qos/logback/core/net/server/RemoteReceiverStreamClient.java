package ch.qos.logback.core.net.server;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.CloseUtil;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.concurrent.BlockingQueue;

class RemoteReceiverStreamClient extends ContextAwareBase implements RemoteReceiverClient {
   private final String clientId;
   private final Socket socket;
   private final OutputStream outputStream;
   private BlockingQueue queue;

   public RemoteReceiverStreamClient(String var1, Socket var2) {
      this.clientId = "client " + var1 + ": ";
      this.socket = var2;
      this.outputStream = null;
   }

   public RemoteReceiverStreamClient(String var1, OutputStream var2) {
      this.clientId = "client " + var1 + ": ";
      this.socket = null;
      this.outputStream = var2;
   }

   private ObjectOutputStream createObjectOutputStream() throws IOException {
      return this.socket == null ? new ObjectOutputStream(this.outputStream) : new ObjectOutputStream(this.socket.getOutputStream());
   }

   public void setQueue(BlockingQueue var1) {
      this.queue = var1;
   }

   public boolean offer(Serializable var1) {
      BlockingQueue var2;
      if ((var2 = this.queue) != null) {
         return var2.offer(var1);
      } else {
         throw new IllegalStateException("client has no event queue");
      }
   }

   public void close() {
      Socket var1;
      if ((var1 = this.socket) != null) {
         CloseUtil.closeQuietly(var1);
      }
   }

   public void run() {
      // $FF: Couldn't be decompiled
   }
}
