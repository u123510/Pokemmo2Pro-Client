package cn.pokemmo.net.packet.protocol;

import f.CE;
import f.cq_0;
import java.nio.ByteBuffer;

/**
 * 网络基础协议数据包基类 (Base Network Packet)
 * <p>
 * 包含动作 Opcode 与校验、执行处理逻辑。
 * <p>
 * 原始混淆类: {@code f.Mg}
 */
public abstract class BaseNetworkPacket {
    public final byte mG;

    public BaseNetworkPacket(byte opcode) {
        this.mG = opcode;
    }

    public byte getOpcode() {
        return this.mG;
    }

    public abstract void hG(ByteBuffer buffer);

    public void handle(ByteBuffer buffer) {
        hG(buffer);
    }

    public boolean Ev0(CE pokemonData, cq_0 pokedexEntry) {
        return true;
    }

    public boolean validate(CE pokemonData, cq_0 pokedexEntry) {
        return Ev0(pokemonData, pokedexEntry);
    }

    public int ha() {
        return 0;
    }

    public int getPriority() {
        return ha();
    }

    public boolean L6() {
        return false;
    }

    public boolean isPersistent() {
        return L6();
    }
}
