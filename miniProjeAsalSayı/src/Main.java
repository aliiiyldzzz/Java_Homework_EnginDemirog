public class Main {

    public static void main(String[] args) {
        int number = 25;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean inPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                inPrime = false;
            }
        }
    }
}