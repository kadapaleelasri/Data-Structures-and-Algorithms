public class revision {
    public static void printPairs(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void printSubArrays(int[] arr){ // a continuous part of array
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        //TC - O(n^3)
        for(int i=0;i<n;i++){//start
            for(int j=i;j<n;j++){//end
                int sum = 0;
                for(int k=i;k<=j;k++){//start->end thak
                    //System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                //System.out.println(sum);
                if(max < sum){
                    max = sum;
                }
               // System.out.println();
            }
           // System.out.println();
        }
        System.out.println("max subarray sum: "+max);
    }
    // prefix sum approach to find maxSubArr sum - TC O(n^2), SC-O(n)
    public static void maxSubArrSumPS(int[] arr){
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        // get prefixSum
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        //find max
        // int maxSum = prefixSum[n-1]; // if arr all ele's +ve
        // for(int i=1;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int currSum = prefixSum[j] - prefixSum[i-1];
        //         if(maxSum < currSum){
        //             maxSum = currSum;
        //         }
        //     }
        // }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currSum = (i==0)? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sub arr sum : "+maxSum);
    }
    // kadane's algorithm - TC - O(n), SC - O(1)
    // if currsum is - ve then currsum = 0
    public static int maxSubArrSumKadan(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int val : arr) {
            currSum += val;
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    // public static int maxSubArrSumKadan(int[] arr){ 
    // it will work if i/p arr has all -ve ele - so corrected version method is above
    // it return 0 instead greatest -ve num
    //     int n = arr.length;
    //     int maxSum = Integer.MIN_VALUE;
    //     int ms1 = Integer.MIN_VALUE;
    //     int currSum = 0;
    //     for(int i=0;i<n;i++){
    //         currSum+=arr[i];
    //         if(currSum < 0){
    //             currSum = 0;
    //         }
    //         maxSum = Math.max(maxSum,currSum);
    //     }
    //    return maxSum;
    // }
    public static int getTargetidx(int[] arr,int tar){
        int i =0;
        int j = arr.length-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid]== tar){
                return mid;
            }else if(arr[mid]<tar){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        if(j<0){
            return 0;
        }
        return j+1;
    }
    public static void main(String args[]){
        int arr[] = {-1,-3,2,-4,-5};
        int arr1[] = {2,4,6,8,10};
        int arr2[] = {-2,-3,-1,-4,-5}; // op: -1
        //printPairs(arr);
        //printSubArrays(arr);
        //printSubArrays(arr1);
        //maxSubArrSumPS(arr1);//30
        //maxSubArrSumPS(arr);//15
       //System.out.println(maxSubArrSumKadan(arr2));// op : -1
       //System.out.println(maxSubArrSumKadan(arr));// 2
        //  int a = -1,b=Integer.MIN_VALUE;
        //  System.out.println((a>b)? a:b);
        System.out.println(getTargetidx(arr1, 9));
    }
}
