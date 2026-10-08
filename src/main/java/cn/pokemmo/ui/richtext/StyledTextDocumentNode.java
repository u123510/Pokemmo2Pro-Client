package cn.pokemmo.ui.richtext;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.D90;
import f.ay_0;

public class StyledTextDocumentNode
extends BaseStyledDocumentNode {
    public final String br;

    public StyledTextDocumentNode(D90 d90, String string) {
        super(d90);
        ay_0.o1(string, "text");
        this.br = string;
    }
}
