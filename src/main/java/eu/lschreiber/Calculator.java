package eu.lschreiber;

import java.util.*;

public class Calculator {
    public static Optional<Integer[]> findIntersection(Integer[] a, Integer[] b) {
        if (a == null || b == null) {
            return Optional.empty();
        }

        Set<Integer> setA = new HashSet<>(Arrays.asList(a));
        Set<Integer> setB = new HashSet<>(Arrays.asList(b));

        List<Integer> concatenated = new Vector<>();

        concatenated.addAll(setA);
        concatenated.addAll(setB);

        Collections.sort(concatenated);

        List<Integer> intersection = new Vector<>();

        for (int i = 0; i < concatenated.size() - 1; i++) {
            if (Objects.equals(concatenated.get(i), concatenated.get(i + 1))) {
                intersection.add(concatenated.get(i));
            }
        }

        return Optional.of(intersection.toArray(new Integer[0]));
    }
}
