import java.util.Scanner;

public class OrderGestion 
{
	public static void displayQuestion()
	{
		System.out.println("bonjour, combien de menus souhaitez vous ?");
		while(data.scan.hasNextInt() == false)	data.scan.next();
		data.nbMenu = data.scan.nextInt();
	}
	
	public static int getInfos(Scanner scan, String info) 
	{
		System.out.println("choix " + info + " : ");
		int maxChoice = 0;
		if(info.equalsIgnoreCase(data.STARTER[0]))	maxChoice = displayTable(data.STARTER);
		else if(info.equalsIgnoreCase(data.DISHES[0])) maxChoice = displayTable(data.DISHES);
		else if(info.equalsIgnoreCase(data.SIDE_DISH[0])) maxChoice = displayTable(data.SIDE_DISH);
		else if(info.equalsIgnoreCase(data.DRINKS[0])) maxChoice = displayTable(data.DRINKS);
		else if(info.equalsIgnoreCase(data.DESSERTS[0])) maxChoice =	displayTable(data.DESSERTS);		
		System.out.println("que souhaitez vous comme "+ info + " ? [saisir le chiffre correspondant]");
		
		int value = 0; 
		
		while(value < 1 || value > maxChoice) 
		{				
			while(scan.hasNextInt() == false)	scan.next();	
			value = scan.nextInt();
			if(value < 1 || value > maxChoice)	System.out.println("mauvaise saisie !");
		}			
		return value; 
	}
	
	public static int displayTable(String [] table) 
	{
		for(int i=1;i<table.length;i++) 
		{			
			System.out.print("[" + i + " - " + table[i].toUpperCase() + "]");
		}
		System.out.println();
		return table.length;
	}
	
	public static void addOrder()
	{
		TicketCreate.createkitchenFile(); // methode pour cree un fichier pour ecrire l'order dedans
		
		for(int i = 0 ; i < data.nbMenu ; i ++) 
		{
			System.out.println("Commande numéro " + (i+1));
			int result = getInfos(data.scan,data.STARTER[0]);
			if(data.STARTER.length-1 > result)	data.order.add(data.STARTER[result]);
		
			result = getInfos(data.scan,data.DISHES[0]);
			if(data.DISHES.length-1 > result)	data.order.add(data.DISHES[result]);	
			
			result = getInfos(data.scan,data.SIDE_DISH[0]);
			if(data.SIDE_DISH.length-1 > result)	data.order.add(data.SIDE_DISH[result]);	
			
			result = getInfos(data.scan,data.DRINKS[0]);
			if(data.DRINKS.length-1 > result)	data.order.add(data.DRINKS[result]);
			
			result = getInfos(data.scan,data.DESSERTS[0]);
			if(data.DESSERTS.length-1 > result)	data.order.add(data.DESSERTS[result]);	
			
			data.header = "\n ******* Resume de la commande n° " + (i+1) + " ******** \n";
			
			TicketCreate.writeKitchenOrder();// methode pour ecrire l'order dans le fichier
			
			
			System.out.println("Résumé de la commande "+(i+1));
			System.out.println(data.order);		//ici on pourrait stocker la commande en base par exemple
			System.out.println();			//avant de passer à la suivante
			data.order.clear();
		}
		TicketCreate.closeKitchenFile();// methode pour fermer l'ecriture du fichier 
		data.scan.close();
	}
}
