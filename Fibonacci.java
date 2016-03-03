import java.util.*;
import java.io.*;
public class Fibonacci {
	public static int k=0;
	public static void main (String[] args) throws Exception
	{
		Scanner cin=new Scanner(System.in);
		long a=cin.nextLong();
		System.out.println(fibonacci(a));
		System.out.println("It takes the circle for "+k+" times");
	}
	public static long fibonacci (long m){
		if(m==0||m==1)
		{
			k++;
			return m;
		}
		else return fibonacci(m-1)+fibonacci(m-2);
	}

}
