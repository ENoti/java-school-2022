package ru.croc.task7;
import java.util.Scanner;
public class MoveFigure {
    private int x_1;
    private int y_1;
    MoveFigure(){}
    MoveFigure(int x, int y) {
        x_1 = x;
        y_1 = y;
    }
    protected String move(int x, int y) {
        try {
            if((((x + 2) <= 8) && ((y + 1) <= 8)) && ((x_1 == (x + 2)) && (y_1 == (y + 1)))){
                x+=2;
                y+=1;
            }
            else if(x + 1 <= 8 && y - 2 >= 0 && x_1 == (x + 1) && y_1 == (y - 2)){
                x+=1;
                y-=2;
            }
            else if(x + 1 <= 8 && y + 2 <= 8 && x_1 == (x + 1) && y_1 == (y + 2)){
                x+=1;
                y+=2;
            }
            else if(x - 2 >= 0 && y + 1 <= 8 && x_1 == (x - 2) && y_1 == (y + 1)){
                x-=2;
                y+=1;
            }
            else if(x - 1 >= 0 && y + 2 <= 8 && x_1 == (x - 1) && y_1 == (y + 2)){
                x-=1;
                y+=2;
            }
            else if(x + 2 <= 8 && y - 1 > 0 && x_1 == (x + 2) && y_1 == (y - 1)){
                x+=2;
                y-=1;
            }
            else if(x - 2 >= 0 && y - 1 >= 0 && x_1 == (x - 2) && y_1 == (y - 1)){
                x-=2;
                y-=1;
            }
            else if(x - 1 >= 0 && y - 2 >= 0 && x_1 == (x - 1) && y_1 == (y - 2)){
                x-=1;
                y-=2;
            }
            else{
                CoordinateFormat X = new CoordinateFormat();
                throw new IllegalMoveException("the horse doesn't walk: " + X.ConvertInChar(x_1) + y_1 + " -> " + X.ConvertInChar(x) + y);
            }

        }
        catch (IllegalMoveException e){
            CoordinateFormat X = new CoordinateFormat();
            return "the horse doesn't walk: " + X.ConvertInChar(x_1) + y_1 + " -> " + X.ConvertInChar(x) + y;
        }
        return "OK";
    }
    @Override
    public String toString() {
        CoordinateFormat X = new CoordinateFormat();
        return "<" + X.ConvertInChar(x_1) + ">" + "<" + y_1 + ">";
    }
}
