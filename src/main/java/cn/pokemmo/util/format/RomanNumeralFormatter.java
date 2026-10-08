package cn.pokemmo.util.format;

import f.sw0;
import java.util.Locale;

public class RomanNumeralFormatter extends sw0 {
    public final boolean fs;

    public RomanNumeralFormatter(boolean lowerCase) {
        this.fs = lowerCase;
    }

    @Override
    public String MB(int value) {
        if (value < 1 || value > 39999) {
            return Integer.toString(value);
        }
        int[] values = {10000, 9000, 5000, 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String symbols = "ↂMↂↁMↁMCMDCDCXCLXLXIXVIVI";
        StringBuilder result = new StringBuilder();
        int symbolIndex = 0;
        for (int index = 0; index < values.length; index++) {
            int valuePart = values[index];
            int symbolLength = (index & 1) + 1;
            while (value >= valuePart) {
                value -= valuePart;
                result.append(symbols, symbolIndex, symbolIndex + symbolLength);
            }
            symbolIndex += symbolLength;
        }
        String output = result.toString();
        return this.fs ? output.toLowerCase(Locale.ENGLISH) : output;
    }
}
