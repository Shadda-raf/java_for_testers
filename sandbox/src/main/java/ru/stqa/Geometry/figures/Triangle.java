package ru.stqa.Geometry.figures;

public record Triangle(double sideA,double sideB, double sideC) {
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

    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
}
