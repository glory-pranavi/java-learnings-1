import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int year=scanner.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0)) System.out.println("Leap year");
        else System.out.println("not a leap year");

        
    }
}
