package mathsBasedProblems;
import java.util.*;
class Problem3  {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),result,a=0,ind;
		int arr[]=new int[n];
		for(ind=0;ind<n;ind++ ) arr[ind]=sc.nextInt();
		result=arr[0];
		for(ind=1;ind<n;ind++) result=gcd(result,arr[ind]);
		System.out.print(result);
	}

	public static int gcd(int a,int b){
		int temp;
		while(b!=0){
			temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}	
		
		
	
}