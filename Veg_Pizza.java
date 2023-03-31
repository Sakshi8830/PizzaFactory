package demopizzafactory;

import java.util.Scanner;

public class Veg_Pizza {
	
	Scanner scanner=new Scanner(System.in);
	Veg_Pizza v;
	Basic_pizza bp=new Basic_pizza();
	Common_menu cp=new Common_menu();
	Pizza_Bill pb=new Pizza_Bill();
	int total=0;
	int size_cost=0;
	
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

	
	public Veg_Pizza() {
		
	}

	public Veg_Pizza(String size, int prize) {
		this.size = size;
		this.prize = prize;
	}
	
	
	public void getVegPizzaDetails() {
		
		Veg_Pizza v=new Veg_Pizza();
		
		
		System.out.println("Enter Your choice(in number):\n1.Deluxe Veggie\n2.Cheese and corn\n3.Paneer Tikka\n4.exit");
        int vegp=scanner.nextInt();
        
       
        switch(vegp) {
        
        	case 1:
        		System.out.println("Enter pizza size(in number):\n1.Regular -- 150 rs.\n2.Medium -- 200 rs.\n3.Large -- 325\n4.exit");
                int sz=scanner.nextInt();
                
                	switch(sz) {
                	
                		case 1:
                			size_cost=150;
                			cp.getCrust();
                			//bp.getVegPizzaToppingDetails();
                			total=size_cost+bp.getVegPizzaToppingDetails();
                			pb.getBill(total);
                			//System.out.println("total:"+total);
                            break;
                            
                		case 2:
                			size_cost=200;
                			cp.getCrust();
                			//bp.getVegPizzaToppingDetails();
                			total=size_cost+bp.getVegPizzaToppingDetails();
                			pb.getBill(total);
                			break;
                			
                		case 3:
                			size_cost=325;
                			cp.getCrust();
                			bp.getVegLargeTop();
                			total=size_cost;
                			pb.getBill(total);
                			break;
                		
                		case 4:
                			System.out.println("Successfully Exit!!!!");
                			break;
                	}
        		break;
        		
        	case 2:
        		System.out.println("Enter pizza size press number:\n1.Regular -- 175 rs.\n2.Medium -- 375 rs.\n3.Large -- 475\n4.exit");
        		int s=scanner.nextInt();
            	switch(s) {
            	
            		case 1:
            			size_cost=175;
            			cp.getCrust();
            			total=size_cost+bp.getVegPizzaToppingDetails();
            			pb.getBill(total);
            			break;
            			
            		case 2:
            			size_cost=375;
            			cp.getCrust();
            			total=size_cost+bp.getVegPizzaToppingDetails();
            			pb.getBill(total);
            			break;
            			
            		case 3:
            			size_cost=475;
            			cp.getCrust();
            			bp.getVegLargeTop();
            			total=size_cost;
            			pb.getBill(total);
            			break;
            			
            		case 4:
            			System.out.println("Successfully Exit!!!!");
            			break;
            	}
        		break;
        	case 3:
        		System.out.println("Enter pizza size(in number):\n1.Regular -- 160 rs.\n2.Medium -- 290 rs.\n3.Large -- 340\n4.exit");
        		int siz=scanner.nextInt();
            	switch(siz) {
            		case 1:
            			size_cost=160;
            			cp.getCrust();
            			total=size_cost+bp.getVegPizzaToppingDetails();
            			pb.getBill(total);
            		case 2:
            			size_cost=290;
            			cp.getCrust();
            			total=size_cost+bp.getVegPizzaToppingDetails();
            			pb.getBill(total);
            			break;
            		case 3:
            			size_cost=340;
            			cp.getCrust();
            			bp.getVegLargeTop();
            			total=size_cost;
            			pb.getBill(total);
            			break;
            			
            		case 4:
            			System.out.println("Successfully Exit!!!!");
            			break;
            	}
        		break;
        		
        		default: break;
        }
       
        
       
	}
	
	
}
