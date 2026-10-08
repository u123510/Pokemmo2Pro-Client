package cn.pokemmo.pokemon.animation;

import f.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

/**
 * Narrow, file-based trace for action 1549 (the trainer throw animation).
 *
 * <p>This deliberately does not use the client's logging system: the affected
 * callbacks run on the render/tween path and may occur while logback is being
 * reconfigured.  It is diagnostic-only and is invoked exclusively for action
 * 1549, so it cannot change normal animation scheduling.</p>
 */
public class BallAnimationTraceLogger {
    /* Use an absolute workspace path: IDEA may set the run configuration's
       working directory to the project parent or to a generated directory. */
    private static final Path OUTPUT = Path.of("J:\\28887-obf-project", "build", "text",
            "battle-ball-animation-runtime.txt");
    private static int sampledMuActions;
    private static int sampledControllerCalls;

    static {
        reset();
        append(LocalDateTime.now() + " [" + Thread.currentThread().getName()
                + "] trace-loaded" + System.lineSeparator());
    }

    protected BallAnimationTraceLogger() {
    }

    public static synchronized void reset() {
        try {
            Files.createDirectories(OUTPUT.getParent());
            Files.writeString(OUTPUT,
                    "# action 1549 trace started " + LocalDateTime.now() + System.lineSeparator(),
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException ignored) {
            // Diagnostics must never interrupt the game.
        }
    }

    public static void event(String stage, Object... details) {
        StringBuilder line = new StringBuilder(256)
                .append(LocalDateTime.now())
                .append(" [").append(Thread.currentThread().getName()).append("] ")
                .append(stage);
        for (Object detail : details) {
            line.append(" | ").append(describe(detail));
        }
        append(line.append(System.lineSeparator()).toString());
    }

    public static void eventWithStack(String stage, Object... details) {
        event(stage, details);
        StackTraceElement[] stack = new Throwable().getStackTrace();
        StringBuilder line = new StringBuilder("  stack:");
        int emitted = 0;
        for (int i = 2; i < stack.length && emitted < 12; i++) {
            StackTraceElement frame = stack[i];
            line.append(" <- ").append(frame.getClassName()).append('.').append(frame.getMethodName())
                    .append(':').append(frame.getLineNumber());
            emitted++;
        }
        append(line.append(System.lineSeparator()).toString());
    }

    /** Keep the first calls for discovering an unexpected action id, but keep
     * tracing action 1549 indefinitely so repeated scheduling cannot be missed. */
    public static synchronized boolean shouldTraceMuAction(short action) {
        if (action == 1549) {
            return true;
        }
        return sampledMuActions++ < 200;
    }

    public static synchronized boolean shouldTraceControllerCall() {
        return sampledControllerCalls++ < 300;
    }

    private static String describe(Object value) {
        if (value == null) {
            return "null";
        }
        if (value instanceof String || value instanceof Number || value instanceof Boolean) {
            return String.valueOf(value);
        }
        return value.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(value));
    }

    private static synchronized void append(String value) {
        try {
            Files.createDirectories(OUTPUT.getParent());
            Files.writeString(OUTPUT, value, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
        } catch (IOException ignored) {
            // Diagnostics must never interrupt the game.
        }
    }
}
