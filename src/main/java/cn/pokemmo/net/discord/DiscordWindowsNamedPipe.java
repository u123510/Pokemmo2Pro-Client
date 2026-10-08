package cn.pokemmo.net.discord;

import f.Cq0;
import f.J90;
import f.dl_1;
import f.discord.Ho0;
import f.discord.rr0_0;
import f.discord.vs_0;
import f.org.json.A70;
import f.org.json.N7;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.util.HashMap;

public class DiscordWindowsNamedPipe extends vs_0 {
    public static final dl_1 VQ;
    public final RandomAccessFile DG;

    public DiscordWindowsNamedPipe(rr0_0 source, HashMap map, String path) {
        super(source, map);
        try {
            this.DG = new RandomAccessFile(path, "rw");
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }
    }

    static {
        VQ = Cq0.E1(DiscordWindowsNamedPipe.class);
    }

    @Override
    public Ho0 ZC() {
        for (;;) {
            try {
                if (this.DG.length() != 0L || this.DE != 3) {
                    break;
                }
                Thread.sleep(50L);
            } catch (InterruptedException ignored) {
            } catch (IOException exception) {
                throw DiscordWindowsNamedPipe.<RuntimeException>sneaky(exception);
            }
        }
        try {
            int state = this.DE;
            if (state == 5) {
                throw DiscordWindowsNamedPipe.<RuntimeException>sneaky(new IOException("Disconnected!"));
            }
            if (state == 4) {
                return new Ho0(3, null);
            }
            int type = J90.uY(5)[Integer.reverseBytes(this.DG.readInt())];
            byte[] data = new byte[Integer.reverseBytes(this.DG.readInt())];
            this.DG.readFully(data);
            String payload = new String(data);
            Ho0 packet = new Ho0(type, new N7(new A70(new StringReader(payload))));
            VQ.getClass();
            String.format("Received packet: %s", packet.toString());
            return packet;
        } catch (IOException exception) {
            throw DiscordWindowsNamedPipe.<RuntimeException>sneaky(exception);
        }
    }

    private static <T extends Throwable> T sneaky(Throwable exception) throws T {
        throw (T)exception;
    }
}
