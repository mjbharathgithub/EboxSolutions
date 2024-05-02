package EmiAndInterestBasedProblem;
import java.util.*;
class Problem1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double principle=sc.nextDouble(),interestRate=sc.nextDouble(),time=sc.nextDouble();
        interestRate=(interestRate/1200);
        double emi = (principle * interestRate * Math.pow(1 + interestRate, time))/ (Math.pow(1 + interestRate, time) - 1);
        System.out.printf("%.1f",emi);
        
    }
}