package part1task3;

import java.util.HashMap;
import java.util.Objects;

public class Map {
    private final HashMap<String, Integer> map = new HashMap<>();

    public Map() {
    }

    public void addOrUpdate(String key, int value) {
        if (key == null || key.isBlank()) {
            throw new IllegalArgumentException();
        }
        if (map.containsKey(key)) {
            if (map.get(key) == value) {
                throw new RuntimeException("Данная пара ключ-значение уже добавлены!");
            } else {
                map.replace(key, value);
            }
        } else {
            map.put(key, value);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String key : map.keySet()) {
            sb.append(key).append(" - ").append(map.get(key)).append('\n');
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Map map1 = (Map) o;
        return Objects.equals(map, map1.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}
