public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){ //ll is empty
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
        if(head == null){ // LL is empty
         System.out.println("LL is empty");
         return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){//O(n)
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data; //tail.data
            size=0;
            return val;
        }
        Node prev = head;
        int i=0;
        while(i<size-2){
            prev = prev.next;
            i++;
        }
        //prev node of tail is LLsize-2
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        return val;
    }
    public int iterativeSearch(int key){ // O(n)
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){ //key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }
    // actual recursive fun
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }
    //to print zig zag ll
    public static void zigZag(){
        //find mid - mid is the first half last node
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node righthead =mid.next;
        mid.next = null;
        //reverse the second half
        Node curr = righthead;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //alternate merging
        righthead = prev;
        Node lefthead = head;
        Node nextL,nextR;
        while(lefthead != null && righthead != null){
            nextL = lefthead.next;
            lefthead.next = righthead;
            nextR = righthead.next;
            righthead.next = nextL;
            lefthead = nextL;
            righthead = nextR;
        }
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev; // reversing happen
            prev = curr;
            curr = next;
        }
        head = prev; // when curr becomes null, the prev node to it will be head
    }
    public void deleteNthFromEnd(int n){
        //calculating size
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        //if the nth from the end is the head
        if(n == size){
            head=head.next; // this is removeFirst Node
            return;
        }
        int i = 1; 
        int ithNodeToFind = size - n;
        Node prev = head;
        while(i<ithNodeToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;//move forward 1 step +1
            fast = fast.next.next; // move forward 2 steps +2
        }
        return slow;
    }
    public boolean checkPalindrome(){
        // if LL is empty or LL has 1 node then it is palindrome
        if(head == null || head.next == null){
            return true;
        }
        //step-1 find mid
        Node mid = findMid(head);
        //reverse second half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half ki head
        Node left = head; //left half ki head
        //check if left half is equal to right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            //otherwise
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void swapNodes(int x,int y){
        if(x == y){ // no swap
            return;
        }
        Node currX = head;
        Node prevX = null;
        while(currX != null && currX.data != x){
                prevX = currX;
                currX=currX.next;
        }
        Node currY = head;
        Node prevY = null;
        while(currY != null && currY.data != y){
                prevY = currY;
                currY=currY.next;
        }
        if(currX == null || currY == null){ // no swap
            return;
        }
        if(prevX != null){
            prevX.next = currY;
        }else{ // if currX is tail
            head = currY;
        }
        if(prevY != null){
            prevY.next = currX;
        }else{ // if currY is tail
            head = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        // l1.addFirst(1);
        // l1.addFirst(3);
        // l1.print();
        // l1.addLast(4);
        // l1.addLast(5);
        // l1.print();
        // l1.addMiddle(3, 6);
        // l1.print();
        // //to get LL size
        // System.out.println(LinkedList.size);
        // l1.removeFirst();
        // l1.print();
        // System.out.println(LinkedList.size);
        // l1.removeLast();
        // l1.print();
        // System.out.println(l1.iterativeSearch(6));
        // System.out.println(l1.recursiveSearch(6));
        // l1.reverse();
        // l1.print();
        // //to delete 2 nd node from end
        // l1.deleteNthFromEnd(2);
        // l1.print();
    //     l1.addFirst(1);
    //     l1.addFirst(3);
    //     l1.addFirst(1);
    //   // l1.addFirst(1);
    //     l1.print();
    //     System.out.println(l1.checkPalindrome());
    l1.addLast(1);
    l1.addLast(2);
    l1.addLast(3);
    l1.addLast(4);
    l1.addLast(5);
    // int x = 2;
    // int y = 4;
    // swapping data is costly in LL instead change the references - swapnodes
    // l1.print();
    // swapNodes(x, y);
    // l1.print();
    // i/p 1->2->3->4->5->null
    zigZag(); // o/p 1->5->2->4->3->null
    l1.print(); 
    }
}
