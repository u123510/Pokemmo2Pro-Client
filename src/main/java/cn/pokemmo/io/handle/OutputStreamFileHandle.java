package cn.pokemmo.io.handle;

import f.Dn0;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamFileHandle extends Dn0 {
    public final OutputStream outputStream;

    public OutputStreamFileHandle(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public InputStream uf0() {
        throw new RuntimeException("Unsupported");
    }

    @Override
    public BufferedInputStream LpT7(int n) {
        throw new RuntimeException("Unsupported");
    }

    @Override
    public byte[] kI0() {
        throw new RuntimeException("Unsupported");
    }

    @Override
    public void yM(byte[] byArray, int n) {
        throw new RuntimeException("Unsupported");
    }

    @Override
    public OutputStream OC0() {
        return this.outputStream;
    }
}
