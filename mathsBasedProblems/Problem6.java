package mathsBasedProblems;
import java.util.*;
class Problem6  {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),x,count=0;
		if(a<b) System.out.print("No solution possible");
		else if(a==b) System.out.print("Infinite solution possible");
		else{
			  for(x=1;x<a;x++)  if(a%x==b) count++;
			  System.out.print(count);
			  }	 
		
		
		
		
	}
}