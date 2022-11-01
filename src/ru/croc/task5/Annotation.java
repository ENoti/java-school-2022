package ru.croc.task5;
import java.util.Scanner;
import ru.croc.task5.Figure;

public class Annotation {
    private final Figure figure;

    Annotation(Figure figure){
        this.figure = figure;
    }

    private String enteringInscription(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your text: ");
        return in.nextLine();
    }

    @Override
    public String toString() {
        return figure.shapeName() + figure.coordinateInformation() + enteringInscription();
    }
}
