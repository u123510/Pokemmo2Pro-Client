package cn.pokemmo.io.stream;

import f.es_1;
import f.lE;
import f.sg_1;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonIndentedWriter extends Writer {
    public final Writer writer;
    public final es_1 stack;
    public lE currentItem;
    public boolean nameSet;
    public sg_1 outputType;
    public boolean quoteLongValues;

    public JsonIndentedWriter(Writer writer) {
        super();
        this.stack = new es_1();
        this.outputType = sg_1.Ed;
        this.quoteLongValues = false;
        this.writer = writer;
    }

    public JsonIndentedWriter kH0(String name) throws IOException {
        lE current = this.currentItem;
        if (current != null && !current.p60) {
            if (!current.xz) {
                current.xz = true;
            } else {
                this.writer.write(44);
            }
            this.writer.write(this.outputType.zn(name));
            this.writer.write(58);
            this.nameSet = true;
            return this;
        }
        throw new IllegalStateException("Current item must be an object.");
    }

    public JsonIndentedWriter Yg0(Object value) throws IOException {
        if (this.quoteLongValues) {
            if (value instanceof Long || value instanceof Double || value instanceof BigDecimal || value instanceof BigInteger) {
                value = value.toString();
            }
        } else if (value instanceof Number) {
            Number num = (Number) value;
            long longVal = num.longValue();
            if (num.doubleValue() == (double) longVal) {
                value = Long.valueOf(longVal);
            }
        }
        this.prepareValue();
        this.writer.write(this.outputType.Gx(value));
        return this;
    }

    public final void hK0() throws IOException {
        if (!this.nameSet) {
            lE item = (lE) this.stack.rq0();
            this.writer.write(item.p60 ? 93 : 125);
            this.currentItem = this.stack.KB == 0 ? null : (lE) this.stack.GH0();
            return;
        }
        throw new IllegalStateException("Expected an object, array, or value since a name was set.");
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        this.writer.write(cbuf, off, len);
    }

    @Override
    public void flush() throws IOException {
        this.writer.flush();
    }

    @Override
    public void close() throws IOException {
        while (this.stack.KB > 0) {
            this.hK0();
        }
        this.writer.close();
    }

    public final void prepareValue() throws IOException {
        lE current = this.currentItem;
        if (current != null) {
            if (current.p60) {
                if (!current.xz) {
                    current.xz = true;
                } else {
                    this.writer.write(44);
                }
            } else if (this.nameSet) {
                this.nameSet = false;
            } else {
                throw new IllegalStateException("Name must be set.");
            }
        }
    }

    public final void T5() throws IOException {
        prepareValue();
    }
}
