package EmiAndInterestBasedProblem;
import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float X2,B1,B2, X1=sc.nextFloat(),A=sc.nextFloat(),B=sc.nextFloat(),n=sc.nextFloat(),C=sc.nextFloat();int ans;
        X2=X1*((n*A)/100);
        //System.out.println(X2);
        B1=(n*A)/100;
        //System.out.println(B1);
        B2=(n*B)/100;
       // System.out.println(B2);
        


        ans=Math.abs(Math.round((C-X2)/(B1-B2)));
        System.out.print(ans);
    }
}