package cn.pokemmo.net.packet;

import f.CH0;
import f.MO;
import f.zv_2;

public class PokemonBattleActionPacket extends MO {
    public PokemonBattleActionPacket(CH0 cH0, byte by, short s, byte by2, zv_2 zv_22) {
        super(cH0, by, s, by2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, zv_22, (short) 0, (byte) 0, false, false, null, (short) -1);
    }
}
