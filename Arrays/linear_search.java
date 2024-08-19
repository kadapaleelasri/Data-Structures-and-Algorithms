//import java.util.*;
public class linear_search {
    //time complexity O(n)
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void getLargest_and_Smallest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(Smallest>arr[i]){
                Smallest = arr[i];
            }
        }
        System.out.println("Largest "+largest);
        System.out.println("Smallest "+Smallest);

    }
    public static void main(String[] args) {
        int arr[] = {47,86,27,23,0,12};
        // int key=23;
        // int index=linearSearch(arr, key);
        // if(index==-1){
        //     System.out.println("key not found!");
        // }else{
        //     System.out.println("Key found at index: "+index);
        // }
        getLargest_and_Smallest(arr);
    }
}
