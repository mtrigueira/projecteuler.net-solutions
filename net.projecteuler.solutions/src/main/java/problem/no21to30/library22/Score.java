package problem.no21to30.library22;

import utils.Worth;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Score {
    private final AtomicInteger index = new AtomicInteger(1);

    static long nameScore(int index, String name) {
        return index * Worth.wordWorth(name);
    }

    public static long of(Stream<String> names) {
        Score score = new Score();
        return names.mapToLong(score::nameScore).sum();
    }

    private long nameScore(String name) {
        return nameScore(index.getAndIncrement(), name);
    }
}