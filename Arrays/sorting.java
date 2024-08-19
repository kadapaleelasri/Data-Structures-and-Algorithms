//import java.util.Arrays;
//import java.util.Collections;
public class sorting {
    //TC - O(n**2) SC- O(1)
    public static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean flag = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println("Array after sorting ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[pos]>arr[j])
                pos=j;
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        System.out.println("Array after sorting ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionSort(int arr[]){
        //tc O(n**2) sc O(1)
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.println("Array after sorting ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void printArr1(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void countingSort(int arr[]){
        //TC O(n+max_element))
        int max_element = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max_element = Math.max(max_element,arr[i]);
        }
        int count[] = new int[max_element+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<max_element+1;i++){ 
            while(count[i]>0){
                arr[k] = i;
                k++;
                count[i]--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1,3};
        //bubble_sort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        //int arr1[] = {5,4,1,3,2};
        //inbuilt sort()
        // Arrays.sort(arr1); // sorts in ascending order
        // printArr(arr1);
        // Arrays.sort(arr1,0,2);
        // printArr(arr1);
        // Integer array1[] = {5,6,1,3,2}; // array1 is object of class Integer
        // //to sort in desc order using collections
        // Arrays.sort(array1,Collections.reverseOrder());
        // printArr1(array1);
        //Arrays.sort(array1,0,3,Collections.reverseOrder());
        countingSort(arr);
    }
}
