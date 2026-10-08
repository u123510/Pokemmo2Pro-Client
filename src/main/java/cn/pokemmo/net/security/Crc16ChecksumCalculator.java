package cn.pokemmo.net.security;

/**
 * CRC16-CCITT 数据流校验和计算器 (多项式 0x8005)
 */
public class Crc16ChecksumCalculator {
    public short iO = (short) -1;

    public void update(int n, int n2) {
        int mask = 1 << n2 - 1;
        do {
            short s;
            boolean bl = ((s = this.iO) & 0x8000) == 0;
            boolean bl2 = (n & mask) == 0;
            this.iO = bl ^ bl2 ? (short) ((short) (s << 1) ^ 0xFFFF8005) : (short) (s << 1);
        } while ((mask >>>= 1) != 0);
    }

    public final void pI(int n, int n2) {
        update(n, n2);
    }

    public short getChecksum() {
        return this.iO;
    }
}
