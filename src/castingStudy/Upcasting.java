package castingStudy;

public class Upcasting {

	public static void main(String[] args)
	{
Father f= new Father();
f.home();
f.money();
System.out.println("**************************************");

Son s= new Son();
s.home();
s.money();
s.bike();
System.out.println("*******************************************");

//creating object of sub class(sonclass) by using superclass(father) referance

Father f1 = new Son();
f1.home();
f1.money();
	}

}
