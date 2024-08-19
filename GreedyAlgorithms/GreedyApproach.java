import java.util.*;
public class GreedyApproach {
    //
    public static void getMaxAct1(){
        int[] start = {0,3,1,5,8,5};
        int[] end = {6,4,2,7,9,9};
        //if acts are not sorted based on end time or sorted based on start time, we have to sort
        //based on end time
        int[][] activities = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;//to store orginal idx
            activities[i][1]=start[i];//start time
            activities[i][2]= end[i];//end time
        }
        //sorting built in 
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        //sorted based on col 2 i,e end time
        int maxAct = 1;// Act 1 selected
        ArrayList<Integer> ans = new ArrayList<>();//to store indexes of selected acts
        int lastEndtime = activities[0][2];//end time of 1st act
        ans.add(activities[0][0]);
        for(int i=1;i<end.length;i++){
            if(activities[i][1] >= lastEndtime){//select the activity
                maxAct++;
                ans.add(activities[i][0]);
                lastEndtime = activities[i][2];
            }
        }
        System.out.println("max activities "+maxAct);
        System.out.println("order of execution of activites");
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }

    //Activity selection problem
    public static void getMaxAct(){
        // int[] start = {10,12,20};
        // int[] end = {20,25,30};
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        //end time basis sorted
        int maxAct = 1;// Act 1 selected
        ArrayList<Integer> ans = new ArrayList<>();//to store indexes of selected acts
        int lastEndtime = end[0];
        ans.add(0);
        for(int i=1;i<end.length;i++){
            if(start[i] >= lastEndtime){//select the activity
                maxAct++;
                lastEndtime = end[i];
                ans.add(i);
            }
        }
        System.out.println("max activities "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
    public static void Knapsack(){
        int[] val = {60,100,120};
        int[] weight = {10,20,30};
        int w = 50;
        int capacity = w;
        int finalValue=0;
        double ratio[] = new double[val.length];
        for(int i=0;i<val.length;i++){
            ratio[i] = val[i]/(double)weight[i];
        }
        for(int i=0;i<val.length;i++){
            if(capacity >= weight[i]){//add full item
                finalValue+=val[i];
                capacity-=weight[i];
            }else{
                //add fractional part of value
                finalValue+=ratio[i]*capacity;
                capacity = 0;
                break;
            }
        } 
        System.out.println("total value in knapsack is "+finalValue);
    }
    //max length chain of pairs
    public static void maxLenChOfPairs(){//O(nlogn)
        int[][] pairs= {
            {5,24},
            {39,60},
            {5,28},
            {27,40},
            {50,90},
        };
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainLen = 1;
        int chainEnd = pairs[0][1];// 2 nd num of pair ex (1,12) - 12
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0] >= chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("max length chain of pairs: "+chainLen);
    }
    //min absolute difference of pairs TC O(nlogn)
    public static void minAbsDiff(){
        int[] A = {1,2,3};
        int[] B = {2,1,3};
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff = 0;
        for(int i=0;i<A.length;i++){
            minDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("min absolute diff is "+minDiff);
    }
    public static void main(String[] args) {
        //getMaxAct();
        //getMaxAct1();
        //Knapsack();
        //maxLenChOfPairs();
        minAbsDiff();
    }
}
