package f;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * 编译器合成类 (Synthetic Switch Table) - f.p10_0
 * 由 Javac 编译 Enum Switch 语句生成的合成跳转表，保留在 f 包中供字节码与反射调用。
 */
public abstract class p10_0 {
    public static HashSet io() {
        HashSet hashSet = new HashSet();
        ProcessHandle.allProcesses()
                .filter(ProcessHandle::isAlive)
                .forEach(processHandle -> au(hashSet, processHandle));

        if (ea0_1.T9) {
            q_0.DG0(hashSet);
            q_0.SI0(hashSet);
        }

        return hashSet;
    }

    public static /* synthetic */ void au(Set set, ProcessHandle processHandle) {
        try {
            processHandle.info().command().ifPresent(string -> LPt2(set, string));
        } catch (Exception unused) {
        }
    }

    public static void LPt2(Set set, String string) {
        String name;
        if (string.indexOf('/') >= 0) {
            name = string.substring(string.lastIndexOf('/') + 1);
        } else {
            name = string;
        }

        if (name.indexOf('\\') >= 0) {
            name = name.substring(name.lastIndexOf('\\') + 1);
        }

        set.add(new P40((byte) 0, name.toLowerCase(Locale.ENGLISH), string));
    }
}
