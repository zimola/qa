import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class PiggyBankHandler {
	
	public void Save(PiggyBank bank)
	{
		try
		{
			PrintWriter writer = new PrintWriter("piggybank.txt", "UTF-8");
			writer.println(Integer.toString(bank.numPennies));
			writer.println(Integer.toString(bank.numDimes));
			writer.println(Integer.toString(bank.numNickels));
			writer.println(Integer.toString(bank.numQuarters));
			writer.close();
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}

	public void Load(PiggyBank bank)
	{
		try
		{
			Scanner in = new Scanner(new FileReader("piggybank.txt"));
			bank.numPennies = Integer.parseInt(in.next());
			bank.numDimes = Integer.parseInt(in.next());
			bank.numNickels = Integer.parseInt(in.next());
			bank.numQuarters = Integer.parseInt(in.next());
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}


}
