package cn.pokemmo.util.collection;

import f.wq0_0;
import java.util.Collection;

/**
 * 原生 byte 键对象映射接口 (Primitive Byte-Object Map)
 * 原始接口: {@code f.IG0}
 */
public interface PrimitiveByteObjectMap<V> {

    byte SK();

    int size();

    boolean I0(byte key);

    V BM(byte key);

    V gE0(byte key, V value);

    V lz0(byte key);

    void clear();

    Collection<V> To();

    boolean ml0(wq0_0 procedure);
}
