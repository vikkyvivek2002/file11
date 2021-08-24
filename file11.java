abstract class Transport 
{
	void color ()
	{
		System.out.print("Red");
	}
	abstract int wheels ();
}

class Car extends Transport
{
	int wheels()
	{
		return 4 ;
	}
}
class byke extends Transport 
{
	int wheels ()
	{
		return 2;
	}
}
public class file11 {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.color();
		System.out.println(" car has "+c.wheels() +" wheels .");
		byke b = new byke();
		b.color();
		System.out.println(" Byke has "+b.wheels() +" wheels .");

	}

}
