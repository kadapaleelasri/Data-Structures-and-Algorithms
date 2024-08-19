public class TrieImple {
    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children = new Node[26];
            eow = false;
        }
    }
    static Node root = new Node();
    public static void insert(String s){
        Node curr = root;
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int c = 0;
        for(int i=0;i<26;i++){
            if(root.children[i] != null){
                c += countNodes(root.children[i]);
            }
        }
        return c+1;
    }
    public static void main(String[] args) {
        //String s = "apply";
        String s = "ababa";
        for(int i=0;i<s.length();i++){
            String s1 = s.substring(i);
            insert(s1);
        }
        System.out.println(countNodes(root));
    }
}
