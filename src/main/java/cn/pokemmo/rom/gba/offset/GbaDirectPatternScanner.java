package cn.pokemmo.rom.gba.offset;

import f.Cq0;
import f.dl_1;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * GBA ROM 特征码直接相对偏移扫描器 (无需指针解引用)
 * 
 * 职责:
 * 通过 16 进制模式串直接在 ROM 中查找目标字节特征，并计算其相对偏移位置。
 * 
 * 原混淆类: f.m80_0
 */
public class GbaDirectPatternScanner extends GbaRomOffsetResolver {
    public static final dl_1 vB = Cq0.E1(GbaDirectPatternScanner.class);
    public final byte[] Be;
    public final boolean[] EN;
    public final boolean SE;
    public final int FW;
    public final int UE;
    public int YJ;

    public GbaDirectPatternScanner(String pattern, int end, boolean reverse) {
        this(reverse, pattern, end, 0);
    }

    public GbaDirectPatternScanner(boolean reverse, String pattern, int end, int start) {
        super();
        this.YJ = -1;
        int length = pattern.length() / 2;
        this.EN = new boolean[length];
        this.Be = new byte[length];
        for (int i = 0; i < length; i++) {
            String token = pattern.substring(i * 2, (i + 1) * 2);
            if ("XX".equals(token)) {
                this.EN[i] = true;
            } else {
                this.Be[i] = (byte) Integer.parseInt(token, 16);
            }
        }
        this.SE = reverse;
        this.FW = end;
        this.UE = start;
    }

    @Override
    public final int uO(qa0_1 source) {
        if (this.YJ != -1) {
            return this.YJ;
        }
        ByteBuffer view = source.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        byte[] bytes;
        if (view.hasArray()) {
            bytes = view.array();
        } else {
            bytes = new byte[view.limit()];
            view.get(bytes);
            vB.error("Slow search");
        }

        int match = -1;
        for (int occurrence = 0; occurrence <= this.UE; occurrence++) {
            match = findNext(bytes, match + 1);
            if (match < 0) {
                throw new RuntimeException("Invalid Offset");
            }
        }
        int result = this.SE ? match - this.FW : match + this.Be.length + this.FW;
        this.YJ = result;
        return result;
    }

    private int findNext(byte[] bytes, int start) {
        for (int offset = Math.max(0, start); offset < bytes.length; offset++) {
            int index = 0;
            while (index < this.Be.length && offset + index < bytes.length
                    && (this.EN[index] || this.Be[index] == bytes[offset + index])) {
                index++;
            }
            if (index == this.Be.length) {
                return offset;
            }
        }
        return -1;
    }
}
