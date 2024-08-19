//import java.util.Scanner;

public class ArraystwoD_Ass{
    public static void find_largest_smallest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(largest<matrix[i][j]){
                    largest = matrix[i][j];
                }
                if(smallest>matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("smallest value "+smallest);
        System.out.println("largest value "+largest);
    }
    public static void main(String args[]){
        int arr[][] = {{32,5,65},{325,6,4},{13,45,8},};
        find_largest_smallest(arr);
    //1) find number of 7's in 2d array
    //    int arr[][] = {{4,5,7},{9,10,11},{3,7,5}};
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("input no. of rows ");
    //    int rows = sc.nextInt();
    //    System.out.println("input no. of columns ");
    //    int cols = sc.nextInt();
    //    int arr[][] = new int[rows][cols];
    //    System.out.println("input elements ");
    //    for(int i=0;i<rows;i++){
    //     for(int j=0;j<cols;j++){
    //         arr[i][j] = sc.nextInt();
    //     }
    //    }
    // //    int rows= arr.length;
    // //    int cols = arr[0].length;
    //    int count = 0;
    //    for(int i=0;i<rows;i++){
    //     for(int j=0;j<cols;j++){
    //         if(arr[i][j]==7){
    //             count++;
    //         }
    //     }
    //    }
    //    System.out.println(count);
    //2) find the sum of elements in the second row of 2d array
     //  int nums[][] = {{1,4,9},{11,4,3},{2,3,2},};
    //approach 1 : it might throw garbage value when there is only single row, so that case should be handled
    //    int sum=0;
    //     for(int j=0;j<nums[0].length;j++){
    //         sum+=nums[1][j];
    //     }
    //    System.out.println(sum);
    // modification
    // int n1=nums.length;
    // if(n1<=1){
    //     System.out.println("row 2 doesn't exist");
    // }else{
    //     int sum=0;
    //     for(int j=0;j<nums[0].length;j++){
    //         sum+=nums[1][j];
    //     }
    //    System.out.println(sum);
    // }

    //3) transpose of a matrix
    // int nums[][] = {{11,12,13},{21,22,23},};
    // int r = nums.length;
    // int c = nums[0].length;
    // int transpose[][] = new int[c][r];
    // for(int k=0;k<c;k++){
    //     for(int j=0;j<r;j++){
    //         transpose[k][j] = nums[j][k];
    //     }
    // }
    // for(int k=0;k<c;k++){
    //     for(int j=0;j<r;j++){
    //         System.out.print(transpose[k][j]+" ");
    //     }
    //     System.out.println();
    // }
    }
  
}