//package QUEUE;
//head is front and tail is rear
public class QueImpLL {
    static class  Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = head.data;
            //one ele left to delete
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data; 
        }
        public static void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(2);
        q.add(6);
        q.add(8);
        q.print();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
