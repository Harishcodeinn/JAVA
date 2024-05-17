mport java.io.*;
import java.util.*;

class multiply
{

static double multiple(int a1, int b1)
{
return a1 * b1;
}

static double calculate(double A, double B, double C, double D, double len)
{
return (A* (int)Math.pow(10,len))+(B +C) * (int)Math.pow(10,len/2) +D;
}

static void naive(int[] val1, int[] val2)
{
String A = Arrays.toString(val1).replaceAll("\\[|\\]|,|\\s", "");
String B = Arrays.toString(val2).replaceAll("\\[|\\]|,|\\s", "");
double res1 = Integer.parseInt(A);
double res2 = Integer.parseInt(B);
double result = res1 * res2;
System.out.println("After computing = " +result);
}

static String array_to_string(int arr1[])
{
return Arrays.toString(arr1).replaceAll("\\[|\\]|,|\\s", "");
}

static int[] seperate_array(int[] val1, int start, int end)
{
return Arrays.copyOfRange(val1, start, end);
}
static void divide_conquer(int[] val1, int[] val2, int len)
{
int arr1[] = seperate_array(val1, 0, val1.length/2);
int arr2[] = seperate_array(val1, val1.length/2, val1.length);
int arr3[] = seperate_array(val2, 0, val2.length/2);
int arr4[] = seperate_array(val2, val2.length/2, val2.length);

String A = array_to_string(arr1) ;
String B = array_to_string(arr2);
String C = array_to_string(arr3);
String D = array_to_string(arr4);


int A1 = Integer.parseInt(A);
int A2 = Integer.parseInt(B);
int B1 = Integer.parseInt(C);
int B2 = Integer.parseInt(D);

double ans1 = multiple(A1, B1);
double ans2 = multiple(A2, B1);
double ans3 = multiple(A1, B2);
double ans4 = multiple(A2, B2);

double result = calculate(ans1, ans2, ans3, ans4, len);
System.out.println("After computing = " +result);
}

static double karatsuba_calculate(double ans1, double ans2, double ans3,double len)
{
return (ans1 * (int)Math.pow(10,len)) + ((ans3 - ans1 - ans2) * (int)Math.pow(10,len/2)) + ans2;
}
static void karatsuba(int val1[], int val2[], int len)
{

int arr1[] = seperate_array(val1, 0, val1.length/2);
int arr2[] = seperate_array(val1, val1.length/2, val1.length);
int arr3[] = seperate_array(val2, 0, val2.length/2);
int arr4[] = seperate_array(val2, val2.length/2, val2.length);

String A = array_to_string(arr1) ;
String B = array_to_string(arr2);
String C = array_to_string(arr3);
String D = array_to_string(arr4);


int A1 = Integer.parseInt(A);
int A2 = Integer.parseInt(B);
int B1 = Integer.parseInt(C);
int B2 = Integer.parseInt(D);

double ans1 = multiple(A1, B1);
double ans2 = multiple(A2, B2);
double ans3 = multiple(A1+A2, B1+B2);

double result = karatsuba_calculate(ans1, ans2, ans3, len);
System.out.println("After computing = " +result);
}

public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
boolean loop = true;
int[] val1 = {2,3,4};
int[] val2 = {3,3,2};

int len = val1.length;
while(loop)
{
System.out.println("1.Naive method");
System.out.println("2.Divide and conquer");
System.out.println("3.Karatsuba method");
System.out.println("4.Exit");
System.out.println("Enter option");
int op = sc.nextInt();
switch(op)
{
case 1:
naive(val1, val2);
break;
case 2:
divide_conquer(val1, val2,len);
break;
case 3:
karatsuba(val1, val2, len);
break;
case 4:
loop = false;
break;
}
}

}
}