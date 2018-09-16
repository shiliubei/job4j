package ru.job.pseudo;

public class Triangle implements Shape {
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("\n" + "  +  ");
        pic.append("\n" + " + + ");
        pic.append("\n" + "+   +");
        pic.append("\n" + "+++++");
        return pic.toString();
    }

}
