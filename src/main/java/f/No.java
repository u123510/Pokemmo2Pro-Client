package f;

import java.io.BufferedReader;
import cn.pokemmo.graphics.particle.ParticleEmitterProfile;

public class No extends ParticleEmitterProfile {
    public No() {
        super();
    }

    public No(BufferedReader reader) {
        super(reader);
    }

    public No(No other) {
        super(other);
    }

    public No(ParticleEmitterProfile other) {
        super(other);
    }
}
