import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuelCalculatorTest {

    @Test
    void fuelForModulCalculation() {
        //Act
        int [] mass = {12, 14};

        //Assert
        int fuelFromMassCalculator = FuelFromMass.fuelFromMassCalculator(mass);
        assertEquals(4,fuelFromMassCalculator);
    }
}
