package ch.qos.logback.core.subst;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
    enum TokenizerState { LITERAL_STATE, START_STATE, DEFAULT_VAL_STATE }

    final String pattern;
    final int patternLength;
    TokenizerState state;
    int pointer;

    public Tokenizer(String pattern) {
        state = TokenizerState.LITERAL_STATE;
        pointer = 0;
        this.pattern = pattern;
        patternLength = pattern.length();
    }

    private void handleDefaultValueState(char c, List<Token> tokenList, StringBuilder builder) {
        if (c == '$') {
            builder.append(':');
            addLiteralToken(tokenList, builder);
            builder.setLength(0);
            state = TokenizerState.START_STATE;
        } else if (c == '-') {
            tokenList.add(Token.DEFAULT_SEP_TOKEN);
            state = TokenizerState.LITERAL_STATE;
        } else if (c == '{') {
            builder.append(':');
            addLiteralToken(tokenList, builder);
            builder.setLength(0);
            tokenList.add(Token.CURLY_LEFT_TOKEN);
            state = TokenizerState.LITERAL_STATE;
        } else {
            builder.append(':').append(c);
            state = TokenizerState.LITERAL_STATE;
        }
    }

    private void handleStartState(char c, List<Token> tokenList, StringBuilder builder) {
        if (c == '{') tokenList.add(Token.START_TOKEN);
        else builder.append('$').append(c);
        state = TokenizerState.LITERAL_STATE;
    }

    private void handleLiteralState(char c, List<Token> tokenList, StringBuilder builder) {
        if (c == '$') {
            addLiteralToken(tokenList, builder);
            builder.setLength(0);
            state = TokenizerState.START_STATE;
        } else if (c == ':') {
            addLiteralToken(tokenList, builder);
            builder.setLength(0);
            state = TokenizerState.DEFAULT_VAL_STATE;
        } else if (c == '{') {
            addLiteralToken(tokenList, builder);
            tokenList.add(Token.CURLY_LEFT_TOKEN);
            builder.setLength(0);
        } else if (c == '}') {
            addLiteralToken(tokenList, builder);
            tokenList.add(Token.CURLY_RIGHT_TOKEN);
            builder.setLength(0);
        } else {
            builder.append(c);
        }
    }

    private void addLiteralToken(List<Token> tokenList, StringBuilder builder) {
        if (builder.length() == 0) return;
        tokenList.add(new Token(Token.Type.LITERAL, builder.toString()));
    }

    public List<Token> tokenize() {
        List<Token> tokenList = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        while (pointer < patternLength) {
            char c = pattern.charAt(pointer++);
            switch (state) {
                case LITERAL_STATE: handleLiteralState(c, tokenList, builder); break;
                case START_STATE: handleStartState(c, tokenList, builder); break;
                case DEFAULT_VAL_STATE: handleDefaultValueState(c, tokenList, builder); break;
            }
        }
        switch (state) {
            case START_STATE:
                builder.append('$');
                addLiteralToken(tokenList, builder);
                break;
            case DEFAULT_VAL_STATE:
                builder.append(':');
                addLiteralToken(tokenList, builder);
                break;
            case LITERAL_STATE:
                addLiteralToken(tokenList, builder);
                break;
        }
        return tokenList;
    }
}
