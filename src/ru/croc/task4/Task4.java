package ru.croc.task4;

import java.util.*;

public class Task4 {
    public static String asteriskBig(String line){
        int com_one = line.indexOf("/*");
        int com_two = line.indexOf("*/");
        int com_three = line.indexOf("*");
        String newLine;

        if(com_one != -1 && com_two == -1 || com_one == -1 && com_two != -1 || com_one == -1 && com_three != -1)
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

    public static void main(String[] args) {
        String str = """
            /*
             * My first ever program in Java!
             */
            class Hello { // class body starts here\s
             \s
              /* main method */
              public static void main(String[] args/* we put command line arguments here*/) {
                // this line prints my first greeting to the screen
                System.out.println("Hi!"); // :)
              }
            } // the end
            // to be continued...
            """;
            str = asteriskBig(str);
            str = asteriskSlash(str);
            str = doubleSlash(str);
            System.out.println(str);
//        String str = "";
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) { // До нажатия Ctrl + D
//            str = str + "\n" + scanner.nextLine();
//            str = asteriskBig(str);
//            str = asteriskSlash(str);
//            str = doubleSlash(str);
//        }
//        scanner.close();

    }
}
