class BulletRunner {
    public static void main(String[] args) {
        
        String caliber1 = "9mm"; 
		String type1 = "Full Metal Jacket"; 
		double weight1 = 7.5; 
		double velocity1 = 350; 
		double price1 = 0.50;
        Bullet.displayInfo(caliber1, type1, weight1, velocity1, price1);
        
        String caliber2 = ".45 ACP"; 
		String type2 = "Hollow Point"; double 
		weight2 = 15.0; double velocity2 = 260; 
		double price2 = 1.25;
        Bullet.displayInfo(caliber2, type2, weight2, velocity2, price2);
        
        String caliber3 = "5.56mm"; 
		String type3 = "Armor Piercing"; 
		double weight3 = 4.0; 
		double velocity3 = 950; 
		double price3 = 1.75;
        Bullet.displayInfo(caliber3, type3, weight3, velocity3, price3);
        
        String caliber4 = ".50 BMG"; 
		String type4 = "Tracer"; 
		double weight4 = 42.0; 
		double velocity4 = 890; 
		double price4 = 5.00;
        Bullet.displayInfo(caliber4, type4, weight4, velocity4, price4);
        
        String caliber5 = "7.62mm"; 
		String type5 = "Soft Point"; 
		double weight5 = 10.5; 
		double velocity5 = 800; 
		double price5 = 2.00;
        Bullet.displayInfo(caliber5, type5, weight5, velocity5, price5);
	}
}