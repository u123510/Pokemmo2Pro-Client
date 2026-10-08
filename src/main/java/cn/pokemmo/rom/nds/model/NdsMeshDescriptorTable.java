package cn.pokemmo.rom.nds.model;

import f.Ae;
import f.ac0_0;
import f.aq_0;
import f.j90_0;
import f.v6_0;
import java.nio.ByteBuffer;

/**
 * NDS 模型网格描述符表 (NDS Mesh Descriptor Table)
 * <p>
 * 原始混淆类: {@code f.E3}
 */
public class NdsMeshDescriptorTable {
    public final Ae jh;
    public final v6_0 Hy0;
    public j90_0[] mh0;

    public NdsMeshDescriptorTable(Ae source) {
        this.Hy0 = new v6_0();
        this.jh = source;
        this.W7();
    }

    public void W7() {
        ByteBuffer buffer = this.jh.MH(false);
        int magic = buffer.getInt();
        buffer.getShort();
        buffer.getShort();
        buffer.getInt();
        buffer.getShort();
        buffer.getShort();
        int expected = 1313686354;
        if (magic != expected) {
            throw new RuntimeException(ac0_0.YH0("Header magic mismatch = ", magic, " vs expected ", expected));
        }

        byte[] reserved = new byte[4];
        buffer.get(reserved);
        buffer.getInt();
        this.Hy0.I40 = buffer.getShort();
        buffer.getShort();
        buffer.getInt();
        buffer.getInt();
        buffer.getInt();
        buffer.getInt();

        this.mh0 = new j90_0[this.Hy0.I40];
        for (int index = 0; index < this.Hy0.I40; index++) {
            j90_0 entry = new j90_0();
            this.mh0[index] = entry;
            entry.qv0 = buffer.getShort();
            buffer.getShort();
            buffer.getInt();
        }

        for (int index = 0; index < this.Hy0.I40; index++) {
            j90_0 entry = this.mh0[index];
            entry.rI = new aq_0[entry.qv0];
            for (int part = 0; part < entry.qv0; part++) {
                aq_0 descriptor = new aq_0();
                descriptor.N80 = buffer.getShort();
                descriptor.J3 = buffer.getShort();
                descriptor.x60 = buffer.getShort();
                buffer.get();
                buffer.get();
                entry.rI[part] = descriptor;
            }
        }
    }
}
