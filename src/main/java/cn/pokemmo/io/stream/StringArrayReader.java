package cn.pokemmo.io.stream;

import java.io.Reader;

public class StringArrayReader extends Reader {
    public final String[] lines;
    public int lineIndex;
    public int charIndex;

    public StringArrayReader(String[] lines) {
        this.lines = lines;
        this.lineIndex = 0;
        this.charIndex = 0;
    }

    @Override
    public int read(char[] cbuf, int off, int len) {
        if (cbuf == null) {
            throw new NullPointerException("cbuf == null");
        }
        if (off < 0 || len < 0 || len > cbuf.length - off) {
            throw new IndexOutOfBoundsException();
        }
        if (len == 0) {
            return 0;
        }
        int readCount = 0;
        while (readCount < len && this.lineIndex < this.lines.length) {
            String current = this.lines[this.lineIndex];
            int remainingInLine = current.length() - this.charIndex;
            int toCopy = Math.min(len - readCount, remainingInLine);
            current.getChars(this.charIndex, this.charIndex + toCopy, cbuf, off + readCount);
            this.charIndex += toCopy;
            readCount += toCopy;
            if (this.charIndex >= current.length()) {
                this.lineIndex++;
                this.charIndex = 0;
            }
        }
        return readCount == 0 && this.lineIndex >= this.lines.length ? -1 : readCount;
    }

    @Override
    public void close() {
        this.lineIndex = this.lines.length;
    }
}
