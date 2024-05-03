package EmiAndInterestBasedProblem;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int amount=sc.nextInt(),borrowedInterest=sc.nextInt(),lendedInterest=sc.nextInt(),m=sc.nextInt();
       borrowedInterest=(amount*borrowedInterest*m)/100;
       lendedInterest=(amount*lendedInterest*m)/100;
       System.out.print((lendedInterest-borrowedInterest)/m);
    }
}