class PrimeorNot{
    public static void main(String[] args) {
        int start = 1, end = 50; 
        for (int n = start; n <= end; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
