package cn.pokemmo.commons.collections.trove;

import f.*;


public abstract class TroveConstants {
    public static final byte Qz;
    public static final short TI0;
    public static final int Lo0;
    public static final long Ug;
    public static final double GN;

    static {
        boolean verbose = System.getProperty("gnu.trove.verbose", null) != null;

        String byteVal = System.getProperty("gnu.trove.no_entry.byte", "0");
        int b;
        if ("MAX_VALUE".equalsIgnoreCase(byteVal)) {
            b = 127;
        } else if ("MIN_VALUE".equalsIgnoreCase(byteVal)) {
            b = -128;
        } else {
            b = Byte.valueOf(byteVal).byteValue();
        }
        if (b > 127) {
            b = 127;
        } else if (b < -128) {
            b = -128;
        }
        Qz = (byte) b;
        if (verbose) {
            System.out.println("DEFAULT_BYTE_NO_ENTRY_VALUE: " + b);
        }

        String shortVal = System.getProperty("gnu.trove.no_entry.short", "0");
        int s;
        if ("MAX_VALUE".equalsIgnoreCase(shortVal)) {
            s = 32767;
        } else if ("MIN_VALUE".equalsIgnoreCase(shortVal)) {
            s = -32768;
        } else {
            s = Short.valueOf(shortVal).shortValue();
        }
        if (s > 32767) {
            s = 32767;
        } else if (s < -32768) {
            s = -32768;
        }
        TI0 = (short) s;
        if (verbose) {
            System.out.println("DEFAULT_SHORT_NO_ENTRY_VALUE: " + s);
        }

        String charVal = System.getProperty("gnu.trove.no_entry.char", "\u0000");
        int c;
        if ("MAX_VALUE".equalsIgnoreCase(charVal)) {
            c = 65535;
        } else if ("MIN_VALUE".equalsIgnoreCase(charVal)) {
            c = 0;
        } else {
            c = charVal.toCharArray()[0];
        }
        if (c > 65535) {
            c = 65535;
        } else if (c < 0) {
            c = 0;
        }
        if (verbose) {
            System.out.println("DEFAULT_CHAR_NO_ENTRY_VALUE: " + Integer.valueOf(c));
        }

        String intVal = System.getProperty("gnu.trove.no_entry.int", "0");
        int i;
        if ("MAX_VALUE".equalsIgnoreCase(intVal)) {
            i = Integer.MAX_VALUE;
        } else if ("MIN_VALUE".equalsIgnoreCase(intVal)) {
            i = Integer.MIN_VALUE;
        } else {
            i = Integer.valueOf(intVal).intValue();
        }
        Lo0 = i;
        if (verbose) {
            System.out.println("DEFAULT_INT_NO_ENTRY_VALUE: " + i);
        }

        String longVal = System.getProperty("gnu.trove.no_entry.long", "0");
        long l;
        if ("MAX_VALUE".equalsIgnoreCase(longVal)) {
            l = Long.MAX_VALUE;
        } else if ("MIN_VALUE".equalsIgnoreCase(longVal)) {
            l = Long.MIN_VALUE;
        } else {
            l = Long.valueOf(longVal).longValue();
        }
        Ug = l;
        if (verbose) {
            System.out.println("DEFAULT_LONG_NO_ENTRY_VALUE: " + l);
        }

        String floatVal = System.getProperty("gnu.trove.no_entry.float", "0");
        float f;
        if ("MAX_VALUE".equalsIgnoreCase(floatVal)) {
            f = Float.MAX_VALUE;
        } else if ("MIN_VALUE".equalsIgnoreCase(floatVal)) {
            f = Float.MIN_VALUE;
        } else if ("MIN_NORMAL".equalsIgnoreCase(floatVal)) {
            f = Float.MIN_NORMAL;
        } else if ("NEGATIVE_INFINITY".equalsIgnoreCase(floatVal)) {
            f = Float.NEGATIVE_INFINITY;
        } else if ("POSITIVE_INFINITY".equalsIgnoreCase(floatVal)) {
            f = Float.POSITIVE_INFINITY;
        } else {
            f = Float.valueOf(floatVal).floatValue();
        }
        if (verbose) {
            System.out.println("DEFAULT_FLOAT_NO_ENTRY_VALUE: " + f);
        }

        String doubleVal = System.getProperty("gnu.trove.no_entry.double", "0");
        double d;
        if ("MAX_VALUE".equalsIgnoreCase(doubleVal)) {
            d = Double.MAX_VALUE;
        } else if ("MIN_VALUE".equalsIgnoreCase(doubleVal)) {
            d = Double.MIN_VALUE;
        } else if ("MIN_NORMAL".equalsIgnoreCase(doubleVal)) {
            d = Double.MIN_NORMAL;
        } else if ("NEGATIVE_INFINITY".equalsIgnoreCase(doubleVal)) {
            d = Double.NEGATIVE_INFINITY;
        } else if ("POSITIVE_INFINITY".equalsIgnoreCase(doubleVal)) {
            d = Double.POSITIVE_INFINITY;
        } else {
            d = Double.valueOf(doubleVal).doubleValue();
        }
        GN = d;
        if (verbose) {
            System.out.println("DEFAULT_DOUBLE_NO_ENTRY_VALUE: " + d);
        }
    }
}
