package DataStructures.HashMapsDemo;
import java.util.HashMap;
import java.util.HashSet;   
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;

public class HashMapsDemo {

    static List<Integer> getArrayList(){
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        return arr;
    }

    static void basicOperationsOnHashMap(){
        // Implementation of basic operations on HashMap
        List<Integer> arr = getArrayList();
        HashMap<Integer, String> map = new HashMap<>();
        for( Integer num: arr){
            map.put(num, "Value" + num);
        }
        System.out.println("HashMap: " + map);

        // get value for a key
        System.out.println("Get value for key 30: " + map.get(30));

        // remove value using key
        map.remove(20);
        System.out.println("After removing key 20: " + map);

        // check if key exists
        System.out.println("Contains key 40? " + map.containsKey(40));

        // check if value exists
        System.out.println("Contains value 'Value50'? " + map.containsValue("Value50"));
    
        // size of the map
        System.out.println("Size of HashMap: " + map.size());

        // clear the map
        map.clear();
        System.out.println("After clearing, is HashMap empty? " + map.isEmpty());
    }

    static void basicOperationsOnHashSet(){
        // Implementation of basic operations on HashSet
        List<Integer> arr = getArrayList();
        HashSet<Integer> set = new HashSet<>(arr);
        System.out.println("HashSet: " + set);

        set.add(70);
        System.out.println("After adding 70: " + set);

        set.add(30); // Duplicate, will not be added
        System.out.println("After adding duplicate 30: " + set);

        set.remove(20);
        System.out.println("After removing 20: " + set);

        System.out.println("Contains 40? " + set.contains(40));

        System.out.println("Size of HashSet: " + set.size());

        set.clear();
        System.out.println("After clearing, is HashSet empty? " + set.isEmpty());
    }

    static void basicOperationsOnLinkedHashMap(){
        // Implementation of basic operations on LinkedHashMap
        List<Integer> arr = getArrayList();
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        for( Integer num: arr){
            map.put(num, "Value" + num);
        }
        System.out.println("LinkedHashMap: " + map);

        // get value for a key
        System.out.println("Get value for key 30: " + map.get(30));

        // get key for a value
        // Not directly supported, need to iterate
        Integer keyForValue50 = null;
        for (Integer key : map.keySet()) {
            if (map.get(key).equals("Value50")) {
                keyForValue50 = key;
                break;
            }
        }
        System.out.println("Key for value 'Value50': " + keyForValue50);

        // get key-value pairs
        System.out.print("Key-Value pairs: ");
        for (var entry : map.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }

        // keySet view
        System.out.println("\nKeys in LinkedHashMap: " + map.keySet());
        // valueSet view
        System.out.println("\nValues in LinkedHashMap: " + map.values());
        // entrySet view
        System.out.println("\nEntries in LinkedHashMap: " + map.entrySet());

        // remove value using key
        map.remove(20);
        System.out.println("After removing key 20: " + map);

        // check if key exists
        System.out.println("Contains key 40? " + map.containsKey(40));

        // check if value exists
        System.out.println("Contains value 'Value50'? " + map.containsValue("Value50"));

        // size of the map
        System.out.println("Size of LinkedHashMap: " + map.size());

        // clear the map
        map.clear();
        System.out.println("After clearing, is LinkedHashMap empty? " + map.isEmpty());
    }

    static void basicOperationsOnLinkedHashSet(){
        // Implementation of basic operations on LinkedHashSet
        List<Integer> arr = getArrayList();
        LinkedHashSet<Integer> set = new LinkedHashSet<>(arr);
        System.out.println("LinkedHashSet: " + set);
        set.add(70);
        System.out.println("After adding 70: " + set);
        set.add(30); // Duplicate, will not be added
        System.out.println("After adding duplicate 30: " + set);

        // Iterate through the set
        System.out.print("Elements in LinkedHashSet: ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }

        System.out.println();

        set.remove(20);
        System.out.println("After removing 20: " + set);

        System.out.println("Contains 40? " + set.contains(40));

        System.out.println("Size of LinkedHashSet: " + set.size());

        set.clear();
        System.out.println("After clearing, is LinkedHashSet empty? " + set.isEmpty());
    }

    public static void main(String[] args) {
        System.out.println("\n\nHashMaps in Java");
        basicOperationsOnHashMap();
        System.out.println("\n\nHashSets in Java");
        basicOperationsOnHashSet();
        System.out.println("\n\nLinkedHashMaps in Java");
        basicOperationsOnLinkedHashMap();
        System.out.println("\n\nLinkedHashSets in Java");
        basicOperationsOnLinkedHashSet();
    }
    
}
