package eu.lschreiber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{5, 1, 4, 5, 2, 6, 8, 1, 5};
        Integer[] b = new Integer[]{5, 6, 2, 7, 3, 5, 7, 8, 9};

        Integer[] intersection = Calculator.findIntersection(a, b).orElseThrow();

        System.out.println(Arrays.toString(intersection));
    }
}