package ru.croc.task5;
import java.util.Scanner;

public class Rectangle extends Figure{
    Rectangle(){}
    public String coordinateInformation(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter coordinates: ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        return " (<" + x1 +">, <" + y1 + ">), (<" + x2 + ">, <" + y2 +">): ";
    }
    public String shapeName(){
        return "R";
    }
}
