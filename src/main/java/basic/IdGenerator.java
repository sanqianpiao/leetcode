package basic;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    private final int nodeId;
    private final AtomicInteger seq;

    public IdGenerator(int nodeId) {
        this.nodeId = nodeId;
        if (nodeId > 1023) throw new IllegalArgumentException("nodeId should be range from 0 to 1023");
        seq = new AtomicInteger(0);
    }

    public long nextId() {
        int last = 0;
        do {
            last = seq.get();
        } while (seq.compareAndSet(last, (last + 1) % 4096) == false);
        long id = System.currentTimeMillis() << 22 | nodeId << 12 | last;
        return id;
    }
}
