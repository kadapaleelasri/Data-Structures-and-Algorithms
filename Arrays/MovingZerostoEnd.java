public class MovingZerostoEnd {
    public static void moveZerostoEnd(int[] arr){
        int k = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {0,1,2,0,3,0,0,4};
        int arr1[] = {0,0,3,0,0,4};
        moveZerostoEnd(arr);
        moveZerostoEnd(arr1);
    }
}
