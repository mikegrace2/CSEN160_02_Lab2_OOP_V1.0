package scu.edu.csen160.lab2.test.exercise3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exercise3Test {

    @Test
    void testLockable() {
        // Direct access to Box and Computer classes!
        Box box = new Box("secret123");
        Computer computer = new Computer("password456");

        // Test Box locking/unlocking
        assertDoesNotThrow(() -> {
            box.lock("secret123");
            box.unlock("secret123");
            box.show(); // Should show contents when unlocked
        });

        // Test Computer locking/unlocking
        assertDoesNotThrow(() -> {
            computer.lock("password456");
            computer.unlock("password456");
        });

        // Test that both implement Lockable interface
        assertTrue(box instanceof Lockable);
        assertTrue(computer instanceof Lockable);
    }
}
