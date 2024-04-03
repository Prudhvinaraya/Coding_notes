import java.util.ArrayList;
import java.util.Scanner;

public class Remove_primes_From_Array_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the ArrayList
        int N = scanner.nextInt();

        // Input elements of the ArrayList
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }

        // Remove prime numbers from the ArrayList
        ArrayList<Integer> updatedList = removePrimes(A);

        // Output the updated ArrayList
        for (int num : updatedList) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> removePrimes(ArrayList<Integer> A) {
        ArrayList<Integer> updatedList = new ArrayList<>();
        for (int num : A) {
            if (!isPrime(num)) {
                updatedList.add(num);
            }
        }
        return updatedList;
    }

    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
