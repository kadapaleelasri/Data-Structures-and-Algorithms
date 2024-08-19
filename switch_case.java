import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        // int num = 3; //char ch = 'a'; case 'a':
        // switch(num){
        //     case 1: 
        //         System.out.println("pizza");
        //         break;
        //     case 2:
        //         System.out.println("burger");
        //         break;
        //     case 3:
        //         System.out.println("biryani");
        //         break;
        //     default:
        //          System.out.println("nothing");    

        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        int a = sc.nextInt();
        System.out.println("Enter n2:");
        int b = sc.nextInt();
        System.out.println("Enter operator(+,-,*/,%)");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+':System.out.println("Add: "+ (a+b));
                    break;
            case '-':System.out.println("Sub: "+ (a-b));
                    break;
            case '*':System.out.println("Mul: "+ (a*b));
                    break;
            case '/':System.out.println("Div: "+ (a/b));
                    break; 
            case '%':System.out.println("Rem: "+ (a%b));
                    break;     
            default:System.out.println("Invalid operator"); 
        }
        sc.close();
        
    }
    
}
