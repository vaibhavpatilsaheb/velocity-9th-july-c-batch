package inheritance;

public class HiralcalInheritance {

	public static void main(String[] args) 
	{
Mother m= new Mother();
m.look();


Child1 c1 = new Child1();
c1.toys();
c1.look();


Child2 c2 = new Child2();
c2.car();
c2.look();
c2.toys();
	}

}
