package org.hdlservices.exercise;

import java.util.Arrays;
import java.util.Collections;

public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};

        String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};

        // Sort both arrays
        Arrays.sort(s1);
        Arrays.sort(s2);

        // 1) Compare using Iterative Method
        boolean areEqual = true;
        if (s1.length == s2.length) {
            for (int i = 0; i < s1.length; i++) {
                if (!s1[i].equals(s2[i])) {
                    areEqual = false;
                }
            }
        } else {
            areEqual = false;
        }

        if (areEqual) {
            System.out.println("1. Two Arrays Are Equal");
        } else {
            System.out.println("1. Two Arrays Are Not Equal");
        }

        // 2) Using Arrays.equals() Method
        if (Arrays.equals(s1, s2)) {
            System.out.println("2. Two Arrays Are Equal");
        } else {
            System.out.println("2. Two Arrays Are Not Equal");
        }
    }
}
