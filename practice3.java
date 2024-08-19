import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //multiplication table
        // int n = sc.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(n+" * "+i+" = "+(n*i));
        // }
        //System.out.println("i after loop "+i); throws error because the scope of i is within the loop
        //factorial of a num
        // int n = sc.nextInt();
        // int fact=1;
        // if(n>=0){
        //     if(n==0 || n==1){
        //         System.out.println("factorial of "+n+" is 1");
        //     }else{
        //         for(int j=n;j>0;j--){
        //             fact*=j;
        //         }
        //         System.out.println("factorial of "+n+" is "+fact);
        //     }
        // }else{
        //     System.out.println("factorial exist for +ve numbers only");
        // }
        //read set of integers from user and print sum of even and odd integers
        // System.out.println("how many numbers you want ot input");
        // int n = sc.nextInt();
        // int even_sum=0,odd_sum=0;
        // for(int i=1;i<=n;i++){
        //     int nums = sc.nextInt();
        //     if(nums%2==0){
        //         even_sum+=nums;
        //     }else{
        //         odd_sum+=nums;
        //     }
        // }
        // System.out.println("even integers sum "+even_sum); 
        // System.out.println("odd integers sum "+odd_sum); 
        int even_sum=0,odd_sum=0;
        int choice;
        do{
            System.out.println("enter number");
            int n = sc.nextInt();
            if(n%2==0){
                even_sum+=n;
            }else{
                odd_sum+=n;
            }
            System.out.println("do you want to give input again 1 for yes and 0 for no");
            choice = sc.nextInt();
        }while(choice==1);
        System.out.println("even integers sum "+even_sum); 
        System.out.println("odd integers sum "+odd_sum);
        sc.close();
    }
}
