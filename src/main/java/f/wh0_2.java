package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import cn.pokemmo.rom.nds.model.NitroModelRenderer;

/**
 * Shim: wh0_2 -> NitroModelRenderer
 * @see cn.pokemmo.rom.nds.model.NitroModelRenderer
 */
public class wh0_2 extends NitroModelRenderer {

    public wh0_2(ByteBuffer byteBuffer) { super(byteBuffer); }
    public wh0_2(MappedByteBuffer mappedByteBuffer, Ou0 ou0) { super(mappedByteBuffer, ou0); }

}
