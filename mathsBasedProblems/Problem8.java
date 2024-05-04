package mathsBasedProblems;
import java.util.*;
class Problme8  {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),ind;long primorial=1;
		int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};
		for(ind=0;ind<n;ind++) primorial*=primeNumbers[ind];
		System.out.print(primorial);
		}
}