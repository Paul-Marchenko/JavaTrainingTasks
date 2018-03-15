package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
        encode("abbacbba");
        multiplicationTable(10);
        piramide(8, 10);


    }

    public static String encode(String input) {

        // 1) b-4, a-3, c-1;
        // 2) a-1, b-01, c-001;
        // 3) 1010110011011
        // 4) input = 8;
        // 5) abacabba;
        // 6) one=abba; two=caba;

       /*Count quantity all uniq letters.*/
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char newChar[] = input.toCharArray();

        for (char value : newChar) {
            if (map.get(value) == null) {
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }
        }

        map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));

        /*Sort by value ASC.*/
        Map<Character, Integer> sortedByValueMap = null;

        /*Sort by value Desc.*/


        /* Assign cipher to key*/


        /* Display quantity letters in the String*/


        return null;
    }

    public static void multiplicationTable(int limit) {
        System.out.println();
        System.out.println("Multiplication Table for " + limit);
        int result = 1;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit; j++) {
                result = i * j;
                System.out.print(result + " ");
                if (j == limit) {
                    System.out.println();
                }
            }
        }
    }

    public static void piramide(int element, int quantityOfElements) {
        System.out.println();
        System.out.println("Pyramide like triangle with " + element + " number");

        for (int i = 0; i < quantityOfElements; i++) {
            String stringElement=String.valueOf(element);
            System.out.println(stringElement);

        }

    }
}
