public class PrimeNumber {
    public static void main(String[] args) {
        int number = 29; // Predefined number

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime
        if (num <= 3) return true;  // 2 and 3 are prime

        if (num % 2 == 0 || num % 3 == 0) return false; // Eliminate even numbers and multiples of 3

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }

        return true;
    }
}
