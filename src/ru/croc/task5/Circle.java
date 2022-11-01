package ru.croc.task5;
import java.util.Scanner;
public class Circle extends Figure{
    private int x;
    private int y;
    private int R;
    Circle(int x, int y, int R){
        this.y = y;
        this.x = x;
        this.R = R;
    }
    Circle(){
        this.y = 0;
        this.x = 0;
        this.R = 0;
    }
    public String coordinateInformation(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter coordinates: ");
        x = in.nextInt();
        y = in.nextInt();
        R = in.nextInt();
        return " (<" + x +">, <" + y + ">), <"+ R + ">: ";
    }
    public String shapeName(){
        return "C";
    }
}
