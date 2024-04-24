package PatternBasedProblem;
import java.util.*;
class Problem5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),row=0,num=n;boolean flag=false;

        for(row=1;row<=n*n;row++){
            System.out.print(num);
            if(row%n==0){
                 flag=!flag;
                 System.out.println();
                 if(!flag) num+=2;
                 }
            if(!flag) num--;
            else num++;
            
        }

    }
}