package Basics.ConditionalStatements;

public class ConditionalStatements {

    static int[] arr = {10, 20, 30, 40, 50};

    static class IfElse {

        void display() {
            System.out.println("If-Else Statement:");
            for (int num : arr) {
                if (num % 20 == 0) {
                    System.out.println(num + " is divisible by 20");
                } else {
                    System.out.println(num + " is not divisible by 20");
                }
            }
            System.out.println("\nNested If Statement:");
            int x = 12, y = 7;
            if (x > 10) {
                if (y > 5) {
                    System.out.println("x > 10 and y > 5");
                }
            }
            System.out.println("\nif-else-if Ladder:");
            int marks = 85;
            if (marks >= 90) {
                System.out.println("Grade A");
            } else if (marks >= 80) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        }
    }

    static class SwitchCase {

        void display() {
            System.out.println("\nSwitch-Case Statement:");
            for (int num : arr) {
                switch (num) {
                    case 10:
                        System.out.println("Number is Ten");
                        break;
                    case 20:
                        System.out.println("Number is Twenty");
                        break;
                    case 30:
                        System.out.println("Number is Thirty");
                        break;
                    case 40:
                        System.out.println("Number is Forty");
                        break;
                    case 50:
                        System.out.println("Number is Fifty");
                        break;
                    default:
                        System.out.println("Number not in range");
                }
            }
        }
    }

    static class Break {
        void display() {
            System.out.println("\nBreak Statement:");
            for (int i = 1; i <= 5; i++) {
                if (i == 3) break;
                System.out.println(i);
            }
        }
    }

    static class Continue {
        void display() {
            System.out.println("\nContinue Statement:");
            for (int i = 1; i <= 5; i++) {
                if (i == 3) continue;
                System.out.println(i);
            }
        }
    }

    static class Return {
        int factorial(int n) {
            if (n == 0) return 1;
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        IfElse ifElseObj = new IfElse();
        ifElseObj.display();
        SwitchCase switchCaseObj = new SwitchCase();
        switchCaseObj.display();
        Break breakObj = new Break();
        breakObj.display();
        Continue continueObj = new Continue();
        continueObj.display();
        Return returnObj = new Return();
        int num = 5;
        System.out.println("\nFactorial of " + num + " is: " + returnObj.factorial(num));
    }
    
}
