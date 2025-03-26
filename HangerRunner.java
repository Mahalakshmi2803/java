class HangerRunner{
	public static void main(String[] args){
		Hanger hanger=new Hanger();
		
		System.out.println("Hanger Type:"+hanger.type);
		System.out.println("Hanger Material:"+hanger.material);
		System.out.println("Hanger Capacity:"+hanger.capacity);
		System.out.println("Hanger IfFoldable:"+hanger.ifFoldable);
		
		hanger.type="WallHanger";
		hanger.material="wood";
		hanger.capacity=3;
		hanger.ifFoldable=false;
		
		
		System.out.println("Hanger Type:"+hanger.type);
		System.out.println("Hanger Material:"+hanger.material);
		System.out.println("Hanger Capacity:"+hanger.capacity);
		System.out.println("Hanger IfFoldable:"+hanger.ifFoldable);
		
		hanger.type="Closet Hanger";
		hanger.material="Plastic";
		hanger.capacity=4;
		hanger.ifFoldable=true;
		
		
		System.out.println("Hanger Type:"+hanger.type);
		System.out.println("Hanger Material:"+hanger.material);
		System.out.println("Hanger Capacity:"+hanger.capacity);
		System.out.println("Hanger IfFoldable:"+hanger.ifFoldable);
	}
}