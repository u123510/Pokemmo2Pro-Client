package cn.pokemmo.ui.widget.factory;

import f.*;

public abstract class ThemeAttributeKeyConstants {
    public final int max;
    public int peak;
    private final es_1 freeObjects;

    public ThemeAttributeKeyConstants() { this(16, Integer.MAX_VALUE); }
    public ThemeAttributeKeyConstants(int initialCapacity) { this(initialCapacity, Integer.MAX_VALUE); }

    public ThemeAttributeKeyConstants(int initialCapacity, int maximumCapacity) {
        this.freeObjects = new es_1(false, initialCapacity);
        this.max = maximumCapacity;
    }

    public abstract Object newObject();

    public Object obtain() {
        return this.freeObjects.KB == 0 ? this.newObject() : this.freeObjects.rq0();
    }

    public void free(Object object) {
        if (object == null) throw new IllegalArgumentException("object cannot be null.");
        if (this.freeObjects.KB < this.max) {
            this.freeObjects.Ue0(object);
            this.peak = Math.max(this.peak, this.freeObjects.KB);
            this.reset(object);
        } else {
            this.discard(object);
        }
    }

    public void fill(int count) {
        for (int i = 0; i < count; ++i) {
            if (this.freeObjects.KB >= this.max) break;
            this.freeObjects.Ue0(this.newObject());
        }
        this.peak = Math.max(this.peak, this.freeObjects.KB);
    }

    public void reset(Object object) {
        if (object instanceof mu_0) ((mu_0)object).bL();
    }

    public void discard(Object object) { this.reset(object); }

    public void freeAll(es_1 objects) {
        if (objects == null) throw new IllegalArgumentException("objects cannot be null.");
        for (int i = 0; i < objects.KB; ++i) {
            Object object = objects.get(i);
            if (object == null) continue;
            if (this.freeObjects.KB < this.max) {
                this.freeObjects.Ue0(object);
                this.reset(object);
            } else {
                this.discard(object);
            }
        }
        this.peak = Math.max(this.peak, this.freeObjects.KB);
    }

    public void clear() {
        int size = this.freeObjects.KB;
        for (int i = 0; i < size; ++i) this.discard(this.freeObjects.get(i));
        this.freeObjects.clear();
    }

    public int getFree() { return this.freeObjects.KB; }
}
