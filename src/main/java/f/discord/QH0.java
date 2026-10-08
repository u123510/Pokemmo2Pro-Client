package f.discord;

/**
 * Renamed from f.QH0 (Packet.OpCode implementation)
 */
public abstract class QH0 {
    public static String Qa(int n) {
        switch (n) {
            default: {
                return "null";
            }
            case 5: {
                return "PONG";
            }
            case 4: {
                return "PING";
            }
            case 3: {
                return "CLOSE";
            }
            case 2: {
                return "FRAME";
            }
            case 1: 
        }
        return "HANDSHAKE";
    }
}
