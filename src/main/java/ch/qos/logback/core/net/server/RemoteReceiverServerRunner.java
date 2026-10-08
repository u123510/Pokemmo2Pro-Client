package ch.qos.logback.core.net.server;

import ch.qos.logback.core.spi.ContextAwareBase;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;

class RemoteReceiverServerRunner extends ConcurrentServerRunner {
   private final int clientQueueSize;

   public RemoteReceiverServerRunner(ServerListener var1, Executor var2, int var3) {
      super(var1, var2);
      this.clientQueueSize = var3;
   }

   public boolean configureClient(RemoteReceiverClient var1) {
      var1.setContext(((ContextAwareBase)this).getContext());
      var1.setQueue(new ArrayBlockingQueue(this.clientQueueSize));
      return true;
   }

   public boolean configureClient(Client var1) {
      return this.configureClient((RemoteReceiverClient)var1);
   }
}
