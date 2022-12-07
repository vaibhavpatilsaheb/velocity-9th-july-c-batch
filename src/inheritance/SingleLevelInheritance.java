package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) 
	{
Mother m= new Mother();
m.nature();

Son s= new Son();
s.mobile();
Mother.look();
Son.look();
s.nature();  // calling mother property using son object
Son.bike();	
	}

}
