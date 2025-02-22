package Heap;

import java.util.*;
 
class Node {
    int data;
    Node next;
 
    Node(int key) {
        data = key;
        next = null;
    }
}
 
class NodeComparator implements Comparator<Node> {
    public int compare(Node k1, Node k2) {
        // if this method returns -ve value - that means k1 < k2
        // if it returns +ve value - that means k1 > k2
        // if it returns 0 - both the objects are equal
        if (k1.data < k2.data) {
            return -100;
        } else if (k1.data > k2.data) {
            return 10;
        } else {
            return 0;
        }
    }
}
 
 public class MergeKSortedLists {
    static Node mergeKList(Node[] arr, int K) {
        PriorityQueue<Node> queue = new PriorityQueue<>(new NodeComparator());
        Node head = new Node(0); // Dummy Node
        Node last = head; // tail Node
        for (int i = 0; i < K; i++) {
            if (arr[i] != null) {
                queue.add(arr[i]);
            }
        }
        // if all the linked lists are empty
        if (queue.isEmpty())
            return null;
        while (!queue.isEmpty()) {
            // Pick the minimum Node
            Node curr = queue.poll();
            // Add at tail of the linked list
            last.next = curr;
            last = last.next;
            // check if there is any next node
            if (curr.next != null) {
                queue.add(curr.next);
            }
        }
        return head.next;
    }
 
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        int N = 3;
        Node[] a = new Node[N];
        Node head1 = new Node(1);
        a[0] = head1;
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);
        Node head2 = new Node(2);
        a[1] = head2;
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);
        Node head3 = new Node(0);
        a[2] = head3;
        head3.next = new Node(9);
        head3.next.next = new Node(10);
        head3.next.next.next = new Node(11);
        Node res = mergeKList(a, N);
        if (res != null)
            printList(res);
        System.out.println();
    }
}
