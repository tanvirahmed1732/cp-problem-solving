
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
	int a= sc.nextInt();
        int b= sc.nextInt();
        
        if(a==0 && b>0)
	    System.out.println("Liquid");
	    else if(a>0&& b==0)
	     System.out.println("Solid" );
	    else
	     System.out.println("Solution" );
 }
            
	}
}
