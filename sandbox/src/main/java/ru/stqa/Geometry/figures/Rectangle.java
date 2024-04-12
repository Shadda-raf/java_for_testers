package ru.stqa.Geometry.figures;

import java.util.Objects;

public record Rectangle  (double a, double b){

    public static void printRectangleArea(double a, double b) {
        var text = String.format("Площадь прямоугольника  со сторонами %f и  %f  = %f",a,b,rectangleArea(a,b));
        System.out.println(text);
    }

     static double rectangleArea(double a, double b) {
        return a*b;
    }
    public Rectangle{
        if (a<0 || b<0) {
            throw new IllegalArgumentException("Rectangle must have non-negative side");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(a, rectangle.a) == 0 && Double.compare(b, rectangle.b) == 0
                || Double.compare(a, rectangle.b) == 0 && Double.compare(b, rectangle.a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
