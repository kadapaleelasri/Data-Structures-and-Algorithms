public class merge_sort {
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void mergeSort1(String arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort1(arr, si, mid);
        mergeSort1(arr, mid+1, ei);
        merge1(arr,si,mid,ei);
    }
    public static void merge1(String arr[],int si,int mid,int ei){
        String temp[] = new String[ei-si+1];
        int i=si; //left part iterator
        int j=mid+1; //right part iterator
        int k=0; //temporary array iterator
        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){ //copying to original array
            arr[i] = temp[k];
        }
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i=si; //left part iterator
        int j=mid+1; //right part iterator
        int k=0; //temporary array iterator
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){ //copying to original array
            arr[i] = temp[k];
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void printArr1(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //iterative approach
    // public static int inversionCount(int arr[]){
    //     int count = 0;
    //     for(int i=0;i<arr.length;i++){
    //         int element = arr[i];
    //         for(int j=i-1;j>=0;j--){
    //             if(arr[j]>element){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    //recursive approach TC-O(nlogn)
    public static int[] inversionCount(int arr[],int si,int ei){
        if(si>=ei){
            int baseArray[] = new int[1];
            baseArray[0] = arr[si];
            return baseArray; 
        }
        int mid = si + (ei-si)/2; // can be (si+ei)/2
        int left[] = inversionCount(arr, si, mid);
        int right[] = inversionCount(arr,mid+1,ei);
        int res[] = mergeTwoArrays(left,right);
        return res;
    }
    public static int count1 = 0;
    public static int[] mergeTwoArrays(int arr1[],int arr2[]){
        int n=arr1.length;
        int m= arr2.length;
        int res[] = new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                res[k] = arr1[i];
                i++;
            }else{
                res[k] = arr2[j];
                j++;
                count1 += (n-i); // i can be mid+1 -i
            }
            k++;
        }
        while(i<n){
            res[k++] = arr1[i++];
        }
        while(j<m){
            res[k++] = arr2[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        // int arr[] = {6,3,4,5,9,8};
        // String arr1[] = {"sun","earth","mars","mercury"};
        // mergeSort1(arr1,0,arr1.length-1);
        // printArr1(arr1);
        // mergeSort(arr,0,arr.length-1);
        // printArr(arr);
       // int nums[] = {2,1,4,6,3,7};
        //System.out.println(inversionCount(nums));
        //int res[] = inversionCount(nums,0,nums.length-1);
      //  printArr(res);
        System.out.println(count1);
    }
}
