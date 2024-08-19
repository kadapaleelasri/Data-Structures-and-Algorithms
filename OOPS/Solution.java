class Complex{
    int real;
    int imag;
    public Complex(int r,int i){
        real = r;
        imag = i;
    }
    public static Complex add(Complex a,Complex b){
        Complex c = new Complex(0, 0);
        c.real = a.real + b.real;
        c.imag = a.imag + b.imag;
        return c;
    }
    public static Complex sub(Complex a,Complex b){
        Complex c = new Complex(0, 0);
        c.real = a.real - b.real;
        c.imag = a.imag - b.imag;
        return c;
    }
    public static Complex Mul(Complex a,Complex b){
        int x = a.real;
        int y = a.imag;
        int p = b.real;
        int q = b.imag;
        Complex c = new Complex(0, 0);
        c.real = x*p - y*q;
        c.imag = x*q + y*q;
        return c;
    }
    public void printComplex(){
        if(real==0 && imag!=0){
            System.out.println(imag+"i");        
        }
        else if(real!=0 && imag==0){
            System.out.println(real); 
        }else{
            if(imag<0){
                System.out.println(real+""+imag+"i");  
            }else{
            System.out.println(real+"+"+imag+"i"); 
            }
        }
    }

}
public class Solution{
    public static void main(String[] args) {
        Complex m = new Complex(5,7);
        Complex n = new Complex(4,9);
        Complex a = Complex.add(m, n);
        a.printComplex();
        Complex b = Complex.sub(m, n);
        b.printComplex();
    }
}