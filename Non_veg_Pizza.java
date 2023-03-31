package demopizzafactory;

import java.util.Scanner;

public class Non_veg_Pizza {

	Scanner scanner=new Scanner(System.in);
	Non_veg_Pizza v;
	Basic_pizza bp=new Basic_pizza();
	Common_menu cp=new Common_menu();
	Pizza_Bill pb=new Pizza_Bill();
	int nonvegtotal=0;
	
	
	private String size;
	private int prize;
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	
	public Non_veg_Pizza() {
		
	}

	public Non_veg_Pizza(String size, int prize) {
		this.size = size;
		this.prize = prize;
	}
	
	
	public void getNonVegDetails() {
		
		Veg_Pizza v=new Veg_Pizza();
		int size_cost=0;
		System.out.println("Enter Your choice(in number):\n1.Non-Veg Supreme\n2.Chicken Tikka\n3.Pepper Barbecue Chicken\n4.exit");
        int vegp=scanner.nextInt();
        
        switch(vegp) {
        	case 1:
        		System.out.println("Enter pizza size(in number):\n1.Regular -- 190 rs.\n2.Medium -- 325 rs.\n3.Large -- 425rs.\n4.exit");
                int sz=scanner.nextInt();
                	switch(sz) {
                		case 1:
                			size_cost=190;
                			cp.getCrust();
                			//bp.getNonVegPizzaToppingDetails();
                			nonvegtotal=size_cost+bp.getNonVegPizzaToppingDetails();
                			pb.getNonVegBill(nonvegtotal);
                            break;
                		case 2:
                			size_cost=325;
                			cp.getCrust();
                			nonvegtotal=size_cost+bp.getNonVegPizzaToppingDetails();
                			pb.getNonVegBill(nonvegtotal);                			break;
                		case 3:
                			size_cost=425;
                			cp.getCrust();
                			bp.getNon_VegLargeTop();
                			nonvegtotal=size_cost;
                			pb.getNonVegBill(nonvegtotal);
                			break;
                	}
        		break;
        	case 2:
        		System.out.println("Enter pizza size press number:\n1.Regular -- 210 rs.\n2.Medium -- 370 rs.\n3.Large -- 500rs.\n4.exit");
        		int s=scanner.nextInt();
            	switch(s) {
            		case 1:
            			size_cost=210;
            			cp.getCrust();
            			nonvegtotal=size_cost+bp.getNonVegPizzaToppingDetails();
            			pb.getNonVegBill(nonvegtotal);
            			break;
            		case 2:
            			size_cost=370;
            			cp.getCrust();
            			nonvegtotal=size_cost+bp.getNonVegPizzaToppingDetails();
            			pb.getNonVegBill(nonvegtotal);
            			break;
            		case 3:
            			size_cost=500;
            			cp.getCrust();
            			bp.getNon_VegLargeTop();
            			nonvegtotal=size_cost;
            			pb.getNonVegBill(nonvegtotal);
            			break;
            	}
        		break;
        	case 3:
        		System.out.println("Enter pizza size(in number):\n1.Regular -- 220 rs.\n2.Medium -- 380 rs.\n3.Large -- 525rs.\n4.exit");
        		int siz=scanner.nextInt();
            	switch(siz) {
            		case 1:
            			size_cost=220;
            			cp.getCrust();
            			nonvegtotal=size_cost+bp.getNonVegPizzaToppingDetails();
            			pb.getNonVegBill(nonvegtotal);
            		case 2:
            			size_cost=380;
            			cp.getCrust();
            			nonvegtotal=size_cost+bp.getNonVegPizzaToppingDetails();
            			pb.getNonVegBill(nonvegtotal);
            			break;
            		case 3:
            			size_cost=525;
            			cp.getCrust();
            			bp.getNon_VegLargeTop();
            			nonvegtotal=size_cost;
            			pb.getNonVegBill(nonvegtotal);
            			break;
            	}
        		break;
        }
      
        
	}
	
	
	
	
}
