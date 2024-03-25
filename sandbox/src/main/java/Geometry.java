public class Geometry {
    public static void main(String[] args) {

        printSquareArea(7.0);
        printSquareArea(5.0);
        printSquareArea(3.0);
        
        printRectangleArea(3.7 , 5.4);

    }

    private static void printRectangleArea(double a, double b) {
        System.out.println("Площадь прямоугольника  со сторонами a =  " + a +" и b = " + b + " = "+ rectangleArea(a,b));
    }

    private static double rectangleArea(double a, double b) {
        return a*b;
    }

    static public void printSquareArea(double side) {
        System.out.println("Площадь квадрата со стороной  " + side +" = "+ squareArea(side));
    }

    private static double squareArea (double a) {
        return a * a;
    }
}
