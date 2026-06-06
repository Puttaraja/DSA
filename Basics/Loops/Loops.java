package Basics.Loops;

public class Loops {
    public static int[] arr = {1, 2, 3, 4, 5};

    static class ForLoop {

        void display(){
            System.out.println("For Loop:");
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }

    static class WhileLoop {

        void display(){
            System.out.println("While Loop:");
            int i=0;
            while(i<arr.length){
                System.out.println(arr[i]);
                i++;
            }
        }
    }

    static class DoWhileLoop {

        void display(){
            System.out.println("Do-While Loop:");
            int i=0;
            do{
                System.out.println(arr[i]);
                i++;
            }while(i<arr.length);
        }
    }
    public static void main(String[] aStrings) {
        ForLoop obj = new ForLoop();
        obj.display();
        WhileLoop obj1 = new WhileLoop();
        obj1.display(); 
        DoWhileLoop obj2 = new DoWhileLoop();
        obj2.display();
    }
}
