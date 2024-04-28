package PatternBasedProblem;
import java.util.*;
class Problem9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),ind;
        for(ind=1;ind<=n;ind++) System.out.print(((int)Math.pow(3,ind)+1)+" ");
    }
}