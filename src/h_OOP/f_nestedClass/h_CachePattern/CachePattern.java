package h_OOP.f_nestedClass.h_CachePattern;

import java.util.HashMap;
import java.util.Map;

class Cache {
    // 캐시 항목 정보를 담는 CacheEntry 는 Cache 클래스에서만 함께 쓰여 중첩 클래스.
    private static class CacheEntry {
        long timeInserted;
        Object value;
    }

    private final Map<String, CacheEntry> cacheMap = new HashMap<>();

    public void store(String key, Object value) {
        CacheEntry entry = new CacheEntry();
        entry.value = value;
        entry.timeInserted = System.currentTimeMillis();
        cacheMap.put(key, entry);
    }

    public Object get(String key) {
        CacheEntry entry = cacheMap.get(key);
        return  (entry == null) ? null : entry.value;
    }
}

public class CachePattern {
    static void main() {
        Cache c = new Cache();
        c.store("a", "str");
        c.store("b", 42);
        System.out.println(c.get("a"));
        System.out.println(c.get("b"));
    }
}
