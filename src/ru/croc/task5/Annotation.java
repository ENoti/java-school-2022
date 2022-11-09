package ru.croc.task5;
import java.util.Scanner;

public class Annotation {
    private final Figure figure;
    private final String Inscription;
    Annotation(Figure figure){
        this.figure = figure;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your text: ");
        this.Inscription = in.nextLine();
    }
    @Override
    public String toString() {
        return figure.shapeName() + figure.coordinateInformation() + Inscription;
    }
}
