package scu.edu.csen160.lab2.test.exercise5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise5Test {
    @Test
    void testExercise5() {
        // Test Q5Circle and Q5Rectangle - using the same format as in main.java
        Q5Circle circ = new Q5Circle(10.0);
        Q5Rectangle rect = new Q5Rectangle(10.0, 20.0);

        // Test circle area calculation
        double expectedCircleArea = 10.0 * 10.0 * Math.PI; // π * r²
        assertEquals(expectedCircleArea, circ.area(), 0.001);

        // Test rectangle area calculation
        assertEquals(200.0, rect.area(), 0.001); // 10 * 20 = 200

        // Additional test cases
        Q5Circle smallCircle = new Q5Circle(5.0);
        assertEquals(25.0 * Math.PI, smallCircle.area(), 0.001);

        Q5Rectangle square = new Q5Rectangle(5.0, 5.0);
        assertEquals(25.0, square.area(), 0.001);

        // Test polymorphism with Q5Figure
        Q5Figure circleRef = new Q5Circle(3.0);
        Q5Figure rectRef = new Q5Rectangle(2.0, 8.0);

        assertEquals(Math.PI * 9.0, circleRef.area(), 0.001);
        assertEquals(16.0, rectRef.area(), 0.001);

    }
}
