package com.careerit.cj.cbook;

import java.time.Year;
import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    private static final AtomicInteger counter = new AtomicInteger(1000);

    private IdGenerator() {
    }

    public static String generateId() {
        return "C-" + Year.now().getValue() + "-" + counter.incrementAndGet();
    }
}
