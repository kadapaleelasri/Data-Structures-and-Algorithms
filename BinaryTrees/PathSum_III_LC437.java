import java.util.*;
public class PathSum_III_LC437 {
    static class  Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }
    public static void print(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            print(root.left);
            print(root.right);
        }
    }
    //static int count = 0;
    static HashMap<Integer,Integer> hm = new HashMap<>();
    public static int pathSum(Node root,int targetSum,int count,int currSum){
        if(root != null){
            currSum += root.data;
            if(hm.containsKey(currSum-targetSum)){
                count++;
            }else{
                hm.put(currSum, 1);
            }
            pathSum(root.left, targetSum,count,currSum);
            pathSum(root.right, targetSum,count,currSum);
            hm.remove(currSum);
            return count;
        }
        return count;
    }
   
    public static void main(String[] args) {
        // Node root = new Node(10);
        // root.left = new Node(5);
        // root.right = new Node(-3);
        // root.left.left = new Node(3);
        // root.left.right = new Node(2);
        // root.left.right.right = new Node(1);
        // root.left.left.left = new Node(3);
        // root.left.left.right = new Node(-2);
        // root.right.right = new Node(11);
        // //print(root);
        // System.out.println(pathSum(root, 8,0,0));
        double x = Integer.MIN_VALUE;
        if(x < 0){
            x = 0.0;
        }
        System.out.println(x);

    }
}
