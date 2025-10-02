package scu.edu.csen160.lab2.test.exercise4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exercise4Test {

    @Test
    void testSingleton() {
        // Direct access to Singleton class!
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        // All instances should be the same object
        assertSame(instance1, instance2);
        assertSame(instance1, instance3);
        assertSame(instance2, instance3);

        // Test toString method
        assertNotNull(instance1.toString());
        assertEquals(instance1.toString(), instance2.toString());
    }
}