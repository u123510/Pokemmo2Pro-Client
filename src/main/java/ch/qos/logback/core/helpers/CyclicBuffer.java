package ch.qos.logback.core.helpers;

import java.util.ArrayList;
import java.util.List;

public class CyclicBuffer<E> {
    E[] ea;
    int first;
    int last;
    int numElems;
    int maxSize;

    @SuppressWarnings("unchecked")
    public CyclicBuffer(int maxSize) {
        if (maxSize < 1) throw new IllegalArgumentException("The maxSize argument (" + maxSize + ") is not a positive integer.");
        init(maxSize);
    }

    @SuppressWarnings("unchecked")
    public CyclicBuffer(CyclicBuffer<E> other) {
        this.maxSize = other.maxSize;
        this.ea = (E[]) new Object[maxSize];
        System.arraycopy(other.ea, 0, this.ea, 0, maxSize);
        this.last = other.last;
        this.first = other.first;
        this.numElems = other.numElems;
    }

    @SuppressWarnings("unchecked")
    private void init(int maxSize) {
        this.maxSize = maxSize;
        this.ea = (E[]) new Object[maxSize];
        first = 0;
        last = 0;
        numElems = 0;
    }

    public void clear() { init(maxSize); }

    public void add(E event) {
        ea[last] = event;
        last++;
        if (last == maxSize) last = 0;
        if (numElems < maxSize) {
            numElems++;
        } else {
            first++;
            if (first == maxSize) first = 0;
        }
    }

    public E get(int index) {
        if (index < 0 || index >= numElems) return null;
        return ea[(first + index) % maxSize];
    }

    public int getMaxSize() { return maxSize; }

    public E get() {
        if (numElems <= 0) return null;
        E result = ea[first];
        ea[first] = null;
        numElems--;
        first++;
        if (first == maxSize) first = 0;
        return result;
    }

    public List<E> asList() {
        ArrayList<E> result = new ArrayList<>();
        for (int i = 0; i < length(); i++) result.add(get(i));
        return result;
    }

    public int length() { return numElems; }

    @SuppressWarnings("unchecked")
    public void resize(int newSize) {
        if (newSize < 0) throw new IllegalArgumentException("Negative array size [" + newSize + "] not allowed.");
        if (newSize == numElems) return;
        E[] newArray = (E[]) new Object[newSize];
        int copyCount = numElems;
        if (newSize < copyCount) copyCount = newSize;
        for (int i = 0; i < copyCount; i++) {
            newArray[i] = ea[first];
            ea[first] = null;
            first++;
            if (first == maxSize) first = 0;
        }
        ea = newArray;
        first = 0;
        numElems = copyCount;
        maxSize = newSize;
        last = newSize == copyCount ? 0 : copyCount;
    }
}
