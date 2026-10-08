package ch.qos.logback.core.pattern;

public abstract class FormattingConverter<E>
extends Converter<E> {
    static final int INITIAL_BUF_SIZE = 256;
    static final int MAX_CAPACITY = 1024;
    FormatInfo formattingInfo;

    public final FormatInfo getFormattingInfo() {
        return this.formattingInfo;
    }

    public final void setFormattingInfo(FormatInfo formatInfo) {
        if (this.formattingInfo == null) {
            this.formattingInfo = formatInfo;
            return;
        }
        throw new IllegalStateException("FormattingInfo has been already set");
    }

    @Override
    public final void write(StringBuilder stringBuilder, E event) {
        String string = this.convert(event);
        FormatInfo formatInfo = this.formattingInfo;
        if (formatInfo == null) {
            stringBuilder.append(string);
            return;
        }
        int n = formatInfo.getMin();
        int n2 = this.formattingInfo.getMax();
        if (string == null) {
            if (n > 0) {
                SpacePadder.spacePad(stringBuilder, n);
            }
            return;
        }
        int n3 = string.length();
        if (n3 > n2) {
            if (this.formattingInfo.isLeftTruncate()) {
                stringBuilder.append(string.substring(n3 - n2));
            } else {
                stringBuilder.append(string.substring(0, n2));
            }
        } else if (n3 < n) {
            if (this.formattingInfo.isLeftPad()) {
                SpacePadder.leftPad(stringBuilder, string, n);
            } else {
                SpacePadder.rightPad(stringBuilder, string, n);
            }
        } else {
            stringBuilder.append(string);
        }
    }
}
