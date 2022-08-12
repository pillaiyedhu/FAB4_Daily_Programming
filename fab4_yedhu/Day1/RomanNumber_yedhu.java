package com.fab4_yedhu.Day1;

import java.util.HashMap;

import java.util.*;

public class RomanNumber_yedhu {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        Scanner scn = new Scanner(System.in);
        String roman = scn.next();
        int add = 0;
        for(int i=roman.length()-1;i>0;i--){
            if(map.get(roman.charAt(i)) < map.get(roman.charAt(i+1))){
                add = add - map.get(roman.charAt(i));
            }
            else{
                add = add + map.get(roman.charAt(i));
            }
        }
        System.out.println(add);

//        for(Map.Entry m: map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }

    }
}
