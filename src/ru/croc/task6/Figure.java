package ru.croc.task6;

public class Figure implements Movable{
    protected final int x;
    protected final int y;

    Figure(){
        this.x = 0;
        this.y = 0;
    }

    protected boolean checkCoord(int x, int y){
        return this.x == x && this.y == y;
    }

    protected String shapeName(){
        return "F";
    }
    protected String coordinateInformation(){
        return " (<" + x +">, <" + y + ">): ";
    }

    @Override
    public void move(int dx, int dy) {
        System.out.println("move");
    }
}
