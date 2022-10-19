package ru.croc.task2;

import java.util.Scanner;

public class task2 {
    public static void storage_units(double x){
        int k = 0;
        while(x > 1024){
            x/=1024;
            k++;
        }
        switch (k){
            case 0:
                System.out.print(String.format("%.1f", x) + " B");
                break;
            case 1:
                System.out.print(String.format("%.1f", x) + " KB");
                break;
            case 2:
                System.out.print(String.format("%.1f", x) + " MB");
                break;
            case 3:
                System.out.print(String.format("%.1f", x) + " GB");
                break;
            case 4:
                System.out.print(String.format("%.1f", x) + " TB");
                break;
            case 5:
                System.out.print(String.format("%.1f", x) + " PB");
                break;
            default:
                System.out.print("File size is too large!");
                break;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x = in.nextLong();
        storage_units(x);
    }
}