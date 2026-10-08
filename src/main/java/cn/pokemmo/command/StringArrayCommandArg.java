package cn.pokemmo.command;

import f.*;
import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayCommandArg extends KZ {
    public final String[] iX;
    public final boolean Ar0;

    public StringArrayCommandArg(ArrayList<String> values) {
        super(0);
        this.iX = values.toArray(new String[0]);
        this.Ar0 = true;
    }

    public StringArrayCommandArg(int length, boolean caseInsensitive, String... values) {
        super(length);
        this.iX = values.clone();
        this.Ar0 = caseInsensitive;
    }

    public static String[] BT(int length) {
        return new String[length];
    }

    public static boolean Q20(String prefix, String value) {
        return value.startsWith(prefix);
    }

    public static String[] u10(int length) {
        return new String[length];
    }

    public static boolean rl0(String prefix, String value) {
        return value.toLowerCase().startsWith(prefix.toLowerCase());
    }

    public final gj_2 Gq(String prefix) {
        if (this.V4 >= prefix.length()) {
            return null;
        }
        String[] filtered;
        if (this.Ar0) {
            filtered = Arrays.stream(this.iX).filter(value -> rl0(prefix, value)).toArray(String[]::new);
        } else {
            filtered = Arrays.stream(this.iX).filter(value -> Q20(prefix, value)).toArray(String[]::new);
        }
        return new gj_2(prefix.length(), this.Ar0, filtered);
    }
}
