package ru.croc.task2;

import java.util.Scanner;

public class task2 {
    public static void storage_units(double x){
        int k = 0;
        while(x > 1024){
            x/=1024;
            k++;
        }
        if (k == 0) {
            System.out.print(String.format("%.1f", x) + " B");
        }
        if(k == 1){
            System.out.print(String.format("%.1f", x) + " KB");
        }
        else if(k == 2) {
            System.out.print(String.format("%.1f", x) + " MB");
        }
        else if(k == 3){
            System.out.print(String.format("%.1f", x) + " GB");
        }
        else if(k == 4) {
            System.out.print(String.format("%.1f", x) + " TB");
        }
        else if(k == 5){
            System.out.print(String.format("%.1f", x) + " PB");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x = in.nextLong();
        storage_units(x);
    }
}