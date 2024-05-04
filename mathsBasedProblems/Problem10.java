package mathsBasedProblems;
import java.util.*;
class Problme10  {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),d=sc.nextInt(),ind;
		for(ind=0;ind<=n;ind++) if((ind+"").contains(d+"")) System.out.print(ind+" ");
	}
}