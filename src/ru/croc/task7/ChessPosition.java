package ru.croc.task7;

import static java.lang.Math.abs;

public class ChessPosition {
    private final int x;
    private final int y;

    public static ChessPosition parse(String position) throws IllegalBoard{
        return new ChessPosition(position.charAt(0) - 'a' + 1, position.charAt(1) - '0');
    }

    public ChessPosition(int x, int y) throws IllegalBoard{
        if (x > 0 && x < 9 && y > 0 && y < 9) {
            this.x = x;
            this.y = y;
        } else
            throw new IllegalBoard();
    }

    public boolean checkPoint(ChessPosition posNow) throws IllegalMoveException {
        if ((abs(this.x - posNow.x) == 1 && abs(this.y - posNow.y) == 2) || (abs(this.x - posNow.x) == 2 && abs(this.y - posNow.y) == 1))
            return true;
        else
            throw new IllegalMoveException(this, posNow);
    }

    public static boolean checkMove(ChessPosition[] posNow) throws IllegalMoveException {
        for (int i = 1; i < posNow.length; i++) {
            if (!posNow[i - 1].checkPoint(posNow[i]))
                throw new IllegalMoveException(posNow[i - 1], posNow[i]);
        }
        return true;
    }

    @Override
    public String toString() {
        return Character.toString('a' + this.x - 1) + this.y;
    }
}