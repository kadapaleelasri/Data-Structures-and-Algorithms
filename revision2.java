public class revision2 {
    public static int decimalToBin(int n){
        int bin=0,x=0;
        while(n != 0){
            int rem = n%2;
            bin = bin+rem*(int)Math.pow(10, x);
            x++;
            n/=2;
        }
        return bin;
    }
    public static int binToDec(int n){
        int dec=0,x=0;
        while(n != 0){
            int rem = n%10;
            dec = dec+rem*(int)Math.pow(2, x);
            x++;
            n/=10;
        }
        return dec;
    }
    public static void printBinofnumsInRange(int n){
        for(int i=1;i<=n;i++){
            System.out.print(decimalToBin(i)+" ");
        }
    }
    public static void main(String[] args) {
        // int num = 20;
        // System.out.println(decimalToBin(num));//10100
        // int bin = 10110;
        // System.out.println(binToDec(bin));//22
        int n = 4;
        printBinofnumsInRange(n);
    }
}
