package ru.croc.task5;
import java.util.Scanner;
public class Circle extends Figure{

    Circle(){}
    public String coordinateInformation(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter coordinates: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int r = in.nextInt();
        while (r < 0){
            System.out.println("Radius less than zero");
            r = in.nextInt();
        }
        return " (<" + x +">, <" + y + ">), <"+ r + ">: ";
    }
    public String shapeName(){
        return "C";
    }
}
