package f;

/**
 * 兼容垫片 (Shim) - GbaRomOffsetResolver
 * 原混淆类: f.coM7 / com7__5
 * 现代实现: cn.pokemmo.rom.gba.offset.GbaRomOffsetResolver
 */
public abstract class com7__5 implements Cloneable {

    public abstract int uO(qa0_1 rom);

    public final com7__5 lPt8() {
        try {
            return (com7__5) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
