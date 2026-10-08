package cn.pokemmo.net.security;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.security.GeneralSecurityException;
import javax.crypto.KeyAgreement;

public class KeyExchangeServerResponsePacket extends uf_0 {
   public static final dl_1 kP = Cq0.E1(KeyExchangeServerResponsePacket.class);
   public byte[] GB0;

   public KeyExchangeServerResponsePacket(int value) {
      super(value);
   }

   @Override
   public final void Oj0() {
      this.GB0 = new byte[super.Rj.getShort() & 65535];
      super.Rj.get(this.GB0);
   }

   @Override
   public final void os0() {
      ky_2 connection = (ky_2)super.uk;
      if (this.GB0.length >= 32 && this.GB0.length <= 200) {
         try {
            Mw0.OW(this.GB0);
            KeyAgreement.getInstance("ECDH");
            throw new UnsupportedOperationException();
         } catch (GeneralSecurityException | RuntimeException error) {
            connection.yK0();
            kP.error("Could not decrypt updated key from {}", connection.ZM, error);
         }
      } else {
         connection.yK0();
         kP.error("Got an invalid encodedClientPublicKey length: {}", this.GB0.length, new RuntimeException());
      }
   }
}
