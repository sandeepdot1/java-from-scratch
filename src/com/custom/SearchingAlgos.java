import java.util.ArrayList;

public class SearchingAlgos {
    // Sorting Algos
    // Given: 4,3,5,2,1   Output - 1,2,3,4,5
    
    static void bubbleSort(ArrayList<Integer> arr) {
        // approach - move the maximum element to the end of the unsorted part of array in each iteration
        int n = arr.size();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                // int temp = arr.get(j);
                if (arr.get(j) > arr.get(j+1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }

    }

    static void selectionSort(ArrayList<Integer> temp) {
        // approach - move the smallest element to the start of unsorted part of array in each iteration
        int n = temp.size();
        for (int i = 0; i < n; i++) {
            int mini = i;
            for (int j = i+1; j < n; j++) {
                if (temp.get(j) < temp.get(mini)) mini = j;
            }
            int tmp = temp.get(i);
            temp.set(i, temp.get(mini));
            temp.set(mini, tmp);
        }

    }

    static void insertionSort(ArrayList<Integer> arr) {
        // approach - we move the elements from unsorted part and place them in their correct positions in their sorted part
        // [4,3,5,2,1]
        int n = arr.size();
        for(int i = 0; i < n-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr.get(j) < arr.get(j-1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j-1));
                    arr.set(j-1, temp);
                }
            }
        }

    }
}
