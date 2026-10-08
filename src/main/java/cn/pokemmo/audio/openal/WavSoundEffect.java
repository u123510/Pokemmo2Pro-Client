package cn.pokemmo.audio.openal;

import f.*;

import java.io.ByteArrayOutputStream;

public class WavSoundEffect extends su_0 {
    public WavSoundEffect(cn.pokemmo.audio.openal.OpenALAudioEngine audio, Dn0 file) {
        super(audio);
        if (audio.Ze) {
            return;
        }

        ByteArrayOutputStream output = new ByteArrayOutputStream(4096);
        kk_1 reader = new kk_1(file.uf0());
        gk_2 decoder = new gk_2();
        bn_1 pcm = null;
        int sampleRate = -1;
        int channels = -1;
        try {
            while (true) {
                c50_0 header = reader.k0();
                if (header == null) {
                    reader.qe0();
                    Y60(output.toByteArray(), channels, sampleRate);
                    return;
                }
                if (pcm == null) {
                    channels = header.ys0() == 3 ? 1 : 2;
                    pcm = new bn_1(channels);
                    decoder.Du(pcm);
                    sampleRate = header.sg();
                }
                try {
                    decoder.D50(reader, header);
                } catch (Exception ignored) {
                    // The frame decoder skips malformed frames.
                }
                reader.IH();
                int length = pcm.Ga();
                output.write(pcm.Io0(), 0, length);
            }
        } catch (Throwable error) {
            throw new nf_1("Error reading audio data.", error);
        }
    }
}
