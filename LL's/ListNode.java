public class ListNode {
    int data;
    ListNode next;
    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
    public static void print(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static ListNode mergeTwoSortedLL(ListNode head1,ListNode head2){
        ListNode tempLL = new ListNode(-1);
        ListNode temp = tempLL;
        ListNode h1 = head1;
        ListNode h2 = head2;
        while (h1 != null && h2 !=null) {
            if(h1.data <= h2.data){
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            }else{
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            }
        }
        while(h1 != null){
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while(h2 != null){
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return tempLL.next;
    } 
    public static ListNode reverseBetween(ListNode head,int left,int right){
         if(left == right){
             return head;
         }
        ListNode prevL = head;
        int i=1;
        while(i<left-1){
            prevL = prevL.next;
            i++;
        }
        int j=1;
        ListNode right1 = head;
        while(j<right){
            right1 = right1.next;
            j++;
        }
        ListNode curr = prevL.next;
        ListNode prev = right1.next;
        ListNode next1;
        System.out.println(curr.data);
        while(curr != right1){
            next1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next1;
        }
        curr.next = prev;
        prevL.next = right1;
        return head;
    }
    public static void main(String[] args) {
        // ListNode head1 = new ListNode(1);
        // head1.next = new ListNode(2);
        // head1.next.next = new ListNode(4);
        // head1.next.next.next = new ListNode(16);
        // ListNode head2 = new ListNode(7);
        // head2.next = new ListNode(9);
        // head2.next.next = new ListNode(13);
        // ListNode h1 = head1;
        // ListNode h2 = head2;
        //print(head1);        
        //print(head2);   
      //  ListNode newLL = mergeTwoSortedLL(h1, h2);
        //print(newLL);  
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);   
        l1.next.next = new ListNode(3);   
        l1.next.next.next = new ListNode(4);   
        l1.next.next.next.next = new ListNode(5);   
       //print(l1);
       // ListNode newHead = reverseBetween(l1, 2, 4);
        // ListNode newHead1 = reverseBetween(l1, 1, 2);
        // print(newHead1);
        System.out.println(','>'a');
    }
    
}
