package interfaceStudy;

public class InterfaceClass1 implements Interface2 {

	public static void main(String[] args) 
	{
		InterfaceClass1 v= new InterfaceClass1();
		v.sample1();
		v.sample2();
		v.sample3();
		v.sample4();
	}

	@Override
	public void sample1() 
	{
		System.out.println("sample1 from Inerface1"); 
	}

	@Override
	public void sample2() 
	{
		System.out.println("sample 2 from Inerface 1");
	}

	@Override
	public void sample3()
	{
		System.out.println("sample 3 from interface 2");
	}

	@Override
	public void sample4() 
	{
		System.out.println("sample 4 from interface 2");
	}

}
