public class hello {
    public static void main(String[] args) {
        String s = "program";
        int l = s.length()/2;
        int i = l+1;
        while(i <= s.length()){
            System.out.println(s.substring(l, i));
            i++;
        }
        i = 1;
        while(i != l+1){
            System.out.println(s.substring(l,s.length()) + s.substring(0, i));
            i++;
        }
    }
}
