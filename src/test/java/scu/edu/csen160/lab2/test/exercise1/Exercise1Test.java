package scu.edu.csen160.lab2.test.exercise1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Exercise1Test {
    @Test
    void testStack() {
        // Now we can directly access Stack since we're in the same package!
        Stack stack = new Stack(10);

        // Test push method
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Test pop method - should return in LIFO order
        int pop1 = stack.pop();
        assertEquals(30, pop1);

        int pop2 = stack.pop();
        assertEquals(20, pop2);

        int pop3 = stack.pop();
        assertEquals(10, pop3);
    }

    @Test
    void testArray() {
        // We can also test Array directly
        Array array = new Array(5);

        array.add(100);
        array.add(200);
        array.add(300);

        int removed = array.remove();
        assertEquals(300, removed); // Should remove last added

        int[] result = array.returnArray();
        assertEquals(2, result.length);
        assertEquals(100, result[0]);
        assertEquals(200, result[1]);
    }
}
