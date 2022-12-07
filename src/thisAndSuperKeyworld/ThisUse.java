package thisAndSuperKeyworld;

public class ThisUse {
int a=50; // global varible
	public static void main(String[] args) 
	{
ThisUse tu= new ThisUse();
tu.test();
	}
public void test()
{
	int a =90;
	int sum=a+10;
	System.out.println(" sum is " + sum);
	
	int sum1=this.a+20;
	System.out.println("sum1 is " + sum1);
	
	System.out.println("local value is " + a);
	System.out.println("globle value is " + this.a);
}
}
