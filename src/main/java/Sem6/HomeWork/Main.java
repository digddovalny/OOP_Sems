package Sem6.HomeWork;

public class Main{
	public static void main(String[] args){

		User user = new User("Smile");

		Saveable saveable = new Persister(user);
		saveable.save();

		Printable printable = new PrintUser(user);
		printable.print();

	}
}