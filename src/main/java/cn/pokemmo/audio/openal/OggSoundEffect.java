package cn.pokemmo.audio.openal;

import f.*;

import java.io.IOException;

public class OggSoundEffect extends su_0 {
    public OggSoundEffect(cn.pokemmo.audio.openal.OpenALAudioEngine audio, Dn0 file) {
        super(audio);
        String message = "Error reading WAV file: ";
        if (audio.Ze) {
            return;
        }

        Q reader = null;
        try {
            reader = new Q(file);
            byte[] pcm = KT.Vc(reader, reader.CD0);
            this.Y60(pcm, reader.coM6, reader.Tk);
        } catch (Throwable error) {
            if (error instanceof IOException) {
                throw new nf_1(message + file, error);
            }
            if (error instanceof RuntimeException) {
                throw (RuntimeException) error;
            }
            if (error instanceof Error) {
                throw (Error) error;
            }
            throw new RuntimeException(error);
        } finally {
            KT.E1(reader);
        }
    }
}
