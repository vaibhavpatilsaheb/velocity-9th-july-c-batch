package thisAndSuperKeyworld;

public class SuperUse extends ThisUse{

	int a=900;
	
	public static void main(String[] args)
	{
		SuperUse su= new SuperUse();
		su.demo();
	}
    public void demo()
  {
    	int a=20;
	System.out.println("value of local is" + a);
	System.out.println("value of global is from same class " + this.a);
	System.out.println("value of globle is from super class" + super.a);
  }
  }
