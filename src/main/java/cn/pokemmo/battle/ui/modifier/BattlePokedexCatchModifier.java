package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.text.NumberFormat;

public class BattlePokedexCatchModifier extends TC0 {
    public final VU Rw0;
    public byte y30;
    public int o70;
    public xs_2 M6;

    public BattlePokedexCatchModifier(VU pokemon, byte newLevel, int newExp) {
        this.M6 = new xs_2();
        this.Rw0 = pokemon;
        this.y30 = newLevel;
        this.o70 = newExp;
    }

    @Override
    public final void QC(ML0 battle) {
        a10_0 battleEntities = battle.yd0;
        VU pokemon = this.Rw0;
        int expValue = this.o70 - pokemon.I8.Lr0;
        boolean hasBreakdown = false;
        xs_2 breakdown = this.M6;
        if (breakdown != null) {
            int baseExp = breakdown.bB;
            int bonusExp = breakdown.t90;
            int tradedExp = breakdown.QS;
            int heldItemExp = breakdown.Pd0;
            int partyExp = breakdown.za0;
            int shareExp = breakdown.l20;
            int otherExp = breakdown.tI;
            expValue = baseExp + bonusExp + tradedExp + heldItemExp + partyExp + shareExp + otherExp;
            hasBreakdown = bonusExp > 0 || tradedExp > 0 || heldItemExp > 0 || partyExp > 0 || shareExp > 0 || otherExp > 0;
        }

        battle.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 15, hasBreakdown ? 43 : 42,
                new String[] {pokemon.na0(), Integer.toString(expValue)}), "", null);

        if (hasBreakdown) {
            b3_0 text = new b3_0();
            appendBreakdown(text, this.M6.bB, 5050, false);
            appendBreakdown(text, this.M6.t90, 5051, true);
            appendBreakdown(text, this.M6.QS, 5052, true);
            appendBreakdown(text, this.M6.Pd0, 5053, true);
            appendBreakdown(text, this.M6.tI, 101652, true);
            appendBreakdown(text, this.M6.za0, 5054, true);
            appendBreakdown(text, this.M6.l20, 5055, true);
            battle.lZ.add(new sw_2(text.toString()));
        }

        int completedLevels = 0;
        int nextLevel = pokemon.I8.wj;
        while (true) {
            int currentLevelExp = pokemon.f60.yw.Mu0(nextLevel);
            nextLevel++;
            int nextLevelExp = pokemon.f60.yw.Mu0(nextLevel);
            float levelProgress = (float)(this.o70 - currentLevelExp) / (float)(nextLevelExp - currentLevelExp);
            if (this.o70 > nextLevelExp && this.y30 >= nextLevel) {
                completedLevels++;
                continue;
            }

            if (levelProgress >= 1.0f) {
                levelProgress = 0.99f;
            }
            PF entity = battleEntities.nd0(pokemon.pu);
            if (entity != null) {
                jd0_1 experienceBar = battle.Hi(entity);
                battle.lZ.add(new DW(levelProgress + completedLevels, experienceBar));
            }

            if (pokemon.I8.wj != this.y30) {
                if (entity != null) {
                    entity.VZ = 0;
                    entity.zi0.Bn.wj = this.y30;
                    entity.zi0.Sj = pokemon.Ps.BL0(gc_2.RC);
                    entity.F(pokemon.I8.VD);
                    battle.lZ.add(new kw_0(new xo_0(entity)));
                }
                battle.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 15, 60,
                        new String[] {pokemon.na0(), fp0_0.uD(new StringBuilder(), this.y30, "")}), "", null);
            }

            int previousExp = pokemon.I8.Lr0;
            pokemon.I8.wj = this.y30;
            pokemon.I8.Lr0 = this.o70;
            if (this.y30 < 100 && this.o70 >= pokemon.f60.yw.Mu0(this.y30 + 1)
                    && previousExp < pokemon.f60.yw.Mu0(pokemon.I8.wj + 2)
                    && battle.qq0.add(pokemon.pu)) {
                battle.wJ(sm0_0.Bx(5028, pokemon.na0(), pokemon.I8.wj + 1 + ""), "", null);
            }
            tw0_0.rl.CA(pokemon);
            return;
        }
    }

    private static void appendBreakdown(b3_0 text, int value, int messageId, boolean optional) {
        if (optional && value <= 0) {
            return;
        }
        if (optional) {
            text.sV(" +");
        }
        text.sV("[#ff8a00]");
        text.sV(NumberFormat.getInstance().format(value));
        text.sV("[#] ");
        text.sV(sm0_0.c0(messageId));
    }
}
