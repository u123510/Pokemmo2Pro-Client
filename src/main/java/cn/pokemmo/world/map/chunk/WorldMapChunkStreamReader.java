package cn.pokemmo.world.map.chunk;

import f.*;

import java.util.HashMap;

public abstract class WorldMapChunkStreamReader {

    public static final uc_0 fC(String str, Object... objArr) {
        Throwable th = null;
        if (objArr != null && objArr.length != 0) {
            Object last = objArr[objArr.length - 1];
            if (last instanceof Throwable) {
                th = (Throwable) last;
            }
        }
        if (th != null) {
            if (objArr == null || objArr.length == 0) {
                throw new IllegalStateException("non-sensical empty or null argument array");
            }
            int newLen = objArr.length - 1;
            Object[] trimmed = new Object[newLen];
            if (newLen > 0) {
                System.arraycopy(objArr, 0, trimmed, 0, newLen);
            }
            objArr = trimmed;
        }
        if (str == null) {
            return new uc_0(null, objArr);
        }
        if (objArr == null) {
            return new uc_0(str, null);
        }
        int i2 = 0;
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i4 = 0;
        while (i4 < objArr.length) {
            int i5 = str.indexOf("{}", i2);
            if (i5 == -1) {
                if (i2 == 0) {
                    return new uc_0(str, objArr);
                }
                sb.append((CharSequence) str, i2, str.length());
                return new uc_0(sb.toString(), objArr);
            }
            if (i5 != 0 && str.charAt(i5 - 1) == '\\') {
                if (i5 >= 2 && str.charAt(i5 - 2) == '\\') {
                    sb.append((CharSequence) str, i2, i5 - 1);
                    XT(sb, objArr[i4], new HashMap());
                    i2 = i5 + 2;
                } else {
                    i4--;
                    sb.append((CharSequence) str, i2, i5 - 1);
                    sb.append('{');
                    i2 = i5 + 1;
                }
            } else {
                sb.append((CharSequence) str, i2, i5);
                XT(sb, objArr[i4], new HashMap());
                i2 = i5 + 2;
            }
            i4++;
        }
        sb.append((CharSequence) str, i2, str.length());
        return new uc_0(sb.toString(), objArr);
    }

    public static void XT(StringBuilder sb, Object obj, HashMap map) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            try {
                sb.append(obj.toString());
            } catch (Throwable th) {
                gc_1.y80("Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th);
                sb.append("[FAILED toString()]");
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] arr = (boolean[]) obj;
            sb.append('[');
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                sb.append(arr[i]);
                if (i != len - 1) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            return;
        }
        if (obj instanceof byte[]) {
            byte[] arr = (byte[]) obj;
            sb.append('[');
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                sb.append((int) arr[i]);
                if (i != len - 1) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            return;
        }
        if (obj instanceof char[]) {
            char[] arr = (char[]) obj;
            sb.append('[');
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                sb.append(arr[i]);
                if (i != len - 1) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            return;
        }
        if (obj instanceof short[]) {
            short[] arr = (short[]) obj;
            sb.append('[');
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                sb.append((int) arr[i]);
                if (i != len - 1) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            return;
        }
        if (obj instanceof int[]) {
            int[] arr = (int[]) obj;
            sb.append('[');
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                sb.append(arr[i]);
                if (i != len - 1) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            return;
        }
        if (obj instanceof long[]) {
            long[] arr = (long[]) obj;
            sb.append('[');
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                sb.append(arr[i]);
                if (i != len - 1) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            return;
        }
        if (obj instanceof float[]) {
            float[] arr = (float[]) obj;
            sb.append('[');
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                sb.append(arr[i]);
                if (i != len - 1) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            return;
        }
        if (obj instanceof double[]) {
            double[] arr = (double[]) obj;
            sb.append('[');
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                sb.append(arr[i]);
                if (i != len - 1) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            return;
        }
        Object[] arr = (Object[]) obj;
        sb.append('[');
        if (!map.containsKey(arr)) {
            map.put(arr, null);
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                XT(sb, arr[i], map);
                if (i != len - 1) {
                    sb.append(", ");
                }
            }
            map.remove(arr);
        } else {
            sb.append("...");
        }
        sb.append(']');
    }
}
