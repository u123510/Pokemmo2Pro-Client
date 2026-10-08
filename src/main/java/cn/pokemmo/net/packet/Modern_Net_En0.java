package cn.pokemmo.net.packet;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.en_0
 */
public abstract class Modern_Net_En0 {

    public Modern_Net_En0() {
        super();
    }

    public abstract int jR();
    public abstract void SG(byte[] var1, int var2, int var3);
    public abstract boolean Jm(byte[] var1, int var2, int var3);

    public int getChecksumLength() {
        return jR();
    }

    public void appendChecksum(byte[] buffer, int offset, int length) {
        SG(buffer, offset, length);
    }

    public boolean verifyChecksum(byte[] buffer, int offset, int length) {
        return Jm(buffer, offset, length);
    }
}

