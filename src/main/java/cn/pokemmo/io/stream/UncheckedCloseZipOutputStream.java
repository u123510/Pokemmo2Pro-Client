package cn.pokemmo.io.stream;

import f.L1;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;

public class UncheckedCloseZipOutputStream extends ZipOutputStream {
    public UncheckedCloseZipOutputStream(FileOutputStream out) {
        super(out);
    }

    @Override
    public void close() {
        if (L1.kh0) {
            try {
                super.close();
            } catch (Exception exception) {
                UncheckedCloseZipOutputStream.<RuntimeException>throwUnchecked(exception);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static <T extends Throwable> void throwUnchecked(Throwable exception) throws T {
        throw (T) exception;
    }
}
