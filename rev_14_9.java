import java.util.*;
public class rev_14_9 {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }   
    }
    //iterative approach
    public static int rangeSumBST(Node root,int l,int h){
        int sum = 0;
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while(!st.isEmpty() || curr != null){
            while(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            int d = curr.data;
            if(d >= l && d <= h){
                sum += d;
            }
            curr = curr.right;
        }
        return sum;
    }
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }
        return  isValidBST(root.left, min, root) &&  isValidBST(root.right, root, max);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.left = new Node(9);
        Node root1 = new Node(2);
        root1.left = new Node(8);
        root1.right = new Node(3);
        //System.out.println(rangeSumBST(root, 5,10));
        System.out.println(isValidBST(root, null, null));
        System.out.println(isValidBST(root1, null, null));
    }
}
