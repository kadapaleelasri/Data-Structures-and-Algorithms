public class Recursion_Problems {
    public static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){ //base case
            System.out.print(1+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    //factorial fn = n * f(n-1)
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fn_1 = factorial(n-1); 
        int fn = n * fn_1;
        return fn; 
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int Sn_1 = sum(n-1);
        int Sn = n+Sn_1;
        return Sn;
    }
    public static int NthFibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibn_1 = NthFibonacci(n-1);
        int fibn_2 = NthFibonacci(n-2);
        int fibn = fibn_1 + fibn_2;
        return fibn; 
    }
    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        //int n = 6;
        int arr[] = {1,2,4,5,6,7,8,6};
        //int arr1[] = {1,2,4,5,6};
        int key = 6;
        //printDec(n);
        //printInc(n);
        //System.out.println(factorial(n));
        //7System.out.println(sum(n));
        //System.out.println(NthFibonacci(n));
        System.out.println(firstOccurence(arr, key, 0));
        System.out.println(lastOccurence(arr, key, 0));
        // System.out.println(isSorted(arr, 0));
        // System.out.println(isSorted(arr1, 0));
    }
}
