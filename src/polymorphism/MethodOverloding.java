package polymorphism;

public class MethodOverloding {

	public static void main(String[] args)
	{
		MethodOverloding mo= new MethodOverloding();
		mo.add();
		mo.add(30,30);
	}
public void add()
{
	int a=50;
	int b=40;
	int sum =a+b;
	System.out.println("sum is " + sum);
}
public void add(int a,int b)
{
	int sum= a+b;
	System.out.println("sum is " + sum);
}
}
