package f;

import cn.pokemmo.io.binary.BinaryArchiveHeaderReader;

public final class G1 extends BinaryArchiveHeaderReader {
    public static final dl_1 NC = BinaryArchiveHeaderReader.LOGGER;
    public String ug;
    public byte Vv;
    public final Dn0 b30;
    public Y60 nG;

    public G1(Dn0 v1) {
        super(v1);
        this.b30 = this.file;
        this.ug = this.magic;
        this.Vv = this.version;
    }

    public final boolean xo(boolean i1) {
        boolean res = readHeader(i1);
        this.ug = this.magic;
        this.Vv = this.version;
        this.nG = this.indexMap;
        return res;
    }
}
