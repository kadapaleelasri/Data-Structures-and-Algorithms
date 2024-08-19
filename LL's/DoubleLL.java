public class DoubleLL {
    public class  Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public int removeLast(){
        if(head == null){
            System.out.println("DLL empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node prevT = head;
        int i=0;
        while(i< size-2){
            prevT = prevT.next;
            i++;
        }
        int val = tail.data;//prevT.next.data;
        tail.prev = null;
        prevT.next = null;
        tail = prevT;
        size--;
        return val;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverseDLL(){
        //Node curr = tail = head; // while reversing,first head will become tail
        Node curr = head;
        Node Prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = Prev;
            curr.prev = next;
            Prev = curr;
            curr = next;
        }
        head = Prev;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(3);
        dll.addLast(4);
        dll.addLast(5);
        System.out.println(DoubleLL.size);
        dll.print();
        //dll.removeFirst();
       // dll.removeLast();
        //dll.print();
        dll.reverseDLL();
        dll.print();
    }
}
