package ru.croc.task7;

public class Task7 {
    public static void main(String[] args) {
        try {
            ChessPosition[] nowPos = new ChessPosition[args.length];
            for (int i = 0; i < args.length; i++)
                nowPos[i] = ChessPosition.parse(args[i]);
            if(ChessPosition.checkMove(nowPos))
                System.out.println("OK");
        }
        catch (IllegalBoard ex) {
            System.out.println(ex.getMessage());
        }
        catch (IllegalMoveException ex) {
            System.out.println(ex.getMessage());
        }
    }
}