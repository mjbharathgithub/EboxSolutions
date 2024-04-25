package PatternBasedProblem;
import java.util.*;
class Problem6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),acc=1,cnum=0;
       for(cnum=-1;cnum<n-1;cnum++){
            acc=(acc*2)+cnum;
            System.out.print(acc+" ");
        }
    }
}