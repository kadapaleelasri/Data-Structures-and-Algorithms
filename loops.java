//import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // int i=1,sum=0;
        // while(i<=10){
        //     //System.out.println(i);
        //     sum+=i;
        //     i++;
        // }4
        // System.out.println("sum "+sum);
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int i = 1;
        // while(i<=n){
        //     System.out.println(i);
        //     i++;
        // }
        // for(int j=1;j<=4;j++){
        //     for(int k=1;k<=4;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=4;i++){
        //     System.out.println("****");
        // }
        //reverse a num
        int num =12345,last_digit=0;
        // while(num>0){
        //     last_digit = num%10;
        //     System.out.print(last_digit);
        //     num/=10;
        // }
        int rev=0;
        while(num>0){
            last_digit=num%10;
            rev=rev*10+last_digit;
            num/=10;
        }
        System.out.println("rev num "+rev);
    }
}
