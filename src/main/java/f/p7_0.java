package f;

import cn.pokemmo.ui.widget.model.ObservablePropertyModel;
import f.u1_0;

public interface p7_0 extends ObservablePropertyModel {
    @Override
    void Kj(Runnable var1);

    @Override
    void j00(u1_0 var1);

    @Override
    default void addChangeListener(Runnable listener) {
        Kj(listener);
    }

    @Override
    default void removeChangeListener(u1_0 listener) {
        j00(listener);
    }
}
