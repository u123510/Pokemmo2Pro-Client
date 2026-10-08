package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.or_1
 */
public class Modern_Util_or_1
extends Thread {

    public Modern_Util_or_1() {
        super("SleepFixer");
    }

    @Override
    public final void run() {
        try {
            Thread.sleep(Long.MAX_VALUE);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}


