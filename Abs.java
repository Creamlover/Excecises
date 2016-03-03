abstract class Base{
	abstract public void myfunc();
}

public class Abs extends Base{
public void myfunc()
{}
public static void main(String argv[])
{
	Abs a = new Abs();
	a.amethod();
}
public void amethod(){
		System.out.println("A Method");
}
}
