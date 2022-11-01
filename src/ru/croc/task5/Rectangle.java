package ru.croc.task5;

import java.util.Scanner;

public class Rectangle extends Figure{
    private int x1, y1;
    private int x2, y2;
    Rectangle(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    Rectangle(){}
    public String coordinateInformation(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter coordinates: ");
        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();
        return " (<" + x1 +">, <" + y1 + ">), (<" + x2 + ">, <" + y2 +">): ";
    }
    public String shapeName(){
        return "R";
    }
}
