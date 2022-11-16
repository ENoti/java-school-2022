package ru.croc.task6;

import java.util.Scanner;
public class Circle extends Figure{
    protected int x;
    protected int y;
    protected int R;

    Circle(){}

    protected boolean checkCoord(int x, int y){
        return (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y) <= R * R;
    }

    public String coordinateInformation(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter coordinates: ");
        x = in.nextInt();
        y = in.nextInt();
        R = in.nextInt();
        while (R < 0){
            System.out.println("Radius less than zero");
            R = in.nextInt();
        }
        return "C (<" + x +">, <" + y + ">), <"+ R + ">: ";
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
