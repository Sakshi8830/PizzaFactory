package demopizzafactory;

import java.util.Scanner;

public class Common_menu {
	
	Scanner scanner=new Scanner(System.in);
	int Extracheeseg;
	int sides;
	
	public Common_menu() {
		
	}
	
	

	//For Crust
	public void getCrust() {
		System.out.println("----You have to choose only one type of crust----");
		System.out.println("Enter crust of your choice(in number):\n1.New hand tossed\n2.Wheat thin crust\n3.Cheese Burst\n4.Fresh pan pizza\n3.exit");
	    int num=scanner.nextInt();
		}
	
	//For Extra Cheese
	public int getExtraCheese() {
		
		int extra_cheese=0;
		System.out.println("You want to add extra cheese (35 Rs.) ? \n please type yes or no (don't use numbers)");
        String ec=scanner.next();
        if(ec.equalsIgnoreCase("yes") || ec.equalsIgnoreCase("YES") || ec.equalsIgnoreCase("Yes")) {
        	System.out.println("Extra cheese added Suceesfully");
        	return extra_cheese=35;
        }
        else {
        	if(ec.equalsIgnoreCase("no") || ec.equalsIgnoreCase("NO") || ec.equalsIgnoreCase("No"))
        	System.out.println("No extra cheese added");
        	return extra_cheese=0;
        }
        
	}
	
	//For Sides
	public int getSides() {
		System.out.println("sides: press 1-cold drink 2-mousse cake 3-both");
		int press = scanner.nextInt();
		int cd = 0;
		int mc=0;
		int sum =0;
		if(press == 1)
		{
			System.out.println("enter number of cold drinks");
			int cc = scanner.nextInt();
			System.out.println("Cold Drink added successfully!!!!");
			cd = cc * 55;
			sum = cd;
		}
		else if(press ==2)
		{
			System.out.println("enter number of mousse cake");
			int cc = scanner.nextInt();
			System.out.println("Mousse Cake added successfully!!!!");
			mc = cc * 90;
			sum=mc;
		}
		else
		{
			System.out.println("enter number of cold drinks");
			int cc = scanner.nextInt();
			cd = cc * 55;
			System.out.println("enter number of mousse cake");
			int mm = scanner.nextInt();
			System.out.println("Both added successfully");
			mc = mm * 90;
			sum = cd+mc;
		}
		return sum;
	}
	
}
