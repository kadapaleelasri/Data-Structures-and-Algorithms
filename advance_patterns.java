public class advance_patterns {
    public static void hollowRectangle(int rows,int columns){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                if(i==1 || i==rows || j==1 || j==columns){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void invert_half_pyramid(int rows,int columns){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invert_half_pym_num(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //floyids triangle
    /*
     *1
      23
      456
      78910
     */
    public static void floyids_triangle(int r){
        int val=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }
    public static void zero_one_traingle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if ((i+j)%2==0){ //row + col is even
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly_pattern(int n){
        //1 st half
        for(int i=1;i<=n;i++){
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for(int i=n;i>=1;i--){
             //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces - n-i
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars - n
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces- n-i
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //hollow rectangle
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond_pattern(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // hollowRectangle(6, 8);
        // invert_half_pyramid(5, 5);
        // invert_half_pym_num(5);
        //floyids_triangle(6);
        //zero_one_traingle(5);
        //butterfly_pattern(5);
        //solid_rhombus(5);
        //hollow_rhombus(5);
        diamond_pattern(7);
    
    }
}
