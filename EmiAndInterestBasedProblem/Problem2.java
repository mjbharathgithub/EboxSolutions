package EmiAndInterestBasedProblem;
import java.util.*;
class Problem2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
        double p=sc.nextDouble(),r=sc.nextDouble(),n=sc.nextDouble();
        
        System.out.println(Math.round((p*n*r)/100));
        t--;
        }
    }
}