package cn.pokemmo.rom.nds.model;

import java.nio.ByteBuffer;

/**
 * NDS Nitro 模型/纹理段头部 (Nitro Section Header)
 * <p>
 * 原始混淆类: {@code f.bw_1}
 */
public class NitroSectionHeader {
    public final int RQ;
    public final int RL;
    public final int[] hF;
    public final boolean lB;

    public NitroSectionHeader(ByteBuffer buffer, int expectedId) {
        int rq = 0;
        int rl = 0;
        int[] values = new int[0];
        boolean valid = buffer.getInt() == expectedId;
        if (valid) {
            buffer.getShort();
            buffer.getShort();
            rq = buffer.getInt();
            buffer.getShort();
            rl = buffer.getShort() & 0xFFFF;
            values = new int[rl];
            for (int index = 0; index < rl; index++) {
                values[index] = buffer.getInt();
            }
        }
        this.RQ = rq;
        this.RL = rl;
        this.hF = values;
        this.lB = valid;
    }
}
