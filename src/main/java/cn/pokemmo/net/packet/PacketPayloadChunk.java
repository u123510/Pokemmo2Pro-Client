package cn.pokemmo.net.packet;

public class PacketPayloadChunk {
    public final short SN;
    public final int wB0;
    public final byte[] jN;
    public int zy0 = -1;

    public PacketPayloadChunk(short s, int n, byte[] byArray) {
        this.SN = s;
        this.wB0 = n;
        this.jN = byArray;
    }
}
