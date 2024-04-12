package ru.stqa.Geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTests {
    @Test
    void canCalculateArea(){
        var s = new Square(56.0);
        double result = s.area();
        //Assertions.assertEquals(25.0,result);
        if (result == 25.0) {
            System.out.println("Test passed!");
        }
        else
            throw new AssertionError(String.format("Expected %f, actual %f", 25.0, result));
    }

    @Test
    void canCalculatePerimetr(){
        assertEquals(20.0,new Square(5.0).perimetr());
    }

    @Test
    void cannotCreateSquareWithNegativeSide(){
        try {
            new Square(-5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //OK
        }
    }


    @Test
    void testEquality(){
         var s1 = new Square(5.0);
         var s2 = new Square(5.0);
         Assertions.assertTrue(s1.equals(s2));
    }

}
