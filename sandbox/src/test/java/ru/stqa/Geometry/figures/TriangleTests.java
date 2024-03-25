package ru.stqa.Geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
