package part1task3;

import java.util.HashMap;

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
}
