package ru.croc.task1;
import java.util.Scanner;

public class Task1 {
    static class Point {
        double x;
        double y;
        public static void print(Point cord){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the x coordinate of vertex: ");
            cord.x = in.nextInt();
            System.out.print("Enter the y coordinate of vertex: ");
            cord.y = in.nextInt();
        }
    }
    public static void squareFun(Point one, Point two, Point three){
        double square = 0.5 * (one.x * (two.y - three.y) + two.x * (three.y - one.y) + three.x * (one.y - two.y));
        System.out.println("Triangle area: " + Math.abs(square));
    }
    public static void main(String[] args){
        Point one = new Point();
        Point.print(one);
        Point two = new Point();
        Point.print(two);
        Point three = new Point();
        Point.print(three);
        Task1.squareFun(one, two, three);
    }
}