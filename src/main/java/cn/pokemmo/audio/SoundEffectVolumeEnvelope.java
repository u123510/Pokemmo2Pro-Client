package cn.pokemmo.audio;

import f.*;

public class SoundEffectVolumeEnvelope {
    public final String k2;
    public final String Rm0;
    public final String F6;

    public SoundEffectVolumeEnvelope(String first, String second, String third) {
        super();
        this.k2 = first;
        this.Rm0 = second;
        this.F6 = third;
    }

    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof li_0)) {
            return false;
        }
        SoundEffectVolumeEnvelope other = (li_0) object;
        return (this.k2 == null ? other.k2 == null : this.k2.equals(other.k2))
                && (this.Rm0 == null ? other.Rm0 == null : this.Rm0.equals(other.Rm0))
                && (this.F6 == null ? other.F6 == null : this.F6.equals(other.F6));
    }

    @Override
    public final int hashCode() {
        int result = 371;
        result = (result + (this.k2 == null ? 0 : this.k2.hashCode())) * 53;
        result = (result + (this.Rm0 == null ? 0 : this.Rm0.hashCode())) * 53;
        return result + (this.F6 == null ? 0 : this.F6.hashCode());
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder(this.k2);
        if (this.Rm0 != null) {
            builder.append('.').append(this.Rm0);
        }
        if (this.F6 != null) {
            builder.append('#').append(this.F6);
        }
        return builder.toString();
    }
}
