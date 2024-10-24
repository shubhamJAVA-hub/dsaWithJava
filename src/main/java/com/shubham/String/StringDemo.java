package com.shubham.String;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
//        String s = "Shubham";
//        String str = new String("SKPandey");
//        String v = String.valueOf(str.contains("K"));
//        System.out.println(v);


        String input = "abc";
        System.out.println(printAlternate(input));
    }

    private static String printAlternate(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                // Shift the character by 1, wrap around if needed
                char newChar = (char) (ch + 1);
                if (newChar > 'z') {
                    newChar = 'a';
                }
                result.append(newChar);
            } else {
                // If the character is not a lowercase letter, append it as is
                result.append(ch);
            }

        }
        return result.toString();
    }
}
