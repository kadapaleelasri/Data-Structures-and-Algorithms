public class LoopOrCycleLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    //detect the loop/cycle in LL
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;//cycle exist
            }
        }
        return false; // no cycle
    }
    // remove cycle from LL
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                isCycle = true;//cycle exist
                break;
            }
        }
        if(isCycle == false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle
        prev.next = null; // set last node next to null
    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(4);
        head.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle(); // this will not work for 1->2->3->1 since last node is pointing to head 
        System.out.println(isCycle());
    }
    
}
