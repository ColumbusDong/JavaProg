public class Customer
{
	/*Instance Vartiables*/
	private String FirstName, LastName, Street, City, State, Zip;

	/*Default Constructor*/
	public Customer()
	{
		FirstName = null;
		LastName = null;
		Street = null;
		City = null;
		State = null;
		Zip = null;
	}

	/*Regular Constructor*/
	public Customer(String FName, String LName, String Str, String C, String S, String Z)
	{
		FirstName = FName;
		LastName = LName;
		Street = Str;
		City = C;
		State = S;
		Zip = Z;
	}

	/*Output*/
	public String toString()
	{
		String CustoString;

		CustoString = FirstName + " " + LastName + "\n";
		CustoString += Street + "\n";
		CustoString += City + ", " + State + " " + Zip + "\n";

		return CustoString;
	}

	/*-----------------------Mutator (Setters a.k.a Set Info)-----------------------*/
	public void changeStreet(String Str)
	{
		Street = Str;
	}

	public void changeCity(String C)
	{
		City = C;
	}

	public void changeState(String S)
	{
		State = S;
	}

	public void changeZip(String Z)
	{
		Zip = Z;
	}

}