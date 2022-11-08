package ru.croc.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String enteredStr = args[0];
        System.out.println(enteredStr);
        String[] words = enteredStr.split("/");
        ArrayList<String> words_list = new ArrayList<>(List.of(words));
        while(words_list.contains(".")){
            words_list.remove(".");
        }
        while(words_list.indexOf("..") != 0 && words_list.contains("..")){
            words_list.remove(words_list.indexOf("..") - 1);
            words_list.remove("..");
            if(words_list.indexOf("..") == 0){
                String set = words_list.set(words_list.indexOf(".."), "...");
            }
        }
        if(words_list.indexOf("...") == 0){
            words_list.set(words_list.indexOf("..."), "..");
        }
        System.out.println(words_list);

    }
}