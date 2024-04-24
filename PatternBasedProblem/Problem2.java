package PatternBasedProblem;
import java.util.*;
class Problem2{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int row=0,col=1;
        for(row=1;row<=n*n;row++){
            if(row<=n|| row>(n*n-n) || ( row>(n/2*n)&&row<=(n/2*n)+n  )) {
                if(col==n){
                    System.out.println(0);
                    col=0;
                }
                else System.out.print(1);

            }
            else{
                if(col==1)System.out.print(1);
                else if(col==n){
                    System.out.println(1);
                    col=0;
            }
           else System.out.print(0);
            }
             col++;
        }
    }
}