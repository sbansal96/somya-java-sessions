package com.company.session5.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollections {



    // i , j such that nums[i] === nums[j]
    // number,value (i,j)

    public static void main(String[] args) {
        String [] nums = {"a","b","c","a","a","c"};
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            String key = nums[i];
            if(map.containsKey(key)){
                int occur = map.get(key);
                occur += 1;
                map.put(key,occur);
            }else{
                map.put(key,1);
            }
        }

        System.out.println(map.keySet());
    }




}
