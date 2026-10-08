package cn.pokemmo.io.resolver;

import f.Dn0;
import f.c80_0;
import f.gq_1;
import java.util.zip.ZipFile;

public class ZipFileHandleResolver implements FileHandleResolver, gq_1 {
    public final ZipFile zipFile;

    public ZipFileHandleResolver(ZipFile zipFile) {
        this.zipFile = zipFile;
    }

    @Override
    public Dn0 bC0(String path) {
        return new c80_0(this.zipFile, path);
    }
}
