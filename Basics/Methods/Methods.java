package Basics.Methods;

public class Methods {

    static abstract class Animal {
        abstract void sound();
    }

    static class Parent {
        final void show() {
            System.out.println("Parent class method");
        }
    }

    static class Child extends Parent {
        // void show() { // This will cause a compile-time error
        //     System.out.println("Child class method");
        // }
    }

    static class Dog extends Animal {
        void sound() {
            System.out.println("\nDog object overrides sound method - Woof!");
        }
    }

    static class Cat extends Animal {
        void sound() {
            System.out.println("Cat object Overrides Sound method - Meow!");
        }
    }
    
    static class PreDefinedMethods {
        //user defined non-static/instance method need object creation to call the method
        //predefined methods are static methods of predefined classes like String, Math, etc.
        //Here we have used length, toUpperCase, substring methods of String class and random method of Math class
        void display() {
            System.out.println("\nPre-defined Methods:");
            String str = "Hello, World!";
            System.out.println("Original String: " + str);
            System.out.println("Length of String: " + str.length());
            System.out.println("Uppercase String: " + str.toUpperCase());
            System.out.println("Substring (0,5): " + str.substring(0, 5));
            System.out.println("Random Number (0.0 to 1.0): " + Math.random());
        }
    }

    //user defined static method no need of object creation
    static int multiply(int a, int b) {
        return a * b;  
    }

    public static void main(String[] args){
        PreDefinedMethods preDefined = new PreDefinedMethods();
        preDefined.display();
        int result = multiply(5, 10); //accessing static method directly
        System.out.println("\nUser-defined Method");
        System.out.println("Multiplication Result of {5, 10}: " + result);
        Animal dogObj = new Dog();
        dogObj.sound();
        Animal catObj = new Cat();
        catObj.sound();
    }
}

