package cn.pokemmo.io.json;

import f.*;
import cn.pokemmo.io.json.JsonElementParser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JsonTextReader implements JsonElementParser {
    public static final byte[] Hl = {0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 1, 8, 2, 0, 7, 2, 0, 8, 2, 1, 3, 2, 1, 5};
    public static final short[] iD0 = {0, 0, 11, 13, 14, 16, 25, 31, 37, 39, 50, 57, 64, 73, 74, 83, 85, 87, 96, 98, 100, 101, 103, 105, 116, 123, 130, 141, 142, 153, 155, 157, 168, 170, 172, 174, 179, 184, 184};
    public static final char[] n0 = {13, 32, 34, 44, 47, 58, 91, 93, 123, 9, 10, 42, 47, 34, 42, 47, 13, 32, 34, 44, 47, 58, 125, 9, 10, 13, 32, 47, 58, 9, 10, 13, 32, 47, 58, 9, 10, 42, 47, 13, 32, 34, 44, 47, 58, 91, 93, 123, 9, 10, 9, 10, 13, 32, 44, 47, 125, 9, 10, 13, 32, 44, 47, 125, 13, 32, 34, 44, 47, 58, 125, 9, 10, 34, 13, 32, 34, 44, 47, 58, 125, 9, 10, 42, 47, 42, 47, 13, 32, 34, 44, 47, 58, 125, 9, 10, 42, 47, 42, 47, 34, 42, 47, 42, 47, 13, 32, 34, 44, 47, 58, 91, 93, 123, 9, 10, 9, 10, 13, 32, 44, 47, 93, 9, 10, 13, 32, 44, 47, 93, 13, 32, 34, 44, 47, 58, 91, 93, 123, 9, 10, 34, 13, 32, 34, 44, 47, 58, 91, 93, 123, 9, 10, 42, 47, 42, 47, 13, 32, 34, 44, 47, 58, 91, 93, 123, 9, 10, 42, 47, 42, 47, 42, 47, 13, 32, 47, 9, 10, 13, 32, 47, 9, 10, 0};
    public static final byte[] i60 = {0, 9, 2, 1, 2, 7, 4, 4, 2, 9, 7, 7, 7, 1, 7, 2, 2, 7, 2, 2, 1, 2, 2, 9, 7, 7, 9, 1, 9, 2, 2, 9, 2, 2, 2, 3, 3, 0, 0};
    public static final byte[] ur0 = {0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0};
    public static final short[] Rl = {0, 0, 11, 14, 16, 19, 28, 34, 40, 43, 54, 62, 70, 79, 81, 90, 93, 96, 105, 108, 111, 113, 116, 119, 130, 138, 146, 157, 159, 170, 173, 176, 187, 190, 193, 196, 201, 206, 207};
    public static final byte[] Uz = Ao();
    public static final byte[] Lk0 = {35, 1, 3, 0, 4, 36, 36, 36, 36, 1, 6, 5, 13, 17, 22, 37, 7, 8, 9, 7, 8, 9, 7, 10, 20, 21, 11, 11, 11, 12, 17, 19, 37, 11, 12, 19, 14, 16, 15, 14, 12, 18, 17, 11, 9, 5, 24, 23, 27, 31, 34, 25, 38, 25, 25, 26, 31, 33, 38, 25, 26, 33, 28, 30, 29, 28, 26, 32, 31, 25, 23, 2, 36, 2};
    public static final byte[] eK = Gz();
    public static final byte[] Vv0 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
    public final es_1 IK0;
    public final es_1 F9;
    public oe_0 e40;
    public oe_0 M2;

    public JsonTextReader() {
        IK0 = new es_1(8);
        F9 = new es_1(8);
    }

    public static byte[] Ao() {
        return new byte[]{1, 1, 2, 3, 4, 3, 5, 3, 6, 1, 0, 7, 7, 3, 8, 3, 9, 9, 3, 11, 11, 12, 13, 14, 3, 15, 11, 10, 16, 16, 17, 18, 16, 3, 19, 19, 20, 21, 19, 3, 22, 22, 3, 21, 21, 24, 3, 25, 3, 26, 3, 27, 21, 23, 28, 29, 29, 28, 30, 31, 32, 3, 33, 34, 34, 33, 13, 35, 15, 3, 34, 34, 12, 36, 37, 3, 15, 34, 10, 16, 3, 36, 36, 12, 3, 38, 3, 3, 36, 10, 39, 39, 3, 40, 40, 3, 13, 13, 12, 3, 41, 3, 15, 13, 10, 42, 42, 3, 43, 43, 3, 28, 3, 44, 44, 3, 45, 45, 3, 47, 47, 48, 49, 50, 3, 51, 52, 53, 47, 46, 54, 55, 55, 54, 56, 57, 58, 3, 59, 60, 60, 59, 49, 61, 52, 3, 60, 60, 48, 62, 63, 3, 51, 52, 53, 60, 46, 54, 3, 62, 62, 48, 3, 64, 3, 51, 3, 53, 62, 46, 65, 65, 3, 66, 66, 3, 49, 49, 48, 3, 67, 3, 51, 52, 53, 49, 46, 68, 68, 3, 69, 69, 3, 70, 70, 3, 8, 8, 71, 8, 3, 72, 72, 73, 72, 3, 3, 3, 0};
    }

    public static byte[] Gz() {
        return new byte[]{13, 0, 15, 0, 0, 7, 3, 11, 1, 11, 17, 0, 20, 0, 0, 5, 1, 1, 1, 0, 0, 0, 11, 13, 15, 0, 7, 3, 1, 1, 1, 1, 23, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 11, 13, 0, 15, 0, 0, 7, 9, 3, 1, 1, 1, 1, 26, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 1, 0, 0};
    }

    public static String g5(String text) {
        int length = text.length();
        b3_0 result = new b3_0(length + 16);
        int index = 0;
        while (index < length) {
            char value = text.charAt(index);
            if (value != '\\') {
                result.GC0(value);
                index++;
                continue;
            }
            if (index + 1 == length) break;
            value = text.charAt(index + 1);
            if (value == 'u') {
                char[] chars = Character.toChars(Integer.parseInt(text.substring(index + 2, index + 6), 16));
                index += 6;
                int count = result.hp0 + chars.length;
                if (count > result.ZB.length) result.q6(count);
                System.arraycopy(chars, 0, result.ZB, result.hp0, chars.length);
                result.hp0 = count;
                continue;
            }
            switch (value) {
                case '"':
                case '/':
                case '\\': break;
                case 'b': value = '\b'; break;
                case 'f': value = '\f'; break;
                case 'n': value = '\n'; break;
                case 'r': value = '\r'; break;
                case 't': value = '\t'; break;
                default: throw new WC0("Illegal escaped character: \\" + value);
            }
            result.GC0(value);
            index += 2;
        }
        return result.toString();
    }

    public final oe_0 D30(InputStreamReader reader) {
        char[] data = new char[1024];
        int size = 0;
        try {
            for (;;) {
                int count = reader.read(data, size, data.length - size);
                if (count == -1) break;
                if (count == 0) data = Arrays.copyOf(data, data.length * 2);
                else size += count;
            }
        } catch (IOException error) {
            throw new WC0("Error reading input.", error);
        } finally {
            KT.E1(reader);
        }
        return Gu0(data, size);
    }

    public final oe_0 Zk0(Dn0 file) {
        InputStreamReader reader;
        try {
            reader = file.IE0("UTF-8");
        } catch (Exception error) {
            throw new WC0("Error reading file: " + file, error);
        }
        try {
            return D30(reader);
        } catch (Exception error) {
            throw new WC0("Error parsing file: " + file, error);
        }
    }

    public final oe_0 Gu0(char[] data, int length) {
        int position = 0;
        int[] states = new int[4];
        int start = 0;
        es_1 names = new es_1(8);
        boolean escaped = false;
        boolean name = false;
        boolean unquoted = false;
        RuntimeException failure = null;
        int state = 1;
        int depth = 0;
        int phase = 0;
        try {
            machine:
            for (;;) {
                if (phase == 0) {
                    if (position == length) {
                        phase = 4;
                        continue;
                    }
                    if (state == 0) break;
                    phase = 1;
                }
                if (phase == 2) {
                    if (state == 0) break;
                    phase = ++position == length ? 4 : 1;
                    continue;
                }
                if (phase == 4) {
                    if (position != length) break;
                    int action = Vv0[state];
                    int count = Hl[action++];
                    while (count-- > 0) {
                        if (Hl[action++] != 1) continue;
                        String value = new String(data, start, position - start);
                        if (escaped) value = g5(value);
                        if (name) {
                            name = false;
                            names.Ue0(value);
                        } else {
                            String key = names.KB > 0 ? (String) names.rq0() : null;
                            emit(key, value, unquoted, data, start, position);
                        }
                        unquoted = false;
                        start = position;
                    }
                    break;
                }
                int keyOffset = iD0[state];
                int transition = Rl[state];
                int singles = i60[state];
                int low = keyOffset;
                int high = keyOffset + singles - 1;
                boolean found = false;
                while (singles > 0 && high >= low) {
                    int middle = low + ((high - low) >> 1);
                    char value = data[position];
                    char key = n0[middle];
                    if (value < key) high = middle - 1;
                    else if (value > key) low = middle + 1;
                    else {
                        transition += middle - keyOffset;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    if (singles > 0) {
                        keyOffset += singles;
                        transition += singles;
                    }
                    int ranges = ur0[state];
                    low = keyOffset;
                    high = keyOffset + (ranges << 1) - 2;
                    while (ranges > 0 && high >= low) {
                        int middle = low + (((high - low) >> 1) & -2);
                        char value = data[position];
                        if (value < n0[middle]) high = middle - 2;
                        else if (value > n0[middle + 1]) low = middle + 2;
                        else {
                            transition += (middle - keyOffset) >> 1;
                            found = true;
                            break;
                        }
                    }
                    if (!found && ranges > 0) transition += ranges;
                }
                transition = Uz[transition];
                int next = Lk0[transition];
                int action = eK[transition];
                if (action != 0) {
                    int count = Hl[action++];
                    while (count-- > 0) {
                        int operation = Hl[action++];
                        switch (operation) {
                            case 0:
                                name = true;
                                break;
                            case 1: {
                                String value = new String(data, start, position - start);
                                if (escaped) value = g5(value);
                                if (name) {
                                    name = false;
                                    names.Ue0(value);
                                } else {
                                    String key = names.KB > 0 ? (String) names.rq0() : null;
                                    emit(key, value, unquoted, data, start, position);
                                }
                                unquoted = false;
                                start = position;
                                break;
                            }
                            case 2:
                            case 4: {
                                String key = names.KB > 0 ? (String) names.rq0() : null;
                                if (operation == 2) Ll0(key);
                                else R30(key);
                                if (depth == states.length) states = Arrays.copyOf(states, states.length * 2);
                                states[depth++] = next;
                                state = operation == 2 ? 5 : 23;
                                phase = 2;
                                continue machine;
                            }
                            case 3:
                            case 5:
                                e40 = (oe_0) IK0.rq0();
                                if (M2.lpt3 > 0) F9.rq0();
                                M2 = IK0.KB > 0 ? (oe_0) IK0.GH0() : null;
                                state = states[--depth];
                                phase = 2;
                                continue machine;
                            case 6:
                                if (data[position++] == '/') {
                                    while (position != length && data[position] != '\n') position++;
                                    position--;
                                } else {
                                    for (;;) {
                                        int following = position + 1;
                                        if ((following >= length || data[position] == '*') && data[following] == '/') {
                                            position = following;
                                            break;
                                        }
                                        position = following;
                                    }
                                }
                                break;
                            case 7: {
                                unquoted = true;
                                escaped = false;
                                int scan = position;
                                try {
                                    for (;;) {
                                        char value = data[scan];
                                        if (value == '\n' || value == '\r'
                                                || (name ? value == ':' : value == ',' || value == '}' || value == ']')) break;
                                        if (value == '\\') escaped = true;
                                        if (value == '/' && scan + 1 != length
                                                && (data[scan + 1] == '/' || data[scan + 1] == '*')) break;
                                        if (++scan == length) break;
                                    }
                                    do {
                                        scan--;
                                    } while (Character.isSpace(data[scan]));
                                } catch (RuntimeException error) {
                                    position = scan;
                                    throw error;
                                }
                                start = position;
                                position = scan;
                                break;
                            }
                            case 8: {
                                position++;
                                escaped = false;
                                int scan = position;
                                try {
                                    for (;;) {
                                        char value = data[scan];
                                        if (value == '"') break;
                                        if (value == '\\') {
                                            escaped = true;
                                            scan++;
                                        }
                                        if (++scan == length) break;
                                    }
                                } catch (RuntimeException error) {
                                    position = scan;
                                    throw error;
                                }
                                scan--;
                                start = position;
                                position = scan;
                                break;
                            }
                            default:
                                break;
                        }
                    }
                }
                state = next;
                phase = 2;
            }
        } catch (RuntimeException error) {
            failure = error;
        }
        oe_0 root = e40;
        e40 = null;
        M2 = null;
        F9.clear();
        if (position < length) {
            int line = 1;
            for (int i = 0; i < position; i++) if (data[i] == '\n') line++;
            int from = Math.max(0, position - 32);
            throw new WC0("Error parsing JSON on line " + line + " near: "
                    + new String(data, from, position - from) + "*ERROR*"
                    + new String(data, position, Math.min(64, length - position)), failure);
        }
        if (IK0.KB != 0) {
            oe_0 open = (oe_0) IK0.GH0();
            IK0.clear();
            if (open != null && open.wH0 == lpt3__3.NR) {
                throw new WC0("Error parsing JSON, unmatched brace.");
            }
            throw new WC0("Error parsing JSON, unmatched bracket.");
        }
        if (failure != null) throw new WC0("Error parsing JSON: " + new String(data), failure);
        return root;
    }

    private void emit(String name, String value, boolean unquoted, char[] data, int start, int end) {
        if (unquoted) {
            if (value.equals("true")) {
                rC(name, new oe_0(true));
                return;
            }
            if (value.equals("false")) {
                rC(name, new oe_0(false));
                return;
            }
            if (value.equals("null")) {
                rC(name, new oe_0((String) null));
                return;
            }
            boolean decimal = false;
            boolean integer = true;
            for (int i = start; i < end; i++) {
                char ch = data[i];
                if (ch == '+' || ch == '-' || (ch >= '0' && ch <= '9')) continue;
                if (ch == 'e' || ch == 'E' || ch == '.') {
                    decimal = true;
                    integer = false;
                } else {
                    decimal = false;
                    integer = false;
                    break;
                }
            }
            try {
                if (decimal) {
                    rC(name, new oe_0(Double.parseDouble(value), value));
                    return;
                }
                if (integer) {
                    rC(name, new oe_0(Long.parseLong(value), value));
                    return;
                }
            } catch (NumberFormatException ignored) {
            }
        }
        rC(name, new oe_0(value));
    }

    public final void Ll0(String name) {
        oe_0 node = new oe_0(lpt3__3.NR);
        if (M2 != null) rC(name, node);
        IK0.Ue0(node);
        M2 = node;
    }

    public final void R30(String name) {
        oe_0 node = new oe_0(lpt3__3.cL);
        if (M2 != null) rC(name, node);
        IK0.Ue0(node);
        M2 = node;
    }

    public final void rC(String name, oe_0 node) {
        node.Z3 = name;
        oe_0 parent = M2;
        if (parent == null) {
            M2 = node;
            e40 = node;
        } else if (!parent.jY() && (parent = M2).wH0 != lpt3__3.NR) {
            e40 = parent;
        } else {
            parent = M2;
            node.y8 = parent;
            if (parent.lpt3 == 0) {
                parent.dz0 = node;
            } else {
                oe_0 previous = (oe_0) F9.rq0();
                previous.Uu = node;
                node.cA = previous;
            }
            F9.Ue0(node);
            M2.lpt3++;
        }
    }
}
