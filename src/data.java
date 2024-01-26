import java.util.ArrayList;
import java.util.Scanner;

public class data 
{
	public static final String [] STARTER = 	{"entrée", "salade","soupe","quiche","aucune"};
	public static final String [] DISHES = 		{"plats" , "poulet" , "boeuf" , "poisson" , "végétarien" , "vegan","aucun"};
	public static final String [] SIDE_DISH = 	{"accompagnements" , "riz" , "pates" , "frites" , "légumes","aucun"};
	public static final String [] DRINKS = 		{"boissons" , "eau plate" , "eau gazeuze" , "soda" , "vin","aucune"};
	public static final String [] DESSERTS = 	{"desserts" , "tarte maison" , "mousse au chocolat" , "tiramisu","aucun"};
	
	public static String header;
	public static int nbMenu;
	public static Scanner scan = new Scanner(System.in);
	static ArrayList<String>  order = new ArrayList<String>();
}
