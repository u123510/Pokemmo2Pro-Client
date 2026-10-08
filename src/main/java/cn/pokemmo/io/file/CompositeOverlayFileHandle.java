package cn.pokemmo.io.file;

import f.*;

import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompositeOverlayFileHandle extends Dn0 {
    public static final /* synthetic */ boolean cr0 = !CompositeOverlayFileHandle.class.desiredAssertionStatus();
    public final List<Dn0> cp;

    public CompositeOverlayFileHandle(String str, List list) {
        if (!list.isEmpty()) {
            if (!cr0 && list.size() < 2) {
                throw new AssertionError();
            }
            this.Q50 = new File(str);
            this.a5 = zv_1.tt0;
            this.cp = list;
            return;
        }
        throw new nf_1("You need to pass at least one FileHandle.");
    }

    public final vs_2[] g4(Stream<Dn0[]> stream) {
        return (vs_2[]) stream.flatMap(Arrays::stream)
                .map(Dn0::o30)
                .distinct()
                .map(this::w5)
                .toArray(vs_2[]::new);
    }

    public final vs_2 w5(String str) {
        return new vs_2(
                super.wp(str).el(),
                (List) this.cp.stream().map(dn0 -> ((Dn0) dn0).wp(str)).collect(Collectors.toList())
        );
    }

    public final vs_2 R1(String str) {
        return new vs_2(
                super.wp(str).el(),
                (List) this.cp.stream().map(dn0 -> ((Dn0) dn0).wp(str)).collect(Collectors.toList())
        );
    }

    public final vs_2 UJ0(String str) {
        return new vs_2(
                super.xt(str).el(),
                (List) this.cp.stream().map(dn0 -> ((Dn0) dn0).xt(str)).collect(Collectors.toList())
        );
    }

    public final vs_2 nM() {
        return new vs_2(
                super.Br().el(),
                (List) this.cp.stream().map(Dn0::Br).collect(Collectors.toList())
        );
    }

    public final vs_2[] W0(String str) {
        return g4(this.cp.stream().map(dn0 -> ((Dn0) dn0).gH0(str)));
    }

    public final vs_2[] CQ(FilenameFilter filenameFilter) {
        return g4(this.cp.stream().map(dn0 -> ((Dn0) dn0).WM(filenameFilter)));
    }

    public final vs_2[] Au0() {
        return g4(this.cp.stream().map(Dn0::Ce0));
    }

    @Override
    public final boolean os0() {
        return this.cp.stream().anyMatch(Dn0::os0);
    }

    public final Dn0 lG0() {
        return (Dn0) this.cp.stream().filter(Dn0::os0).findFirst().orElse(null);
    }

    @Override
    public final File l00() {
        return lG0().l00();
    }

    @Override
    public final InputStream uf0() {
        return lG0().uf0();
    }

    @Override
    public final ByteBuffer zs0(FileChannel.MapMode mapMode) {
        return lG0().zs0(mapMode);
    }

    @Override
    public final boolean RL() {
        return lG0().RL();
    }

    @Override
    public final /* bridge */ /* synthetic */ Dn0 Br() {
        return nM();
    }

    @Override
    public final /* bridge */ /* synthetic */ Dn0 xt(String str) {
        return UJ0(str);
    }

    @Override
    public final /* bridge */ /* synthetic */ Dn0 wp(String str) {
        return R1(str);
    }

    @Override
    public final /* bridge */ /* synthetic */ Dn0[] gH0(String str) {
        return W0(str);
    }

    @Override
    public final /* bridge */ /* synthetic */ Dn0[] WM(FilenameFilter filenameFilter) {
        return CQ(filenameFilter);
    }

    @Override
    public final /* bridge */ /* synthetic */ Dn0[] Ce0() {
        return Au0();
    }
}
