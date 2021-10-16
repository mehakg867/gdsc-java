import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0)
		{
		    int a =sc.nextInt();
		    int[] arr =new int[a];
		    for(int i=0;i<a;i++)
		   arr[i]=sc.nextInt();
		   for(int i=0;i<a/2;i++)
		   {
		       int temp=arr[i];
		       arr[i]=arr[a-i-1];
		       arr[a-i-1]=temp;
		   }
		   for(int i=0;i<a;i++)
		    System.out.print(arr[i]+" ");
		    System.out.println();
		    n--;


		   }
		}
}
