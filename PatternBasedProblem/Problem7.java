package PatternBasedProblem;

import java.util.*;
class Problem7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),acc=3,cur;
        for(cur=0;cur<n;cur++){
            acc=acc*2+cur;
            System.out.print(acc+" ");
        }

    }
}