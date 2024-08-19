//import java.util.*;
public class javabasics{
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //1. calculating average of 3 numbers
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        // sc.close();
        // int sum = n1+n2+n3;
        // int average = sum/3;
        // System.out.println("Average of three numbers is : "+average);
        //2. calculate area of square
        // int side = sc.nextInt();
        // int area = side*side;
        // System.out.println("Area of square is "+area);
        //3. calculate cost of three items and add gst 18% and display the output
        //input is float values
        /*0.18f f indicates that we are type casting to float because
         *java by default consider the decimal values as double
        */
        // float pen_cost = sc.nextFloat();
        // float pencil_cost = sc.nextFloat();
        // float eraser_cost = sc.nextFloat();
        // float cost = pen_cost+pencil_cost+eraser_cost;
        // float total_cost = (0.18f * cost)+cost;
        // System.out.println("Total cost with gst is "+total_cost);
        //4. find the type of result = (f * b) + (i % c) - (d * s);
        // byte b = 4;
        // char c = 'a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;
        /*  f1 = i % c;
        (f * b)//float * byte promoted to float
        (i % c) int * char promoted to int 
        (d * s) double * short promoted to double;
        float+int->float then float-double->double
        finally double beacause of type conversion
        the expression is given to the result.
        the type of the result variable is largest data type among given data types
        i.e, double */
        // double result = (f * b) + (i % c) - (d * s);
        // System.out.println("The result is "+result);
        //ternary operator (3 operands)
        int number = 4;
        String answer = (number % 2 == 0)? "EVEN":"ODD";
        System.out.println("number is "+answer);
        int marks = 50;
        String result = (marks>=33)? "PASS" : "FAIL";
        System.out.println("result "+result);

    }
}