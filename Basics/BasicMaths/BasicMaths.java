package Basics.BasicMaths;

public class BasicMaths {

    static boolean isEvenOrOdd(int num) {
        return num % 2 == 0;
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static void printMultiplicationTable(int num){
        System.out.println("\nMultiplication Table of " + num + ":");
        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    static int sumOfNumbers(int n) {
        return n * (n + 1) / 2;
    }

    static int sumOfSquaresOfNumbers(int n){
        return n * (n+1) * (2*n + 1) / 6;
    }

    static void swapTwoNumbersWithVariable(int a, int b) {
        System.out.println("\nBefore Swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }

    static void swapTwoNumbersWithoutVariable(int a, int b) {
        System.out.println("\nBefore Swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }

    static int closestNumberDivisibleByM(int num, int m){
        return (num % m) >= 0 ? num - (num % m) : num + (num % m);
    }

    static int oppositeSideOfDice(int num) {
        if (num < 1 || num > 6) {
            throw new IllegalArgumentException("Input must be between 1 and 6");
        }
        return 7 - num;
    }

    static int nthTermOfAP(int a, int d, int n) {
        return a + (n - 1) * d;
    }

    public static void main(String[] args){
        int number = 8;
        System.out.println("\nMaths Algorithms:");
        System.out.println("\nIs " + number + " even? " + isEvenOrOdd(number));
        System.out.println("\nIs " + number + " prime? " + isPrime(number));
        System.out.println("\nSum of numbers from 1 to " + number + ": " + sumOfNumbers(number));
        System.out.println("\nSum of squares of numbers from 1 to " + number + ": " + sumOfSquaresOfNumbers(number));
        printMultiplicationTable(number);
        swapTwoNumbersWithVariable(5, 10);
        swapTwoNumbersWithoutVariable(15, 25);
        int num = -15, m = 6;
        System.out.println("\nClosest number less than or equal to " + num + " that is divisible by " + m + ": " + closestNumberDivisibleByM(num, m));
        int diceNum = (int)(Math.random() * 6 + 1);
        System.out.println("\nOpposite side of dice for " + diceNum + ": " + oppositeSideOfDice(diceNum));
        int a = 2, d = 3, n = 5;
        System.out.println("\n" + n + "th term of AP with first term "+ a + " and common difference " + d + ": " + nthTermOfAP(a, d, n));   
    }
}
