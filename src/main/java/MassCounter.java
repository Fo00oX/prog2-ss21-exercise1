public class MassCounter {
    public static int countNumberOfMasses(int[] masses) {
        int count = 0;

        for (int mass :
                masses) {
            count++;
        }
        return count;
    }
}
