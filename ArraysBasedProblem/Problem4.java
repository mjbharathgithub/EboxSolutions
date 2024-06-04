import java.util.Scanner;

class Main{
    public static void main(String args[]){
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int conflicts=0,start=0;
        for(int i=0;i<n;i++){
            if(i==n-1){
                if(arr[i]!=arr[0]){
                    conflicts++;
                }
            }else if(arr[i]!=arr[i+1]){
                conflicts++;
            }
            if(conflicts==1) start=i;
            if(conflicts>1) return -1;

        }
        if(conflicts==0) return conflicts;
        return n-start;

    }
}
