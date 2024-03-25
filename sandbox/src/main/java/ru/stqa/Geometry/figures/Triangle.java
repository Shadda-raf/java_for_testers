package ru.stqa.Geometry.figures;

public record Triangle(double sideA,double sideB, double sideC) {


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

    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
}
