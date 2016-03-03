
public class Cello {
	public static void main (String[] args)
	{
		char ch[] = {'H','e','l','l','o'};
		change(ch);
		System.out.println(ch);
	}
	public static void change(char ch[])
	{
		ch[0] = 'C';
	}
}
