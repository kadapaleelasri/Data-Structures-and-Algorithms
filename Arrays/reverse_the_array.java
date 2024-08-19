public class reverse_the_array {
    //time complexity O(n) space complexity O(1)
    public static void reverseArray(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
