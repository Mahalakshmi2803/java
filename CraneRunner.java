class CraneRunner{
	public static void main(String[] args){
		
		Crane crane=new Crane();
		
		System.out.println("Crane Company:"+crane.company);
		System.out.println("Crane Type:"+crane.type);
		System.out.println("Crane capacityInTons:"+crane.capacityInTons);
		System.out.println("Crane Price:"+crane.price);
		
		crane.company="Hitachi";
		crane.type="Truck crane";
		crane.capacityInTons=100;
		crane.price=1500000;
		
		System.out.println("Crane Company:"+crane.company);
		System.out.println("Crane Type:"+crane.type);
		System.out.println("Crane capacityInTons:"+crane.capacityInTons);
		System.out.println("Crane Price:"+crane.price);
		
		crane.company="Konecranes";
		crane.type="Floating crane";
		crane.capacityInTons=1000;
		crane.price=200000;
		
		System.out.println("Crane Company:"+crane.company);
		System.out.println("Crane Type:"+crane.type);
		System.out.println("Crane capacityInTons:"+crane.capacityInTons);
		System.out.println("Crane Price:"+crane.price);
		
	}
}