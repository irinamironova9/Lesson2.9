package part2task1and2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Map<String, List<Integer>> map = new HashMap<>();
        map.put("Кошка", List.of(random.nextInt(1000),
                random.nextInt(1000),
                random.nextInt(1000)));
        map.put("Собака", List.of(random.nextInt(1000),
                random.nextInt(1000),
                random.nextInt(1000)));
        map.put("Мышка", List.of(random.nextInt(1000),
                random.nextInt(1000),
                random.nextInt(1000)));
        map.put("Птица", List.of(random.nextInt(1000),
                random.nextInt(1000),
                random.nextInt(1000)));
        map.put("Лягушка", List.of(random.nextInt(1000),
                random.nextInt(1000),
                random.nextInt(1000)));

        System.out.println(map);

        Map<String, Integer> mapNew = makeNewMapFrom(map);
        System.out.println(mapNew);

        Map<Integer, String> list = new LinkedHashMap<>();
        for (int i = 1; i < 11; i++) {
            list.put(i, "Str" + i);
        }
        System.out.println(list);
    }

    public static Map<String, Integer> makeNewMapFrom(Map<String, List<Integer>> map) {
        Map<String, Integer> mapNew = new HashMap<>();
        for (String key : map.keySet()) {
            int sum = 0;
            for (Integer i : map.get(key)) {
                sum += i;
            }
            mapNew.put(key, sum);
        }
        return mapNew;
    }
}
