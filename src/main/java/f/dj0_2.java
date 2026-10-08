package f;

import cn.pokemmo.script.cutscene.CutsceneScriptCommandEntry;
import java.nio.ByteBuffer;

/**
 * Shim: dj0_2 -> CutsceneScriptCommandEntry
 * @see cn.pokemmo.script.cutscene.CutsceneScriptCommandEntry
 */
public final class dj0_2 extends CutsceneScriptCommandEntry {
    public dj0_2(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public dj0_2(int opcode, int param1, short param2, short param3) {
        super(opcode, param1, param2, param3);
    }
}
