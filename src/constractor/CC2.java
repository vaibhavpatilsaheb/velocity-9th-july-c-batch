package constractor;

public class CC2 {
int a=90;
int b=100;
	public static void main(String[] args)
	{
CC2 c= new CC2();
c.add();
c.sub();
 }
public void add()
{
	int sum = a+b;
	System.out.println("sum is" +sum);
	
}
public void sub()
{
	int sub = a-b;
	System.out.println("sub is " + sub);
}
}
