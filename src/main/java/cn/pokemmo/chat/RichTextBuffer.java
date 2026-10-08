package cn.pokemmo.chat;

import f.*;
import java.util.LinkedList;

/**
 * 打字机效果富文本滚动标签与渲染缓存 (Rich Text Buffer / Typewriter Label)
 * 驱动对战解说字幕、NPC对话打字播报及聊天频道的超文本段流式滚动。
 *
 * 原混淆类: f.ZJ
 */
public class RichTextBuffer extends cn_0 {
    public ZJ asBridge() {
        return (ZJ) (Object) this;
    }

    public String Il0;
    public int lq;
    public boolean Q40;
    public final int ry;
    public final int COm4;
    public long Pr;
    public final LinkedList dr;
    public long x;
    public long dE0;
    public int Bz0;

    public RichTextBuffer() {
        this(1250, 0);
    }

    public RichTextBuffer(int i, int i2) {
        super("");
        this.Q40 = false;
        this.dr = new LinkedList();
        this.x = 0L;
        this.dE0 = 0L;
        this.Bz0 = 0;
        qF0(pa0_0.rr0);
        this.lq = 0;
        this.Il0 = "";
        this.dE0 = System.currentTimeMillis();
        this.ry = i;
        this.COm4 = i2;
    }

    public final void Lt() {
        this.Bz0 = 40;
    }

    @Override
    public final void HP(zk0_1 zk0_1) {
        super.HP(zk0_1);
        int speed = this.Bz0;
        if (speed <= 0) {
            a10_0 a10_0 = tw0_0.PK0;
            if (a10_0 != null && (a10_0.T2() || tw0_0.PK0.rU != null)) {
                speed = 10;
            } else {
                switch (dw_2.Ec0) {
                    case 2:
                        speed = 20;
                        break;
                    case 3:
                        speed = 15;
                        break;
                    case 4:
                        speed = 10;
                        break;
                    case 5:
                        speed = 5;
                        break;
                    case 6:
                        speed = 0;
                        break;
                    default:
                        speed = 25;
                        break;
                }
            }
        }
        if (this.Il0.length() > this.lq) {
            this.Q40 = false;
            int charsToAdd;
            if (speed < 1) {
                charsToAdd = Integer.MAX_VALUE;
            } else {
                charsToAdd = ((int) ((System.currentTimeMillis() - this.dE0) / ((long) speed))) - this.lq;
            }
            if (charsToAdd < 1) {
                return;
            }
            StringBuilder sb = new StringBuilder(this.j50.toString());
            while (charsToAdd > 0 && this.lq < this.Il0.length()) {
                char c = this.Il0.charAt(this.lq++);
                charsToAdd--;
                if (c == '{' && this.Il0.contains("}")) {
                    StringBuilder tag = new StringBuilder();
                    while (this.lq < this.Il0.length()) {
                        char c2 = this.Il0.charAt(this.lq++);
                        if (c2 == '}') {
                            break;
                        }
                        tag.append(c2);
                    }
                    String tagStr = tag.toString();
                    if ("SCROLL".equals(tagStr)) {
                        int newlineIdx = sb.indexOf("\n");
                        if (newlineIdx >= 0 && newlineIdx < sb.length() - 2) {
                            sb = new StringBuilder(sb.substring(newlineIdx + 1));
                        }
                        if (this.lq < this.Il0.length() && this.Il0.charAt(this.lq) == '\n') {
                            this.lq++;
                            sb.append('\n');
                        }
                    } else if (tagStr.startsWith("DELAY_")) {
                        try {
                            int delayVal = Integer.parseInt(tagStr.split("_")[1], 16);
                            this.dE0 = System.currentTimeMillis() + ((long) (delayVal * 33));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        sb.append(c);
                    }
                } else {
                    sb.append(c);
                }
            }
            Sk(sb.toString());
        } else if (this.Il0.length() == this.lq) {
            if (System.currentTimeMillis() - this.x <= ((long) this.ry)) {
                return;
            }
            if (this.Pr < 1L) {
                this.Pr = System.currentTimeMillis();
            }
            if (System.currentTimeMillis() - this.Pr <= ((long) this.COm4)) {
                return;
            }
            if (!this.dr.isEmpty()) {
                dc0_1 dc0_1 = (dc0_1) this.dr.poll();
                this.Il0 = dc0_1.PL;
                this.lq = 0;
                this.x = System.currentTimeMillis();
                this.dE0 = System.currentTimeMillis();
                this.Pr = 0L;
                Sk("");
            }
        }
    }

    public final boolean Eg0() {
        if (System.currentTimeMillis() - this.x <= ((long) this.ry)) {
            return false;
        }
        if (this.Il0.length() > this.lq || this.dr.size() > 0) {
            return false;
        }
        if (this.Pr < 1L) {
            return false;
        }
        return System.currentTimeMillis() - this.Pr > ((long) this.COm4);
    }
}
