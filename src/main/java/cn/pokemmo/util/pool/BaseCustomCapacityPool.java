package cn.pokemmo.util.pool;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.util.pool.BaseObjectPool;

public abstract class BaseCustomCapacityPool extends BaseObjectPool {
    public final es_1 wK0;

    public BaseCustomCapacityPool() {
        super();
        this.wK0 = new es_1();
    }

    public BaseCustomCapacityPool(int i1) {
        super(i1);
        this.wK0 = new es_1();
    }

    public BaseCustomCapacityPool(int i1, int i2) {
        super(i1, i2);
        this.wK0 = new es_1();
    }

    public Object obtain() {
        Object obj = super.obtain();
        this.wK0.Ue0(obj);
        return obj;
    }

    public final void hJ() {
        super.freeAll(this.wK0);
        this.wK0.clear();
    }

    public final void free(Object v1) {
        this.wK0.sj0(v1, true);
        super.free(v1);
    }

    public final void freeAll(es_1 v1) {
        this.wK0.fp0(v1, true);
        super.freeAll(v1);
    }
}
