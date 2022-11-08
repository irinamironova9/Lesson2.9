package part1task3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map map = new Map();
        map.addOrUpdate("Кошка", 125);
        map.addOrUpdate("Кошка", 25);
        map.addOrUpdate("Мышка", 14);
        map.addOrUpdate("Птица", 76);
        System.out.println(map);
    }
}
