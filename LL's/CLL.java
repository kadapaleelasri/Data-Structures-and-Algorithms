public class CLL {
    public class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public Node addToEmpty(Node last,int data){
        if(last != null){ // already some nodes exist
            return last;
        }
        //cll is empty
        Node newNode = new Node(data);
        newNode.next = newNode;
        last = newNode;
        return last;
    }
    public Node addFront(Node last,int data){
        if(last == null){ // when cll is empty
            return addToEmpty(last, data);
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }
    public Node addEnd(Node last,int data){
        if(last == null){
            return addToEmpty(last, data);
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }
    public Node addAfter(Node last,int data,int prev){
        if(last == null){ // ntng to add after prev
            return null;
        }
        Node p = last.next;
        do{
        if(p.data == prev){
            Node newNode = new Node(data);
            newNode.next = p.next;
            p.next = newNode;
            if(p == last){
                last = newNode;
                return last;
            }
        }
        p = p.next;
    }while( p != last.next);
    System.out.println("node not found to insert after");
    return last;
    }
    // delete - 1st or end or particular node
    public Node deleteNode(Node last,int key){
        //if CLL is empty
        if(last == null){
            return null;
        }
        //if CLL has only one node
        if(last.data==key && last.next == last){
            last = null;
            return last;
        }
        //to delete last node
        Node temp = last;
        if(last.data == key){
            while(temp.next != last){
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
            return last;
        }
        // to delete particular node
        while(temp.next.data != key && temp.next != last){
            temp = temp.next;
        }
        Node d;
        if(temp.next.data == key){
            d = temp.next;
            temp.next = d.next;
        }
        return last;
    }
    public void traverse(Node last){
        Node p = last.next; // p is head
        do{
            System.out.print(p.data+"->");
            p = p.next;
        }while(p != last.next);
        System.out.print(p.data);
    }

    public static void main(String[] args) {
        CLL cl = new CLL();
        Node last = null;
       last = cl.addToEmpty(last, 1);
       last = cl.addFront(last, 3);
       last = cl.addEnd(last, 5);
       last = cl.addAfter(last, 4,3);
       //cl.traverse(last);
        // delete first node
       //last = cl.deleteNode(last, last.next.data);
       // to delete last node
       //last = cl.deleteNode(last, last.data);
       // to delete node with key 1
       last = cl.deleteNode(last, 1);
       cl.traverse(last);
    }
}
