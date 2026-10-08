package cn.pokemmo.battle;

import f.*;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * 现代化重构类 - 原始混淆类: f.cv_1
 */
public class Modern_Battle_Cv1
extends ZI0 {

    public Modern_Battle_Cv1() {
        super();
    }

    public final void jt(BufferedReader bufferedReader) {
        try {
            this.L9 = !this.jH0
                ? Boolean.parseBoolean(No.xF(bufferedReader, "active"))
                : true;
            if (!this.L9) {
                return;
            }
            if (FY.valueOf(No.xF(bufferedReader, "shape")) == FY.Rb0) {
                Boolean.parseBoolean(No.xF(bufferedReader, "edges"));
                ke_0.valueOf(No.xF(bufferedReader, "side"));
            }
        } catch (IOException exception) {
            throw Modern_Battle_Cv1.sneakyThrow(exception);
        }
    }

    public final void I80(cv_1 cv_12) {
        this.L9 = cv_12.L9;
        this.jH0 = cv_12.jH0;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> T sneakyThrow(Throwable exception) throws T {
        throw (T) exception;
    }
}


