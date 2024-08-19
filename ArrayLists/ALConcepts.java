//package ArrayLists;
import java.util.*;
public class ALConcepts {
    //container with most water- pick 2 heights
    //brute force TC - O(n^2)
    public static int storeWater(ArrayList<Integer> height){
        // when only 1 height is given maxWater =0;
        int maxWater = 0;
        // get all possible pairs and find how much water stored(area)
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int hgt = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int currWater = hgt * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    //optimized appr - 2 pointer appr TC-O(n)
    public static int storeWater2(ArrayList<Integer> height){
        int lp = 0;
        int rp = height.size()-1;
        int maxWater = 0;
        while(lp<rp){
            int hgt = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currWater = hgt * width;
            maxWater = Math.max(maxWater,currWater);
            if(height.get(lp)<height.get(rp)){ // bcz water boundary depends on lower height level
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    // pair sum type 1 - brute force O(n^2)
    //check whether target sum exist or not
    public static boolean pairSum1(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    // optimized appr - 2 pointer app TC-O(n)
    public static boolean pairSum1_OA(ArrayList<Integer> list,int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }else if(list.get(lp)+list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    // pair sum type-2 // we can brute force as usual but it is not optimized appr
    //i/p : [11,15,6,8,9,10] target = 16
    //o/p : true
    // OA - 2 pointer appr 
    public static boolean pairSum2(ArrayList<Integer> list,int target){
        // find the pivot point or breaking point where the AL is rotated
        // usually in sorted AL, ele at i < ele i+1 (always)
        int bp = Integer.MIN_VALUE; // invalid idx
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){// breaking point
                bp = i;
                break;
            }
        }
        int n = list.size();
        int lp = bp+1;
        int rp = bp;
        while(lp != rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }else if(list.get(lp)+list.get(rp) < target){
                lp = (lp+1)%n; // bcz iterating in rotated way if lp reached n-1 then it starts from 0
            }else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // System.out.println(storeWater(height));
        // System.out.println(storeWater2(height));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(15);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        // given sorted list
        //System.out.println(pairSum1(list,5));
       // System.out.println(pairSum1_OA(list,5));
        System.out.println(pairSum2(list1,16));

    }
}
