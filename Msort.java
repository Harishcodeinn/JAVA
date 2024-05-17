import java.util.Scanner;
import java.io.*;
import java.lang.Math;
public class Msort {
    public static void main(String args[])
    {
        try{
            
            Scanner sc=new Scanner(System.in);
            int n,i,ul,ll;
            FileWriter f=new FileWriter(new File("input.txt"));
            System.out.print("Enter the number of elements=");
            n=sc.nextInt();
            int[] arr=new int[n];
            String fileString="";
            System.out.print("Enter lower limit:");
            ll=sc.nextInt();
            System.out.print("Enter upper limit:");
            ul=sc.nextInt();
            for(i=0;i<n;i++)
            {
                fileString=fileString+String.valueOf((int)(Math.random()*(ul-ll+1)+ll))+" ";
            }
            f.write(fileString);
            f.close();
            String read="";
            FileReader f1=new FileReader(new File("input.txt"));
            int p;
            while((p=f1.read())!=-1)
            {
                read+=(char)p;
            }
            f1.close();
            String[] list=read.split(" ");
	        for(i=0;i<list.length;i++)
	        {
	            arr[i]=Integer.parseInt(list[i]);
	        }
	        long start=System.currentTimeMillis();
            display(arr,n);
            quickSort(arr,0,n-1);
            System.out.println("Sorted array:");
            display(arr,n);
            long end=System.currentTimeMillis();
            System.out.println("Time taken:"+ (end-start));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static void display(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println("\n");
    }
    static void quickSort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int pivot=partition(arr,l,r);
            quickSort(arr, l, pivot-1);
            quickSort(arr, pivot+1, r);
        }
    }
    static int partition(int[] arr,int l,int r)
    {
        int pivot = arr[r];
        int i = (l - 1);
 
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[r];
        arr[r]=arr[i+1];
        arr[i+1]=temp;
        return (i + 1);
        
    }
}

