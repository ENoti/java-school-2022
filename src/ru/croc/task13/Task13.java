package ru.croc.task13;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Task13 {

    static int[] choose;

    public static int[] createMas(int sizeMas, String[] MasStr){
        int[] array = new int[sizeMas];
        for (int i = 0; i < sizeMas; i++) {
            array[i] = Integer.parseInt(String.valueOf(MasStr[i]));
        }
        return array;
    }

    public static ArrayList<Set<Integer>> searchMoreHalfSimilarFilms(ArrayList<Set<Integer>> getSetHistoryList){
        int[] amountSuitable = new int[getSetHistoryList.size()];
        for (int k : choose) {
            for (int j = 0; j < getSetHistoryList.size(); j++) {
                if (getSetHistoryList.get(j).contains(k)) {
                    amountSuitable[j] += 1;
                }
            }
        }
        ArrayList<Set<Integer>> getNewSetHistoryList = new ArrayList<>();
        if(choose.length == 1){
            for (int i = 0; i < getSetHistoryList.size(); i++){
                if(amountSuitable[i] == 1){
                    getNewSetHistoryList.add(getSetHistoryList.get(i));
                }
            }
        }
        else{
            for (int i = 0; i < getSetHistoryList.size(); i++){
                if(amountSuitable[i] >= choose.length / 2){
                    getNewSetHistoryList.add(getSetHistoryList.get(i));
                }
            }
        }
        return getNewSetHistoryList;
    }

    public static void deleteViewed(ArrayList<Set<Integer>> getSetHistoryList){
        for (int j : choose) {
            for (Set<Integer> integers : getSetHistoryList) {
                integers.remove(j);
            }
        }
    }

    public static int theBestFilm(ArrayList<Set<Integer>> getSetHistoryList, Map<Integer,String> fileNew){
        int[] amountViewFilms = new int[fileNew.size()];
        for (int j = 0; j < fileNew.size(); j++) {
            for (Set<Integer> integers : getSetHistoryList) {
                if (integers.contains(j + 1)) {
                    amountViewFilms[j] += 1;
                }
            }
        }
        int maxView = 0;
        for (int amountViewFilm : amountViewFilms) {
            if (maxView < amountViewFilm) maxView = amountViewFilm;
        }
        return maxView;
    }

    public static void main(String[] args) throws IOException {
        // определяем объект для каталога
        File films = new File(args[0]);
        File history = new File(args[1]);
        InfInFile init = new InfInFile(films, history);
        init.initialFilms();
        init.initialViews();
        Map<Integer, String> filmNew = init.getFilmsMap();
        Scanner in = new Scanner(System.in);
        String enteredStr = in.nextLine();
        String[] MasStrChoose = enteredStr.split(" ");
        int sizeMas = MasStrChoose.length;
        choose = createMas(sizeMas, MasStrChoose);
        ArrayList<Set<Integer>> historyNew = searchMoreHalfSimilarFilms(init.getSetHistoryList());
        deleteViewed(historyNew);
        int x = theBestFilm(historyNew, filmNew);
        System.out.println(filmNew.get(x));
    }
}