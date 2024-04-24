package PatternBasedProblem;
import  java.util.*;
class Problem4{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(), row=0,col=0;String forward="",reverse="",line="";
        for(row=1;row<=n;row++){
            forward="";reverse="";
            for(col=1;col<=n;col++){
                if(col<row) {
                    forward=forward+col;
                     if(col<n)reverse=col+reverse;
                }
                else{
                forward+=row;
                if(col<n)reverse=row+reverse;
                }
                }
                System.out.println(forward+reverse);
                if(row<n) line=(forward+reverse+"\n")+line;
        }
        System.out.print(line);
    }
}