//Program OutfitCreator.java
//Purpose: This class is used to create outfits for children
//Developer: Carlos Portillo

import java.util.ArrayList;
import java.util.Scanner;
public class OutfitCreator {
	
	public static void main(String[] args)
	{
		
		ArrayList<String> childrenNames = new ArrayList<String>();
		ArrayList<FactoryOutfit> childrenOutfits = new ArrayList<FactoryOutfit>();
		Scanner scanX = new Scanner(System.in);
		String input = "";
		enterNames(childrenNames, input, scanX);
		enterOutfits(childrenOutfits, childrenNames, input, scanX);
		displayMessage(childrenOutfits, childrenNames);
		
	}
	//creates an outfit object based on user's choice of outfit
	public static void create(String choice, ArrayList<FactoryOutfit> childrenOutfits)
	{
		FactoryOutfit outfit;
		switch(choice)
		{
			case "fairy" :
				outfit = new Fairy();
				childrenOutfits.add(outfit);
				break;
			case "pirate" :
				outfit = new Pirate();
				childrenOutfits.add(outfit);
				break;
			case "nobility" :
				outfit = new Nobility();
				childrenOutfits.add(outfit);
				break;
			case "wizard" :
				outfit = new Wizard();
				childrenOutfits.add(outfit);
				break;
		}
	}
	//allows user to enter names of children
	public static void enterNames(ArrayList<String> childrenNames, String input, Scanner scanX) {
		System.out.println("Please enter 10 children's names");
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter the name for child " + (i + 1));
			input = scanX.nextLine();
			childrenNames.add(input);
		}
	}
	//allows user to enter outfits of the children
	public static void enterOutfits(ArrayList<FactoryOutfit> childrenOutfits, ArrayList<String> childrenNames, String input, Scanner scanX) {
		System.out.println("Please enter the 10 children's outfits, choose between fairy, pirate,"
				+ " nobility, or wizard");
		int i = 0;
		while(i < 10) {
			System.out.println("Please enter outfit for " + childrenNames.get(i));
			input = scanX.nextLine();
			input = input.toLowerCase();
			if(input.equals("fairy") || input.equals("pirate") || input.equals("nobility") || input.equals("wizard")) {
				create(input, childrenOutfits);
			}
			else {
				System.out.println("That is not valid input!");
				continue;
			}
			i++;
		}
	}
	//displays message to the user of what outfit they should get for children
	public static void displayMessage(ArrayList<FactoryOutfit> childrenOutfits, ArrayList<String> childrenNames) {
		for(int i = 0; i < 10; i++) {
			System.out.println(childrenNames.get(i) + "'s outfit is a " 
					+ childrenOutfits.get(i).getOutfitType() + ". Please pick up a "
					+ childrenOutfits.get(i).printWhatToGet() + ". Also" + childrenOutfits.get(i).getAction());
		}
	}

}
