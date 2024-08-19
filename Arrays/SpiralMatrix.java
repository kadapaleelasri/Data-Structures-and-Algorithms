public class SpiralMatrix{
public static void spiral_matrix(int matrix[][]){
    int startR = 0;
    int startC = 0;
    int endR = matrix.length-1;
    int endC = matrix[0].length-1;
    while(startR <= endR && startC <= endC){
        for(int j=startC;j<=endC;j++){
            System.out.print(matrix[startR][j]+" ");
        }
        for(int i=startR+1;i<=endR;i++){
            System.out.print(matrix[i][endC]+" ");
        }
        for(int j=endC-1;j>=startC;j--){
            if(startR==endR){
                break;
            }
            System.out.print(matrix[endR][j]+" ");
        }
        for(int i=endR-1;i>startR;i--){
            if(startC == endC){
                break;
            }
            System.out.print(matrix[i][startC]+" ");
        }
        startR++;
        endR--;
        startC++;
        endC--;
    }
}
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        int matrix1[][] = {
            {1,2},
            {5,6},
            {10,11},
            {12,13},
        };
        spiral_matrix(matrix);
        spiral_matrix(matrix1);
    }
}