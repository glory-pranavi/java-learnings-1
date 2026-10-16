public class Max_3 {
    public static void main(String[] args) {
        
        int a=12;
        int b=3;
        int c=18;
        int max=0;
        if(a>=b && a>=c) max=a;
        else if(b>a && b>c) max=b;
        else max=c;
        System.out.print(max);
    }
}
