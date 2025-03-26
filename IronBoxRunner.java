class IronBoxRunner{
	public static void main(String[] args){
		
		IronBox ironbox=new IronBox();
		
		System.out.println("IronBox Brand:"+ironbox.brand);
		System.out.println("IronBox cost:"+ironbox.cost);
		System.out.println("IronBox watt:"+ironbox.watt);
		System.out.println("IronBox IsElectric:"+ironbox.isElectric);
		
		ironbox.brand="Philips";
		ironbox.cost=1439;
		ironbox.watt=750;
		ironbox.isElectric=true;
		
		System.out.println("IronBox Brand:"+ironbox.brand);
		System.out.println("IronBox cost:"+ironbox.cost);
		System.out.println("IronBox watt:"+ironbox.watt);
		System.out.println("IronBox IsElectric:"+ironbox.isElectric);
		
		ironbox.brand="Hanumeto";
		ironbox.cost=3301;
		ironbox.watt=0;
		ironbox.isElectric=false;
		
		
		System.out.println("IronBox Brand:"+ironbox.brand);
		System.out.println("IronBox cost:"+ironbox.cost);
		System.out.println("IronBox watt:"+ironbox.watt);
		System.out.println("IronBox IsElectric:"+ironbox.isElectric);
		
	}
}