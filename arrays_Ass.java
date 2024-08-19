import java.util.HashSet;
import java.util.Scanner;

public class arrays_Ass {
    public static boolean elementsRepeated(int arr[]){
        //Approach 1: brute force O(n**2)
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i] == arr[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        // Approach 2: using set O(n)
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){ // check if set contains the arr[i] value already
                return true; // if elements are repeated
            }else{
                set.add(arr[i]); //otherwise add the element to set
            }
        }
        return false;
    }
    public static int findTarget(int arr[],int key){
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_len = sc.nextInt();
        int arr[] = new int[arr_len];
        for(int i=0;i<arr_len;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(findTarget(arr, key));
        //System.out.println(elementsRepeated(arr));
        sc.close();
    }
}
