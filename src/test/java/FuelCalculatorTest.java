import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuelCalculatorTest {

    @Test
    void fuelForModuleCalculation() {
        //Act
        int [] masses = {12, 14};

        //Assert
        int fuelFromMassCalculator = FuelFromMass.fuelFromMassCalculator(masses);
        assertEquals(4,fuelFromMassCalculator);
    }
}
