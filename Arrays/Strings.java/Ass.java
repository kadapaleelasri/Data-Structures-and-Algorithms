//import java.util.*;

public class Ass {
    public static void getLowerCaseVowelCount(String s){
        int n = s.length();
        int vowelCount = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)==true){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowelCount++;
                }
            }
        }
        System.out.println("the count of lower case vowels is "+vowelCount);
    }
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static float getShortestPath(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'N'){
                y++;
            }
            else if(s.charAt(i) == 'S'){
                y--;
            }
            else if(s.charAt(i) == 'W'){
                x--;
            }
            else{
                x++;
            }            
        }
        int X2 = x*x; //(x2 - x1) square since x1,y1 = 0 so we find X*2 and Y*2
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    // to capitalize each word in an string
    public static void toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        sb.append(Character.toUpperCase(ch));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());

    }
    // to compress string aabbccc --> a2b2c3
    public static void compressString(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a string ");
    //    // String s = sc.nextLine();
    //   //  getLowerCaseVowelCount(s);
    //     String s1 = "HeKKo".replace('k', 'l');
    //     System.out.println(s1);
    //     String s2 = "racecar";
    //     boolean res = isPalindrome(s2);
    //     if(res){
    //         System.out.println("Palindrome");
    //     }else{
    //         System.out.println("Not Palindrome");
    //     }
     String str = "WNEENESENNN";
         System.out.println("shortest path "+getShortestPath(str));
    //      //build in function to get substring
    // String x = "Good Morning";
    // System.out.println(x.substring(0, 5));
    // String str1 = "hello good morning! bye!";
    // toUpperCase(str1);
    // String s3 = "aaaabbcccd";
    // String s4 = "abcde";
    // compressString(s3);
    // compressString(s4);
    }
   
}
