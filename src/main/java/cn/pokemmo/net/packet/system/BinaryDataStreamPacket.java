package cn.pokemmo.net.packet.system;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public abstract class BinaryDataStreamPacket extends yq0_0 implements Cloneable {
    public static final dl_1 ob0;

    public BinaryDataStreamPacket(k20_0 source, ByteBuffer data) {
        super(data, 0);
        this.VR(source);
    }

    static {
        ob0 = Cq0.E1(BinaryDataStreamPacket.class);
    }

    @Override
    public final void run() {
        try {
            this.os0();
        } catch (Throwable error) {
            ob0.warn(this.toString(), error);
        }
    }

    public void km() {
    }

    public final void je(RE value) {
        ((k20_0) this.uk).uQ(value);
    }

    public final Ge0 sr0() {
        return ((k20_0) this.uk).uH0;
    }
}
