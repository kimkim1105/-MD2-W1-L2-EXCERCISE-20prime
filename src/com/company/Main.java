package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	 write your code here
        int count = 0;
        int n = 2;
        int dem = 0;
        while (count < 20) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    dem ++;
                    break;
                }
            }
            if (dem==0){
                count ++;
                System.out.println(n);
            }
            dem =0;
            n++;
        }
    }
}
