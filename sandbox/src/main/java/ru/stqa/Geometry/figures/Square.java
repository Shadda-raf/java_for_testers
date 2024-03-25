package ru.stqa.Geometry.figures;

public class Square {
     public static void printSquareArea(double side) {
         System.out.println(String.format(
                "Площадь квадрата со стороной %f = %f", side , area(side)));
    }

    public static double area(double a) {
        return a * a;
    }

    public static double perimetr(double a) {
         return a*4;
    }
}
