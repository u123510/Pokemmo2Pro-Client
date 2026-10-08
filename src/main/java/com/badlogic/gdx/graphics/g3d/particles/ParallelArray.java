package com.badlogic.gdx.graphics.g3d.particles;

import f.I2;
import f.es_1;
import f.nf_1;
import java.lang.reflect.Array;

public class ParallelArray {
    es_1 arrays;
    public int capacity;
    public int size;

    public ParallelArray(int capacity) {
        this.arrays = new es_1(false, 2, Channel.class);
        this.capacity = capacity;
        this.size = 0;
    }

    private Channel allocateChannel(ChannelDescriptor descriptor) {
        Class type = descriptor.type;
        if (type == Float.TYPE) {
            return new FloatChannel(descriptor.id, descriptor.count, this.capacity);
        }
        if (type == Integer.TYPE) {
            return new IntChannel(descriptor.id, descriptor.count, this.capacity);
        }
        return new ObjectChannel(descriptor.id, descriptor.count, this.capacity, type);
    }

    private int findIndex(int id) {
        es_1 array = this.arrays;
        for (int i = 0; i < array.KB; ++i) {
            if (((Channel[]) array.rZ)[i].id == id) {
                return i;
            }
        }
        return -1;
    }

    public Channel addChannel(ChannelDescriptor descriptor) {
        return this.addChannel(descriptor, null);
    }

    public Channel addChannel(ChannelDescriptor descriptor, ChannelInitializer initializer) {
        Channel channel = this.getChannel(descriptor);
        if (channel == null) {
            channel = this.allocateChannel(descriptor);
            if (initializer != null) {
                initializer.init(channel);
            }
            this.arrays.Ue0(channel);
        }
        return channel;
    }

    public void removeArray(int id) {
        this.arrays.Tx0(this.findIndex(id));
    }

    public void addElement(Object... values) {
        if (this.size == this.capacity) {
            throw new nf_1("Capacity reached, cannot add other elements");
        }
        int offset = 0;
        I2 iterator = this.arrays.ZD();
        while (iterator.hasNext()) {
            Channel channel = (Channel) iterator.next();
            channel.add(offset, values);
            offset += channel.strideSize;
        }
        ++this.size;
    }

    public void removeElement(int index) {
        int last = this.size - 1;
        I2 iterator = this.arrays.ZD();
        while (iterator.hasNext()) {
            ((Channel) iterator.next()).swap(index, last);
        }
        this.size = last;
    }

    public Channel getChannel(ChannelDescriptor descriptor) {
        I2 iterator = this.arrays.ZD();
        while (iterator.hasNext()) {
            Channel channel = (Channel) iterator.next();
            if (channel.id == descriptor.id) {
                return channel;
            }
        }
        return null;
    }

    public void clear() {
        this.arrays.clear();
        this.size = 0;
    }

    public void setCapacity(int capacity) {
        if (this.capacity != capacity) {
            I2 iterator = this.arrays.ZD();
            while (iterator.hasNext()) {
                ((Channel) iterator.next()).setCapacity(capacity);
            }
            this.capacity = capacity;
        }
    }

    public abstract class Channel {
        public int id;
        public Object data;
        public int strideSize;

        public Channel(int id, Object data, int strideSize) {
            this.id = id;
            this.strideSize = strideSize;
            this.data = data;
        }

        public abstract void add(int offset, Object... values);

        public abstract void swap(int first, int second);

        public abstract void setCapacity(int capacity);
    }

    public class FloatChannel extends Channel {
        public float[] data;

        public FloatChannel(int id, int strideSize, int capacity) {
            super(id, new float[capacity * strideSize], strideSize);
            this.data = (float[]) super.data;
        }

        @Override
        public void add(int offset, Object... values) {
            int from = ParallelArray.this.size * this.strideSize;
            int to = from + this.strideSize;
            int valueIndex = 0;
            while (from < to) {
                this.data[from++] = ((Float) values[offset + valueIndex++]).floatValue();
            }
        }

        @Override
        public void swap(int first, int second) {
            int stride = this.strideSize;
            first *= stride;
            second *= stride;
            int end = first + stride;
            while (first < end) {
                float value = this.data[first];
                this.data[first] = this.data[second];
                this.data[second] = value;
                ++first;
                ++second;
            }
        }

        @Override
        public void setCapacity(int capacity) {
            int length = this.strideSize * capacity;
            float[] newData = new float[length];
            System.arraycopy(this.data, 0, newData, 0, Math.min(this.data.length, length));
            this.data = newData;
            super.data = newData;
        }
    }

    public class IntChannel extends Channel {
        public int[] data;

        public IntChannel(int id, int strideSize, int capacity) {
            super(id, new int[capacity * strideSize], strideSize);
            this.data = (int[]) super.data;
        }

        @Override
        public void add(int offset, Object... values) {
            int from = ParallelArray.this.size * this.strideSize;
            int to = from + this.strideSize;
            int valueIndex = 0;
            while (from < to) {
                this.data[from++] = ((Integer) values[offset + valueIndex++]).intValue();
            }
        }

        @Override
        public void swap(int first, int second) {
            int stride = this.strideSize;
            first *= stride;
            second *= stride;
            int end = first + stride;
            while (first < end) {
                int value = this.data[first];
                this.data[first] = this.data[second];
                this.data[second] = value;
                ++first;
                ++second;
            }
        }

        @Override
        public void setCapacity(int capacity) {
            int length = this.strideSize * capacity;
            int[] newData = new int[length];
            System.arraycopy(this.data, 0, newData, 0, Math.min(this.data.length, length));
            this.data = newData;
            super.data = newData;
        }
    }

    public class ObjectChannel extends Channel {
        Class componentType;
        public Object[] data;

        public ObjectChannel(int id, int strideSize, int capacity, Class componentType) {
            super(id, Array.newInstance(componentType, capacity * strideSize), strideSize);
            this.componentType = componentType;
            this.data = (Object[]) super.data;
        }

        @Override
        public void add(int offset, Object... values) {
            int from = ParallelArray.this.size * this.strideSize;
            int to = from + this.strideSize;
            int valueIndex = 0;
            while (from < to) {
                this.data[from++] = values[offset + valueIndex++];
            }
        }

        @Override
        public void swap(int first, int second) {
            int stride = this.strideSize;
            first *= stride;
            second *= stride;
            int end = first + stride;
            while (first < end) {
                Object value = this.data[first];
                this.data[first] = this.data[second];
                this.data[second] = value;
                ++first;
                ++second;
            }
        }

        @Override
        public void setCapacity(int capacity) {
            Object[] newData = (Object[]) Array.newInstance(this.componentType, this.strideSize * capacity);
            System.arraycopy(this.data, 0, newData, 0, Math.min(this.data.length, newData.length));
            this.data = newData;
            super.data = newData;
        }
    }

    public static class ChannelDescriptor {
        public int id;
        public Class type;
        public int count;

        public ChannelDescriptor(int id, Class type, int count) {
            this.id = id;
            this.type = type;
            this.count = count;
        }
    }

    public interface ChannelInitializer<T extends Channel> {
        void init(T channel);
    }
}
