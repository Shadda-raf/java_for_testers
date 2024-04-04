package ru.stqa.Geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.function.Try;

public class TriangleTests {

    @Test
    void canCalculateArea(){
        var t = new Triangle(3.0,4.0,5.0);
        double areaResult= t.area();
        Assertions.assertEquals(6.0, areaResult);
    }

    @Test
    void canCalculatePerimetr(){
        var t = new Triangle(8.0,11.0,18.9999999);
        double perimeterResult= t.perimeter();
        Assertions.assertEquals(37.9999999, perimeterResult);
    }

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(-70.0, 5.0,7.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
            //ok
        }
    }

    @Test
    void cannotCreateTriangleWithTheseSideCombination() {
        try {
            new Triangle(17.0, 5.0,7.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
            //ok
        }
    }
}

