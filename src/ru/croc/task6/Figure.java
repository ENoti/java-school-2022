package ru.croc.task6;

public abstract class Figure implements Movable{
    protected final int x;
    protected final int y;

    Figure(){
        this.x = 0;
        this.y = 0;
    }
    protected abstract boolean checkCoord(int x, int y);
    protected abstract String coordinateInformation();
}
