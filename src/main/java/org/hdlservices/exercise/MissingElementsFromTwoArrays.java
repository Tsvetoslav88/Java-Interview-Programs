package org.hdlservices.exercise;

import java.util.*;

/**
 * The programs check which elements from Array 1 are contained in Array 2
 */
public class MissingElementsFromTwoArrays {

    private static List<Integer> findMissingElements(int[] first, int[] second) {
        List<Integer> missingElements = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        for (int x : second) {
            hashSet.add(x);
        }

        for (int x : first) {
            if (!hashSet.contains(x)) {
                missingElements.add(x);
            }
        }
        return missingElements;
    }

    public static void main(String[] args) {
        findMissingElements(new int[]{1, 2, 3, 4}, new int[]{1, 3}).forEach(System.out::println);
        System.out.println();
        findMissingElements(new int[]{8, 0, 1, 7, 3}, new int[]{5, 7, 8, 0, 2}).forEach(System.out::println);
    }
}
