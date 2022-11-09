package ru.croc.task6;

public class Task6 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Figure[] mas = {r, c};
        Annotation[] test = new Annotation[2];
        for (int i = 0; i < test.length; i++){
            test[i] = new Annotation(mas[i]);
            System.out.println(test[i]);
        }
        AnnotatedImage s = new AnnotatedImage("meow", test);
        System.out.println(s.findByLabel());
        //System.out.println(s.findByPoint(1,1));
    }
}
