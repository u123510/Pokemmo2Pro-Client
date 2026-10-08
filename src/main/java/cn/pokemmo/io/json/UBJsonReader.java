package cn.pokemmo.io.json;

import f.*;
import cn.pokemmo.io.json.JsonElementParser;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class UBJsonReader implements JsonElementParser {
    public boolean TV = true;

    public static String R9(DataInputStream input, boolean acceptNumericLength, byte tag) {
        long length = -1L;
        if (tag == 'S') {
            length = qg(input, readByte(input), true);
        } else if (tag == 's') {
            length = readByte(input) & 0xFF;
        } else if (acceptNumericLength) {
            length = qg(input, tag, false);
        }
        if (length < 0L) {
            throw new nf_1("Unrecognized data type, string expected");
        }
        if (length == 0L) {
            return "";
        }
        byte[] content = new byte[(int) length];
        readFully(input, content);
        return new String(content, StandardCharsets.UTF_8);
    }

    public static long qg(DataInputStream input, byte tag, boolean fourByteFallback) {
        if (tag == 'i') {
            return readByte(input) & 0xFF;
        }
        if (tag == 'I') {
            return readShort(input) & 0xFFFF;
        }
        if (tag == 'l') {
            return readInt(input);
        }
        if (tag == 'L') {
            return readLong(input);
        }
        if (fourByteFallback) {
            return (long) (tag & 0xFF) << 24
                    | (long) (readByte(input) & 0xFF) << 16
                    | (long) (readByte(input) & 0xFF) << 8
                    | (long) (readByte(input) & 0xFF);
        }
        return -1L;
    }

    @Override
    public final oe_0 Zk0(Dn0 file) {
        DataInputStream input = null;
        try {
            input = new DataInputStream(file.LpT7(8192));
            return this.EJ(input, readByte(input));
        } catch (Exception exception) {
            throw new WC0("Error parsing file: " + file, exception);
        } finally {
            // The original bytecode closes this wrapper twice; KT.E1 makes both calls idempotent.
            KT.E1(input);
            KT.E1(input);
        }
    }

    public final oe_0 EJ(DataInputStream input, byte tag) {
        if (tag == '[') {
            oe_0 array = new oe_0(lpt3__3.cL);
            byte elementTag = readByte(input);
            byte fixedTag = 0;
            if (elementTag == '$') {
                fixedTag = readByte(input);
                elementTag = readByte(input);
            }

            long expectedCount = -1L;
            if (elementTag == '#') {
                elementTag = 0;
                expectedCount = qg(input, readByte(input), false);
                if (expectedCount < 0L) {
                    throw new nf_1("Unrecognized data type");
                }
                if (expectedCount == 0L) {
                    return array;
                }
                elementTag = fixedTag == 0 ? readByte(input) : fixedTag;
            }

            oe_0 previous = null;
            long count = 0L;
            while (available(input) > 0 && elementTag != ']') {
                oe_0 child = this.EJ(input, elementTag);
                child.y8 = array;
                if (previous != null) {
                    child.cA = previous;
                    previous.Uu = child;
                    ++array.lpt3;
                } else {
                    array.dz0 = child;
                    array.lpt3 = 1;
                }
                if (expectedCount > 0L && ++count >= expectedCount) {
                    break;
                }
                elementTag = fixedTag == 0 ? readByte(input) : fixedTag;
                previous = child;
            }
            return array;
        }

        if (tag == '{') {
            oe_0 object = new oe_0(lpt3__3.NR);
            byte keyTag = readByte(input);
            byte fixedValueTag = 0;
            if (keyTag == '$') {
                fixedValueTag = readByte(input);
                keyTag = readByte(input);
            }

            long expectedCount = -1L;
            if (keyTag == '#') {
                keyTag = 0;
                expectedCount = qg(input, readByte(input), false);
                if (expectedCount < 0L) {
                    throw new nf_1("Unrecognized data type");
                }
                if (expectedCount == 0L) {
                    return object;
                }
                keyTag = readByte(input);
            }

            oe_0 previous = null;
            long count = 0L;
            while (available(input) > 0 && keyTag != '}') {
                String key = R9(input, true, keyTag);
                byte valueTag = fixedValueTag == 0 ? readByte(input) : fixedValueTag;
                oe_0 child = this.EJ(input, valueTag);
                child.Z3 = key;
                child.y8 = object;
                if (previous != null) {
                    child.cA = previous;
                    previous.Uu = child;
                    ++object.lpt3;
                } else {
                    object.dz0 = child;
                    object.lpt3 = 1;
                }
                if (expectedCount > 0L && ++count >= expectedCount) {
                    break;
                }
                keyTag = readByte(input);
                previous = child;
            }
            return object;
        }

        if (tag == 'Z') {
            return new oe_0(lpt3__3.E80);
        }
        if (tag == 'T') {
            return new oe_0(true);
        }
        if (tag == 'F') {
            return new oe_0(false);
        }
        if (tag == 'B' || tag == 'U') {
            return new oe_0((long) (readByte(input) & 0xFF));
        }
        if (tag == 'i') {
            return new oe_0(this.TV ? (long) readShort(input) : (long) readByte(input));
        }
        if (tag == 'I') {
            return new oe_0(this.TV ? (long) readInt(input) : (long) readShort(input));
        }
        if (tag == 'l') {
            return new oe_0((long) readInt(input));
        }
        if (tag == 'L') {
            return new oe_0(readLong(input));
        }
        if (tag == 'd') {
            return new oe_0((double) readFloat(input));
        }
        if (tag == 'D') {
            return new oe_0(readDouble(input));
        }
        if (tag == 's' || tag == 'S') {
            return new oe_0(R9(input, false, tag));
        }
        if (tag == 'C') {
            return new oe_0((long) readChar(input));
        }
        if (tag != 'a' && tag != 'A') {
            throw new nf_1("Unrecognized data type");
        }

        byte elementTag = readByte(input);
        long length = tag == 'A' ? readInt(input) : readByte(input) & 0xFF;
        oe_0 array = new oe_0(lpt3__3.cL);
        oe_0 previous = null;
        for (long index = 0L; index < length; ++index) {
            oe_0 child = this.EJ(input, elementTag);
            child.y8 = array;
            if (previous != null) {
                previous.Uu = child;
                ++array.lpt3;
            } else {
                array.dz0 = child;
                array.lpt3 = 1;
            }
            previous = child;
        }
        return array;
    }

    private static byte readByte(DataInputStream input) {
        try {
            return input.readByte();
        } catch (IOException exception) {
            sneakyThrow(exception);
            return 0;
        }
    }

    private static short readShort(DataInputStream input) {
        try {
            return input.readShort();
        } catch (IOException exception) {
            sneakyThrow(exception);
            return 0;
        }
    }

    private static int readInt(DataInputStream input) {
        try {
            return input.readInt();
        } catch (IOException exception) {
            sneakyThrow(exception);
            return 0;
        }
    }

    private static long readLong(DataInputStream input) {
        try {
            return input.readLong();
        } catch (IOException exception) {
            sneakyThrow(exception);
            return 0L;
        }
    }

    private static float readFloat(DataInputStream input) {
        try {
            return input.readFloat();
        } catch (IOException exception) {
            sneakyThrow(exception);
            return 0.0f;
        }
    }

    private static double readDouble(DataInputStream input) {
        try {
            return input.readDouble();
        } catch (IOException exception) {
            sneakyThrow(exception);
            return 0.0;
        }
    }

    private static char readChar(DataInputStream input) {
        try {
            return input.readChar();
        } catch (IOException exception) {
            sneakyThrow(exception);
            return 0;
        }
    }

    private static int available(DataInputStream input) {
        try {
            return input.available();
        } catch (IOException exception) {
            sneakyThrow(exception);
            return 0;
        }
    }

    private static void readFully(DataInputStream input, byte[] content) {
        try {
            input.readFully(content);
        } catch (IOException exception) {
            sneakyThrow(exception);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
