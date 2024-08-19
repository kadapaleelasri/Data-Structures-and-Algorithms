public class assignment3 {
    //1)to find avg of 3 nums
    public static void findAvg(int a,int b,int c){
        int avg = (a+b+c)/3;
        System.out.println("Average of three numbers is "+avg);
    }
    //2) to write isEven method
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
    //3) to check num is palindrome or not
    public static boolean isPalindrome(int num){
        int temp=num;
        int rev_num=0;
        while(temp>0){
            int last_digit=temp%10;
            rev_num=rev_num*10+last_digit;
            temp/=10;
        }
        if(num==rev_num){
            return true;
        }
        return false;
    }
    //5) method to find sum of each digit in a number
    public static void sumOfDigits(int num){
        int sum=0,n=num;
        while(n>0){
            int last_digit=n%10;
            sum+=last_digit;
            n/=10;
        }
        System.out.println("The sum of digits of "+num+" is "+sum);
    }
    public static void main(String[] args) {
        findAvg(24, 89, 31);
        System.out.println("The given number is even :"+isEven(7));
        System.out.println("Is the number is palindrome "+isPalindrome(121));
        sumOfDigits(1459);
    }
}
