package ru.croc.task4;

import java.util.Scanner;

public class Task4 {
    public static String asteriskBig(String line){
        int com_one = line.indexOf("/*");
        int com_two = line.indexOf("*/");
        int com_three = line.indexOf("*");
        String newLine;

        if((com_one != -1 && com_two == -1) || (com_one == -1 && com_two != -1) || (com_one == -1 && com_two == -1 && com_three != -1))
            newLine = "";
        else
            newLine = line;
        return newLine;
    }
    public static String asteriskSlash(String line){
        int begin_com = line.indexOf("/*");
        int end_com = line.indexOf("*/");
        String newLine;
        if(begin_com != -1){
            char []newLineFirst = new char[begin_com];
            char []newLineTwo = new char[(line.length() - end_com - 2)];
            line.getChars(0,begin_com,newLineFirst,0);
            line.getChars(end_com + 2,line.length(),newLineTwo,0);
            String LineTwo = new String(newLineTwo);
            String LineFirst = new String(newLineFirst);
            newLine = String.join("", LineFirst, LineTwo);
        }
        else{
            newLine = line;
        }
        return newLine;
    }
    public static String doubleSlash(String line){
        int com = line.indexOf("//");
        String newLine;
        if(com != -1){
            char []newLineChar = new char[com];
            line.getChars(0,com,newLineChar,0);
            newLine = new String(newLineChar);
        }
        else{
            newLine = line;
        }
        return newLine;
    }
    public static  String deleteCom(String line){
        line = asteriskSlash(line);
        line = doubleSlash(line);
        line = asteriskBig(line);
        return line;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String line = in.nextLine();
            line = deleteCom(line);
            System.out.println(line);
        }
    }
}
