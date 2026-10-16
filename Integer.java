import java.util.*;
public class Integer{
    public static void main(String[] args) {
     
        Scanner sc= new Scanner(System.in);

    int num= sc.nextInt();

    if(num>0) 
        {
            System.out.print("positive");
        }
    else if(num<0) System.out.println("Negative");
    else System.out.println("zero");
    }
    
}
