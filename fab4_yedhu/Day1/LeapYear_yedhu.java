package com.fab4_yedhu.Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class LeapYear_yedhu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int[] years = new int[t];

        for(int i=0;i<t;i++){
            years[i] = scn.nextInt();
        }
        for(int i =0;i<t;i++){
            if(years[i]>=1000&&years[i]<=5000){
                if((years[i]%100!=0&&years[i]%4==0) || (years[i]%400==0)){
                    System.out.print("LEAP YEAR / ");
                }
                else{
                    System.out.print("NOT A LEAP YEAR / ");
                }
            }else{
                System.out.print("INVALID YEAR / ");
            }
        }




    }
}
