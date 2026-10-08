package cn.pokemmo.net.packet.outbound.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class Action017OutboundPacket extends BaseOutboundActionPacket {
   public final String jq0;
   public final String v8;
   public final boolean fG0;
   public final boolean AG;
   public final RR C90;
   public final byte[] n00;

   public Action017OutboundPacket(String username, String password, boolean useStoredCredentials, boolean rememberCredentials, RR credential) {
      super(17);
      this.jq0 = username;
      this.v8 = password;
      this.fG0 = useStoredCredentials;
      this.AG = rememberCredentials;
      this.C90 = credential;
      this.n00 = tw0_0.lM.Xr();
   }

   @Override
   public final void Xn0(ByteBuffer buffer) {
      bo_1.cK(this.jq0, buffer);
      buffer.put((byte)(this.fG0 ? 1 : 0));
      buffer.put((byte)this.n00.length);
      buffer.put(this.n00);
      if (this.C90 != null && this.C90.Kj0) {
         buffer.put((byte)1);
         buffer.put((byte)this.C90.f0.length);
         buffer.put(this.C90.f0);
      } else {
         buffer.put((byte)0);
         bo_1.cK(this.v8, buffer);
         buffer.put((byte)(this.AG ? 1 : 0));
      }
      bo_1.cK(dw_2.con, buffer);
      buffer.putInt(28887);
      buffer.putInt(x0_0.k40);
      buffer.put(qt_1.zm0.LG);
      buffer.put((byte)tw0_0.Ht0.Is.length);
      buffer.put(tw0_0.Ht0.Is);
   }
}
