package mathsBasedProblems;
import java.util.*;
class Problem5  {
	public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt(),ind;
	   for(ind =n;ind>=2;ind--) {
		   if(n%ind==0&&isPrime(ind))
		   {
		   System.out.print(ind);
		   return;
		   }
	   }		
	}

	 public static boolean isPrime(int n) {
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}