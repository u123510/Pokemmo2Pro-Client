/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.util;

class CharSequenceState {
    final char c;
    int occurrences;

    public CharSequenceState(char c) {
        this.c = c;
        this.occurrences = 1;
    }

    public void incrementOccurrences() {
        ++this.occurrences;
    }
}

