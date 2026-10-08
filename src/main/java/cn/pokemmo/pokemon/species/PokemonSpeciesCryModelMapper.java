package cn.pokemmo.pokemon.species;

import f.*;

public abstract class PokemonSpeciesCryModelMapper {

    protected PokemonSpeciesCryModelMapper() {
    }

    public static short Prn(int i, short s) {
        switch (s) {
            case 494:
                return 125;
            case 504:
                return 128;
            case 517:
                return 126;
            case 518:
                return 127;
            case 546:
                return 209;
            case 548:
                return 129;
            case 552:
                return 131;
            case 570:
                return 195;
            case 572:
                return 130;
            case 585:
                switch (i) {
                    case 0:
                        return 217;
                    case 1:
                        return 218;
                    case 2:
                        return 219;
                    case 3:
                        return 220;
                    default:
                        return 0;
                }
            case 638:
                return 115;
            case 639:
                return 116;
            case 640:
                return 117;
            case 647:
                return 122;
            case 648:
                return 123;
            default:
                return 0;
        }
    }

    public static short gu(short s, boolean isFemale, boolean isShiny, int form) {
        if (s < 3) {
            return s;
        }
        if (s == 3) {
            if (isFemale) {
                s = (short) (s + 1);
            }
            return s;
        }
        short cur = (short) (s + 1);
        if (s < 25) {
            return cur;
        }
        if (s == 25) {
            if (isFemale) {
                cur = (short) (cur + 1);
            }
            return cur;
        }
        cur = (short) (cur + 1);
        if (s < 154) {
            return cur;
        }
        if (s == 154) {
            if (isFemale) {
                cur = (short) (cur + 1);
            }
            return cur;
        }
        cur = (short) (cur + 1);
        if (s <= 172) {
            return (short) (cur + form);
        }
        cur = (short) (cur + 1);
        if (s <= 201) {
            return (short) (cur + form);
        }
        cur = (short) (cur + 27);
        if (s == 202) {
            if (isFemale) {
                cur = (short) (cur + 1);
            }
            return cur;
        }
        cur = (short) (cur + 1);
        if (s < 208) {
            return cur;
        }
        if (s == 208) {
            if (isFemale) {
                cur = (short) (cur + 1);
            }
            return cur;
        }
        cur = (short) (cur + 1);
        if (s < 214) {
            return cur;
        }
        if (s == 214) {
            if (isFemale) {
                cur = (short) (cur + 1);
            }
            return cur;
        }
        cur = (short) (cur + 1);
        if (s <= 386) {
            return (short) (cur + form);
        }
        cur = (short) (cur + 3);
        if (s <= 412) {
            return (short) (cur + form);
        }
        cur = (short) (cur + 2);
        if (s <= 413) {
            return (short) (cur + form);
        }
        cur = (short) (cur + 2);
        if (s < 415) {
            return cur;
        }
        if (s == 415) {
            if (isFemale) {
                cur = (short) (cur + 1);
            }
            return cur;
        }
        cur = (short) (cur + 1);
        if (s <= 422) {
            return (short) (cur + form);
        }
        cur = (short) (cur + 1);
        if (s <= 423) {
            return (short) (cur + form);
        }
        cur = (short) (cur + 1);
        if (s < 443) {
            return cur;
        }
        if (s == 443) {
            if (isFemale) {
                cur = (short) (cur + 1);
            }
            return cur;
        }
        cur = (short) (cur + 1);
        if (s == 444) {
            if (isFemale) {
                cur = (short) (cur + 1);
            }
            return cur;
        }
        cur = (short) (cur + 1);
        if (s == 445) {
            if (isFemale) {
                cur = (short) (cur + 1);
            }
            return cur;
        }
        cur = (short) (cur + 1);
        if (s < 449) {
            return cur;
        }
        if (s == 449) {
            if (isFemale) {
                cur = (short) (cur + 1);
            }
            return cur;
        }
        cur = (short) (cur + 1);
        if (s == 450) {
            if (isFemale) {
                cur = (short) (cur + 1);
            }
            return cur;
        }
        cur = (short) (cur + 1);
        if (s <= 479) {
            return (short) (cur + form);
        }
        cur = (short) (cur + 5);
        if (s <= 487) {
            return (short) (cur + form);
        }
        cur = (short) (cur + 1);
        if (s <= 492) {
            return (short) (cur + form);
        }
        cur = (short) (cur + 1);
        if (s == 493) {
            return (short) (cur + form);
        }
        cur = (short) (cur + 18);
        if (isShiny) {
            if (s == 585) {
                return (short) (cur + form);
            }
            return cur;
        }
        if (Prn(form, s) > 0) {
            return cur;
        }
        return 0;
    }

    public static short TF(short s) {
        while (s > 5094) {
            s = (short) (s - 1000);
        }
        if (s < 4095) {
            return 1;
        }
        s = (short) (s - 4095);
        if (s <= 0) {
            return 1;
        }
        if (s < 3) {
            return s;
        }
        if (s == 3 || s == 4) {
            return 3;
        }
        s = (short) (s - 1);
        if (s < 25) {
            return s;
        }
        if (s == 25 || s == 26) {
            return 25;
        }
        s = (short) (s - 1);
        if (s < 154) {
            return s;
        }
        if (s == 154 || s == 155) {
            return 154;
        }
        s = (short) (s - 1);
        if (s < 172) {
            return s;
        }
        if (s == 172 || s == 173) {
            return 172;
        }
        s = (short) (s - 1);
        if (s < 201) {
            return s;
        }
        if (s <= 228) {
            return 201;
        }
        s = (short) (s - 27);
        if (s == 202 || s == 203) {
            return 202;
        }
        s = (short) (s - 1);
        if (s < 208) {
            return s;
        }
        if (s == 208 || s == 209) {
            return 208;
        }
        s = (short) (s - 1);
        if (s < 214) {
            return s;
        }
        if (s == 214 || s == 215) {
            return 214;
        }
        s = (short) (s - 1);
        if (s < 386) {
            return s;
        }
        if (s < 389) {
            return 386;
        }
        s = (short) (s - 3);
        if (s < 412) {
            return s;
        }
        if (s <= 414) {
            return 412;
        }
        s = (short) (s - 2);
        if (s <= 415) {
            return 413;
        }
        s = (short) (s - 2);
        if (s < 415) {
            return s;
        }
        if (s == 415 || s == 416) {
            return 415;
        }
        s = (short) (s - 1);
        if (s < 422) {
            return s;
        }
        if (s == 422 || s == 423) {
            return 422;
        }
        s = (short) (s - 1);
        if (s == 423 || s == 424) {
            return 423;
        }
        s = (short) (s - 1);
        if (s < 443) {
            return s;
        }
        if (s == 443 || s == 444) {
            return 443;
        }
        s = (short) (s - 1);
        if (s == 444 || s == 445) {
            return 444;
        }
        s = (short) (s - 1);
        if (s == 445 || s == 446) {
            return 445;
        }
        s = (short) (s - 1);
        if (s < 449) {
            return s;
        }
        if (s == 449 || s == 450) {
            return 449;
        }
        s = (short) (s - 1);
        if (s == 450 || s == 451) {
            return 450;
        }
        s = (short) (s - 1);
        if (s < 479) {
            return s;
        }
        if (s <= 484) {
            return 479;
        }
        s = (short) (s - 5);
        if (s < 487) {
            return s;
        }
        if (s == 487 || s == 488) {
            return 487;
        }
        s = (short) (s - 1);
        if (s < 492) {
            return s;
        }
        if (s == 492 || s == 493) {
            return 492;
        }
        s = (short) (s - 1);
        if (s <= 511) {
            return 493;
        }
        s = (short) (s - 18);
        if (s > 649 && Prn(0, s) < 1) {
            return 1;
        }
        if (s < 585) {
            return s;
        }
        if (s <= 588) {
            return 585;
        }
        return (short) (s - 4);
    }

    public static short dM(short s) {
        if (s >= 1003 && s <= 1018) {
            return (short) (216 + (s - 1003));
        }
        if (s >= 1029 && s <= 1046) {
            return (short) (259 + (s - 1029));
        }
        return 0;
    }
}
