package ru.croc.task6;
import java.util.Scanner;

public class Annotation {
    private final Figure figure;
    private String Inscription;

    Annotation(Figure figure){
        this.figure = figure;
    }

    private String enteringInscription(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your text: ");
        this.Inscription = in.nextLine();
        return this.Inscription;
    }

    protected boolean getFigure(int x,int y){
        return figure.checkCoord(x, y);
    }

    protected boolean getLabel(String label){
        return this.Inscription.contains(label);
    }

    @Override
    public String toString() {
        return figure.shapeName() + figure.coordinateInformation() + enteringInscription();
    }
}
