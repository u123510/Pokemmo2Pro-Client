package f;

import cn.pokemmo.io.stream.BoundedChunkInputStream;
import java.io.IOException;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.Q
 * 核心实现已迁移至 {@link cn.pokemmo.io.stream.BoundedChunkInputStream}
 */
public final class Q extends BoundedChunkInputStream {
    public final int coM6;
    public final int Tk;
    public int CD0;

    public Q(Dn0 source) {
        super(source);
        this.coM6 = this.channels;
        this.Tk = this.sampleRate;
        this.CD0 = this.remainingData;
    }

    @Override
    public final int read(byte[] buffer) throws IOException {
        int res = super.read(buffer);
        this.CD0 = this.remainingData;
        return res;
    }

    public final int qJ0(char first, char second, char third) throws IOException {
        return seekChunk(first, second, third);
    }

    public final void A(int amount) throws IOException {
        skipBytes(amount);
    }
}
