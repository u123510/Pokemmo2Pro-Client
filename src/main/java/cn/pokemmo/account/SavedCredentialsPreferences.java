package cn.pokemmo.account;

import f.*;
import java.io.File;
import java.util.ArrayList;

public class SavedCredentialsPreferences {
    @_interface(key = "client.saved_credentials.usernames", defaultValue = "")
    public static String tf0;
    @_interface(key = "client.saved_credentials.keys", defaultValue = "")
    public static String c6;
    @_interface(key = "client.saved_credentials.lastusername", defaultValue = "")
    public static String Ga;

    public static ArrayList a() {
        ArrayList result = new ArrayList();
        String[] usernames = tf0.split(",");
        String[] keys = c6.split(",");
        for (int i = 0; i < usernames.length && i < keys.length; i++) {
            if (!usernames[i].isEmpty() && !keys[i].isEmpty()) {
                result.add(new RR(usernames[i], keys[i]));
            }
        }
        return result;
    }

    public static boolean e20(ArrayList values) {
        StringBuilder usernames = new StringBuilder();
        StringBuilder keys = new StringBuilder();
        int index = 0;
        for (Object object : values) {
            RR value = (RR) object;
            if (index > 0) {
                usernames.append(',');
                keys.append(',');
            }
            usernames.append(value.Ii0);
            keys.append(TI0.Ga(value.f0));
            index++;
        }
        tf0 = usernames.toString();
        c6 = keys.toString();
        return s8_0.j50(new File(lpt3__1.Q40, "savedcredentials.properties").getAbsolutePath(), SavedCredentialsPreferences.class);
    }
}
