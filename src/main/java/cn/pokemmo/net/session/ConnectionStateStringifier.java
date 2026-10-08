package cn.pokemmo.net.session;

public abstract class ConnectionStateStringifier {
    public static String vC0(int n) {
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    return "AUTHED";
                }
                throw null;
            }
            return "CONNECTED";
        }
        return "CONNECTING";
    }
}
