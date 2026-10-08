package cn.pokemmo.platform.desktop.archive;

import f.*;


import com.badlogic.gdx.jnigen.runtime.CHandler;
import org.libarchive.Libarchive;

public class GdxArchiveReader {
    public long xA0;
    public long f9;
    public String GR;

    static {
        new tc0_0().yY("archive");
    }

    public GdxArchiveReader() {
    }

    public final int zv(String v1, String v2) {
        com8__2 local = Libarchive.ob();
        Libarchive.Sz0(local);
        Libarchive.IU(local);
        throw null;
    }

    public final int Ma(com8__2 v1, String v2, String v3) {
        Q3 q3 = new Q3("char", v2.length() + 1, true, true);
        q3.pN((long) v2.length());
        CHandler.setPointerAsString(q3.U9, v2);
        com8__2 v2_archive = Libarchive.v70();
        Libarchive.XW(v2_archive);
        Libarchive.X6(v2_archive);
        this.xA0 = 0L;
        this.f9 = -1L;
        COM9_ com9 = new COM9_(xi0_0::new);
        while (true) {
            int i6 = Libarchive.SD(v1, com9);
            com9.pN((long) COM9_.Xs);
            long j7 = CHandler.getPointerPart(com9.U9, COM9_.Xs, 0);
            bi_1 item = com9.Xe.px(j7, false);
            if (!(item instanceof COM9_) && item instanceof Q3) {
                throw new IllegalArgumentException("PointerPointer dereferences to CTypeInfo, but has not CType info, set it with setBackingCType");
            }
            xi0_0 entry = (xi0_0) item;
            if (Libarchive.Oq(v1) > 0) {
                return 2;
            }
            if (i6 == 1) {
                break;
            }
            if (i6 < -20) {
                Q3 err = Libarchive.D0(v1);
                if (err.wA0() != null) {
                    this.GR = err.wA0();
                }
                return 1;
            }
            String entryName = Libarchive.bt0(entry).wA0();
            if (entryName == null) {
                continue;
            }
            if (v3 != null && !v3.isEmpty() && !entryName.endsWith(v3)) {
                continue;
            }
            Libarchive.pt0(entry, q3);
            int writeStatus = Libarchive.GG0(v2_archive, entry);
            if (writeStatus == 0 && Libarchive.Qo0(entry) > 0L) {
                this.f9 = Libarchive.Qo0(entry);
                writeStatus = Zu0(v1, v2_archive);
                if (writeStatus < -20) {
                    Q3 err = Libarchive.D0(v2_archive);
                    if (err.wA0() != null) {
                        this.GR = err.wA0();
                    }
                    return 1;
                }
            }
            if (writeStatus < -20) {
                Q3 err = Libarchive.D0(v2_archive);
                if (err.wA0() != null) {
                    this.GR = err.wA0();
                }
                return 1;
            }
            if (Libarchive.hL(v2_archive) < -20) {
                Q3 err = Libarchive.D0(v2_archive);
                if (err.wA0() != null) {
                    this.GR = err.wA0();
                }
                return 1;
            }
        }
        Libarchive.XT(v2_archive);
        Libarchive.ip(v2_archive);
        Libarchive.tz0(v1);
        Libarchive.jn0(v1);
        return 0;
    }

    public final int Zu0(com8__2 v1, com8__2 v2) {
        COM9_ com9 = new COM9_(ir_2::new);
        Q3 size_t = new Q3("size_t");
        Q3 int64 = new Q3("la_int64_t");
        while (true) {
            int i6 = Libarchive.ub(v1, com9, size_t, int64);
            long curXa0 = this.xA0;
            int i10 = size_t.M80.By0;
            long j11 = (long) i10;
            size_t.pN(j11);
            long part = CHandler.getPointerPart(size_t.U9, i10, 0);
            this.xA0 = curXa0 + part;
            if (i6 == 1) {
                return 0;
            }
            if (i6 < 0) {
                Q3 err = Libarchive.D0(v1);
                if (err.wA0() != null) {
                    this.GR = err.wA0();
                }
                return i6;
            }
            com9.pN(j11);
            long j6 = CHandler.getPointerPart(com9.U9, COM9_.Xs, 0);
            bi_1 item = com9.Xe.px(j6, false);
            if (!(item instanceof COM9_) && item instanceof Q3) {
                throw new IllegalArgumentException("PointerPointer dereferences to CTypeInfo, but has not CType info, set it with setBackingCType");
            }
            ir_2 data = (ir_2) item;
            size_t.pN(j11);
            long sizeVal = CHandler.getPointerPart(size_t.U9, size_t.M80.By0, 0);
            int64.pN(j11);
            long offsetVal = CHandler.getPointerPart(int64.U9, int64.M80.By0, 0);
            long writeLen = Libarchive.E9(v2, data, sizeVal, offsetVal);
            int writeStatus = (int) writeLen;
            if (writeStatus < 0) {
                Q3 err = Libarchive.D0(v2);
                if (err.wA0() != null) {
                    this.GR = err.wA0();
                }
                return writeStatus;
            }
        }
    }
}
