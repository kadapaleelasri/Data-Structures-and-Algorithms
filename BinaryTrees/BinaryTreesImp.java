import java.util.*;
import java.util.LinkedList;

public class BinaryTreesImp {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public  static Node buildTreePreOrder(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTreePreOrder(nodes);
            newNode.right = buildTreePreOrder(nodes);
            return newNode;
        }
        /*            1
                     / \
                    2   3
                   / \   \
                  4   5   6  height = 3,sum of nodes = 21,diameter = 5, nodes count = 6
        */
        //height of BT
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
        }
        //sum of nodes of BT
        public static int treeSum(Node root){
            if(root == null){
                return 0;
            }
            int lSum = treeSum(root.left);
            int rSum = treeSum(root.right);
            return lSum + rSum + root.data;
        }
        //count of nodes
        public static int nodesCount(Node root){
            if (root == null) {
                return 0;
            }
            int lCount = nodesCount(root.left);
            int rCount = nodesCount(root.right);
            return lCount + rCount + 1;
        }
        //diameter of BT Appr - 1
        //TC - O(n^2)
        public static int diameter1(Node root){
            if (root == null) {
                return 0;
            }
            int lDia = diameter1(root.left);
            int lhgt = height(root.left);
            int rDia = diameter1(root.right);
            int rhgt = height(root.right);
            int selfDia = lhgt + rhgt + 1;
            return Math.max(Math.max(lDia,rDia),selfDia);
        }
         //TC - O(n) Appr-2
         static class Info{
            int diam;
            int hgt;
            public Info(int diam,int hgt){
                this.diam = diam;
                this.hgt = hgt;
            }
         }
         public static Info diameter2(Node root){
            if (root == null) {
                return new Info(0, 0);
            }
            Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);

            int diameter = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.hgt+rightInfo.hgt+1);
            int height = Math.max(leftInfo.hgt, rightInfo.hgt) + 1;
            return new Info(diameter, height);
        }
        //preorder traversal
        public static void preOrder(Node root){
            if(root == null){
                //System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
   boolean isTreeBalanced;
   static class infoBT {
    boolean flag;
    int hgt;
    infoBT(int hgt,boolean flag){
        this.flag = flag;
        this.hgt = hgt;
    }
   }
   public static infoBT isBalanced(Node root){
    if(root == null){
        return new infoBT(0, true);
    }
    infoBT left = isBalanced(root.left);
    infoBT right = isBalanced(root.right);
    boolean value = true;
    if(Math.abs(left.hgt-right.hgt) > 1){
        value = false;
    }else{
        value = left.flag && right.flag;
    }
    return new infoBT(Math.max(left.hgt,right.hgt) + 1, value);
   }
   public boolean checkTreeBalance(Node root){
    // isTreeBalanced = true;
    // dfs(root);
    // return isTreeBalanced;
    return isBalanced(root).flag;
   }
   public int dfs(Node root){
    if(root == null){
        return 0;
    }
    int lh = dfs(root.left);
    int rh = dfs(root.right);
    if(Math.abs(lh-rh) > 1){
        isTreeBalanced = false;
    }
    return Math.max(lh,rh) + 1;
   }
    }
    //iterative approach
    public static void printKthLevel(Node root,int k){
    //level order
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    int level = 1;
    while (!q.isEmpty()) {
        Node curr = q.remove();
        if(curr == null){
            if(q.isEmpty()){
                break;
            }else{
                level++;
                q.add(null);
            }
        }else{
            if(level == k){
                System.out.print(curr.data+" ");
            }
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
  
        }
    }

   }
    public static int transformToSumTree(Node root){
    if(root == null){
        return 0;
    }
    int lsum = transformToSumTree(root.left);
    int rsum = transformToSumTree(root.right);
    int val = lsum + rsum + root.data;
    root.data = lsum+rsum;
    return val;
   }
   
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        //Node root = tree.buildTreePreOrder(nodes);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.left.left = new Node(5);
        root.left.left.right = new Node(6);
        root.right.right = new Node(90);
        root.right.right.left = new Node(10);
        System.out.println(tree.checkTreeBalance(root));
        //System.out.println(root.data);
        //tree.preOrder(root);
        //tree.inOrder(root);
        //tree.postOrder(root);
        // System.out.println(tree.height(root));
        // System.out.println(tree.treeSum(root));
        // System.out.println(tree.nodesCount(root));
        // System.out.println(tree.diameter1(root));
        // System.out.println(tree.diameter2(root).diam);
        //printKthLevel(root, 3);
        //transformToSumTree(root);
        //tree.inOrder(root);
    }
}
