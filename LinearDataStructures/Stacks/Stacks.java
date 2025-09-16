package LinearDataStructures.Stacks;
import java.util.Stack;
import java.util.ArrayList;

public class Stacks {

    static Stack<Integer> createStackFromArrayList(ArrayList<Integer> arr){
        Stack<Integer> stack = new Stack<>();
        for (Integer integer : arr) {
            stack.push(integer);     
        }
        return stack;
    }

    static void performBasicOperationsOnStack(Stack<Integer> stack){
        // Push
        stack.push(60);
        System.out.println("After pushing 60: " + stack);

        // Pop
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("After popping: " + stack);

        // Peek
        int top = stack.peek();
        System.out.println("Top element: " + top);

        // Search
        int position = stack.search(30); // Returns 1-based position from the top
        System.out.println("Position of 30 from top: " + position);

        // Check if stack is empty
        boolean isEmpty = stack.isEmpty();  
        System.out.println("Is stack empty? " + isEmpty);

        // Size of the stack
        int size = stack.size();
        System.out.println("Size of stack: " + size);

        // Clear the stack
        stack.clear();
        System.out.println("After clearing, is stack empty? " + stack.isEmpty());
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);        
        arr.add(20);
        arr.add(30);
        arr.add(40);    
        arr.add(50);
        Stack<Integer> stack = createStackFromArrayList(arr);
        System.out.println("Stack: " + stack);
        performBasicOperationsOnStack(stack);
    }

}
