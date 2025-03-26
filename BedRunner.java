class BedRunner{
	public static void main(String[] args){
		
		Bed bed=new Bed();
		
		System.out.println("Bed Size:"+bed.size);
		System.out.println("Bed Brand:"+bed.brand);
		System.out.println("Bed Price:"+bed.price);
		System.out.println("Bed Height:"+bed.height);
		
		bed.size="Queen";
		bed.brand="peps";
		bed.price=18990;
		bed.height=24.7f;
		
		System.out.println("Bed Size:"+bed.size);
		System.out.println("Bed Brand:"+bed.brand);
		System.out.println("Bed Price:"+bed.price);
		System.out.println("Bed Height:"+bed.height);
		
		bed.size="Single";
		bed.brand="SpringFit";
		bed.price=7159;
		bed.height=12.3f;
		
		System.out.println("Bed Size:"+bed.size);
		System.out.println("Bed Brand:"+bed.brand);
		System.out.println("Bed Price:"+bed.price);
		System.out.println("Bed Height:"+bed.height);
		
		
		
	}
}