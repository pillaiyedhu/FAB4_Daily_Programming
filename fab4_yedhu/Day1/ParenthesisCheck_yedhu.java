package com.fab4_yedhu.Day1;

import java.util.Scanner;

public class ParenthesisCheck_yedhu {
    public static boolean CheckPara(String para){
        boolean check = false;
        for(int i =0;i<para.length();i=i+2){
            int j = i+1;
            if(para.charAt(i)=='{'&&para.charAt(j)=='}'){
                check = true;
            }
            else if(para.charAt(i)=='('&&para.charAt(j)==')'){
                check = true;
            }
            else if(para.charAt(i)=='['&&para.charAt(j)==']'){
                check = true;
            }
            else{
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String para = scn.next();
        System.out.println(CheckPara(para));




    }
}
