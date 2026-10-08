package f;

import cn.pokemmo.io.handle.OutputStreamFileHandle;
import java.io.OutputStream;

public final class YD extends OutputStreamFileHandle {
    public final OutputStream PD0;

    public YD(OutputStream outputStream) {
        super(outputStream);
        this.PD0 = this.outputStream;
    }
}
