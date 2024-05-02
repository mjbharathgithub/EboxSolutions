package EmiAndInterestBasedProblem;
import java.util.*;
class Problem3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double pcktMny=sc.nextDouble(),Y=sc.nextDouble();
        System.out.println(Math.round(pcktMny/(Y/1200)));
    }
}