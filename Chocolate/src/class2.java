
public class class2 {

	public static void main(String[] args) {
		
		
		double MinWeight=1000;
		double MaxPrice=1;
		// TODO Auto-generated method stub

		class1 FiveStar=new class1("doubleLayer","FiveStar", 20.00, 10.00);
		class1 KitKat=new class1("Dark","KitKAt", 25.00, 50.00);
		class1 Perk=new class1("Extra glucose","Perk", 10.00, 25.00);
		class1 Cadburry=new class1("silk","Silk", 100.00, 118.00);
		class1 Barone=new class1("YummyTaste","Nestele", 10.00, 18.00);
		class1 milkyBar=new class1("ExtraMilk","MilkyBar", 20.00, 25.00);
		class1 Temptation=new class1("darkChocolate","Carbury", 110.00, 100.00);
		
		//class1 FiveStar=new class1("doubleLayer","FiveStar", 20.00, 10.00);
		//class1 FiveStar=new class1("doubleLayer","FiveStar", 20.00, 10.00);
		//class1 FiveStar=new class1("doubleLayer","FiveStar", 20.00, 10.00);
		
		//System.out.println(FiveStar);
		
		class1 NewChoco[]=new class1[7];
		NewChoco[0]=FiveStar;
		NewChoco[1]=KitKat;
		NewChoco[2]=Perk;
		NewChoco[3]=Cadburry;
		NewChoco[4]=Barone;
		NewChoco[5]=milkyBar;
		NewChoco[6]=Temptation;
		
		for(int i=0; i<NewChoco.length;i++ ) {
			System.out.println(NewChoco[i]);
		}
		
		for(int i=0; i<NewChoco.length;i++ ) {
			if(MinWeight > NewChoco[i].getWeight()) {
				MinWeight = NewChoco[i].getWeight();
			}
			
			
		}
		System.out.println("minimum weight of a chocolate is : " +MinWeight);
		
		for(int i=0; i<NewChoco.length; i++) {
			
			if(MaxPrice< NewChoco[i].getCost()) {
				
				MaxPrice = NewChoco[i].getCost();
				
			}
			
		}
		
		System.out.println("maximum price of chocolate is : " +MaxPrice);
	}
		
		
	}
	

