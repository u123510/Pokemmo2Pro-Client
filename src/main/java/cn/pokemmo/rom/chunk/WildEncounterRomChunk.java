package cn.pokemmo.rom.chunk;

import f.*;

import java.nio.ByteBuffer;

public class WildEncounterRomChunk extends BaseRomResourceChunk {
    public short V2;
    public final es_1 km;

    public WildEncounterRomChunk() {
        super();
        this.km = new es_1();
    }

    public final void pH(ByteBuffer v1, int... v2) {
        this.V2 = v1.getShort();
        v1.getShort();
        v1.getShort();
        this.a00 = v1.getShort() & 0xFFFF;
    }

    public final void vD(ByteBuffer v1) {
        for (int i = 0; i < this.V2; i++) {
            SJ sj = new SJ();
            sj.IH = v1.getShort();
            sj.T2 = v1.get();
            sj.IX = v1.get();
            this.km.Ue0(sj);
        }
    }
}
