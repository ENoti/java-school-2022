package ru.croc.task7;

public class IllegalBoard extends Exception {
    @Override
    public String getMessage() {
        return "You are off the board!";
    }
}
