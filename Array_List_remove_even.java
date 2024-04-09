// We can remove the elements with any conditons in an array in two ways
//   1)traversing from 0th index and checking conditon and removing specific elements 
//   2)traversign from len-1 index and checking conditon and removing specific elements
// Here 2nd approach is good than 1st because there is no need to moving the arraylist elements in 2nd case
// The below code shows the ArrayList and removing of Even numbers from ArrayList
import java.util.*;

public class Array_list_remove_Even {
    public static void main(String[] args) {
        ArrayList<Integer> arrlst = new ArrayList<>();
        arrlst.add(5);
        arrlst.add(10);
        arrlst.add(15);
        arrlst.add(8);
        arrlst.add(2, 4);
        System.out.println("The Arraylist is =" + arrlst);
        // Remove evens from the array
        // lets traverse fromt the end
        for (int i = arrlst.size() - 1; i >= 0; i--) {
            if (arrlst.get(i) % 2 == 0) {
                arrlst.remove(i);
            }
        }
        System.out.println("After removing evens:::");
        System.out.println("The updated ArrayList is =" + arrlst);
    }
}
