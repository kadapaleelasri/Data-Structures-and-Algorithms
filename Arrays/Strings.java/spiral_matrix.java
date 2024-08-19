public class spiral_matrix {
    public static void print_spiral_matrix(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if (startRow==endRow) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void diagonalSum(int matrix[][]){
        //not an optimized approach TC O(n**2)
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){ //primary diagonal
                    sum+=matrix[i][j];
                }
                else if(i+j == matrix.length-1){  //secondary diagonal
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("sum "+sum);
        //optimized approach O(n)
        int sum1=0;
        for(int i=0;i<matrix.length;i++){
            //pd
            sum1+=matrix[i][i];
            if(i!= matrix.length-1-i){ // for the 3x3, 5x5, there will be common middle element it will not be included agAIN in sd
            //sd
            sum1+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("sum "+sum1);

    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        int m1[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
       // print_spiral_matrix(matrix);
      // diagonalSum(matrix); 
       diagonalSum(m1);
    }
}
