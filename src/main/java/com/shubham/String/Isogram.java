package com.shubham.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Isogram {
    public static void main(String[] args) {
        String str = "Shubham";
        System.out.println(checkIsogram(str));
        frequency(str);
    }

    private static boolean checkIsogram(String str) {
        boolean isIsogram = true;
        String[] ch = str.split("");
        HashSet<String> hset = new HashSet<>();

        for (int i = 0; i < ch.length; i++) {
            if (hset.contains(ch[i])) {
                isIsogram = false;
            } else {
                hset.add(ch[i]);
            }
        }

        return isIsogram;
    }

    private static void frequency(String str) {
        boolean isIsogram = true;
        String[] ch = str.split("");
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            if (!map.containsKey(ch[i])) {
                map.put(ch[i], count);
            } else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }
//        for(String s : map.keySet()){
//            System.out.println(s + " : " + map.get(s));
//        }
        Set<Map.Entry<String, Integer>> collect = map.entrySet()
                .stream().collect(Collectors.toSet());
        System.out.println(collect);
    }
}
