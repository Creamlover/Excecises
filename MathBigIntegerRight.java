import java.util.*;
import java.math.BigInteger;
import java.lang.*;
public class MathBigIntegerRight {
	public static void main(String[] args) throws NumberFormatException {
		BigInteger one=new BigInteger("1");
		BigInteger two=new BigInteger("2");
		BigInteger three=new BigInteger("3");
		BigInteger sum=new BigInteger("0");
		sum=sum.add(one);
		sum=sum.add(two);
		sum=sum.add(three);
		System.out.println(sum.toString());
	}
}
