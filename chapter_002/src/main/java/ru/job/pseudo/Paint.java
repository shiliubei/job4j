package ru.job.pseudo;

public class Paint {
    public static void main(String[] args){
        Shape square = new Square();
        draw(square);
        Shape triagle = new Triangle();
        draw(triagle);


    }

    public static void draw (Shape shape){
        System.out.println(shape.draw());
    }
}
