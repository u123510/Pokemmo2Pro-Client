package cn.pokemmo.particle.vanity;

import cn.pokemmo.particle.effect.*;
import f.MU;
import f.PF;
import f.QL;

/**
 * 质子特效类型映射表与特效工厂 (Particle Vanity Mapping & Factory)
 * 将不同质子枚举 (QL) 映射到对应的入场粒子特效类。
 *
 * 原混淆类: f.al_0
 */
public abstract class ParticleVanityMapping {

    public static final int[] MAPPING;

    private ParticleVanityMapping() {
    }

    static {
        int[] mapping = new int[QL.ak0.length];
        mapping[38] = 1;
        mapping[3] = 2;
        mapping[5] = 3;
        mapping[1] = 4;
        mapping[2] = 5;
        mapping[4] = 6;
        mapping[6] = 7;
        mapping[7] = 8;
        mapping[8] = 9;
        mapping[9] = 10;
        mapping[10] = 11;
        mapping[11] = 12;
        mapping[12] = 13;
        mapping[13] = 14;
        mapping[14] = 15;
        mapping[15] = 16;
        mapping[16] = 17;
        mapping[17] = 18;
        mapping[18] = 19;
        mapping[19] = 20;
        mapping[20] = 21;
        mapping[21] = 22;
        mapping[22] = 23;
        mapping[23] = 24;
        mapping[24] = 25;
        mapping[25] = 26;
        mapping[26] = 27;
        mapping[27] = 28;
        mapping[28] = 29;
        mapping[29] = 30;
        mapping[30] = 31;
        mapping[31] = 32;
        mapping[32] = 33;
        mapping[33] = 34;
        mapping[34] = 35;
        mapping[35] = 36;
        mapping[36] = 37;
        mapping[37] = 38;
        mapping[39] = 39;
        mapping[40] = 40;
        mapping[41] = 41;
        mapping[42] = 42;
        MAPPING = mapping;
    }

    /**
     * 根据质子枚举创建对应的战斗入场粒子特效实例
     *
     * @param vanity      质子枚举
     * @param participant 战斗参战者 (宝可梦)
     * @return 粒子特效实例，若无特效或不受支持则返回 null
     */
    public static MU createEffect(QL vanity, PF participant) {
        if (vanity == null || vanity.uw0 < 0 || vanity.uw0 >= MAPPING.length) {
            return null;
        }

        int caseId = MAPPING[vanity.uw0];
        switch (caseId) {
            case 1:
            case 7:
                return new HitodamaParticleEffect(participant);
            case 2:
            case 3:
            case 4:
            case 5:
                return null;
            case 6:
                return new ShinyParticleEffect(participant);
            case 8:
                return new BatParticleEffect(participant);
            case 9:
                return new GhostParticleEffect(participant);
            case 10:
                return new EyeParticleEffect(participant);
            case 11:
                return new PumpkingDelightParticleEffect(participant);
            case 12:
                return new RisingStarParticleEffect(participant);
            case 13:
                return new SnowflakeParticleEffect(participant);
            case 14:
                return new PresentParticleEffect(participant);
            case 15:
                return new LanternParticleEffect(participant);
            case 16:
                return new FireworksParticleEffect(participant);
            case 17:
                return new PungentStenchParticleEffect(participant);
            case 18:
                return new BlackHoleParticleEffect(participant);
            case 19:
                return new WitchsHazeParticleEffect(participant);
            case 20:
                return new PumpkidsTreatParticleEffect(participant);
            case 21:
                return new BlackCatParticleEffect(participant);
            case 22:
                return new PumpcatParticleEffect(participant);
            case 23:
                return new WhiteCatParticleEffect(participant);
            case 24:
                return new ScytheParticleEffect(participant);
            case 25:
                return new SpiderParticleEffect(participant);
            case 26:
                return new ZombieHandsParticleEffect(participant);
            case 27:
                return new ZodiacParticleEffect(participant);
            case 28:
                return new EerieHowlParticleEffect(participant);
            case 29:
                return new GraveyardParticleEffect(participant);
            case 30:
                return new FallOfTheKingParticleEffect(participant);
            case 31:
                return new DragonParticleEffect(participant);
            case 32:
                return new CakeParticleEffect(participant);
            case 33:
                return new MultiVectorPathParticleEffect(participant, false);
            case 34:
                return new MultiVectorPathParticleEffect(participant, true);
            case 35:
                return new SpiritombParticleEffect(participant, false);
            case 36:
                return new SpiritombParticleEffect(participant, true);
            case 37:
                return new XmasWiresParticleEffect(participant);
            case 38:
                return new SpiritOfSpringParticleEffect(participant);
            case 39:
                return new PhantomParticleEffect(participant, false);
            case 40:
                return new PhantomParticleEffect(participant, true);
            case 41:
                return new DarkCrystalParticleEffect(participant, false);
            case 42:
                return new DarkCrystalParticleEffect(participant, true);
            default:
                return null;
        }
    }
}
