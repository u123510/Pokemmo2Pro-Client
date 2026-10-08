package f;

import cn.pokemmo.rom.nds.bw.BwTrainerPokemonEntry;
import java.nio.ByteBuffer;

/**
 * Shim: Ge -> BwTrainerPokemonEntry
 * @see cn.pokemmo.rom.nds.bw.BwTrainerPokemonEntry
 */
public final class Ge extends BwTrainerPokemonEntry {
    public Ge(U20 u20, ByteBuffer byteBuffer) {
        super(u20, byteBuffer);
    }
}
