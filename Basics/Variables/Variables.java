public class Variables {
    int instanceVar = 50;          // Instance variable
    static int staticVar = 100;    // Static variable

    void display() {
        int localVar = 10;         // Local variable
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.display();
    }
}
