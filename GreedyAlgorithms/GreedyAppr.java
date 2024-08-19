import java.util.*;
public class GreedyAppr {
    static class Job{
        int id;
        int deadline;
        int profit;
        public Job(int i,int d,int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void getMaxJobsPerformed(){
        int jobsInfo[][] = {
            {4,20},//{deadline,profit}
            {1,10},
            {1,40},
            {1,30},
        };
        ArrayList<Job> Jobslist = new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++){
            Jobslist.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(Jobslist,(obj1,obj2) -> obj2.profit-obj1.profit); // sorting arrayList in descending order , 2nd parameter is lamda function
        int time=0;int maxProfit =0;
        ArrayList<Integer> seq = new ArrayList<>();
        for(int i=0;i<Jobslist.size();i++){
            Job curr = Jobslist.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                System.out.println(curr.profit);
                maxProfit+=curr.profit;
                time++;
            }
        }
        System.out.println("max no.of jobs performed "+time);
        System.out.println("max profit from jobs "+maxProfit);
        for(int i=0;i<seq.size();i++){
            //System.out.print((char)(seq.get(i)+'A')+" ");//to print job name-> character
            System.out.print(seq.get(i)+" ");//to print job idx
        }
        
    }
    //chocola problem 
    public static void findCost(){
        Integer horzCt[] = {2,1,3,1,4};//horizontal costs
        Integer verCt[] = {2,4,1};//vertical costs
        //sort costs in desc order
        Arrays.sort(verCt,Collections.reverseOrder());
        Arrays.sort(horzCt,Collections.reverseOrder());
        int vp = 1,hp = 1;//intially vertical piece and horizontal piece will be one
        int v=0,h=0; //pointers for iterating
        int cost = 0;
        while(v < verCt.length && h < horzCt.length){
            if(verCt[v] >= horzCt[h]){
                //vertical cut, first we do costly cut 
                //bcz the pieces will be less so that cost to us is less
                cost += (verCt[v] * hp);
                vp++;//vp pieces increase
                v++;
            }else{
                //horizontal cut
                cost += (horzCt[h] * vp);
                hp++;
                h++;
            }
        }
        while(v < verCt.length){
            cost += (verCt[v] * hp);
            vp++;//hp pieces increase
            v++;
        }
        while(h < horzCt.length){
            cost += (horzCt[v] * vp);
            hp++;
            h++;
        }
        System.out.println("min cost to cut chocolate "+cost);
    }
    public static void main(String[] args) {
        //job sequencing problem
        // int jobsInfo[][] = {
        //     {0,4,20},//{idx,deadline,profit}
        //     {1,1,10},
        //     {2,1,40},
        //     {3,1,30},
        // };
        // Arrays.sort(jobsInfo,Comparator.comparingDouble(o->o[2]));
        // ArrayList<Integer> seqOfJobs = new ArrayList<>();
        // int time = 0;
        // int maxProfit=0;
        // for(int i=jobsInfo.length-1;i>=0;i--){
        //     if(jobsInfo[i][1] > time){
        //         seqOfJobs.add(i);
        //         maxProfit+=jobsInfo[i][2];
        //         time++;
        //     }
        // }
        // System.out.println("max no.of jobs performed "+time);
        // System.out.println("max profit from jobs "+maxProfit);
        // for(int i=0;i<seqOfJobs.size();i++){
        //     System.out.print((char)(seqOfJobs.get(i)+'A'-1)+" ");
        // }
        //getMaxJobsPerformed();
        findCost();
    }
}
