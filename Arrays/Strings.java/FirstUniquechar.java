import java.util.*;
import java.util.LinkedList;
public class FirstUniquechar {
    static class Info{
        int idx;
        char ch;
        public Info(int idx,char ch){
            this.idx = idx;
            this.ch = ch;
        }
    }
    public static int firstUniqChar(String s) {
        Queue<Info> q = new LinkedList<>();
        int ans = 0;
        q.add(new Info(0,s.charAt(0)));
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(!q.isEmpty() && q.peek().ch == ch){
                q.remove();
            }else{
                q.add(new Info(i,ch));
            }
            if(q.isEmpty()){
                ans = -1;
            }else{
                ans = q.peek().idx;
            }
        }
        return ans;
    }
    public static int firstNonRepChar(String s){//O(n)
        Queue<Info> q = new LinkedList<>();
        int freq[] = new int[26];
        int ans = -1;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            q.add(new Info(i, ch));
            freq[ch - 'a']++;
            while(!q.isEmpty() && freq[q.peek().ch - 'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                ans = -1;
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek().ch+" ");
                ans = q.peek().idx;
            }
        }
        return ans;
    }
   public static void main(String[] args) {
      System.out.println(firstNonRepChar("eelts"));//2
      System.out.println(firstNonRepChar("leetcode"));//0
      System.out.println(firstNonRepChar("loveleetcode"));//2
      System.out.println(firstNonRepChar("aabb"));//-1
      System.out.println(firstNonRepChar("iLoveToCode"));//0
      System.out.println(firstNonRepChar("studyAlgorithms"));//2
   }
}
