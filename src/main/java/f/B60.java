package f;

import cn.pokemmo.ui.richtext.StyledTextDocumentNode;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - B60 -> StyledTextDocumentNode
 */
public class B60 extends StyledTextDocumentNode {
    public B60(D90 d90, String string) {
        super(d90, string);
    }
}
