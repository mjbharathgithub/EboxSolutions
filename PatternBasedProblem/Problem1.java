package PatternBasedProblem;
import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),a=0,b=0;boolean found = false;
        for ( a = 1; a * a * a < n; a++) {
            for ( b = a; b * b * b < n; b++) {
                if (a * a * a + b * b * b == n) {
                    found = true;
                    break;
                }
            }
            if (found)break;
        }
        if (found)System.out.println("yes");
        else System.out.println("no");
            
    }
}