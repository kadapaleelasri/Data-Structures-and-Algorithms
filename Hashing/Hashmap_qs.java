
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Hashmap_qs {
    // an element is majority ele if it occurs more than n/3 times where n is length of arr
    public static List<Integer> getMajorityEle(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = arr.length;
        int th = n/3;
        for(int i=0;i<n;i++){
            int num = arr[i];
            // if(hm.containsKey(num)){//if val already exist as key then increment freq
            //     hm.put(num,hm.get(num)+1);
            // }else{// add val as key with freq 1
            //     hm.put(num, 1);
            // }
            //shorthand
           hm.put(num, hm.getOrDefault(num, 0)+1);
        }
       // Set<Integer> keys = hm.keySet();// all keys are stored in set
       // for(Integer key : keys){
          for(Integer key : hm.keySet())
            if(hm.get(key) > th){// if a val occurs more than threshold i.e n/3;
                list.add(key); 
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,3,1,5,1};
        int[] arr1 = {1,2};
        System.out.println(getMajorityEle(arr));
        System.out.println(getMajorityEle(arr1));
    }
}
