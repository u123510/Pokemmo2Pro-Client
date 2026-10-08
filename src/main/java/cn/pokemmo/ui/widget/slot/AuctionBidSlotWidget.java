package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.slot.BaseItemSlotWidget;

public class AuctionBidSlotWidget extends BaseItemSlotWidget {
    public final j8_0 lPt7;

    public AuctionBidSlotWidget(j8_0 owner) {
        super((short)0, CH0.j1, (short)0, (short)0, true);
        this.lPt7 = owner;
        this.ge = 12;
        this.ej0 = 6;
        this.uf("item-slot");
    }

    public final void Hr(int width, int height) {
        this.ge = 12;
        this.ej0 = 10;
    }

    public final void Uj0(byte itemType, short itemId, short amount) {
        super.Uj0(itemType, itemId, amount);
        j8_0 owner = this.lPt7;
        if (this == owner.UJ) {
            return;
        }

        byte itemCount = 0;
        int[] categoryCounts = new int[5];
        short[] itemIds = new short[10];
        int itemIdsLength = 0;
        int specialItemCount = 0;
        for (AuctionBidSlotWidget slot : owner.pd0) {
            short slotItemId = slot.wE0;
            if (slotItemId < 1) {
                continue;
            }
            if (slotItemId == 1446) {
                specialItemCount++;
            }
            itemCount++;
            int nextLength = itemIdsLength + 1;
            if (nextLength > itemIds.length) {
                short[] expanded = new short[Math.max(itemIds.length << 1, nextLength)];
                System.arraycopy(itemIds, 0, expanded, 0, itemIds.length);
                itemIds = expanded;
            }
            itemIds[itemIdsLength] = slotItemId;
            itemIdsLength = nextLength;
        }

        short[] collectedItemIds = new short[itemIdsLength];
        if (itemIdsLength != 0) {
            System.arraycopy(itemIds, 0, collectedItemIds, 0, itemIdsLength);
        }
        for (int index = 0; index < itemIdsLength; index++) {
            mc0_1 item = gu0.l2.lPT6(collectedItemIds[index]);
            byte category = item.I90;
            if (category >= 0) {
                categoryCounts[category] += item.ci;
            }
        }

        mc0_1 result = null;
        if (specialItemCount > 0) {
            if (specialItemCount == 3) {
                result = gu0.l2.lPT6((short)1446);
            }
        } else if (itemCount > 1) {
            for (Object value : gu0.l2.Pd0.values()) {
                mc0_1 candidate = (mc0_1)value;
                if (!candidate.X80() || candidate.EX > 0) {
                    continue;
                }
                boolean matches = true;
                for (int category = 0; category < 5; category++) {
                    if (categoryCounts[category] < candidate.mK[category]) {
                        matches = false;
                        break;
                    }
                }
                if (matches && (result == null || result.xB0 < candidate.xB0)) {
                    result = candidate;
                }
            }
        }

        short resultId = result == null ? 0 : result.Z8;
        if (resultId < 1) {
            owner.UJ.Ll(false);
            owner.qH.Ll(false);
            return;
        }

        mc0_1 resultItem = gu0.l2.lPT6(resultId);
        owner.UJ.Uj0((byte)0, resultId, (short)-1);
        owner.qH.Sk(lb0_2.nk(resultItem, false).trim());
        owner.UJ.Ll(true);
        owner.qH.Ll(true);
    }

    public final void UR(K5 item) {
        j8_0 owner = this.lPt7;
        if (this == owner.UJ) {
            return;
        }
        if (item == null) {
            this.Uj0((byte)0, (short)0, (short)0);
            return;
        }
        if (item.cL == null) {
            return;
        }

        short itemId = item.nn.wQ;
        boolean accepted = itemId >= 7030 && itemId <= 7039
                || itemId >= 1030 && itemId <= 1039
                || itemId == 1446;
        if (!accepted) {
            tw0_0.rl.qK(sm0_0.c0(8555));
            return;
        }
        if (!owner.f5(itemId)) {
            tw0_0.rl.qK(sm0_0.wa0(6074, item.Ua()));
            return;
        }
        this.Uj0(item.nn.N50, item.nn.wQ, (short)1);
    }

    public final void a80(Jn0 event) {
        this.K8();
    }

    public final void K8() {
        this.RY(48, 48);
        this.g2(48, 48);
        this.oY(48, 48);
    }
}
