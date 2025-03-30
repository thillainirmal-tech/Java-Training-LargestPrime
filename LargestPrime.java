public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int factor = -1;

        for (int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }

            factor = i;

            while (number % i == 0) {
                number /= i;
            }
        }

        return number == 1 ? factor : number;
    }

    public static void main(String[] args) {
        System.out.println("Test Cases:");

        System.out.println("getLargestPrime(21) → " + getLargestPrime(21));   // 7
        System.out.println("getLargestPrime(217) → " + getLargestPrime(217)); // 31
        System.out.println("getLargestPrime(0) → " + getLargestPrime(0));     // -1
        System.out.println("getLargestPrime(45) → " + getLargestPrime(45));   // 5
        System.out.println("getLargestPrime(7) → " + getLargestPrime(7));     // 7
        System.out.println("getLargestPrime(31) → " + getLargestPrime(31));   // 31
        System.out.println("getLargestPrime(77) → " + getLargestPrime(77));   // 11
        System.out.println("getLargestPrime(2) → " + getLargestPrime(2));     // 2
        System.out.println("getLargestPrime(1) → " + getLargestPrime(1));     // -1
    }
}
