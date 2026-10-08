package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public abstract class BaseHeaderBannerComponent extends BaseComponent {
    public boolean kf;
    public vg0_1 DD0;
    public int iZ;
    public int Zs0;
    public int hu;
    public int Zv;
    public int n40;
    public int Jf;

    public BaseHeaderBannerComponent() {
        super();
        this.kf = true;
        this.DD0 = vg0_1.zO;
    }

    @Override
    public boolean nd0(i70_0 i70_0Var) {
        if (E00.C10(i70_0Var.zu) && i70_0Var.nA0 >= 0) {
            BL();
        }
        vg0_1 vg0_1Var = vg0_1.zO;
        if (this.DD0 != vg0_1Var) {
            if (i70_0Var.LI0()) {
                this.DD0 = vg0_1Var;
            } else if (i70_0Var.zu == 6) {
                int dx = i70_0Var.f8 - this.iZ;
                int dy = i70_0Var.AN - this.Zs0;
                R1();
                Se();
                int newX1 = this.hu;
                int newY1 = this.Zv;
                int newX2 = this.n40;
                int newY2 = this.Jf;
                le0_2 parent = this.K20;
                if (parent != null) {
                    int parentMinX = parent.A20 + parent.e80;
                    int parentMaxX = parent.cz();
                    int width = this.n40 - this.hu;
                    newX1 = Math.max(parentMinX, Math.min(parentMaxX - width, this.hu + dx));
                    newX2 = Math.min(parentMaxX, Math.max(parentMinX + width, this.n40 + dx));
                } else {
                    newX1 = this.hu + dx;
                    newX2 = this.n40 + dx;
                }
                le0_2 parentY = this.K20;
                if (parentY != null) {
                    int parentMinY = parentY.SB0 + parentY.y9;
                    int parentMaxY = parentY.VM();
                    int height = this.Jf - this.Zv;
                    newY1 = Math.max(parentMinY, Math.min(parentMaxY - height, this.Zv + dy));
                    newY2 = Math.min(parentMaxY, Math.max(parentMinY + height, this.Jf + dy));
                } else {
                    newY1 = this.Zv + dy;
                    newY2 = this.Jf + dy;
                }
                le0_2 parentClamp = this.K20;
                if (parentClamp != null) {
                    newY1 = Math.max(newY1, parentClamp.SB0 + parentClamp.y9);
                    newX1 = Math.max(newX1, parentClamp.A20 + parentClamp.e80);
                    newX2 = Math.min(newX2, parentClamp.cz());
                    newY2 = Math.min(newY2, parentClamp.VM());
                }
                E40(newX1, newY1);
                oY(Math.max(R1(), newX2 - newX1), Math.max(Se(), newY2 - newY1));
            }
            return true;
        }
        if (!i70_0Var.VP && i70_0Var.zu == 3 && i70_0Var.nA0 == 0) {
            int mouseX = i70_0Var.f8;
            int mouseY = i70_0Var.AN;
            this.iZ = mouseX;
            this.Zs0 = mouseY;
            int startX = this.A20;
            this.hu = startX;
            int startY = this.SB0;
            this.Zv = startY;
            this.n40 = startX + this.Mx;
            this.Jf = startY + this.OB;
            boolean isNearLeft = mouseX < startX + this.e80;
            boolean isNearRight = mouseX >= cz();
            boolean isNearBottom = mouseY >= VM();
            vg0_1 handle;
            if (yv0(mouseX, mouseY)) {
                handle = this.kf ? vg0_1.Nl : vg0_1Var;
            } else {
                boolean isNearTop = mouseY < this.SB0;
                if (isNearLeft) {
                    if (isNearTop) {
                        handle = vg0_1.w6;
                    } else if (isNearBottom) {
                        handle = vg0_1.r;
                    } else {
                        handle = vg0_1.Gd0;
                    }
                } else if (isNearRight) {
                    if (isNearTop) {
                        handle = vg0_1.Nm0;
                    } else if (isNearBottom) {
                        handle = vg0_1.KB0;
                    } else {
                        handle = vg0_1.on;
                    }
                } else if (isNearTop) {
                    handle = vg0_1.nj0;
                } else if (isNearBottom) {
                    handle = vg0_1.LPT9;
                } else {
                    handle = vg0_1Var;
                }
            }
            this.DD0 = handle;
            if (handle != vg0_1Var) {
                return true;
            }
        }
        if (super.nd0(i70_0Var)) {
            return true;
        }
        return E00.C10(i70_0Var.zu);
    }

    public final void RE(boolean z) {
        this.kf = z;
    }
}
