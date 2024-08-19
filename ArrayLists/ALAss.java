//package ArrayLists;

import java.util.ArrayList;

public class ALAss {
    //check if arrayL is motonic , if it is monotonic increase or decrease
    // [1, 2, 3] monotonic increase , [4, 3, 2] monotonic decrease - true
    // 1, 6, 0 - false
    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean isMonoInc = true; 
        boolean isMonoDec = true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                isMonoInc = false;
            }
            if(list.get(i)<list.get(i+1)){
                isMonoDec = false;
            }
        }
        return isMonoInc || isMonoDec;
    }
    // most frequent number(i.e target) following key
    // constraints 2<= nums.size<=100
    // 1<=nums.get(i)<=1000
    public static int getTarget(ArrayList<Integer> list,int key){
        int count[] = new int[1000];
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                count[list.get(i+1)]+=1;
            }
        }
        int max = 0;
        int ans = 0;
        for(int i=0;i<1000;i++){
            if(count[i]>max){
                max = count[i];
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       // ArrayList<Integer> list1 = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        int key = 2;
        System.out.println(getTarget(list,key));
        // list1.add(4);
        // list1.add(3);
        // list1.add(2);
        // System.out.println(isMonotonic(list1));
    }
}
