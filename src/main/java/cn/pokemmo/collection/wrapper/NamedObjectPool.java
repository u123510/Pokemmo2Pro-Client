package cn.pokemmo.collection.wrapper;

import f.es_1;

/**
 * 具名对象复用池容器
 */
public class NamedObjectPool {
    public String Bl0;
    public final es_1 Cp;

    public NamedObjectPool() {
        this.Cp = new es_1();
    }
}
