package cn.pokemmo.io.zip;

import f.*;
import cn.pokemmo.io.resolver.CompositeFileHandleResolver;
import cn.pokemmo.io.resolver.FileHandleResolver;
import cn.pokemmo.io.resolver.PrefixFileHandleResolver;
import cn.pokemmo.io.resolver.ZipFileHandleResolver;
import java.io.IOException;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public abstract class ZipArchiveExtractor {
    public static final dl_1 LOGGER;
    public static final gq_1 RESOLVER;

    public static Dn0 getTwlFragmentShader() {
        return RESOLVER.bC0("twl.fragment.glsl");
    }

    static {
        LOGGER = Cq0.E1(ZipArchiveExtractor.class);
        PrefixFileHandleResolver directory = new PrefixFileHandleResolver("data/shaders/");
        gq_1 loader = directory;
        if (!tw0_0.Xy0()) {
            try {
                lg_0.I70.getClass();
                VE archive = new VE("data/shaders.pak", zv_1.tt0);
                if (archive.os0()) {
                    ZipFile zip = new ZipFile(archive.l00());
                    loader = new CompositeFileHandleResolver(directory, new ZipFileHandleResolver(zip));
                }
            } catch (ZipException error) {
                LOGGER.error("Error loading shader data.", error);
                throw new nf_1("Error loading shader data.");
            } catch (IOException error) {
                LOGGER.error("Error loading shader data.", error);
                throw new nf_1("Error loading shader data.");
            }
        }
        RESOLVER = loader;
    }
}
