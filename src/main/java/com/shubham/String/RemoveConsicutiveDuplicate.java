package com.shubham.String;

import java.util.HashSet;

public class RemoveConsicutiveDuplicate {
    // Function to remove duplicate characters
    // using HashSet
    public static String removeDuplicates(String s) {
        HashSet<Character> exists = new HashSet<>();
        StringBuilder ans = new StringBuilder();

        // Traverse through the string
        for (char c : s.toCharArray()) {

            // If character is not found in set,
            // add it to result
            if (!exists.contains(c)) {
                ans.append(c);
                exists.add(c);
            }
        }

        return ans.toString();
    }

    // Driver code
    public static void main(String[] args) {
        String s = "HappyNewYear";
        System.out.println(removeDuplicates(s));
    }
}
