//package DivideAConquer;

public class DandC {
    //search an element in the rotated sorted array
    // this is kind of modified binay search .here i/p : distinct elements
    // approach-recursion //also try iterative meth
    public static int search(int[] arr,int tar,int si,int ei){
        if(si > ei){//base case
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid] == tar){
            return mid;
        }
        // mid on Line 1
        if(arr[si]<= arr[mid]){
            //case a:left side
            if(arr[si]<= tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{
                //case b:right side
                return search(arr, tar, mid+1, ei);
            }
        }else{
            //mid on Line 2
            if(arr[mid]<= tar && tar<=ei){
                //case a:on right
                return search(arr, tar, mid+1, ei);
            }else{
                //case b: on left
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,9,10,12,1,3,4};
        int target = 10;
        int index = search(arr,target,0,arr.length-1);
        System.out.println(index);

    }
}
