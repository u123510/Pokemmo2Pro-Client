package f.discord;

import f.org.json.N7;

/**
 * Renamed from f.Ho0 (Packet implementation)
 */
public class Ho0 {
    public final int qB;
    public final N7 Tr;

    public Ho0(int n, N7 n7) {
        this.qB = n;
        this.Tr = n7;
    }

    @Override
    public String toString() {
        return "Pkt:" + QH0.Qa(this.qB) + this.Tr.toString();
    }
}
