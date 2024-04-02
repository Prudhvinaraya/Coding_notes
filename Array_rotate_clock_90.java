import java.util.*;

class Array_rotate_clock_90 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr[][] = new int[m][m];
        // input matrix is taken
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Here is the Given Matrix ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // our task is to rotate the matrix 90 degrees
        // for that step 1 is to do the transpose of given matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // step 2 is to reverse the row elements
        int l = 0;
        int r = arr[0].length - 1;
        for (int i = 0; i < m; i++) {
            while (l < r) {
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
                l++;
                r--;
            }
        }
        System.out.println("The Matrix after 90 degree rotation is ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
