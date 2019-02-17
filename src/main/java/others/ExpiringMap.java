package others;

import java.util.concurrent.*;

public class ExpiringMap<K, V> {

    private ConcurrentMap<K, V> map = new ConcurrentHashMap<>();
    private ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    private ConcurrentMap<K, ScheduledFuture> schedules = new ConcurrentHashMap<>();

    public synchronized void put(K k, V v, long ms) {
        ScheduledFuture scheduledFuture = schedules.get(k);
        if(scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }

        map.put(k, v);

        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(() -> {
            map.remove(k);
            schedules.remove(k);
        }, ms, TimeUnit.MILLISECONDS);

        schedules.put(k, schedule);
    }

    public V get(K k) {
        return map.get(k);
    }

    public int size() {
        return map.size();
    }

    @Override
    public String toString() {
        return map.toString();
    }

    public static void main(String[] args) {
        ExpiringMap<String, Integer> map = new ExpiringMap<>();
        map.put("c", 100, 100);
        map.put("A", 1000, 1000);
        map.put("B", 500, 500);

        new Thread(()->{
            while(map.size() > 0) {
                System.out.println(map);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
