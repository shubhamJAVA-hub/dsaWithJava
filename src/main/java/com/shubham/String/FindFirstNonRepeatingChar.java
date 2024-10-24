package com.shubham.String;

import java.util.HashMap;

public class FindFirstNonRepeatingChar {
    private static int findNonRepeatingChar(String s) {
        //a b c d a b c
        int[] freq = new int[26];
        //freq[0,0,0,0,....]
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        //freq[2,2,2,1,0,0,0,....]
        for (int i = 0; i < s.length(); ++i) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "abcdabc";
        System.out.println(findNonRepeatingChar(str));
    }
}
