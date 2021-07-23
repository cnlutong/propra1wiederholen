package propra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Zulassung {
    public static void main(String[] args) {
        Zulassung zulassung = new Zulassung();
        zulassung.listen();
        System.out.println("\n// -----------------------------\n");
        zulassung.hashmap();
        System.out.println("\n// -----------------------------\n");
        zulassung.set();
    }

    private void listen() {
        // Beginnen Sie hier
        List<Integer> punktzahlen = new ArrayList<>(List.of(42,23,12,54,20));
        for (Integer punktzahl: punktzahlen) {
            System.out.println(punktzahl);
        }

        punktzahlen.add(30);
        punktzahlen.remove(2);
    }

    private void hashmap() {
        HashMap<Integer, Integer> matrikelpunk = new HashMap<>();
        matrikelpunk.put(1942000, 42);
        matrikelpunk.put(1942001, 21);
        matrikelpunk.put(1972001, 31);
        System.out.println(matrikelpunk);
        matrikelpunk.put(1942000, 45);
        System.out.println(matrikelpunk);
        System.out.println(matrikelpunk.get(1942000));
        for (Map.Entry<Integer, Integer> entry: matrikelpunk.entrySet()) {
            System.out.printf("matrikelpunk : %d, punktyahle: %d%n", entry.getKey(), entry.getValue());
        }
    }

    private void set() {
    }
}
