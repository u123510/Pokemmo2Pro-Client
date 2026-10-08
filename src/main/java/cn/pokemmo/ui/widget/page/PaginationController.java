package cn.pokemmo.ui.widget.page;

import f.*;

public abstract class PaginationController extends ia0_1 {
    public final int en0;
    public final int DC;
    public final boolean vh0;
    public xe_1 mi0;
    public xe_1 g20;

    public PaginationController(int pageSize, int visiblePages) {
        this(pageSize, visiblePages, false);
    }

    public PaginationController(int pageSize, int visiblePages, boolean padPages) {
        super(1);
        this.en0 = visiblePages;
        this.DC = pageSize;
        this.vh0 = padPages;
        this.uf("pager");
    }

    public abstract void Ff(int page);

    public final void JK0(int page, int itemCount) {
        this.em();
        this.mi0 = new xe_1("<<");
        this.g20 = new xe_1(">>");
        this.mi0.RR(() -> this.bL0(page));
        this.g20.RR(() -> this.t20(page));
        this.F9(this.fU(), this.mi0);

        int pageCount = (int) Math.ceil((double) itemCount / this.DC);
        int previousCount = 1;
        int visibleCount = 1;
        int right = page;
        int left = page;
        while (previousCount < this.en0) {
            int next = right + 1;
            if (next <= pageCount) {
                visibleCount++;
                right = next;
            }
            if (left - 1 >= 0) {
                left--;
                visibleCount++;
            }
            if (visibleCount == previousCount) {
                break;
            }
            previousCount = visibleCount;
        }

        this.mi0.pw0(page > 0);
        if (this.vh0 && pageCount < this.en0) {
            for (int index = 0; index < Math.round((float) (this.en0 - pageCount) / 2.0F); index++) {
                xe_1 spacer = new xe_1(yr_1.pG("", index));
                spacer.Ll(false);
                this.F9(this.fU(), spacer);
            }
        }
        while (left < right) {
            int next = left + 1;
            int targetPage = left;
            xe_1 button = new xe_1("" + next);
            button.RR(() -> this.XE0(targetPage));
            if (left == page) {
                button.pw0(false);
            }
            this.F9(this.fU(), button);
            left = next;
        }
        if (this.vh0 && pageCount < this.en0) {
            for (int index = 0; index < (this.en0 - pageCount) / 2; index++) {
                xe_1 spacer = new xe_1(yr_1.pG("", index));
                spacer.Ll(false);
                this.F9(this.fU(), spacer);
            }
        }
        this.F9(this.fU(), this.g20);
        this.g20.pw0(page < pageCount - 1);
    }

    public final void XE0(int page) {
        this.Ff(page);
    }

    public final void t20(int page) {
        this.Ff(page + 1);
    }

    public final void bL0(int page) {
        this.Ff(page - 1);
    }
}
