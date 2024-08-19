public class bitwise_op{
    //to check even or odd num using bitwise AND operator
    public static void checkEvenOrOdd(int num){
        int bitMask =1;
        if((num & bitMask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i; // 1 left shit by i positions
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static int updateIthBit(int n,int i,int newBit){
        // //approach 1
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }
        //approach 2
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static int clearIBits(int n,int positions){
        int bitMask = (~0)<<positions;
        return n & bitMask;
    }
    public static int clearRangeOfBits(int n,int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1; 
        int bitMask = a|b;
        return n & bitMask;
    }
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void countSetBits(int n){
        int count =0;
        while(n!=0){
           if((n & 1) != 0){
            count++;
           }
           n = n>>1; // n right shift by 1
        }
        System.out.println("No of set bits : "+count);
    }
    public static void upperCaseToLowerCase() {
     for(char ch='A';ch<='Z';ch++){
        System.out.print((char)(ch|' ')); // Ex: 65->A | 32->' ' = 97->a
     }   
    }
    public static void main(String args[]){
        // checkEvenOrOdd(4);
        // checkEvenOrOdd(34);
        // checkEvenOrOdd(19);
        // System.out.println(getIthBit(12,2));
        // System.out.println(setIthBit(10,2));
        //System.out.println(clearIthBit(10,1)); // o/p 8
        //System.out.println(updateIthBit(10,2,1)); // o/p 14
        //System.out.println(clearIBits(15, 2));//op 12
        //System.out.println(clearRangeOfBits(10, 2, 4)); //op 2
        // System.out.println(isPowerOfTwo(8));
        // System.out.println(isPowerOfTwo(15));
        //countSetBits(15);
        System.out.println(-~12); // to add 1 to num using bitwise operator
        upperCaseToLowerCase();
    }
}