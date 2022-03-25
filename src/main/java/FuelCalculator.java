class FuelFromMass {
    public static int fuelFromMassCalculator(int[] masses){
        int sum = 0;
        for (int i = 0; i < masses.length; i++) {
            sum += (masses[i] / 3) - 2;
        }
        return sum;
    }

   public static int wrappedFuelFromMassCalculator(int[] masses) {
        int totalSum = 0;
        int sum = 0;
        for (int i = 0; i < masses.length; i++) {
            sum += (masses[i] / 3) - 2;
            totalSum += sum;
        }
        return totalSum;
    }
}
