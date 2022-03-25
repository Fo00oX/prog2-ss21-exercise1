import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuelCalculatorTest {
    private int[] masses = new int[] {137654, 50175, 66976, 57860, 83790, 54910, 54619, 116199, 143411, 51671, 115872, 71948, 148635, 92858, 90939, 127238, 127895, 124557, 78529, 55785, 61550, 138304, 128465, 74497, 136583, 66010, 64320, 91234, 51418, 90761, 136134, 66312, 135172, 126256, 54124, 53174, 72252, 145546, 80950, 52271, 118231, 79687, 106127, 108233, 69510, 124533, 105202, 54861, 103087, 81646, 107634, 105240, 137434, 60812, 90066, 149325, 117535, 107526, 50814, 51850, 90707, 110908, 51739, 96373, 91987, 144389, 75682, 142954, 83555, 93320, 101914, 117640, 109401, 106950, 54521, 130826, 109942, 55360, 105653, 92168, 149572, 79571, 88590, 104400, 109598, 51623, 86649, 143689, 88350, 143809, 50119, 75616, 86361, 76884, 62339, 83118, 76847, 137105, 130460, 54479};
    /**
     For a mass of 12, divide by 3 and round down to get 4, then subtract 2 to get 2.
     For a mass of 14, dividing by 3 and rounding down still yields 4, so the fuel required is also 2.
     For a mass of 1969, the fuel required is 654.
     For a mass of 100756, the fuel required is 33583.
     **/
    @Test
    void fuelForModuleCalculation_Scenario12() {
        int[] masses = {12};
        int expected = 2;

        int fuelFromMassCalculator = FuelFromMass.calculateFuelForMasses(masses);
        assertEquals(expected, fuelFromMassCalculator);
    }
    @Test
    void fuelForModuleCalculation_Scenario14() {
        int[] masses = {14};
        int expected = 2;

        int fuelFromMassCalculator = FuelFromMass.calculateFuelForMasses(masses);
        assertEquals(expected, fuelFromMassCalculator);
    }
    @Test
    void fuelForModuleCalculation_Scenario_1969() {
        int[] masses = {1969};
        int expected = 654;

        int fuelFromMassCalculator = FuelFromMass.calculateFuelForMasses(masses);
        assertEquals(expected, fuelFromMassCalculator);
    }
    @Test
    void fuelForModuleCalculation_Scenario_100756() {
        int[] masses = {100756};
        int expected = 33583;

        int fuelFromMassCalculator = FuelFromMass.calculateFuelForMasses(masses);
        assertEquals(expected, fuelFromMassCalculator);
    }
    /**
     - A module of mass 14 requires 2 fuel. This fuel requires no further fuel (2 divided by 3 and rounded down is 0, which would call for a negative fuel), so the total fuel required is still just 2.
     - At first, a module of mass 1969 requires 654 fuel.
     Then, this fuel requires 216 more fuel (654 / 3 - 2). 216 then requires 70 more fuel, which requires 21 fuel, which requires 5 fuel, which requires no further fuel.
     So, the total fuel required for a module of mass 1969 is 654 + 216 + 70 + 21 + 5 = 966.
     - The fuel required by a module of mass 100756 and its fuel is: 33583 + 11192 + 3728 + 1240 + 411 + 135 + 43 + 12 + 2 = 50346.
     **/

    @Test
    void fuelForFuelCalculation_Scenario_14(){
        int mass = 14;
        int expected = 2;

        int actual = FuelFromMass.calculateFuelForFuel(mass, 0);
        assertEquals(expected, actual);
    }
    @Test
    void fuelForFuelCalculation_Scenario_1969(){
        int mass = 1969;
        int expected = 966;

        int actual = FuelFromMass.calculateFuelForFuel(mass, 0);
        assertEquals(expected, actual);
    }
    @Test
    void fuelForFuelCalculation_Scenario_33583(){
        int mass = 100756;
        int expected = 50346;

        int actual = FuelFromMass.calculateFuelForFuel(mass, 0);
        assertEquals(expected, actual);
    }
}


