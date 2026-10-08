/*
 * Restored from jar bytecode.
 */
package cn.pokemmo.audio.openal;

import f.*;

import com.badlogic.gdx.utils.BufferUtils;
import f.Dn0;
import f.f40_0;
import f.su_0;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.stb.STBVorbis;
import org.lwjgl.system.MemoryStack;

public class StbVorbisSoundEffect extends su_0 {
    public StbVorbisSoundEffect(cn.pokemmo.audio.openal.OpenALAudioEngine audio, Dn0 file) {
        super(audio);
        if (audio.Ze) {
            return;
        }
        byte[] bytes = file.kI0();
        ByteBuffer input = BufferUtils.I5(bytes.length);
        input.put(bytes);
        input.flip();
        try (MemoryStack stack = MemoryStack.stackPush()) {
            java.nio.IntBuffer channelsBuffer = stack.mallocInt(1);
            java.nio.IntBuffer sampleRateBuffer = stack.mallocInt(1);
            ShortBuffer pcm = STBVorbis.stb_vorbis_decode_memory(input, channelsBuffer, sampleRateBuffer);
            int channels = channelsBuffer.get(0);
            int sampleRate = sampleRateBuffer.get(0);
            if (pcm == null) {
                throw new RuntimeException("Error decoding OGG file: " + file);
            }
            if (channels < 1 || channels > 2) {
                throw new RuntimeException("Error decoding OGG file, unsupported number of channels: " + file);
            }
            this.Fd(pcm, channels, sampleRate);
        }
    }
}
