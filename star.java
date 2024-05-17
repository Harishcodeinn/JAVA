import java.util.*;

class star{
    public static void main(String args[]){
        int i, j,a;
        int n=6;
        int k=n/2;
        for (i=0;i<n;i++){
            a=0;
           while(a!=k & k)
            for(j=0;j<=i;j++){
                
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}