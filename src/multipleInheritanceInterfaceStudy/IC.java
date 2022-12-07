package multipleInheritanceInterfaceStudy;

public class IC implements Interface1,Interface2

{

	public static void main(String[] args)
	{
IC v= new IC();
v.m1();
v.m2();
v.m3();
v.m4();
v.test();
	}

	@Override
	public void m3() 
	{
		System.out.println("m3 method from interface 2");
	}

	@Override
	public void m4()
	{
		System.out.println("m4 method from interface 2");
	}

	@Override
	public void m1()
	{
		System.out.println("m1 method from interface 1");
	}

	@Override
	public void m2() 
	{
	System.out.println("m2 method from interface 1");	
	}

	@Override
	public void test() 
	{
Interface1.super.test();
Interface2.super.test();		

	}

}
