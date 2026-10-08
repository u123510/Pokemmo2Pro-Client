package cn.pokemmo.util.reflect;

import f.fq0_0;
import f.rx_0;
import java.io.File;
import java.lang.reflect.Field;

public class FileReflectionStringMapper implements rx_0 {
    public static final fq0_0 Fn0 = new fq0_0();

    @Override
    public Object nx0(String string, Field field, String string2, String string3) {
        return new File(string);
    }
}
