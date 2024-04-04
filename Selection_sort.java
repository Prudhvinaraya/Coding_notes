class Selection_sort {
    public static void main(String args[]) {
        int[] arr = { 1, 4, 3, 2 };
        int n = arr.length;
        // selection sort
        for (int i = 0; i < n; i++) 
        {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
        // printing the whole array
        // System.out.println(arr.values);
    }
}
