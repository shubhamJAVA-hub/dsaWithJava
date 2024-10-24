package com.shubham.String;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        String input = "ilovejavailovejava";
        findDuplicate(input);
    }

    private static void findDuplicate(String input) {
        String[] ch = input.split("");
        HashSet<String> ansSet = new HashSet<>();
        HashSet<String> uniqueSet = new HashSet<>();

        for (int i = 0; i < ch.length; i++) {
            if(!uniqueSet.contains(ch[i])){
                uniqueSet.add(String.valueOf(input.charAt(i)));
            } else {
                ansSet.add(String.valueOf(input.charAt(i)));
            }
        }
        System.out.println(ansSet);
    }
}
