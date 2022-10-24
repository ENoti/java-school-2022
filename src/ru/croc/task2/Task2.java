package ru.croc.task2;

import java.util.Scanner;


public class Task2 {
    public static void storageUnits(double sizeFile){
        int sizePrefix = 0;
        String[] units = {"B", "KB", "MB", "GB", "TB"};
        while(sizeFile > 1024 && sizePrefix < 4){
            sizeFile/=1024;
            sizePrefix++;
        }
        if (sizePrefix == 4)
            System.out.print(String.format("%.1f ", sizeFile) + " " + units[sizePrefix]);
        else
            System.out.print(String.format("%.1f ", sizeFile) + units[sizePrefix]);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double sizeFile = in.nextLong();
        storageUnits(sizeFile);
    }
}