package com.training.algorithm.array;

import javax.swing.text.html.parser.Entity;
import java.util.*;

/**
 * Created by j-yangbo on 2017/5/3.
 *
 * 229. Majority Element II
 *
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.
 *
 */
public class Solution_229 {

    public List<Integer> majorityElement(int[] nums) {
        if (nums == null) {
            return new ArrayList<>();
        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i :  nums) {
          if (hashMap.containsKey(i)){
              hashMap.put(i,hashMap.get(i)+1);
          }else {
              hashMap.put(i,1);
          }
        }
        ArrayList<Integer> result = new ArrayList<>();
       for(Map.Entry<Integer,Integer> entity: hashMap.entrySet()){

            if (entity.getValue()>nums.length/3){
               result.add(entity.getKey());
            }
       }
       return result;
    }

    public static void main(String[] args) {

    }
}
