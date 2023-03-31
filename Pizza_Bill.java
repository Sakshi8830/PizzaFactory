package demopizzafactory;

public class Pizza_Bill {
	
	public void getBill(int total) {
//		Veg_Pizza vp=new Veg_Pizza();
//		Basic_pizza bp=new Basic_pizza();
		Common_menu cp=new Common_menu();
		
		
		System.out.println("Qty::"+ (total+cp.getExtraCheese()+cp.getSides()));
	}
	
}
