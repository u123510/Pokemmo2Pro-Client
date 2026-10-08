package cn.pokemmo.ui.window.chat;

import f.*;
import java.nio.ByteBuffer;

public class ChatChannelUserStatusEntry extends OL {
    public final OL[] Nd;

    public ChatChannelUserStatusEntry(ByteBuffer byteBuffer) {
        super();
        int n = byteBuffer.getInt();
        int[] nArray = new int[n];
        int[] nArray2 = new int[n];
        this.KB = new String[n];
        this.Nd = new OL[n];
        for (int i = 0; i < n; ++i) {
            nArray[i] = byteBuffer.getInt();
            nArray2[i] = byteBuffer.getInt();
        }
        for (int i = 0; i < n; ++i) {
            if (nArray[i] == 0) {
                this.KB[i] = yr_1.pG("SEQARC_", i);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                byteBuffer.position(nArray[i]);
                while (true) {
                    char c;
                    if ((c = (char)byteBuffer.get()) == '\0') {
                        this.KB[i] = stringBuilder.toString().trim();
                        break;
                    }
                    stringBuilder.append(c);
                }
            }
            int n2 = nArray2[i];
            if (n2 == 0) {
                this.Nd[i] = new OL();
            } else {
                byteBuffer.position(n2);
                this.Nd[i] = new OL(byteBuffer);
            }
        }
    }
}
