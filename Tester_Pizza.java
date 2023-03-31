package demopizzafactory;

import java.util.Scanner;

public class Tester_Pizza {
	
	public static void printWelcomeMessage() {
        System.out.println("-----------------------------------------------");
        System.out.println("******* Welcome to the Pizza Factory ********");
        System.out.println("-----------------------------------------------");
    }
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Veg_Pizza vp=new Veg_Pizza();
	        Basic_pizza bp=new Basic_pizza();
	        Non_veg_Pizza nvp=new Non_veg_Pizza();
	        
	        printWelcomeMessage();
	        
	        System.out.println("Enter the total pizzas you would like to order: ");
	        int totalPizzas = scanner.nextInt();
	        int flag=1;
	        
	        while(flag==1) {
	        System.out.println("\nEnter Your choice(in number):\n1.Vegetarian Pizza\n2.Non-Vegetarian Pizza\n3.Exit");
	        int choice=scanner.nextInt();
	        
	        switch(choice) {
	        
	        	case 1:
	        		vp.getVegPizzaDetails();
	        		break;
	        		
	        	case 2:
	        		nvp.getNonVegDetails();
	        		break;
	        		
	        	default: flag=0;
	        }
	       }
	 }
	
}
//
