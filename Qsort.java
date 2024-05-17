import java.util.Scanner;
import java.io.*;
import java.lang.Math;
public class Qsort{
    static int[] a;
    public static void main(String args[])
    {
        try{
            Scanner sc=new Scanner(System.in);
            int n,i,ll,ul;
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
            a=new int[n];
            long start=System.currentTimeMillis();
            display(arr,n);
            mergeSort(arr,0,n-1);
            display(a,n);
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
    static void mergeSort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int mid=((l+r)/2);
            mergeSort(arr,l,mid);
            mergeSort(arr, mid+1, r);
            merge(arr,l,r,mid);
        }
    }
    static void merge(int[] arr,int l,int r,int mid)
    {
        int i=l;
        int j=mid+1;
        int k=l;
        int n1=mid;
        int n2=r;
        while(i<=n1 && j<=n2)
        {
            if(arr[i]<=arr[j])
            {
                a[k]=arr[i];
                k++;
                i++;
            }
            else{
                a[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=n1)
        {
                a[k]=arr[i];
                k++;
                i++;
        }
        while(j<=n2)
        {
                a[k]=arr[j];
                k++;
                j++;
        }
        for(int p=l;p<=r;p++)
        {
            arr[p]=a[p];
        }
    }
}

