package com.baristaMatic.util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.baristaMatic.store.Inventory;


public class Main {
	public static void main(String args[])
	{
		/*System.out.println("    BaristaMatic    ");
		System.out.println("Startup...");*/
		Menu menu = new Menu();
		Inventory.getInventoryInstance().displayInventory();
		menu.displayMenu();
		// TODO : Put in loop. 
		String input = "";
		while(true)
		{
			/*System.out.println("Enter values");*/
			input = readConsoleLine();
			if(input.equals(""))
				continue;
			if(validateConsole(input))
			{
				if(input.equalsIgnoreCase("R"))
					Inventory.getInventoryInstance().initializeInventory(10);
				else if(input.equalsIgnoreCase("Q"))
					System.exit(0);
				else
					menu.getDrink(getIntegerValue(input));
				Inventory.getInventoryInstance().displayInventory();
				menu.displayMenu();
			}
			else
				System.out.println("Invalid selection: " + input);
		}
	}

	private static boolean validateConsole(String input) {
		if(input.equalsIgnoreCase("R") || input.equalsIgnoreCase("Q"))
			return true;
		else if(getIntegerValue(input) <= Menu.StoreDrinks.size())
			return true;
		return false;
	}

	private static int getIntegerValue(String input) {
		try
		{
			int value = Integer.parseInt(input);
			return value;
		}catch(NumberFormatException e)
		{
			return 9999;
		}
	}

	static String readConsoleLine()
	{
		String str = null;
		try{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			str = bufferRead.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return str;

	}

}
