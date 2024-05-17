class hellow{

 public static void main(String args[]) {
    System.out.println("hellow world");
    int i;
    int n=6;
    int k=6;
    for (i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
         if(j<2){
            k=mceil(k/2);
            System.out.print("*");
         }
         k=ceil(k/j);
       
         System.out.print("*");
      }
      System.out.print("\n");
    }
 }


}