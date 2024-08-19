//package ArrayLists;

import java.util.*;
public class ArrayLists {
    public static void printReverse(ArrayList<Integer> list){
        int n = list.size();
        for(int i=n-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    //to find max in val in AL
    public static int maxEle(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max = Math.max(max, list.get(i));
        }
        return max;
    }
    // two swap 2 nums in AL
    public static ArrayList<Integer> swapTwoNums(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2)); // val at idx2 is set at idx1
        list.set(idx2,temp); // temp is set at idx2
        return list;
    }
    public static void printMulDArrList(ArrayList<ArrayList<Integer>> mainList){
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> row = mainList.get(i);
            for(int j=0;j<row.size();j++){
                System.out.print(row.get(j)+" ");
            }
            System.out.println();
        }
    }
    //multi - dimensional AL
    public static void twoDArrList(){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        mainList.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(6);
        mainList.add(list2);
        printMulDArrList(mainList);
    }
    public static void main(String[] args) {
        //ArrayList<Integer> list = new  ArrayList<>();
        //operations on AL
        //1)add ele AL
        // list.add(1);
        // list.add(2);
        // list.add(5);
        // list.add(3);
        // System.out.println(list);
        // //to add at particular idx
        // list.add(3,4); // to add 4 at idx 3
        // System.out.println(list);
        // //2)to access ele at an idx
        // // to get ele at idx 2
        // System.out.println( list.get(2));
        // //3) to set ele at an idx // value at idx is replaced with new val 
        // list.set(4,8);
        // System.out.println(list);
        // //4) to remove ele at an idx
        // list.remove(3);
        // System.out.println(list);
        // //5) to check ele present in AL or not
        // System.out.println(list.contains(8));
        // System.out.println(list);
        // System.out.println("size of AL "+list.size());
        // printReverse(list);
        //System.out.println("max element "+ maxEle(list));
        //System.out.println(swapTwoNums(list, 2, 3));
        // to sort AL : optimized approach which is inbuilt
        //Collections.sort(list); //sorts in asc order // Collections is a class
        // System.out.println(list);
        // to sort in desc order
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);
        twoDArrList();
    }
}
