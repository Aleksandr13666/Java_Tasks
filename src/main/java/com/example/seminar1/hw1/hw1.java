package com.example.seminar1.hw1;

public class hw1 {
    public static void main(String[] args) {
        System.out.println(replaceOfString("   the sky is blue"));
    }

    public static String replaceOfString(String s){
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder(words.length);
        for (int i = words.length - 1; i >= 0; i--)
        {
            if (words[i].length() != 0)
            {
                if (result.length() != 0)
                {
                    result.append(" ");
                }
                result.append(words[i]);
            }
        }

        return result.toString();
    }
}
