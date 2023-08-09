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
}
