package ru.croc.task7;

import static java.lang.Math.abs;

public class ChessPosition {
    private int x;
    private int y;

    public static ChessPosition parse(String position){
        return new ChessPosition(position.charAt(0) - 'a' + 1, position.charAt(1) - '0');
    }

    public ChessPosition(int x, int y){
        if (x > 0 && x < 9 && y > 0 && y < 9) {
            this.x = x;
            this.y = y;
        } else
            System.out.println("You are off the board!");
    }

    public boolean checkPoint(ChessPosition posNow) throws IllegalMoveException {
        if ((abs(this.x - posNow.x) == 1 && abs(this.y - posNow.y) == 2) || (abs(this.x - posNow.x) == 2 && abs(this.y - posNow.y) == 1))
            return true;
        else
            throw new IllegalMoveException(this, posNow, new IllegalArgumentException());
    }

    public static boolean checkMove(ChessPosition[] posNow) throws IllegalMoveException {
        for (int i = 1; i < posNow.length; i++) {
            if (!posNow[i - 1].checkPoint(posNow[i]))
                throw new IllegalMoveException(posNow[i - 1], posNow[i], new IllegalArgumentException());
        }
        return true;
    }

    @Override
    public String toString() {
        return Character.toString('a' + this.x - 1) + this.y;
    }
}