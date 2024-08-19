//package BinarySearchTree;
import java.util.*;
import java.util.LinkedList;
public class BST {
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
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
            //return new Node(val);
        }
        if(val < root.data){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static boolean searchBST(Node root,int val){// TC - O(H) H->height
        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        }else if(root.data > val){
            return searchBST(root.left, val);
        }else{
            return searchBST(root.right, val);
        }
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    
    public static void main(String[] args) {
        int values[] = {5,3,6,2,8,9,1,4,10,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        //inOrder(root);
        //System.out.println(searchBST(root, 1)? "Found":"Not found");
    }
}
