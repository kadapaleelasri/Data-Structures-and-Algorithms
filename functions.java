public class functions{
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int binomialCoefficient(int n,int r){
        int fact_n = factorial(n);//n!
        int fact_r = factorial(r);//r!
        int fact_nmr = factorial(n-r);//(n-r)!
        int binCoeff = fact_n/(fact_r*fact_nmr);
        return binCoeff;
    }
    //function overloading based on different no.of paramaters
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    //function overloading based on different data types
    public static float sum(float a,float b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    //binary to decimal conversion
    public static void binToDeci(int binNum){
        int num=binNum;
        int power=0;
        int deci=0,last_digit;
        while(num>0){
            last_digit=num%10;
            deci=deci+last_digit*(int)Math.pow(2,power);
            power++;
            num/=10;
        }
        System.out.println("The decimal of "+binNum+" is "+deci);
    }
    public static void deciToBin(int num){
        int n=num;
        int rem=0,power=0;
        int bin=0;
        while(n>0){
            rem=n%2;
            bin=bin+rem*(int)Math.pow(10,power);
            power++;
            n/=2;
        }
        System.out.println("The binary of "+num+" is "+bin);
    }
    public static void main(String[] args) {
        //System.out.println(binomialCoefficient(10,6 ));
        // System.out.println(sum(4,5));
        // System.out.println(sum(4,5,10));
        // System.out.println(sum(4.2f,5.4f)); //type casting double to float
        // System.out.println(sum(4.6,5.5)); //by default decimal values considered double in java
        binToDeci(101111);
        deciToBin(9);

    }
}