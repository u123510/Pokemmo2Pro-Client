package cn.pokemmo.audio.source;

import f.*;

public class PokemonSoundEffectSource extends O8 {

    public PokemonSoundEffectSource(byte i1, byte i2) {
        super(i1, i2);
    }

    @Override
    public final con__6 Td0() {
        return con__6.pn0;
    }

    @Override
    public final boolean BE0() {
        return true;
    }

    @Override
    public final String BO() {
        Cq nf = this.lpT2.nf;
        if (nf == Cq.Jz0) {
            return sm0_0.c0(5021);
        }
        if (nf == Cq.Sa0) {
            return sm0_0.wa0(5071, M2());
        }
        int paramCount = 1;
        String[] params = new String[]{M2()};
        a10_0 lp = this.lpT2;
        byte side = this.ZG0;
        PF[] sidePokemons = lp.wI0[side];
        if ((byte) sidePokemons.length == 2) {
            PF secondPokemon;
            if ((byte) sidePokemons.length == 2) {
                secondPokemon = lp.Ce(side, (byte) 1);
            } else {
                secondPokemon = null;
            }
            if (secondPokemon != null) {
                paramCount = 2;
                params = new String[]{M2(), secondPokemon.nz0(true)};
            }
        }
        return sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, paramCount, params);
    }

    @Override
    public final String Zc() {
        return sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 74, sm0_0.zb0);
    }

    @Override
    public final String M2() {
        a10_0 lp = this.lpT2;
        if (lp == null) {
            return "";
        }
        if (lp.nf == Cq.Jz0) {
            return sm0_0.c0(5020);
        }
        PF[] pokemons = lp.wI0[this.ZG0];
        for (int i = 0; i < pokemons.length; i++) {
            PF p = pokemons[i];
            if (p != null && p.zi0.Bn.GK0 != xg_1.rv) {
                return p.A60();
            }
        }
        PF first = this.lpT2.Ce(this.ZG0, (byte) 0);
        if (first != null) {
            return first.A60();
        }
        return "";
    }

    @Override
    public final byte f90() {
        a10_0 lp = this.lpT2;
        if (lp == null) {
            return tw0_0.e60.Com4;
        }
        PF[] pokemons = lp.wI0[this.ZG0];
        for (int i = 0; i < pokemons.length; i++) {
            PF p = pokemons[i];
            if (p == null) continue;
            short species = p.p10();
            if (species == 150 || species == 151 || species == 1025) {
                return 2;
            }
            if (species == 1023) {
                return (byte) (tw0_0.Ll0.cOM4((byte) 3) ? 3 : 2);
            }
            if (species >= 144 && species <= 146) {
                return 2;
            }
            if (species >= 243 && species <= 245) {
                return (byte) (tw0_0.Ll0.cOM4((byte) 4) ? 4 : 2);
            }
            if (species == 249 || species == 250) {
                return (byte) (tw0_0.Ll0.cOM4((byte) 4) ? 4 : 2);
            }
            if (species == 251) {
                return 2;
            }
            if (species >= 377 && species <= 386) {
                switch (species) {
                    case 377:
                    case 378:
                    case 379:
                    case 385:
                        return (byte) (tw0_0.Ll0.cOM4((byte) 3) ? 3 : 2);
                    case 380:
                    case 381:
                    case 386:
                        return 2;
                    case 382:
                    case 383:
                    case 384:
                        if (tw0_0.Ll0.cOM4((byte) 4)) return 4;
                        if (tw0_0.Ll0.cOM4((byte) 1)) return 1;
                        return 2;
                }
            }
            if (species >= 480 && species <= 494) {
                switch (species) {
                    case 485:
                        if (tw0_0.Ll0.cOM4((byte) 4)) return 4;
                        if (tw0_0.Ll0.cOM4((byte) 1)) return 1;
                        return 2;
                    case 494:
                        return 2;
                    default:
                        return (byte) (tw0_0.Ll0.cOM4((byte) 3) ? 3 : 2);
                }
            }
            if (species >= 638 && species <= 649) {
                return 2;
            }
            if (species >= 1000 && species <= 1002) {
                return 2;
            }
        }
        return tw0_0.e60.Com4;
    }

    @Override
    public final short WK0() {
        a10_0 lp = this.lpT2;
        if (lp == null) {
            return super.WK0();
        }
        PF[] pokemons = lp.wI0[this.ZG0];
        for (int i = 0; i < pokemons.length; i++) {
            PF p = pokemons[i];
            if (p == null) continue;
            short species = p.p10();
            if (species == 150 || species == 151) return 1143;
            if (species == 1023) return (f90() == 3) ? (short) 1201 : 1143;
            if (species == 1024) return 1142;
            if (species >= 144 && species <= 146) return 1143;
            if (species == 243) return (f90() == 4) ? (short) 1123 : 1143;
            if (species == 244) return (f90() == 4) ? (short) 1122 : 1143;
            if (species == 245) return (f90() == 4) ? (short) 1121 : 1143;
            if (species == 249) return (f90() == 4) ? (short) 1133 : 1143;
            if (species == 250) return (f90() == 4) ? (short) 1132 : 1143;
            if (species == 251) return 1143;
            if (species >= 377 && species <= 386) {
                switch (species) {
                    case 377:
                    case 378:
                    case 379:
                        return (f90() == 3) ? (short) 1204 : 1143;
                    case 380:
                    case 381:
                    case 386:
                        return 1143;
                    case 382:
                    case 383:
                    case 384:
                        if (f90() == 4) return 1174;
                        if (f90() == 1) return 470;
                        return 2;
                    case 385:
                        return (f90() == 3) ? (short) 1121 : 1143;
                }
            }
            if (species >= 480 && species <= 494) {
                switch (species) {
                    case 480:
                    case 481:
                    case 482:
                        return (f90() == 3) ? (short) 1118 : 1143;
                    case 483:
                    case 484:
                        return (f90() == 3) ? (short) 1121 : 1143;
                    case 485:
                        if (f90() == 4) return 1174;
                        if (f90() == 1) return 470;
                        return 2;
                    case 486:
                    case 488:
                    case 489:
                    case 490:
                    case 492:
                        return (f90() == 3) ? (short) 1126 : 1143;
                    case 487:
                        return (f90() == 3) ? (short) 1201 : 1143;
                    case 491:
                        return (f90() == 3) ? (short) 1201 : 1143;
                    case 493:
                        return (f90() == 3) ? (short) 1125 : 1143;
                    case 494:
                        return 1143;
                }
            }
            if (species >= 638 && species <= 649) {
                switch (species) {
                    case 643:
                        return 1140;
                    case 644:
                        return 1142;
                    case 646:
                        return 1141;
                    default:
                        return 1143;
                }
            }
            if (species >= 1000 && species <= 1002) {
                if (species == 1002) return 1139;
                return 1143;
            }
        }
        if (this.lpT2.wI0[this.ZG0].length > 1) {
            byte region = f90();
            switch (region) {
                case 0: return 341;
                case 1: return 476;
                case 3: return 1116;
                case 4: return 1125;
                default: return 1129;
            }
        }
        return super.WK0();
    }
}
