import java.io.BufferedWriter;
import java.io.FileWriter;

public class TicketCreate 
{
	private static BufferedWriter file;
	
	public static void createkitchenFile()
	{
		try 
		{
			file = new BufferedWriter(new FileWriter("TicketOrderKitchen.txt"));
		} 
		catch (Exception e) 
		{
			System.out.println("probleme fichier " + e );
		}
	}
	
	public static void writeKitchenOrder()
	{
		try 
		{	
			file.write(data.header);
			
			for(String food : data.order)
			{
				String foody = food + "\n"; 
				file.write(foody);
			}
		} 
		catch (Exception e) 
		{
			System.out.println("probleme" + e);
		}
	}
	
	public static void closeKitchenFile()
	{
		try 
		{
			file.close();
		} 
		catch (Exception e) 
		{
			System.out.println("probleme close " + e);
		}
	}
}
