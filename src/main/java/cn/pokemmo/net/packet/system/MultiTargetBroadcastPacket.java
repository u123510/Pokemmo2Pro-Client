package cn.pokemmo.net.packet.system;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

/** Marker base for incoming packet codecs. */
public abstract class MultiTargetBroadcastPacket extends yq0_0 {
   public static final int el;

   protected MultiTargetBroadcastPacket(ByteBuffer buffer, int value) {
      super(buffer, value);
   }

   static {
      el = 0;
   }
}
