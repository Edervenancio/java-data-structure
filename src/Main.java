import static BigO.BigOConstant.multiplyNumbers;
import static BigO.BigOLinear.printNumbers;
import static BigO.BigOSquared.printNumbersSquared;
import static BigO.NonDominantSquared.printNonDominant;
import static BigO.SpaceComplexity.sumNumbers;

public class Main {


    public static void main(String[] args) {
        // O(1) System.out.println(multiplyNumbers(2));

        // 0(N) printNumbers(10);

        // O(n²)printNumbersSquared(3);
        // O(n³)printNumbersThree(3);

        // O(n²+n) printNonDominant(3);

        System.out.println(sumNumbers(2));

    }
}