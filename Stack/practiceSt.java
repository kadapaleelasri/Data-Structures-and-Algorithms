import java.util.*;
public class practiceSt {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static boolean isPalindrome(){// not using stack SC - O(1)
        Node left = head;
        //find mid
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse second half
        Node mid = slow;
        // Node curr = mid;
        // Node prev = null;
        // Node next;
        // while(curr != null){
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }
        // //compare left and right half
        // Node right = prev;
        // while(right != null){
        //     if(left.data != right.data){
        //         return false;
        //     }
        //     right = right.next;
        //     left = left.next;
        // }
        //using stack SC- O(n), TC-O(n)
        Node right = mid;
        Stack<Integer> st = new Stack<>();
        while(right != null){
            st.push(right.data);
            right = right.next;
        }
        while(!st.isEmpty()){
            if(left.data != st.pop()){
                return false;
            }
            left = left.next;
        }
        return true;
    }
        public static void main(String[] args) {
        practiceSt ll = new practiceSt();
        // addLast(1);
        // addLast(2);
        // addLast(3);
        // addLast(2);
        // addLast(1);
        // System.out.println(isPalindrome());
   
    }
}
