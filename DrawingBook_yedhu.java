package com.fab4;

import java.util.Scanner;

public class DrawingBook_yedhu {

    public static int turnPage(int npage,int findpage){
        int num1 = npage-findpage;
        int num2 = findpage -1;
        if(findpage==1){
            return 0;
        }
        else if(num1>=num2){
            int pagecount = 0;
            for(int i=2;i<=findpage;i=i+2){
                int j = i+1;
                pagecount++;
                if(findpage==i||findpage==j){
                    return pagecount;
                }
            }

        }
        else{
            int pagecount = 0;
            for(int i=npage;i>=findpage;i=i-2){
                int j= i-1;
                if(findpage==i||findpage==j){
                    return pagecount;
                }
                pagecount++;

            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int npage = scn.nextInt();
        int findpage = scn.nextInt();

        int result = turnPage(npage,findpage);
        System.out.println(result);


    }

}
