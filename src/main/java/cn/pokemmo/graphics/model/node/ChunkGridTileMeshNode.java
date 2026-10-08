package cn.pokemmo.graphics.model.node;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.graphics.model.node.BaseSceneNodeModel;

public class ChunkGridTileMeshNode extends BaseSceneNodeModel {
    public final es_1 Gh;
    public final m9[][][] Bp0;

    public ChunkGridTileMeshNode(wd_0 wd_0, YM ym, m9[][][] m9Arr, es_1 es_1) {
        super(wd_0, wd_0.Ku0, wd_0.Xj, ym);
        this.Bp0 = m9Arr;
        this.Gh = es_1;
        xg0(wd_0.lG, wd_0.HE0);
    }
}
