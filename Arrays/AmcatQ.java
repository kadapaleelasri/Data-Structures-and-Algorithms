import java.util.Arrays;

public class AmcatQ {
    public static void printUncommonElements(int[] a1,int[] a2){
        int len1 = a1.length;
        int len2 = a2.length;
        int i=0,j=0,c=0;
        while(i < len1 && j < len2){
            if(a1[i] < a2[j]){
                System.out.print(a1[i]+" ");
                i++;
                c++;
            }else if(a2[j] < a1[i]){
                System.out.print(a2[j]+" ");
                j++;
                c++;
            }else{//both are equal
                i++;
                j++;
            }
        }
        while(i < len1){
            System.out.print(a1[i]+" ");
                i++;
                c++;
        }
        while(j < len2){
            System.out.print(a2[j]+" ");
                j++;
                c++;
        }
        System.out.println("\ncount of uncommon elements: "+c);
    }
    public static void main(String[] args) {
        int a1[] = {2,5,4,6,7,1,15};
        int a2[] = {3,65,8,1,5,0};
        Arrays.sort(a1);
        Arrays.sort(a2);
        printUncommonElements(a1,a2);
    }
}
