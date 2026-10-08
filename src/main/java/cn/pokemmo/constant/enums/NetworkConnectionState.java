package cn.pokemmo.constant.enums;

import f.*;

import java.util.regex.Pattern;

public enum NetworkConnectionState {
    Ed,
    EE,
    u80;

    public static final Pattern We0;
    public static final Pattern Bf;
    public static final Pattern dw;

    static {
        We0 = Pattern.compile("^[a-zA-Z_$][a-zA-Z_$0-9]*$");
        Bf = Pattern.compile("^[^\":,}/ ][^:]*$");
        dw = Pattern.compile("^[^\":,{\\[\\]/ ][^}\\],]*$");
    }

    public final String Gx(Object obj) {
        if (obj == null) {
            return "null";
        }
        String str = obj.toString();
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            return str;
        }
        b3_0 b3_0Var = new b3_0(str);
        b3_0Var.u("\\\\", '\\').u("\\r", '\r').u("\\n", '\n').u("\\t", '\t');
        if (this == u80 && !str.equals("true") && !str.equals("false") && !str.equals("null")
                && !str.contains("//") && !str.contains("/*")
                && b3_0Var.hp0 > 0 && b3_0Var.charAt(b3_0Var.hp0 - 1) != ' '
                && dw.matcher(b3_0Var).matches()) {
            return b3_0Var.toString();
        }
        return "\"" + b3_0Var.u("\\\"", '"').toString() + "\"";
    }

    public final String zn(String str) {
        b3_0 b3_0Var = new b3_0(str);
        b3_0Var.u("\\\\", '\\').u("\\r", '\r').u("\\n", '\n').u("\\t", '\t');
        switch (this) {
            case u80:
                if (!str.contains("//") && !str.contains("/*") && Bf.matcher(b3_0Var).matches()) {
                    return b3_0Var.toString();
                }
            case EE:
                if (We0.matcher(b3_0Var).matches()) {
                    return b3_0Var.toString();
                }
            default:
                return "\"" + b3_0Var.u("\\\"", '"').toString() + "\"";
        }
    }

    public f.sg_1 toLegacy() {
        return f.sg_1.valueOf(name());
    }
}