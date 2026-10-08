package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrimitiveIntObjectOpenHashMap extends iw_2 implements Map {
    static final long serialVersionUID = 1L;
    public static final /* synthetic */ int Pc = 0;
    public transient Object[] ba;

    public PrimitiveIntObjectOpenHashMap(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public final int La(int capacity) {
        int actualCapacity = super.La(capacity);
        this.ba = new Object[actualCapacity];
        return actualCapacity;
    }

    @Override
    public final Object put(Object key, Object value) {
        return this.Dc0(this.e5(key), value);
    }

    @Override
    public final Object putIfAbsent(Object key, Object value) {
        int index = this.e5(key);
        if (index < 0) {
            return this.ba[-index - 1];
        }
        return this.Dc0(index, value);
    }

    @Override
    public final boolean equals(Object other) {
        if (!(other instanceof Map)) {
            return false;
        }
        Map map = (Map) other;
        if (map.size() != this.Rv) {
            return false;
        }
        Object[] keys = this.Yw;
        Object[] values = this.ba;
        int len = keys.length;
        while (--len >= 0) {
            Object key = keys[len];
            if (key == iw_2.VW || key == iw_2.J80) {
                continue;
            }
            Object val = values[len];
            if (val == null) {
                if (!map.containsKey(key)) {
                    return false;
                }
            }
            Object mapVal = map.get(key);
            if (mapVal != val) {
                if (mapVal == null || !iw_2.k2(mapVal, val)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int hash = 0;
        Object[] keys = this.Yw;
        Object[] values = this.ba;
        int len = keys.length;
        while (--len >= 0) {
            Object key = keys[len];
            if (key == iw_2.VW || key == iw_2.J80) {
                continue;
            }
            Object val = values[len];
            int keyHash = key == null ? 0 : key.hashCode();
            int valHash = val == null ? 0 : val.hashCode();
            hash += keyHash ^ valHash;
        }
        return hash;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        Object[] keys = this.Yw;
        Object[] values = this.ba;
        int len = keys.length;
        while (--len >= 0) {
            Object key = keys[len];
            if (key == iw_2.VW || key == iw_2.J80) {
                continue;
            }
            Object val = values[len];
            if (first) {
                first = false;
            } else {
                sb.append(", ");
            }
            sb.append(key).append("=").append(val);
        }
        return sb.append("}").toString();
    }

    @Override
    public final void Pl(int capacity) {
        int oldLength = this.Yw.length;
        int oldSize = this.Rv;
        Object[] oldKeys = this.Yw;
        Object[] oldValues = this.ba;
        this.Yw = new Object[capacity];
        Arrays.fill(this.Yw, iw_2.VW);
        this.ba = new Object[capacity];
        for (int index = oldLength; --index >= 0;) {
            Object key = oldKeys[index];
            if (key == iw_2.VW || key == iw_2.J80) {
                continue;
            }
            int newIndex = this.e5(key);
            if (newIndex < 0) {
                Object duplicateKey = this.Yw[-newIndex - 1];
                int currentSize = this.Rv;
                StringBuilder sb = new StringBuilder();
                StringBuilder details = new StringBuilder();
                HashSet keyTypes = new HashSet();
                for (Object k : this.Yw) {
                    if (k != iw_2.VW && k != iw_2.J80) {
                        keyTypes.add(k == null ? null : k.getClass());
                    }
                }
                if (keyTypes.size() > 1) {
                    details.append("\nMore than one type used for keys. Watch out for asymmetric equals(). Read about the 'Liskov substitution principle' and the implications for equals() in java.\nKey types: ").append(keyTypes);
                }
                StringBuilder diffSb = new StringBuilder();
                String diffStr;
                if (duplicateKey == key) {
                    diffStr = "a == b";
                } else if (duplicateKey.getClass() != key.getClass()) {
                    diffSb.append("Class of objects differ a=").append(duplicateKey.getClass()).append(" vs b=").append(key.getClass());
                    boolean eq1 = duplicateKey.equals(key);
                    boolean eq2 = key.equals(duplicateKey);
                    if (eq1 != eq2) {
                        diffSb.append("\nequals() of a or b object are asymmetric\na.equals(b) =").append(eq1).append("\nb.equals(a) =").append(eq2);
                    }
                    diffStr = diffSb.toString();
                } else {
                    diffStr = diffSb.toString();
                }
                details.append(diffStr);
                sb.append(details.toString());
                if (currentSize != oldSize) {
                    sb.append(ac0_0.YH0("[Warning] apparent concurrent modification of the key set. Size before and after rehash() do not match ", oldSize, " vs ", currentSize));
                }
                HashSet remainingKeys = new HashSet();
                for (Object k : oldKeys) {
                    if (k != iw_2.VW && k != iw_2.J80) {
                        remainingKeys.add(k);
                    }
                }
                StringBuilder warnSb = new StringBuilder();
                if (remainingKeys.size() != oldSize) {
                    warnSb.append("\nhashCode() and/or equals() have inconsistent implementation\nKey set lost entries, now got ").append(remainingKeys.size()).append(" instead of ").append(oldSize).append(". This can manifest itself as an apparent duplicate key.");
                }
                sb.append(warnSb.toString());
                if (duplicateKey == key) {
                    sb.append("Inserting same object twice, rehashing bug. Object= ").append(key);
                }
                throw iw_2.l3(sb.toString(), duplicateKey, key);
            }
            this.ba[newIndex] = oldValues[index];
        }
    }

    @Override
    public final Object get(Object key) {
        int index = this.Dy0(key);
        return index < 0 ? null : this.ba[index];
    }

    @Override
    public final void clear() {
        if (this.Rv == 0) {
            return;
        }
        this.Rv = 0;
        this.YB0 = this.uT();
        Arrays.fill(this.Yw, 0, this.Yw.length, iw_2.VW);
        Arrays.fill(this.ba, 0, this.ba.length, null);
    }

    @Override
    public final Object remove(Object key) {
        Object prev = null;
        int index = this.Dy0(key);
        if (index >= 0) {
            prev = this.ba[index];
            this.ba[index] = null;
            super.tq0(index);
        }
        return prev;
    }

    @Override
    public final void tq0(int index) {
        this.ba[index] = null;
        super.tq0(index);
    }

    @Override
    public final Collection values() {
        return new Mz0((jb0_1) this);
    }

    @Override
    public final Set keySet() {
        return new kn_1((jb0_1) this);
    }

    @Override
    public final Set entrySet() {
        return new rl_2((jb0_1) this);
    }

    @Override
    public final boolean containsValue(Object value) {
        Object[] keys = this.Yw;
        Object[] values = this.ba;
        int len = values.length;
        if (value == null) {
            while (--len >= 0) {
                Object key = keys[len];
                if (key != iw_2.VW && key != iw_2.J80 && values[len] == null) {
                    return true;
                }
            }
        } else {
            while (--len >= 0) {
                Object key = keys[len];
                if (key != iw_2.VW && key != iw_2.J80) {
                    Object val = values[len];
                    if (val == value || (val != null && iw_2.k2(value, val))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void putAll(Map map) {
        int addSize = map.size();
        int curSize = this.Rv;
        if (addSize > this.zi0 - curSize) {
            int newCapacity = Math.max(curSize + 1, JS.Hf((float) (addSize + curSize) / this.na0) + 1);
            this.Pl(g00_0.Ql(newCapacity));
            this.Sf0(this.uT());
        }
        for (Object o : map.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            this.Dc0(this.e5(entry.getKey()), entry.getValue());
        }
    }

    @Override
    public final void writeExternal(ObjectOutput out) throws IOException {
        out.writeByte(1);
        super.writeExternal(out);
        out.writeInt(this.Rv);
        int len = this.Yw.length;
        while (--len >= 0) {
            Object key = this.Yw[len];
            if (key != iw_2.J80 && key != iw_2.VW) {
                out.writeObject(key);
                out.writeObject(this.ba[len]);
            }
        }
    }

    @Override
    public final void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        byte version = in.readByte();
        if (version != 0) {
            super.readExternal(in);
        }
        int count = in.readInt();
        super.La(count);
        this.ba = new Object[this.Yw.length];
        while (--count >= 0) {
            Object key = in.readObject();
            Object value = in.readObject();
            this.Dc0(this.e5(key), value);
        }
    }

    public final Object Dc0(int index, Object value) {
        Object previous = null;
        boolean isNew = true;
        if (index < 0) {
            index = -index - 1;
            previous = this.ba[index];
            isNew = false;
        }
        this.ba[index] = value;
        if (isNew) {
            this.OC0(this.wC);
        }
        return previous;
    }
}
