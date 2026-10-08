package cn.pokemmo.config.client;

import f.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Properties;

public class ClientHotbarConfigRegistry {
    public static boolean s5 = false;
    public static String Ru0 = "";

    @_interface(key = "client.hotbar.item_id1", defaultValue = "0")
    public static short ER = 0;

    @_interface(key = "client.hotbar.item_id2", defaultValue = "0")
    public static short FP = 0;

    @_interface(key = "client.hotbar.item_id3", defaultValue = "0")
    public static short PG = 0;

    @_interface(key = "client.hotbar.item_id4", defaultValue = "0")
    public static short hi0 = 0;

    @_interface(key = "client.hotbar.item_id5", defaultValue = "0")
    public static short E5 = 0;

    @_interface(key = "client.hotbar.item_id6", defaultValue = "0")
    public static short jp0 = 0;

    @_interface(key = "client.hotbar.item_id7", defaultValue = "0")
    public static short bE0 = 0;

    @_interface(key = "client.hotbar.item_id8", defaultValue = "0")
    public static short T0 = 0;

    @_interface(key = "client.hotbar.item_id9", defaultValue = "0")
    public static short switch$ = 0;

    @_interface(key = "client.hotbar.item_object_id1", defaultValue = "0")
    public static long Ix = 0L;

    @_interface(key = "client.hotbar.item_object_id2", defaultValue = "0")
    public static long br0 = 0L;

    @_interface(key = "client.hotbar.item_object_id3", defaultValue = "0")
    public static long TH0 = 0L;

    @_interface(key = "client.hotbar.item_object_id4", defaultValue = "0")
    public static long o40 = 0L;

    @_interface(key = "client.hotbar.item_object_id5", defaultValue = "0")
    public static long XD0 = 0L;

    @_interface(key = "client.hotbar.item_object_id6", defaultValue = "0")
    public static long A80 = 0L;

    @_interface(key = "client.hotbar.item_object_id7", defaultValue = "0")
    public static long CY = 0L;

    @_interface(key = "client.hotbar.item_object_id8", defaultValue = "0")
    public static long wg0 = 0L;

    @_interface(key = "client.hotbar.item_object_id9", defaultValue = "0")
    public static long mI = 0L;

    @_interface(key = "client.hotbar.auto_item_ids", defaultValue = "")
    public static String Bu = "";

    @_interface(key = "client.ui.matchmaking.battle_box_history", defaultValue = "")
    public static String Da = "";

    @_interface(key = "client.ui.matchmaking.game_mode_selection_history", defaultValue = "7,0,6,0,5,0,4,0,3,0,2,1,0,0")
    public static String w00 = "";

    public static HashSet kG() {
        HashSet hashSet = new HashSet();
        try {
            for (String str : Bu.split(",")) {
                hashSet.add(Short.valueOf(Short.parseShort(str)));
            }
        } catch (Exception unused) {
        }
        return hashSet;
    }

    public static void Ig(Y60 y60) {
        if (y60 == null) {
            Da = "";
            s5 = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        byte[] bArr = y60.Ut;
        int[] iArr = y60.kQ;
        int[] iArr2 = y60.IL0;
        int length = iArr2.length;
        while (true) {
            length--;
            if (length > 0) {
                if (bArr[length] == 1) {
                    sb.append(Integer.toString(iArr[length]));
                    sb.append(",");
                    sb.append(Integer.toString(iArr2[length]));
                    sb.append(",");
                }
            } else {
                Da = sb.toString();
                s5 = true;
                return;
            }
        }
    }

    public static void pW(Y60 y60) {
        if (y60 == null) {
            w00 = "";
            s5 = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        byte[] bArr = y60.Ut;
        int[] iArr = y60.kQ;
        int[] iArr2 = y60.IL0;
        int length = iArr2.length;
        while (true) {
            length--;
            if (length > 0) {
                if (bArr[length] == 1) {
                    sb.append(Integer.toString(iArr[length]));
                    sb.append(",");
                    sb.append(Integer.toString(iArr2[length]));
                    sb.append(",");
                }
            } else {
                w00 = sb.toString();
                s5 = true;
                return;
            }
        }
    }

    public static void gt(String str) {
        if (s5 && !Ru0.isEmpty()) {
            QE();
        }
        if (!str.matches("^[a-zA-Z0-9]*$")) {
            str = "error";
        }
        String lowerCase = str.toLowerCase();
        Ru0 = lowerCase;
        try {
            lpt3__1.Q40.mkdirs();
            File file = new File(lpt3__1.Q40, lowerCase + ".properties");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(new InputStreamReader(fileInputStream));
            fileInputStream.close();
            LC.Ox(lpt2__0.class, null, new Properties[]{properties});
        } catch (Exception e) {
            lpt3__1.np0.error(xu0_0.N3("FATAL"), "Configuration for {} not found or invalid.", lowerCase, e);
        }
    }

    public static void QE() {
        s5 = false;
        if (Ru0.isEmpty()) {
            return;
        }
        s8_0.j50(new File(lpt3__1.Q40, VG.Mq(new StringBuilder(), Ru0, ".properties")).getAbsolutePath(), lpt2__0.class);
    }
}
