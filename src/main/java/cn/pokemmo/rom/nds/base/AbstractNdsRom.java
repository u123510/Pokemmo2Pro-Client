package cn.pokemmo.rom.nds.base;

import cn.pokemmo.rom.nds.header.NdsRomHeader;
import cn.pokemmo.rom.nds.fs.NitroFileSystem;
import f.Cq0;
import f.Dn0;
import f.F90;
import f.MG0;
import f.S80;
import f.TI0;
import f.Yw0;
import f.Z50;
import f.ab0_2;
import f.am_2;
import f.bz_0;
import f.cp_0;
import f.dl_1;
import f.hx_2;
import f.l70_0;
import f.lpt6__2;
import f.no0_0;
import f.wa0_2;
import f.wm_1;
import f.xk0_1;
import f.xm_0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/**
 * NDS ROM 抽象基类
 * 管理卡带头部、NitroFS 虚拟文件系统挂载、只读内存映射与通用资源钩子。
 * 原混淆类: f.l50_0
 */
public abstract class AbstractNdsRom {
    public static final dl_1 LOGGER = Cq0.E1(AbstractNdsRom.class);
    public static final dl_1 Tc0 = LOGGER;

    public final Dn0 romFile;
    public final ByteBuffer romBuffer;
    public final NdsRomHeader header;
    public final NitroFileSystem fileSystem;

    public xm_0 textBankPrimary;
    public xm_0 textBankSecondary;
    public hx_2 soundData;
    public bz_0 gQ;
    public Yw0 fx;
    public wa0_2[] scripts;
    public ab0_2[] events;
    public ByteBuffer arm9DecodedBuffer;
    public final boolean isCompressedArm9;
    public String languageCode;

    // 兼容混淆字段别名
    public final Dn0 lE;
    public final ByteBuffer dL;
    public final cp_0 z40;
    public final no0_0 fd0;
    public xm_0 Gn;
    public xm_0 b70;
    public hx_2 r3;
    public wa0_2[] du0;
    public ab0_2[] o50;
    public ByteBuffer WC0;
    public final boolean qk0;
    public String MI;

    public AbstractNdsRom(Dn0 file, boolean compressedArm9, String... supportedCodes) {
        this.WC0 = null;
        this.MI = null;
        this.romFile = file;
        this.lE = file;
        this.isCompressedArm9 = compressedArm9;
        this.qk0 = compressedArm9;

        cp_0 parsedHeader = new cp_0(file);
        this.header = parsedHeader;
        this.z40 = parsedHeader;

        boolean supported = false;
        for (String code : supportedCodes) {
            if (this.header.codePrefix.equals(code)) {
                supported = true;
                break;
            }
        }
        if (!supported) {
            throw new xk0_1(TI0.Ga(this.header.gameCode.getBytes()).concat(" is not currently a supported rom type."));
        }

        this.romBuffer = file.zs0(FileChannel.MapMode.READ_ONLY);
        this.dL = this.romBuffer;

        this.header.HF0(this);

        no0_0 fs = new no0_0(this);
        this.fileSystem = fs;
        this.fd0 = fs;

        LOGGER.info("Loaded DS ROM {} ({} v{})", new Object[] {
            this.header.gameTitle.trim(),
            this.header.gameCode,
            Byte.valueOf(this.header.version)
        });

        A3();
    }

    public final ByteBuffer getBuffer() {
        return this.romBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
    }

    public final ByteBuffer Mr0() {
        return getBuffer();
    }

    public final ByteBuffer getArm9Buffer() {
        if (this.arm9DecodedBuffer == null) {
            ByteOrder order = ByteOrder.LITTLE_ENDIAN;
            ByteBuffer buf = this.romBuffer.duplicate().order(order);
            buf.position(this.header.arm9RomOffset);
            buf.limit(this.header.arm9Size + this.header.arm9RomOffset);
            ByteBuffer slice = buf.slice().order(order);
            if (this.isCompressedArm9) {
                byte[] bytes = new byte[slice.remaining()];
                slice.get(bytes);
                slice = ByteBuffer.wrap(l70_0.lF0(bytes)).order(order);
            }
            slice.position(0);
            this.arm9DecodedBuffer = slice;
            this.WC0 = slice;
        }
        return this.arm9DecodedBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
    }

    public final ByteBuffer Gr() {
        return getArm9Buffer();
    }

    public final boolean isJapanese() {
        return this.header.gameCode.endsWith("J");
    }

    public final boolean nA() {
        return isJapanese();
    }

    public final boolean isKorean() {
        return this.header.gameCode.endsWith("K");
    }

    public final boolean f9() {
        return isKorean();
    }

    public final NitroFileSystem getFileSystem() {
        return this.fileSystem;
    }

    public final no0_0 nuL() {
        return this.fd0;
    }

    public final NdsRomHeader getHeader() {
        return this.header;
    }

    public final cp_0 JD() {
        return this.z40;
    }

    public final Dn0 kn0() {
        return this.romFile;
    }

    public abstract byte Tz();

    public abstract void jx();

    public abstract void A3();

    public final xm_0 VB0(lpt6__2 v1) {
        if (v1 == lpt6__2.YG0) {
            return this.textBankSecondary != null ? this.textBankSecondary : this.b70;
        }
        return this.textBankPrimary != null ? this.textBankPrimary : this.Gn;
    }

    public final hx_2 RP() {
        if (this.r3 == null) {
            Tf0();
        }
        return this.r3;
    }

    public abstract void Tf0();

    public String pG0() {
        char c = this.header.gameCode.charAt(this.header.gameCode.length() - 1);
        if (c == 'C') return "zh";
        if (c == 'D') return "de";
        if (c == 'F') return "fr";
        if (c == 'S') return "es";
        switch (c) {
            case 73: return "it";
            case 74: return "ja";
            case 75: return "ko";
            default: return "en";
        }
    }

    public abstract am_2 EL0(MG0 v1, int i2);

    public abstract F90 eg0(short i1);

    public final Yw0 s30() {
        return this.fx;
    }

    public abstract Z50 Sc0(int i1);

    public final wa0_2 V10(int i1) {
        wa0_2[] arr = this.scripts != null ? this.scripts : this.du0;
        if (arr == null || i1 >= arr.length) return null;
        return arr[i1];
    }

    public final ab0_2 FA(int i1) {
        ab0_2[] arr = this.events != null ? this.events : this.o50;
        if (arr == null || i1 >= arr.length) return null;
        ab0_2 ab = arr[i1];
        ab.nk();
        return ab;
    }

    public abstract S80 G80();

    public final wm_1 Vd0() {
        return this.header.arm9Overlays[9];
    }
}
