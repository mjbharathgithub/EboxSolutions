package PatternBasedProblem;
import java.util.*;
class Problem3{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int row=0,col=0,inc=0;    
        for( row=0;row<n;row++){
            if(row==0){
                for(col=1;col<=n;col++){
                    System.out.print(col+" ");
                }
            }else{
                inc=row*10+1;
                System.out.print(inc+" ");
                for(col=0;col<n-1;col++){
                    inc+=row+1;
                    System.out.print(inc+" "); 
                }
            }
            System.out.println();
            
    }
}
}