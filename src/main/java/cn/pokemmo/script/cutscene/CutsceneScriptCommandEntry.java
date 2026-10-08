package cn.pokemmo.script.cutscene;

import java.nio.ByteBuffer;

/**
 * 3D 过场动画/脚本指令条目 (Cutscene Script Command Entry)
 * <p>
 * 原始混淆类: {@code f.dj0_2}
 */
public class CutsceneScriptCommandEntry {
    public final int oq;
    public final int L9;
    public final short G00;
    public final short lPt2;

    public CutsceneScriptCommandEntry(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        this.oq = byteBuffer.getInt();
        this.L9 = byteBuffer.getInt();
        this.G00 = byteBuffer.getShort();
        byteBuffer2.getShort();
        this.lPt2 = byteBuffer2.getShort();
        byteBuffer.get(new byte[26]);
    }

    public CutsceneScriptCommandEntry(int opcode, int param1, short param2, short param3) {
        this.oq = opcode;
        this.L9 = param1;
        this.G00 = param2;
        this.lPt2 = param3;
    }
}
