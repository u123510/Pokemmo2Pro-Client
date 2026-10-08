package ch.qos.logback.core.spi;

import ch.qos.logback.core.helpers.CyclicBuffer;
import java.util.ArrayList;
import java.util.List;

public class CyclicBufferTracker extends AbstractComponentTracker<CyclicBuffer> {
   static final int DEFAULT_NUMBER_OF_BUFFERS = 64;
   static final int DEFAULT_BUFFER_SIZE = 256;
   int bufferSize = 256;

   public CyclicBufferTracker() {
      this.setMaxComponents(64);
   }

   public int getBufferSize() {
      return this.bufferSize;
   }

   public void setBufferSize(int var1) {
      this.bufferSize = var1;
   }

   public void processPriorToRemoval(CyclicBuffer var1) {
      var1.clear();
   }

   public CyclicBuffer buildComponent(String var1) {
      return new CyclicBuffer(this.bufferSize);
   }

   public boolean isComponentStale(CyclicBuffer var1) {
      return false;
   }

   public List liveKeysAsOrderedList() {
      return new ArrayList(this.liveMap.keySet());
   }

   public List lingererKeysAsOrderedList() {
      return new ArrayList(this.lingerersMap.keySet());
   }
}
