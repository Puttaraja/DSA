package DataStructures.HeapsDemo;
import java.util.Vector;

public class HeapsDemo {

    static int generateRandomNumber(int lower, int upper){
        return (int)(Math.random() * (upper - lower + 1)) + lower;
    }

    static class MinHeap{
        
        Vector<Integer> heap;

        MinHeap(){
            heap = new Vector<>();
        }

        Integer getParentIndex(int index){
            return (index-1)/2;
        }

        Integer getLeftChildIndex(int index){
            return 2*index + 1;
        }

        Integer getRightChildIndex(int index){
            return 2*index + 2;
        }

        void swap(int index1, int index2){
            int temp = heap.get(index1);
            heap.set(index1, heap.get(index2));
            heap.set(index2, temp);
        }

        void insert(int value){
            heap.add(value);
            int currentIndex = heap.size() - 1;
            while(currentIndex > 0){
                int parentIndex = getParentIndex(currentIndex);
                if(heap.get(currentIndex) < heap.get(parentIndex)){
                    swap(currentIndex, parentIndex);
                    currentIndex = parentIndex;
                } else {
                    break;
                }
            }
        }

        void printHeap(){
            System.out.println(heap);
        }

        void heapifyDown(int index){
            int smallest = index;
            int leftChild = getLeftChildIndex(index);
            int rightChild = getRightChildIndex(index);

            if(leftChild < heap.size() && heap.get(leftChild) < heap.get(smallest)){
                smallest = leftChild;
            }

            if(rightChild < heap.size() && heap.get(rightChild) < heap.get(smallest)){
                smallest = rightChild;
            }

            if(smallest != index){
                swap(index, smallest);
                heapifyDown(smallest);
            }
        }

        Integer peek(){
            if(heap.isEmpty()) return null;
            return heap.get(0);
        }

        Integer pop(){
            if(heap.isEmpty()) return null;
            int minElement = peek();
            // Remove the last element in the heap and move it to the root
            int lastElement = heap.remove(heap.size() - 1);
            // If heap is empty after removing the last element
            if(heap.isEmpty()) return minElement; 
            heap.set(0, lastElement);
            // Heapify down from the root to restore the heap property
            heapifyDown(0);
            return minElement;
        }

        void printParentChildRelationships(){
            for(int i = 0; i < heap.size()/2; i++){
                int parent = heap.get(i);
                int leftChild = (getLeftChildIndex(i) < heap.size()) ? heap.get(getLeftChildIndex(i)) : null;
                int rightChild = (getRightChildIndex(i) < heap.size()) ? heap.get(getRightChildIndex(i)) : null;
                System.out.println("Parent: " + parent + ", Left Child: " + leftChild + ", Right Child: " + rightChild);
            }
        }

    }
    
    static MinHeap createMinHeap(){
        MinHeap minHeap = new MinHeap();
        minHeap.insert(generateRandomNumber(1, 100));
        minHeap.insert(generateRandomNumber(1, 100));   
        minHeap.insert(generateRandomNumber(1, 100));
        minHeap.insert(generateRandomNumber(1, 100));
        minHeap.insert(generateRandomNumber(1, 100));
        minHeap.insert(generateRandomNumber(1, 100));
        minHeap.insert(generateRandomNumber(1, 100));
        minHeap.insert(generateRandomNumber(1, 100)); 
        return minHeap;
    }

    static void performBasicOperationsOnMinHeapUsingVector(){
        MinHeap heap = createMinHeap();
        System.out.println("Min Heap: ");
        heap.printHeap();
        System.out.println("Minimum element in the heap: " + heap.peek());
        heap.pop();
        System.out.println("Min Heap after popping the minimum element: ");
        heap.printHeap();
        System.out.println("Parent-Child Relationships: ");
        heap.printParentChildRelationships();
    }
    
    public static void main(String[] args) {
        performBasicOperationsOnMinHeapUsingVector();
    }
}
