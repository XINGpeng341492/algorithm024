package com.vipkid.tide.gw.web.arthmetic.week2;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/2/8 11:58 上午
 **/
public class Anagram {
    public static void main(String[] args) {

        //s = "anagram", t = "nagaram"
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> countMap = new HashMap<>();
        for (int i =0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (countMap.containsKey(ch)) {
                countMap.put(ch, countMap.get(ch) + 1);
            } else {
                countMap.put(ch, 1);
            }
            //countMap.getOrDefault(ch, )

        }

        for (int i = 0; i < t.length(); i++) {
            char ch = s.charAt(i);
            if (countMap.containsKey(ch)) {
                countMap.put(ch, countMap.get(ch) - 1);
                if (countMap.get(ch) < 0){
                    return false;
                }
            } else {
                return false;
            }

        }


        return true;
    }

}
