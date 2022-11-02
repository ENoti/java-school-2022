package ru.croc.task7;

public class CoordinateFormat {
    CoordinateFormat(){}
    protected char ConvertInChar(int x){
        char[] X = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        return X[x - 1];
    }
    protected int ConvertInInt(char x){
        char[] X = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        for (int i = 0; i < X.length; i++){
            if(x == X[i])
                return i + 1;
        }
        return 0;
    }
}
