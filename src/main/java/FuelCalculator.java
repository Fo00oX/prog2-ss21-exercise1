import java.util.stream.IntStream;

class FuelFromMass {
    public static int fuelFromMassCalculator(int[] mass){
        int sum = IntStream.of(mass).sum();
        return sum;
    }
}
