package EmiAndInterestBasedProblem;
import java.util.*;
class Problem6{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    double p=sc.nextDouble(),r=sc.nextDouble(),n=sc.nextDouble(),compoundInterest=0,ans=0;
    int num=(int)n;

    System.out.println(Math.round((p*n*r)/100));
    
    while(num>0){
        compoundInterest=(p*(r/100));
        ans+=compoundInterest;
        p+=compoundInterest;
        num--;
     //   System.out.println("compound : "+compoundInterest+"  Principal change : "+p+" num : "+num);
    }
    System.out.print(Math.round(ans)); 

}
}