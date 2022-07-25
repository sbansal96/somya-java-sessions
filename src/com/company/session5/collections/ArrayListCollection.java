package com.company.session5.collections;

import java.util.HashMap;

public class ArrayListCollection {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        String stones = "aAAbbbb";
        String jewels = "aA";

        // Occurence find kar rha h
        for(int i=0;i<stones.length();i++){
            String key = String.valueOf(stones.charAt(i));
            if(map.containsKey(key)){
                int occur = map.get(key);
                occur += 1;
                map.put(key,occur);
            }else{
                map.put(key,1);
            }
        }

        System.out.println(map);
        int count =0;
        for(int i=0;i<jewels.length();i++){
            String key = String.valueOf(jewels.charAt(i));
            if(map.containsKey(key)) {
                count += map.get(key);
            }
        }

        System.out.println(count);

    }

}
