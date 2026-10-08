package ch.qos.logback.core.joran.sanity;

import java.util.ArrayList;
import java.util.List;

import ch.qos.logback.core.model.Model;

public interface SanityChecker {
    void check(Model model);

    default void deepFindAllModelsOfType(Class<?> type, List<Model> result, Model model) {
        if (type.isInstance(model)) {
            result.add(model);
        }
        for (Model child : model.getSubModels()) {
            deepFindAllModelsOfType(type, result, child);
        }
    }

    default List<Pair> deepFindNestedSubModelsOfType(Class<?> type, List<Model> models) {
        List<Pair> result = new ArrayList<>();
        for (Model model : models) {
            List<Model> nested = new ArrayList<>();
            for (Model child : model.getSubModels()) {
                deepFindAllModelsOfType(type, nested, child);
            }
            for (Model nestedModel : nested) {
                result.add(new Pair(model, nestedModel));
            }
        }
        return result;
    }
}
