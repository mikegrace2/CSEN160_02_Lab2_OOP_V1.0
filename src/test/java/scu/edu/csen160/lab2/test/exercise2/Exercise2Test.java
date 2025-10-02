package scu.edu.csen160.lab2.test.exercise2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exercise2Test {

    @Test
    void testInheritance() {
        // Direct access to package-private classes!
        BuildingManager buildingManager = new BuildingManager();

        EmergencyLight emergencyLight = new EmergencyLight();
        PersonalComputer pc = new PersonalComputer();
        TV tv = new TV();

        // Test inheritance - all should be instances of Asset
        assertTrue(emergencyLight instanceof Asset);
        assertTrue(pc instanceof Asset);
        assertTrue(tv instanceof Asset);

        // Test BuildingManager functionality
        buildingManager.add(emergencyLight);
        buildingManager.add(pc);
        buildingManager.add(tv);

        // This should not throw an exception and should call powerDown on all assets
        assertDoesNotThrow(() -> buildingManager.powerDownAtNight());
    }
}