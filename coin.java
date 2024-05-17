import java.util.Scanner;

public class coins  
{   
public int minNoCoins(int coinsArr[], int m, int Y)  
{   
if (Y == 0)  
{  
return 0;  
}  

int result = Integer.MAX_VALUE;  
 
for (int j = 0; j < m; j++)  
{  
if (coinsArr[j] <= Y)  
{  
int subRes = minNoCoins(coinsArr, m, Y - coinsArr[j]);  
   
if (subRes != Integer.MAX_VALUE && subRes + 1 < result)  
{  
result = subRes + 1;  
}  
}  
}  
return result;  
}  
public static void main(String argvs[])  
{  
Scanner sc=new Scanner(System.in); 
MinCoins obj = new MinCoins();  
 
int coinsArr[] = {5, 10, 25};  
  
int size = coinsArr.length;  
int Y;  
System.out.println("Enter the Amount");
Y=sc.nextInt();
   
int ans = obj.minNoCoins(coinsArr, size, Y);  
 
System.out.println("For the sum "+ Y);  
System.out.println("The minimum number of required coins is: "+ ans);  
System.out.println("Using the following coins: ");  
 
for(int i = 0; i < size; i++)  
{  
System.out.print(coinsArr[i] + " ");    
}  
 
}
}


 
/* new input  
int coinsArr1[] = {4, 3, 2, 6};  
Y = 15;  
size = coinsArr1.length;  
 
 
ans = obj.minNoCoins(coinsArr1, size, Y);  
 
System.out.println("For the sum "+ Y);  
System.out.println("The minimum number of required coins is: "+ ans);  
System.out.println("Using the following coins: ");  
 
for(int i = 0; i < size; i++)  
{  
System.out.print(coinsArr1[i] + " ");    
}  
 
}*/