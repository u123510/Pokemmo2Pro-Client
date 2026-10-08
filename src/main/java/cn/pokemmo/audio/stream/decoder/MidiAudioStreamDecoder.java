package cn.pokemmo.audio.stream.decoder;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class MidiAudioStreamDecoder extends BaseAudioStreamDecoder {
    public static final dl_1 jF0 = Cq0.E1(MidiAudioStreamDecoder.class);
    public static final dl_1 c50 = Cq0.t00("mod");
    public AG0[] OV;

    public MidiAudioStreamDecoder(Dn0 source) {
        super(source);
        this.OV = null;
    }

    public final AG0[] bb0(byte rows, byte columns) {
        if (this.OV != null) {
            return this.OV;
        }
        if (rows < 1 || columns < 1) {
            throw new IllegalArgumentException("Texture had invalid parameters: modAtlasRows " + rows
                    + ", modAtlasColumns " + columns + ". Rows & Columns must be > 0");
        }
        i4_0 image = this.By();
        int tileWidth = image.XF.SH / rows;
        int tileHeight = image.XF.mB0 / columns;
        image.dispose();
        AG0[] result = new AG0[rows * columns];
        Wr wrapper = new Wr(new HE((r2) (Object) this));
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                result[column * rows + row] = new AG0(wrapper, row * tileWidth,
                        column * tileHeight, tileWidth, tileHeight);
            }
        }
        this.OV = result;
        return result;
    }

    public final i4_0 By() {
        try {
            return new i4_0(this.I40);
        } catch (Exception error) {
            jF0.error("Error loading png {}", this.I40.el(), error);
            c50.error("Error loading png {}", this.I40.el(), error);
            if (Iu0.C80((nf_1)error)) {
                throwUnchecked(error);
            }
            return LP.tl0;
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable error) throws T {
        throw (T)error;
    }
}
