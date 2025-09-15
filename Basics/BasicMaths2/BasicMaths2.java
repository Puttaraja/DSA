package Basics.BasicMaths2;

public class BasicMaths2 {

    static class Point {
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int generateRandomNumber(int lower, int upper){
        return (int)(Math.random() * (upper - lower + 1)) + lower;
    }
        
    static int sumOfDigitsOfNumber(int num){
        int sum = 0;
        while( num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    static int reverseANumber(int num){
        int rev = 0;
        while( num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }

    static boolean isPrimeNumber(int num) {
        if(num == 2 || num == 3) return true;
        if(num <= 1 || num%2 == 0 || num % 3 == 0) return false;
        for(int i=5; i<=Math.sqrt(num); i += 6) {
            if(num % i == 0 || num % (i+2) == 0) return false;
        }
        return true;
    }

    static boolean isPowerOfANumberNaive(int num, int base){
        if(num < 1 || base < 2) return false;
        while(num % base == 0) {   // O(log n)
            num /= base;
        }
        return num == 1;
    }

    static boolean isPowerOfANumberEfficient(int num, int base){
        if(num < 1 || base < 2) return false;
        int pow = base;
        int exp = 1;
        while(pow < num){  
            pow *= pow;    // exponential growth
            exp *= 2;      // Keep track of exponent to search later
        }
        if(pow==num) return true;
        int left =exp/2, right=exp;    // search range for exponent
        while(left <= right){
            int mid = left + (right - left)/2;
            pow = (int)Math.pow(base, mid);
            if(pow == num) return true;
            else if(pow < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    static boolean isPowerOfANumberMostEfficient(int num, int base){
        if(num < 1 || base < 2) return false;
        double logVal = Math.log(num) / Math.log(base);  // Change of base formula
        return logVal == Math.floor(logVal);             // Check if logVal is an integer
    }

    static double getDistanceOfTwoPoints(int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static boolean isValidTriangle(int a, int b, int c){
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    static boolean isObtuseTriangle(int a, int b, int c){
        int max = Math.max(a, Math.max(b, c));
        int sumOfSquares = a*a + b*b + c*c;
        return sumOfSquares < 2 * max * max;
    }

    static boolean isAcuteTriangle(int a, int b, int c){
        int max = Math.max(a, Math.max(b, c));
        int sumOfSquares = a*a + b*b + c*c;
        return sumOfSquares > 2 * max * max;
    }

    static boolean isRightAngledTriangle(int a, int b, int c){
        int max = Math.max(a, Math.max(b, c));
        int sumOfSquares = a*a + b*b + c*c;
        return sumOfSquares == 2 * max * max;
    }

    static boolean doRectanglesOverlap(Point l1, Point r1, Point l2, Point r2){
        if(l1.x >= r2.x || l2.x >= r1.x) return false; // One rectangle is to the left of the other
        if(l1.y <= r2.y || l2.y <= r1.y) return false; // One rectangle is above the other
        return true;
    }

    static int factorialOfNumber(int num){
        if(num < 0) return -1; // Factorial not defined for negative numbers
        if(num == 0 || num == 1) return 1;
        int fact = 1;
        for(int i=2; i<=num; i++){
            fact *= i;
        }
        return fact;
    }

    static int gcdOfTwoNumbersIterationMethod(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num = generateRandomNumber(1000, 10000);
        System.out.println("Sum of digits of " + num + ": " + sumOfDigitsOfNumber(num));
        System.out.println("Reverse of " + num + ": " + reverseANumber(num));
        System.out.println("Is " + num + " a prime number? " + isPrimeNumber(num));
        int base = generateRandomNumber(2, 10);
        System.out.println("Is " + num + " a power of " + base + "? (Naive): " + isPowerOfANumberNaive(num, base));
        System.out.println("Is " + num + " a power of " + base + "? (Efficient): " + isPowerOfANumberEfficient(num, base));
        System.out.println("Is " + num + " a power of " + base + "? (Most Efficient): " + isPowerOfANumberMostEfficient(num, base));
        int x1 = generateRandomNumber(-100, 100);
        int y1 = generateRandomNumber(-100, 100);           
        int x2 = generateRandomNumber(-100, 100);
        int y2 = generateRandomNumber(-100, 100);
        System.out.printf("Distance between points (%d, %d) and (%d, %d): %.2f\n", x1, y1, x2, y2, getDistanceOfTwoPoints(x1, x2, y1, y2));
        int a = generateRandomNumber(30, 40);
        int b = generateRandomNumber(30, 40);   
        int c = generateRandomNumber(20, 30);
        System.out.println("Is a valid triangle? " + isValidTriangle(a, b, c));
        if(isValidTriangle(a, b, c)){
            System.out.println("Is an obtuse triangle? " + isObtuseTriangle(a, b, c));
            System.out.println("Is an acute triangle? " + isAcuteTriangle(a, b, c));
            System.out.println("Is a right-angled triangle? " + isRightAngledTriangle(a, b, c));
        }
        Point l1 = new Point(generateRandomNumber(1,10), generateRandomNumber(1,10));
        Point r1 = new Point(generateRandomNumber(1,10), generateRandomNumber(1,10));
        Point l2 = new Point(generateRandomNumber(1,10), generateRandomNumber(1,10));
        Point r2 = new Point(generateRandomNumber(1,10), generateRandomNumber(1,10));
        System.out.println("Do rectangles overlap? " + doRectanglesOverlap(l1, r1, l2, r2));
        int factNum = generateRandomNumber(0, 100);
        System.out.println("Factorial of " + factNum + ": " + factorialOfNumber(factNum));
    }
}
 