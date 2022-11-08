package ru.croc.task8;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) throws Exception{
        File file = new File(args[0]);
        try(Scanner sc = new Scanner(new FileInputStream(file))){
            int countWords = 0;
            while(sc.hasNext()){
                sc.next();
                countWords++;
            }
            System.out.println("Number of words: " + countWords);
        }
    }
}
