package ru.stqa.Geometry.figures;

import java.util.Objects;

public record Triangle(double sideA, double sideB, double sideC) {
    public Triangle{
        if (sideA<0 || sideB<0 || sideC<0) {
            throw new IllegalArgumentException("Triangle side must be non-negative!");
        }

        if ((sideA + sideB) < sideC || (sideA + sideC) < sideB || (sideB + sideC) < sideA){
            throw new IllegalArgumentException("Triangle inequality violated!");
        }
    }

    public double area() {
        return this.formulaGerona();

    }

    private double formulaGerona() {
        double semiperimetr = this.perimeter() / 2;
        return Math.sqrt((semiperimetr) *
                (semiperimetr - this.sideA) *
                
                (semiperimetr - this.sideB) *
                (semiperimetr - this.sideC)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(sideA, triangle.sideA) == 0 && Double.compare(sideB, triangle.sideB) == 0 && Double.compare(sideC, triangle.sideC) == 0
                || Double.compare(sideA, triangle.sideB) == 0 && Double.compare(sideB, triangle.sideC) == 0 && Double.compare(sideC, triangle.sideA) == 0
                ||  Double.compare(sideA, triangle.sideC) == 0 && Double.compare(sideB, triangle.sideA) == 0 && Double.compare(sideC, triangle.sideB) == 0
                ||  Double.compare(sideA, triangle.sideC) == 0 && Double.compare(sideB, triangle.sideB) == 0 && Double.compare(sideC, triangle.sideA) == 0
                ||  Double.compare(sideA, triangle.sideB) == 0 && Double.compare(sideB, triangle.sideA) == 0 && Double.compare(sideC, triangle.sideC) == 0;

    }


    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }

    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
}
