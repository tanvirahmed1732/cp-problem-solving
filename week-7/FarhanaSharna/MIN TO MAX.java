import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc= new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                
            }
	    Arrays.sort(a);
            int count =0;
           
 for(int j=0;j<n;j++)
 {
     if(a[0]==a[j])
     {
         count++;
 }
            
	}
 System.out.println(n-count);
 
	}
}
}
