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

     static void moveLast(int ind, char key, int count, char[] str) {
        if(ind == str.length) {
            return;
        }
        if(str[ind] == key) count++;
        else {
            char temp = str[ind];
            str[ind] = str[ind-count];
            str[ind-count] = temp;
        }
        moveLast(ind+1, key, count, str);
    }

    static void removeDuplicates(int ind, String str, boolean[] arr, String newStr) {
        if(ind == str.length()) {
            System.out.println(newStr);
            return;
        }
        if(arr[str.charAt(ind)-'a'] == false) {
            newStr += str.charAt(ind);
            arr[str.charAt(ind)-'a'] = true;
        }
        removeDuplicates(ind+1, str, arr, newStr);   
    }

    static void printSubsequences(int ind, String temp, String str) {
        if(ind == str.length()) {
            if(temp.length() == 0) System.out.println("{}");
            else System.out.println(temp);
            return;
        }
        // not pick
        printSubsequences(ind+1, temp, str);
        
        // pick
        temp += str.charAt(ind);
        printSubsequences(ind+1, temp, str);
    }

    static void printUniqueSubsequence(int ind, String str, String newStr) {
        System.out.println(newStr);
        HashSet<Character> set = new HashSet<>(); 
        for(int i = ind; i < str.length(); i++) {
            if(set.contains(str.charAt(i))) {
                continue;
            }
            else {
                set.add(str.charAt(i));
                String newString = newStr + str.charAt(i);
                printUniqueSubsequence(i+1, str, newString);
            }
        }
    }
}
