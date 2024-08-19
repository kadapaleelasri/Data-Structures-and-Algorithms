public class binary_search {
    public static int binarySearch(int arr[],int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1; //if key not found
    }
    public static void main(String[] args) {
        int arr[] = {1,6,10,18,24,56};
        int key = 24;
        System.out.println("The key found at index: "+binarySearch(arr, key));

    }
}
