import java.io.*;
import java.util.*;

class strassen
{
static void printArray(int arr[][], int len)
{
for(int i=0;i<len;i++)
{
for(int j=0;j<len;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}

static void calculate_p(int a00,int a01,int a10,int a11,int b00,int b01,int b10,int b11)
{
int p1 = (a00 + a11) * (b00 + b11);
int p2 = b00 * (a10 + a11);
int p3 = a00 * (b01 - b11);
int p4 = a11 * (b10 - b00);
int p5 = b11 * (a00 + a01);
int p6 = (a10 - a00) * (b00 + b01);
int p7 = (b10 + b11) * (a01 - a11);

int res1 = p1 + p4 - p5 + p7;
int res2 = p3 + p5;
int res3 = p2 + p4;
int res4 = p1 + p3 - p2 + p6;
int final_result[][] = {{res1,res2}, {res3, res4}};
int l = final_result.length;
printArray(final_result,l);
}

static void find_strassen(int arr[][], int arr2[][])
{
int a00 = 0, a01 =0, a10=0, a11=0, b00=0, b01=0, b10=0, b11=0;
for(int i=0;i<1;i++)
{
for(int j=0;j<1;j++)
{
a00 = arr[0][0];
a01 = arr[0][1];
a10 = arr[1][0];
a11 = arr[1][1];

b00 = arr2[0][0];
b01 = arr2[0][1];
b10 = arr2[1][0];
b11 = arr2[1][1];
}
}

calculate_p(a00,a01,a10,a11,b00,b01,b10,b11);
}
public static void main(String[]args)
{
int arr1[][] = {{1,3},{7,5}};
int arr2[][] = {{6,8},{4,2}};
int len = arr1.length;
System.out.println("1st matrix");
printArray(arr1, len);
System.out.println("2nd matrix");
printArray(arr2, len);
System.out.println("After Strassen's multiplication");
find_strassen(arr1, arr2);

}
}