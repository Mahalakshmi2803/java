class Shirt1Runner{
	public static void main(String[] args){
		
		Shirt1 shirt=new Shirt1();
		
		System.out.println("Shirt Brand:"+shirt.brand);
		System.out.println("Shirt color"+shirt.color);
		System.out.println("Shirt Size:"+shirt.size);
		System.out.println("Shirt IsPrinted:"+shirt.isPrinted);
		
		shirt.brand="H&M";
		shirt.color="Black";
		shirt.size=30;
		shirt.isPrinted=true;
		
		System.out.println("Shirt Brand:"+shirt.brand);
		System.out.println("Shirt color"+shirt.color);
		System.out.println("Shirt Size:"+shirt.size);
		System.out.println("Shirt IsPrinted:"+shirt.isPrinted);
		
		shirt.brand="Snitch";
		shirt.color="Grey";
		shirt.size=36;
		shirt.isPrinted=false;
		
		System.out.println("Shirt Brand:"+shirt.brand);
		System.out.println("Shirt color"+shirt.color);
		System.out.println("Shirt Size:"+shirt.size);
		System.out.println("Shirt IsPrinted:"+shirt.isPrinted);
	}
}