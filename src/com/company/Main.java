package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
        encode("abbacaba");


    }

    public static String encode(String input) {

        // 1) a-4, b-3, c-1;
        // 2) a-1, b-01, c-001;
        // 3) 1010110011011
        Map<String, Integer> map = new HashMap<String, Integer>();
        char newChar[]= input.toCharArray();
        int count=0;
        String key=null;
        for (char value: newChar ) {
            for (int i = 0; i < newChar.length ; i++) {
                if(newChar[i]==newChar[i+1]){
                    key= String.valueOf(newChar[i]);
                    map.put(key,count++);
                }
            }

            map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));


        }
        return null;
    }

}
