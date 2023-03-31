package demopizzafactory;

public class Pizza_Bill {
	
	public void getBill(int total) {

		Common_menu cp=new Common_menu();
		
        System.out.println("\n********** Your Invoice ***********\n\n\tPay amount::"+ (total+cp.getExtraCheese()+cp.getSides()) +"/-\n\n");
        
	}
	
	public void getNonVegBill(int nonvegtotal) {

		Common_menu cp=new Common_menu();
		
        System.out.println("\n********** Your Invoice ***********\n\n\tPay amount::"+(nonvegtotal+cp.getExtraCheese()+cp.getSides())+"/-\n\n");
        
	}
	

	
}
