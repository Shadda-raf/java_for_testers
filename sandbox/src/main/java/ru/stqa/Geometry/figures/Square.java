package ru.stqa.Geometry.figures;

public class Square {

    public Square() {
        if (side<0) {
            throw new IllegalArgumentException("Square side shold be non-negative");

        }
    }

    double side;

    public Square(double side) {
        this.side = side;
    }

    public static void printSquareArea(double side) {
         System.out.println(String.format(  "Площадь квадрата со стороной %f = %f", side , area(side)));
    }

    public static double area(double a) {
        return a * a;
    }


    public double area() {
        return this.side * this.side;
    }

    public double perimetr() {
        return this.side*4;
    }
}
