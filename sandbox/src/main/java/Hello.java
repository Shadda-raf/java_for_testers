import java.io.File;

public class Hello {
    public static void main(String[] args) {
        try {
            var z = calculate();
            System.out.println(z);
            System.out.println("Hello means \"Привет\"");
        }
        catch (ArithmeticException exception) {
            exception.getStackTrace();
        }
    }

    private static int calculate() {
        var x= 4;
        var y = 4;
        var z = divide(x, y);
        return z;
    }

    private static int divide(int x, int y) {
        var z = x / y;
        return z;
    }
}
