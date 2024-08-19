import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
                System.out.println("prime");
        }else{
                System.out.println("not prime");
        }
        //optimized
        // boolean isPrime=true;
        // for(int i=2;i<=Math.sqrt(n);i++){
        //     if(n%i==0){ //n is multiple of i(i is not equal to 1 or n)
        //       isPrime=false;
        //         break;
        //     }
        // }
        // if(isPrime){
        //     System.out.println("prime");
        // }else{
        //     System.out.println("not prime");
        // }
        sc.close();

    }
}
