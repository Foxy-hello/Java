package com.java.demo02;

import java.util.HashMap;

public class Way {
    public HashMap<Character,Integer> show(String s){
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }
        return hm;
    }
}
