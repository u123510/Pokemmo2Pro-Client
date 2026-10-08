package cn.pokemmo.system;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import f.hg_1;
import f.hu_1;
import java.util.concurrent.atomic.AtomicInteger;

public class NativeReferenceReaperThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                hg_1 reference = (hg_1) hu_1.PS.remove();
                if (!hu_1.hM.remove(reference)) {
                    System.err.println("Reference holder did not contained released StructRef.");
                }
                Long key = Long.valueOf(reference.FU);
                AtomicInteger count = (AtomicInteger) hu_1.XF0.get(key);
                if (count.decrementAndGet() <= 0) {
                    hu_1.XF0.remove(key);
                    CHandler.free(reference.FU);
                }
            } catch (InterruptedException error) {
                error.printStackTrace();
            }
        }
    }
}
