public class RecursionBasics {
    static int getSum(int n) {
        if (n == 0) return 0; 
        
        int sum = n + getSum(n-1);
        return sum;
    }

    static int factorial (int n) {
        if (n == 0) return 1;
        int fact = factorial(n-1);
        return n*fact;
    }
    
    static int fibonnacci(int n) {
        if (n <= 1) return n;
        return fibonnacci(n-1) + fibonnacci(n-2);
    }

    static void printFibonnaci(int slast, int last, int n) {
        if(n == 0) return;
        if(slast == 0) {
            System.out.println(slast);
            System.out.println(last);
            n -= 2;
        }
        int curr = slast + last;
        System.out.println(curr);
        printFibonnaci(last, curr, n-1);
    }

    static int power(int x, int n) {
        if(n == 0) return 1;
        if(n%2 != 0) {
            return x * power(x, n-1);
        }
        else {
            int pow = power(x, n/2);
            return pow*pow;
        }
    }

    static void printReverse(int i, String word) {
        if(i == word.length()) {
            return;
        }
        printReverse(i+1, word);
        System.out.println(word.charAt(i));
    }

    static void stringOccurance(int first, int last, int idx, char key, String str) {
        if(idx == str.length()) {
            System.out.println(key + "occured first at index " + first + " and last at index " + last);
            return;
        }
        if(str.charAt(idx) == key) {
            last = idx;
            if(first == -1) first = idx;
        } 
        stringOccurance(first, last, idx+1, key, str);
    }

    static boolean isSorted(int idx, int[] arr) {
        if(idx == arr.length-1) {
            return true;
        }
        if(arr[idx] > arr[idx+1]) {
            return false;
        }
        if(isSorted(idx+1, arr) == false) {
            return false;
        }
        else return true;
    }
}
