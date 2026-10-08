package cn.pokemmo.net.packet;

import f.*;
import java.io.PrintStream;

/**
 * 现代化重构类 - 原始混淆类: f.od_1
 */
public abstract class Modern_Net_od_1
extends Exception {

    public final Throwable nB;

    public Modern_Net_od_1(String string, Exception exception) {
        super(string);
        this.nB = exception;
    }

    @Override
    public final void printStackTrace() {
        this.printStackTrace(System.err);
    }

    @Override
    public final void printStackTrace(PrintStream printStream) {
        Throwable throwable = this.nB;
        if (throwable == null) {
            super.printStackTrace(printStream);
        } else {
            throwable.printStackTrace();
        }
    }
}


