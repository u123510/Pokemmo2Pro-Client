package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.WC0
 */
public class Modern_Util_WC0 extends RuntimeException {

    public b3_0 return$;

    public Modern_Util_WC0() {
        super();
    }

    public Modern_Util_WC0(String message, Throwable cause) {
        super(message, cause);
    }

    public Modern_Util_WC0(String message) {
        super(message);
    }

    public Modern_Util_WC0(Throwable cause) {
        super("", cause);
    }

    @Override
    public final String getMessage() {
        if (this.return$ == null) {
            return super.getMessage();
        }

        b3_0 builder = new b3_0(512);
        builder.sV(super.getMessage());
        if (builder.hp0 > 0) {
            builder.GC0('\n');
        }
        builder.sV("Serialization trace:");
        if (this.return$ == null) {
            builder.w7();
        } else {
            builder.so(this.return$.ZB, 0, this.return$.hp0);
        }
        return builder.toString();
    }

    public final void bw(String info) {
        if (info == null) {
            throw new IllegalArgumentException("info cannot be null.");
        }
        if (this.return$ == null) {
            this.return$ = new b3_0(512);
        }
        this.return$.GC0('\n');
        this.return$.sV(info);
    }
}

