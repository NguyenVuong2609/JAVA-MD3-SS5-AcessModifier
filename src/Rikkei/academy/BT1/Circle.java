package Rikkei.academy.BT1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    private final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius * PI;
    }
    public double getArea(){
        return Math.pow(2,radius) * PI;
    }
}
