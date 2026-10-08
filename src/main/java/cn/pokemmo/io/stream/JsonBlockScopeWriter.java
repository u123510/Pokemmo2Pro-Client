package cn.pokemmo.io.stream;

import f.x9_0;
import java.io.IOException;

public class JsonBlockScopeWriter {
    public final boolean p60;
    public boolean xz;
    public final x9_0 jX;

    public JsonBlockScopeWriter(x9_0 x9_0, boolean z) {
        this.jX = x9_0;
        this.p60 = z;
        try {
            x9_0.Xi0.write(z ? '[' : '{');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
