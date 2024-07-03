package com.shubham.String;

public class DifferentComparison {
    private static String compressedStringMethodII(String str) {
        StringBuilder sb = new StringBuilder();
        char currentChar = str.charAt(0);
        int cnt = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar){
                cnt++;
            } else {
                sb.append(currentChar);
                if (cnt > 1){
                    sb.append(cnt);
                }
                currentChar = str.charAt(i);
                cnt = 1;
            }

        }
        sb.append(currentChar);
        if (cnt > 1){
            sb.append(cnt);
        }
        return sb.toString();
    }
    private static String compressedString(String str) {
        String sbAns = new String();
        StringBuffer sb = new StringBuffer();
        char[] charArray = str.toCharArray();
        int i = 0;
        int j = i + 1;
        int cnt = 1;
        while (j < charArray.length){
            if(charArray[i] == charArray[j]){
                cnt++;
                j++;
            } else {
                if(cnt > 1){
                    sb.append(charArray[i]+""+cnt);
                }
                if (cnt == 1){
                    sb.append(charArray[i]+"");
                }
                i = j;
                j++;
                cnt = 1;
            }
        }
        // this if else condition for last character
        if(cnt > 1){
            sb.append(charArray[i]+""+cnt);
        } else {
            sb.append(charArray[i]+ "");
        }
        return sbAns = String.valueOf(sb);
    }
    public static void main(String[] args) {
        String str = "abaasasssa";
        System.out.println(compressedString(str));
        System.out.println(compressedStringMethodII(str));
    }
}
