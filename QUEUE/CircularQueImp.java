
public class CircularQueImp {
    static class CQueue{
        static int arr[];
        static int rear;
        static int front;
        static int size;
        CQueue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void add(int data){//O(1)
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //add 1st ele
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1)%size;
            arr[rear] = data;
        }
        public static int remove(){ //O(1)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[front];
            //only 1 ele is left to delete
            if(front == rear){
                rear = front = -1;// make empty
            }else{
                front = (front+1)%size;
            }
            return val;
        }
        public static int peek(){//O(1)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front]; // ele at front
        }
    }
    public static void main(String[] args) {
        CQueue cq = new CQueue(3);
        cq.add(11);
        cq.add(12);
        cq.add(13);
        //cq.add(4);// is full
        System.out.println(cq.remove());
        cq.add(4);
        System.out.println(cq.remove());
        cq.add(6);
        while (!cq.isEmpty()) {
            System.out.println(cq.peek());
            cq.remove();
        }

    }
}
