package cn.pokemmo.audio.track;

import f.es_1;

public class HashedAudioCueBank {
    public final String Sz0;
    public final int Dn0;
    public final es_1 YO = new es_1();
    public final es_1 Sr = new es_1();

    public HashedAudioCueBank(String string) {
        this.Sz0 = string;
        this.Dn0 = string.hashCode();
    }
}
