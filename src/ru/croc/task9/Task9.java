package ru.croc.task9;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args){
        String enteredStr = args[0];
        String[] words = enteredStr.split("/");
        ArrayList<String> words_list = new ArrayList<>(List.of(words));
        while(words_list.contains(".")){
            words_list.remove(".");
        }
        while(words_list.indexOf("..") != 0 && words_list.contains("..")){
            words_list.remove(words_list.indexOf("..") - 1);
            words_list.remove("..");
            if(words_list.indexOf("..") == 0){
                words_list.set(words_list.indexOf(".."), "...");
            }
            if (words_list.indexOf("..") == 1 && words_list.indexOf("..") == 0){
                words_list.set(words_list.indexOf("..") + 1, "...");
            }
        }
        if(words_list.indexOf("...") == 0 && words_list.indexOf("...") == 1){
            words_list.set(words_list.indexOf("..."), "..");
        }
        System.out.print(words_list.get(0));
        for (int i = 1; i < words_list.size(); i++){
            System.out.print("/" + words_list.get(i));
        }
    }
}