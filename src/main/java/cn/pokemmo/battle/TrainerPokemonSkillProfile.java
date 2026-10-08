package cn.pokemmo.battle;

import f.org.json.N7;
import f.yj_1;

public class TrainerPokemonSkillProfile {
    public short nt0;
    public final yj_1 tn;
    public short CV;
    public short Vq;
    public byte Oi;

    public TrainerPokemonSkillProfile() {
        this.tn = new yj_1(4);
        this.CV = (short) -1;
        this.Oi = (byte) 1;
    }

    public TrainerPokemonSkillProfile(N7 source) {
        this.tn = new yj_1(4);
        this.CV = (short) -1;
        this.Oi = (byte) 1;
        this.nt0 = (short) source.pF("id");
        this.CV = (short) source.MT(-1, "ability");
        this.Oi = (byte) source.MT(1, "level");
        this.Vq = (short) source.MT(0, "held_item");
        source.gz0("skills").forEach(this::Kp0);
    }

    public void Kp0(Object value) {
        this.tn.uo0((short) ((Integer) value).intValue());
    }
}
