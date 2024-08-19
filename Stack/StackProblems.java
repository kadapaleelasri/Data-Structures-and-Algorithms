import java.util.*;
public class StackProblems {
    //push at the bottom of the stack - approach recursion - TC O(n)
    public static void pushAtBottom(Stack<Integer> s,int data){
        // base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    // reverse a string using stack
    public static String reverseString(String str){
        Stack<Character> cs = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            cs.push(str.charAt(idx));
            idx++;
        }
        StringBuilder newStr = new StringBuilder("");
        while(!cs.isEmpty()){
            newStr.append(cs.pop());
        } 
        str = newStr.toString();
        return str;
    }
    // reverse a stack : approach - recursion SC - O(1)
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    // stack-span problem - approach using stack
    // span : max no.of consecutive days for which price <= today's price
    public static void stockSpan(int[] stocks,int[] span){
        Stack<Integer> s = new Stack<>();
        //span of stock price at first day is 1
        span[0] = 1;
        // push index 0 
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            while (!s.isEmpty() && stocks[i] >= stocks[s.peek()]) {
                s.pop();
            }
            // if no prev high not found
            if(s.isEmpty()){
               // System.out.println(i);
                span[i] = i+1;
            }
            //otherwise: there is prev high
            else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }

    }
    //next greater element : logic is important and very useful for other Q's
    // next greater ele for some x ele is the first greater ele to the right of x
    // TC - O(n) - bcz the inner loop meh each ele in pushed once and popped once
    // outer loop (n) + inner loop (2n) = 3n = O(n)
    // next greater right   for(int i=n-1;i>=0;i--){ while(!s.isEmpty() && arr[s.peek()] <= arr[i])
    //next greater left for loop starts from 0->n-1; while remains same
    // next smaller right (arr[s.peek()] >= arr[i]) condition change in while
    // next smaller left change in for loop;
    public static void nextGreater(int[] arr,int[] nGArr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        for(int i=n-1;i>=0;i--){ 
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){ 
                s.pop();
            }
            if(s.isEmpty()){
                nGArr[i] = -1;
            }else{
                nGArr[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
  
    public static void main(String[] args) {
    //    Stack<Integer> s = new Stack<>();
    //    s.push(4); 
    //    s.push(5); 
    //    s.push(6); 
    //    pushAtBottom(s, 10);
    //    while (!s.isEmpty()) {
    //     System.out.println(s.pop());
    //    }
    //printStack(s); // 6,5,4
    // reverseStack(s);
    // printStack(s); // 4,5,6
    // String s1 = "LeelaSri";
    // System.out.println(reverseString(s1));
    // int[] stocks = {100,80,60,70,60,85,100};
    // int[] span = new int[stocks.length];
    // stockSpan(stocks, span);
    // for(int i=0;i<span.length;i++){
    //     System.out.print(span[i]+" ");
    // }
    // System.out.println();
    // int[] arr = {1,8,5,9,14,10}; // nGArr = {8,9,9,14,-1,-1};
    // int[] arr1 = {6,8,0,1,3}; // nGArr = {8,-1,1,3,-1};
    // int[] nGArr = new int[arr.length];
    // int[] nGArr1 = new int[arr1.length];
    // nextGreater(arr, nGArr);
    // nextGreater(arr1, nGArr1);
    // for(int i=0;i<nGArr1.length;i++){
    //     System.out.print(nGArr1[i]+" ");
    // }
    // System.out.println();
 
 }
}
