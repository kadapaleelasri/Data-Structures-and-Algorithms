import java.util.*;
public class practice_2 {
   public static void main(String[] args) {
    //1)check num is +ve or -ve
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();
    // String answer = (num>=0)? "POSITIVE" : "NEGATIVE";
    // System.out.println("number is "+answer);
    // sc.close();
    //2) have fever or not if temp > 100
    // double temp = 103.5;
    // String check = (temp>100)? "FEVER" : "NO FEVER";
    // System.out.println("report "+check);
    //Write a Java program to input week number(1-7) and print day of week name using switch case
    Scanner sc = new Scanner(System.in);
    System.out.println("enter day num (1-7)");
    int day = sc.nextInt();
    switch(day){
        case 1:System.out.println("Monday");
               break;
        case 2:System.out.println("Tuesday");
               break;
        case 3:System.out.println("Wednesday");
               break;
        case 4:System.out.println("thrusday");
               break;
        case 5:System.out.println("Friday");
               break;
        case 6:System.out.println("Saturday");
               break;
        case 7:System.out.println("Sunday");
               break;
        default: System.out.println("Invalid");
    }
    sc.close();;
   } 
}
