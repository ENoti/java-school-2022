package ru.croc.task7;
import java.util.Scanner;
public class Task7 {
    private static int x;
    private static int y;

    public static void main(String[] args) {
        String[]s = new String[args.length];
        s[0] = args[0];
        ChessPosition Pos = new ChessPosition();
        MoveFigure check = null;
        for (int i = 1; i < args.length; i++){
            s[i] = args[i];
            Pos.parse(s[i - 1]);
            check = new MoveFigure(Pos.getX(), Pos.getY());
            Pos.parse(s[i]);
        }
        assert check != null;
        System.out.println(check.move(Pos.getX(), Pos.getY()));
    }
}
