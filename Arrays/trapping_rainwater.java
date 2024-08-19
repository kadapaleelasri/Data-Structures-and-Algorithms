public class trapping_rainwater {
    public static int trappedWater(int arr[]){
        int n = arr.length;
        int trapped_water = 0;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        //calculating left boundary - array
        leftMax[0] = arr[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }
        //calculating right boundary - array
        rightMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }
        //calculating trapped water quantity
        for(int i=0;i<n;i++){
           int waterLevel = Math.min(leftMax[i],rightMax[i]);
           trapped_water += (waterLevel - arr[i]) * 1; //width for each bar is 1
        }
        return trapped_water;
    }
    public static void main(String[] args) {
        //int arr[]={4,2,6,0,3,2,5};
        int arr[]={4,2,0,3,2,5};
        System.out.println(trappedWater(arr));
    }
}
