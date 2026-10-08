package cn.pokemmo.battle;

import f.*;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * 现代化重构类 - 原始混淆类: f.V60
 */
public class Modern_Battle_V60
extends ZI0 {

    public Modern_Battle_V60() {
        super();
    }

    public void YN(BufferedReader bufferedReader) {
        try {
            this.L9 = !this.jH0
                ? Boolean.parseBoolean(No.xF(bufferedReader, "active"))
                : true;
            if (!this.L9) {
                return;
            }
            Float.parseFloat(No.xF(bufferedReader, "lowMin"));
            Float.parseFloat(No.xF(bufferedReader, "lowMax"));
        } catch (IOException exception) {
            throw Modern_Battle_V60.sneakyThrow(exception);
        }
    }

    public final void Q2(V60 v60) {
        this.L9 = v60.L9;
        this.jH0 = v60.jH0;
    }

    private static <T extends Throwable> T sneakyThrow(Throwable exception) throws T {
        throw (T) exception;
    }
}


