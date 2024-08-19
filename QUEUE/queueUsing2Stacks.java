import java.util.*;
public class queueUsing2Stacks {
    static class queue {
    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();
    // public static boolean isEmpty(){//queue object
    //     return st1.isEmpty();
    // }
    //type 1 
    //TC - O(n+n)->O(2n)->O(n)
    // public static void add(int data){
    //     while(!st1.isEmpty()){ // O(n)
    //         st2.push(st1.pop());
    //     }
    //     st1.push(data);
    //     while(!st2.isEmpty()){//O(n)
    //         st1.push(st2.pop());
    //     }
    // }
    // //O(1)
    // public static int remove(){
    //     if(st1.isEmpty()){
    //         System.out.println("queue is empty");
    //         return -1;
    //     }
    //     return st1.pop();
    // }
    // //O(1)
    // public static int peek(){
    //     if(st1.isEmpty()){
    //         System.out.println("queue is empty");
    //         return -1;
    //     }
    //     return st1.peek();
    // }
    //type 2 
    public static boolean isEmpty(){//queue object
        return st1.isEmpty() && st2.isEmpty();
    }
    //O(1)
    public static void add(int data){
        if(st1.isEmpty()){
            st1.push(data);
        }else{
            st2.push(data);
        }
    }
    //O(n)
    static int front;
    public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
       if(!st1.isEmpty()){
        while(!st1.isEmpty()){
            front = st1.pop();
            if(st1.isEmpty()){
                break;
            }
            st2.push(front);
        }
    }else{
            while(!st2.isEmpty()){
                front = st2.pop();
                if(st2.isEmpty()){
                    break;
                }
                st1.push(front);
        }
       
       }
       return front;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return front;
    }
}
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(6);
        q.add(4);
        //System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
