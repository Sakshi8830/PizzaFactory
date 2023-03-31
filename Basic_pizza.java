package demopizzafactory;

import java.util.Scanner;

public class Basic_pizza {
	
	static Scanner scanner=new Scanner(System.in)
	
	
	private String topping;
	private int toppingprize;
	
	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public int getToppingprize() {
		return toppingprize;
	}

	public void setToppingprize(int toppingprize) {
		this.toppingprize = toppingprize;
	}
	
	public Basic_pizza() {
		
	}
	
	public Basic_pizza(String topping, int toppingprize) {
		super();
		this.topping = topping;
		this.toppingprize = toppingprize;
	}

	
	//********Veg Pizza Details**********
	
	public int getVegPizzaToppingDetails() {
		
		Basic_pizza bp1=new Basic_pizza("Black olive",20);
		Basic_pizza bp2=new Basic_pizza("Capsicum",25);
		Basic_pizza bp3=new Basic_pizza("Paneer",35);
		Basic_pizza bp4=new Basic_pizza("Mushroom",30);
		Basic_pizza bp5=new Basic_pizza("Fresh tomato",10);
		
		int x=0;
		
		System.out.println("Enter Your choice(in number):\n1.Black olive (Rs 20)\n2.Capsicum (Rs 25)\n3.Paneer (Rs 35)\n4.Mushroom (Rs 30)\n5.Fresh tomato (Rs 10)\n6.Exit");
        int top1=scanner.nextInt();
        
			if(top1==1) {
				return x=bp1.toppingprize;
				}
			else if(top1==2) {
				return x=bp2.toppingprize;
				}
			else if(top1==3) {
				return x=bp3.toppingprize;
				}
			else if(top1==4) {
				return x=bp4.toppingprize;
				}
			else if(top1==5) {
				return x=bp5.toppingprize;
				}
			else {
				return 0;	
				}	
			
			
		}
	

	 public void getVegLargeTop() {
	 		//Basic_pizza bp=new Basic_pizza();
			System.out.println("How much toppings you want to add in your Large Pizza \n1.1 \n2.2");
			int choice=scanner.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter your choice of topping : ");
					getVegPizzaToppingDetails();
					break;
				case 2:
					System.out.println("Enter your 1st choice of topping : ");
					getVegPizzaToppingDetails();
					System.out.println("Enter your 2nd choice of topping : ");
					getVegPizzaToppingDetails();
					break;
					
			}
	}	
	 
	 
	 
	 //********NON-Veg Pizza Details**********
	 
	 public int getNonVegPizzaToppingDetails() {
		 	
		 	Basic_pizza nbp1=new Basic_pizza("Chicken tikka",35);
			Basic_pizza nbp2=new Basic_pizza("Barbeque chicken",45);
			Basic_pizza nbp3=new Basic_pizza("Grilled chicken",40);
		    int y=0;
			System.out.println("Enter Your choice(in number):\n1.Chicken tikka (Rs 35)\n2.Barbeque chicken (Rs 45)\n3.Grilled chicken (Rs 40)\n4.Exit");
	        int top1=scanner.nextInt();
	        
	       if(top1==1) { 
	    	   return y=nbp1.toppingprize;
	    	   }
	       else			
	       if(top1==2) { return y=nbp2.toppingprize;}
	       else
	       if(top1==3) { return y=nbp3.toppingprize;}
	       else
	        return 0;
		
		
			
	}
	 
	 public void getNon_VegLargeTop() {
	 		Basic_pizza bp=new Basic_pizza();
			System.out.println("How much toppings you want to add in your Large Pizza \n1.1 \n2.2");
			int choice=scanner.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter your choice of topping : ");
					getNonVegPizzaToppingDetails();
					break;
				case 2:
					System.out.println("Enter your 1st choice of topping : ");
					getNonVegPizzaToppingDetails();
					System.out.println("Enter your 2nd choice of topping : ");
					getNonVegPizzaToppingDetails();
					break;
					
			}
	}	
}
