package ru.croc.task5;
import java.util.Scanner;

public class Annotation {
    private final Figure figure;
    private final String inscription;
    Annotation(Figure figure){
        this.figure = figure;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your text: ");
        this.inscription = in.nextLine();
    }
    @Override
    public String toString() {
        return figure.coordinateInformation() + inscription;
    }
}
