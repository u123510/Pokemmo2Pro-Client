package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class PitfallHoleTileBehavior extends BaseTileBehavior {
    public final bj0_1 Qp0;

    public PitfallHoleTileBehavior(bj0_1 owner) {
        super();
        this.Qp0 = owner;
    }

    @Override
    public final boolean zF(LT tile, bi0_1 entity, byte b3, byte b4) {
        ti0_1[] slots = this.Qp0.Tw;
        for (ti0_1 slot : slots) {
            float x = tile.Tz();
            float y = tile.HR();
            Bp0 origin = slot.iY;
            switch (slot.PC) {
                case 0:
                    if (x < origin.x - 1.0F || x > origin.x + 1.0F
                            || y < origin.y - 1.0F || y > origin.y + 4.0F) {
                        return false;
                    }
                    break;
                case 1:
                    if (x < origin.x - 4.0F || x > origin.x + 1.0F
                            || y < origin.y - 1.0F || y > origin.y + 1.0F) {
                        return false;
                    }
                    break;
                case 2:
                    if (x < origin.x - 1.0F || x > origin.x + 1.0F
                            || y < origin.y - 4.0F || y > origin.y + 1.0F) {
                        return false;
                    }
                    break;
                case 3:
                    if (x < origin.x - 1.0F || x > origin.x + 4.0F
                            || y < origin.y - 1.0F || y > origin.y + 1.0F) {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return true;
    }

    @Override
    public final boolean xB(LT tile, LT ignored, bi0_1 entity, byte b4) {
        if (entity.Ou()) {
            E90 target = (E90) entity;
            for (ti0_1 slot : this.Qp0.Tw) {
                slot.O1(target, tile.Tz(), tile.HR());
            }
        }
        return false;
    }
}
