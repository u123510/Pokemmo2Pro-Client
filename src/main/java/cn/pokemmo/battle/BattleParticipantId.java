package cn.pokemmo.battle;

/**
 * 对战参与者唯一标识 (Battle Participant ID)
 * 包装战斗中训练家、NPC、野怪或系统实体的64位唯一标识符。
 *
 * 原混淆类: f.CH0
 */
public class BattleParticipantId implements Comparable {
    public static final BattleParticipantId NONE = new BattleParticipantId(0L);
    public final long Sa;

    public BattleParticipantId(long id) {
        this.Sa = id;
    }

    public long getId() {
        return this.Sa;
    }

    public boolean isValid() {
        return this.Sa > 0L;
    }

    public boolean isNone() {
        return this.Sa < 1L;
    }

    public int asInt() {
        return Math.toIntExact(this.Sa);
    }

    public final boolean uI0() {
        return this.Sa > 0L;
    }

    public final boolean Uz0() {
        return this.Sa < 1L;
    }

    public final int n30() {
        return Math.toIntExact(this.Sa);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other instanceof BattleParticipantId) {
            return this.Sa == ((BattleParticipantId) other).Sa;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(this.Sa);
    }

    @Override
    public String toString() {
        return Long.toString(this.Sa);
    }

    @Override
    public int compareTo(Object other) {
        if (other instanceof BattleParticipantId) {
            return Long.compare(this.Sa, ((BattleParticipantId) other).Sa);
        }
        return 0;
    }
}
