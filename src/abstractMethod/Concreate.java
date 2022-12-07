package abstractMethod;

public class Concreate extends Sample {

	public static void main(String[] args)
	{
		Concreate cc= new Concreate();
		cc.sub();
		cc.sum();
	}

	@Override
	public void sum() 
	{
		System.out.println("this method comple in concreate class ");
	}

}
