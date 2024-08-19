public class print_pairs_array {
    //time complexity O(n**2)
    public static void printPairs(int arr[]){
        int total_pairs=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs: "+total_pairs); // n(n-1)/2 arithmetic progression 
    }
    //time complexity O(n**3)
    public static void printSubarryas(int arr[]){
        for(int i=0;i<arr.length;i++){ // start = i
            for(int j=i;j<arr.length;j++){ //end = j
                for(int k=i;k<=j;k++){ // from start to end
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    //brute force approach TC O(n**3)
    public static void max_subarray_currSum(int arr[]){
        int max_sum=0;
        for(int i=0;i<arr.length;i++){ // start = i
            for(int j=i;j<arr.length;j++){ //end = j
                int currSum=0;
                for(int k=i;k<=j;k++){ // from start to end
                    currSum+=arr[k];
                }
                if(max_sum<currSum){
                    max_sum=currSum;
                }
            }
        }  
        System.out.println("max subarray Sum "+max_sum);

    }
    //prefix sum approach
    public static void printMaxSubarraySum(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int start=0;start<arr.length;start++){
            for(int end=start;end<arr.length;end++){
                currSum = start==0? prefix[end] : prefix[end] - prefix[start-1];
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum : "+maxSum);

    }
    // kadanes approach
    public static void kadanes(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("max sum(kadanes) "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={10,18,6,8,14};
        //printPairs(arr);
        //printSubarryas(arr);
        //max_subarray_currSum(arr);
        //printMaxSubarraySum(arr);
        kadanes(arr);
    }
}
