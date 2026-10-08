package f;

import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import cn.pokemmo.rom.nds.model.NitroOamData;

/**
 * Shim: Rk0 -> NitroOamData
 * @see cn.pokemmo.rom.nds.model.NitroOamData
 */
public class Rk0 extends NitroOamData {

    public Rk0(Ae var1) { super(var1); }
    public Rk0(Ae var1, boolean var2) { super(var1, var2); }

}
