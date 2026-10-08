package f.discord;

import f.Cq0;
import f.org.json.N7;
import f.dl_1;
import f.yr_1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.UUID;

/**
 * Renamed from f.vs_0 (Pipe implementation)
 */
public abstract class vs_0 {
    public static final dl_1 GR;
    public static final String[] ve;
    public int DE;
    public int qc0;

    static {
        GR = Cq0.E1(vs_0.class);
        ve = new String[]{"XDG_RUNTIME_DIR", "TMPDIR", "TMP", "TEMP"};
    }

    public vs_0(rr0_0 rr0_02, HashMap hashMap) {
        this.DE = 2;
    }

    public static k8_0 il0(rr0_0 rr0_02, HashMap hashMap, String str) {
        String str2 = System.getProperty("os.name").toLowerCase();
        if (str2.contains("win")) {
            return new k8_0(rr0_02, hashMap, str);
        }
        throw new RuntimeException("Unsupported OS: ".concat(str2));
    }

    public static String pA(int i) {
        if (System.getProperty("os.name").contains("Win")) {
            return yr_1.pG("\\\\?\\pipe\\discord-ipc-", i);
        }
        String str = null;
        for (String s : ve) {
            str = System.getenv(s);
            if (str != null) {
                break;
            }
        }
        if (str == null) {
            str = "/tmp";
        }
        return str + "/discord-ipc-" + i;
    }

    public void Rb0(int i1, N7 n7) {
        try {
            if (i1 == 0) {
                throw null;
            }
            n7 = n7.D50(UUID.randomUUID().toString(), "nonce");
            byte[] arrby = n7.toString().getBytes();
            ByteBuffer byteBuffer = ByteBuffer.allocate(arrby.length + 8);
            byteBuffer.putInt(Integer.reverseBytes(i1 - 1));
            byteBuffer.putInt(Integer.reverseBytes(arrby.length));
            byteBuffer.put(arrby);
            byte[] arrby2 = byteBuffer.array();
            ((k8_0) this).DG.write(arrby2);
            String.format("Sent packet: %s", "Pkt:" + QH0.Qa(i1) + n7.toString()).getClass();
        } catch (IOException iOException) {
            GR.error("Encountered an IOException while sending a packet and disconnected!");
            this.DE = 5;
        }
    }

    public abstract Ho0 ZC();
}
