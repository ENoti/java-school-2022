package ru.croc.task7;

public class IllegalMoveException extends Exception {
    private final ChessPosition pres;
    private final ChessPosition next;

    public IllegalMoveException(ChessPosition pres, ChessPosition next, IllegalArgumentException e) {
        this.pres = pres;
        this.next = next;
    }
    @Override
    public String getMessage() {
        return "конь так не ходит: " + this.pres + " -> " + this.next;
    }
}