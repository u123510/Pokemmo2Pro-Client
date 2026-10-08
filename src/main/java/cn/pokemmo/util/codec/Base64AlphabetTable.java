package cn.pokemmo.util.codec;

public class Base64AlphabetTable {
    public final char[] iI;
    public final byte[] ss;

    public Base64AlphabetTable(char c, char d) {
        this.iI = new char[64];
        this.ss = new byte[128];
        int idx = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            this.iI[idx++] = ch;
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            this.iI[idx++] = ch;
        }
        for (char ch = '0'; ch <= '9'; ch++) {
            this.iI[idx++] = ch;
        }
        int next = idx + 1;
        this.iI[idx] = c;
        this.iI[next] = d;
        for (int i = 0; i < this.ss.length; i++) {
            this.ss[i] = -1;
        }
        for (int i = 0; i < 64; i++) {
            char ch = this.iI[i];
            this.ss[ch] = (byte) i;
        }
    }
}
