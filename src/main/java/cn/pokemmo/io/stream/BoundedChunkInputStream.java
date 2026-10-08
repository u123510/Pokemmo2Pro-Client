package cn.pokemmo.io.stream;

import f.Dn0;
import f.KT;
import f.nf_1;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;

public class BoundedChunkInputStream extends FilterInputStream {
    public final int channels;
    public final int sampleRate;
    public int remainingData;

    public BoundedChunkInputStream(Dn0 source) {
        super(source.uf0());

        String bitsError = "WAV files must have 16 bits per sample:";
        String channelsError = "WAV files must have 1 or 2 channels:";
        String formatError = "WAV files must be PCM, unsupported format:";
        String headerError = "Invalid wave file header:";
        String riffError = "RIFF header not found:";

        try {
            if (this.read() != 'R' || this.read() != 'I' || this.read() != 'F' || this.read() != 'F') {
                throw new nf_1(riffError + source);
            }

            this.skipBytes(4);
            if (this.read() != 'W' || this.read() != 'A' || this.read() != 'V' || this.read() != 'E') {
                throw new nf_1(headerError + source);
            }

            int formatChunkSize = this.seekChunk('f', 'm', ' ');
            int audioFormat = (this.read() & 0xFF) | ((this.read() & 0xFF) << 8);
            if (audioFormat != 1) {
                String description;
                switch (audioFormat) {
                    case 2:
                        description = "ADPCM";
                        break;
                    case 3:
                        description = "IEEE float";
                        break;
                    case 6:
                        description = "8-bit ITU-T G.711 A-law";
                        break;
                    case 7:
                        description = "8-bit ITU-T G.711 u-law";
                        break;
                    case 65534:
                        description = "Extensible";
                        break;
                    default:
                        description = "Unknown";
                        break;
                }
                throw new nf_1(formatError + description + " (" + audioFormat + ")");
            }

            int ch = (this.read() & 0xFF) | ((this.read() & 0xFF) << 8);
            this.channels = ch;
            if (ch != 1 && ch != 2) {
                throw new nf_1(channelsError + ch);
            }

            this.sampleRate = (this.read() & 0xFF)
                    | ((this.read() & 0xFF) << 8)
                    | ((this.read() & 0xFF) << 16)
                    | ((this.read() & 0xFF) << 24);
            this.skipBytes(6);

            int bitsPerSample = (this.read() & 0xFF) | ((this.read() & 0xFF) << 8);
            if (bitsPerSample != 16) {
                throw new nf_1(bitsError + bitsPerSample);
            }

            this.skipBytes(formatChunkSize - 16);
            this.remainingData = this.seekChunk('d', 'a', 'a');
        } catch (Throwable error) {
            KT.E1(this);
            throw new nf_1("Error reading WAV file:" + source, error);
        }
    }

    @Override
    public int read(byte[] buffer) throws IOException {
        if (this.remainingData == 0) {
            return -1;
        }

        int offset = 0;
        do {
            int count = Math.min(super.read(buffer, offset, buffer.length - offset), this.remainingData);
            if (count == -1) {
                return offset > 0 ? offset : -1;
            }
            offset += count;
            this.remainingData -= count;
        } while (offset < buffer.length);
        return offset;
    }

    public final int seekChunk(char first, char second, char third) throws IOException {
        final char fourth = 't';
        while (true) {
            boolean matches = this.read() == first;
            matches &= this.read() == second;
            matches &= this.read() == fourth;
            matches &= this.read() == third;

            int chunkSize = (this.read() & 0xFF)
                    | ((this.read() & 0xFF) << 8)
                    | ((this.read() & 0xFF) << 16)
                    | ((this.read() & 0xFF) << 24);
            if (chunkSize == -1) {
                throw new IOException("Chunk not found:" + first + second + fourth + third);
            }
            if (matches) {
                return chunkSize;
            }
            this.skipBytes(chunkSize);
        }
    }

    public final void skipBytes(int amount) throws IOException {
        while (amount > 0) {
            long skipped = this.in.skip(amount);
            if (skipped > 0L) {
                amount = (int)(amount - skipped);
            } else {
                throw new EOFException("Unable to skip.");
            }
        }
    }
}
