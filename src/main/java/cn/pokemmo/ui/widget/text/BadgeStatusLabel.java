package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

public class BadgeStatusLabel extends BaseLabel implements tr_1 {
    public final QT fE0;
    public final int TH0;
    public final NK Yk;
    public int p6;

    public BadgeStatusLabel(QT source, LH labels, NK list, int index) {
        super();
        this.fE0 = source;
        this.TH0 = index;
        this.Yk = list;
        if (index == -1) {
            this.p6 = source.v50().length - 1;
        } else {
            this.p6 = labels.g60(index);
        }
        _volatile mode = list.bC0();
        this.SU(labels.jh(mode, (byte) index));
        this.RR(() -> this.Im(source));
        this.dc0();
    }

    @Override
    public final String Ck() {
        return "pc-box-button";
    }

    @Override
    public final boolean nd0(i70_0 input) {
        this.fE0.getClass();
        int direction = 11;
        int count = this.fE0.kw0;
        if (input.Li()) {
            direction = input.zu;
            if (direction == 6) {
                direction = -1;
                le0_2 target = this.fE0;
                int row = input.f8;
                int column = input.AN;
                le0_2 candidate = target.dh0(row, column);
                if (candidate != null) {
                    target = candidate.BQ(row, column);
                }
                if (target instanceof BadgeStatusLabel) {
                    direction = ((BadgeStatusLabel) target).p6;
                }
                this.oa(direction);
                lpt6__0.v90(this);
                this.fE0.Z9 = this.p6;
                return true;
            }
            if (direction == 4) {
                this.fE0.AM();
            }
            return super.nd0(input);
        }
        if (!E00.ZU(input.zu) || !input.iT()) {
            return super.nd0(input);
        }

        boolean reverse = this.M.t5(xe_1.LPt7);
        int key = input.finally$;
        rp_0 binding = rp_0.I90;
        int ignored = dw_2.ff;
        if (binding != null && binding.Ov(key)) {
            if (!reverse) {
                this.fE0.h0(this.p6 - 1);
                return true;
            }
            this.oa(this.p6 - 1);
            this.ER.Mo0(false);
            lpt6__0.v90(this);
            this.fE0.Z9 = this.p6;
            return true;
        }

        key = input.finally$;
        binding = rp_0.Ni;
        if (binding != null && binding.Ov(key)) {
            if (!reverse) {
                this.fE0.h0(this.p6 + 1);
                return true;
            }
            this.oa(this.p6 + 1);
            this.ER.Mo0(false);
            lpt6__0.v90(this);
            this.fE0.Z9 = this.p6;
            return true;
        }

        key = input.finally$;
        binding = rp_0.kC0;
        if (binding != null && binding.Ov(key)) {
            int current = this.p6;
            if (current < direction) {
                return true;
            }
            int targetIndex = current - direction;
            if (!reverse) {
                this.fE0.h0(targetIndex);
                return true;
            }
            this.oa(targetIndex);
            this.ER.Mo0(false);
            lpt6__0.v90(this);
            this.fE0.Z9 = this.p6;
            return true;
        }

        key = input.finally$;
        binding = rp_0.synchronized$;
        if (binding != null && binding.Ov(key)) {
            int targetIndex = this.p6 + direction;
            if (targetIndex < direction * count) {
                QT source = this.fE0;
                if (source.rG0.length > direction) {
                    if (!reverse) {
                        source.h0(targetIndex);
                        return true;
                    }
                    this.oa(targetIndex);
                    this.ER.Mo0(false);
                    lpt6__0.v90(this);
                    this.fE0.Z9 = this.p6;
                    return true;
                }
            }
            if (!reverse) {
                int offset = this.A20 - ((BadgeStatusLabel) this.fE0.rG0[0].kh0).A20;
                int page = 0;
                int width = this.Yk.YG()[0].Mx;
                if (width > 0) {
                    page = offset / width;
                }
                this.Yk.EP(page);
            }
            return true;
        }
        return super.nd0(input);
    }

    public final void oa(int index) {
        if (this.TH0 == -1 || this.Yk.dz0 != _volatile.Bf0 || index < 0) {
            return;
        }
        j1_0[] rows = this.fE0.rG0;
        if (index >= rows.length - 1) {
            return;
        }
        j1_0 row = rows[index];
        BadgeStatusLabel target = (BadgeStatusLabel) row.kh0;
        if (target.Yk.dz0 != this.Yk.dz0) {
            return;
        }
        int current = this.p6;
        if (current == index) {
            return;
        }
        if (current > index) {
            BadgeStatusLabel previous = (BadgeStatusLabel) rows[current].kh0;
            rows[current].tv0(null);
            int end = this.p6;
            int position = index;
            while (position <= end) {
                BadgeStatusLabel next = (BadgeStatusLabel) rows[position].kh0;
                rows[position].tv0(previous);
                if (previous.TH0 != -1 && position != -1) {
                    previous.p6 = position;
                }
                position++;
                previous = next;
            }
        } else {
            BadgeStatusLabel previous = (BadgeStatusLabel) rows[current].kh0;
            row.tv0(null);
            int position = index - 1;
            while (position >= this.p6) {
                BadgeStatusLabel next = (BadgeStatusLabel) rows[position].kh0;
                rows[position].tv0(target);
                if (target.TH0 != -1 && position != -1) {
                    target.p6 = position;
                }
                position--;
                target = next;
            }
            rows[index].tv0(previous);
        }
        if (this.TH0 != -1 && index != -1) {
            this.p6 = index;
        }
        this.fE0.AM();
    }

    public final void Im(QT source) {
        this.Yk.EP(0);
        ye_0 row = this.Yk.YG()[this.Yk.yM];
        int x = row.A20 + row.e80;
        int centerX = source.a3() / 2 + x;
        int y = row.SB0 + row.y9;
        int centerY = source.k5() / 2 + y;
        source.fx0(centerX, centerY);
    }
}
