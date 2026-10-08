package cn.pokemmo.util.concurrent;

import f.*;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class StateSnapshotCallable implements Callable {
    public final sn_1 lP;

    public StateSnapshotCallable(sn_1 state) {
        this.lP = state;
    }

    @Override
    public final Object call() {
        sn_1 state = this.lP;
        if (state.XJ) {
            return null;
        }

        N00 loader = (N00) state.n;
        if (!state.cJ0) {
            cr_2 descriptor = state.t0;
            String fileName = descriptor.RH0;
            u6_0 resolver = state.n;
            if (descriptor.Ju == null) {
                descriptor.Ju = resolver.resolve(fileName);
            }

            state.q4 = loader.getDependencies(fileName, descriptor.Ju, state.t0.coM1);
            if (state.q4 != null) {
                sn_1.V20(state.q4);
                hd0_2 manager = state.ko;
                String parentName = state.t0.RH0;
                es_1 dependencies = state.q4;
                synchronized (manager) {
                    af_1 registeredNames = manager.wn;
                    I2 iterator = dependencies.ZD();
                    while (iterator.hasNext()) {
                        cr_2 dependency = (cr_2) iterator.next();
                        if (registeredNames.lpT8(dependency.RH0) < 0) {
                            registeredNames.MG0(dependency.RH0);
                            manager.hs0(parentName, dependency);
                        }
                    }

                    int capacity = af_1.NK(32, registeredNames.gr);
                    Object[] table = registeredNames.if$;
                    if (table.length <= capacity) {
                        if (registeredNames.g1 != 0) {
                            registeredNames.g1 = 0;
                            Arrays.fill(table, null);
                        }
                    } else {
                        registeredNames.g1 = 0;
                        registeredNames.aO(capacity);
                    }
                }
                return null;
            }
        }

        hd0_2 manager = state.ko;
        cr_2 descriptor = state.t0;
        String fileName = descriptor.RH0;
        u6_0 resolver = state.n;
        if (descriptor.Ju == null) {
            descriptor.Ju = resolver.resolve(fileName);
        }
        loader.loadAsync(manager, fileName, descriptor.Ju, state.t0.coM1);
        state.Pb = true;
        return null;
    }
}
