package ru.croc.task2;

import java.util.Scanner;

public class Task2 {
    public static void storageUnits(double sizeFile){
        int sizePrefix = 0;
        while(sizeFile > 1024){
            sizeFile/=1024;
            sizePrefix++;
        }
        switch (sizePrefix){
            case 0:
                System.out.print(String.format("%.1f", sizeFile) + " B");
                break;
            case 1:
                System.out.print(String.format("%.1f", sizeFile) + " KB");
                break;
            case 2:
                System.out.print(String.format("%.1f", sizeFile) + " MB");
                break;
            case 3:
                System.out.print(String.format("%.1f", sizeFile) + " GB");
                break;
            case 4:
                System.out.print(String.format("%.1f", sizeFile) + " TB");
                break;
            case 5:
                System.out.print(String.format("%.1f", sizeFile) + " PB");
                break;
            default:
                System.out.print("File size is too large!");
                break;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double sizeFile = in.nextLong();
        storageUnits(sizeFile);
    }
}