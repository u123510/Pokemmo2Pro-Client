package cn.pokemmo.rom.nds.header;

import f.Dn0;
import f.wm_1;
import cn.pokemmo.rom.nds.base.AbstractNdsRom;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * NDS ROM Header 解析器
 * 解析 NDS 卡带前 2048 字节 (0x800) 的标准元数据及 Overlay 表。
 * 原混淆类: f.cp_0
 */
public class NdsRomHeader {
    // 语义化属性
    public final String gameTitle;
    public final String gameCode;
    public final String codePrefix;
    public final byte version;
    public final int arm9RomOffset;
    public final int arm9Size;
    public final int fntOffset;
    public final int fatOffset;
    public final int fatSize;
    public final int arm9OverlayOffset;
    public final int arm9OverlaySize;
    public final int arm7OverlayOffset;
    public final int arm7OverlaySize;
    public wm_1[] arm9Overlays;
    public wm_1[] arm7Overlays;

    // 兼容混淆字段别名
    public final String FS;
    public final String const$;
    public final String ie;
    public final byte AN;
    public final int T90;
    public final int ee;
    public final int v50;
    public final int UI;
    public final int A5;
    public final int eP;
    public final int Lt0;
    public final int jE;
    public final int NT;
    public wm_1[] Wp0;
    public wm_1[] gO;

    public NdsRomHeader(Dn0 source) {
        byte[] bytes = new byte[2048];
        source.yM(bytes, 2048);
        ByteBuffer buffer = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);

        byte[] nameBytes = new byte[12];
        byte[] constantBytes = new byte[4];
        byte[] shortNameBytes = new byte[2];
        buffer.get(nameBytes);
        buffer.get(constantBytes);
        buffer.get(shortNameBytes);

        this.gameTitle = new String(nameBytes).trim();
        this.gameCode = new String(constantBytes);
        this.codePrefix = new String(constantBytes, 0, 3).trim();

        // 镜像给别名字段
        this.FS = this.gameTitle;
        this.const$ = this.gameCode;
        this.ie = this.codePrefix;

        buffer.get(); // unitCode
        buffer.get(); // encryptionSeed
        double exponent = buffer.get() + 17;
        Math.pow(2.0, exponent); // deviceCapacity

        byte[] reserved = new byte[9];
        buffer.get(reserved);

        this.version = buffer.get();
        this.AN = this.version;

        buffer.get(); // autostart flag

        this.arm9RomOffset = buffer.getInt();
        this.T90 = this.arm9RomOffset;

        buffer.getInt(); // arm9 entry
        buffer.getInt(); // arm9 ram

        this.arm9Size = buffer.getInt();
        this.ee = this.arm9Size;

        buffer.getInt(); // arm7 rom
        buffer.getInt(); // arm7 entry
        buffer.getInt(); // arm7 ram
        buffer.getInt(); // arm7 size

        this.fntOffset = buffer.getInt();
        this.v50 = this.fntOffset;

        buffer.getInt(); // fnt size

        this.fatOffset = buffer.getInt();
        this.UI = this.fatOffset;

        this.fatSize = buffer.getInt();
        this.A5 = this.fatSize;

        this.arm9OverlayOffset = buffer.getInt();
        this.eP = this.arm9OverlayOffset;

        this.arm9OverlaySize = buffer.getInt();
        this.Lt0 = this.arm9OverlaySize;

        this.arm7OverlayOffset = buffer.getInt();
        this.jE = this.arm7OverlayOffset;

        this.arm7OverlaySize = buffer.getInt();
        this.NT = this.arm7OverlaySize;
    }

    public void loadOverlays(AbstractNdsRom source) {
        ByteBuffer buffer = source.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        for (int pass = 0; pass < 2; pass++) {
            int position = pass == 0 ? this.arm9OverlayOffset : this.arm7OverlayOffset;
            int count = (pass == 0 ? this.arm9OverlaySize : this.arm7OverlaySize) / 32;
            buffer.position(position);
            wm_1[] values = new wm_1[count];
            for (int index = 0; index < count; index++) {
                values[index] = new wm_1(source.qk0, buffer);
            }
            if (pass == 0) {
                this.arm9Overlays = values;
                this.Wp0 = values;
            } else {
                this.arm7Overlays = values;
                this.gO = values;
            }
        }
    }

    public final void HF0(AbstractNdsRom source) {
        loadOverlays(source);
    }
}
