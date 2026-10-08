package cn.pokemmo.util.concurrent;

import f.*;

import java.util.Arrays;
import java.util.Set;

public abstract class DefaultUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    public static final dl_1 am0 = Cq0.E1(di_2.class);

    public DefaultUncaughtExceptionHandler() {
    }

    public static void rH(Dn0 v0) {
        v0.sf();
        System.exit(1);
    }

    public static void A60(Dn0 v0) {
        jn_0 jn = tw0_0.LD0;
        if (jn != null) {
            jn.I30 = true;
        }
        Bw0.Sx0(v0, true);
    }

    public static void hX() {
        System.exit(1);
    }

    public static void op() {
        System.exit(1);
    }

    @Override
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th instanceof nf_1) {
            if (E((nf_1) th)) {
                return;
            }
            if (th.getCause() != null) {
                th = th.getCause();
            }
        }
        Throwable t = th;
        while (t != null) {
            if (DH0.class.isInstance(t)) {
                break;
            }
            t = t.getCause();
        }
        if (t != null) {
            Throwable ule = th;
            while (ule != null) {
                if (UnsatisfiedLinkError.class.isInstance(ule)) {
                    break;
                }
                ule = ule.getCause();
            }
            UnsatisfiedLinkError err = (UnsatisfiedLinkError) ule;
            if (err != null && err.getMessage().contains("GLIBC") && err.getMessage().contains("not found")) {
                tw0_0.uV.Ef0("Error", sm0_0.c0(nf0_0.oc), UE.iC, di_2::op, false);
                return;
            }
        }
        if (xs_0.bj0) {
            am0.error("Fatal render error (Secondary).", th);
            return;
        }
        xs_0.bj0 = true;
        if (th instanceof OutOfMemoryError || (th instanceof nf_1 && Iu0.C80((nf_1) th))) {
            Runtime rt = Runtime.getRuntime();
            long usedMb = (rt.totalMemory() - rt.freeMemory()) / 1048576L;
            long maxMb = rt.maxMemory() / 1048576L;
            am0.error("Fatal out of memory error.", th);
            tw0_0.uV.Ef0("Error", sm0_0.c0(nf0_0.cs0) + "\nMemory Info: " + usedMb + " / " + maxMb + " MB", UE.iC, di_2::hX, false);
            return;
        }
        dl_1 logger = am0;
        logger.error("State: Ingame {}", Boolean.valueOf(tw0_0.rl != null));
        logger.error("State: Has World {}", Boolean.valueOf(tw0_0.e60 != null));
        logger.error("State: Has Battle {}", Boolean.valueOf(tw0_0.PK0 != null));
        yt_1 yt = tw0_0.e60;
        if (yt != null) {
            logger.error("State: Region {}", Byte.valueOf(yt.Com4));
            logger.error("State: Id {}", tw0_0.e60.dj0);
            _else worldMap = tw0_0.e60.N60();
            E90 player = tw0_0.e60.jB0;
            logger.error("State: Has Active Player {}", Boolean.valueOf(player != null));
            if (player != null) {
                logger.error("State: World Position {}", player.ba0.Qs0());
            }
            logger.error("State: Has WorldMap {}", Boolean.valueOf(worldMap != null));
            if (worldMap != null) {
                logger.error("State: WorldMap Id {}", Short.valueOf(J4.p5(worldMap.Bm0, worldMap.case$)));
                logger.error("State: WorldMap EventMap {}", Boolean.valueOf(worldMap.Km()));
            }
        }
        String[] libArray;
        try {
            Set set = (Set) sk0_0.aA0.get(ClassLoader.getSystemClassLoader());
            libArray = (String[]) set.toArray(new String[0]);
        } catch (Exception e) {
            libArray = new String[]{"ERROR"};
        }
        logger.info("Loaded libraries: {}", Arrays.asList(libArray));
        am0.error("Fatal render error.", th);
        if (lpt3__1.u8) {
            VE ve = Bw0.Cp(th);
            tw0_0.uV.Qu(sm0_0.c0(nf0_0.go), sm0_0.c0(nf0_0.i3), UE.iC, () -> A60(ve), () -> rH(ve), true);
        }
    }

    public abstract boolean E(nf_1 v1);
}
