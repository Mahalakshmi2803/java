class BombRunner {
    public static void main(String[] args) {
        
        String type1 = "Hand Grenade"; 
		String material1 = "TNT"; 
		double weight1 = 0.4; 
		double radius1 = 5; 
		double price1 = 200;
        Bomb.displayInfo(type1, material1, weight1, radius1, price1);
        
        String type2 = "C4 Explosive"; 
		String material2 = "RDX"; 
		double weight2 = 1.25; 
		double radius2 = 10; 
		double price2 = 500;
        Bomb.displayInfo(type2, material2, weight2, radius2, price2);
        
        String type3 = "Airstrike Bomb"; 
		String material3 = "Trinitrotoluene"; 
		double weight3 = 500; 
		double radius3 = 200; 
		double price3 = 250000;
        Bomb.displayInfo(type3, material3, weight3, radius3, price3);
        
        String type4 = "Nuclear Bomb"; 
		String material4 = "Uranium-235"; 
		double weight4 = 4500; 
		double radius4 = 50000; 
		double price4 = 1000000000;
        Bomb.displayInfo(type4, material4, weight4, radius4, price4);
        
        String type5 = "Smoke Bomb"; 
		String material5 = "Potassium Nitrate"; 
		double weight5 = 0.3; 
		double radius5 = 3; 
		double price5 = 50;
        Bomb.displayInfo(type5, material5, weight5, radius5, price5);
	}
}