
public class queueImpArr {
    static class Queue{
        static int arr[];
        static int rear;
        static int size;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add(int data){//O(1)
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){// O(n)
                arr[i] = arr[i+1];// moving ele's towards front
            }
            rear--;
            return front;
        }
        public static int peek(){//O(1)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0]; // ele at front
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
