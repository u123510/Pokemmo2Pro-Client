package f.discord;

/**
 * Renamed from f.dQ (DiscordBuild implementation)
 */
public abstract class dQ {
    public static String aE(int n) {
        switch (n) {
            default: {
                throw null;
            }
            case 4: {
                return null;
            }
            case 3: {
                return "//discordapp.com/api";
            }
            case 2: {
                return "//ptb.discordapp.com/api";
            }
            case 1: 
        }
        return "//canary.discordapp.com/api";
    }

    public static String ES(int n) {
        switch (n) {
            default: {
                throw null;
            }
            case 4: {
                return "ANY";
            }
            case 3: {
                return "STABLE";
            }
            case 2: {
                return "PTB";
            }
            case 1: 
        }
        return "CANARY";
    }
}
