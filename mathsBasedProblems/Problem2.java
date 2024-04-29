package mathsBasedProblems;
import java.util.*;
class Problem2{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),right=1,left=1,position=0,ind;
		if (n == 1) {
           System.out.print(1);return;
        }
        for (ind = 2; ind <= n; ind++) {
            position = right + left;
            left = right;
            right = position;
        }
        System.out.print(position);
	}
}