package DataStructures.StringsDemo;

public class StringsDemo {

    static void declareAndInitializeStrings(){
        // Declaration and initialization of strings
        String str1 = "Hello, World!"; // String literal
        String str2 = new String("Java Programming"); // Using new keyword

        // Printing the strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }

    static void performBasicOperationsOnStrings(){
        String str = "Hello, World!";

        // Length of the string
        System.out.println("\nLength of str: " + str.length());

        // Accessing characters
        System.out.println("Character at index 1: " + str.charAt(1));

        // Substring
        System.out.println("Substring (0, 5): " + str.substring(0, 5));

        // Concatenation
        String str3 = str.concat(" Welcome to Java.");
        System.out.println("Concatenated String: " + str3);

        // Changing case
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // Trimming whitespace
        String str4 = "   Hello, Java!   ";
        System.out.println("Trimmed String: '" + str4.trim() + "'");

        // Replacing characters
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // Checking equality
        String str5 = "hello, world!";
        System.out.println("str equals str5: " + str.equals(str5));
        System.out.println("str equalsIgnoreCase str5: " + str.equalsIgnoreCase(str5));

        // Finding index of a character or substring
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Index of 'World': " + str.indexOf("World"));
    }

    // String is immutable in Java
    // Any operation that seems to modify a string actually creates a new string
    static void demonstrateStringImmutability() {
        String s = "Sachin";
    
        // concat() method appends the string at the end
        s.concat(" Tendulkar");
    
        // This will print Sachin because strings are immutable objects
        System.out.println(s);
    }

    // Use StringBuffer to perform string manipulations
    static void performBasicOperationsUsingStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(", World!");
        System.out.println("\nAfter append: " + sb.toString());

        // Insert
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb.toString());

        // Replace
        sb.replace(6, 15, "Amazing");
        System.out.println("After replace: " + sb.toString());

        // Delete
        sb.delete(5, 13);
        System.out.println("After delete: " + sb.toString());

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        // Length
        System.out.println("Length of StringBuffer: " + sb.length());

        // Capacity
        System.out.println("Capacity of StringBuffer: " + sb.capacity());
    }

    // Use StringBuilder to perform string manipulations
    static void performBasicOperationsUsingStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");

        // Append
        sb.append(", World!");
        System.out.println("\nAfter append: " + sb.toString());

        // Insert
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb.toString());

        // Replace
        sb.replace(6, 15, "Amazing");
        System.out.println("After replace: " + sb.toString());

        // Delete
        sb.delete(5, 13);
        System.out.println("After delete: " + sb.toString());

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        // Length
        System.out.println("Length of StringBuilder: " + sb.length());
    }

    // String Tokenizer is legacy and not recommended for new code
    // Use String.split() or Scanner for tokenizing strings 
    static void stringTokenizerDemo() {
        String str = "Hello, World! Welcome to Java.";
        String[] tokens = str.split(" "); // Split by space

        System.out.println("\nTokens:");
        for (String token : tokens) {
            System.out.println(token);
        }
    }

    static String  convertStringToCharStringArray(String str){
        // Convert string to char array
        char[] charArray = str.toCharArray();
        System.out.print("Character Array: ");
        StringBuilder res = new StringBuilder();
        for (char ch : charArray) {
            System.out.print(ch + " ");
            res.append(ch).append(" ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        declareAndInitializeStrings();
        performBasicOperationsOnStrings();
        demonstrateStringImmutability();
        performBasicOperationsUsingStringBuffer();
        performBasicOperationsUsingStringBuilder();
        stringTokenizerDemo();
        String result = convertStringToCharStringArray("Hello");
        System.out.println("\nResult from convertStringToCharStringArray: " + result);
    }

}
