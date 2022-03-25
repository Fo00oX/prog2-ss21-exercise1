

class FuelFromMass {
    public static int fuelFromMassCalculator(int[] masses){
        int sum = 0;
        for (int i = 0; i < masses.length; i++) {
            sum += (masses[i] / 3) - 2;
        }
        return sum;
    }
}
