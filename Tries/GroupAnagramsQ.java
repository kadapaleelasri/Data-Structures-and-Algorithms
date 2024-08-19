//package Tries;
import java.util.*;
public class GroupAnagramsQ {
    static class Node{
        ArrayList<String> data;
        Node[] children;
        boolean eow;
        public Node(){
            data = new ArrayList<>();
            children = new Node[26];
            eow = false;
        }
    }
    static Node root;
    public static void build(String w){
        Node temp = root;
        char[] arr = w.toCharArray();
        Arrays.sort(arr);
        for(char c : arr){
            int idx = c-'a';
            if(temp.children[idx] == null){
                temp.children[idx] = new Node();
            }
            temp = temp.children[idx];
        }
        temp.eow = true;
        temp.data.add(w);
    }
    public static void dfs(Node root,List<List<String>> ans){
        if(root.eow){
            ans.add(root.data);
        }
        for(int i=0;i<26;i++){
            if(root.children[i] != null){
                dfs(root.children[i],ans);
            }
        }
    }
    List<List<String>> ans;
    public List<List<String>> groupAna(){
        root = new Node();
        ans = new ArrayList<>();
        String[] ws = {"eat","ate","nat","tea","tan","bat"};
        for(String w : ws){
            build(w);
        }
        dfs(root,ans);
        //System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        GroupAnagramsQ g = new GroupAnagramsQ();
        System.out.println(g.groupAna());
        
       
    }
}
