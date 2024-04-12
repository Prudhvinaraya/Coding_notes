// Dynamic Arrays in Java--->Arraylist
// Difference Between Arrays and Arraylist
//   ->Arrays are natural Data structres whereas ArrayList are added class
//   ->Arrays is of fixed size but we can have dynamic Array with ArrayList
//   ->Arrays can hold primitive datatypes whereas Arraylist holds the objects
// Defining an arraylist-> ArrayList <Integer> arrlst=new ArrayList<>();
// Basic operations :
// 1)arrlst.add(value)-> adds the element into the arraylist
// 2)arrlst.add(index,value)->adds the element in the specified location of arraylist
// 3)int x=arrlst.get(index) ->will return the element in the specific index
// 4)arrlst.set(index,newele) ->will return the arrlst with replacing value at the specified index
// 5)arrlst.size()->returns the size of the arraylist
// 6)int y=arrlst.remove(index) ->returns the object at specific location
// 7)arrlst.clear()->to clear the values stored in arrlst
// 8)arrlst.indexOf(value)->will return the index value of particular element

// here is the code that demonstrates the operations that can be done on a ArrayList
import java.util.*;
class Array_List_operations {
    public static void main(String[] args) {
        // Define an ArrayList of integers
        ArrayList<Integer> arrlst = new ArrayList<>();

        // Perform basic operations on ArrayList
        arrlst.add(30); // Add 30 to ArrayList
        arrlst.add(40); // Add 40 to ArrayList
        arrlst.add(2, 50); // Add 50 at index 2
        arrlst.remove(0); // Remove element at index 0
        Integer firstElement = arrlst.get(0); // Get element at index 0
        Integer previousElement = arrlst.set(1, 22); // Replace element at index 1 with 22
        Integer removedElement = arrlst.remove(1); // Remove element at index 1
        int size = arrlst.size(); // Get size of ArrayList
        int indexOf40 = arrlst.indexOf(40); // Get index of element 40
        String x = arrlst.toString(); // Convert ArrayList to String representation

        // Print ArrayList after operations
        System.out.println("ArrayList after operations: " + x);
        System.out.println("First Element: " + firstElement);
        System.out.println("Previous Element at index 1: " + previousElement);
        System.out.println("Removed Element at index 1: " + removedElement);
        System.out.println("Size of ArrayList: " + size);
        System.out.println("Index of 40: " + indexOf40);
        Integer removed = arrlst.remove(0);
        System.out.println("The final Arraylist=" + arrlst);
    }
}
