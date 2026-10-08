package cn.pokemmo.net.packet.protocol;

import f.*;

import java.nio.ByteBuffer;

public class BatchCommandPacket extends BaseSystemProtocolPacket {
    public final lt0_0[] Xz0;
    public final byte i00;

    public BatchCommandPacket(lt0_0[] var1, byte var2) {
        super((byte)19);
        this.Xz0 = var1;
        this.i00 = var2;
    }

    @Override
    public final boolean Ev0(CE var1, cq_0 var2) {
        lt0_0[] var3 = this.Xz0;
        if (var3 != null && var1 != null) {
            int var4 = 0;
            byte var5 = this.i00;
            for (lt0_0 var7 : var3) {
                gc_2 var8 = var7.Oe0;
                if (var8 == null) {
                    return false;
                }
                int var9 = 1 << var8.v10;
                if (var7.Ev0(var1, null)) {
                    if ((var4 & var9) != 0) {
                        if (--var5 == 0) {
                            return true;
                        }
                    }
                    var4 ^= var9;
                }
            }
        }
        return false;
    }

    @Override
    public final int ha() {
        return this.i00;
    }

    @Override
    public final void hG(ByteBuffer var1) {
        var1.put(this.mG);
        var1.put(this.i00);
        var1.put((byte)this.Xz0.length);
        for (lt0_0 var5 : this.Xz0) {
            var5.hG(var1);
        }
    }
}
