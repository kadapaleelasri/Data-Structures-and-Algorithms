import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // if(year%4==0){
        //     if(year%100==0){
        //         if(year%400==0){
        //             System.out.println("leap year");
        //         }else{
        //             System.out.println(" not leap year");
        //         }
        //     }else{
        //         System.out.println("leap year"); 
        //     }
        // }else{
        //     System.out.println(" not leap year");
        // }
        boolean x = (year%4==0);
        boolean y = (year%100!=0);
        boolean z = (year%100==0 && year%400==0);
        if(x && (y||z)){
            System.out.println("leap year");
        }else{
            System.out.println("not leap year"); 
        }
        sc.close();
    }
    
}
