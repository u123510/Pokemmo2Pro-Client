package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.OptionHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SimpleRuleStore extends ContextAwareBase implements RuleStore {
    static String KLEENE_STAR = "*";
    HashMap rules;
    List transparentPathParts;
    Map pathPartsMapForRenaming;

    public SimpleRuleStore(Context context) {
        this.rules = new HashMap();
        this.transparentPathParts = new ArrayList(2);
        this.pathPartsMapForRenaming = new HashMap(2);
        setContext(context);
    }

    private Supplier matchActionsWithoutTransparentPartsAndRenamedParts(ElementPath path) {
        return internalMatchAction(renamePathParts(removeTransparentPathParts(path)));
    }

    private Supplier internalMatchAction(ElementPath path) {
        Supplier supplier = fullPathMatch(path);
        if (supplier != null) {
            return supplier;
        }
        supplier = suffixMatch(path);
        if (supplier != null) {
            return supplier;
        }
        supplier = prefixMatch(path);
        if (supplier != null) {
            return supplier;
        }
        supplier = middleMatch(path);
        return supplier;
    }

    private boolean isSuffixPattern(ElementSelector selector) {
        return selector.size() > 1 && KLEENE_STAR.equals(selector.get(0));
    }

    private boolean isKleeneStar(String part) {
        return KLEENE_STAR.equals(part);
    }

    private static boolean lambda$removeTransparentPathParts$0(String part, String candidate) {
        return candidate.equalsIgnoreCase(part);
    }

    public void addTransparentPathPart(String pathPart) {
        if (pathPart == null) {
            throw new IllegalArgumentException("pathPart cannot be null");
        }
        pathPart = pathPart.trim();
        if (pathPart.isEmpty()) {
            throw new IllegalArgumentException("pathPart cannot be empty or to consist of only spaces");
        }
        if (pathPart.contains("/")) {
            throw new IllegalArgumentException("pathPart cannot contain '/', i.e. the forward slash character");
        }
        this.transparentPathParts.add(pathPart);
    }

    public void addPathPathMapping(String from, String to) {
        this.pathPartsMapForRenaming.put(from, to);
    }

    public void addRule(ElementSelector selector, Supplier supplier) {
        if (this.rules.get(selector) == null) {
            this.rules.put(selector, supplier);
            return;
        }
        throw new IllegalStateException(selector.toString() + " already has an associated action supplier");
    }

    public void addRule(ElementSelector selector, String actionClassName) {
        try {
            Class<Action> actionClass = Action.class;
            OptionHelper.instantiateByClassName(actionClassName, actionClass, this.context);
        } catch (Exception exception) {
            addError("Could not instantiate class [" + actionClassName + "]", exception);
        }
    }

    public Supplier matchActions(ElementPath path) {
        Supplier supplier = internalMatchAction(path);
        if (supplier != null) {
            return supplier;
        }
        return matchActionsWithoutTransparentPartsAndRenamedParts(path);
    }

    public ElementPath removeTransparentPathParts(ElementPath path) {
        ArrayList parts = new ArrayList(path.partList.size());
        for (Object value : path.partList) {
            String part = (String) value;
            Predicate predicate = candidate -> lambda$removeTransparentPathParts$0(part, (String) candidate);
            if (this.transparentPathParts.stream().noneMatch(predicate)) {
                parts.add(part);
            }
        }
        return new ElementPath(parts);
    }

    public ElementPath renamePathParts(ElementPath path) {
        ArrayList parts = new ArrayList(path.partList.size());
        for (Object value : path.partList) {
            String part = (String) value;
            parts.add(this.pathPartsMapForRenaming.getOrDefault(part, part));
        }
        return new ElementPath(parts);
    }

    public Supplier fullPathMatch(ElementPath path) {
        for (Object value : this.rules.keySet()) {
            ElementSelector selector = (ElementSelector) value;
            if (selector.fullPathMatch(path)) {
                return (Supplier) this.rules.get(selector);
            }
        }
        return null;
    }

    public Supplier suffixMatch(ElementPath path) {
        int longest = 0;
        ElementSelector best = null;
        for (Object value : this.rules.keySet()) {
            ElementSelector selector = (ElementSelector) value;
            if (isSuffixPattern(selector)) {
                int matchLength = selector.getTailMatchLength(path);
                if (matchLength > longest) {
                    longest = matchLength;
                    best = selector;
                }
            }
        }
        return best == null ? null : (Supplier) this.rules.get(best);
    }

    public Supplier prefixMatch(ElementPath path) {
        int longest = 0;
        ElementSelector best = null;
        for (Object value : this.rules.keySet()) {
            ElementSelector selector = (ElementSelector) value;
            if (isKleeneStar(selector.peekLast())) {
                int matchLength = selector.getPrefixMatchLength(path);
                if (matchLength == selector.size() - 1 && matchLength > longest) {
                    longest = matchLength;
                    best = selector;
                }
            }
        }
        return best == null ? null : (Supplier) this.rules.get(best);
    }

    public Supplier middleMatch(ElementPath path) {
        int longest = 0;
        ElementSelector best = null;
        for (Object value : this.rules.keySet()) {
            ElementSelector selector = (ElementSelector) value;
            String tail = selector.peekLast();
            String head = selector.size() > 1 ? selector.get(0) : null;
            if (!isKleeneStar(tail) || !isKleeneStar(head)) {
                continue;
            }
            List parts = selector.getCopyOfPartList();
            if (parts.size() > 2) {
                parts.remove(0);
                parts.remove(parts.size() - 1);
            }
            ElementSelector middle = new ElementSelector(parts);
            int matchLength = middle.isContainedIn(path) ? middle.size() : 0;
            if (matchLength > longest) {
                longest = matchLength;
                best = selector;
            }
        }
        return best == null ? null : (Supplier) this.rules.get(best);
    }

    @Override
    public String toString() {
        return new StringBuilder("SimpleRuleStore ( rules = ").append(this.rules).append("   )").toString();
    }
}
