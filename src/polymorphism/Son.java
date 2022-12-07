package polymorphism;

public class Son extends Father {

	public static void main(String[] args)
	{
Father f= new Father();
Son s= new Son();
s.nature();
f.nature();
	}
public void nature()
{
	System.out.println("son nature");
}
}
