package ru.job.pseudo;

public class Square implements Shape {
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("\n" + "++++");
        pic.append("\n" +"+  +");
        pic.append("\n" +"+  +");
        pic.append("\n" +"++++");
        return pic.toString();
    }
}