package methodStudy;

public class NonStaticMethodCalling {

	public static void main(String[] args) {
		NonStaticMethodCalling ns=new NonStaticMethodCalling();
		ns.test();
	}
public void test ()
{
	System.out.println("this is complete non static regular method");
}
}
