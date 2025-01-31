class FuelFromMass {
    public static int calculateFuelForMasses(int[] masses){
        int sum = 0;
        for (int i = 0; i < masses.length; i++) {
            sum += (masses[i] / 3) - 2;
        }
        return sum;
    }

    public static int calculateFuelForFuel(int mass, int totalFuel) {
        int sum = (mass / 3) - 2;
        if (sum > 0) {
            totalFuel += sum;
            return calculateFuelForFuel(sum, totalFuel);
        }
        return totalFuel;
    }
}
