package ru.croc.task5;

public class Task5 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Figure[] mas = {r, c};
        Annotation[] test = new Annotation[2];
        for (int i = 0; i < 2; i++){
            test[i] = new Annotation(mas[i]);
            System.out.println(test[i]);
        }
    }
}
