package ru.croc.task1;
import java.util.Scanner;

public class task1 {
    static class Point {
        double x;
        double y;

        public static void print(Point a){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the x coordinate of vertex: ");
            a.x = in.nextInt();
            System.out.print("Enter the y coordinate of vertex: ");
            a.y = in.nextInt();
        }
    }

    public static void S(Point a, Point b, Point c){
        double S = 0.5 * (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y));
        System.out.println("Triangle area: " + Math.abs(S));
    }

    public static void main(String[] args){

        Point a = new Point();
        Point.print(a);
        Point b = new Point();
        Point.print(b);
        Point c = new Point();
        Point.print(c);
        task1.S(a, b, c);
    }
}