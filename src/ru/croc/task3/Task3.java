package ru.croc.task3;

import java.util.Scanner;

public class Task3 {
    public static int[] createMas(int sizeMas, String[] MasStr){
        int[] array = new int[sizeMas];
        for (int i = 0; i < sizeMas; i++) {
            array[i] = Integer.parseInt(String.valueOf(MasStr[i]));
        }
        return array;
    }
    public static void firstMinEndMax(int sizeMas, int[] array){
        int ind = 0;
        int num = array[0];
        for (int i = 0; i < sizeMas; i++){
            if (num > array[i]) {
                num = array[i];
                ind = i;
            }
        }
        array[ind] = array[0];
        array[0] = num;
        ind = 0;
        num = array[0];
        for (int i = 0; i < sizeMas; i++){
            if (num < array[i]) {
                num = array[i];
                ind = i;
            }
        }
        array[ind] = array[sizeMas-1];
        array[sizeMas-1] = num;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String enteredStr = in.nextLine();
        String[] MasStr = enteredStr.split(" ");
        int sizeMas = MasStr.length;
        int[] array = createMas(sizeMas, MasStr);
        firstMinEndMax(sizeMas, array);
        for (int i = 0; i < sizeMas; i++) System.out.print(array[i] + " ");
    }
}
