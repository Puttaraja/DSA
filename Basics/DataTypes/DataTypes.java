package Basics.DataTypes;

public class DataTypes {
    
    public static void main(String[] args){

        // Primitve data types in Java
        byte byteVar = 8;
        short shortVar = 16;
        char charVar = 'A';
        int intVar = 10;
        long longVar = 100L;
        float floatVar = 20.5f;
        double doubleVar = 30.98;
        boolean boolVar = true;

        System.out.println("\nPrimitive Data Types in Java: ");
        System.out.println("Byte Value: " + byteVar);
        System.out.println("Short Value: " + shortVar);         
        System.out.println("Character Value: " + charVar);
        System.out.println("Integer Value: " + intVar); 
        System.out.println("Long Value: " + longVar);
        System.out.println("Float Value: " + floatVar);
        System.out.println("Double Value: " + doubleVar);
        System.out.println("Boolean Value: " + boolVar);

        // Non-Primitive (Reference) data type
        System.out.println("\nNon-Primitive Data Types in Java: ");
        String stringVar = "Hello";
        String str = new String("Geeks");

        System.out.println("String Value: " + stringVar);
        System.out.println("String Value using new: " + str);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Array Values: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        String[] strArr = {"Java", "Python", "C++"};
        System.out.print("\nString Array Values: ");
        for (String s : strArr) {
            System.out.print(s + " ");
        }

    }

}
