import java.util.*;
public class StackPart2 {
    //check valid parenthesis TC - O(n) SC - O(n)
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else{
                if(st.isEmpty()){ // when i/p is all closing brackets
                    return false;
                }else{
                    char top = st.peek();
                    if((top == '(' && c == ')') //()
                    || (top == '{' && c == '}') //{}
                    || (top == '[' && c == ']')) //[]
                    {
                        st.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty() ? true : false;
    }
    public static String simplifyPath(String s){
        Stack<String> st = new Stack<>();
        String[] arr = s.split("/");
        StringBuffer output = new StringBuffer("/");
        for(String s1 : arr){
            if(s1.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    continue;
                }
            }else if(s1.equals(".") || s1.equals("/") || s1.isEmpty()){
                continue;
            }else{ // for words and ... -> represents large word
                st.push(s1);
            }
        }
        int i = 0;
        while(!st.isEmpty()){
            arr[i++] = st.pop();
        }
        for(int j=i-1;j>=0;j--){
            if(j==0){
                output.append(arr[j]);
            }else{
                output.append(arr[j]+"/");
            }
        }
        return output.toString();
    }
      // 3[a]4[b] -> aaabbbb
    //decode the string
    public static String decodeString(String s){
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        Stack<Integer> numst = new Stack<>();
        int num = 0;
        for(Character c : s.toCharArray()){
            //if c is num
            if(c>='0' && c<='9'){
                int digit = c-'0';// '9'-'0' = 9
                num = num*10 + digit;
            }
            //open bracket
            else if(c=='['){
                st.push(sb);
                sb = new StringBuilder("");
                numst.push(num);
                num=0;
            }
            //closed bracket
            else if(c==']'){
                StringBuilder temp = sb;
                sb = st.pop();
                int count = numst.pop();
                while(count>0){
                    sb.append(temp);
                    count--;
                }
            }// any letter
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    // max area of histogram or max rectangle in histogram
    public static int maxAreaInHist(int[] height){// TC - O(n) optimized
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int[] nextSmL = new int[n];
        int[] nextSmR = new int[n];
        // to find next smallest ele at right O(n)
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && height[st.peek()] > height[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nextSmR[i] = n;
            }else{
                nextSmR[i] = st.peek();
            }
            st.push(i);
        }
        // while(!st.isEmpty()){ // to empty stack
        //     st.pop();
        // }
        st = new Stack<>(); // to empty stack
        // to find next smallest ele at left -O(n)
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && height[st.peek()] > height[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nextSmL[i] = -1;
            }else{
                nextSmL[i] = st.peek();
            }
            st.push(i);
        }
        //to  calculate area -O(n)
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int hgt = height[i];
            int width = nextSmR[i] - nextSmL[i] - 1;
            int currArea = hgt * width;
            maxArea = Math.max(maxArea, currArea);
        } 
        return maxArea;
    }
    public static void main(String[] args) {
        // System.out.println(isValid("([{}])"));//t
        // System.out.println(isValid("()[]{}"));//t
        // System.out.println(isValid("()[{}"));//f
        // System.out.println(isValid("(}"));//f
        // System.out.println(isValid("()"));//t
        // System.out.println(simplifyPath("/home//foo/"));
        // System.out.println(simplifyPath("/home/.../../"));
        // System.out.println(simplifyPath("/../"));
        // System.out.println(simplifyPath("/hi/.doc//."));
        //System.out.println(simplifyPath("/hi/../users/.../pictures/./"));// /users/.../pictures
        // System.out.println(decodeString("3[a2[b]]"));//abbabbabb
        // System.out.println(decodeString("10[ab]"));//abababababababababab
        int[] height = {2,1,5,6,2,3};//heights in histogram
        System.out.println("max area in histogram "+maxAreaInHist(height));
    }
}
