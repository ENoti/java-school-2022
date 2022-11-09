package ru.croc.task6;

import java.util.Scanner;

public class Rectangle extends Figure{
    protected int x1, y1;
    protected int x2, y2;

    Rectangle(){}

    private int product(int Px, int Py, int Ax, int Ay, int Bx, int By){
        return (Bx - Ax) * (Py - Ay) - (By - Ay) * (Px - Ax);
    }
    protected boolean checkCoord(int x, int y) {
        int p1 = product(x, y, x1, y1, x1, y2);
        int p2 = product(x, y, x1, y2, x2, y2);
        int p3 = product(x, y, x2, y2, x2, y1);
        int p4 = product(x, y, x2, y1, x1, y1);
        return (p1 < 0 && p2 < 0 && p3 < 0 && p4 < 0) || (p1 > 0 && p2 > 0 && p3 > 0 && p4 > 0);
    }

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

    @Override
    public void move(int dx, int dy) {
        x1 += dx;
        x2 += dx;
        y1 += dy;
        y2 += dy;
    }

}
