//package QUEUE;

import java.util.*;
import java.util.LinkedList;

public class QueueJCF {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(23);
        queue.add(24);
        int size = queue.size();
        System.out.println(size);
        int front = queue.peek();
        System.out.println(front);
        //System.out.println(queue.poll());// to remove element
        //queue.remove();// to rem ele

    }
}
