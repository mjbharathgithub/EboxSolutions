package PatternBasedProblem;
import java.util.*;
class Problem8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),num=2,ind,inc=3,dec=-1;
        for(ind=1;ind<=n;ind++){
            System.out.print(num+" ");
            if(ind%3==0) {
                num=num+dec;
                dec-=2;inc--;
            }
            else {
                inc++;
                num+=inc;
            }
        }
    }
}