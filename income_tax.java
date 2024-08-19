//import java.util.*;
public class income_tax{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;
        // if(income < 500000){
        //     tax = 0;
        // }
        // else if(income >=500000 && income <= 1000000){
        //     tax = (int)(income * 0.2);
        // }else{
        //     tax = (int)(income * 0.3);
        // }
        // System.out.println("Your tax is : "+tax);
        // sc.close();
        int a = 2,b = 3,c = 5;
        if(a>=b && a>=c){
            System.out.println("largest: "+a);
        }
        else if(b>=c){
            System.out.println("largest: "+b);
        }else{
            System.out.println("largest "+c);
        }
    }

}